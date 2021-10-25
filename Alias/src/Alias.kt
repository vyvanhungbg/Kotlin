fun main() {
    var phanSoA = PhanSo(4,7)
    var phanSoB = PhanSo(1,4)

    phanSoA.xuat()
    phanSoB.xuat()
    // Hai vùng nhớ khác nhau
    phanSoA = phanSoB
    // Vùng nhớ phân số A sẽ được trỏ sang vùng nhớ B do vậy mà phân số A sẽ có giá trị của phân số B
    //-> Nếu A thay đổi vùng nhớ thì B sẽ bị thay đổi,  Lúc này vùng nhớ A sẽ không còn tham chiếu nào tới do do vậy vùng nhớ A sẽ bị thu hồi theo cơ chế tự dộng gom rác
    phanSoA.tu = 100

    phanSoA.xuat()
    phanSoB.xuat()

    // Nếu muốn sao chép mà  không cùng trỏ tới một ô nhớ làm ảnh hưởng tới giá trị thì sử dụng phương thức clone
    phanSoA = phanSoB.copy()
    phanSoA.tu = 99

    phanSoA.xuat()
    phanSoB.xuat()
}