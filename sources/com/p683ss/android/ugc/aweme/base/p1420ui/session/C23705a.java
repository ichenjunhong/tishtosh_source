package com.p683ss.android.ugc.aweme.base.p1420ui.session;

import android.arch.lifecycle.C0184k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.a */
public final class C23705a<T> {

    /* renamed from: a */
    ArrayList<C23706b<T>> f63225a = new ArrayList<>();

    /* renamed from: b */
    private void m58171b() {
        this.f63225a.clear();
    }

    /* renamed from: a */
    public final void mo49137a() {
        m58171b();
        C23707c.m58177a().mo49141a(this);
    }

    /* renamed from: a */
    private void m58170a(C23706b<T> bVar) {
        if (!this.f63225a.contains(bVar)) {
            this.f63225a.add(bVar);
        }
    }

    /* renamed from: a */
    public final C23705a<T> mo49136a(C0184k kVar) {
        kVar.getLifecycle().mo324a(new Session$2(this));
        return this;
    }

    /* renamed from: a */
    public final void mo49139a(T t) {
        Iterator it = this.f63225a.iterator();
        while (it.hasNext()) {
            ((C23706b) it.next()).mo47089a(t);
        }
        mo49137a();
    }

    /* renamed from: a */
    public final void mo49138a(C0184k kVar, C23706b bVar) {
        m58170a(bVar);
        kVar.getLifecycle().mo324a(new Session$1(this, bVar));
    }
}
