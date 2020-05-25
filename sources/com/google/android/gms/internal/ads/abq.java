package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@C16299uq
public final class abq implements bwn {

    /* renamed from: a */
    public final Object f40202a = new Object();

    /* renamed from: b */
    public final abo f40203b;

    /* renamed from: c */
    public final HashSet<abd> f40204c = new HashSet<>();

    /* renamed from: d */
    private final abx f40205d;

    /* renamed from: e */
    private final abm f40206e;

    /* renamed from: f */
    private final HashSet<abp> f40207f = new HashSet<>();

    public abq(String str, abx abx) {
        this.f40206e = new abm(str, abx);
        this.f40205d = abx;
        this.f40203b = new abo();
    }

    /* renamed from: a */
    public final void mo28613a(abp abp) {
        synchronized (this.f40202a) {
            this.f40207f.add(abp);
        }
    }

    /* renamed from: a */
    public final void mo28612a(abd abd) {
        synchronized (this.f40202a) {
            this.f40204c.add(abd);
        }
    }

    /* renamed from: a */
    public final Bundle mo28610a(Context context, abn abn) {
        HashSet hashSet = new HashSet();
        synchronized (this.f40202a) {
            hashSet.addAll(this.f40204c);
            this.f40204c.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f40206e.mo28601a(context, this.f40203b.mo28606b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f40207f.iterator();
        while (it.hasNext()) {
            abp abp = (abp) it.next();
            bundle2.putBundle(abp.f40201e, abp.mo28607a());
        }
        bundle.putBundle("slots", bundle2);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((abd) it2.next()).mo28584a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        abn.mo27474a(hashSet);
        return bundle;
    }

    /* renamed from: a */
    public final void mo28615a(boolean z) {
        long a = C14963ax.m30837g().mo28523a();
        if (z) {
            if (a - this.f40205d.mo28648j() > ((Long) caf.m37099d().mo30717a(C15740bx.f44217aD)).longValue()) {
                this.f40206e.f40185a = -1;
                return;
            }
            this.f40206e.f40185a = this.f40205d.mo28649k();
            return;
        }
        this.f40205d.mo28625a(a);
        this.f40205d.mo28629b(this.f40206e.f40185a);
    }

    /* renamed from: a */
    public final void mo28611a() {
        synchronized (this.f40202a) {
            this.f40206e.mo28602a();
        }
    }

    /* renamed from: b */
    public final void mo28616b() {
        synchronized (this.f40202a) {
            this.f40206e.mo28604b();
        }
    }

    /* renamed from: a */
    public final void mo28614a(zzyv zzyv, long j) {
        synchronized (this.f40202a) {
            this.f40206e.mo28603a(zzyv, j);
        }
    }
}
