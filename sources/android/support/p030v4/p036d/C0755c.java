package android.support.p030v4.p036d;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: android.support.v4.d.c */
public final class C0755c {

    /* renamed from: a */
    final Object f2598a = new Object();

    /* renamed from: b */
    HandlerThread f2599b;

    /* renamed from: c */
    Handler f2600c;

    /* renamed from: d */
    final int f2601d;

    /* renamed from: e */
    private int f2602e;

    /* renamed from: f */
    private Callback f2603f = new Callback() {
        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0755c cVar = C0755c.this;
                    synchronized (cVar.f2598a) {
                        if (!cVar.f2600c.hasMessages(1)) {
                            cVar.f2599b.quit();
                            cVar.f2599b = null;
                            cVar.f2600c = null;
                        }
                    }
                    return true;
                case 1:
                    C0755c cVar2 = C0755c.this;
                    ((Runnable) message.obj).run();
                    synchronized (cVar2.f2598a) {
                        cVar2.f2600c.removeMessages(0);
                        cVar2.f2600c.sendMessageDelayed(cVar2.f2600c.obtainMessage(0), (long) cVar2.f2601d);
                    }
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: g */
    private final int f2604g;

    /* renamed from: h */
    private final String f2605h;

    /* renamed from: android.support.v4.d.c$a */
    public interface C0760a<T> {
        /* renamed from: a */
        void mo2418a(T t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2421a(Runnable runnable) {
        synchronized (this.f2598a) {
            if (this.f2599b == null) {
                this.f2599b = new HandlerThread(this.f2605h, this.f2604g);
                this.f2599b.start();
                this.f2600c = new Handler(this.f2599b.getLooper(), this.f2603f);
                this.f2602e++;
            }
            this.f2600c.removeMessages(0);
            this.f2600c.sendMessage(this.f2600c.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(4:26|15|16|17)(1:18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo2420a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            android.support.v4.d.c$3 r11 = new android.support.v4.d.c$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.mo2421a(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005d }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005d }
            long r0 = (long) r14     // Catch:{ all -> 0x005d }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005d }
        L_0x003b:
            long r0 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x0040 }
            r13 = r0
        L_0x0040:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x004e:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0055
            goto L_0x003b
        L_0x0055:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005d }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005d }
            throw r13     // Catch:{ all -> 0x005d }
        L_0x005d:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p036d.C0755c.mo2420a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    public C0755c(String str, int i, int i2) {
        this.f2605h = str;
        this.f2604g = 10;
        this.f2601d = 10000;
        this.f2602e = 0;
    }
}
