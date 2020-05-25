package com.p888c.p889a.p890a.p891a.p900h.p901a;

import com.p888c.p889a.p890a.p891a.p900h.p901a.C13440b.C13441a;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.c.a.a.a.h.a.c */
public final class C13443c implements C13441a {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f35014a = new LinkedBlockingQueue();

    /* renamed from: b */
    private final ThreadPoolExecutor f35015b;

    /* renamed from: c */
    private final ArrayDeque<C13440b> f35016c = new ArrayDeque<>();

    /* renamed from: d */
    private C13440b f35017d = null;

    public C13443c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.f35014a);
        this.f35015b = threadPoolExecutor;
    }

    /* renamed from: a */
    private void m27108a() {
        this.f35017d = (C13440b) this.f35016c.poll();
        if (this.f35017d != null) {
            this.f35017d.mo25141a(this.f35015b);
        }
    }

    /* renamed from: a */
    public final void mo25143a(C13440b bVar) {
        this.f35017d = null;
        m27108a();
    }

    /* renamed from: b */
    public final void mo25146b(C13440b bVar) {
        bVar.f35012d = this;
        this.f35016c.add(bVar);
        if (this.f35017d == null) {
            m27108a();
        }
    }
}
