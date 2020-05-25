package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
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
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Comparator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f */
public final class C34960f extends C35003i {

    /* renamed from: c */
    public static final C34961a f89971c = new C34961a(null);

    /* renamed from: d */
    private final String f89972d;

    /* renamed from: e */
    private volatile List<String> f89973e;

    /* renamed from: f */
    private final C34916c f89974f;

    /* renamed from: j */
    private final C34933g<IMContact> f89975j;

    /* renamed from: k */
    private C34904a<IMContact> f89976k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f$a */
    public static final class C34961a {
        private C34961a() {
        }

        public /* synthetic */ C34961a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f$b */
    static final class C34962b extends C52712l implements C52671b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a */
        public static final C34962b f89977a = new C34962b();

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f$b$a */
        public static final class C34963a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C52594a.m112153a(Integer.valueOf(((IMUser) t2).getFollowStatus()), Integer.valueOf(((IMUser) t).getFollowStatus()));
            }
        }

        C34962b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "list");
            return C52575l.m112122a((Iterable<? extends T>) list, (Comparator<? super T>) new C34963a<Object>());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.f$c */
    static final /* synthetic */ class C34964c extends C52710j implements C52671b<C34907c<IMContact>, Boolean> {
        C34964c(C34960f fVar) {
            super(1, fVar);
        }

        public final String getName() {
            return "intercept";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34960f.class);
        }

        public final String getSignature() {
            return "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/core/core/CombinedLoader$InterceptPayload;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34907c cVar = (C34907c) obj;
            C52711k.m112240b(cVar, "p1");
            return Boolean.valueOf(((C34960f) this.receiver).mo73060a(cVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C34922e<IMContact> mo72985b() {
        if (this.f89976k != null) {
            C34904a<IMContact> aVar = this.f89976k;
            if (aVar == null) {
                C52711k.m112234a();
            }
            return aVar;
        }
        this.f89976k = C34906b.m79022a().mo73030a(this.f89975j).mo73031a((C52671b<? super C34907c<R>, Boolean>) new C34964c<Object,Boolean>(this)).mo73029a((C34920d<R>) this).f89896a;
        C34904a<IMContact> aVar2 = this.f89976k;
        if (aVar2 == null) {
            C52711k.m112234a();
        }
        return aVar2;
    }

    public C34960f(C34958a aVar) {
        String str;
        C52711k.m112240b(aVar, "parameters");
        super(aVar);
        if (aVar.f89970f) {
            str = C34387b.m78300d();
        } else {
            str = C34387b.m78304h();
        }
        this.f89972d = str;
        C34917a a = C34918b.m79034a();
        String str2 = this.f89972d;
        C52711k.m112236a((Object) str2, "followSql");
        this.f89974f = (C34916c) a.mo73033a(str2).mo73034a(false).mo73042a(100).mo73044b(C34962b.f89977a).mo73023b();
        this.f89975j = C34934a.m79071a().mo73047a((C34923f<?, R>) mo72982a()).mo73047a((C34923f<?, R>) this.f89974f);
    }

    /* renamed from: a */
    public final boolean mo73060a(C34907c<IMContact> cVar) {
        List<R> list;
        if (cVar.f89899c != mo72982a() || cVar.f89898b.size() <= 15) {
            list = cVar.f89898b;
        } else {
            list = cVar.f89898b.subList(0, 15);
        }
        cVar.f89897a.put(cVar.f89899c, list);
        if (cVar.f89899c != mo72982a() || !(!list.isEmpty())) {
            if (cVar.f89899c == this.f89974f && ((C34916c) cVar.f89899c).f89912e == 1 && (!list.isEmpty())) {
                ((IMContact) list.get(0)).setType(3);
            }
            return false;
        }
        ((IMContact) list.get(0)).setType(2);
        this.f89973e = m78959a(list);
        return true;
    }
}
