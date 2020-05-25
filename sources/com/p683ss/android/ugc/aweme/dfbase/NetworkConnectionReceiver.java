package com.p683ss.android.ugc.aweme.dfbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.dfbase.NetworkConnectionReceiver */
public class NetworkConnectionReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && C27561p.m66236a(context)) {
            C27536b.m66176a().mo55976b();
            if (NetworkUtils.isWifi(context)) {
                C27536b.m66176a().f72392f.sendEmptyMessage(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }
}
