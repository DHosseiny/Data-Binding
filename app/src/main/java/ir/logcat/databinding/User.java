package ir.logcat.databinding;

import android.databinding.ObservableField;

/**
 * Created by Davud. Databinding project.
 */
public class User {

    private final ObservableField<String> name;
    public int userCount;
    public String imageUrl;
    public String description;
    public boolean notifications;
    public int sharedMedia;

    public User(String name, int userCount, String imageUrl, String description,
                boolean notifications, int sharedMedia) {

        this.name = new ObservableField<>(name);
        this.userCount = userCount;
        this.imageUrl = imageUrl;
        this.description = description;
        this.notifications = notifications;
        this.sharedMedia = sharedMedia;
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
