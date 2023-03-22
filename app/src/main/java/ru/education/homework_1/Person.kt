package ru.education.homework_1

data class Person(
    val name: String,
    val surname: String,
    val age: Int
)

fun List<Person>.sortByAge():
        List<Person> {
    val list = sortedWith(compareBy { it.age }).reversed()
    return list
}

fun List<Person>.sortByName():
        List<Person> {
    return sortedWith(compareBy ({ it.name }, { it.surname }))
}