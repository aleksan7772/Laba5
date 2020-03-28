import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Post_office post = new Post_office();
        post.cashiers = 2;
        post.gift_wrapping = true;
        post.additional_service = "Наложенный платеж";
        post.brand_price = 0.50;
        System.out.println("Почта");
        System.out.println("Язык " + Post_office.language);
        System.out.println("Кассиров " + post.cashiers);
        System.out.println("упаковка подарокв " + true);
        System.out.println("Доп услуга " + post.additional_service);
        System.out.println("Цена марки " + post.brand_price + '$');

        Book book = new Book();
        book.setIndex(3);
        book.setCategory("Fantasy");
        book.setPalette(true);
        book.setNumberOfPages(700);
        book.setWeight(0.555);
        book.setPrice(150.50);
        book.setLanguages(new String[] {"Russian", " Ukrainian", "English"});

        System.out.println();
        System.out.println("Book");
        System.out.println("Валюта " + Book.getCurrency());
        System.out.println("Артикул " + book.getIndex());
        System.out.println("Стиль " + book.getCategory());
        System.out.println("Оьложка " + book.getPalette());
        System.out.println("Количество страниц " + book.getNumberOfPages());
        System.out.println("Вес " + book.getWeight());
        System.out.println(Arrays.toString(book.getLanguages()));
        System.out.println("Цена " + book.getPrice() + '$');

        Auto auto = new Auto();
        auto.setMark("BMW");
        auto.setColor("Color Blue");
        auto.setCrash(false);
        auto.setMax_spped(250);
        auto.setCost(5000);
        auto.setBreakdowns(new String[] {"Течёт масло", "Не работает дворник", "Разбито зеркало "});
        System.out.println();
        System.out.println("Auto");
        System.out.println("Растаможена " + Auto.cleared);
        System.out.println("Марка " + auto.getMark());
        System.out.println("Цвет " + auto.getColor());
        System.out.println("Максимальная скорость " + auto.getMax_spped());
        System.out.println("Поломки " + Arrays.toString(auto.getBreakdowns()));
        System.out.println("Цена "+ auto.getCost() + '$');
    }
}
