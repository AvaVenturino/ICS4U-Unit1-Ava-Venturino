/*
 * This program is a number guessing game
 * @author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-26
 */ 
  
import { createPrompt } from 'bun-promptx'

// generate a number between 0 to 6
const correctNum: number = Math.floor(Math.random() * 6)
let tries: number = 0
// uses a while loop to continue a sequence until the user guesses the right answer
while (true) {
  // get the user number as a string
  const userNumString = prompt("Input a number between 0 - 6:")
  if (userNumString === null) {
    break // Exit if user cancels or closes the prompt
  }
  const userNumInt: number = parseInt(userNumString)
  if (isNaN(userNumInt)) {
	    console.log("\nThat is not a valid input.")
  } else if (userNumInt < 0) {
	    console.log("This is not between 0 and 6")
  } else if (userNumInt > 6) {           
	    console.log("This is not between 0 and 6")
  } else {
    tries++
    if (userNumInt !== correctNum) {

      if (userNumInt < correctNum) {
        console.log("Your guess is too low.")
      } else {
        console.log("Your guess is too high.")
      }
      console.log("Please try again.")
    } else {
      console.log(`You guessed correctly! It took you ${tries} tries. Thank you for playing!`)
      break
    }
  }
}

console.log("\nDone.")

