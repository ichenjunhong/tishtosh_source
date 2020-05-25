package com.p683ss.android.ugc.aweme.antiaddic.lock.api;

import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.C22717b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi */
public interface TeenageModeApi {

    /* renamed from: a */
    public static final C22708a f60911a = C22708a.f60912a;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi$a */
    public static final class C22708a {

        /* renamed from: a */
        static final /* synthetic */ C22708a f60912a = new C22708a();

        private C22708a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/minor/user/check/password/")
    @C53074e
    C2201v<BaseResponse> checkTeenagePassword(@C53072c(mo110600a = "password") String str);

    @C53084o(mo110612a = "/aweme/v1/minor/user/set/settings/")
    @C53074e
    C2201v<BaseResponse> setMinorSettings(@C53072c(mo110600a = "settings") String str);

    @C53084o(mo110612a = "/aweme/v1/minor/user/sync/settings/")
    @C53074e
    C2201v<C22717b> syncMinorSettings(@C53072c(mo110600a = "teen_mode") int i, @C53072c(mo110600a = "screen_time_management") int i2, @C53072c(mo110600a = "password") String str, @C53072c(mo110600a = "password_create_time") long j);
}
