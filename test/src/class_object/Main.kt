package class_object

fun main() {
    var nguoi = Nguoi("Vy Văn Hùng", "28/08/2001", 20)
    var me = Nguoi("Vy Văn Hùng", "28/08/2001", 20,"Hong")
    nguoi.infor()
    me.infor()

    var congNhan = CongNhan("Hùng", "28/08/2001", 20, 999.0)
    congNhan.infor()
}