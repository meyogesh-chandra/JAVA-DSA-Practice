package Arrays;
import java.util.ArrayList;
public class ArraylistBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));
        arr.set(3,50);
        System.out.println(arr);

        for(int i =0; i<arr.size(); i++){
            System.out.print(arr.get(i)+ " ");
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

        arr.add(78);
        arr.add(1,87);
        System.out.println(arr);

    }
}
