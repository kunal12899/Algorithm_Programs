import java.util.*;

public class ReverseLinkedList<T>{
	public class Entry<T>{
		T element;
        Entry<T> next;

        Entry(T x, Entry<T> nxt) {
            element = x;
            next = nxt;
        }
	}

Entry<T> header, tail;
    int size;

    ReverseLinkedList() {
        header = new Entry<>(null, null);
        tail = null;
        size = 0;
    }

    void add(T x) {
        if(tail == null) {
            header.next = new Entry<>(x, header.next);
            tail = header.next;
        } else {
            tail.next = new Entry<>(x, null);
            tail = tail.next;
        }
	size++;
    }

    void printList() {
        Entry<T> x = header.next;
        while(x != null) {
            System.out.print(x.element + " ");
            x = x.next;
        }
        System.out.println();
    }

    void ReverseIterative()
    {
       Entry<T> head1= header.next;
       Entry<T> dhead=null;
       Entry<T> temp;
       while(head1!=null)
       {
          temp=head1.next;
          head1.next=dhead;
          dhead=head1;
          head1=temp;
       }
       hader.next=dhead;

    }

     public static void main(String[] args) {
        int n = 1000000;
        if(args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        ReverseLinkedList<Integer> lst = new ReverseLinkedList<>();
        for(int i=1; i<=n; i++) {
            lst.add(new Integer(i));
        }
         
      
      //lst.printList();
      lst.Reverse1();
      lst.printList();
    }


}