package com.bytedance.crash.p551k;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Printer;
import android.util.SparseArray;
import com.bytedance.crash.p540b.C9558d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.k.e */
public class C9647e implements Callback {

    /* renamed from: a */
    public static Printer f26326a;

    /* renamed from: g */
    public static final Printer f26327g = new Printer() {
        public final void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C9647e a = C9647e.m19238a();
                    C9558d.m18965a(false);
                    a.f26330c = SystemClock.uptimeMillis();
                    a.f26331d = -1;
                    try {
                        a.mo17496a(a.f26332e, str);
                        a.f26329b.sendEmptyMessage(0);
                    } catch (Exception unused) {
                    }
                } else if (str.charAt(0) == '<') {
                    C9647e a2 = C9647e.m19238a();
                    a2.f26331d = SystemClock.uptimeMillis();
                    a2.f26329b.removeMessages(2);
                    a2.mo17496a(a2.f26333f, str);
                    a2.f26329b.sendEmptyMessage(1);
                }
                if (!(C9647e.f26326a == null || C9647e.f26326a == C9647e.f26327g)) {
                    C9647e.f26326a.println(str);
                }
            }
        }
    };

    /* renamed from: i */
    private static C9647e f26328i;

    /* renamed from: b */
    Handler f26329b = new Handler(C9649f.m19246a().getLooper(), this);

    /* renamed from: c */
    long f26330c = -1;

    /* renamed from: d */
    long f26331d = -1;

    /* renamed from: e */
    final List<Printer> f26332e = new ArrayList();

    /* renamed from: f */
    public final List<Printer> f26333f = new ArrayList();

    /* renamed from: h */
    public boolean f26334h = false;

    /* renamed from: j */
    private int f26335j;

    /* renamed from: k */
    private final SparseArray<List<Runnable>> f26336k = new SparseArray<>();

    /* renamed from: a */
    public static C9647e m19238a() {
        if (f26328i == null) {
            synchronized (C9647e.class) {
                if (f26328i == null) {
                    f26328i = new C9647e();
                }
            }
        }
        return f26328i;
    }

    /* renamed from: d */
    private static Printer m19240d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo17497b() {
        if (!this.f26334h) {
            this.f26334h = true;
            Printer d = m19240d();
            f26326a = d;
            if (d == f26327g) {
                f26326a = null;
            }
            Looper.getMainLooper().setMessageLogging(f26327g);
        }
    }

    /* renamed from: c */
    public final boolean mo17498c() {
        if (this.f26331d == -1 || SystemClock.uptimeMillis() - this.f26331d <= 5000) {
            return false;
        }
        return true;
    }

    private C9647e() {
        mo17497b();
    }

    /* renamed from: a */
    public final synchronized void mo17495a(Printer printer) {
        this.f26332e.add(printer);
    }

    /* renamed from: a */
    private static void m19239a(List<? extends Runnable> list) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) list.get(i)).run();
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean handleMessage(Message message) {
        try {
            if (this.f26329b.hasMessages(0)) {
                return true;
            }
            switch (message.what) {
                case 0:
                    this.f26335j = 0;
                    if (this.f26336k.size() != 0 && this.f26336k.keyAt(0) == 0) {
                        m19239a((List) this.f26336k.valueAt(0));
                        this.f26335j++;
                        break;
                    }
                case 1:
                    this.f26329b.removeMessages(2);
                    if (this.f26336k.size() != 0 && this.f26336k.keyAt(this.f26336k.size() - 1) == 0) {
                        m19239a((List) this.f26336k.get(Integer.MAX_VALUE));
                    }
                    return true;
                case 2:
                    m19239a((List) this.f26336k.valueAt(this.f26335j));
                    this.f26335j++;
                    break;
            }
            if (this.f26335j >= this.f26336k.size()) {
                return true;
            }
            long keyAt = (long) this.f26336k.keyAt(this.f26335j);
            if (keyAt != 2147483647L) {
                this.f26329b.sendEmptyMessageAtTime(2, this.f26330c + keyAt);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17496a(java.util.List<? extends android.util.Printer> r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0024
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0024
        L_0x000a:
            int r0 = r4.size()     // Catch:{ Exception -> 0x001f }
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x001d
            java.lang.Object r2 = r4.get(r1)     // Catch:{ Exception -> 0x001f }
            android.util.Printer r2 = (android.util.Printer) r2     // Catch:{ Exception -> 0x001f }
            r2.println(r5)     // Catch:{ Exception -> 0x001f }
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001d:
            monitor-exit(r3)
            return
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0024:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p551k.C9647e.mo17496a(java.util.List, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo17494a(long j, Runnable runnable, int i, long j2) {
        if (j >= 0) {
            for (int i2 = 0; i2 <= 0; i2++) {
                int i3 = (int) j;
                List list = (List) this.f26336k.get(i3);
                if (list == null) {
                    synchronized (this.f26336k) {
                        list = (List) this.f26336k.get(i3);
                        if (list == null) {
                            list = new ArrayList();
                            this.f26336k.put(i3, list);
                        }
                    }
                }
                list.add(runnable);
            }
        }
    }
}
