package com.p683ss.android.ugc.trill.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: com.ss.android.ugc.trill.account.TiktokAuthService */
public class TiktokAuthService extends Service {
    public IBinder onBind(Intent intent) {
        return new C50301a(this).getIBinder();
    }
}
