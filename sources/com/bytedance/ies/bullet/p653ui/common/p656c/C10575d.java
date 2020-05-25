package com.bytedance.ies.bullet.p653ui.common.p656c;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10571b.C10572a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.c.d */
public final class C10575d<T extends View> {

    /* renamed from: a */
    public final Set<C10576e<T>> f28091a;

    /* renamed from: b */
    public final T f28092b;

    /* renamed from: c */
    public final LayoutParams f28093c;

    /* renamed from: a */
    private List<C10576e<T>> m21349a() {
        return C52575l.m112138e((Iterable) this.f28091a);
    }

    /* renamed from: a */
    public final void mo18758a(C10576e<T> eVar) {
        C52711k.m112240b(eVar, "delegate");
        this.f28091a.remove(eVar);
    }

    /* renamed from: a */
    public final void mo18756a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        for (C10576e a : m21349a()) {
            try {
                a.mo18740a(this, uri);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo18759b(Uri uri) {
        C52711k.m112240b(uri, "uri");
        for (C10576e b : m21349a()) {
            try {
                b.mo18742b(this, uri);
            } catch (C10241d unused) {
            }
        }
    }

    private C10575d(T t, LayoutParams layoutParams) {
        C52711k.m112240b(t, "view");
        this.f28092b = t;
        this.f28093c = layoutParams;
        this.f28091a = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void mo18757a(Uri uri, Throwable th) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(th, "e");
        for (C10576e a : m21349a()) {
            try {
                a.mo18741a(this, uri, th);
            } catch (C10241d unused) {
            }
        }
    }

    public /* synthetic */ C10575d(View view, LayoutParams layoutParams, int i, C52707g gVar) {
        this(view, C10572a.f28086a);
    }
}
