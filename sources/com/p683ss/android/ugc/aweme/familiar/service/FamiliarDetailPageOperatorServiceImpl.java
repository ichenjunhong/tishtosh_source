package com.p683ss.android.ugc.aweme.familiar.service;

import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al;
import com.p683ss.android.ugc.aweme.detail.operators.C27422am;
import com.p683ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.FamiliarDetailPageOperatorServiceImpl */
public final class FamiliarDetailPageOperatorServiceImpl extends CommonFamiliarDetailPageOperatorServiceImpl {

    /* renamed from: com.ss.android.ugc.aweme.familiar.service.FamiliarDetailPageOperatorServiceImpl$a */
    public static final class C29647a implements C27422am {
        C29647a() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return null;
        }
    }

    public final HashMap<String, C27422am> getOperatorMap() {
        HashMap<String, C27422am> operatorMap = super.getOperatorMap();
        if (operatorMap != null) {
            operatorMap.put("from_familiar_tab", new C29647a());
        }
        return operatorMap;
    }

    public static IDetailPageOperatorService createIDetailPageOperatorServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IDetailPageOperatorService.class);
        if (a != null) {
            return (IDetailPageOperatorService) a;
        }
        if (C27991b.f73476ag == null) {
            synchronized (IDetailPageOperatorService.class) {
                if (C27991b.f73476ag == null) {
                    C27991b.f73476ag = new RecommendFeedDetailPageOperatorServiceImpl();
                }
            }
        }
        return (RecommendFeedDetailPageOperatorServiceImpl) C27991b.f73476ag;
    }
}
