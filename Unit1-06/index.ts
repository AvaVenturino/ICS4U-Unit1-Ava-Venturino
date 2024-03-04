// get arguments

import { readFileSync } from 'fs';

// print process.argv

process.argv.forEach(function (val, index, array) {
})


const file = readFileSync(process.argv[2], 'utf8')

  const newArray = file.split(/\r?\n/)
  // pop last element, since it will be empty (the EOF)
  newArray.pop()
  console.log(newArray) 
