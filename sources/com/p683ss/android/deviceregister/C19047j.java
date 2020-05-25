package com.p683ss.android.deviceregister;

import android.os.SystemClock;
import android.util.Log;
import com.p683ss.android.deviceregister.C19039h.C19043b;
import com.p683ss.android.deviceregister.C19044i.C19046a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.deviceregister.j */
public final class C19047j {

    /* renamed from: h */
    private static volatile C19047j f52472h;

    /* renamed from: a */
    public final AtomicLong f52473a = new AtomicLong(-1);

    /* renamed from: b */
    public final AtomicLong f52474b = new AtomicLong(-1);

    /* renamed from: c */
    public final AtomicReference<String> f52475c = new AtomicReference<>();

    /* renamed from: d */
    public final AtomicReference<HashMap<String, Long>> f52476d = new AtomicReference<>();

    /* renamed from: e */
    public final AtomicInteger f52477e = new AtomicInteger(-1);

    /* renamed from: f */
    public final Map<Integer, C19043b> f52478f = new ConcurrentHashMap(12);

    /* renamed from: g */
    public final Map<Integer, C19046a> f52479g = new ConcurrentHashMap(12);

    /* renamed from: i */
    private int f52480i = -1;

    /* renamed from: j */
    private final Object f52481j = new Object();

    /* renamed from: c */
    public final void mo38931c() {
        this.f52473a.compareAndSet(-1, SystemClock.uptimeMillis());
    }

    /* renamed from: a */
    public static C19047j m46366a() {
        if (f52472h == null) {
            synchronized (C19047j.class) {
                if (f52472h == null) {
                    f52472h = new C19047j();
                }
            }
        }
        return f52472h;
    }

    private C19047j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo38929b() {
        int i;
        synchronized (this.f52481j) {
            if (this.f52480i == -1) {
                this.f52480i = C19059m.m46390a().mo38941b();
            }
            Map<Integer, C19043b> map = this.f52478f;
            int i2 = this.f52480i + 1;
            this.f52480i = i2;
            map.put(Integer.valueOf(i2), new C19043b().mo38908b(Integer.valueOf(this.f52480i)).mo38905a(Long.valueOf(SystemClock.uptimeMillis())));
            i = this.f52480i;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo38930b(int i) {
        C19043b bVar = (C19043b) this.f52478f.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo38911d(Long.valueOf(SystemClock.uptimeMillis()));
        }
        return i;
    }

    /* renamed from: a */
    public final int mo38924a(int i) {
        C19043b bVar = (C19043b) this.f52478f.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.mo38910c(Long.valueOf(SystemClock.uptimeMillis()));
        }
        return i;
    }

    /* renamed from: a */
    public final void mo38925a(Integer num) {
        new StringBuilder("timestampPrimaryId=").append(num);
        C19043b bVar = (C19043b) this.f52478f.get(num);
        if (bVar != null) {
            C19039h a = bVar.mo38907a();
            C19059m.m46390a().mo38938a(a);
            C19049l.m46378a(a);
        }
    }

    /* renamed from: a */
    public final void mo38928a(String str) {
        new StringBuilder("did=").append(str);
        this.f52474b.compareAndSet(-1, SystemClock.uptimeMillis());
        this.f52475c.compareAndSet(null, str);
    }

    /* renamed from: a */
    public final void mo38927a(Integer num, String str) {
        StringBuilder sb = new StringBuilder("id=");
        sb.append(num);
        sb.append(" activeUserNetStacktrace=");
        sb.append(str);
        C19046a aVar = (C19046a) this.f52479g.get(num);
        aVar.mo38916a(Long.valueOf(SystemClock.uptimeMillis()), str);
        C19044i a = aVar.mo38919a();
        C19059m.m46390a().mo38939a(a);
        C19049l.m46379a(a);
    }

    /* renamed from: a */
    public final void mo38926a(Integer num, Long l, Long l2, String str, String str2, Throwable th, String str3, Integer num2) {
        StringBuilder sb = new StringBuilder("timestampPrimaryId = [");
        sb.append(num);
        sb.append("], netRequestStart = [");
        sb.append(l);
        sb.append("], netRequestEnd = [");
        sb.append(l2);
        sb.append("], url = [");
        sb.append(C19038g.m46336a(str));
        sb.append("], data = [");
        sb.append(C19038g.m46336a(str));
        sb.append("], exception = [");
        sb.append(th);
        sb.append("], errorMessage = [");
        sb.append(str3);
        sb.append("], nTry = [");
        sb.append(num2);
        sb.append("]");
        C19043b bVar = (C19043b) this.f52478f.get(num);
        if (bVar != null) {
            bVar.mo38903a(new C19042a().mo38896a(l).mo38899b(l2).mo38897a(str).mo38900b(str2).mo38901c(Log.getStackTraceString(th)).mo38902d(str3).mo38895a(num2).mo38898a());
            C19059m.m46390a().mo38938a(bVar.mo38907a());
        }
    }
}
