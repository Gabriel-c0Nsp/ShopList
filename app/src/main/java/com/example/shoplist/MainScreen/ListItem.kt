package com.example.shoplist.MainScreen

data class ListItem(
    var id: Int,
    var name: String,
    var quantity: Int,
)

// Para fins de testes
fun testLists(): List<List<ListItem>> {
    val list1 = listOf(
        ListItem(1, "Arroz", 1),
        ListItem(2, "Feijão", 2),
        ListItem(3, "Azeite", 1),
        ListItem(4, "Sal", 1),
        ListItem(5, "Café", 3),
        ListItem(6, "Açúcar", 2),
        ListItem(7, "Farinha de trigo", 1),
        ListItem(8, "Leite", 6)
    )

    val list2 = listOf(
        ListItem(1, "Macarrão", 4),
        ListItem(2, "Molho de tomate", 2),
        ListItem(3, "Queijo ralado", 1),
        ListItem(4, "Carne moída", 2),
        ListItem(5, "Pão de forma", 1),
        ListItem(6, "Manteiga", 1),
        ListItem(7, "Presunto", 1),
        ListItem(8, "Mussarela", 1)
    )

    val list3 = listOf(
        ListItem(1, "Bananas", 6),
        ListItem(2, "Maçãs", 4),
        ListItem(3, "Laranjas", 8),
        ListItem(4, "Tomates", 5),
        ListItem(5, "Cebolas", 3),
        ListItem(6, "Batatas", 7)
    )

    val list4 = listOf(
        ListItem(1, "Sabão em pó", 2),
        ListItem(2, "Amaciante", 1),
        ListItem(3, "Água sanitária", 2),
        ListItem(4, "Esponjas", 4),
        ListItem(5, "Detergente", 3),
        ListItem(6, "Desinfetante", 2),
        ListItem(7, "Lustra móveis", 1)
    )

    val list5 = listOf(
        ListItem(1, "Frango", 2),
        ListItem(2, "Peito de peru", 1),
        ListItem(3, "Carne bovina", 3),
        ListItem(4, "Linguiça", 2),
        ListItem(5, "Salsicha", 4),
        ListItem(6, "Bacon", 1)
    )

    val list6 = listOf(
        ListItem(1, "Shampoo", 2),
        ListItem(2, "Condicionador", 1),
        ListItem(3, "Creme dental", 3),
        ListItem(4, "Sabonete líquido", 2),
        ListItem(5, "Fio dental", 1),
        ListItem(6, "Escova de dentes", 4)
    )

    return listOf(
        list1,
        list2,
        list3,
        list4,
        list5,
        list6
    )
}