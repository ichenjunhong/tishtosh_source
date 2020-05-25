package com.facebook.imagepipeline.p974n;

import com.facebook.common.p920d.C13689i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.ay */
public final class C14163ay {

    /* renamed from: a */
    private boolean f36979a;

    /* renamed from: b */
    private final Deque<Runnable> f36980b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f36981c;

    /* renamed from: c */
    public final synchronized boolean mo26399c() {
        return this.f36979a;
    }

    /* renamed from: a */
    public final synchronized void mo26395a() {
        this.f36979a = true;
    }

    /* renamed from: b */
    public final synchronized void mo26397b() {
        this.f36979a = false;
        while (!this.f36980b.isEmpty()) {
            this.f36981c.execute((Runnable) this.f36980b.pop());
        }
        this.f36980b.clear();
    }

    /* renamed from: b */
    public final synchronized void mo26398b(Runnable runnable) {
        this.f36980b.remove(runnable);
    }

    public C14163ay(Executor executor) {
        this.f36981c = (Executor) C13689i.m27652a(executor);
    }

    /* renamed from: a */
    public final synchronized void mo26396a(Runnable runnable) {
        if (this.f36979a) {
            this.f36980b.add(runnable);
        } else {
            this.f36981c.execute(runnable);
        }
    }
}
