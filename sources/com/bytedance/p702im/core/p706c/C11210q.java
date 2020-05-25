package com.bytedance.p702im.core.p706c;

import com.bytedance.p702im.core.internal.p710a.C11319r;
import com.bytedance.p702im.core.internal.p722d.C11455c;
import com.bytedance.p702im.core.internal.p722d.C11456d;
import com.bytedance.p702im.core.internal.p722d.C11457e;
import com.bytedance.p702im.core.internal.utils.C11468f;
import com.bytedance.p702im.core.internal.utils.C11472i;
import com.bytedance.p702im.core.internal.utils.C11500m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.c.q */
public final class C11210q implements C11203l {

    /* renamed from: a */
    public final String f30212a;

    /* renamed from: b */
    public final int[] f30213b;

    /* renamed from: c */
    public final int f30214c;

    /* renamed from: d */
    public final C11468f f30215d;

    /* renamed from: e */
    public boolean f30216e = true;

    /* renamed from: f */
    public boolean f30217f;

    /* renamed from: g */
    private C11203l f30218g;

    /* renamed from: a */
    public final void mo20721a(int i, C11207p pVar) {
    }

    /* renamed from: a */
    public final void mo20722a(int i, C11238s sVar) {
    }

    /* renamed from: a */
    public final void mo20723a(int i, C11241u uVar) {
    }

    /* renamed from: a */
    public final void mo20725a(C11207p pVar, Map<String, List<C11205n>> map, Map<String, List<C11205n>> map2) {
    }

    /* renamed from: a */
    public final void mo20726a(List<C11207p> list, int i) {
    }

    /* renamed from: a */
    public final void mo20727a(boolean z) {
    }

    /* renamed from: b */
    public final void mo20728b(int i, C11207p pVar) {
    }

    /* renamed from: e */
    public final void mo20732e(List<C11207p> list) {
    }

    /* renamed from: f */
    public final void mo20733f(List<C11241u> list) {
    }

    /* renamed from: c */
    public final List<C11207p> mo20831c() {
        return new ArrayList(this.f30215d);
    }

    /* renamed from: a */
    public final void mo20828a() {
        this.f30218g = null;
        this.f30215d.clear();
        C11472i.m23483a().mo21116b(this.f30212a, (C11203l) this);
    }

    /* renamed from: b */
    public final void mo20830b() {
        C11500m.m23559a();
        if (!this.f30217f) {
            this.f30217f = true;
            C11457e.m23434a(new C11456d<List<C11207p>>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo20683a() {
                    C11207p pVar;
                    C11210q qVar = C11210q.this;
                    if (qVar.f30215d.isEmpty()) {
                        pVar = null;
                    } else {
                        pVar = (C11207p) qVar.f30215d.get(qVar.f30215d.size() - 1);
                    }
                    if (pVar == null) {
                        return null;
                    }
                    C11319r.m23086a();
                    return C11319r.m23088a(C11210q.this.f30212a, pVar.getIndex(), C11210q.this.f30214c, C11210q.this.f30213b);
                }
            }, new C11455c<List<C11207p>>() {
                /* renamed from: a */
                public final /* synthetic */ void mo20684a(Object obj) {
                    List list = (List) obj;
                    C11210q.this.f30217f = false;
                    C11210q.this.mo20731d(list);
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo20730c(List<C11207p> list) {
        if (this.f30218g != null) {
            this.f30218g.mo20730c(list);
        }
    }

    /* renamed from: d */
    public final void mo20731d(List<C11207p> list) {
        if (list != null && !list.isEmpty()) {
            this.f30215d.appendList(list);
        }
        if (this.f30218g != null) {
            this.f30218g.mo20731d(list);
        }
    }

    /* renamed from: a */
    public final void mo20829a(C11203l lVar) {
        this.f30218g = lVar;
        C11472i.m23483a().mo21113a(this.f30212a, (C11203l) this);
    }

    /* renamed from: b */
    public final void mo20729b(C11207p pVar) {
        if (pVar != null && this.f30218g != null) {
            this.f30215d.update(pVar);
            this.f30218g.mo20729b(pVar);
        }
    }

    /* renamed from: a */
    public final void mo20724a(C11207p pVar) {
        if (this.f30215d.remove(pVar) && this.f30218g != null) {
            this.f30218g.mo20724a(pVar);
        }
    }

    public C11210q(String str, int[] iArr, int i) {
        this.f30212a = str;
        this.f30213b = iArr;
        this.f30214c = i;
        this.f30215d = new C11468f();
    }
}
