package com.p683ss.android.ugc.asve.p1241e;

import android.content.Context;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.ss.android.ugc.asve.e.c */
public final class C20391c {

    /* renamed from: b */
    public static volatile C20391c f55917b;

    /* renamed from: c */
    public static final C20392a f55918c = new C20392a(null);

    /* renamed from: a */
    public final SharedPreferences f55919a;

    /* renamed from: com.ss.android.ugc.asve.e.c$a */
    public static final class C20392a {
        private C20392a() {
        }

        public /* synthetic */ C20392a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C20391c m50597a(Context context) {
            C52711k.m112240b(context, "context");
            if (C20391c.f55917b == null) {
                synchronized (C52728w.m112245a(C20391c.class)) {
                    if (C20391c.f55917b == null) {
                        C20391c.f55917b = new C20391c(context, null);
                    }
                }
            }
            C20391c cVar = C20391c.f55917b;
            if (cVar == null) {
                C52711k.m112234a();
            }
            return cVar;
        }
    }

    /* renamed from: a */
    public static final C20391c m50589a(Context context) {
        return C20392a.m50597a(context);
    }

    /* renamed from: a */
    public final int mo43220a() {
        return this.f55919a.getInt("key_camera_wide_mode", 0);
    }

    /* renamed from: b */
    public final long mo43223b() {
        return this.f55919a.getLong("key_sandbox_crash_time", -1);
    }

    /* renamed from: c */
    public final boolean mo43225c() {
        if (!this.f55919a.getBoolean("key_force_forbid_sandbox", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo43226d() {
        return this.f55919a.getBoolean("key_force_enable_sandbox", false);
    }

    private C20391c(Context context) {
        SharedPreferences a = C35807d.m80935a(context.getApplicationContext(), "asve_sp", 0);
        C52711k.m112236a((Object) a, "context.applicationConte…p\", Context.MODE_PRIVATE)");
        this.f55919a = a;
    }

    /* renamed from: a */
    public final void mo43221a(int i) {
        this.f55919a.edit().putInt("key_camera_wide_mode", i).apply();
    }

    /* renamed from: b */
    public final void mo43224b(int i) {
        this.f55919a.edit().putInt("key_camera_shake_mode", i).apply();
    }

    /* renamed from: a */
    public final void mo43222a(boolean z) {
        this.f55919a.edit().putBoolean("key_force_forbid_sandbox", z).apply();
    }

    public /* synthetic */ C20391c(Context context, C52707g gVar) {
        this(context);
    }
}
