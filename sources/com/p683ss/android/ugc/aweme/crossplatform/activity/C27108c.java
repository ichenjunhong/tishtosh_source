package com.p683ss.android.ugc.aweme.crossplatform.activity;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.c */
public final class C27108c {

    /* renamed from: a */
    public static final C27108c f71516a = new C27108c();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f71517b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final LinkedList<C27112g> f71518c = new LinkedList<>();

    private C27108c() {
    }

    /* renamed from: a */
    public static final LinkedList<C27112g> m65414a() {
        return f71518c;
    }

    /* renamed from: b */
    public static final void m65416b() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = f71517b;
        ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            readLock.unlock();
        }
        WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            f71518c.clear();
            writeLock.unlock();
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    /* renamed from: a */
    public static final void m65415a(C27112g gVar) {
        int i;
        if (gVar != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f71517b;
            ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                f71518c.add(gVar);
                while (f71518c.size() > 10) {
                    f71518c.removeFirst();
                }
                writeLock.unlock();
            } finally {
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        }
    }
}
