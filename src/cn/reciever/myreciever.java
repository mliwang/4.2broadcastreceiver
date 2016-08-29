package cn.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class myreciever extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		String content = intent.getStringExtra("name");
		Toast.makeText(context,content, 1).show();

	}

}
