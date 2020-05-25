package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.wschannel.C9503d;
import com.bytedance.common.wschannel.server.C9534b.C9535a;

public class WsChannelReceiver extends BroadcastReceiver {

    /* renamed from: d */
    private static boolean f25973d;

    /* renamed from: a */
    private final Context f25974a;

    /* renamed from: b */
    private boolean f25975b = true;

    /* renamed from: c */
    private C9535a f25976c;

    public WsChannelReceiver(Context context) {
        this.f25976c = C9534b.m18930b(context);
        this.f25974a = context;
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (this.f25975b) {
                this.f25975b = false;
                if (C9534b.m18930b(this.f25974a) == this.f25976c) {
                    return;
                }
            }
            try {
                boolean a = C9503d.m18870a(context).mo17230a();
                if (a != f25973d) {
                    f25973d = a;
                }
            } catch (Throwable unused) {
            }
            if (f25973d) {
                try {
                    boolean a2 = C9534b.m18929a(context);
                    C9535a b = C9534b.m18930b(context);
                    int i = 1;
                    if (!a2) {
                        i = 2;
                    } else if (C9535a.WIFI == b) {
                        i = 3;
                    } else if (C9535a.NONE != b) {
                        i = 4;
                    }
                    Message message = new Message();
                    message.what = 3;
                    message.arg1 = i;
                    C9531a.m18918a(context.getApplicationContext()).handleMsg(message);
                } catch (Exception unused2) {
                }
            }
        }
    }
}
