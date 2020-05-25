package com.bytedance.geckox.p610h;

import com.bytedance.geckox.utils.C10153c;
import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.geckox.h.a */
public final class C10112a {

    /* renamed from: a */
    private static final Map<String, Lock> f27405a = new HashMap();

    /* renamed from: b */
    private FileLock f27406b;

    /* renamed from: c */
    private String f27407c;

    /* renamed from: a */
    public final void mo18090a() {
        synchronized (f27405a) {
            try {
                this.f27406b.mo18151a();
                this.f27406b.mo18152b();
                ((Lock) f27405a.get(this.f27407c)).unlock();
            } catch (Throwable th) {
                ((Lock) f27405a.get(this.f27407c)).unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C10112a m20382a(String str) throws Exception {
        synchronized (f27405a) {
            Lock lock = (Lock) f27405a.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f27405a.put(str, lock);
            }
            if (!lock.tryLock()) {
                return null;
            }
            try {
                FileLock c = FileLock.m20469c(str);
                if (c == null) {
                    lock.unlock();
                    return null;
                }
                C10112a aVar = new C10112a(str, c);
                return aVar;
            } catch (Exception e) {
                lock.lock();
                C10153c.m20478a(new RuntimeException(e));
                return null;
            }
        }
    }

    private C10112a(String str, FileLock fileLock) {
        this.f27407c = str;
        this.f27406b = fileLock;
    }
}
