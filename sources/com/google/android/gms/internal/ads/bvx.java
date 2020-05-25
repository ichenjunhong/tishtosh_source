package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class bvx {

    /* renamed from: a */
    private final AtomicInteger f44092a;

    /* renamed from: b */
    private final Set<brw<?>> f44093b;

    /* renamed from: c */
    private final PriorityBlockingQueue<brw<?>> f44094c;

    /* renamed from: d */
    private final PriorityBlockingQueue<brw<?>> f44095d;

    /* renamed from: e */
    private final C16399yi f44096e;

    /* renamed from: f */
    private final bmz f44097f;

    /* renamed from: g */
    private final C15678b f44098g;

    /* renamed from: h */
    private final bnz[] f44099h;

    /* renamed from: i */
    private beb f44100i;

    /* renamed from: j */
    private final List<Object> f44101j;

    private bvx(C16399yi yiVar, bmz bmz, int i, C15678b bVar) {
        this.f44092a = new AtomicInteger();
        this.f44093b = new HashSet();
        this.f44094c = new PriorityBlockingQueue<>();
        this.f44095d = new PriorityBlockingQueue<>();
        this.f44101j = new ArrayList();
        this.f44096e = yiVar;
        this.f44097f = bmz;
        this.f44099h = new bnz[4];
        this.f44098g = bVar;
    }

    private bvx(C16399yi yiVar, bmz bmz, int i) {
        this(yiVar, bmz, 4, new biw(new Handler(Looper.getMainLooper())));
    }

    public bvx(C16399yi yiVar, bmz bmz) {
        this(yiVar, bmz, 4);
    }

    /* renamed from: a */
    public final void mo30792a() {
        bnz[] bnzArr;
        if (this.f44100i != null) {
            this.f44100i.mo30070a();
        }
        for (bnz bnz : this.f44099h) {
            if (bnz != null) {
                bnz.f43167a = true;
                bnz.interrupt();
            }
        }
        this.f44100i = new beb(this.f44094c, this.f44095d, this.f44096e, this.f44098g);
        this.f44100i.start();
        for (int i = 0; i < this.f44099h.length; i++) {
            bnz bnz2 = new bnz(this.f44095d, this.f44097f, this.f44096e, this.f44098g);
            this.f44099h[i] = bnz2;
            bnz2.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final <T> void mo30793b(brw<T> brw) {
        synchronized (this.f44093b) {
            this.f44093b.remove(brw);
        }
        synchronized (this.f44101j) {
            Iterator it = this.f44101j.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final <T> brw<T> mo30791a(brw<T> brw) {
        brw.f43731g = this;
        synchronized (this.f44093b) {
            this.f44093b.add(brw);
        }
        brw.f43730f = Integer.valueOf(this.f44092a.incrementAndGet());
        brw.mo30630b("add-to-queue");
        if (!brw.f43732h) {
            this.f44095d.add(brw);
            return brw;
        }
        this.f44094c.add(brw);
        return brw;
    }
}
