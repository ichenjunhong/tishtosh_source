package com.google.firebase.iid;

import android.content.Context;
import com.google.android.gms.common.util.p1039a.C15508b;
import com.google.android.gms.p1033b.C15179g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.e */
public final class C17921e {

    /* renamed from: a */
    private static C17921e f49777a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f49778b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f49779c;

    /* renamed from: d */
    private C17923g f49780d = new C17923g(this);

    /* renamed from: e */
    private int f49781e = 1;

    /* renamed from: a */
    public static synchronized C17921e m43929a(Context context) {
        C17921e eVar;
        synchronized (C17921e.class) {
            if (f49777a == null) {
                f49777a = new C17921e(context, (ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49846a((ThreadFactory) new C15508b("MessengerIpcClient")).mo49847a()));
            }
            eVar = f49777a;
        }
        return eVar;
    }

    private C17921e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f49779c = scheduledExecutorService;
        this.f49778b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized <T> C15179g<T> mo34763a(C17930n<T> nVar) {
        if (!this.f49780d.mo34768a((C17930n) nVar)) {
            this.f49780d = new C17923g(this);
            this.f49780d.mo34768a((C17930n) nVar);
        }
        return nVar.f49796b.f39202a;
    }

    /* renamed from: a */
    public final synchronized int mo34762a() {
        int i;
        i = this.f49781e;
        this.f49781e = i + 1;
        return i;
    }
}
