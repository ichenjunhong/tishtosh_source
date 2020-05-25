package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

@C16299uq
public final class adr {

    /* renamed from: a */
    private static bvx f40329a;

    /* renamed from: b */
    private static final Object f40330b = new Object();

    /* renamed from: c */
    private static final adx<Void> f40331c = new C15568ads();

    public adr(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        m32704a(context);
    }

    /* renamed from: a */
    public final <T> aga<T> mo28735a(String str, adx<T> adx) {
        agl agl = new agl();
        f40329a.mo30791a(new adz(str, agl));
        return afp.m32824a(afp.m32823a((aga<A>) agl, (afl<A, B>) new adu<A,B>(this, adx), (Executor) acb.f40240a), Throwable.class, (afk<? super X, ? extends V>) new adt<Object,Object>(this, adx), agf.f40431b);
    }

    /* renamed from: a */
    public final aga<String> mo28734a(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        ady ady = new ady(null);
        adv adv = new adv(this, str2, ady);
        aew aew = new aew(null);
        adw adw = new adw(this, i, str, ady, adv, bArr, map, aew);
        if (aew.m32775b()) {
            try {
                aew.mo28765a(str2, "GET", adw.mo28744b(), adw.mo28743a());
            } catch (C15560a e) {
                abv.m32798e(e.getMessage());
            }
        }
        f40329a.mo30791a(adw);
        return ady;
    }

    /* renamed from: a */
    public final aga<String> mo28736a(String str, Map<String, String> map) {
        return mo28734a(0, str, map, null);
    }

    /* renamed from: a */
    private static bvx m32704a(Context context) {
        bvx bvx;
        bvx bvx2;
        synchronized (f40330b) {
            if (f40329a == null) {
                C15740bx.m36941a(context);
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44362cq)).booleanValue()) {
                    bvx2 = new bvx(new C16023kk(new File(context.getCacheDir(), "admob_volley"), 20971520), new adl(context, new C16182qh()));
                    bvx2.mo30792a();
                } else {
                    bvx2 = new bvx(new C16023kk(new File(context.getCacheDir(), "volley")), new C15947hp((C15922gr) new C16182qh()));
                    bvx2.mo30792a();
                }
                f40329a = bvx2;
            }
            bvx = f40329a;
        }
        return bvx;
    }
}
