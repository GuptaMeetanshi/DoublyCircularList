class Node{
    int data;
    Node previous;
    Node next;
}
class DoublyCircularLinkedList {
    Node head;
    int size=0;

    public void insertionAtLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            newnode.previous=head;
            size++;
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            newnode.previous=temp;
            temp.next=newnode;
            head.previous=newnode;
            size++;
        }
    }
    public void deletionAtLast(){
        if(head==null){
            System.out.println("List Is Empty");
        }
        else{
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            if(temp==head)
            {
                head=null;
                size--;

            }
            else{
            temp=temp.previous;
            temp.next=head;
            head.previous=temp;
            size--;
        }
    }
    }
    public void insertionAtBeginnig(Node newnode )
    {
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            newnode.previous=head;
            size++;
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            newnode.next=head;
            head=newnode;
            temp.next=newnode;
            newnode.previous=temp;
             size++;
        }
    }
    public void deletionFromBeginning()
    {
        if(head==null)
        {
            System.out.println("list is Empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            head=head.next;
            head.previous=temp;
            temp.next=head;
            size--;

        }
    }
    public void insertAfternodeM(Node newnode,Node afternode)
    {
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            newnode.previous=head;
            size++;
        }
        else {
            Node temp = head;
            while (temp.next != afternode.next) {
                temp = temp.next;
            }
            if (size == 1) {
                temp.next = newnode;
                newnode.previous = temp;
                newnode.next = temp;
                temp.previous = newnode;
            } else {

                newnode.next = temp.next;
                temp.next.previous = newnode;
                newnode.previous = temp;
                temp.next = newnode;
            }
        }
    }
    public void deleteAfterNode(Node afternode) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            Node temp = head;
            while (temp.next != afternode.next) {
                temp = temp.next;
            }
            if (temp == head) {
                afternode.next = head;
                afternode.previous = head;
            } else {

                temp = temp.previous;
                temp.next = temp.next.next;

                temp.next.previous = temp;
            }
        }
    }
    public void insertBeforeNode(Node newnode,Node beforenode)
    {
        if(head==null)
        {
            System.out.println("Cannot insert beforenode");
        }
        else{
            Node temp=head;
            while(temp.next!=beforenode)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next.previous=newnode;
            newnode.previous=temp;
            temp.next=newnode;
        }
    }
    public void deletebeforeNode(Node beforenode)
    {
        if(head==null){
            System.out.println("List is Empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=beforenode)
            {
                temp=temp.next;
            }

            temp=temp.previous;
            temp.next=temp.next.next;

            temp.next.previous=temp;
        }
    }
    public void display(){
        if(head==null){
        System.out.println("List is Empty");
    } else {
        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.data + "<--->");
            temp = temp.next;
        }
        System.out.print(temp.data);
            System.out.println();
    }}
        public static void main(String[] args) {
         DoublyCircularLinkedList obj = new DoublyCircularLinkedList();
            Node n1 = new Node();

            n1.data = 10;
            n1.next = null;
            n1.previous=null;
            obj.insertionAtLast(n1);

            Node n2=new Node();
            n2.data = 20;
            n2.next = null;
            n2.previous=null;
            obj.insertionAtLast(n2);
            obj.display();

            Node n3=new Node();
            n3.data=30;
            n3.next=null;
            n3.previous=null;
            obj.insertAfternodeM(n3,n2);
            obj.display();


            Node n4=new Node();
            n4.data=40;
            n4.next=null;
            n4.previous=null;

            Node n5=new Node();
            n5.data=50;
            n5.next=null;
            n5.previous=null;

            Node n6=new Node();
            n6.data=60;
            n6.next=null;
            n6.previous=null;

            obj.insertBeforeNode(n4,n3);

            Node n7=new Node();
            n7.data=70;
            n7.next=null;
            n7.previous=null;


            Node n8=new Node();
            n8.data=80;
            n8.next=null;
            n8.previous=null;



            Node n9=new Node();
            n9.data=90;
            n9.next=null;
            n9.previous=null;


            obj.display();

            Node n10=new Node();
            n10.data=10;
            n10.next=null;
            n10.previous=null;

            obj.deleteAfterNode(n4);
            obj.display();

            obj.deletionFromBeginning();
            obj.display();

            obj.deletionAtLast();
            obj.display();
            obj.insertionAtLast(n5);
            obj.insertionAtLast(n6);
            obj.insertionAtLast(n7);
            obj.display();
            obj.deleteAfterNode(n5);
            obj.display();
            obj.deletebeforeNode(n7);
            obj.display();
    }
}

