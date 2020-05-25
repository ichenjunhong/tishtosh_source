package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34923f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34923f.C34924a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.RelationTypeParameters;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b */
public final class C34899b extends C34923f<IMUser, IMContact> {

    /* renamed from: e */
    public static final C34901b f89878e = new C34901b(null);

    /* renamed from: a */
    public List<String> f89879a;

    /* renamed from: b */
    public C52670a<? extends List<String>> f89880b;

    /* renamed from: c */
    public String f89881c;

    /* renamed from: d */
    public RelationTypeParameters[] f89882d;

    /* renamed from: f */
    private final C52671b<IMUser, IMContact> f89883f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b$a */
    public static final class C34900a extends C34924a<C34899b, IMUser, IMContact> {

        /* renamed from: a */
        public final C34899b f89884a = new C34899b(null);

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C34923f mo73023b() {
            return this.f89884a;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C34923f mo73022a() {
            return this.f89884a;
        }

        /* renamed from: a */
        public final C34900a mo73021a(RelationTypeParameters[] relationTypeParametersArr) {
            C34900a aVar = this;
            aVar.f89884a.f89882d = relationTypeParametersArr;
            return aVar;
        }

        /* renamed from: a */
        public final C34900a mo73019a(C52670a<? extends List<String>> aVar) {
            C52711k.m112240b(aVar, "filter");
            C34900a aVar2 = this;
            aVar2.f89884a.f89880b = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final C34900a mo73020a(String str) {
            C52711k.m112240b(str, "sql");
            C34900a aVar = this;
            aVar.f89884a.f89881c = str;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b$b */
    public static final class C34901b {
        private C34901b() {
        }

        /* renamed from: a */
        public static C34900a m79013a() {
            return new C34900a();
        }

        public /* synthetic */ C34901b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b$c */
    static final class C34902c extends C52712l implements C52671b<IMUser, IMUser> {

        /* renamed from: a */
        public static final C34902c f89885a = new C34902c();

        C34902c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IMUser iMUser = (IMUser) obj;
            C52711k.m112240b(iMUser, "it");
            return iMUser;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b$d */
    public static final class C34903d<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f89886a;

        /* renamed from: b */
        final /* synthetic */ Map f89887b;

        public C34903d(Map map, Map map2) {
            this.f89886a = map;
            this.f89887b = map2;
        }

        public final int compare(T t, T t2) {
            return C52594a.m112153a((String) this.f89886a.get(this.f89887b.get(((IMUser) t).getSecUid())), (String) this.f89886a.get(this.f89887b.get(((IMUser) t2).getSecUid())));
        }
    }

    /* renamed from: a */
    public final C52671b<IMUser, IMContact> mo73015a() {
        return this.f89883f;
    }

    private C34899b() {
        this.f89883f = C34902c.f89885a;
    }

    public final List<IMUser> bo_() {
        throw new UnsupportedOperationException("FamiliarsLoader not support load more");
    }

    /* renamed from: b */
    public final boolean mo73016b() {
        boolean z;
        if (!super.mo73016b()) {
            return false;
        }
        CharSequence charSequence = this.f89881c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r2 == null) goto L_0x0026;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> mo73018c() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.im.sdk.i.c.a r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34386a.m78287a()
            java.util.Map r0 = r0.mo72388c()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0016
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0016:
            com.ss.android.ugc.aweme.im.sdk.i.c.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
            d.f.a.a<? extends java.util.List<java.lang.String>> r2 = r8.f89880b
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r2.invoke()
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0028
        L_0x0026:
            java.util.List<java.lang.String> r2 = r8.f89879a
        L_0x0028:
            r3 = 15
            java.lang.String r4 = r8.f89881c
            r5 = 0
            java.util.List r1 = r1.mo72390a(r2, r3, r5, r4)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            com.ss.android.ugc.aweme.im.sdk.relations.model.RelationTypeParameters[] r3 = r8.f89882d
            if (r3 == 0) goto L_0x0053
            int r4 = r3.length
        L_0x003d:
            if (r5 >= r4) goto L_0x0053
            r6 = r3[r5]
            int r7 = r6.getType()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = r6.getEvent()
            r2.put(r7, r6)
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0053:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r4 = "userNotFilter"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0065:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0098
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r4
            boolean r5 = r4 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser
            if (r5 == 0) goto L_0x0065
            java.util.Set r5 = r0.keySet()
            java.lang.String r6 = r4.getSecUid()
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = r4.getSecUid()
            java.lang.Object r5 = r0.get(r5)
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4.setRecType(r5)
            r3.add(r4)
            goto L_0x0065
        L_0x0098:
            int r1 = r3.size()
            r4 = 1
            if (r1 <= r4) goto L_0x00a9
            com.ss.android.ugc.aweme.im.sdk.relations.core.b$d r1 = new com.ss.android.ugc.aweme.im.sdk.relations.core.b$d
            r1.<init>(r2, r0)
            java.util.Comparator r1 = (java.util.Comparator) r1
            p2628d.p2629a.C52575l.m112105a(r3, r1)
        L_0x00a9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34899b.mo73018c():java.util.List");
    }

    public /* synthetic */ C34899b(C52707g gVar) {
        this();
    }
}
