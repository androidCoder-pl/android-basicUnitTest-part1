package pl.androidcoder.unittest.utils

fun <T> removeDuplicates(list: List<T>): List<T> {
    val noDuplicates = mutableListOf<T>()
    list.forEach {
        if (!noDuplicates.contains(it)) {
            noDuplicates.add(it)
        }
    }
    return noDuplicates
}