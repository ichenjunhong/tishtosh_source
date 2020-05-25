package com.p683ss.android.ugc.aweme.notice.repo;

import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager */
public final class TutorialVideoApiManager {

    /* renamed from: a */
    public static final String f96873a = f96873a;

    /* renamed from: b */
    public static final TutorialVideoApi f96874b;

    /* renamed from: c */
    public static final C38080a f96875c = new C38080a(null);

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager$TutorialVideoApi */
    public interface TutorialVideoApi {
        @C53075f(mo110603a = "/aweme/v1/tutorial/video/")
        C0013i<TutorialVideoResp> getTutorialVideoAndPoint(@C53089t(mo110619a = "mark_read") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager$a */
    public static final class C38080a {
        private C38080a() {
        }

        public /* synthetic */ C38080a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C0013i<TutorialVideoResp> mo77639a(int i) {
            return TutorialVideoApiManager.f96874b.getTutorialVideoAndPoint(i);
        }
    }

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f96873a).create(TutorialVideoApi.class);
        C52711k.m112236a(create, "ServiceManager.get()\n   …rialVideoApi::class.java)");
        f96874b = (TutorialVideoApi) create;
    }
}
