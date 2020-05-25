package com.p683ss.android.ugc.aweme.antiaddic;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37930a;
import com.p683ss.android.ugc.aweme.profile.util.C40533ag;
import com.p683ss.android.ugc.aweme.protection.api.services.C40859b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.a */
public class C22688a implements C22690b, C27979p {

    /* renamed from: b */
    private static C22688a f60883b;

    /* renamed from: a */
    public List<C27979p> f60884a = new CopyOnWriteArrayList();

    /* renamed from: c */
    private boolean f60885c;

    private C22688a() {
    }

    /* renamed from: d */
    public static C22688a m55899d() {
        if (f60883b == null) {
            synchronized (C22688a.class) {
                if (f60883b == null) {
                    f60883b = new C22688a();
                }
            }
        }
        return f60883b;
    }

    /* renamed from: e */
    public final void mo47075e() {
        C35857a.m81001b().mo74526a(new AppStateReporter$1(this)).mo74527a();
    }

    /* renamed from: a */
    public final void mo47070a() {
        mo47076f();
        synchronized (C22688a.class) {
            for (C27979p a : this.f60884a) {
                a.mo47070a();
            }
        }
    }

    /* renamed from: b */
    public final void mo47072b() {
        mo47076f();
        synchronized (C22688a.class) {
            for (C27979p b : this.f60884a) {
                b.mo47072b();
            }
        }
    }

    /* renamed from: c */
    public final void mo47074c() {
        mo47076f();
        synchronized (C22688a.class) {
            for (C27979p c : this.f60884a) {
                c.mo47074c();
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo47076f() {
        if (!this.f60885c) {
            if (C18920g.m46048a(C11010c.m22280a())) {
                m55899d().mo47071a(C40859b.f104022a.getAntiAddictionService().mo83196g());
                m55899d().mo47071a(new C37930a());
                m55899d().mo47071a(new C40533ag());
            }
            this.f60885c = true;
        }
    }

    /* renamed from: b */
    public final void mo47073b(C27979p pVar) {
        synchronized (C22688a.class) {
            this.f60884a.remove(pVar);
        }
    }

    /* renamed from: a */
    public final void mo47071a(C27979p pVar) {
        synchronized (C22688a.class) {
            if (!this.f60884a.contains(pVar)) {
                this.f60884a.add(pVar);
            }
        }
    }
}
