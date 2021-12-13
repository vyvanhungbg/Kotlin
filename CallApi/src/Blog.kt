 class Blog {
     var title:String = "";
     var body:String = "";
     var creator:User = User();

     constructor(title: String, body: String, creator: User) {
         this.title = title
         this.body = body
         this.creator = creator
     }

     constructor()

     override fun toString(): String {
         return "Blog(title='$title', body='$body', creator=$creator)"
     };


 }
