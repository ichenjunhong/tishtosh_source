package com.bytedance.frameworks.apm.trace;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.apm.p476c.C8981d;
import com.bytedance.apm.p476c.p477a.C8978a;

public class MethodCollector {

    /* renamed from: a */
    public static MethodCollector f26600a = new MethodCollector();

    /* renamed from: b */
    public static volatile int f26601b;

    /* renamed from: c */
    public static Object f26602c = new Object();

    /* renamed from: d */
    public static long[] f26603d = new long[600000];

    /* renamed from: e */
    public static int f26604e = 0;

    /* renamed from: f */
    public static volatile long f26605f;

    /* renamed from: g */
    public static volatile long f26606g;

    /* renamed from: h */
    public static volatile Runnable f26607h = null;

    /* renamed from: i */
    public static HandlerThread f26608i;

    /* renamed from: j */
    public static Handler f26609j = new Handler(f26608i.getLooper());

    /* renamed from: k */
    public static Object f26610k = new Object();

    /* renamed from: l */
    public static boolean f26611l = false;

    /* renamed from: m */
    public static Runnable f26612m = null;

    /* renamed from: n */
    public static C8978a f26613n = new C8978a() {
        /* renamed from: f */
        public final void mo16267f() {
            super.mo16267f();
            MethodCollector.f26611l = true;
        }

        /* renamed from: c */
        public final boolean mo16265c() {
            if (MethodCollector.f26607h != null) {
                MethodCollector.f26607h.run();
                MethodCollector.f26607h = null;
            }
            if (MethodCollector.f26601b > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo16266d() {
            super.mo16266d();
            MethodCollector.f26605f = SystemClock.uptimeMillis() - MethodCollector.f26606g;
            MethodCollector.f26611l = false;
            synchronized (MethodCollector.f26610k) {
                MethodCollector.f26610k.notify();
            }
        }
    };

    /* renamed from: o */
    public static C9781a f26614o = null;

    /* renamed from: p */
    private static int f26615p = -1;

    /* renamed from: q */
    private static boolean f26616q = false;

    /* renamed from: r */
    private static Thread f26617r = Looper.getMainLooper().getThread();

    /* renamed from: s */
    private static Runnable f26618s = new Runnable() {
        public final void run() {
            while (true) {
                try {
                    if (MethodCollector.f26611l || MethodCollector.f26601b < 0) {
                        synchronized (MethodCollector.f26610k) {
                            MethodCollector.f26610k.wait();
                        }
                    } else {
                        MethodCollector.f26605f = SystemClock.uptimeMillis() - MethodCollector.f26606g;
                        SystemClock.sleep(5);
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    };

    /* renamed from: com.bytedance.frameworks.apm.trace.MethodCollector$a */
    public static final class C9781a {

        /* renamed from: a */
        public int f26619a;

        /* renamed from: b */
        public C9781a f26620b;

        /* renamed from: c */
        public boolean f26621c;

        /* renamed from: d */
        public String f26622d;

        public C9781a() {
            this.f26621c = true;
            this.f26621c = false;
        }

        /* renamed from: a */
        public final void mo17622a() {
            this.f26621c = false;
            C9781a aVar = null;
            for (C9781a aVar2 = MethodCollector.f26614o; aVar2 != null; aVar2 = aVar2.f26620b) {
                if (aVar2 == this) {
                    if (aVar != null) {
                        aVar.f26620b = aVar2.f26620b;
                    } else {
                        MethodCollector.f26614o = aVar2.f26620b;
                    }
                    aVar2.f26620b = null;
                    return;
                }
                aVar = aVar2;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("index:");
            sb.append(this.f26619a);
            sb.append(",\tisValid:");
            sb.append(this.f26621c);
            sb.append(" source:");
            sb.append(this.f26622d);
            return sb.toString();
        }

        public C9781a(int i) {
            this.f26621c = true;
            this.f26619a = i;
        }
    }

    static {
        f26601b = Integer.MAX_VALUE;
        long uptimeMillis = SystemClock.uptimeMillis();
        f26605f = uptimeMillis;
        f26606g = uptimeMillis;
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        f26608i = handlerThread;
        if (VERSION.SDK_INT < 24) {
            f26601b = -4;
        }
        f26609j.postDelayed(new Runnable() {
            public final void run() {
                synchronized (MethodCollector.f26602c) {
                    if (MethodCollector.f26601b == Integer.MAX_VALUE || MethodCollector.f26601b == -4) {
                        MethodCollector.f26601b = -3;
                        MethodCollector.f26607h = new Runnable() {
                            public final void run() {
                                MethodCollector.f26609j.removeCallbacksAndMessages(null);
                                C8981d.m17780b(MethodCollector.f26613n);
                                MethodCollector.f26608i.quit();
                                MethodCollector.f26603d = null;
                            }
                        };
                    }
                }
            }
        }, 15000);
    }

    /* renamed from: a */
    private static void m19561a(int i) {
        C9781a aVar = f26614o;
        while (aVar != null) {
            if (aVar.f26619a == i || (aVar.f26619a == -1 && f26615p == 599999)) {
                aVar.f26621c = false;
                aVar = aVar.f26620b;
                f26614o = aVar;
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m19565o(int i) {
        if (f26601b >= 0 && i < 1048575 && Thread.currentThread().getId() == f26617r.getId()) {
            if (f26604e < 600000) {
                m19562a(i, f26604e, false);
            } else if (f26604e == 600000) {
                f26604e = 0;
                m19562a(i, f26604e, false);
            } else {
                f26604e = -1;
            }
            f26604e++;
        }
    }

    /* renamed from: i */
    public static void m19564i(int i) {
        if (f26601b >= 0 && i < 1048575) {
            if (f26601b == Integer.MAX_VALUE) {
                synchronized (f26602c) {
                    if (f26601b == Integer.MAX_VALUE) {
                        f26605f = SystemClock.uptimeMillis() - f26606g;
                        f26609j.removeCallbacksAndMessages(null);
                        f26609j.postDelayed(f26618s, 5);
                        Handler handler = f26609j;
                        C97805 r3 = new Runnable() {
                            public final void run() {
                                synchronized (MethodCollector.f26602c) {
                                    if (MethodCollector.f26601b == Integer.MAX_VALUE || MethodCollector.f26601b == 1) {
                                        MethodCollector.f26601b = -2;
                                    }
                                }
                            }
                        };
                        f26612m = r3;
                        handler.postDelayed(r3, 15000);
                        C8981d.m17778a(f26613n);
                        f26601b = 1;
                    }
                }
            }
            if (Thread.currentThread().getId() == f26617r.getId() && !f26616q) {
                f26616q = true;
                if (f26604e < 600000) {
                    m19562a(i, f26604e, true);
                } else if (f26604e == 600000) {
                    f26604e = 0;
                    m19562a(i, f26604e, true);
                } else {
                    f26604e = -1;
                }
                f26604e++;
                f26616q = false;
            }
        }
    }

    /* renamed from: a */
    public static long[] m19563a(C9781a aVar, C9781a aVar2) {
        long[] jArr;
        if (f26601b == -3) {
            return null;
        }
        long[] jArr2 = new long[0];
        try {
            if (!aVar.f26621c || !aVar2.f26621c) {
                return jArr2;
            }
            int max = Math.max(0, aVar.f26619a);
            int max2 = Math.max(0, aVar2.f26619a);
            if (max2 > max) {
                int i = (max2 - max) + 1;
                jArr = new long[i];
                try {
                    System.arraycopy(f26603d, max, jArr, 0, i);
                } catch (OutOfMemoryError unused) {
                }
            } else if (max2 < max) {
                int i2 = max2 + 1;
                jArr = new long[((f26603d.length - max) + i2)];
                System.arraycopy(f26603d, max, jArr, 0, f26603d.length - max);
                System.arraycopy(f26603d, 0, jArr, f26603d.length - max, i2);
            } else {
                jArr = jArr2;
            }
            return jArr;
        } catch (OutOfMemoryError unused2) {
            long[] jArr3 = jArr2;
            return jArr3;
        }
    }

    /* renamed from: a */
    private static void m19562a(int i, int i2, boolean z) {
        if (i == 1048574) {
            f26605f = SystemClock.uptimeMillis() - f26606g;
        }
        long j = 0;
        if (z) {
            j = Long.MIN_VALUE;
        }
        f26603d[i2] = j | (((long) i) << 43) | (f26605f & 8796093022207L);
        m19561a(i2);
        f26615p = i2;
    }
}
