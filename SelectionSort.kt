class SelectionSort {

    data class Result(val smallestItem: Int, val smallestIndex: Int)

    private fun getSmallestInList (inputList: MutableList<Int>): Result {

        var smallestItem = inputList[0]
        var smallestIndex = 0

        for((index, element) in inputList.withIndex()) {
            if (element < smallestItem) {
                smallestItem = element
                smallestIndex = index
            }
        }

        return Result(smallestItem, smallestIndex)

    }

    fun doSelectionSort () {

        println("Please, enter some integer numbers using spacebar")
        val inputList = readLine()!!.split(' ').map(String::toInt)

        val listToSort = inputList.toMutableList()
        val listSorted = mutableListOf<Int>()

        for(item in inputList) {
            val (smallestItem, smallestIndex) = getSmallestInList(listToSort)
            listSorted.add(smallestItem)
            listToSort.removeAt(smallestIndex)
        }

        println("Sorted list is $listSorted")

    }

}