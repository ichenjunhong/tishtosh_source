package com.p683ss.android.ugc.aweme.userservice.jedi.model;

import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi */
public interface JediFollowApi {

    /* renamed from: a */
    public static final C47609a f120079a = C47609a.f120080a;

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi$a */
    public static final class C47609a {

        /* renamed from: a */
        static final /* synthetic */ C47609a f120080a = new C47609a();

        private C47609a() {
        }
    }

    @C53075f(mo110603a = "/aweme/v1/commit/follow/user/")
    C2201v<FollowStatus> follow(@C53089t(mo110619a = "user_id") String str, @C53089t(mo110619a = "sec_user_id") String str2, @C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "channel_id") int i2, @C53089t(mo110619a = "from") Integer num, @C53089t(mo110619a = "item_id") String str3, @C53089t(mo110619a = "from_pre") Integer num2);
}
