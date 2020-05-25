package android.support.p030v4.p040os;

import android.os.Build.VERSION;
import android.os.CancellationSignal;

/* renamed from: android.support.v4.os.a */
public final class C0958a {

    /* renamed from: a */
    private boolean f3112a;

    /* renamed from: b */
    private C0959a f3113b;

    /* renamed from: c */
    private Object f3114c;

    /* renamed from: d */
    private boolean f3115d;

    /* renamed from: android.support.v4.os.a$a */
    public interface C0959a {
        /* renamed from: a */
        void mo2943a();
    }

    /* renamed from: a */
    public final boolean mo2940a() {
        boolean z;
        synchronized (this) {
            z = this.f3112a;
        }
        return z;
    }

    /* renamed from: c */
    public final Object mo2942c() {
        Object obj;
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f3114c == null) {
                this.f3114c = new CancellationSignal();
                if (this.f3112a) {
                    ((CancellationSignal) this.f3114c).cancel();
                }
            }
            obj = this.f3114c;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo2943a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f3115d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f3115d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2941b() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f3112a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f3112a = r0     // Catch:{ all -> 0x003e }
            r4.f3115d = r0     // Catch:{ all -> 0x003e }
            android.support.v4.os.a$a r0 = r4.f3113b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f3114c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo2943a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f3115d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f3115d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p040os.C0958a.mo2941b():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:24:0x0001, LOOP_START, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2939a(android.support.p030v4.p040os.C0958a.C0959a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.f3115d     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            android.support.v4.os.a$a r0 = r1.f3113b     // Catch:{ all -> 0x001f }
            if (r0 != r2) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return
        L_0x000f:
            r1.f3113b = r2     // Catch:{ all -> 0x001f }
            boolean r0 = r1.f3112a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001d
            if (r2 != 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            r2.mo2943a()
            return
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p040os.C0958a.mo2939a(android.support.v4.os.a$a):void");
    }
}
