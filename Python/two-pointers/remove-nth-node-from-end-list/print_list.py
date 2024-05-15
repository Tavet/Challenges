# Template for printing the linked list with forward arrows

def print_list_with_forward_arrow(linked_list_node):
    temp = linked_list_node
    output = ""
    while temp:
        output += str(temp.data) + " "  # print node value
        temp = temp.next
        if temp:
            output += ">" + " "
        else:
            output += "> null "
    return output.strip()
