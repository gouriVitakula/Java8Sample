import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        int[] arr = new int[]{1,4,8,9};

        System.out.println( "Min value is:" + Arrays.stream(arr).min().getAsInt());
        System.out.println( "Max value is:" + Arrays.stream(arr).max().getAsInt());

        List<String> list = Arrays.asList("hello", "world", "hemanth", "gouri");
        list.stream().forEach(System.out::println);

        Integer minNumber = Stream.of(67, 234, 23, 434, 232)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The min value is:" + minNumber);

        Integer maxVlaue = Stream.of(464, 356, 4, 646, 57, 57, 67)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("The max value is:" + maxVlaue);


        List<String> list1 = Arrays.asList("hello", "world", "hemanth", "gouri");
        long count = list1.stream().filter(str -> str.length() == 5).count();
        System.out.println(count);

        list1.stream().filter(str -> str.length() > 5).forEach(System.out::println);

        List<Integer> intList = Arrays.asList(4, 5464, 36543, 6, 56);
        System.out.println(intList.stream().map(i -> i * 3).collect(Collectors.toList()));


        List<String> strList1 = Arrays.asList("ram", "bheem", "creem");
        List<String> strList2 = Arrays.asList("kunal", "hemanth", "prasad");

        Stream.concat(strList1.stream(), strList2.stream()).forEach(System.out::println);

        List<Integer> dupList = Arrays.asList(4, 5, 6, 6, 3, 2, 1, 4);
        dupList.stream().collect(Collectors.toSet()).forEach(System.out::println);

        dupList.stream().sorted().forEach(System.out::println);

        dupList.stream().mapToInt(Integer::intValue).sum();

        dupList.stream().map(i -> i * i * i).filter(i -> i > 125).forEach(System.out::println);

        System.out.println(LocalDate.now() + "," + LocalTime.now() + "," + LocalDateTime.now());

        int reverse = 0;
        int i = 5642;
        while (i != 0) {
            reverse = reverse * 10 + i % 10;
            System.out.println(reverse);
            i = i / 10;
            System.out.println(i);
        }
        System.out.println(reverse);

        addIterative(1,2);


    }

    public static int addIterative(int a, int b) {
        while (b != 0) {
            int carry = (a & b); //CARRY is AND of two bits

            a = a ^ b; //SUM of two bits is A XOR B

            b = carry << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
    }


}