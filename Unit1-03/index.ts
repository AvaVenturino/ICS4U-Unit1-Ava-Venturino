/*
 * This is a program that calculates the amount of energy produced when given the mass.
 *@author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-22 
 */ 
  
import { createPrompt } from 'bun-promptx' 


const subPizzaOrSoup = createPrompt("Are you heating sub, pizza, or soup?: ");
const numberOfFoodString = createPrompt(`How many ${subPizzaOrSoup}(s) are you cooking? (max:3): `);

// Error checking
const numberOfFood = parseFloat(numberOfFoodString.value || "-1");

// Process
let time;

if (subPizzaOrSoup === "sub") {
	if (numberOfFood === 1)
		time = 1;
        else if (numberOfFood === 2)
		time = 1.5;
        else if (numberOfFood === 3)
		time = 2;
        else
		console.log("Invalid input");
} else if (subPizzaOrSoup === "pizza") {
	if (numberOfFood === 1)
		time = 0.45;
	else if (numberOfFood === 2)
		time = 1.08;
	else if (numberOfFood === 3)
		time = 1.30;
	else
		console.log("Invalid input");
} else if (subPizzaOrSoup === "soup") {
	if (numberOfFood === 1)
		time = 1.45;
	else if (numberOfFood === 2)
		time = 2.18;
	else if (numberOfFood === 3)
		time = 3.30;
	else
		console.log("Invalid input");
} else {
	console.log("Invalid Input");
}
// Output
if (time !== undefined) {
	console.log(`The total cook time is ${time} minutes.`);
} else {
	console.log("Cook time could not be determined.");
}
console.log("\nDone.");

