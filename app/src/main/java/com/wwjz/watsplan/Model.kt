package com.wwjz.watsplan


class Model {
    var facultyName = ""
    var majorName = ""
    var fileName = ""
    var storedCards: MutableList<Card> = mutableListOf<Card>()
    var cards: MutableList<Card> = mutableListOf<Card>()

    companion object {
        val mInstance = Model()
    }

}