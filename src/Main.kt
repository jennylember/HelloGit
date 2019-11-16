

fun main() {
    println("Hello Git!")
    println("Sum: ${add(10, 50)}.")
    println("Mul: ${mul(10, 3)}.")
    println("Yo!")
    println("Yoee!")
    println("GitHub!!!")

    val cat1 = Cat(3.5, 4)
    val cat2 = Cat(10.3, 2)

    println("Older cat is: ${cat1.compareTo(cat2)}")
    println("Cat1 > cat2: ${cat1 > cat2}")

    val cat3 = Cat(7.0, 3)
    val cat4 = Cat(5.4, 12)
    val cat5 = Cat(3.5, 4)
    val cat6 = Cat(1.5, 0)

    val catSet = TreeSet<Cat>()
    catSet.add(cat1)
    catSet.add(cat2)
    catSet.add(cat3)
    catSet.add(cat4)
    catSet.add(cat5)
    catSet.add(cat6)

    println(catSet)

    val catNotComparable1 = CatNotComparable(3.5, 4)
    val catNotComparable2 = CatNotComparable(10.3, 2)
    val catNotComparable3 = CatNotComparable(7.0, 3)
    val catNotComparable4 = CatNotComparable(5.4, 12)
    val catNotComparable5 = CatNotComparable(4.5, 6)
    val catNotComparable6 = CatNotComparable(1.5, 0)

    val catNotComparableSet =
        TreeSet<CatNotComparable>(kotlin.Comparator { t, t2 -> if (t.age > t2.age) 1 else if (t.age == t2.age) 0 else -1 })
    catNotComparableSet.add(catNotComparable1)
    catNotComparableSet.add(catNotComparable2)
    catNotComparableSet.add(catNotComparable3)
    catNotComparableSet.add(catNotComparable4)
    catNotComparableSet.add(catNotComparable5)
    catNotComparableSet.add(catNotComparable6)

    println(catNotComparableSet)

    val myMap = HashMap<Cat, String>()
    myMap[cat1] = "Jack"
    val catName = myMap[Cat(3.5, 4)]

    println(catName)

    println("cat1 = cat5 is ${cat1 == cat5}")

    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
    println("Trap")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun mul(a: Int, b: Int): Int {
    return a * b
}

fun test() {
    println(Controller().test())
}