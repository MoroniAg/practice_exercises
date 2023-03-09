package main

import("testing")

func TestEvenOrOdd(t *testing.T) {
	testcases := []struct {
		in int
		want string
	}{
		{2, "Even"},
		{3, "Odd"},
		{5, "Odd"},
		{4, "Even"},
	}
	for _, tc := range testcases {
		rev := EvenOrOdd(tc.in)
		if rev != tc.want {
			t.Errorf("Number:%d = %q, want %q",tc.in, rev, tc.want)
		}
	}
}