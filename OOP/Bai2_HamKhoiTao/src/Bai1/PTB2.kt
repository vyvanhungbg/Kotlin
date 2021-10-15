package Bai1

class PTB2(var a:Int, var b:Int, var c:Int) {
    fun nhap(){
        a = readLine()!!.trim().toInt()
        b = readLine()!!.trim().toInt()
        c = readLine()!!.trim().toInt()

    }

    constructor():this(1,0,0){}

    fun xuat() = println("${a}x${(178).toChar()} + ${b}x + $c = 0")
    fun giai(){
        var delta = b*b - 4*a*c
        if(delta <0 )
            println("Phuonwg trình vô nghiệm !")
        else if(delta == 0){
            println("Phương trình có nghiệm kép x1 = x2 = ${(-b+Math.sqrt(delta.toDouble()))/(2*a)}")
        }else{
            println("x1 = ${(-b+Math.sqrt(delta.toDouble()))/(2*a)}")
            println("x2 = ${(-b-Math.sqrt(delta.toDouble()))/(2*a)}")
        }
    }
}