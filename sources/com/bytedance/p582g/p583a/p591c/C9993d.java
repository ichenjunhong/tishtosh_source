package com.bytedance.p582g.p583a.p591c;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.g.a.c.d */
public final class C9993d {

    /* renamed from: b */
    private static C9993d f27123b;

    /* renamed from: a */
    public final Map<String, C9985a> f27124a;

    /* renamed from: c */
    private final Context f27125c;

    /* renamed from: d */
    private final C9995f f27126d;

    /* renamed from: e */
    private final AtomicBoolean f27127e = new AtomicBoolean(false);

    /* renamed from: f */
    private final LinkedList<C9989b> f27128f = new LinkedList<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17957a() {
        return this.f27127e.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9985a mo17956a(String str) {
        return (C9985a) this.f27124a.get(str);
    }

    /* renamed from: a */
    public static C9993d m20089a(Context context) {
        if (f27123b == null) {
            synchronized (C9993d.class) {
                if (f27123b == null) {
                    f27123b = new C9993d(context);
                }
            }
        }
        return f27123b;
    }

    private C9993d(Context context) {
        this.f27125c = context.getApplicationContext();
        this.f27124a = new ConcurrentHashMap();
        this.f27126d = new C9995f(this.f27125c, this, this.f27128f, this.f27127e);
        this.f27126d.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17958a(String str, byte[] bArr) {
        if (mo17957a() || bArr == null || bArr.length <= 0 || mo17956a(str) == null) {
            return false;
        }
        synchronized (this.f27128f) {
            if (this.f27127e.get()) {
                return false;
            }
            if (this.f27128f.size() >= 2000) {
                this.f27128f.poll();
            }
            boolean add = this.f27128f.add(new C9989b(str, bArr));
            C9995f fVar = this.f27126d;
            synchronized (fVar.f27132a) {
                fVar.f27132a.notify();
            }
            return add;
        }
    }
}
