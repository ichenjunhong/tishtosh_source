package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.i */
public abstract class C35003i extends C34871a {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f90060g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35003i.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: c */
    private boolean f90061c;

    /* renamed from: d */
    private final C52668f f90062d = C52732g.m112285a(C35004a.f90065a);

    /* renamed from: h */
    String f90063h;

    /* renamed from: i */
    public C34957e f90064i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.i$a */
    static final class C35004a extends C52712l implements C52670a<C1689b> {

        /* renamed from: a */
        public static final C35004a f90065a = new C35004a();

        C35004a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1689b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.i$b */
    static final class C35005b<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ List f90066a;

        /* renamed from: b */
        final /* synthetic */ String f90067b;

        C35005b(List list, String str) {
            this.f90066a = list;
            this.f90067b = str;
        }

        public final void subscribe(C2204x<List<IMUser>> xVar) {
            C52711k.m112240b(xVar, "source");
            List<IMUser> a = C34010e.m77748a().mo71958a(this.f90066a, this.f90067b, true);
            List arrayList = new ArrayList();
            for (IMUser iMUser : a) {
                if (!arrayList.contains(iMUser)) {
                    C52711k.m112236a((Object) iMUser, "user");
                    arrayList.add(iMUser);
                }
            }
            xVar.mo6282a(arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.i$c */
    static final class C35006c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C35003i f90068a;

        C35006c(C35003i iVar) {
            this.f90068a = iVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            List list = (List) obj;
            C52711k.m112240b(list, "list");
            C35003i iVar = this.f90068a;
            CharSequence charSequence = iVar.f90063h;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                iVar.mo73115k();
            }
            Iterable<IMUser> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (IMUser iMUser : iterable) {
                if (iMUser != null) {
                    arrayList.add(iMUser);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                }
            }
            return C52575l.m112139e((Collection<? extends T>) (List) arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.i$d */
    static final class C35007d<T> implements C1710e<List<IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35003i f90069a;

        /* renamed from: b */
        final /* synthetic */ String f90070b;

        C35007d(C35003i iVar, String str) {
            this.f90069a = iVar;
            this.f90070b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C34957e eVar = this.f90069a.f90064i;
            if (eVar != null) {
                C52711k.m112236a((Object) list, "it");
                eVar.mo73056a(list, this.f90070b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.i$e */
    static final class C35008e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C35003i f90071a;

        C35008e(C35003i iVar) {
            this.f90071a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C34957e eVar = this.f90071a.f90064i;
            if (eVar != null) {
                C52711k.m112236a((Object) th, "it");
                eVar.mo73057c(th);
            }
        }
    }

    /* renamed from: h */
    private final C1689b mo73110h() {
        return (C1689b) this.f90062d.getValue();
    }

    /* renamed from: j */
    public final void mo73114j() {
        this.f90064i = null;
        mo73110h().mo6180a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo73115k() {
        boolean z;
        CharSequence charSequence = this.f90063h;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterable d = mo72989d();
            Collection arrayList = new ArrayList();
            for (Object next : d) {
                if (((IMContact) next) instanceof IMUser) {
                    arrayList.add(next);
                }
            }
            Iterable<IMContact> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact != null) {
                    arrayList2.add((IMUser) iMContact);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
            List list = (List) arrayList2;
            String str = this.f90063h;
            if (str == null) {
                C52711k.m112234a();
            }
            this.f90063h = null;
            C1690c a = C2201v.m6601a((C2205y<T>) new C35005b<T>(list, str)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) new C35006c<Object,Object>(this)).mo6505a((C1710e<? super T>) new C35007d<Object>(this, str), (C1710e<? super Throwable>) new C35008e<Object>(this));
            mo73110h().mo6180a();
            mo73110h().mo6181a(a);
        }
    }

    /* renamed from: a */
    public final void mo73112a(C34957e eVar) {
        C52711k.m112240b(eVar, "subscriber");
        this.f90064i = eVar;
    }

    public C35003i(C34958a aVar) {
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo73113a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90063h = str;
            if (!this.f90061c) {
                mo73115k();
            }
        }
    }
}
