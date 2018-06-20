package ir.logcat.databinding;

/**
 * Created by Davud. Databinding project.
 */
public class User {

    private String name;
    public int userCount;
    public String imageUrl;
    public String description;
    public boolean notifications;
    public int sharedMedia;

    public User(String name, int userCount, String imageUrl, String description,
                boolean notifications, int sharedMedia) {

        this.name = name;
        this.userCount = userCount;
        this.imageUrl = imageUrl;
        this.description = description;
        this.notifications = notifications;
        this.sharedMedia = sharedMedia;
    }

    public String getName() {
        return name;
    }
}
