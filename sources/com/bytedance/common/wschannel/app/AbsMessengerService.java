package com.bytedance.common.wschannel.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.wschannel.C9454c;

public abstract class AbsMessengerService extends Service implements C9382a {

    /* renamed from: a */
    protected C9381g f25722a;

    /* renamed from: b */
    private Messenger f25723b;

    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        C9454c.m18757a(getApplication(), (C9446a) null);
        this.f25722a = new C9381g(this);
        this.f25723b = new Messenger(this.f25722a);
    }

    public IBinder onBind(Intent intent) {
        return this.f25723b.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
