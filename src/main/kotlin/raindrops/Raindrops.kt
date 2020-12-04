object Raindrops {

    fun convert(n: Int) =
        (1..n).filter { n % it == 0 }
            .joinToString("") {
                when (it) {
                    3 -> "Pling"
                    5 -> "Plang"
                    7 -> "Plong"
                    else -> ""
                }
            }.ifBlank { n.toString() }
}
