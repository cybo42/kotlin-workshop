package _2Shop

import _2Shop.data.*
import org.junit.Assert.*
import org.junit.Test

class _3AllAnyAndOtherPredicates {
    @Test fun testCustomerIsFromCity() {
        assertTrue(customers[lucas]!!.isFrom(Canberra))
        assertFalse(customers[lucas]!!.isFrom(Budapest))
    }

    @Test fun testAllCustomersAreFromCity() {
        assertFalse(shop.checkAllCustomersAreFrom(Canberra))
    }

    @Test fun testAnyCustomerIsFromCity() {
        assertTrue(shop.hasCustomerFrom(Canberra))
    }

    @Test fun testCountCustomersFromCity() {
        assertEquals(2, shop.countCustomersFrom(Canberra))
    }

    @Test fun testAnyCustomerFromCity() {
        assertEquals(customers[lucas], shop.findAnyCustomerFrom(Canberra))
        assertEquals(null, shop.findAnyCustomerFrom(City("Chicago")))
    }
}
