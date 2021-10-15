package Bai2

fun main() {
    var P = PhanSo()
    with(P){P.xuat(); P.rut(); P.xuat()}
    var Q = PhanSo();
    with(Q){Q.nhap(); Q.rut(); Q.xuat()}
}