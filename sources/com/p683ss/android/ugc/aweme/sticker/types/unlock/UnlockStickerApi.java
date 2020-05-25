package com.p683ss.android.ugc.aweme.sticker.types.unlock;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.UnlockStickerApi */
public final class UnlockStickerApi {

    /* renamed from: a */
    static final RetrofitApi f117575a = ((RetrofitApi) C39629l.m88232a().mo58595z().retrofitCreate(TutorialVideoApiManager.f96873a, RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.UnlockStickerApi$RetrofitApi */
    interface RetrofitApi {
        @C53084o(mo110612a = "https://api.tiktokv.com/aweme/v1/ug/event/record/")
        @C53074e
        C17832m<C46606d> unlockSticker(@C53072c(mo110600a = "event_type") int i, @C53072c(mo110600a = "extra") String str);
    }

    /* renamed from: a */
    public static C17832m<C46606d> m101157a(String str) {
        return f117575a.unlockSticker(1, str);
    }
}
