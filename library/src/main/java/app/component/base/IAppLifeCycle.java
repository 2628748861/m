package app.component.base;

import android.content.Context;
import android.content.res.Configuration;

public interface IAppLifeCycle {
    void attachBaseContext(Context base);
    void onCreate();
    void onLowMemory();
    void onTrimMemory(int level);
    void onTerminate();
    void onConfigurationChanged(Configuration newConfig);
}
