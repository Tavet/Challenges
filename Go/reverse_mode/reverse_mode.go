package reversemode

import (
	"strconv"
	"strings"
)

func Reverse(l string) int {
	var result int
	for _, n := range strings.Split(l, " ") {
		i, _ := strconv.Atoi(n)
		if(i % 2 == 0) {
			result += i
		} else {
			result -= i
		}
	}
	return result
}
