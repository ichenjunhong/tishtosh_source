package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountSyncService extends Service {

    /* renamed from: a */
    private static C10626c f28148a;

    /* renamed from: b */
    private static final Object f28149b = new Object();

    public void onCreate() {
        synchronized (f28149b) {
            if (f28148a == null) {
                f28148a = new C10626c(getApplicationContext(), true);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return f28148a.getSyncAdapterBinder();
    }
}
