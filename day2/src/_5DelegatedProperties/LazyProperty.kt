package _5DelegatedProperties

class LazyProperty(initializer: () -> Int) {
    val lazy: Int by lazy(initializer)
}

fun main(args: Array<String>) {
    println("--- creation ---")
    val property = LazyProperty {
        println("initialization")
        42
    }

    println("--- first access ---")
    property.lazy

    println("--- second access ---")
    property.lazy
}