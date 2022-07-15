package DSA.LL;

public class Application {
    public static void main(String[] args) {
       LL l = new LL();
        l.insertFront(3);
        l.insertFront(4);
        l.insertFront(5);
        l.insertFront(6);
        l.insertFront(7);
        l.display();
        l.insertBack(8);
        l.insertBack(9);
        l.insertBack(10);
        l.insertBack(11);
        l.display();
        l.insertAtK(15,4);
        l.insertAtK(17,0); // should insert at front
        l.insertAtK(19,20);// cant insert
        l.display();
        System.out.println(l.delete(3));
        System.out.println(l.delete(0));
        System.out.println(l.delete(20));
        System.out.println(l.delete(7));
        l.display();
        l.insertRec(23,4);
        l.insertRec(93,6);
        l.insertRec(76,2);
        l.display();
//
    }
}
