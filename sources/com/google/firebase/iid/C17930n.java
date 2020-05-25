package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.p1033b.C15180h;

/* renamed from: com.google.firebase.iid.n */
abstract class C17930n<T> {

    /* renamed from: a */
    final int f49795a;

    /* renamed from: b */
    final C15180h<T> f49796b = new C15180h<>();

    /* renamed from: c */
    final int f49797c;

    /* renamed from: d */
    final Bundle f49798d;

    C17930n(int i, int i2, Bundle bundle) {
        this.f49795a = i;
        this.f49797c = i2;
        this.f49798d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34776a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo34777a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34779a(T t) {
        this.f49796b.mo28005a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34778a(C17931o oVar) {
        this.f49796b.mo28004a((Exception) oVar);
    }

    public String toString() {
        int i = this.f49797c;
        int i2 = this.f49795a;
        boolean a = mo34777a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
