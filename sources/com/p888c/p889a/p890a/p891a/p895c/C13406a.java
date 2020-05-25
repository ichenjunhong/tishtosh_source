package com.p888c.p889a.p890a.p891a.p895c;

import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.c.a.a.a.c.a */
public final class C13406a {

    /* renamed from: c */
    private static C13406a f34947c = new C13406a();

    /* renamed from: a */
    public final ArrayList<C13404l> f34948a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C13404l> f34949b = new ArrayList<>();

    private C13406a() {
    }

    /* renamed from: a */
    public static C13406a m27022a() {
        return f34947c;
    }

    /* renamed from: a */
    public final void mo25105a(C13404l lVar) {
        boolean d = mo25108d();
        this.f34949b.add(lVar);
        if (!d) {
            C13415g.m27045a().mo25120b();
        }
    }

    /* renamed from: b */
    public final Collection<C13404l> mo25106b() {
        return Collections.unmodifiableCollection(this.f34948a);
    }

    /* renamed from: c */
    public final Collection<C13404l> mo25107c() {
        return Collections.unmodifiableCollection(this.f34949b);
    }

    /* renamed from: d */
    public final boolean mo25108d() {
        return this.f34949b.size() > 0;
    }
}
