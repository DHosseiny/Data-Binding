package ir.logcat.databinding;

/**
 * Created by Davud. Databinding project.
 */
public class UsersRepository {

    private static User user = new User("Android Developers", 321,
            "http://icons.iconarchive.com/icons/dakirby309/windows-8-metro/256/Folders-OS-Android-Metro-icon.png",
            "هدف از تشکیل این گروه آشنایی Android Developer  ها با هم و گپ و گفت در این زمینه هست،",
            false, 693);

    public static User getUser() {
        return user;
    }
}
