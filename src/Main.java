import Consumer.ConsumerApi;
import ObjectHttp.ObjectHttp;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Type the Book");

        String input = s.nextLine();

        String handleInput = input.replace(" " , "+");

        ObjectHttp.input = handleInput;


        String res = new ConsumerApi().ApiConsumer();

        System.out.println(res);

    }
}