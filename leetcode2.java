import java.util.*;
public class leetcode2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] array = new int [5];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("What is the num we shall remove");
          int nums = sc.nextInt();
          sc.close();

          removeElement(array, nums);

    }
    public static int removeElement (int [] array, int nums){
       // binarytreee btree = new binarytreee();
        linkedList list = new linkedList();
        int count = 0;
        for(int i = 0; i < array.length; i++){
           
            if (array[i] != nums){
                list.insertHead(array[i]);
                count++;
            }
            else{
                System.out.println("removing " + array[i]);
            }
        }
        int [] secArray = new int[count];
        for (int i = count; i > 0; i--){
            secArray[i-1] = list.deleteHead();
            System.out.println(secArray[i-1]);
        }

        return count ;
    }
}