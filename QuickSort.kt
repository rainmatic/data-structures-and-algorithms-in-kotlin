import java.util.Random

class QuickSort {

    private fun getSortedList (inputList: List<Int>): List<Int> {

        val random = Random()
        fun rand(min: Int, max: Int) : Int {
            return random.nextInt(max - min) + min
        }

        val lessList = mutableListOf<Int>()
        val greaterList = mutableListOf<Int>()
        val equalList = mutableListOf<Int>()

        return if (inputList.size < 2) {

            inputList

        } else {

            val pivot = rand(0, inputList.size)

            for (item in inputList) {
                when {
                    item < inputList[pivot] -> lessList.add(item)
                    item > inputList[pivot] -> greaterList.add(item)
                    item == inputList[pivot] -> equalList.add(item)
                }
            }

            getSortedList(lessList) + equalList + getSortedList(greaterList)

        }

    }

    fun doQuickSortExample () {

        println("Please, enter some integer numbers using spacebar")
        val inputList = readLine()!!.split(' ').map(String::toInt)

        println("Sorted list is " + getSortedList(inputList))

    }

}