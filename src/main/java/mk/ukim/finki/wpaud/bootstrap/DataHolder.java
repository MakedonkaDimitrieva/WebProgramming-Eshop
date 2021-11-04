package mk.ukim.finki.wpaud.bootstrap;

import mk.ukim.finki.wpaud.model.Category;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component //da se kreira samo edna instanca pri start na aplikacija
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();

    @PostConstruct // da se povika pri startuvanje na app
    public void init() {
        categories.add(new Category("Books", "Books category"));
        categories.add(new Category("Movies", "Movies category"));
    }
}