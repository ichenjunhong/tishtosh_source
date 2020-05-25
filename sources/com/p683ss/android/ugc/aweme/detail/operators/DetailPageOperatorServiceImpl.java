package com.p683ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl */
public final class DetailPageOperatorServiceImpl implements IDetailPageOperatorService {

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$a */
    public static final class C27389a implements C27422am {
        C27389a() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27410ag(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$b */
    public static final class C27390b implements C27422am {
        C27390b() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27467r(bVar.getIds());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$c */
    public static final class C27391c implements C27422am {
        C27391c() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27441e(bVar.getIds());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$d */
    public static final class C27392d implements C27422am {
        C27392d() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27412ai(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$e */
    public static final class C27393e implements C27422am {
        C27393e() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            C35440f fVar = C31213v.f81659c;
            Aweme aweme = null;
            if (C31213v.f81659c == fVar) {
                C31213v.f81659c = null;
            }
            if (fVar == null) {
                return new C27443g();
            }
            if (!TextUtils.isEmpty(bVar.getChatRoomPlayingRealAid())) {
                aweme = C23324d.m57378a().getAwemeById(bVar.getChatRoomPlayingRealAid());
            }
            return new C27414ak(fVar, aweme, bVar.isFromChatRoomPlaying());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$f */
    public static final class C27394f implements C27422am {
        C27394f() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27425ap(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl$g */
    public static final class C27395g implements C27422am {
        C27395g() {
        }

        /* renamed from: a */
        public final C27419al mo50285a(C30669b bVar, C26875a<?, ?> aVar, JediViewModel<?> jediViewModel) {
            C52711k.m112240b(bVar, "param");
            return new C27446j();
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
        map.put("from_time_line", new C27389a());
        map.put("from_music_children_mode", new C27390b());
        map.put("from_challenge_children_mode", new C27391c());
        map.put("from_window_following", new C27392d());
        map.put("from_chat", new C27393e());
        map.put("from_no_request", new C27394f());
        map.put("from_commerce_banner", new C27395g());
        return hashMap;
    }
}
