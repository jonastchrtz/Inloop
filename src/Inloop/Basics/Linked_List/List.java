package Inloop.Basics.Linked_List;

public class List {

    public ListElement firstElement;

    public void append(String string) {

        ListElement new_node = new ListElement(string);
        new_node.next = null;

        if (firstElement == null) {
            firstElement = new_node;
        } else {

            ListElement last = firstElement;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;

        }
    }

    public String remove(String string) {

        ListElement currNode = firstElement, prev = null;

        if (currNode != null && currNode.content.equals(string)) {
            firstElement = currNode.next;

        }

        while (currNode != null && currNode.content != string) {

            prev = currNode;
            currNode = currNode.next;

        }

        if (currNode != null && prev != null) {

                prev.next = currNode.next;

        }

        if (currNode == null) {

            return null;
        }

        return currNode.getContent();

    }
}