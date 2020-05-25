package com.facebook.internal;

import com.facebook.C14533n;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.s */
public final class C14347s<T> {

    /* renamed from: a */
    public T f37327a;

    /* renamed from: b */
    public CountDownLatch f37328b = new CountDownLatch(1);

    public C14347s(final Callable<T> callable) {
        C14533n.m29771e().execute(new FutureTask(new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                try {
                    C14347s.this.f37327a = callable.call();
                    C14347s.this.f37328b.countDown();
                    return null;
                } catch (Throwable th) {
                    C14347s.this.f37328b.countDown();
                    throw th;
                }
            }
        }));
    }
}
