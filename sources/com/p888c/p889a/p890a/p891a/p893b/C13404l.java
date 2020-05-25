package com.p888c.p889a.p890a.p891a.p893b;

import android.view.View;
import com.p888c.p889a.p890a.p891a.p892a.C13387d;
import com.p888c.p889a.p890a.p891a.p895c.C13406a;
import com.p888c.p889a.p890a.p891a.p895c.C13407b;
import com.p888c.p889a.p890a.p891a.p895c.C13410c;
import com.p888c.p889a.p890a.p891a.p895c.C13412e;
import com.p888c.p889a.p890a.p891a.p895c.C13415g;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import com.p888c.p889a.p890a.p891a.p898f.C13428a;
import com.p888c.p889a.p890a.p891a.p899g.C13430a;
import com.p888c.p889a.p890a.p891a.p899g.C13432b;
import com.p888c.p889a.p890a.p891a.p899g.C13433c;
import com.p888c.p889a.p890a.p891a.p900h.C13435a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.c.a.a.a.b.l */
public final class C13404l extends C13394b {

    /* renamed from: g */
    private static final Pattern f34935g = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final C13395c f34936a;

    /* renamed from: b */
    public final List<C13410c> f34937b = new ArrayList();

    /* renamed from: c */
    public boolean f34938c = false;

    /* renamed from: d */
    public boolean f34939d = false;

    /* renamed from: e */
    boolean f34940e;

    /* renamed from: f */
    boolean f34941f;

    /* renamed from: h */
    private final C13396d f34942h;

    /* renamed from: i */
    private C13428a f34943i;

    /* renamed from: j */
    private C13430a f34944j;

    /* renamed from: k */
    private String f34945k;

    /* renamed from: c */
    private C13410c m27011c(View view) {
        for (C13410c cVar : this.f34937b) {
            if (cVar.f34957a.get() == view) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m27012d(View view) {
        this.f34943i = new C13428a(view);
    }

    /* renamed from: a */
    public final void mo25089a() {
        if (!this.f34938c) {
            this.f34938c = true;
            C13406a.m27022a().mo25105a(this);
            this.f34944j.mo25125a(C13415g.m27045a().f34968a);
            this.f34944j.mo25127a(this, this.f34942h);
        }
    }

    /* renamed from: c */
    public final C13430a mo25100c() {
        return this.f34944j;
    }

    /* renamed from: d */
    public final String mo25101d() {
        return this.f34945k;
    }

    /* renamed from: e */
    public final View mo25102e() {
        return (View) this.f34943i.get();
    }

    /* renamed from: f */
    public final boolean mo25103f() {
        return this.f34938c && !this.f34939d;
    }

    C13404l(C13395c cVar, C13396d dVar) {
        this.f34936a = cVar;
        this.f34942h = dVar;
        this.f34945k = UUID.randomUUID().toString();
        m27012d(null);
        this.f34944j = dVar.f34918f == C13397e.HTML ? new C13432b(dVar.f34914b) : new C13433c(dVar.mo25095b(), dVar.f34915c);
        this.f34944j.mo25124a();
        C13406a.m27022a().f34948a.add(this);
        C13412e.m27034a().mo25116a(this.f34944j.mo25132c(), "init", cVar.mo25093a());
    }

    /* renamed from: a */
    public final void mo25090a(View view) {
        if (!this.f34939d) {
            C13426e.m27071a((Object) view, "AdView is null");
            if (mo25102e() != view) {
                m27012d(view);
                mo25100c().mo25133d();
                Collection<C13404l> b = C13406a.m27022a().mo25106b();
                if (b != null && b.size() > 0) {
                    for (C13404l lVar : b) {
                        if (lVar != this && lVar.mo25102e() == view) {
                            lVar.f34943i.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo25091b() {
        if (!this.f34939d) {
            this.f34943i.clear();
            if (!this.f34939d) {
                this.f34937b.clear();
            }
            this.f34939d = true;
            C13412e.m27034a().mo25116a(mo25100c().mo25132c(), "finishSession", new Object[0]);
            C13406a a = C13406a.m27022a();
            boolean d = a.mo25108d();
            a.f34948a.remove(this);
            a.f34949b.remove(this);
            if (d && !a.mo25108d()) {
                C13415g a2 = C13415g.m27045a();
                C13435a a3 = C13435a.m27093a();
                a3.mo25136c();
                a3.f35002b.clear();
                C13435a.f34997a.post(new Runnable() {
                    public final void run() {
                        C13435a.this.f35003c.mo25152b();
                    }
                });
                C13407b a4 = C13407b.m27027a();
                if (!(a4.f34951a == null || a4.f34952b == null)) {
                    a4.f34951a.unregisterReceiver(a4.f34952b);
                    a4.f34952b = null;
                }
                a4.f34953c = false;
                a4.f34954d = false;
                a4.f34955e = null;
                C13387d dVar = a2.f34969b;
                dVar.f34894a.getContentResolver().unregisterContentObserver(dVar);
            }
            mo25100c().mo25131b();
            this.f34944j = null;
        }
    }

    /* renamed from: b */
    public final void mo25092b(View view) {
        C13399g gVar = C13399g.OTHER;
        if (this.f34939d) {
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        } else if (m27011c(view) == null) {
            this.f34937b.add(new C13410c(view, gVar, null));
        }
    }

    /* renamed from: g */
    public final boolean mo25104g() {
        return C13401i.NATIVE == this.f34936a.f34908a;
    }
}
