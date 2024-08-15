package com.example.shoplist.MainScreen

import java.util.Date

data class ShoppingLists(
    var id: Int,
    var name: String,
    var items: List<ListItem>,
    var createdAt: Date
)

// Para fins de testes
fun testShoppingLists(): List<ShoppingLists> {
    val lists = testLists()

    return listOf(
        ShoppingLists(1, "Lista de compras Matheus", lists[0], Date()),
        ShoppingLists(2, "Lista de compras para o fim de semana para a casa", lists[1], Date()),
        ShoppingLists(3, "Frutas e vegetais", lists[2], Date()),
        ShoppingLists(4, "Produtos de limpeza", lists[3], Date()),
        ShoppingLists(5, "Lista de carnes", lists[4], Date()),
        ShoppingLists(6, "Lista de miojos e cup nuddles", lists[5], Date())
    )
}