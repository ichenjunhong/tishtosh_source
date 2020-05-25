package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;

/* renamed from: com.google.android.gms.tagmanager.e */
public final class C17209e {

    /* renamed from: l */
    private static Object f48651l = new Object();

    /* renamed from: m */
    private static C17209e f48652m;

    /* renamed from: a */
    volatile long f48653a;

    /* renamed from: b */
    volatile boolean f48654b;

    /* renamed from: c */
    volatile C14903a f48655c;

    /* renamed from: d */
    volatile long f48656d;

    /* renamed from: e */
    final Context f48657e;

    /* renamed from: f */
    final C15514e f48658f;

    /* renamed from: g */
    final Thread f48659g;

    /* renamed from: h */
    final Object f48660h;

    /* renamed from: i */
    C17229y f48661i;

    /* renamed from: j */
    private volatile long f48662j;

    /* renamed from: k */
    private volatile long f48663k;

    /* renamed from: a */
    public static C17209e m42161a(Context context) {
        if (f48652m == null) {
            synchronized (f48651l) {
                if (f48652m == null) {
                    C17209e eVar = new C17209e(context);
                    f48652m = eVar;
                    eVar.f48659g.start();
                }
            }
        }
        return f48652m;
    }

    private C17209e(Context context) {
        this(context, null, C15517h.m32280d());
    }

    private C17209e(Context context, C17229y yVar, C15514e eVar) {
        this.f48653a = 900000;
        this.f48662j = 30000;
        this.f48660h = new Object();
        this.f48661i = new C17220p(this);
        this.f48658f = eVar;
        if (context != null) {
            this.f48657e = context.getApplicationContext();
        } else {
            this.f48657e = context;
        }
        this.f48663k = this.f48658f.mo28523a();
        this.f48659g = new Thread(new C17226v(this));
    }
}
