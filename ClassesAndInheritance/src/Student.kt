// Muốn kế thừa class khác thì class cơ sở phải có từ khóa open

class Student( name:String,var age: Int):Person(name), Action {



    fun view() = println("${name} - ${age}")
    override fun fly() {
        TODO("Not yet implemented")
        
    }

    // Override fun eat of class Person
    override fun eat() {
        super<Person>.eat()
        println("Student eat")
    }

    override fun go() {
        println("Student go")
        super<Action>.go()
        super<Person>.go()
    }


}

/*class  Student{
    var name :String
    var age:Int

    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }

    constructor(name:String){
        this.name = name
        this.age = 0;
    }
}*/
