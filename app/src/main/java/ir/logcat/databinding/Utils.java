package ir.logcat.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Locale;

/**
 * Created by Davud. Databinding project.
 */
public class Utils {


    @NonNull
    public static String formatUserCount(int userCount) {

        String count;
        if (userCount >= 1000) {
            float userCountFloat = userCount / 1000F;
            count = String.format(Locale.US, "%.1fK ", userCountFloat);
        } else count = String.format(Locale.US, "%d ", userCount);

        return count + " members";
    }


    @BindingAdapter(value = {"android:src", "bind:placeholder"}, requireAll = false)
    public static void loadImage(ImageView imageView, String url, int placeHolder) {

        if (url == null) return;

        RequestOptions requestOptions = RequestOptions.circleCropTransform();
        if (placeHolder != 0) {
            requestOptions = requestOptions.placeholder(placeHolder);
        }

        Glide.with(imageView.getContext())
                .load(url)
                .apply(requestOptions)
                .into(imageView);
    }

    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        assert connectivityManager != null;
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }
}
