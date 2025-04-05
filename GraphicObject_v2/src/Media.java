public abstract class Media {
    private String title;
    private String creator;
    private int year;

    public Media(String title, String creator, int year) {
        this.title = title;
        this.creator = creator;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Creator: " + creator);
        System.out.println("Year: " + year);
    }

    public abstract void displaySpecialFeatures();
}
