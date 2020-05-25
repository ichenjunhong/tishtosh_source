package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.net.C26923f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchSetting;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34386a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34969a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.FamiliarRelation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.FamiliarsRelationFetchResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.C35056a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.RelationTypeParameters;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c */
public final class C34940c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89942a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34940c.class), "relationConfig", "getRelationConfig()Lcom/ss/android/ugc/aweme/im/sdk/abtest/FamiliarsRelationFetchConfig;"))};

    /* renamed from: b */
    static Map<Integer, C34941a> f89943b = new LinkedHashMap();

    /* renamed from: c */
    static volatile boolean f89944c;

    /* renamed from: d */
    public static final C34940c f89945d;

    /* renamed from: e */
    private static final C52668f f89946e = C52732g.m112285a(C34943c.f89952a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c$a */
    public static final class C34941a {

        /* renamed from: a */
        public int f89947a;

        /* renamed from: b */
        public int f89948b;

        /* renamed from: c */
        public int f89949c;

        /* renamed from: d */
        public boolean f89950d = true;

        public C34941a(int i) {
            this.f89947a = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c$b */
    static final class C34942b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C34942b f89951a = new C34942b();

        C34942b() {
        }

        public final /* synthetic */ Object call() {
            boolean z;
            boolean z2;
            boolean z3;
            C34940c cVar = C34940c.f89945d;
            C35284t a = C34940c.m79078a();
            C52711k.m112236a((Object) a, "sp");
            if (System.currentTimeMillis() - a.mo73391Q() >= cVar.mo73050b().getFetchInterval() * 1000) {
                z = true;
            } else {
                z = false;
            }
            if (z && !C34953d.m79086a(C11010c.m22280a())) {
                C34940c.f89944c = true;
            } else if (z) {
                C34940c cVar2 = C34940c.f89945d;
                C34940c.f89943b.clear();
                C34386a.m78287a();
                C34386a.m78289d();
                RelationTypeParameters[] relationTypeList = cVar2.mo73050b().getRelationTypeList();
                if (relationTypeList == null) {
                    C52711k.m112234a();
                }
                for (RelationTypeParameters relationTypeParameters : relationTypeList) {
                    C34940c.f89943b.put(Integer.valueOf(relationTypeParameters.getType()), new C34941a(relationTypeParameters.getType()));
                }
                for (boolean z4 = true; z4 && C35265e.m79727a(); z4 = z2) {
                    JSONArray jSONArray = new JSONArray();
                    for (Entry value : C34940c.f89943b.entrySet()) {
                        C34941a aVar = (C34941a) value.getValue();
                        if (aVar.f89950d) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("relation_type", aVar.f89947a);
                            jSONObject.put("count", aVar.f89948b);
                            jSONObject.put("cursor", aVar.f89949c);
                            jSONArray.put(jSONObject);
                        }
                    }
                    String jSONArray2 = jSONArray.toString();
                    C52711k.m112236a((Object) jSONArray2, "list.toString()");
                    FamiliarsRelationFetchResponse a2 = C34940c.m79077a(jSONArray2);
                    if (a2 == null) {
                        break;
                    }
                    List<FamiliarRelation> relations = a2.getRelations();
                    if (relations == null) {
                        break;
                    }
                    z2 = false;
                    for (FamiliarRelation familiarRelation : relations) {
                        C52711k.m112236a((Object) familiarRelation, "relation");
                        if (C34940c.m79079a(familiarRelation)) {
                            C34941a aVar2 = (C34941a) C34940c.f89943b.get(Integer.valueOf(familiarRelation.getRelationType()));
                            if (aVar2 != null) {
                                if (familiarRelation.getHasMore() == 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                aVar2.f89950d = z3;
                            }
                            if (aVar2 != null) {
                                aVar2.f89949c = familiarRelation.getNextCursor();
                            }
                            if (familiarRelation.getHasMore() == 1) {
                                z2 = true;
                            }
                        }
                    }
                }
                C35284t a3 = C34940c.m79078a();
                C52711k.m112236a((Object) a3, "sp");
                a3.mo73437m(System.currentTimeMillis());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.c$c */
    static final class C34943c extends C52712l implements C52670a<FamiliarsRelationFetchConfig> {

        /* renamed from: a */
        public static final C34943c f89952a = new C34943c();

        C34943c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return FamiliarsRelationFetchSetting.INSTANCE.getFamiliarsRelationConfig();
        }
    }

    private C34940c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final FamiliarsRelationFetchConfig mo73050b() {
        return (FamiliarsRelationFetchConfig) f89946e.getValue();
    }

    /* renamed from: a */
    static C35284t m79078a() {
        return C35284t.m79782a();
    }

    /* renamed from: c */
    public static void m79080c() {
        C0013i.m16a((Callable<TResult>) C34942b.f89951a);
    }

    static {
        C34940c cVar = new C34940c();
        f89945d = cVar;
        C47718bf.m103290c(cVar);
    }

    @C53771m
    public final void onEvent(C26923f fVar) {
        if (f89944c) {
            m79080c();
            f89944c = false;
        }
    }

    /* renamed from: a */
    static FamiliarsRelationFetchResponse m79077a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                return (FamiliarsRelationFetchResponse) C34969a.m79101a().getSpotlightRelationOfFriends(str).get();
            } catch (Throwable unused) {
                i++;
            }
        }
        return null;
    }

    /* renamed from: a */
    static boolean m79079a(FamiliarRelation familiarRelation) {
        C35056a aVar = new C35056a(familiarRelation.getRelationType(), familiarRelation.getSecUserIds());
        int i = 0;
        while (i < 2) {
            try {
                C34386a.m78287a().mo72387a(aVar);
                return true;
            } catch (Throwable unused) {
                i++;
            }
        }
        return false;
    }
}
