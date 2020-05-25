package com.p683ss.caijing.globaliap.p2559d.p2560a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.concurrent.Executor;

/* renamed from: com.ss.caijing.globaliap.d.a.a */
public final class C51229a {

    /* renamed from: a */
    volatile IInAppBillingService f127939a;

    /* renamed from: b */
    public volatile boolean f127940b;

    /* renamed from: c */
    volatile boolean f127941c;

    /* renamed from: d */
    public volatile Context f127942d;

    /* renamed from: e */
    public final Executor f127943e = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: f */
    final Handler f127944f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public C51233b f127945g;

    /* renamed from: h */
    ServiceConnection f127946h = new ServiceConnection() {

        /* renamed from: b */
        private int f127948b;

        public final void onServiceDisconnected(ComponentName componentName) {
            C51229a.this.f127941c = false;
            if (C51229a.this.f127940b) {
                this.f127948b++;
                if (this.f127948b < 3) {
                    C51229a.this.f127943e.execute(new C51231a(C51229a.this, 0));
                    return;
                }
            }
            this.f127948b = 0;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C51229a.this.f127941c = true;
            C51229a.this.f127939a = Stub.asInterface(iBinder);
            if (C51229a.this.f127945g != null) {
                C51229a.this.f127945g.mo101762a();
            }
            this.f127948b = 0;
        }
    };

    /* renamed from: com.ss.caijing.globaliap.d.a.a$a */
    public class C51231a implements Runnable {
        public final void run() {
            C51229a aVar = C51229a.this;
            Context context = C51229a.this.f127942d;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            ServiceConnection serviceConnection = C51229a.this.f127946h;
            boolean z = true;
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                z = context.bindService(intent, serviceConnection, 1);
            }
            aVar.f127941c = z;
            if (!C51229a.this.f127941c) {
                C51229a.this.f127944f.post(new Runnable() {
                    public final void run() {
                        if (C51229a.this.f127945g != null) {
                            C51229a.this.f127945g.mo101763b();
                        }
                    }
                });
            }
        }

        private C51231a() {
        }

        public /* synthetic */ C51231a(C51229a aVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.a.a$b */
    public interface C51233b {
        /* renamed from: a */
        void mo101762a();

        /* renamed from: b */
        void mo101763b();
    }

    /* renamed from: a */
    public final void mo101756a() {
        if (this.f127939a != null) {
            this.f127942d.unbindService(this.f127946h);
            this.f127939a = null;
        }
    }

    /* renamed from: b */
    public final boolean mo101757b() {
        if (!this.f127941c || this.f127939a == null || !this.f127939a.asBinder().pingBinder()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized int mo101754a(String str) {
        if (!mo101757b()) {
            return -1;
        }
        return this.f127939a.consumePurchase(3, this.f127942d.getPackageName(), str);
    }

    /* renamed from: a */
    public final synchronized Bundle mo101755a(String str, String str2) {
        if (!mo101757b()) {
            return null;
        }
        return this.f127939a.getPurchases(3, this.f127942d.getPackageName(), str, str2);
    }
}
