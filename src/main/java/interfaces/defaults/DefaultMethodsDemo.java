package interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodsDemo {

    public static void main(String[] args) {
        /** Static method of an interface */
        List<Integer> nums = Stream.of(-1, 1, 4,-5, 2, -6)
                .collect(Collectors.toList());

        System.out.println(nums);

        /** Default method of an interface */
        boolean removed = nums.removeIf(n -> n <=0);
        System.out.println("Elements were " + (removed ? "" : "NOT") + "removed");
        System.out.println(nums);

        /** Default method of an interface */
        nums.forEach(System.out::println);
    }
}
