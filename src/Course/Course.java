package Course;

public class Course {
    private int id;
    private String title;
    private int creditHour;
    
    public Course(String title, int creditHour) {
        this.title = title;
        this.creditHour = creditHour;
    }

    // setter and getters 
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){ 
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    } 

    public int getCreditHour(){
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }
}
