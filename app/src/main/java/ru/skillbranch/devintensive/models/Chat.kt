package ru.skillbranch.devintensive.models

class Chat (
    var id: String,
    val members: MutableList<User> = mutableListOf(),
    val messages: MutableList<BaseMessage> = mutableListOf()

    )