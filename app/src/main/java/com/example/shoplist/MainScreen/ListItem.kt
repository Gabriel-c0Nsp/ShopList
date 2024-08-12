package com.example.shoplist.MainScreen

data class ListItem(
    var id: Int,
    var name: String,
    var quantity: Int,
)

fun TestList(): List<ListItem> {
    return listOf(
        ListItem(1, "Requeijão", 2),
        ListItem(2, "Manteiga", 1),
        ListItem(3, "Fermento", 1),
        ListItem(4, "Detergente", 3),
        ListItem(5, "Queijo", 1),
        ListItem(6, "Desodorante", 1),
        ListItem(7, "Papel higiênico", 1),
        ListItem(8, "Sabonete", 6),
    )
}
