package oop_00000130562_MuhammadFaathinNaufal.week08

class NotoficationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} does not have an email")

        }
    }

}