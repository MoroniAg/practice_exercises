package main

import (
	"fmt"
	"golang.org/x/text/cases"
	"golang.org/x/text/language"
)

func main() {
	fmt.Printf("%s", ToJadenCase("test test asd\n"))
}


func ToJadenCase(str string) string {
	result := cases.Title(language.Und, cases.NoLower).String(str)
	return result
  }
