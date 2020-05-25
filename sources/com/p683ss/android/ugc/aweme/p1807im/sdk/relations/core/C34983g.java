package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchSetting;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h.C34373c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.ImServiceProvider;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34899b.C34900a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34899b.C34901b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a.C34905a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a.C34906b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34904a.C34907c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34915b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34916c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34916c.C34917a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34916c.C34918b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34922e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34923f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34933g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34933g.C34934a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1883d.C34954a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g */
public final class C34983g extends C34871a {

    /* renamed from: c */
    static final /* synthetic */ C52767h[] f90016c = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34983g.class), "relationConfig", "getRelationConfig()Lcom/ss/android/ugc/aweme/im/sdk/abtest/FamiliarsRelationFetchConfig;"))};

    /* renamed from: f */
    public static final C34984a f90017f = new C34984a(null);

    /* renamed from: d */
    public List<String> f90018d;

    /* renamed from: e */
    public volatile List<String> f90019e;

    /* renamed from: g */
    private final C52668f f90020g = C52732g.m112285a(C34989f.f90033a);

    /* renamed from: h */
    private final String f90021h;

    /* renamed from: i */
    private final String f90022i;

    /* renamed from: j */
    private final C34899b f90023j;

    /* renamed from: k */
    private final C34899b f90024k;

    /* renamed from: l */
    private final C34916c f90025l;

    /* renamed from: m */
    private final C34916c f90026m;

    /* renamed from: n */
    private final C34933g<IMContact> f90027n;

    /* renamed from: o */
    private C34904a<IMContact> f90028o;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$a */
    public static final class C34984a {
        private C34984a() {
        }

        public /* synthetic */ C34984a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$b */
    static final class C34985b extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34983g f90029a;

        C34985b(C34983g gVar) {
            this.f90029a = gVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90029a.f90019e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$c */
    static final class C34986c extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34983g f90030a;

        C34986c(C34983g gVar) {
            this.f90030a = gVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90030a.f90018d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$d */
    static final class C34987d extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34983g f90031a;

        C34987d(C34983g gVar) {
            this.f90031a = gVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90031a.f90019e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$e */
    static final class C34988e extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C34983g f90032a;

        C34988e(C34983g gVar) {
            this.f90032a = gVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f90032a.f90018d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$f */
    static final class C34989f extends C52712l implements C52670a<FamiliarsRelationFetchConfig> {

        /* renamed from: a */
        public static final C34989f f90033a = new C34989f();

        C34989f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return FamiliarsRelationFetchSetting.INSTANCE.getFamiliarsRelationConfig();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$g */
    static final /* synthetic */ class C34990g extends C52710j implements C52670a<Boolean> {
        C34990g(C34983g gVar) {
            super(0, gVar);
        }

        public final String getName() {
            return "interceptStart";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34983g.class);
        }

        public final String getSignature() {
            return "interceptStart()Z";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0086, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78307k() > 0) goto L_0x0088;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008b, code lost:
            if (r0 == false) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
            if (r3 > 0) goto L_0x0088;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r8 = this;
                java.lang.Object r0 = r8.receiver
                com.ss.android.ugc.aweme.im.sdk.relations.core.g r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34983g) r0
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r0 = r0.f89829b
                boolean r0 = r0.f89965a
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x008d
                com.ss.android.ugc.aweme.im.sdk.abtest.c r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
                int r0 = r0.mo70574g()
                if (r0 == r2) goto L_0x0079
                r3 = 2
                if (r0 != r3) goto L_0x0018
                goto L_0x0079
            L_0x0018:
                com.ss.android.ugc.aweme.im.sdk.i.c.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                java.lang.String r3 = "IMUserDao.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                int r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78308l()
                com.ss.android.ugc.aweme.im.sdk.i.c.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                java.lang.String r4 = "IMUserDao.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                int r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78309m()
                com.ss.android.ugc.aweme.im.sdk.abtest.c r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
                d.f r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86224b
                java.lang.Object r4 = r4.getValue()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.ss.android.ugc.aweme.im.sdk.abtest.c r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
                d.f r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86225c
                java.lang.Object r5 = r5.getValue()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "SharePanelRelationModel checkShowHeader: "
                r6.<init>(r7)
                r6.append(r0)
                java.lang.String r7 = ", "
                r6.append(r7)
                r6.append(r3)
                java.lang.String r7 = ", "
                r6.append(r7)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r4)
                r4 = 15
                if (r0 <= r4) goto L_0x0074
                goto L_0x0088
            L_0x0074:
                if (r5 != r2) goto L_0x008a
                if (r3 <= 0) goto L_0x008a
                goto L_0x0088
            L_0x0079:
                com.ss.android.ugc.aweme.im.sdk.i.c.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                java.lang.String r3 = "IMUserDao.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
                int r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78307k()
                if (r0 <= 0) goto L_0x008a
            L_0x0088:
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x008e
            L_0x008d:
                r1 = 1
            L_0x008e:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34983g.C34990g.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.g$h */
    static final /* synthetic */ class C34991h extends C52710j implements C52671b<C34907c<IMContact>, Boolean> {
        C34991h(C34983g gVar) {
            super(1, gVar);
        }

        public final String getName() {
            return "intercept";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34983g.class);
        }

        public final String getSignature() {
            return "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/core/core/CombinedLoader$InterceptPayload;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34907c cVar = (C34907c) obj;
            C52711k.m112240b(cVar, "p1");
            return Boolean.valueOf(((C34983g) this.receiver).mo73108a(cVar));
        }
    }

    /* renamed from: h */
    private final FamiliarsRelationFetchConfig m79120h() {
        return (FamiliarsRelationFetchConfig) this.f90020g.getValue();
    }

    /* renamed from: b */
    public final /* synthetic */ C34922e mo72985b() {
        C34904a<IMContact> aVar;
        if (this.f90028o != null) {
            aVar = this.f90028o;
            if (aVar == null) {
                C52711k.m112234a();
            }
        } else {
            C34905a a = C34906b.m79022a().mo73030a(this.f90027n);
            C34983g gVar = this;
            C52670a<Boolean> gVar2 = new C34990g<>(gVar);
            C52711k.m112240b(gVar2, "interceptor");
            C34905a aVar2 = a;
            aVar2.f89896a.f89891c = gVar2;
            this.f90028o = aVar2.mo73031a((C52671b<? super C34907c<R>, Boolean>) new C34991h<Object,Boolean>(gVar)).mo73029a((C34920d<R>) this).f89896a;
            aVar = this.f90028o;
            if (aVar == null) {
                C52711k.m112234a();
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final boolean mo73108a(C34907c<IMContact> cVar) {
        cVar.f89897a.put(cVar.f89899c, cVar.f89898b);
        if (cVar.f89899c == mo72982a()) {
            this.f90019e = m78959a(cVar.f89898b);
            List<String> list = this.f90018d;
            List<String> list2 = this.f90019e;
            if (list2 == null) {
                C52711k.m112234a();
            }
            list.addAll(C52575l.m112139e((Collection<? extends T>) list2));
            C34954a.m79087a(cVar.f89898b);
        }
        if (C33229c.f86227e.mo70574g() == 2 && (cVar.f89899c == this.f90023j || cVar.f89899c == this.f90024k)) {
            this.f90018d.addAll(C52575l.m112139e((Collection<? extends T>) m78959a(cVar.f89898b)));
        } else {
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
        if (C34915b.m79023a(cVar.f89897a).size() > 15) {
            return false;
        }
        return true;
    }

    public C34983g(C34958a aVar) {
        String str;
        String str2;
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
        if (C33229c.f86227e.mo70570c()) {
            str = C34387b.m78301e();
        } else {
            str = C34387b.m78300d();
        }
        this.f90021h = str;
        if (C33229c.f86227e.mo70570c()) {
            str2 = C34387b.m78302f();
        } else {
            str2 = C34387b.m78303g();
        }
        this.f90022i = str2;
        this.f90018d = new ArrayList();
        C34900a a = C34901b.m79013a().mo73019a((C52670a<? extends List<String>>) new C34985b<Object>(this)).mo73021a(m79120h().getRelationTypeList());
        String e = C34387b.m78301e();
        C52711k.m112236a((Object) e, "IMUserDao.getFollowEachO…dFilterCannotSendMsgSql()");
        this.f90023j = (C34899b) a.mo73020a(e).mo73042a(15).mo73023b();
        C34900a a2 = C34901b.m79013a();
        String f = C34387b.m78302f();
        C52711k.m112236a((Object) f, "IMUserDao.getFollowOneAndFilterCannotSendMsgSql()");
        this.f90024k = (C34899b) a2.mo73020a(f).mo73019a((C52670a<? extends List<String>>) new C34987d<Object>(this)).mo73021a(m79120h().getRelationTypeList()).mo73042a(100).mo73023b();
        C34917a a3 = C34918b.m79034a();
        String str3 = this.f90021h;
        C52711k.m112236a((Object) str3, "followEachOtherSql");
        this.f90025l = (C34916c) a3.mo73033a(str3).mo73034a(false).mo73032a((C52670a<? extends List<String>>) new C34986c<Object>(this)).mo73042a(100).mo73023b();
        C34917a a4 = C34918b.m79034a();
        String str4 = this.f90022i;
        C52711k.m112236a((Object) str4, "followOneSql");
        this.f90026m = (C34916c) a4.mo73033a(str4).mo73034a(false).mo73032a((C52670a<? extends List<String>>) new C34988e<Object>(this)).mo73042a(100).mo73023b();
        C34933g<IMContact> a5 = C34934a.m79071a();
        a5.mo73047a((C34923f<?, R>) mo72982a());
        if (C33229c.f86227e.mo70574g() == 2) {
            a5.mo73047a((C34923f<?, R>) this.f90023j);
            a5.mo73047a((C34923f<?, R>) this.f90024k);
        }
        a5.mo73047a((C34923f<?, R>) this.f90025l);
        a5.mo73047a((C34923f<?, R>) this.f90026m);
        this.f90027n = a5;
    }

    /* renamed from: a */
    public final void mo72984a(List<IMContact> list, boolean z) {
        C52711k.m112240b(list, "list");
        if (list.size() > 15) {
            list = list.subList(0, 15);
        }
        super.mo72984a(list, false);
    }
}
