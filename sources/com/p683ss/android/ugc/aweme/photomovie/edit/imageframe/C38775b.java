package com.p683ss.android.ugc.aweme.photomovie.edit.imageframe;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.b */
public final class C38775b extends HandlerThread {

    /* renamed from: a */
    public final List<C38777a> f98666a;

    /* renamed from: b */
    public final ReadWriteLock f98667b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public final Handler f98668c;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.b$a */
    interface C38777a {
        /* renamed from: a */
        void mo78737a(Message message);
    }

    C38775b() {
        super("WorkerThread", 10);
        start();
        this.f98666a = new ArrayList(1);
        this.f98668c = new Handler(getLooper()) {
            public final void handleMessage(Message message) {
                C38775b.this.f98667b.readLock().lock();
                try {
                    for (C38777a a : C38775b.this.f98666a) {
                        a.mo78737a(message);
                    }
                } finally {
                    C38775b.this.f98667b.readLock().unlock();
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo78739a(C38777a aVar) {
        this.f98667b.writeLock().lock();
        try {
            this.f98666a.remove(aVar);
        } finally {
            this.f98667b.writeLock().unlock();
        }
    }
}
