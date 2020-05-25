package com.p683ss.android.ugc.aweme.notification.newstyle.p2028e;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38333d;
import com.p683ss.android.ugc.aweme.notification.p2012b.C38151a;
import com.p683ss.android.ugc.aweme.notification.p2012b.C38152b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.e.a */
public final class C38345a extends C26851b<C38333d, C26877c<User>> {
    /* renamed from: h */
    private final boolean m85634h() {
        if (this.f70700f == null || this.f70701g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m85635i() {
        C38333d dVar = (C38333d) this.f70700f;
        if (dVar != null) {
            C38152b bVar = (C38152b) dVar.getData();
            if (bVar != null && bVar.f97160a == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R_ */
    public final void mo44834R_() {
        if (m85634h()) {
            if (((C38333d) this.f70700f).f97560a) {
                ((C26877c) this.f70701g).mo47031e();
            } else {
                ((C26877c) this.f70701g).mo47017R_();
            }
        }
    }

    /* renamed from: e */
    public final int mo78289e() {
        C38333d dVar = (C38333d) this.f70700f;
        if (dVar != null) {
            C38152b bVar = (C38152b) dVar.getData();
            if (bVar != null) {
                return bVar.f97164e;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo78290f() {
        C38333d dVar = (C38333d) this.f70700f;
        if (dVar != null) {
            dVar.f97560a = false;
            dVar.mo78280a(0, 0);
        }
        mo44834R_();
    }

    /* renamed from: g */
    public final void mo78291g() {
        long j;
        C38333d dVar = (C38333d) this.f70700f;
        if (dVar != null) {
            dVar.f97560a = true;
            C38152b bVar = (C38152b) dVar.getData();
            long j2 = 0;
            if (bVar != null) {
                j = bVar.f97162c;
            } else {
                j = 0;
            }
            C38152b bVar2 = (C38152b) dVar.getData();
            if (bVar2 != null) {
                j2 = bVar2.f97163d;
            }
            dVar.mo78280a(j, j2);
        }
        mo44834R_();
    }

    /* renamed from: b */
    public final void mo44838b() {
        List list;
        List list2;
        boolean z;
        if (m85634h()) {
            boolean z2 = false;
            if (((C38333d) this.f70700f).f97560a) {
                C26877c cVar = (C26877c) this.f70701g;
                C26832a aVar = this.f70700f;
                C52711k.m112236a((Object) aVar, "mModel");
                List<C38151a> list3 = ((C38152b) ((C38333d) aVar).getData()).f97165f;
                if (list3 != null) {
                    Iterable<C38151a> iterable = list3;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C38151a aVar2 : iterable) {
                        arrayList.add(aVar2.f97158a);
                    }
                    list2 = (List) arrayList;
                } else {
                    list2 = C52575l.m112097a();
                }
                if (m85635i()) {
                    C26832a aVar3 = this.f70700f;
                    C52711k.m112236a((Object) aVar3, "mModel");
                    Collection collection = ((C38152b) ((C38333d) aVar3).getData()).f97165f;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = true;
                    }
                }
                cVar.mo47026b(list2, z2);
                return;
            }
            C26832a aVar4 = this.f70700f;
            C52711k.m112236a((Object) aVar4, "mModel");
            Collection collection2 = ((C38152b) ((C38333d) aVar4).getData()).f97165f;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            }
            if (z2) {
                ((C26877c) this.f70701g).aJ_();
                return;
            }
            C26877c cVar2 = (C26877c) this.f70701g;
            C26832a aVar5 = this.f70700f;
            C52711k.m112236a((Object) aVar5, "mModel");
            List<C38151a> list4 = ((C38152b) ((C38333d) aVar5).getData()).f97165f;
            if (list4 != null) {
                Iterable<C38151a> iterable2 = list4;
                Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
                for (C38151a aVar6 : iterable2) {
                    arrayList2.add(aVar6.f97158a);
                }
                list = (List) arrayList2;
            } else {
                list = C52575l.m112097a();
            }
            cVar2.mo47018a(list, m85635i());
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (m85634h()) {
            if (((C38333d) this.f70700f).f97560a) {
                ((C26877c) this.f70701g).mo47028c(exc);
            } else {
                ((C26877c) this.f70701g).mo47025b(exc);
            }
        }
    }
}
