class GettersAndSetters {
    var name:String = "default-name"

    get() = "name is $field"

    set(value) {
       field = "set $field"
    }

    fun view(){
        println("Thông tin $name")
    }
}