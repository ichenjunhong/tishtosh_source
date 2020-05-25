package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.bytedance.common.wschannel.app.AbsMessengerService;
import com.bytedance.common.wschannel.app.IWsApp;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

public class WsChannelService extends AbsMessengerService {

    /* renamed from: com.bytedance.common.wschannel.server.WsChannelService$a */
    static class C9530a {

        /* renamed from: a */
        int f25977a;

        /* renamed from: b */
        byte[] f25978b;

        C9530a() {
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        C9531a.m18918a((Context) this);
    }

    /* renamed from: a */
    static int m18917a(IWsApp iWsApp) {
        if (iWsApp == null) {
            return DynamicTabYellowPointVersion.DEFAULT;
        }
        return iWsApp.mo17102a();
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message != null) {
            C9531a.m18918a((Context) this).handleMsg(message);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.bytedance.article.wschannel.appstate".equals(action)) {
                int intExtra = intent.getIntExtra("app_state", -1);
                Message message = new Message();
                message.what = 2;
                message.arg1 = intExtra;
                handleMsg(message);
            } else if ("com.bytedance.article.wschannel.networkstate".equals(action)) {
                int intExtra2 = intent.getIntExtra("network_state", -1);
                Message message2 = new Message();
                message2.what = 3;
                message2.arg1 = intExtra2;
                handleMsg(message2);
            }
        }
        return 1;
    }
}
