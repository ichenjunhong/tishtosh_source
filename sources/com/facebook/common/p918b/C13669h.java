package com.facebook.common.p918b;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.h */
public abstract class C13669h<T> implements Runnable {

    /* renamed from: a */
    protected final AtomicInteger f35655a = new AtomicInteger(0);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25571a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25572a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25573b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25574b(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo25575c() throws Exception;

    /* renamed from: a */
    public final void mo25570a() {
        if (this.f35655a.compareAndSet(0, 2)) {
            mo25573b();
        }
    }

    public final void run() {
        if (this.f35655a.compareAndSet(0, 1)) {
            try {
                Object c = mo25575c();
                this.f35655a.set(3);
                try {
                    mo25572a((T) c);
                } finally {
                    mo25574b(c);
                }
            } catch (Exception e) {
                this.f35655a.set(4);
                mo25571a(e);
            }
        }
    }
}
