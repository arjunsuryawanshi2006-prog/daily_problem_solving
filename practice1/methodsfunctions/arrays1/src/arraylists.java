import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> List = new ArrayList<>(10);

        List.add(322);
        List.add(342);
        List.add(973);
        System.out.println(List.contains(322));
        List.set(2,99);
        List.remove(1);
        System.out.println(List);
















    }
}
