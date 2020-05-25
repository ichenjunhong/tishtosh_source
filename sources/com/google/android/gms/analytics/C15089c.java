package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16699g;
import com.google.android.gms.internal.measurement.C16818k;
import com.google.android.gms.internal.measurement.C16860r;
import com.google.android.gms.internal.measurement.C16862t;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.analytics.c */
public class C15089c extends C15097k<C15089c> {

    /* renamed from: e */
    public final C16862t f38948e;

    /* renamed from: f */
    public boolean f38949f;

    public C15089c(C16862t tVar) {
        super(tVar.mo32519b(), tVar.f47336c);
        this.f38948e = tVar;
    }

    /* renamed from: b */
    public final C15095i mo27831b() {
        C15095i a = this.f38970h.mo27836a();
        C16862t tVar = this.f38948e;
        C16862t.m40964a((C16860r) tVar.f47342i);
        a.mo27838a((C15096j) tVar.f47342i.mo31782b());
        a.mo27838a((C15096j) this.f38948e.f47343j.mo31817b());
        mo27842b(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27829a(C15095i iVar) {
        C16699g gVar = (C16699g) iVar.mo27839b(C16699g.class);
        if (TextUtils.isEmpty(gVar.f46943b)) {
            gVar.f46943b = this.f38948e.mo32523f().mo31796b();
        }
        if (this.f38949f && TextUtils.isEmpty(gVar.f46945d)) {
            C16862t tVar = this.f38948e;
            C16862t.m40964a((C16860r) tVar.f47341h);
            C16818k kVar = tVar.f47341h;
            gVar.f46945d = kVar.mo32398c();
            gVar.f46946e = kVar.mo32397b();
        }
    }

    /* renamed from: a */
    public final void mo27830a(String str) {
        C15464q.m32125a(str);
        Uri a = C15090d.m31234a(str);
        ListIterator listIterator = this.f38970h.f38963g.listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((C15104o) listIterator.next()).mo27832a())) {
                listIterator.remove();
            }
        }
        this.f38970h.f38963g.add(new C15090d(this.f38948e, str));
    }
}
