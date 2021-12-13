import java.nio.file.Paths

class PathOfApi {
    companion object{
        var path:String = "https://sample-fastapi.herokuapp.com/"
        var pathBlog:String = path + "blog/"
        var pathUser:String = path + "user/"
        var pathLogin:String = path + "login/"
        var pathToken:String = Paths.get(".").toAbsolutePath().normalize().toString()+"/data.txt";
    }
}