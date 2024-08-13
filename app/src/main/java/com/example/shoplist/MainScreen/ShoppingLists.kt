package com.example.shoplist.MainScreen

data class ShoppingLists(
    var id: Int,
    var name: String,
    var items: List<ListItem>
)

// Para fins de testes
fun testShoppingLists(): List<ShoppingLists> {
    val lists = testLists()

    return listOf(
        ShoppingLists(1, "Lista de compras Matheus", lists[0]),
        ShoppingLists(2, "Lista de compras para o fim de semana para a casa", lists[1]),
        ShoppingLists(3, "Lista de frutas e vegetais", lists[2]),
        ShoppingLists(4, "Lista de limpeza", lists[3]),
        ShoppingLists(5, "Lista de carnes", lists[4]),
        ShoppingLists(6, "Lista de cuidados pessoais", lists[5])
    )
}