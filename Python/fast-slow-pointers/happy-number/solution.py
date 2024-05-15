# Write an algorithm to determine if a number n is a happy number.
#
# We use the following process to check if a given number is a happy number:
#
# Starting with the given number n, replace the number with the sum of the squares of its digits.
# Repeat the process until:
# The number equals 1, which will depict that the given number n is a happy number.
# The number enters a cycle, which will depict that the given number n is not a happy number.
# Return TRUE if n is a happy number, and FALSE if not.

class Solution:
    def is_happy_number(self, n):
        # Set up two pointers, slow_pointer points to the input number, and fast_pointer points to the sum
        # of squared digits of the input number
        slow_pointer = n
        fast_pointer = self.sum_of_squared_digits(slow_pointer)

        # Start a loop until fast_pointer reaches 1 or both pointers meet, indicating a cycle
        while (fast_pointer != 1 and
               slow_pointer != 1) and \
                slow_pointer != fast_pointer:
            # Update the slow_pointer by adding the squares of its digits
            # and fast_pointer by adding the squares of its digits twice
            slow_pointer = self.sum_of_squared_digits(slow_pointer)
            fast_pointer = self.sum_of_squared_digits(self.sum_of_squared_digits(fast_pointer))

        return fast_pointer == 1 or \
            slow_pointer == 1 or \
            slow_pointer != fast_pointer

    def sum_of_squared_digits(self, number):  # Helper function that calculates the sum of squared digits.
        total_sum = 0
        while number > 0:
            digit = number % 10
            number = number // 10
            total_sum += digit ** 2
        return total_sum
