package com.p683ss.android.ugc.aweme.detail.operators;

import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl */
public final class ProfileDetailPageOperatorServiceImpl implements IDetailPageOperatorService {

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl$a */
    public static final class C27397a implements C27422am {
        C27397a() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27473x(aVar, true, bVar.getUid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl$b */
    public static final class C27398b implements C27422am {
        C27398b() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27473x(aVar, false, bVar.getUid());
        }
    }

    public final HashMap<String, C27422am> getOperatorMap() {
        HashMap<String, C27422am> hashMap = new HashMap<>();
        Map map = hashMap;
        map.put("from_profile_self", new C27397a());
        map.put("from_profile_other", new C27398b());
        return hashMap;
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
