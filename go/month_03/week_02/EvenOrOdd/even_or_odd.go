package main

import (
	"fmt"
)

func main() {
	number:= 6
	fmt.Printf("%d is %s \n",number, EvenOrOdd(number))
}

func EvenOrOdd(number int) string {

	if number%2 == 0 {
		return "Even"
	} else {
		return "Odd"
	}

}
