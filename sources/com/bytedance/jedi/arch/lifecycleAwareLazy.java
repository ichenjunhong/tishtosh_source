package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0161ac;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import android.support.p030v4.app.Fragment;
import java.io.Serializable;
import p2628d.C52668f;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

public class lifecycleAwareLazy<T extends C0209x> implements C0183j, C52668f<T>, Serializable {

    /* renamed from: a */
    private C52670a<? extends T> f31606a;

    /* renamed from: b */
    private volatile Object f31607b;

    /* renamed from: c */
    private final lifecycleAwareLazy<T> f31608c;

    /* renamed from: d */
    private final C0184k f31609d;

    /* renamed from: e */
    private final C52670a<String> f31610e;

    public static /* synthetic */ void value$annotations() {
    }

    public boolean isInitialized() {
        if (this.f31607b != C11789ab.f31298a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return getValue().toString();
        }
        return "Lazy value not initialized yet.";
    }

    public T getValue() {
        T t;
        T t2 = this.f31607b;
        if (t2 == C11789ab.f31298a) {
            synchronized (this.f31608c) {
                T t3 = this.f31607b;
                if (t3 == C11789ab.f31298a) {
                    C52670a<? extends T> aVar = this.f31606a;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    t = (C0209x) aVar.invoke();
                    this.f31607b = t;
                    this.f31606a = null;
                } else if (t3 != null) {
                    t = (C0209x) t3;
                } else {
                    throw new C52857u("null cannot be cast to non-null type T");
                }
            }
            return t;
        } else if (t2 != null) {
            return (C0209x) t2;
        } else {
            throw new C52857u("null cannot be cast to non-null type T");
        }
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        if (this.f31610e == null) {
            this.f31609d.getLifecycle().mo325b(this);
        } else {
            ensureViewModel(this.f31609d, getValue(), this.f31610e);
        }
    }

    public lifecycleAwareLazy(C0184k kVar, C52670a<? extends T> aVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(aVar, "initializer");
        this(kVar, null, aVar);
    }

    public lifecycleAwareLazy(C0184k kVar, C52670a<String> aVar, C52670a<? extends T> aVar2) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(aVar2, "initializer");
        this.f31609d = kVar;
        this.f31610e = aVar;
        this.f31606a = aVar2;
        this.f31607b = C11789ab.f31298a;
        this.f31608c = this;
        this.f31609d.getLifecycle().mo324a(this);
    }

    /* access modifiers changed from: protected */
    public void ensureViewModel(C0184k kVar, T t, C52670a<String> aVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(t, "value");
        C52711k.m112240b(aVar, "keyFactory");
        Fragment fragment = (Fragment) kVar;
        C52711k.m112240b(fragment, "$this$ensureViewModel");
        C52711k.m112240b(t, "value");
        C52711k.m112240b(aVar, "keyFactory");
        C0159aa a = C0161ac.m372a(fragment);
        C52711k.m112236a((Object) a, "ViewModelStores.of(this)");
        String str = (String) aVar.invoke();
        if (a.mo300a(str) == null) {
            a.mo302a(str, t);
        }
    }
}
