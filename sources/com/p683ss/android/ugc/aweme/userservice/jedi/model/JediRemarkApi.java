package com.p683ss.android.ugc.aweme.userservice.jedi.model;

import com.p683ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi */
public interface JediRemarkApi {

    /* renamed from: a */
    public static final C47610a f120081a = C47610a.f120082a;

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediRemarkApi$a */
    public static final class C47610a {

        /* renamed from: a */
        static final /* synthetic */ C47610a f120082a = new C47610a();

        private C47610a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/user/remark/name/")
    @C53074e
    C2201v<CommitRemarkNameResponse> commitRemarkName(@C53072c(mo110600a = "remark_name") String str, @C53072c(mo110600a = "user_id") String str2, @C53072c(mo110600a = "sec_user_id") String str3);
}
