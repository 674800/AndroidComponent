package app.ybf.com.androidcomponent;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by ybf on 2019/3/12.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.init(this);
    }
}
