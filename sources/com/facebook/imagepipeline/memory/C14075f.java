package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.facebook.imagepipeline.memory.f */
class C14075f<V> {

    /* renamed from: a */
    public final int f36789a;

    /* renamed from: b */
    public final int f36790b;

    /* renamed from: c */
    final Queue f36791c;

    /* renamed from: d */
    final boolean f36792d;

    /* renamed from: e */
    public int f36793e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo26332a() {
        return this.f36791c.size();
    }

    /* renamed from: b */
    public V mo26334b() {
        return this.f36791c.poll();
    }

    /* renamed from: c */
    public final void mo26335c() {
        boolean z;
        if (this.f36793e > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27657b(z);
        this.f36793e--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26333a(V v) {
        this.f36791c.add(v);
    }

    public C14075f(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27657b(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13689i.m27657b(z3);
        if (i3 >= 0) {
            z4 = true;
        }
        C13689i.m27657b(z4);
        this.f36789a = i;
        this.f36790b = i2;
        this.f36791c = new LinkedList();
        this.f36793e = i3;
        this.f36792d = z;
    }
}
