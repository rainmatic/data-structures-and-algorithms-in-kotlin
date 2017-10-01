class Recursion {

    private fun getFactorial (n: Int): Long {

        return when (n == 1) {

            true -> 1
            false -> n * getFactorial(n - 1)

        }

    }

    fun doRecursionExample () {

        println("Please, enter the number from 1 to 20 for computing the factorial")
        val input = readLine()!!.toInt()

        if (input in 1..20) {
            val result = getFactorial(input)
            println("The factorial of $input is $result")
        } else {
            println("Your number is out of range")
        }

    }

}