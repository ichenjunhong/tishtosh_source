package com.google.android.gms.p1027a;

import android.os.Bundle;
import com.google.android.gms.p1027a.C14885c;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.a.a */
public abstract class C14880a<T extends C14885c> {

    /* renamed from: a */
    public T f38412a;

    /* renamed from: b */
    public Bundle f38413b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList<C14881a> f38414c;

    /* renamed from: d */
    private final C14887e<T> f38415d = new C14890g(this);

    /* renamed from: com.google.android.gms.a.a$a */
    interface C14881a {
        /* renamed from: a */
        int mo27242a();

        /* renamed from: a */
        void mo27243a(C14885c cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27240a(C14887e<T> eVar);

    /* renamed from: a */
    public final void mo27238a(int i) {
        while (!this.f38414c.isEmpty() && ((C14881a) this.f38414c.getLast()).mo27242a() >= i) {
            this.f38414c.removeLast();
        }
    }

    /* renamed from: a */
    private final void m30526a(Bundle bundle, C14881a aVar) {
        if (this.f38412a != null) {
            aVar.mo27243a(this.f38412a);
            return;
        }
        if (this.f38414c == null) {
            this.f38414c = new LinkedList<>();
        }
        this.f38414c.add(aVar);
        if (bundle != null) {
            if (this.f38413b == null) {
                this.f38413b = (Bundle) bundle.clone();
            } else {
                this.f38413b.putAll(bundle);
            }
        }
        mo27240a(this.f38415d);
    }

    /* renamed from: a */
    public final void mo27239a(Bundle bundle) {
        m30526a(bundle, new C14891h(this, bundle));
    }

    /* renamed from: a */
    public final void mo27237a() {
        m30526a(null, new C14893j(this));
    }

    /* renamed from: b */
    public final void mo27241b() {
        m30526a(null, new C14894k(this));
    }
}
