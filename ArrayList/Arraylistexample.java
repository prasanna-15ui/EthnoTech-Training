import java.util.*;
public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.sort(new Comparator<Integer>(){
            @Override 
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        System.out.println(numbers);
    }
    
}
