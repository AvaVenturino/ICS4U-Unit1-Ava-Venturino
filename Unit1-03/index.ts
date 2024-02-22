/*
 * This is a program that calculates the amount of energy produced when given the mass.
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-22
 */

import { createPrompt } from 'bun-promptx'

// input
const subPizzaOrSoup = createPrompt("Are you heating sub, pizza, or soup?: ")
// error checking
if (isNaN(subPizzaOrSoup) == false || mass =< 0 || mass >= 0 ) {
console.log("Invalid input.")
} else {
	const numberOfFoodString = createPrompt("How many ${subPizzaOrSoup}(s) are you cooking? (max:3): ")
	// error checking
	const numberOfFood  = parseFloat(numberOfFoodString.value || "-1")
	if (isNaN(numberOfFood) == true || mass < 0 || mass > 3 ) {
	console.log("Invalid input.")
	} else {
		// process
		const time  =  
	}
// output
console.log(` ${mass} kg of mass would produce ${energy.toExponential(3)} J of energy.`)
}

console.log("\nDone.")
