package TamGiac

class TamGiac {
     var canhA:Double = 0.0
        get() {return field}
        set(value) {canhA = field}
     var canhB:Double = 0.0
        get() {return field}
        set(value) {canhB = field}
     var canhC:Double = 0.0
        get() {return field}
        set(value) {canhC = field}


    public fun chuVi() = canhA + canhB + canhC
}