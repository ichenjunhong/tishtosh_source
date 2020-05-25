package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileApi */
public interface UnloginProfileApi {

    /* renamed from: a */
    public static final C40478a f103339a = C40478a.f103340a;

    /* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileApi$a */
    public static final class C40478a {

        /* renamed from: a */
        static final /* synthetic */ C40478a f103340a = new C40478a();

        private C40478a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/unlogged/favorite/")
    C0013i<C40483a> queryUnloginFavorite(@C53089t(mo110619a = "aweme_ids") String str, @C53089t(mo110619a = "count") int i);

    @C53084o(mo110612a = "/aweme/v1/digg/sync/")
    @C53074e
    C0013i<C40484b> syncUnloginDigg(@C53072c(mo110600a = "digg_infos") String str, @C53072c(mo110600a = "sync_count") int i, @C53072c(mo110600a = "sync_action") int i2);

    @C53084o(mo110612a = "/aweme/v1/unlogged/digg/")
    @C53074e
    C0013i<BaseResponse> unloginDigg(@C53072c(mo110600a = "aweme_id") String str, @C53072c(mo110600a = "type") int i, @C53072c(mo110600a = "channel_id") int i2);
}
