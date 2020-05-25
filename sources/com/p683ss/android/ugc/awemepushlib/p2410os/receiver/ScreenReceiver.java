package com.p683ss.android.ugc.awemepushlib.p2410os.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.common.C26883g;

/* renamed from: com.ss.android.ugc.awemepushlib.os.receiver.ScreenReceiver */
public class ScreenReceiver extends BroadcastReceiver {
    public static String sExtra = null;
    public static int sFrom = -1;
    public static String sMsg;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public void sendPush(Context context, String str, int i, String str2) {
    }

    public void onReceive(final Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && sFrom >= 0) {
            C26883g.m64995a("receiver_user_present", null);
            try {
                this.mHandler.postDelayed(new Runnable() {
                    public void run() {
                        ScreenReceiver.this.sendPush(context, ScreenReceiver.sMsg, ScreenReceiver.sFrom, ScreenReceiver.sExtra);
                    }
                }, 2000);
            } catch (Exception unused) {
            }
        }
    }
}
