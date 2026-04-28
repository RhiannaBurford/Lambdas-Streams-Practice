import java.util.LinkedList;

public class L10 {

    public static void main(String[] args){
        LinkedList<Book> library = new LinkedList<Book>();

        library.stream().filter(x -> x.getGenre().equals("Sci-Fi"))
        .filter(x -> x.getPages() > 200).forEach(x -> System.out.println(x.getName().toLowerCase()));
    }
}
