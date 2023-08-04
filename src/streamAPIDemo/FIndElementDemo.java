package streamAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FIndElementDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        //findFirst() and findAny() Method

        Optional<Integer> element= list.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        }else {
            System.out.println("Stream is empty");
        }

        Optional<Integer> element1 = list.stream().findAny();
        if (element1.isPresent()){
            System.out.println(element1.get());
        }else {
            System.out.println("Stream is Empty");
        }
    }
}
