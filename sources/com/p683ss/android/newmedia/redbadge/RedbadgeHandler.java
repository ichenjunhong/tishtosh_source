package com.p683ss.android.newmedia.redbadge;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.message.C19487k;

/* renamed from: com.ss.android.newmedia.redbadge.RedbadgeHandler */
public class RedbadgeHandler extends Service implements C9382a {

    /* renamed from: a */
    private C9381g f53959a;

    /* renamed from: b */
    private Messenger f53960b;

    public void handleMsg(Message message) {
    }

    public void onCreate() {
        super.onCreate();
        this.f53959a = new C9381g(this);
        this.f53960b = new Messenger(this.f53959a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40818a(Intent intent) {
        if (intent != null && intent != null) {
            mo40819b(intent);
        }
    }

    /* renamed from: b */
    public final void mo40819b(Intent intent) {
        if (intent != null) {
            try {
                if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                    C19592b.m47911a((Context) this).mo40830a(intent.getStringExtra("message_data"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public IBinder onBind(final Intent intent) {
        C19487k.m47712a().mo40629a(new Runnable() {
            public final void run() {
                RedbadgeHandler.this.mo40818a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        });
        return this.f53960b.getBinder();
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        C19487k.m47712a().mo40629a(new Runnable() {
            public final void run() {
                RedbadgeHandler.this.mo40818a(intent);
                RedbadgeHandler.this.stopSelf();
            }
        });
        return super.onStartCommand(intent, i, i2);
    }
}
