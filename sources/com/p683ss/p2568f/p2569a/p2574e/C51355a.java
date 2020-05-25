package com.p683ss.p2568f.p2569a.p2574e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.p683ss.p2568f.p2569a.p2570a.C51301a;
import com.p683ss.p2568f.p2569a.p2570a.C51302b;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.f.a.e.a */
public final class C51355a {

    /* renamed from: f */
    private static final SparseIntArray f128432f = new SparseIntArray();

    /* renamed from: g */
    private static final SparseArray<String> f128433g = new SparseArray<>();

    /* renamed from: h */
    private static final SparseArray<String> f128434h = new SparseArray<>();

    /* renamed from: i */
    private static final SparseArray<String> f128435i = new SparseArray<>();

    /* renamed from: a */
    public final C51357a f128436a;

    /* renamed from: b */
    public final long f128437b;

    /* renamed from: c */
    public long f128438c;

    /* renamed from: d */
    public String f128439d = null;

    /* renamed from: e */
    public final Handler f128440e = new Handler(Looper.myLooper()) {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 10001:
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C51355a.this.f128438c < C51355a.this.f128437b) {
                        C51355a.this.f128436a.mo101933a(false);
                        C51355a.this.f128440e.sendEmptyMessageDelayed(10001, 10000);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("stallTime", Long.valueOf(currentTimeMillis - C51355a.this.f128438c));
                    C51355a.this.mo101937a(-1, new C51301a(-107, "Stall retry timeout", hashMap));
                    return;
                case 10002:
                    C51355a.this.mo101937a(2, null);
                    break;
            }
        }
    };

    /* renamed from: j */
    private long f128441j = 10000;

    /* renamed from: k */
    private AtomicInteger f128442k = new AtomicInteger(0);

    /* renamed from: l */
    private int f128443l = 7;

    /* renamed from: m */
    private boolean f128444m = false;

    /* renamed from: n */
    private long f128445n = 0;

    /* renamed from: o */
    private boolean f128446o = false;

    /* renamed from: p */
    private boolean f128447p = false;

    /* renamed from: q */
    private C51302b f128448q;

    /* renamed from: com.ss.f.a.e.a$a */
    public interface C51357a {
        /* renamed from: a */
        void mo101931a();

        /* renamed from: a */
        void mo101932a(C51301a aVar);

        /* renamed from: a */
        void mo101933a(boolean z);

        /* renamed from: b */
        void mo101934b();
    }

    /* renamed from: b */
    public final void mo101940b() {
        this.f128447p = true;
    }

    /* renamed from: c */
    public final void mo101941c() {
        this.f128447p = false;
    }

    /* renamed from: a */
    public final int mo101936a() {
        return this.f128442k.get();
    }

    /* renamed from: d */
    public final void mo101942d() {
        this.f128442k.set(0);
        this.f128438c = 0;
        this.f128443l = 7;
        this.f128444m = false;
        this.f128445n = 0;
        this.f128446o = false;
        this.f128440e.removeCallbacksAndMessages(null);
    }

    static {
        f128432f.put(-105, 0);
        f128432f.put(-100, 0);
        f128432f.put(-102, 3);
        f128432f.put(-106, 3);
        f128432f.put(-107, 3);
        f128432f.put(-104, 0);
        f128432f.put(-108, 3);
        f128432f.put(-109, 3);
        f128432f.put(-113, 3);
        f128432f.put(-114, 3);
        f128433g.put(-499988, "media player: setting uri is null error");
        f128433g.put(-499987, "media player: setting uri is error");
        f128433g.put(-499986, "media player: url is not mp4 error");
        f128433g.put(-499985, "media player: invalid data error");
        f128433g.put(-499899, "media player: http bad request error");
        f128433g.put(-499898, "media player: http unauthorized error");
        f128433g.put(-499897, "media player: http forbidden error");
        f128433g.put(-499896, "media player: http not found error");
        f128433g.put(-499894, "media player: http other 4xx error");
        f128433g.put(-499893, "media player: http server error");
        f128433g.put(-499891, "media player: http content type invalid");
        f128433g.put(251658241, "media info http redirect");
        f128433g.put(-499799, "media player: tcp failed to resolve hostname");
        f128433g.put(-499795, "media player: tcp send data failed");
        f128433g.put(-499794, "media player: tcp receive data failed");
        f128433g.put(-499793, "media player: tcp read network timeout");
        f128433g.put(-499792, "media player: tcp write network timeout");
        f128434h.put(-499999, "media player setting is null");
        f128434h.put(-499997, "media player start decoder error");
        f128434h.put(-499996, "media player open decoder error");
        f128434h.put(-499992, "media player open outlet error");
        f128434h.put(-499991, "media player start outputer error");
        f128434h.put(-499990, "media player start outlet error");
        f128434h.put(-499989, "media player open device error");
        f128434h.put(1, "android media player unknown");
        f128435i.put(-1, "not retry, report to application");
        f128435i.put(1, "try next url from live info");
        f128435i.put(2, "reset player");
        f128435i.put(0, "try to send live info api request again");
    }

    /* renamed from: b */
    private void m110456b(C51301a aVar) {
        int i = this.f128443l - 1;
        this.f128443l = i;
        if (i >= 0) {
            this.f128448q.mo101815a(aVar.code, aVar.getInfoJSON());
        }
    }

    /* renamed from: a */
    private void m110455a(int i) {
        if (!this.f128444m || (this.f128444m && System.currentTimeMillis() - this.f128445n >= 1000)) {
            this.f128448q.mo101825b(i);
            this.f128448q.mo101814a(i);
            this.f128444m = true;
            this.f128445n = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101938a(com.p683ss.p2568f.p2569a.p2570a.C51301a r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onError error="
            r0.<init>(r1)
            r0.append(r7)
            boolean r0 = r6.f128447p
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = r6.f128446o
            r1 = -116(0xffffffffffffff8c, float:NaN)
            if (r0 == 0) goto L_0x001a
            int r0 = r7.code
            if (r0 != r1) goto L_0x001a
            return
        L_0x001a:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f128442k
            r0.incrementAndGet()
            int r0 = r7.code
            r2 = 1
            if (r0 == r1) goto L_0x0026
            r6.f128446o = r2
        L_0x0026:
            java.util.Map r0 = r7.info
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f128442k
            int r1 = r1.get()
            r3 = 700(0x2bc, float:9.81E-43)
            r4 = 3
            if (r1 <= r3) goto L_0x0035
            r2 = -1
            goto L_0x0068
        L_0x0035:
            int r1 = r7.code
            r3 = -103(0xffffffffffffff99, float:NaN)
            if (r1 != r3) goto L_0x0067
            r1 = 0
            java.lang.String r3 = "internalCode"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x004b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ NumberFormatException -> 0x004b }
            int r3 = r3.intValue()     // Catch:{ NumberFormatException -> 0x004b }
            r7.code = r3     // Catch:{ NumberFormatException -> 0x004c }
            goto L_0x0053
        L_0x004b:
            r3 = 0
        L_0x004c:
            java.lang.String r1 = "retryError"
            java.lang.String r5 = "error while get player internal error code"
            r0.put(r1, r5)
        L_0x0053:
            android.util.SparseArray<java.lang.String> r1 = f128433g
            int r1 = r1.indexOfKey(r3)
            if (r1 < 0) goto L_0x0067
            java.lang.String r1 = "playErrorReason"
            android.util.SparseArray<java.lang.String> r5 = f128433g
            java.lang.Object r3 = r5.get(r3)
            r0.put(r1, r3)
            goto L_0x0068
        L_0x0067:
            r2 = 3
        L_0x0068:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f128442k
            int r0 = r0.get()
            if (r0 <= r4) goto L_0x007d
            java.lang.String r0 = r6.f128439d
            if (r0 == 0) goto L_0x007d
            com.ss.f.a.c.b r0 = com.p683ss.p2568f.p2569a.p2572c.C51320b.m110372a()
            java.lang.String r1 = r6.f128439d
            r0.mo101874b(r1)
        L_0x007d:
            r6.mo101937a(r2, r7)
            r6.m110456b(r7)
            int r7 = r7.code
            r6.m110455a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2568f.p2569a.p2574e.C51355a.mo101938a(com.ss.f.a.a.a):void");
    }

    /* renamed from: a */
    public final void mo101939a(boolean z) {
        new StringBuilder("onStall ").append(z);
        if (z) {
            this.f128438c = System.currentTimeMillis();
            if (!this.f128440e.hasMessages(10001)) {
                this.f128440e.sendEmptyMessageDelayed(10001, 10000);
            }
            m110455a(-115);
            return;
        }
        mo101942d();
    }

    /* renamed from: a */
    public final void mo101937a(int i, C51301a aVar) {
        long j;
        new StringBuilder("handleRetryForError action=").append(i);
        switch (i) {
            case -1:
                this.f128436a.mo101932a(aVar);
                return;
            case 0:
                this.f128436a.mo101931a();
                return;
            case 1:
                this.f128436a.mo101934b();
                return;
            case 2:
                this.f128436a.mo101933a(false);
                return;
            case 3:
                if (!this.f128440e.hasMessages(10002)) {
                    new StringBuilder("start ").append(this.f128442k);
                    Handler handler = this.f128440e;
                    if (this.f128442k.get() > 3) {
                        j = 10000;
                    } else {
                        j = (long) (this.f128442k.get() * this.f128442k.get() * 1000);
                    }
                    handler.sendEmptyMessageDelayed(10002, j);
                    break;
                }
                break;
        }
    }

    public C51355a(C51357a aVar, int i, long j, C51302b bVar) {
        this.f128436a = aVar;
        this.f128437b = (long) (i * 1000);
        this.f128441j = j;
        this.f128442k.set(0);
        this.f128448q = bVar;
    }
}
