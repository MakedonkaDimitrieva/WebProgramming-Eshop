package mk.ukim.finki.wpaud.bootstrap;

import mk.ukim.finki.wpaud.model.Category;
import mk.ukim.finki.wpaud.model.Manufacturer;
import mk.ukim.finki.wpaud.model.Product;
import mk.ukim.finki.wpaud.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component //da se kreira samo edna instanca pri start na aplikacija
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    @PostConstruct // da se povika pri startuvanje na app
    public void init() {
        categories.add(new Category("Books", "Books category"));
        categories.add(new Category("Movies", "Movies category"));
        categories.add(new Category("Software", "Software category"));

        users.add(new User("kostadin.mishev", "km", "Kostadin", "Mishev"));
        users.add(new User("riste.stojanov", "rs", "Riste", "Stojanov"));
        users.add(new User("ana.todorovska", "at", "Ana", "Todorovska"));

        Manufacturer manufacturer = new Manufacturer("Nike", "NY NY");
        manufacturers.add(manufacturer);

        Category category = new Category("Sport", "Sport category");
        categories.add(category);

        products.add(new Product("Ball 1", 235.8, 7, category, manufacturer));
        products.add(new Product("Ball 2", 235.8, 7, category, manufacturer));
        products.add(new Product("Ball 3", 235.8, 7, category, manufacturer));
    }
}
