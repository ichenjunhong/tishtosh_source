package com.p683ss.android.ugc.aweme.p1468bu;

import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bu.c */
final class C24061c implements Comparable, Runnable {

    /* renamed from: a */
    public Runnable f63862a;

    /* renamed from: b */
    public C24057a f63863b;

    /* renamed from: c */
    public long f63864c = SystemClock.uptimeMillis();

    /* renamed from: d */
    public Thread f63865d;

    public final int hashCode() {
        return this.f63862a.hashCode();
    }

    public final void run() {
        C24070g a;
        Object obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f63865d = Thread.currentThread();
            Object obj2 = null;
            if (C24094q.m58941b(this.f63862a) && (C24076h.m58901b().mo49824a() || C24076h.m58901b().mo49826b())) {
                obj2 = (Callable) C24094q.m58942c(this.f63862a);
            }
            a = C24070g.m58893a();
            if (C24076h.m58901b().mo49828c()) {
                a.f63891d.lock();
                a.f63890c.put(this, a.f63889b);
                a.f63891d.unlock();
            }
            long j = uptimeMillis - this.f63864c;
            if (j >= C24076h.m58897a().f63921d && C24076h.m58901b().mo49824a()) {
                C24070g a2 = C24070g.m58893a();
                if (obj2 != null) {
                    obj = obj2;
                } else {
                    obj = this.f63862a;
                }
                String name = this.f63863b.f63852a.name();
                int poolSize = this.f63863b.getPoolSize();
                int size = this.f63863b.getQueue().size();
                WeakReference weakReference = new WeakReference(obj);
                ExecutorService executorService = C24070g.f63888a;
                C240711 r6 = new Runnable(weakReference, name, poolSize, size, j) {

                    /* renamed from: a */
                    final /* synthetic */ WeakReference f63892a;

                    /* renamed from: b */
                    final /* synthetic */ String f63893b;

                    /* renamed from: c */
                    final /* synthetic */ int f63894c;

                    /* renamed from: d */
                    final /* synthetic */ int f63895d;

                    /* renamed from: e */
                    final /* synthetic */ long f63896e;

                    public final void run() {
                        JSONObject a = C24070g.m58894a(this.f63892a, this.f63893b, this.f63894c, this.f63895d, this.f63896e);
                        if (a != null) {
                            C24076h.m58901b().mo49823a(a);
                        }
                    }

                    {
                        this.f63892a = r2;
                        this.f63893b = r3;
                        this.f63894c = r4;
                        this.f63895d = r5;
                        this.f63896e = r6;
                    }
                };
                executorService.execute(r6);
            }
            this.f63862a.run();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= C24076h.m58897a().f63922e && C24076h.m58901b().mo49826b()) {
                C24070g a3 = C24070g.m58893a();
                if (obj2 == null) {
                    obj2 = this.f63862a;
                }
                String name2 = this.f63863b.f63852a.name();
                int poolSize2 = this.f63863b.getPoolSize();
                int size2 = this.f63863b.getQueue().size();
                WeakReference weakReference2 = new WeakReference(obj2);
                ExecutorService executorService2 = C24070g.f63888a;
                C240722 r62 = new Runnable(weakReference2, name2, poolSize2, size2, uptimeMillis2) {

                    /* renamed from: a */
                    final /* synthetic */ WeakReference f63898a;

                    /* renamed from: b */
                    final /* synthetic */ String f63899b;

                    /* renamed from: c */
                    final /* synthetic */ int f63900c;

                    /* renamed from: d */
                    final /* synthetic */ int f63901d;

                    /* renamed from: e */
                    final /* synthetic */ long f63902e;

                    public final void run() {
                        JSONObject a = C24070g.m58894a(this.f63898a, this.f63899b, this.f63900c, this.f63901d, this.f63902e);
                        if (a != null) {
                            C24076h.m58901b().mo49825b(a);
                        }
                    }

                    {
                        this.f63898a = r2;
                        this.f63899b = r3;
                        this.f63900c = r4;
                        this.f63901d = r5;
                        this.f63902e = r6;
                    }
                };
                executorService2.execute(r62);
            }
            C24070g.m58893a().mo49837a(this);
        } catch (Throwable th) {
            C24070g.m58893a().mo49837a(this);
            throw th;
        }
    }

    public final int compareTo(Object obj) {
        if (!(this.f63862a instanceof Comparable) || !(obj instanceof C24061c)) {
            return 0;
        }
        return ((Comparable) this.f63862a).compareTo(((C24061c) obj).f63862a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24061c) || !this.f63862a.equals(((C24061c) obj).f63862a)) {
            return false;
        }
        return true;
    }

    C24061c(Runnable runnable, C24057a aVar) {
        this.f63862a = runnable;
        this.f63863b = aVar;
    }
}
