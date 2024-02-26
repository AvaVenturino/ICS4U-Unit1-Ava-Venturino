/*
 * This is a program that calculates how long you should microwave subs, pizzas and soups.
 * @author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-26
 */ 
  
import { createPrompt } from 'bun-promptx' 


const subPizzaOrSoup = createPrompt("Are you heating sub, pizza, or soup?: ")
const numberOfFoodString = createPrompt(`How many ${subPizzaOrSoup.value}(s) are you cooking? (max:3): `)

// Error checking
const numberOfFood = parseInt(numberOfFoodString.value)

// Process
let minute = number | undefined
let second = number | undefined

if (subPizzaOrSoup.value === "sub") {
  if (numberOfFood === 1) {
	  minute = 1
	  second = 0
  } else if (numberOfFood === 2) {
	  minute = 1
	  second = 30
  } else if (numberOfFood === 3) {
	  minute = 2
	  second = 0
  } else {
	  console.log("Invalid input")
  }
} else if (subPizzaOrSoup.value === "pizza") {
  if (numberOfFood === 1) {
	  minute = 0
	  second = 45
  } else if (numberOfFood === 2) {
	  minute = 1
	  second = 8
  } else if (numberOfFood === 3) {
	  minute = 1
	  second = 20
  } else {
	  console.log("Invalid input")
  }
} else if (subPizzaOrSoup.value === "soup") {
  if (numberOfFood === 1) {
	  minute = 1
	  second = 45
  } else if (numberOfFood === 2) {
	  minute = 2
	  second = 18
  } else if (numberOfFood === 3) {
	  minute = 3
	  second = 20
  } else {
	  console.log("Invalid input")
  }
} else {
  console.log("Invalid Input")
}
// Output

if (minute !== undefined || second !== undefined) {
  console.log(`The total cook time is ${minute} minutes and ${second} seconds.`)
}

console.log("\nDone.")

