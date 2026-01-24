package arrays;
import java.util.*;


public class ArrayCC {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    // Linear Search in array
    public static int linearSearch(String[] menu, String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        // int marks[] = {95, 93, 99};
        // update(marks);
        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i]+ " ");
        // }
        // System.out.println();

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"dosa", "idhli", "samosa", "chole", "chips"};
        String key = "chili sorce";
        int index = linearSearch(menu, key);
        if (index == -1){
            System.out.println("NOT Found : " + index);
        } else {
            System.out.println("key found at index : "+ index);
        }
    }
}
