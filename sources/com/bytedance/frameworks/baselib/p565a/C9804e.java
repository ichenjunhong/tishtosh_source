package com.bytedance.frameworks.baselib.p565a;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.a.e */
public final class C9804e {

    /* renamed from: b */
    private static C9804e f26669b;

    /* renamed from: a */
    public final Map<String, C9796b> f26670a;

    /* renamed from: c */
    private final Context f26671c;

    /* renamed from: d */
    private final C9805f f26672d;

    /* renamed from: e */
    private final AtomicBoolean f26673e = new AtomicBoolean(false);

    /* renamed from: f */
    private final LinkedList<C9800c> f26674f = new LinkedList<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17648a() {
        return this.f26673e.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9796b mo17647a(String str) {
        return (C9796b) this.f26670a.get(str);
    }

    /* renamed from: a */
    public static C9804e m19628a(Context context) {
        if (f26669b == null) {
            synchronized (C9804e.class) {
                if (f26669b == null) {
                    f26669b = new C9804e(context);
                }
            }
        }
        return f26669b;
    }

    private C9804e(Context context) {
        this.f26671c = context.getApplicationContext();
        this.f26670a = new ConcurrentHashMap();
        this.f26672d = new C9805f(this.f26671c, this, this.f26674f, this.f26673e);
        this.f26672d.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17649a(String str, byte[] bArr) {
        if (mo17648a() || bArr == null || bArr.length <= 0 || mo17647a(str) == null) {
            return false;
        }
        synchronized (this.f26674f) {
            if (this.f26673e.get()) {
                return false;
            }
            if (this.f26674f.size() >= 2000) {
                this.f26674f.poll();
            }
            boolean add = this.f26674f.add(new C9800c(str, bArr));
            C9805f fVar = this.f26672d;
            synchronized (fVar.f26675a) {
                fVar.f26675a.notify();
            }
            return add;
        }
    }
}
