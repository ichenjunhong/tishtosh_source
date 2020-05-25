package com.bytedance.als;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;

/* renamed from: com.bytedance.als.g */
public class C2763g<T> {

    /* renamed from: a */
    private C0198r<T> f8328a = new C0198r<>();

    /* renamed from: a */
    public final T mo7351a() {
        return this.f8328a.getValue();
    }

    public C2763g(T t) {
        this.f8328a.setValue(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7345a(T t) {
        this.f8328a.setValue(t);
    }

    /* renamed from: a */
    public final void mo7352a(C0184k kVar, C2767k<T> kVar2) {
        this.f8328a.observe(kVar, kVar2);
    }
}
