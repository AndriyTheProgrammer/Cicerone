package android.support.v4.app;

import android.app.Activity;

/**
 * Created by Konstantin Tckhovrebov (aka @terrakok)
 * on 11.10.16
 */

public class FragmentActivity extends Activity {
    public FragmentManager getSupportFragmentManager() {
        throw new RuntimeException("Stub!");
    }

    public void overridePendingTransition(int enterAnim, int exitAnim) {
        throw new RuntimeException("Stub!");
    }
}
