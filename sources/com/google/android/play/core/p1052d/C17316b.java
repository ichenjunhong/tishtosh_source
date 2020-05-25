package com.google.android.play.core.p1052d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.p1051c.C17295h;
import com.google.android.play.core.splitcompat.C17384b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.play.core.d.b */
public abstract class C17316b<StateT> {

    /* renamed from: a */
    public final C17384b f48780a;

    /* renamed from: b */
    private final IntentFilter f48781b;

    /* renamed from: c */
    private final Context f48782c;

    /* renamed from: d */
    private final Set<C17315a<StateT>> f48783d = new HashSet();

    /* renamed from: e */
    private C17317c f48784e = null;

    /* renamed from: f */
    private volatile boolean f48785f = false;

    protected C17316b(C17384b bVar, IntentFilter intentFilter, Context context) {
        this.f48780a = bVar;
        this.f48781b = intentFilter;
        this.f48782c = C17295h.m42356a(context);
    }

    /* renamed from: a */
    private final void m42397a() {
        if ((this.f48785f || !this.f48783d.isEmpty()) && this.f48784e == null) {
            this.f48784e = new C17317c(this, 0);
            this.f48782c.registerReceiver(this.f48784e, this.f48781b);
        }
        if (!this.f48785f && this.f48783d.isEmpty() && this.f48784e != null) {
            this.f48782c.unregisterReceiver(this.f48784e);
            this.f48784e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33506a(Context context, Intent intent);

    /* renamed from: a */
    public final synchronized void mo33608a(C17315a<StateT> aVar) {
        this.f48780a.mo33685a("registerListener", new Object[0]);
        this.f48783d.add(aVar);
        m42397a();
    }

    /* renamed from: a */
    public final synchronized void mo33609a(StateT statet) {
        Iterator it = new HashSet(this.f48783d).iterator();
        while (it.hasNext()) {
            ((C17315a) it.next()).mo23054a(statet);
        }
    }

    /* renamed from: a */
    public final synchronized void mo33610a(boolean z) {
        this.f48785f = true;
        m42397a();
    }

    /* renamed from: b */
    public final synchronized void mo33611b(C17315a<StateT> aVar) {
        this.f48780a.mo33685a("unregisterListener", new Object[0]);
        this.f48783d.remove(aVar);
        m42397a();
    }
}
