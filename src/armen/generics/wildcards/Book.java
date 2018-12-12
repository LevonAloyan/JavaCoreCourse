package armen.generics.wildcards;

public class Book extends Gift {

    private String title;

    Book(String title){
        this.title = title;
    }

    Book(){}

    @Override
    public String toString() {
        return title;
    }
}
