package Bai2

import java.util.*

class PhanSo (){
    var a:Int = 0
    var b:Int = 1
    constructor(a:Int, b:Int):this(){
        this.a = a
        this.b = b
    }
    fun nhap(){
        var sc = Scanner(System.`in`)
        a = sc.nextInt();
        b = sc.nextInt();
    }
    fun xuat() = println("Phân số : $a / $b")

    fun rut(){
        fun UCLN(a:Int, b:Int):Int{
            if(a % b ==0 ) return b;
            if(b == 0 ) return a;
            return UCLN(b,a%b)
        }
        var ucln = UCLN(a, b)
        a /= ucln
        b /= ucln

    }
}