# Given a singly linked list, remove the Nth node from the end of the list and return its head.

from linked_list_node import LinkedListNode

class Solution:


    def remove_nth_last_node(self, head: LinkedListNode, n: int):
        # Set two pointers at the head
        l_index = head
        r_index = head

        # Move the right "n" steps forward
        for idx in range(0, n - 1):
            r_index = r_index.next

        # Move both, right and left forward until right reaches the last node
        # The left pointer will be pointing to the node behind the nth last node
        previous_l_index = None
        while r_index.next is not None:
            r_index = r_index.next
            previous_l_index = l_index
            l_index = l_index.next

        # Relink the left node to the node next to left's next node

        if previous_l_index is None:
            # If first node will be removed, we return the next node as the head
            return l_index.next
        elif l_index.next is not None:
            # If it's a node in the middle, then we relink it to the next element
            previous_l_index.next = l_index.next
        else:
            # If last node will be removed, then we relink it to null
            previous_l_index.next = None

        # Return the head of the linked list
        return head









