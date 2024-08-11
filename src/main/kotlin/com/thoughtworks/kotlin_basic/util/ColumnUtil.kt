package com.thoughtworks.kotlin_basic.util;

class ColumnUtil {

    fun calculateSequenceLabels(start: Int, count: Int): Array<String> {
        val end = start + count - 1
        if (end > 18278) { // 18278 corresponds to "ZZZ"
            throw IllegalArgumentException("The sequence label cannot exceed ZZZ")
        }

        val array = Array(count) { "" }
        for (index in 0..<count) {
            var num = start + index
            val label = StringBuilder()

            while (num > 0) {
                num--
                label.append(('A' + (num % 26)))
                num /= 26
            }
            array[index] = label.reverse().toString()
        }

        return array;
    }

}
