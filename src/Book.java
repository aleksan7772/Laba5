public class Book {
    static final String currency = "грн";
    private int index;
    private String category;
    private Boolean Palette;
    private int NumberOfPages;
    private double weight;
    private double price;
    private String[] languages;

    public static String getCurrency() {
        return currency;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getPalette() {
        return Palette;
    }

    public void setPalette(Boolean palette) {
        Palette = palette;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
