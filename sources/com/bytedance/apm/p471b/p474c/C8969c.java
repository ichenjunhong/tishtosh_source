package com.bytedance.apm.p471b.p474c;

import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p471b.p474c.p475a.C8964b;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm.b.c.c */
public abstract class C8969c<T extends C8964b> implements C8975i {

    /* renamed from: a */
    public String f24409a;

    /* renamed from: b */
    long f24410b;

    /* renamed from: c */
    boolean f24411c;

    /* renamed from: d */
    ConcurrentHashMap<Integer, T> f24412d = new ConcurrentHashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16247a(T t, long j, long j2);

    /* renamed from: b */
    public void mo16248b() {
        this.f24411c = false;
    }

    /* renamed from: c */
    public void mo16249c() {
        this.f24411c = true;
    }

    /* renamed from: j_ */
    public final void mo16260j_() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24412d.size() != 0 && currentTimeMillis - this.f24410b >= 600000) {
            mo16245a(this.f24410b, currentTimeMillis);
        }
        this.f24410b = currentTimeMillis;
    }

    C8969c(String str) {
        this.f24409a = str;
        this.f24411c = ActivityLifeObserver.getInstance().isForeground();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16245a(long j, long j2) {
        Iterator it = this.f24412d.entrySet().iterator();
        while (it.hasNext()) {
            C8964b bVar = (C8964b) ((Entry) it.next()).getValue();
            if (0 < bVar.f24398e && bVar.f24398e < bVar.f24397d) {
                it.remove();
            } else if (0 < bVar.f24398e && bVar.f24398e < j) {
                it.remove();
            } else if (j2 >= bVar.f24397d) {
                mo16247a(bVar, j, j2);
            }
        }
    }
}
