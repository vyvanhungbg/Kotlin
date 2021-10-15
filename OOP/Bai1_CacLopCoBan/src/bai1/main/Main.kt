package bai1.main

fun main() {
    println("Nhập bán kính :")
    var banKinh = readLine()?.toDoubleOrNull()
    banKinh?.let {
        var hinhTron = HinhTron(banKinh)
        println("Chu vi : ${hinhTron.ChuVi()}")
        println("Diện tích : ${hinhTron.DienTich()}")
    }

}