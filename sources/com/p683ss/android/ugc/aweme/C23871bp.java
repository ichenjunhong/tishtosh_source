package com.p683ss.android.ugc.aweme;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p683ss.android.ugc.aweme.profile.api.C39791d;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;

/* renamed from: com.ss.android.ugc.aweme.bp */
public final class C23871bp implements C23328ay {
    /* renamed from: a */
    public final void mo48390a(Aweme aweme, boolean z, String str) throws Exception {
        String str2;
        if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
            str2 = C39791d.m88508b((String) null, aweme.getAuthorUid(), 0);
        } else {
            str2 = C39791d.m88503a(aweme.getAuthorUid());
        }
        C39791d.m88507b(str2, true, str);
    }

    /* renamed from: a */
    public final void mo48391a(boolean z, String str, String str2, int i, long j, int i2, String str3) throws Exception {
        AwemeApi.m88493a(true, str, str2, 0, 0, 20, str3, 0, 0, null);
    }
}
