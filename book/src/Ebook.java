public class Ebook extends Book{
    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Ebook(String title, int pages, String format)    {
        super(title, pages);
        this.format = format;
    }

    public static void main(String[] args) {
        Ebook digitalRead = new Ebook("Advanced Java", 350, "PDF");
        int objectPages = digitalRead.getPages();

        System.out.println(digitalRead.getTitle() + " " + objectPages + " " + digitalRead.getFormat());
    }
}
