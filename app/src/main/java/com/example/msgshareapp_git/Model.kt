package com.example.msgshareapp_git

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf<Hobby>(
        Hobby("Swimming"),
        Hobby("Basket"),
        Hobby("fotball"),
        Hobby("Tennis"),
        Hobby("Hocky"),
        Hobby("Kabaddi")

    )
}