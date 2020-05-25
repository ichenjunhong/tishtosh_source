package com.bytedance.ies.p661d.p662a.p663a;

import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.ies.p661d.p662a.C10627a;
import com.bytedance.ies.p661d.p662a.C10627a.C10628a;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.bytedance.ies.d.a.a.c */
public final class C10631c {

    /* renamed from: a */
    private volatile boolean f28166a;

    /* renamed from: b */
    private final PriorityBlockingQueue<C10627a> f28167b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C10627a> f28168c;

    /* renamed from: d */
    private C10629a[] f28169d;

    /* renamed from: e */
    private C10630b f28170e;

    public C10631c() {
        this(4);
    }

    /* renamed from: b */
    private synchronized void m21413b() {
        this.f28166a = false;
        if (this.f28170e != null) {
            C10630b bVar = this.f28170e;
            bVar.f28163a = true;
            bVar.interrupt();
        }
        for (int i = 0; i < this.f28169d.length; i++) {
            if (this.f28169d[i] != null) {
                C10629a aVar = this.f28169d[i];
                aVar.f28161b = true;
                aVar.interrupt();
                this.f28169d[i] = null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo18872a() {
        m21413b();
        this.f28170e = new C10630b(this.f28167b, this.f28168c);
        this.f28170e.start();
        for (int i = 0; i < this.f28169d.length; i++) {
            C10629a aVar = new C10629a(this.f28168c);
            this.f28169d[i] = aVar;
            aVar.start();
        }
        this.f28166a = true;
    }

    private C10631c(int i) {
        this.f28167b = new PriorityBlockingQueue<>();
        this.f28168c = new PriorityBlockingQueue<>();
        this.f28169d = new C10629a[4];
    }

    /* renamed from: a */
    public final synchronized void mo18873a(C10627a aVar) {
        if (aVar.needTryLocal()) {
            this.f28167b.add(aVar);
        } else if (aVar.mPriority == C10628a.IMMEDIATE) {
            C9393e.submitRunnable(aVar);
        } else {
            this.f28168c.add(aVar);
        }
        boolean z = this.f28166a;
    }
}
