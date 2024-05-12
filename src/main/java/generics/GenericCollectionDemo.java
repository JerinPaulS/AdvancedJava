package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;

public class GenericCollectionDemo {

    public void noGenerics() {
        List nums = new ArrayList();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add("oops");
        System.out.println(nums);

        for (Object n : nums) {
//            Integer val = (Integer) n;
            System.out.println(n);
        }
    }

    public void genericList() {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
//        nums.add("oops");
        System.out.println(nums);

//        for (Integer n : nums) {
//            System.out.println(n);
//        }
        /** Functional idiom */
        nums.forEach(System.out::println);
    }

    public static void main(String[] args) {
        GenericCollectionDemo demo = new GenericCollectionDemo();
        demo.genericList();
        demo.noGenerics();
    }

}
