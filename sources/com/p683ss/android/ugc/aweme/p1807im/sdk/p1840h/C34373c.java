package com.p683ss.android.ugc.aweme.p1807im.sdk.p1840h;

import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.FamiliarsRelationFetchSetting;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34386a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34940c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.RelationTypeParameters;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1905g.C35447b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.h.c */
public final class C34373c implements C35447b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88737a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34373c.class), "relationConfig", "getRelationConfig()Lcom/ss/android/ugc/aweme/im/sdk/abtest/FamiliarsRelationFetchConfig;"))};

    /* renamed from: b */
    private Map<String, Integer> f88738b = new LinkedHashMap();

    /* renamed from: c */
    private final C52668f f88739c = C52732g.m112285a(C34374a.f88740a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.h.c$a */
    static final class C34374a extends C52712l implements C52670a<FamiliarsRelationFetchConfig> {

        /* renamed from: a */
        public static final C34374a f88740a = new C34374a();

        C34374a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return FamiliarsRelationFetchSetting.INSTANCE.getFamiliarsRelationConfig();
        }
    }

    /* renamed from: a */
    public final void mo72370a() {
        if (C35265e.m79727a()) {
            C34940c.m79080c();
        }
    }

    /* renamed from: a */
    public final String mo72369a(String str) {
        C52711k.m112240b(str, "uid");
        if (this.f88738b.isEmpty()) {
            Map c = C34386a.m78287a().mo72388c();
            Map<String, Integer> map = this.f88738b;
            C52711k.m112236a((Object) c, "result");
            map.putAll(c);
        }
        IMUser a = C34010e.m77748a().mo71952a(str);
        String str2 = "";
        if (a == null) {
            return str2;
        }
        RelationTypeParameters[] relationTypeList = ((FamiliarsRelationFetchConfig) this.f88739c.getValue()).getRelationTypeList();
        if (relationTypeList == null) {
            return str2;
        }
        Collection arrayList = new ArrayList(relationTypeList.length);
        for (RelationTypeParameters relationTypeParameters : relationTypeList) {
            int type = relationTypeParameters.getType();
            Integer num = (Integer) this.f88738b.get(a.getSecUid());
            if (num != null && type == num.intValue()) {
                return relationTypeParameters.getEvent();
            }
            arrayList.add(C52860x.f131107a);
        }
        return str2;
    }
}
