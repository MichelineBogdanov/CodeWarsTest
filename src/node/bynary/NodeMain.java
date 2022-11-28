package node.bynary;

public class NodeMain {

    public static void main(String[] args) {
        Node three = new Node(2);
        Node two = new Node(2, three);
        Node one = new Node(2, two);
        Node head = new Node(0, one);
        System.out.println(indexOf(head, 2));
        System.out.println(lastIndexOf(head, 2));
        //System.out.println(head);

        String s = "asdasd";
        char[] chars = s.toCharArray();
        char a = 'a';
        char b = 'b';
        System.out.println(a + Character.toString(b));
    }

    public static int lastIndexOf(Node head, Object value) {
        /*int rez = 0;
        ArrayList<Integer> list = new ArrayList<>();
        node.bynary.Node current = head;*/

        int index = -1;
        for (int i = 0; head != null; head = head.next, i++) {
            if ((head.data != null && head.data.equals(value)) || (value == null && head.data == null)) {
                index = i;
            }

        }
        return index;

        /*while (current != null) {
            if ((current.data != null && current.data.equals(value)) || (value == null && current.data == null)) {
                list.add(rez);
            }
            rez++;
            current = current.next;
        }
        return list.isEmpty() ? -1 : list.get(list.size() - 1);
        }
         */
    }


    public static int indexOf(Node head, Object value) {
        int rez = 0;
        Node current = head;
        while (current.next != null) {
            if ((current.data != null && current.data.equals(value)) || (value == null && current.data == null)) {
                return rez;
            }
            rez++;
            current = current.next;
        }
        return -1;
    }

    public static int length(Node head) {
        int rez = 1;
        if (head == null) {
            return 0;
        } else if (head.next != null) {
            rez = length(head.next) + 1;
        }
        return rez;
    }

}

