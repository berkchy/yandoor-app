import android.app.Application;
import android.os.Looper;
import android.widget.Toast;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Global crash handler
        Thread.setDefaultUncaughtExceptionHandler((thread, e) -> {
            Log.e("CRASH_DEBUG", "Unhandled crash: ", e);

            new android.os.Handler(Looper.getMainLooper()).post(() -> {
                Toast.makeText(getApplicationContext(), "Crash detected: " + e.getMessage(), Toast.LENGTH_LONG).show();
            });

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                // ignore
            }

            System.exit(1);
        });
    }
}
