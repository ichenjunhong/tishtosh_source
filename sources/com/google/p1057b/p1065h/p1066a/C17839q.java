package com.google.p1057b.p1065h.p1066a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.b.h.a.q */
public final class C17839q {
    /* renamed from: a */
    public static <V> V m43748a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
