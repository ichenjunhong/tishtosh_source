package com.bytedance.geckox.p610h;

import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.geckox.h.b */
public final class C10113b {

    /* renamed from: a */
    private static final Map<String, Lock> f27408a = new HashMap();

    /* renamed from: b */
    private static ReentrantLock f27409b = new ReentrantLock();

    /* renamed from: c */
    private String f27410c;

    /* renamed from: d */
    private FileLock f27411d;

    /* renamed from: a */
    public final void mo18091a() {
        try {
            this.f27411d.mo18151a();
            this.f27411d.mo18152b();
            Lock lock = (Lock) f27408a.get(this.f27410c);
            if (lock != null) {
                lock.unlock();
                f27409b.unlock();
            }
        } finally {
            f27409b.unlock();
        }
    }

    /* renamed from: a */
    public static C10113b m20384a(String str) throws Exception {
        f27409b.lock();
        try {
            FileLock a = FileLock.m20466a(str);
            Lock lock = (Lock) f27408a.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                f27408a.put(str, lock);
            }
            lock.lock();
            return new C10113b(str, a);
        } catch (Exception e) {
            f27409b.unlock();
            throw e;
        }
    }

    private C10113b(String str, FileLock fileLock) {
        this.f27410c = str;
        this.f27411d = fileLock;
    }
}
