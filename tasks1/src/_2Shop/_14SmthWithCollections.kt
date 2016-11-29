package _2Shop

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { s -> TODO() }

    return groupsByLength.values.maxBy { group -> TODO() }
}

