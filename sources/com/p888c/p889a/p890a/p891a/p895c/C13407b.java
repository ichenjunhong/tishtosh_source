package com.p888c.p889a.p890a.p891a.p895c;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;

/* renamed from: com.c.a.a.a.c.b */
public final class C13407b {

    /* renamed from: f */
    private static C13407b f34950f = new C13407b();

    /* renamed from: a */
    public Context f34951a;

    /* renamed from: b */
    public BroadcastReceiver f34952b;

    /* renamed from: c */
    public boolean f34953c;

    /* renamed from: d */
    public boolean f34954d;

    /* renamed from: e */
    public C13409a f34955e;

    /* renamed from: com.c.a.a.a.c.b$a */
    public interface C13409a {
        /* renamed from: a */
        void mo25112a(boolean z);
    }

    private C13407b() {
    }

    /* renamed from: a */
    public static C13407b m27027a() {
        return f34950f;
    }

    /* renamed from: d */
    private void m27029d() {
        boolean z = !this.f34954d;
        for (C13404l c : C13406a.m27022a().mo25106b()) {
            c.mo25100c().mo25130a(z);
        }
    }

    /* renamed from: c */
    public final boolean mo25110c() {
        return !this.f34954d;
    }

    /* renamed from: b */
    public final void mo25109b() {
        this.f34952b = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        C13407b.m27028a(C13407b.this, true);
                    } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                        C13407b.m27028a(C13407b.this, false);
                    } else {
                        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                            if (keyguardManager != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                C13407b.m27028a(C13407b.this, false);
                            }
                        }
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f34951a.registerReceiver(this.f34952b, intentFilter);
        this.f34953c = true;
        m27029d();
    }

    /* renamed from: a */
    static /* synthetic */ void m27028a(C13407b bVar, boolean z) {
        if (bVar.f34954d != z) {
            bVar.f34954d = z;
            if (bVar.f34953c) {
                bVar.m27029d();
                if (bVar.f34955e != null) {
                    bVar.f34955e.mo25112a(bVar.mo25110c());
                }
            }
        }
    }
}
