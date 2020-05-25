package com.bytedance.p618i;

import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0199s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.i.a */
public final class C10172a {

    /* renamed from: com.bytedance.i.a$a */
    public static final class C10173a implements C0199s<X> {

        /* renamed from: a */
        public boolean f27507a = true;

        /* renamed from: b */
        final /* synthetic */ C0195p f27508b;

        public C10173a(C0195p pVar) {
            this.f27508b = pVar;
        }

        public final void onChanged(X x) {
            Object value = this.f27508b.getValue();
            if (this.f27507a || ((value == null && x != null) || (value != null && (!C52711k.m112239a(value, (Object) x))))) {
                this.f27507a = false;
                this.f27508b.setValue(x);
            }
        }
    }
}
