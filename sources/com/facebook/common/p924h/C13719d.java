package com.facebook.common.p924h;

import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: com.facebook.common.h.d */
public final class C13719d<T> {

    /* renamed from: c */
    private static final Map<Object, Integer> f35698c = new IdentityHashMap();

    /* renamed from: a */
    T f35699a;

    /* renamed from: b */
    final C13718c<T> f35700b;

    /* renamed from: d */
    private int f35701d = 1;

    /* renamed from: com.facebook.common.h.d$a */
    public static class C13720a extends RuntimeException {
        public C13720a() {
            super("Null shared reference");
        }
    }

    /* renamed from: a */
    public final synchronized T mo25637a() {
        return this.f35699a;
    }

    /* renamed from: d */
    private synchronized boolean m27761d() {
        boolean z;
        if (this.f35701d > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    private void m27762e() {
        if (!m27760a(this)) {
            throw new C13720a();
        }
    }

    /* renamed from: b */
    public final synchronized void mo25638b() {
        m27762e();
        this.f35701d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized int mo25639c() {
        boolean z;
        m27762e();
        if (this.f35701d > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        this.f35701d--;
        return this.f35701d;
    }

    /* renamed from: a */
    private static boolean m27760a(C13719d<?> dVar) {
        if (dVar.m27761d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static void m27759a(Object obj) {
        synchronized (f35698c) {
            Integer num = (Integer) f35698c.get(obj);
            if (num == null) {
                C13697a.m27698d("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f35698c.remove(obj);
            } else {
                f35698c.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public C13719d(T t, C13718c<T> cVar) {
        this.f35699a = C13689i.m27652a(t);
        this.f35700b = (C13718c) C13689i.m27652a(cVar);
        synchronized (f35698c) {
            Integer num = (Integer) f35698c.get(t);
            if (num == null) {
                f35698c.put(t, Integer.valueOf(1));
            } else {
                f35698c.put(t, Integer.valueOf(num.intValue() + 1));
            }
        }
    }
}
