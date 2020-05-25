package com.google.android.play.core.p1051c;

import com.google.android.play.core.p1052d.C17315a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.c.bb */
public final class C17280bb<StateT> {

    /* renamed from: a */
    private final Set<C17315a<StateT>> f48746a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo33582a(C17315a<StateT> aVar) {
        this.f48746a.add(aVar);
    }

    /* renamed from: a */
    public final synchronized void mo33583a(StateT statet) {
        for (C17315a a : this.f48746a) {
            a.mo23054a(statet);
        }
    }

    /* renamed from: b */
    public final synchronized void mo33584b(C17315a<StateT> aVar) {
        this.f48746a.remove(aVar);
    }
}
