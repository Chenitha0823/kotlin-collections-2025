/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
        println("Kotlin MutableList")
        println()

        // Create our list
        val snacks = mutableListOf<String>()

        // Show it
        println(snacks)

        // Add in some things...
        snacks.add("Cheetos")
        snacks.add("Twix")
        snacks.add("Twiglets")

        println(snacks)

        // Show specific items
        println(snacks[0])
        //println(snacks[3])  This would be out of bounds!

        // Change a value
        snacks[1] = "Dog Biscuits"
        println(snacks)

        // Remove an item
        snacks.removeAt(0)
        println(snacks)

        // Add in new items in specific places
        snacks.add(1, "Bacon Scratching")
        println(snacks)

        // Sort the list
        snacks.sort()
        println(snacks)

        // Shuffle the list (randomise it)
        snacks.shuffle()
        println(snacks)

        // Get a random item from list
        val item = snacks.random()
        println(item)

        // searching for an item
        println("bear is in list:${snacks.contains("bear)}") 
                println("horse is in list:${snacks.contains("horse)}")}")
            
        // Loop through the list
        for( snack in snacks) {
            println(snack)
        }

        // Loop using an index
                for(i in 0 .. <snacks.size){
                println("$1: ${ snacks[i]}")}
                        
            // loop getting index and values 
            for ((i, snacks) in snacks.withIndex()) 
                
                


        // Getting index of an item
            println("Bear index:${snacks.indexOf("bear")}")
            println("Horse index:${snacks.indexOf("horse")}")


    }

