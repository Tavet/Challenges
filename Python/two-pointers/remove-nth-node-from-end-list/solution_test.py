import unittest

from solution import Solution
from linked_list import LinkedList
from print_list import print_list_with_forward_arrow


class SolutionTest(unittest.TestCase):
    def test_remove_node_1(self):
        s = Solution()
        test_case = [34, 53, 6, 95, 38, 28, 17, 63, 16, 76]
        input_linked_list = LinkedList()
        input_linked_list.create_linked_list(test_case)
        print(f"\nList: {str(input_linked_list)}\nList head: {str(input_linked_list.head.data)}")
        result = s.remove_nth_last_node(input_linked_list.head, 3)
        print(print_list_with_forward_arrow(result))
        self.assertEquals("34 > 53 > 6 > 95 > 38 > 28 > 17 > 16 > 76 > null", print_list_with_forward_arrow(result))

    def test_remove_node_2(self):
        s = Solution()
        test_case = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        input_linked_list = LinkedList()
        input_linked_list.create_linked_list(test_case)
        print(f"\nList: {str(input_linked_list)}\nList head: {str(input_linked_list.head.data)}")
        result = s.remove_nth_last_node(input_linked_list.head, 1)
        print(print_list_with_forward_arrow(result))
        self.assertEquals("1 > 2 > 3 > 4 > 5 > 6 > 7 > 8 > null", print_list_with_forward_arrow(result))

    def test_remove_node_3(self):
        s = Solution()
        test_case = [69, 8, 49, 106, 116, 112]
        input_linked_list = LinkedList()
        input_linked_list.create_linked_list(test_case)
        print(f"\nList: {str(input_linked_list)}\nList head: {str(input_linked_list.head.data)}")
        result = s.remove_nth_last_node(input_linked_list.head, 6)
        print(print_list_with_forward_arrow(result))
        self.assertEquals("8 > 49 > 106 > 116 > 112 > null", print_list_with_forward_arrow(result))
