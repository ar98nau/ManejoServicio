package com.android.mdw.demo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ElReceptor extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle data = intent.getExtras();
        String so = data.getString(context.getString(R.string.mess));
        intent.setClass(context, ElServicio.class);

        if (so.equals(context.getString(R.string.selectSonido))){
            Toast.makeText(context, R.string.BcasMessSo, Toast.LENGTH_LONG).show();
            context.startService(intent);
        } else if (so.equals(context.getString(R.string.selectCancion))) {
            Toast.makeText(context, R.string.BcasMessCan, Toast.LENGTH_LONG).show();
            context.startService(intent);
        } else if (so.equals(context.getString(R.string.selectDetencion))) {
            Toast.makeText(context, R.string.BcasMessDet, Toast.LENGTH_LONG).show();
            context.stopService(intent);
        }


    }
}
