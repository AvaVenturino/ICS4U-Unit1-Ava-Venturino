/*
 * This is a program that calculates the amount of energy produced when given the mass.
 *@author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-22 
 */ 
  
import { createPrompt } from 'bun-promptx' 


const subPizzaOrSoup = createPrompt("Are you heating sub, pizza, or soup?: ")
const numberOfFoodString = createPrompt(`How many ${subPizzaOrSoup.value}(s) are you cooking? (max:3): `)

// Error checking
const numberOfFood = parseInt(numberOfFoodString.value)

// Process
let minute: number | 0 = 0
let second: number | 0 = 0

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
		console.log("Invalid input -1")
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
		console.log("Invalid input -2")
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
		console.log("Invalid input -3")
	}
} else {
	console.log("Invalid Input - last")
}
// Output

   if (minute !== 0  && second !== 0) {
	   console.log(`The total cook time is ${minute} minutes and ${second} seconds.`)
}

console.log("\nDone.");

