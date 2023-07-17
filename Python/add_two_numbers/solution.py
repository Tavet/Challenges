# https://leetcode.com/problems/add-two-numbers/
from typing import Optional
import bisect

# You are given two non-empty linked lists representing two non-negative integers.
# The digits are stored in reverse order, and each of their nodes contains a single digit.
# Add the two numbers and return the sum as a linked list.

# You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        l1_current_node = l1
        l1_list = []
        l2_current_node = l2
        l2_list = []

        while l1_current_node:
            bisect.insort(l1_list, l1_current_node.val)
            l1_current_node = l1.next

        while l2_current_node:
            bisect.insort(l2_list, l2_current_node.val)
            l2_current_node = l2.next

        print(l1_list)
        print(l2_list)
