package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchSetting;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34373c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.ImServiceProvider;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34899b.C34900a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34899b.C34901b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a.C34906b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a.C34907c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34916c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34916c.C34917a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34916c.C34918b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34922e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34923f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34933g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34933g.C34934a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1882c.C34947c.C34948a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1883d.C34954a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h */
public class C34992h extends C35003i {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f90034c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34992h.class), "indexCountList", "getIndexCountList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34992h.class), "indexLetterList", "getIndexLetterList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34992h.class), "relationConfig", "getRelationConfig()Lcom/ss/android/ugc/aweme/im/sdk/abtest/FamiliarsRelationFetchConfig;"))};

    /* renamed from: f */
    public static final C34993a f90035f = new C34993a(null);

    /* renamed from: d */
    public List<String> f90036d;

    /* renamed from: e */
    public volatile List<String> f90037e;

    /* renamed from: j */
    private final C52668f f90038j = C52732g.m112285a(C34998f.f90056a);

    /* renamed from: k */
    private final C52668f f90039k = C52732g.m112285a(C34999g.f90057a);

    /* renamed from: l */
    private final String f90040l;

    /* renamed from: m */
    private final C34916c f90041m;

    /* renamed from: n */
    private final boolean f90042n;

    /* renamed from: o */
    private final C52668f f90043o;

    /* renamed from: p */
    private final String f90044p;

    /* renamed from: q */
    private List<IMContact> f90045q;

    /* renamed from: r */
    private final C34899b f90046r;

    /* renamed from: s */
    private final C34899b f90047s;

    /* renamed from: t */
    private final C34916c f90048t;

    /* renamed from: u */
    private final C34916c f90049u;

    /* renamed from: v */
    private final C34933g<IMContact> f90050v;

    /* renamed from: w */
    private C34904a<IMContact> f90051w;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$a */
    public static final class C34993a {
        private C34993a() {
        }

        public /* synthetic */ C34993a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$b */
    static final class C34994b extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34992h f90052a;

        C34994b(C34992h hVar) {
            this.f90052a = hVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90052a.f90037e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$c */
    static final class C34995c extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34992h f90053a;

        C34995c(C34992h hVar) {
            this.f90053a = hVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90053a.f90036d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$d */
    static final class C34996d extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34992h f90054a;

        C34996d(C34992h hVar) {
            this.f90054a = hVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90054a.f90037e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$e */
    static final class C34997e extends C52712l implements C52671b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34958a f90055a;

        C34997e(C34958a aVar) {
            this.f90055a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IMContact iMContact = (IMContact) obj;
            C52711k.m112240b(iMContact, "it");
            return Boolean.valueOf(C34948a.m79085a(this.f90055a).mo73054a(iMContact));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$f */
    static final class C34998f extends C52712l implements C52670a<List<Integer>> {

        /* renamed from: a */
        public static final C34998f f90056a = new C34998f();

        C34998f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$g */
    static final class C34999g extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        public static final C34999g f90057a = new C34999g();

        C34999g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$h */
    static final class C35000h extends C52712l implements C52670a<FamiliarsRelationFetchConfig> {

        /* renamed from: a */
        public static final C35000h f90058a = new C35000h();

        C35000h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return FamiliarsRelationFetchSetting.INSTANCE.getFamiliarsRelationConfig();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$i */
    static final /* synthetic */ class C35001i extends C52710j implements C52671b<C34907c<IMContact>, Boolean> {
        C35001i(C34992h hVar) {
            super(1, hVar);
        }

        public final String getName() {
            return "intercept";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34992h.class);
        }

        public final String getSignature() {
            return "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/core/core/CombinedLoader$InterceptPayload;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34907c cVar = (C34907c) obj;
            C52711k.m112240b(cVar, "p1");
            return Boolean.valueOf(((C34992h) this.receiver).mo73109a(cVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.h$j */
    static final class C35002j extends C52712l implements C52671b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34958a f90059a;

        C35002j(C34958a aVar) {
            this.f90059a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IMContact iMContact = (IMContact) obj;
            C52711k.m112240b(iMContact, "it");
            return Boolean.valueOf(C34948a.m79085a(this.f90059a).mo73054a(iMContact));
        }
    }

    /* renamed from: l */
    private final FamiliarsRelationFetchConfig m79129l() {
        return (FamiliarsRelationFetchConfig) this.f90043o.getValue();
    }

    /* renamed from: h */
    public final List<Integer> mo73110h() {
        return (List) this.f90038j.getValue();
    }

    /* renamed from: i */
    public final List<String> mo73111i() {
        return (List) this.f90039k.getValue();
    }

    /* renamed from: f */
    public final C52860x mo72991f() {
        mo73111i().clear();
        mo73110h().clear();
        return super.mo72991f();
    }

    /* renamed from: b */
    public final /* synthetic */ C34922e mo72985b() {
        C34904a<IMContact> aVar;
        if (this.f90051w != null) {
            aVar = this.f90051w;
            if (aVar == null) {
                C52711k.m112234a();
            }
        } else {
            this.f90051w = C34906b.m79022a().mo73030a(this.f90050v).mo73031a((C52671b<? super C34907c<R>, Boolean>) new C35001i<Object,Boolean>(this)).mo73029a((C34920d<R>) this).f89896a;
            aVar = this.f90051w;
            if (aVar == null) {
                C52711k.m112234a();
            }
        }
        return aVar;
    }

    /* renamed from: d */
    private final void m79128d(C34907c<IMContact> cVar) {
        boolean z;
        List list = (List) cVar.f89897a.get(mo72982a());
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo73111i().add("recent");
            mo73110h().add(Integer.valueOf(list.size()));
        }
    }

    /* renamed from: b */
    private static List<IMContact> m79124b(List<IMContact> list) {
        int i;
        List<IMContact> arrayList = new ArrayList<>();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj != null) {
                IMUser iMUser = (IMUser) obj;
                if (iMUser.getFollowStatus() == 2) {
                    IMUser clone = iMUser.clone();
                    if (arrayList.isEmpty()) {
                        C52711k.m112236a((Object) clone, "clone");
                        clone.setType(5);
                    } else {
                        C52711k.m112236a((Object) clone, "clone");
                        clone.setType(6);
                    }
                    arrayList.add(clone);
                }
                if (i2 == 0) {
                    i = 3;
                } else {
                    i = 0;
                }
                iMUser.setType(i);
                i2++;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final void m79127c(List<IMContact> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        Object obj = null;
        int i3 = 0;
        while (i2 < size) {
            Object obj2 = list.get(i2);
            if (obj2 != null) {
                String initialLetter = ((IMUser) obj2).getInitialLetter();
                CharSequence charSequence = initialLetter;
                if (!TextUtils.isEmpty(charSequence)) {
                    if (obj == null || TextUtils.equals(charSequence, (CharSequence) obj)) {
                        i = i3 + 1;
                    } else {
                        mo73111i().add(obj);
                        mo73110h().add(Integer.valueOf(i3));
                        i = 1;
                    }
                    if (i2 == list.size() - 1) {
                        List i4 = mo73111i();
                        C52711k.m112236a((Object) initialLetter, "lastLetter");
                        i4.add(initialLetter);
                        mo73110h().add(Integer.valueOf(i));
                    }
                    i3 = i;
                    obj = initialLetter;
                }
                i2++;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
    }

    /* renamed from: b */
    private final void m79125b(C34907c<IMContact> cVar) {
        List<R> list;
        int size = cVar.f89898b.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                ((IMContact) cVar.f89898b.get(i)).setType(2);
            } else {
                ((IMContact) cVar.f89898b.get(i)).setType(1);
            }
        }
        Map map = cVar.f89897a;
        C34922e<R> eVar = cVar.f89899c;
        if (cVar.f89898b.size() > 15) {
            list = cVar.f89898b.subList(0, 15);
        } else {
            list = cVar.f89898b;
        }
        map.put(eVar, list);
        if (this.f90042n) {
            this.f90037e = m78959a(cVar.f89898b);
            List<String> list2 = this.f90036d;
            List<String> list3 = this.f90037e;
            if (list3 == null) {
                C52711k.m112234a();
            }
            list2.addAll(C52575l.m112139e((Collection<? extends T>) list3));
        }
        List arrayList = new ArrayList();
        arrayList.addAll(cVar.f89898b);
        C34954a.m79087a(arrayList);
        this.f90045q.clear();
    }

    /* renamed from: a */
    public final boolean mo73109a(C34907c<IMContact> cVar) {
        if ((!C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90046r)) && (!C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90047s))) {
            Iterable<IMContact> iterable = cVar.f89898b;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (IMContact iMContact : iterable) {
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    C34373c familiarService = ImServiceProvider.INSTANCE.getFamiliarService();
                    String uid = iMUser.getUid();
                    C52711k.m112236a((Object) uid, "it.uid");
                    iMUser.setRecType(familiarService.mo72369a(uid));
                }
                arrayList.add(C52860x.f131107a);
            }
        }
        if (cVar.f89899c == mo72982a()) {
            m79125b(cVar);
            return true;
        }
        if (this.f89829b.mo73059b()) {
            m79126c(cVar);
        } else {
            List arrayList2 = new ArrayList();
            List b = m79124b(cVar.f89898b);
            Collection collection = b;
            if (!collection.isEmpty()) {
                mo73111i().add("Friend");
                mo73110h().add(Integer.valueOf(b.size()));
                arrayList2.addAll(collection);
            }
            if (!this.f89829b.f89970f && (!cVar.f89898b.isEmpty())) {
                m79127c(cVar.f89898b);
                arrayList2.addAll(cVar.f89898b);
            }
            cVar.f89897a.put(cVar.f89899c, arrayList2);
        }
        if (C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90049u) || C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90041m)) {
            return false;
        }
        return true;
    }

    public C34992h(C34958a aVar) {
        String str;
        C34933g<IMContact> gVar;
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
        if (aVar.f89970f) {
            str = C34387b.m78300d();
        } else {
            str = C34387b.m78304h();
        }
        this.f90040l = str;
        boolean z = true;
        C34917a a = C34918b.m79034a().mo73034a(true);
        String str2 = this.f90040l;
        C52711k.m112236a((Object) str2, "sortWeightSql");
        this.f90041m = (C34916c) a.mo73033a(str2).mo73042a(-1).mo73045c(new C35002j(aVar)).mo73023b();
        if (C33229c.f86227e.mo70574g() != 2) {
            z = false;
        }
        this.f90042n = z;
        this.f90043o = C52732g.m112285a(C35000h.f90058a);
        this.f90044p = C34387b.m78301e();
        this.f90036d = new ArrayList();
        this.f90045q = new ArrayList();
        C34900a a2 = C34901b.m79013a().mo73019a((C52670a<? extends List<String>>) new C34994b<Object>(this)).mo73021a(m79129l().getRelationTypeList());
        String e = C34387b.m78301e();
        C52711k.m112236a((Object) e, "IMUserDao.getFollowEachO…dFilterCannotSendMsgSql()");
        this.f90046r = (C34899b) a2.mo73020a(e).mo73042a(-1).mo73023b();
        C34900a a3 = C34901b.m79013a();
        String f = C34387b.m78302f();
        C52711k.m112236a((Object) f, "IMUserDao.getFollowOneAndFilterCannotSendMsgSql()");
        this.f90047s = (C34899b) a3.mo73020a(f).mo73019a((C52670a<? extends List<String>>) new C34996d<Object>(this)).mo73021a(m79129l().getRelationTypeList()).mo73042a(-1).mo73023b();
        C34917a a4 = C34918b.m79034a();
        String str3 = this.f90044p;
        C52711k.m112236a((Object) str3, "followEachOtherSql");
        this.f90048t = (C34916c) a4.mo73033a(str3).mo73034a(false).mo73032a((C52670a<? extends List<String>>) new C34995c<Object>(this)).mo73042a(-1).mo73023b();
        C34917a a5 = C34918b.m79034a();
        String h = C34387b.m78304h();
        C52711k.m112236a((Object) h, "IMUserDao.getFollowSql()");
        this.f90049u = (C34916c) a5.mo73033a(h).mo73034a(false).mo73045c(new C34997e(aVar)).mo73042a(-1).mo73023b();
        C34933g gVar2 = null;
        if (this.f90042n) {
            C34933g a6 = C34934a.m79071a();
            if (aVar.mo73059b()) {
                gVar2 = a6;
            }
            if (gVar2 != null) {
                gVar2.mo73047a((C34923f<?, R>) mo72982a());
            }
            gVar = a6.mo73047a((C34923f<?, R>) this.f90046r).mo73047a((C34923f<?, R>) this.f90047s).mo73047a((C34923f<?, R>) this.f90048t).mo73047a((C34923f<?, R>) this.f90049u);
        } else {
            C34933g a7 = C34934a.m79071a();
            if (aVar.mo73059b()) {
                gVar2 = a7;
            }
            if (gVar2 != null) {
                gVar2.mo73047a((C34923f<?, R>) mo72982a());
            }
            gVar = a7.mo73047a((C34923f<?, R>) this.f90041m);
        }
        this.f90050v = gVar;
    }

    /* renamed from: c */
    private final void m79126c(C34907c<IMContact> cVar) {
        int i;
        m79128d(cVar);
        if (!this.f90042n) {
            List arrayList = new ArrayList();
            List b = m79124b(cVar.f89898b);
            Collection collection = b;
            if (!collection.isEmpty()) {
                if (this.f89829b.f89970f) {
                    m79127c(b);
                } else {
                    mo73111i().add("Friend");
                    mo73110h().add(Integer.valueOf(b.size()));
                }
                arrayList.addAll(collection);
            }
            if (!this.f89829b.f89970f && (!cVar.f89898b.isEmpty())) {
                m79127c(cVar.f89898b);
                arrayList.addAll(cVar.f89898b);
            }
            cVar.f89897a.put(cVar.f89899c, arrayList);
            return;
        }
        if (cVar.f89899c == this.f90046r || cVar.f89899c == this.f90047s) {
            this.f90036d.addAll(C52575l.m112139e((Collection<? extends T>) m78959a(cVar.f89898b)));
        }
        if (C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90046r)) {
            int size = cVar.f89898b.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = cVar.f89898b.get(i2);
                if (obj != null) {
                    IMUser iMUser = (IMUser) obj;
                    if (i2 == 0) {
                        iMUser.setType(5);
                    } else {
                        iMUser.setType(6);
                    }
                    i2++;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
        }
        if (C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90047s) || C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90048t)) {
            int size2 = cVar.f89898b.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = cVar.f89898b.get(i3);
                if (obj2 != null) {
                    ((IMUser) obj2).setType(6);
                    i3++;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
        }
        if (C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90046r) || C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90047s) || C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90048t)) {
            this.f90045q.addAll(cVar.f89898b);
        }
        if (C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90048t) && (!this.f90045q.isEmpty())) {
            mo73111i().add("Friend");
            mo73110h().add(Integer.valueOf(this.f90045q.size()));
        }
        if (!this.f89829b.f89970f && (!cVar.f89898b.isEmpty()) && C52711k.m112239a((Object) cVar.f89899c, (Object) this.f90049u)) {
            m79127c(cVar.f89898b);
            int size3 = cVar.f89898b.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = cVar.f89898b.get(i4);
                if (obj3 != null) {
                    IMUser iMUser2 = (IMUser) obj3;
                    if (i4 == 0) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                    iMUser2.setType(i);
                    i4++;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                }
            }
        }
        cVar.f89897a.put(cVar.f89899c, cVar.f89898b);
    }
}
