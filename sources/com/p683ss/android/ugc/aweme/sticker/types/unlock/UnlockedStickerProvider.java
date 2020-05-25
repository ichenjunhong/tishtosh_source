package com.p683ss.android.ugc.aweme.sticker.types.unlock;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.UnlockedStickerProvider */
public final class UnlockedStickerProvider {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117576a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(UnlockedStickerProvider.class), "sStickerAPI", "getSStickerAPI()Lcom/ss/android/ugc/aweme/sticker/types/unlock/UnlockedStickerProvider$UnlockedStickerListApi;"))};

    /* renamed from: b */
    public static final UnlockedStickerProvider f117577b = new UnlockedStickerProvider();

    /* renamed from: c */
    private static final C52668f f117578c = C52732g.m112285a(C46601a.f117579a);

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.UnlockedStickerProvider$UnlockedStickerListApi */
    public interface UnlockedStickerListApi {
        @C53075f(mo110603a = "https://api.tiktokv.com/aweme/v1/ug/stickers/unlocked/")
        C17832m<UnlockedStickerListResponse> getUnlockedStickers(@C53089t(mo110619a = "events_ids") List<String> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.UnlockedStickerProvider$a */
    static final class C46601a extends C52712l implements C52670a<UnlockedStickerListApi> {

        /* renamed from: a */
        public static final C46601a f117579a = new C46601a();

        C46601a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (UnlockedStickerListApi) C39629l.m88232a().mo58595z().retrofitCreate(TutorialVideoApiManager.f96873a, UnlockedStickerListApi.class);
        }
    }

    private UnlockedStickerProvider() {
    }
}
