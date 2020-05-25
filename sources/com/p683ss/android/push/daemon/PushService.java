package com.p683ss.android.push.daemon;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p683ss.android.push.daemon.C19640g.C19641a;

/* renamed from: com.ss.android.push.daemon.PushService */
public class PushService extends Service {
    public void onCreate() {
        super.onCreate();
        C19636d.m47987a(this);
    }

    public IBinder onBind(Intent intent) {
        return new C19641a() {
        };
    }
}
