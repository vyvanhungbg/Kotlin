import java.nio.channels.AsynchronousByteChannel

class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val person:Person = Person("hung")
            print(person.name)

            val student:Student = Student("Hung", 21)
            student.view()
            student.eat()
            student.go()

            // Companion objects
            println(CompanionObjects.AB.NAME)

            // Getter or Setters
            val tmp:GettersAndSetters = GettersAndSetters()
            tmp.name = "Abc"
            tmp.view()
        }
    }
}