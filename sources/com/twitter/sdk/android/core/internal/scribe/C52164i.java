package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C52114g;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.i */
public abstract class C52164i<T> implements C52169n {

    /* renamed from: a */
    protected final Context f129847a;

    /* renamed from: b */
    protected final ScheduledExecutorService f129848b;

    /* renamed from: c */
    protected C52170o<T> f129849c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo108889a() {
        try {
            this.f129849c.mo108864a();
        } catch (Exception e) {
            C52114g.m111465a(this.f129847a, "Failed to send events files.", (Throwable) e);
        }
    }

    /* renamed from: a */
    private void m111561a(Runnable runnable) {
        try {
            this.f129848b.submit(runnable);
        } catch (Exception e) {
            C52114g.m111465a(this.f129847a, "Failed to submit events task", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo108891a(String str) {
        m111561a((Runnable) new C52166k(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo108892b(Object obj, boolean z) {
        try {
            this.f129849c.mo108865a(obj);
            if (z) {
                this.f129849c.mo108867c();
            }
        } catch (Exception e) {
            C52114g.m111465a(this.f129847a, "Failed to record event.", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo108890a(T t, boolean z) {
        m111561a((Runnable) new C52165j(this, t, false));
    }

    public C52164i(Context context, C52170o<T> oVar, C52161g gVar, ScheduledExecutorService scheduledExecutorService) {
        this.f129847a = context.getApplicationContext();
        this.f129848b = scheduledExecutorService;
        this.f129849c = oVar;
        gVar.mo108881a((C52169n) this);
    }
}
