package com.p683ss.android.ugc.aweme.commercialize.coupon.p1552b;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.profile.api.C39791d;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.b.g */
public final class C25683g extends C37716a<User> {
    /* renamed from: a */
    public final void mo52831a(final String str) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                if (C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
                    return C39791d.m88502a(C39791d.m88508b((String) null, str, 0), false, (String) null);
                }
                return C39791d.m88502a(C39791d.m88503a(str), false, (String) null);
            }
        }, 0);
    }
}
