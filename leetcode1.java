import java.util.Random;
public class leetcode1{

    public static void main (String [] args){
       
        Random rand = new Random();
        System.out.println("Debugging purposes.");
        linkedList list1 = new linkedList();
        linkedList list2 = new linkedList();

        for (int i = 0; i < 5; i++){
            int putNum = rand.nextInt(100)+1;
            list1.insertHead(putNum);
        }
        for (int i = 0; i < 5; i++){
            int putNum = rand.nextInt(100)+1;
            list2.insertHead(putNum);
        }

       System.out.println("line break");

  
    linkSorter(list1, list2);

    
}

public static void linkSorter(linkedList list1, linkedList list2){

  int a = list1.deleteHead();
  int b = list2.deleteHead();
  linkedList list3 = new linkedList();


while (a == -1 || b == -1){
    if (a == -1){
       list3.insertHead(b);
       b = list2.deleteHead();
    }
   else if ( b == -1){
       list3.insertHead(a);
       a = list1.deleteHead();
    }
}

while ( a!= -1 && b != -1){
  
      if ( a < b){
         list3.insertHead(a);
         a = list1.deleteHead();
      }
       else{
         list3.insertHead(b);
         b = list2.deleteHead();
     }
  
}




list3.display();
}
}