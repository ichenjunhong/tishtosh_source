package com.p683ss.android.ugc.aweme.detail.operators;

import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p683ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl */
public final class SearchDetailPageOperatorServiceImpl implements IDetailPageOperatorService {

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$a */
    public static final class C27399a implements C27422am {
        C27399a() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27405ab(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$b */
    public static final class C27400b implements C27422am {
        C27400b() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27452p((SearchJediViewModel) jediViewModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$c */
    public static final class C27401c implements C27422am {
        C27401c() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27404aa(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl$d */
    public static final class C27402d implements C27422am {
        C27402d() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return null;
        }
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

    public final HashMap<String, C27422am> getOperatorMap() {
        HashMap<String, C27422am> hashMap = new HashMap<>();
        Map map = hashMap;
        map.put("from_search", new C27399a());
        map.put("from_search_jedi", new C27400b());
        map.put("from_search_mix", new C27401c());
        map.put("from_search_topic_list", new C27402d());
        return hashMap;
    }
}
