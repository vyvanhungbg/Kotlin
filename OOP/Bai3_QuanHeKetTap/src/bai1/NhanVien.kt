package bai1

class NhanVien (){
    private var id:String = ""
    private var name:String = ""
    private var age:Int = 0
    constructor(id:String, name:String, age:Int): this(){
        this.id = id
        this.name = name
        this.age  = age
    }
   companion object {
        var slary:Double = 125000.0
   }
    fun xuat() = System.out.printf("%n%-10s %-10s %-10d %-10.3f",id,name,age, slary)
}