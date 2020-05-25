package com.p683ss.android.ugc.aweme.userservice.api;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.userservice.api.b */
public interface C47590b {
    /* renamed from: a */
    C1680ad<FollowStatus> mo94905a(String str, String str2, int i, int i2, int i3, String str3, int i4);

    /* renamed from: a */
    C2201v<C11575f<User>> mo94906a(String str);

    /* renamed from: a */
    C2201v<BaseResponse> mo94907a(String str, String str2);

    /* renamed from: a */
    C11536c<String, User> mo94908a();

    /* renamed from: a */
    FollowStatus mo94909a(String str, int i, int i2, int i3, String str2, String str3) throws Exception;

    /* renamed from: a */
    FollowStatus mo94910a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4) throws Exception;

    /* renamed from: b */
    C23275b<FollowStatus> mo94911b();
}
