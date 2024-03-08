/*
 * This is a program that calculates mean, median, and mode
 * @author  Ava Venturino 
 * @version 1.0 
 * @since   2024-02-29
 */ 

// get arguments

import { readFileSync } from 'fs'

// print process.argv

process.argv.forEach(function (val, index, array) {
})


const file = readFileSync(process.argv[2], 'utf8')

const newArray = file.split(/\r?\n/)

// pop last element, since it will be empty (the EOF)

newArray.pop()
console.log(newArray)

// Define functions to calculate mean, median, and mode

function calculateMean(arr) {
  let sum = 0
  for (const num of arr) {
    sum += num
  }
  return sum / arr.length
}
function calculateMedian(arr) {
  const sortedArray = arr.slice().sort((a, b) => a - b)
  const length = sortedArray.length
  if (length % 2 === 0) {
    return (sortedArray[length / 2 - 1] + sortedArray[length / 2]) / 2
  } else {
    return sortedArray[Math.floor(length / 2)]
  }
}

function calculateMode(arr) {
  const frequencyMap = {}
  let maxFrequency = 0
  for (const num of arr) {
    frequencyMap[num] = (frequencyMap[num] || 0) + 1
    if (frequencyMap[num] > maxFrequency) {
      maxFrequency = frequencyMap[num]
    }
  }
  const modes = []
  for (const num in frequencyMap) {
    if (frequencyMap[num] === maxFrequency) {
      modes.push(parseInt(num))
    }
  }
  return modes
}
// Calculate mean, median, and mode
const mean = calculateMean(newArray.map(Number))
const median = calculateMedian(newArray.map(Number))
const mode = calculateMode(newArray.map(Number))

// Output results
console.log("The mean is:", mean)
console.log("The median is:", median)
console.log("The mode is:", mode)
console.log("\nDone.")
