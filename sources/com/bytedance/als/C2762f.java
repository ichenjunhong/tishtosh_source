package com.bytedance.als;

import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.support.p030v4.p038f.C0794k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.als.f */
public class C2762f<T> {

    /* renamed from: a */
    C0198r<T> f8325a;

    /* renamed from: b */
    final Set<C2767k<T>> f8326b = new HashSet();

    /* renamed from: c */
    final List<C0794k<C2767k<T>, C0184k>> f8327c = new ArrayList();

    /* renamed from: a */
    public final T mo7348a() {
        if (this.f8325a != null) {
            return this.f8325a.getValue();
        }
        return null;
    }

    /* renamed from: b */
    private void m7861b() {
        if (this.f8325a == null) {
            this.f8325a = new C0198r<>();
        } else if (this.f8325a.getValue() != null) {
            for (C0794k kVar : this.f8327c) {
                this.f8325a.removeObserver((C0199s) kVar.f2711a);
            }
            this.f8325a = new C0198r<>();
            for (C0794k kVar2 : this.f8327c) {
                if (kVar2.f2712b != null) {
                    this.f8325a.observe((C0184k) kVar2.f2712b, (C0199s) kVar2.f2711a);
                } else {
                    this.f8325a.observeForever((C0199s) kVar2.f2711a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7350a(T t) {
        if (this.f8325a != null) {
            this.f8325a.setValue(t);
        }
    }

    /* renamed from: a */
    public final void mo7349a(C0184k kVar, C2767k<T> kVar2) {
        if (kVar.getLifecycle().mo323a() != C0178b.DESTROYED) {
            if (!this.f8326b.contains(kVar2)) {
                this.f8326b.add(kVar2);
                m7861b();
                this.f8327c.add(C0794k.m2265a(kVar2, kVar));
                this.f8325a.observe(kVar, kVar2);
                kVar.getLifecycle().mo324a(new LiveEvent$1(this, kVar2));
                return;
            }
            throw new IllegalArgumentException("Can't add the same observer twice");
        }
    }
}
