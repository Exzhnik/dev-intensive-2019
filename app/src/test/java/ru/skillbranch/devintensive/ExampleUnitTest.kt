package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun  test_factory(){
       val user = User.makeUser("John Cena")
       val user2 =  User.makeUser("John Rich")
       val user3 =  User.makeUser("John Honor")

    }

    @Test
    fun test_abstract_factory(){
        val user = User.makeUser("Анатолий Продуманый")
        val txtMessage = BaseMessage.makeMessage(user, Chat("0"), payload = "any text message", type = "text" )
        val imgMessage = BaseMessage.makeMessage(user, Chat("0"), payload = "any image url", type = "image" )

        when(txtMessage){
            is TextMessage -> println("this is text message")
            is ImageMessage -> println("this is image url")
        }
    }
}
