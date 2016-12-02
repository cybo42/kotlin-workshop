package _4CreatingDsl

class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null
}

class BreakfastMenu {
    val items = mutableListOf<BreakfastMenuItem>()
}

fun BreakfastMenu.item(init: BreakfastMenuItem.() -> Unit) {
    TODO("Create new menu item, initialize it and add it to the 'items' list")
}

fun breakfastMenu(init: BreakfastMenu.() -> Unit): BreakfastMenu {
    TODO("Create new BreakfastMenu and initialize it. All the items are added by 'init'.")
    // bonus: use the 'apply' function
}

fun createCustomMenu() = breakfastMenu {
    item {
        name = "Belgian Waffles"
        price = 5.95
        calories = 650
    }
    item {
        name = "Strawberry Belgian Waffles"
        price = 7.95
        calories = 900
    }
    item {
        name = "Berry-Berry Belgian Waffles"
        price = 8.95
        calories = 900
    }
    item {
        name = "French Toast"
        price = 4.50
        calories = 600
    }
    item {
        name = "Homestyle Breakfast"
        price = 6.95
        calories = 950
    }
}