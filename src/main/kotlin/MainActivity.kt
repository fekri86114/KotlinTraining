fun main() {

    val arrayList = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // not fixed
//    val testList = arrayListOf<Int>(11, 12, 13, 14, 15, 16, 17, 18, 19, 20) // we created this list for arrayList.addAll( 'you can add testList here' )
//    arrayList.add(11)
//    arrayList.add(12)
//    arrayList.addAll( testList ) // it (addAll) helps to add other lists to your list

//    arrayList.clear() // you can clear the list with this method
    arrayList.remove(5) // you can clear an item with this method


    arrayList.forEach{
        println(it)
    }

}