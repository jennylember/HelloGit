data class Cat(val weight: Double, private val age: Int): Comparable<Cat> {

    override fun compareTo(other: Cat): Int {
        if (this.age > other.age) {
            return 1
        }
        return if (this.age == other.age) {
            0
        } else {
            -1
        }
    }

//    override fun equals(other: Any?): Boolean {
//        if (other == null) {
//            return false
//        }
//        return if (other is Cat) {
//            this.age == other.age || this.weight == other.weight
//        } else {
//            false
//        }
//    }
//
//    override fun hashCode(): Int {
//        return (this.age * this.weight).toInt()
//    }
//
//    override fun toString(): String {
//        return "weight = $weight, age = $age"
//    }
//

}