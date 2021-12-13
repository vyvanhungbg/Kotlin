class User {
    var name:String = "";
    var email:String = "";
    var array:IntArray? = null;
    constructor()

    constructor(name: String, email: String, array: IntArray?) {
        this.name = name
        this.email = email
        this.array = array
    }

    override fun toString(): String {
        return "User(name='$name', email='$email', array=${array?.contentToString()})"
    }


}