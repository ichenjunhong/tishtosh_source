package com.bytedance.p556d.p557a;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.d.a.a */
public final class C9729a {

    /* renamed from: a */
    private static volatile boolean f26480a = false;

    /* renamed from: b */
    private static volatile boolean f26481b = false;

    /* renamed from: c */
    private static volatile C9731c f26482c = null;

    /* renamed from: d */
    private static volatile String f26483d = "ttboringssl";

    /* renamed from: e */
    private static volatile String f26484e = "ttcrypto";

    /* renamed from: f */
    private static Lock f26485f = new ReentrantLock();

    /* renamed from: a */
    public static boolean m19499a() {
        try {
            f26485f.lock();
            if (f26482c != null) {
                boolean a = f26482c.mo17559a();
                f26485f.unlock();
                return a;
            }
            if (!f26481b) {
                C9730b.m19500a(f26484e);
                f26481b = true;
            }
            if (!f26480a) {
                C9730b.m19500a(f26483d);
                f26480a = true;
            }
            f26485f.unlock();
            if (!f26480a || !f26481b) {
                return false;
            }
            return true;
        } catch (Error unused) {
        } catch (Throwable th) {
            f26485f.unlock();
            throw th;
        }
    }
}
