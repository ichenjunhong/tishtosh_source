package com.p683ss.android.ugc.aweme.feed.operator;

import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al;
import com.p683ss.android.ugc.aweme.detail.operators.C27422am;
import com.p683ss.android.ugc.aweme.detail.operators.C27448l;
import com.p683ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl */
public final class FollowFeedDetailPageOperatorServiceImpl implements IDetailPageOperatorService {

    /* renamed from: com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl$a */
    public static final class C30582a implements C27422am {
        C30582a() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            List uidList = bVar.getUidList();
            C52711k.m112236a((Object) uidList, "param.uidList");
            List blueDotList = bVar.getBlueDotList();
            C52711k.m112236a((Object) blueDotList, "param.blueDotList");
            return new C30584a(uidList, blueDotList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl$b */
    public static final class C30583b implements C27422am {
        C30583b() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27448l(aVar);
        }
    }

    public final HashMap<String, C27422am> getOperatorMap() {
        HashMap<String, C27422am> hashMap = new HashMap<>();
        Map map = hashMap;
        map.put("from_following_sky_light", new C30582a());
        map.put("from_follow_page", new C30583b());
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
