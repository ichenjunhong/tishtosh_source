package com.p683ss.android.ugc.p2454f;

import android.os.SystemClock;
import com.p683ss.android.ugc.p2454f.C48913c.C48915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.f.e */
public class C48918e {

    /* renamed from: c */
    public static int f123069c = 10;

    /* renamed from: h */
    private static final Lock f123070h = new ReentrantLock();

    /* renamed from: j */
    private static volatile C48918e f123071j;

    /* renamed from: a */
    public double f123072a = -1.0d;

    /* renamed from: b */
    public C48920f f123073b;

    /* renamed from: d */
    public C48919a f123074d = this.f123079k;

    /* renamed from: e */
    private double f123075e = -1.0d;

    /* renamed from: f */
    private Queue<C48920f> f123076f = new ArrayBlockingQueue(f123069c);

    /* renamed from: g */
    private C48920f[] f123077g = new C48920f[f123069c];

    /* renamed from: i */
    private final List<Object> f123078i = new ArrayList();

    /* renamed from: k */
    private C48919a f123079k = new C48912b();

    /* renamed from: com.ss.android.ugc.f.e$a */
    public interface C48919a {
        /* renamed from: a */
        double mo77253a(Queue<C48920f> queue, C48920f[] fVarArr);

        /* renamed from: b */
        double mo77254b(Queue<C48920f> queue, C48920f[] fVarArr) throws C48915b;
    }

    /* renamed from: a */
    public static C48918e m105713a() {
        if (f123071j == null) {
            synchronized (C48918e.class) {
                if (f123071j == null) {
                    f123071j = new C48918e();
                }
            }
        }
        return f123071j;
    }

    /* renamed from: f */
    public static int m105714f() {
        double b = m105713a().mo96744b();
        if (b == -1.0d) {
            return -1;
        }
        return (int) ((b / 8.0d) / 1000.0d);
    }

    /* renamed from: e */
    public final void mo96747e() {
        this.f123075e = -1.0d;
        synchronized (this.f123078i) {
            Iterator it = this.f123078i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        f123070h.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r2 = -1.0d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012 A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo96745c() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r0 = f123070h
            r0.lock()
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.ss.android.ugc.f.e$a r2 = r5.f123074d     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            java.util.Queue<com.ss.android.ugc.f.f> r3 = r5.f123076f     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            com.ss.android.ugc.f.f[] r4 = r5.f123077g     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            double r2 = r2.mo77254b(r3, r4)     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            goto L_0x002b
        L_0x0014:
            r2 = r0
        L_0x0015:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0031
            com.ss.android.ugc.f.e$a r0 = r5.f123079k     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            com.ss.android.ugc.f.e$a r1 = r5.f123074d     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            if (r0 == r1) goto L_0x0031
            com.ss.android.ugc.f.e$a r0 = r5.f123079k     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            java.util.Queue<com.ss.android.ugc.f.f> r1 = r5.f123076f     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            com.ss.android.ugc.f.f[] r4 = r5.f123077g     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            double r0 = r0.mo77254b(r1, r4)     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            r2 = r0
            goto L_0x0031
        L_0x002b:
            java.util.concurrent.locks.Lock r1 = f123070h
            r1.unlock()
            throw r0
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = f123070h
            r0.unlock()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p2454f.C48918e.mo96745c():double");
    }

    /* renamed from: b */
    public final double mo96744b() {
        double d = this.f123075e;
        if (this.f123075e == -1.0d) {
            f123070h.lock();
            try {
                if (this.f123075e == -1.0d) {
                    d = this.f123074d.mo77253a(this.f123076f, this.f123077g);
                    if (d == -1.0d && this.f123079k != this.f123074d) {
                        d = this.f123079k.mo77253a(this.f123076f, this.f123077g);
                    }
                    this.f123075e = d;
                } else {
                    d = this.f123075e;
                }
            } finally {
                f123070h.unlock();
            }
        }
        if (d > 0.001d || this.f123072a <= 0.001d) {
            return d;
        }
        return this.f123072a;
    }

    /* renamed from: d */
    public final C48920f[] mo96746d() {
        f123070h.lock();
        try {
            if (this.f123076f != null) {
                C48920f[] fVarArr = new C48920f[this.f123076f.size()];
                int i = 0;
                for (C48920f fVar : this.f123076f) {
                    int i2 = i + 1;
                    C48920f fVar2 = new C48920f(fVar.f123081b, fVar.f123082c, fVar.f123083d, fVar.f123084e);
                    fVarArr[i] = fVar2;
                    i = i2;
                }
                return fVarArr;
            }
            f123070h.unlock();
            return null;
        } finally {
            f123070h.unlock();
        }
    }

    /* renamed from: a */
    public final void mo96743a(int i) {
        if (i > 0 && i != this.f123076f.size()) {
            f123070h.lock();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
                arrayBlockingQueue.addAll(this.f123076f);
                this.f123077g = new C48920f[i];
                this.f123076f = arrayBlockingQueue;
            } catch (Exception unused) {
            } catch (Throwable th) {
                f123070h.unlock();
                throw th;
            }
            f123070h.unlock();
        }
    }

    /* renamed from: a */
    public final void mo96742a(double d, double d2, long j) {
        C48920f fVar;
        f123070h.lock();
        try {
            if (this.f123073b != null) {
                fVar = this.f123073b;
                fVar.f123081b = d;
                fVar.f123082c = d2;
                fVar.f123083d = j;
                fVar.f123084e = SystemClock.elapsedRealtime();
            } else {
                double d3 = d;
                double d4 = d2;
                long j2 = j;
                fVar = new C48920f(d, d2, j, SystemClock.elapsedRealtime());
            }
            if (!this.f123076f.offer(fVar)) {
                this.f123073b = (C48920f) this.f123076f.poll();
                this.f123076f.offer(fVar);
            }
        } finally {
            mo96747e();
            f123070h.unlock();
        }
    }
}
