package reversemode
import "testing"

// The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:

var tests = []struct{ // Test table
	in string
	out int
  }{
	{"2 4 6", 12},
	{"1 3 5", -9},
	{"810 494 948 362 482 687 617 25 656 737 938 326 563 550 699 918 135 176 107 393 324 262 515 319 477 627 575 237 847 578", 264},

  }

  func TestFunction(t *testing.T) {
	for i, tt := range tests {
	  s := Reverse(tt.in)
	  if s != tt.out {
		t.Errorf("%d. %q => %q, wanted: %q", i, tt.in, s, tt.out)
	  }
	}
  }