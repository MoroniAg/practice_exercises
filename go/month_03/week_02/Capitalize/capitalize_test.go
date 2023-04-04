package main

import (
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
  )
  var _ = Describe("Test Example", func() {
	It("should work for sample test cases", func() {
	  Expect(ToJadenCase("most trees are blue")).To(Equal("Most Trees Are Blue"))
	  Expect(ToJadenCase("All the rules in this world were made by someone no smarter than you. So make your own.")).To(Equal("All The Rules In This World Were Made By Someone No Smarter Than You. So Make Your Own."))
	  Expect(ToJadenCase("When I die. then you will realize")).To(Equal("When I Die. Then You Will Realize"))
	  Expect(ToJadenCase("Jonah Hill is a genius")).To(Equal("Jonah Hill Is A Genius"))
	  Expect(ToJadenCase("Dying is mainstream")).To(Equal("Dying Is Mainstream"))
	})
  })