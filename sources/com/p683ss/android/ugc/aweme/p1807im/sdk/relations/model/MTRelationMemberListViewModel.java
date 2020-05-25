package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model;

import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34957e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34992h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d.C34921a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel */
public final class MTRelationMemberListViewModel extends BaseMemberListViewModel<Object> implements C34920d<IMContact>, C34957e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90175a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MTRelationMemberListViewModel.class), "hasMobHeaderShow", "getHasMobHeaderShow()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MTRelationMemberListViewModel.class), "mRelationModel", "getMRelationModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/SortWeightRelationModel;"))};

    /* renamed from: g */
    public static final C35050a f90176g = new C35050a(null);

    /* renamed from: b */
    public String f90177b;

    /* renamed from: c */
    public SharePackage f90178c;

    /* renamed from: d */
    public BaseContent f90179d;

    /* renamed from: f */
    public List<? extends IMContact> f90180f = C52575l.m112097a();

    /* renamed from: h */
    private final C52668f f90181h = C52732g.m112285a(C35051b.f90183a);

    /* renamed from: i */
    private final C52668f f90182i = C52732g.m112285a(new C35053d(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel$a */
    public static final class C35050a {
        private C35050a() {
        }

        public /* synthetic */ C35050a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel$b */
    static final class C35051b extends C52712l implements C52670a<Set<String>> {

        /* renamed from: a */
        public static final C35051b f90183a = new C35051b();

        C35051b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel$c */
    static final class C35052c extends C52712l implements C52671b<List<? extends C33367a>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MTRelationMemberListViewModel f90184a;

        C35052c(MTRelationMemberListViewModel mTRelationMemberListViewModel) {
            this.f90184a = mTRelationMemberListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            List list = (List) obj;
            if (list != null) {
                MTRelationMemberListViewModel mTRelationMemberListViewModel = this.f90184a;
                Iterable<C33367a> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C33367a aVar : iterable) {
                    IMUser user = aVar.getUser();
                    if (user == null) {
                        user = new IMUser();
                        C11206o member = aVar.getMember();
                        String str = null;
                        if (member != null) {
                            obj2 = Long.valueOf(member.getUid());
                        } else {
                            obj2 = null;
                        }
                        user.setUid(String.valueOf(obj2));
                        C11206o member2 = aVar.getMember();
                        if (member2 != null) {
                            str = member2.getAlias();
                        }
                        user.setNickName(str);
                    }
                    arrayList.add(user);
                }
                mTRelationMemberListViewModel.mo73162a((List) arrayList);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel$d */
    static final class C35053d extends C52712l implements C52670a<C34992h> {

        /* renamed from: a */
        final /* synthetic */ MTRelationMemberListViewModel f90185a;

        C35053d(MTRelationMemberListViewModel mTRelationMemberListViewModel) {
            this.f90185a = mTRelationMemberListViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            boolean z = false;
            if (this.f90185a.f90193j == 0 || this.f90185a.f90193j == 4) {
                i = 0;
                z = true;
            } else {
                i = 2;
            }
            C34958a aVar = new C34958a(i, z);
            aVar.f89967c = true;
            C34992h hVar = new C34992h(aVar);
            hVar.mo72981a((C34920d<IMContact>) this.f90185a);
            hVar.mo73112a((C34957e) this.f90185a);
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel$e */
    static final class C35054e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f90186a;

        /* renamed from: b */
        final /* synthetic */ MTRelationMemberListViewModel f90187b;

        /* renamed from: c */
        final /* synthetic */ String f90188c;

        C35054e(List list, MTRelationMemberListViewModel mTRelationMemberListViewModel, String str) {
            this.f90186a = list;
            this.f90187b = mTRelationMemberListViewModel;
            this.f90188c = str;
        }

        public final /* synthetic */ Object call() {
            return C34010e.m77748a().mo71957a(this.f90186a, this.f90188c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel$f */
    static final class C35055f<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ MTRelationMemberListViewModel f90189a;

        /* renamed from: b */
        final /* synthetic */ String f90190b;

        C35055f(MTRelationMemberListViewModel mTRelationMemberListViewModel, String str) {
            this.f90189a = mTRelationMemberListViewModel;
            this.f90190b = str;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "result");
            if (iVar.mo26b()) {
                this.f90189a.f90195l.postValue(iVar.mo34e());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: f */
    private final C34992h m79234f() {
        return (C34992h) this.f90182i.getValue();
    }

    /* renamed from: e */
    public final Set<String> mo73164e() {
        return (Set) this.f90181h.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        m79234f().mo72988c();
        m79234f().mo73114j();
    }

    /* renamed from: g */
    private final void m79235g() {
        List d = m79234f().mo72989d();
        if (!d.isEmpty()) {
            mo72984a(d, m79234f().mo72990e());
        } else {
            m79234f().mo72991f();
        }
    }

    /* renamed from: a */
    public final void mo72357a() {
        int i = this.f90193j;
        if (i != 4) {
            switch (i) {
                case 0:
                case 1:
                    m79235g();
                    return;
            }
        } else {
            String str = this.f90177b;
            if (str != null) {
                C34238a.m78110a().mo72224a(str, (C52671b<? super List<C33367a>, C52860x>) new C35052c<Object,C52860x>(this));
            }
            m79235g();
        }
    }

    /* renamed from: a */
    public final void mo73162a(List<? extends IMContact> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f90180f = list;
    }

    /* renamed from: b */
    public final void mo72986b(Throwable th) {
        C52711k.m112240b(th, "t");
        C34921a.m79039a(this, th);
    }

    /* renamed from: a */
    public final void mo72983a(Throwable th) {
        C52711k.m112240b(th, "t");
        this.f90194k.postValue(new ArrayList());
        C32458a.m75148a(th);
    }

    /* renamed from: c */
    public final void mo73057c(Throwable th) {
        C52711k.m112240b(th, "t");
        this.f90194k.postValue(new ArrayList());
        C32458a.m75148a(th);
    }

    /* renamed from: b */
    public final void mo73163b(List<? extends IMContact> list) {
        C52711k.m112240b(list, "contactList");
        List e = C52575l.m112139e((Collection<? extends T>) mo73183o());
        for (IMContact iMContact : list) {
            if (e.contains(iMContact)) {
                e.remove(iMContact);
            } else {
                e.add(iMContact);
            }
        }
        this.f90199p.postValue(e);
    }

    /* renamed from: a */
    public final void mo72358a(String str) {
        List list;
        if (str != null) {
            this.f90200q.postValue(str);
            switch (this.f90193j) {
                case 0:
                case 1:
                case 4:
                    m79234f().mo73113a(str);
                    break;
                case 5:
                case 6:
                    List list2 = (List) this.f90194k.getValue();
                    if (list2 != null) {
                        Iterable<IMContact> iterable = list2;
                        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                        for (IMContact iMContact : iterable) {
                            if (iMContact != null) {
                                arrayList.add((IMUser) iMContact);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                            }
                        }
                        list = (List) arrayList;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        C0013i.m16a((Callable<TResult>) new C35054e<TResult>(list, this, str)).mo19a((C0011g<TResult, TContinuationResult>) new C35055f<TResult,TContinuationResult>(this, str));
                        break;
                    }
                    break;
            }
            if (str != null) {
                return;
            }
        }
        MTRelationMemberListViewModel mTRelationMemberListViewModel = this;
        mTRelationMemberListViewModel.f90200q.postValue("");
        mTRelationMemberListViewModel.f90195l.postValue(C52575l.m112097a());
    }

    /* renamed from: a */
    public final void mo73056a(List<IMContact> list, String str) {
        C52711k.m112240b(list, "list");
        C52711k.m112240b(str, "keyword");
        this.f90195l.postValue(list);
    }

    /* renamed from: b */
    public final void mo72987b(List<IMContact> list, boolean z) {
        C52711k.m112240b(list, "list");
        C34921a.m79040a(this, list, z);
    }

    /* renamed from: a */
    public final void mo72984a(List<IMContact> list, boolean z) {
        Object obj;
        boolean z2;
        C52711k.m112240b(list, "list");
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Collection collection = list;
        arrayList.addAll(collection);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((IMContact) obj).getType() == 3) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        IMContact iMContact = (IMContact) obj;
        if (iMContact != null) {
            int lastIndexOf = arrayList.lastIndexOf(iMContact);
            List g = C52575l.m112143g((Iterable<? extends T>) arrayList.subList(0, lastIndexOf));
            List subList = arrayList.subList(lastIndexOf, arrayList.size());
            arrayList2.addAll(g);
            arrayList2.addAll(subList);
        } else {
            arrayList2.addAll(collection);
        }
        this.f90194k.postValue(arrayList2);
        this.f90196m.postValue(C52856t.m112465a(m79234f().mo73111i(), m79234f().mo73110h()));
    }
}
