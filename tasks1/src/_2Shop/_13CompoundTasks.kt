package _2Shop

// Return the set of customers who ordered the specified product
fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    return customers.filter{ customer ->
        product in customer.orderedProducts
    }.toSet()
}

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.filter{it.isDelivered}.flatMap { it.products } .maxBy { it.price }
}

// Return the number of times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {

    return customers.flatMap(Customer::orders).flatMap(Order::products).count { it == product }

//    return customers.fold(0, {total, customer ->
//        val orderedP = customer.orders.flatMap { it.products }.filter { it == product }
//        total + orderedP.size
//    })
}
