package ru.education.homework_1

import kotlin.system.measureTimeMillis

fun main() {
    //  Задание 1
    val number = (0..99).toList()
        .filter { (it % 2) == 0 }
        .slice(10..20)
        .map { it + 1 }
        .sum()

    println("sum = $number")

    // Задание 2
    val planetExpress = listOf<Person>()
        .plus(Person("Philip", "Fry", 25))
        .plus(Person("Turanga", "Leela", 24))
        .plus(Person("Bender", "Rodriquez", 5))
        .plus(Person("John", "Zoidberg", 88))

    val sortedByAge = planetExpress.sortByAge()
    println(sortedByAge)

    val sortedByName = planetExpress.sortByName()
    println(sortedByName)

    // Задание 3
    fun measureSortAlgo(container: List<Int>, sort: (List<Int>) -> Unit) : Long {
        return measureTimeMillis { sort(container) }
    }

    val list = (0..10000).toList()
        .shuffled()
    val result = measureSortAlgo(list) { l: List<Int> -> l.sorted() }

    println("Время работы алгоритма: $result ms")
}