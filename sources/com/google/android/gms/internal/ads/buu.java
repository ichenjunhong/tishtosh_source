package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@C16299uq
public final class buu implements bvd {

    /* renamed from: a */
    public final Object f43991a = new Object();

    /* renamed from: b */
    public final WeakHashMap<abb, buv> f43992b = new WeakHashMap<>();

    /* renamed from: c */
    private final ArrayList<buv> f43993c = new ArrayList<>();

    /* renamed from: d */
    private final Context f43994d;

    /* renamed from: e */
    private final zzbgz f43995e;

    /* renamed from: f */
    private final C16064ly f43996f;

    public buu(Context context, zzbgz zzbgz) {
        this.f43994d = context.getApplicationContext();
        this.f43995e = zzbgz;
        this.f43996f = new C16064ly(context.getApplicationContext(), zzbgz, (String) caf.m37099d().mo30717a(C15740bx.f44319c));
    }

    /* renamed from: a */
    public final void mo30742a(zzyz zzyz, abb abb) {
        mo30743a(zzyz, abb, abb.f40104b.getView());
    }

    /* renamed from: a */
    public final void mo30743a(zzyz zzyz, abb abb, View view) {
        mo30745a(zzyz, abb, (bwh) new bvc(view, abb), (ama) null);
    }

    /* renamed from: a */
    public final void mo30744a(zzyz zzyz, abb abb, View view, ama ama) {
        mo30745a(zzyz, abb, (bwh) new bvc(view, abb), ama);
    }

    /* renamed from: a */
    public final void mo30745a(zzyz zzyz, abb abb, bwh bwh, ama ama) {
        buv buv;
        synchronized (this.f43991a) {
            if (m36815d(abb)) {
                buv = (buv) this.f43992b.get(abb);
            } else {
                buv buv2 = new buv(this.f43994d, zzyz, abb, this.f43995e, bwh);
                buv2.mo30751a((bvd) this);
                this.f43992b.put(abb, buv2);
                this.f43993c.add(buv2);
                buv = buv2;
            }
            if (ama != null) {
                buv.mo30752a((bvr) new bve(buv, ama));
            } else {
                buv.mo30752a((bvr) new bvi(buv, this.f43996f, this.f43994d));
            }
            if (abb.f40098Q) {
                buv.mo30750a(((Long) caf.m37099d().mo30717a(C15740bx.f44300bh)).longValue());
            } else {
                buv.mo30763g();
            }
        }
    }

    /* renamed from: d */
    private final boolean m36815d(abb abb) {
        boolean z;
        synchronized (this.f43991a) {
            buv buv = (buv) this.f43992b.get(abb);
            z = buv != null && buv.mo30759c();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo30740a(abb abb) {
        synchronized (this.f43991a) {
            buv buv = (buv) this.f43992b.get(abb);
            if (buv != null) {
                buv.mo30755b();
            }
        }
    }

    /* renamed from: a */
    public final void mo30741a(buv buv) {
        synchronized (this.f43991a) {
            if (!buv.mo30759c()) {
                this.f43993c.remove(buv);
                Iterator it = this.f43992b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == buv) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo30746b(abb abb) {
        synchronized (this.f43991a) {
            buv buv = (buv) this.f43992b.get(abb);
            if (buv != null) {
                buv.mo30761e();
            }
        }
    }

    /* renamed from: c */
    public final void mo30747c(abb abb) {
        synchronized (this.f43991a) {
            buv buv = (buv) this.f43992b.get(abb);
            if (buv != null) {
                buv.mo30762f();
            }
        }
    }
}
