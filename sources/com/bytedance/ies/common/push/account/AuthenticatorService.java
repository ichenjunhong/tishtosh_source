package com.bytedance.ies.common.push.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AuthenticatorService extends Service {

    /* renamed from: a */
    private C10625b f28150a;

    public void onCreate() {
        this.f28150a = new C10625b(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f28150a.getIBinder();
    }
}
