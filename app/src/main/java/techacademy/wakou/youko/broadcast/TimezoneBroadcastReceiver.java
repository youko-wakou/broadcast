package techacademy.wakou.youko.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by appu2 on 2017/12/05.
 * This Line
 */

public class TimezoneBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context,Intent intent){
        Toast.makeText(context,"タイムゾーンが変化しました",Toast.LENGTH_LONG).show();
    }
}
