package app.ybf.com.androidcomponent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_openhome).setOnClickListener(this);
        findViewById(R.id.bt_openmain).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_openhome:

                ARouter.getInstance().build("/app/HomeActivity").navigation();
//                try {
//                    Class clazz = Class.forName("app.ybf.com.home.HomeActivity");
//                    Intent intent = new Intent(getApplicationContext(),clazz);
//                    startActivity(intent);
//                } catch (ClassNotFoundException e) {
//                    Log.e("zhuang","未集成，无法跳转");
//                }
                break;
            case R.id.bt_openmain:

                ARouter.getInstance().build("/secon/SecondActivity").navigation();
//                try {
//                    Class clazz = Class.forName("app.ybf.com.main.SecondActivity");
//                    Intent intent = new Intent(getApplicationContext(),clazz);
//                    startActivity(intent);
//                } catch (ClassNotFoundException e) {
//                    Log.e("zhuang","未集成，无法跳转");
//                }
                break;
        }
    }
}
