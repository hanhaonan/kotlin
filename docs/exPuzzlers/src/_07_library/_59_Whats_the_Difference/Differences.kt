namespace whats.the.difference

import kotlin.io.*
import kotlin.*
import java.util.*

fun iarray(vararg a : Int) = a // BUG

fun main(args : Array<String>) {
    // Problematic code does not compile
//    val vals = iarray(789, 678, 567, 456, 345, 234, 123, 012)
    val vals = iarray(789, 678, 567, 456, 345, 234, 123, 12)
    val diffs = HashSet<Int>
    for (i in vals.indices)
        for (j in i..vals.lastIndex())
             diffs.add(vals[i] - vals[j])
    println(diffs.size())
}

fun IntArray.lastIndex() = size - 1