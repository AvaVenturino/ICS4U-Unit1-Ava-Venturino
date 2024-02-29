/*
 * This is a program that calculates the length of a boardfoot.
 * @author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-29
 */ 
  
import { createPrompt } from 'bun-promptx' 


function BoardFoot(width = number, height = number) {
  const volume = 144 // 1 board foot is 144 cubic inches
  const length = volume / (width * height) // Calculate length to achieve 1 board foot
  return length
}

function main() {
// Input
  const widthInputString = createPrompt("Enter the width of the piece of wood (in inches): ")
  const heightInputString = createPrompt("Enter the height of the piece of wood (in inches): ")

  const width = parseFloat(widthInputString.value)
  const height = parseFloat(heightInputString.value) 

  // Error checking

  if (isNaN(width) || isNaN(height) || width <= 0 || height <= 0) {
    console.log("\nInvalid input. Width and height must be positive numbers.\n")
    return
  }

  // Calculate length using the BoardFoot function
  
  const length = BoardFoot(width, height)

  // Output
  console.log(`To make exactly 1 board foot of wood, the length should be ${length.toFixed(1)} inches.`)
  console.log(`\nDone.`)
}

// Call main function
main()
