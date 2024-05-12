package concurrency;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseMyThread {

    public static void main(String[] args) {
        /** Here iterate is a factory method from streams */
        List<MyThread> threads = Stream.iterate(0, n -> n + 1)
                .map(MyThread::new)
                .limit(10)
                .collect(Collectors.toList());

        /** start here is a method reference */
        threads.forEach(MyThread::start);
    }

}
