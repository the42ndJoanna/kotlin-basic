package com.thoughtworks.kotlin_basic.util;

class ColumnUtil {

    fun calculateSequenceLabels(start: Int, count: Int): Array<String> {
        val end = start + count - 1
        if (end > 18278) { // 18278 corresponds to "ZZZ"
            throw IllegalArgumentException("The sequence label cannot exceed ZZZ")
        }

        return Array(count) { i -> getLabelByNumber(start + i);}
    }

    private fun getLabelByNumber(startIndex: Int): String {
        val label = StringBuilder()
        var num = startIndex
        while (num > 0) {
            num--
            label.append(('A' + (num % 26)))
            num /= 26
        }
        return label.reverse().toString()
    }
}
