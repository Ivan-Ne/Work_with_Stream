import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creating collection "users"
        List<User> users = new ArrayList<>();

        //Adding objects of the class User
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        // Working with stream here
        // Transforming collection "users" to a stream
        users.stream()
                //Sorting by name
                .sorted((Comparator.comparing(User::getName)))
                //Filtering by the age less then 40 y.o.
                .filter((user -> user.getAge() < 40))
                //Taking only 3 elements
                .limit(3)
                //Taking the names of users
                .map(user -> user.getName())
                //Printing the result
                .forEach(System.out::println);
        }
    }

