package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.unread;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.unread.UnReadVideoApi */
public interface UnReadVideoApi {

    /* renamed from: a */
    public static final C34671a f89327a = C34671a.f89328a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.unread.UnReadVideoApi$a */
    public static final class C34671a {

        /* renamed from: a */
        static final /* synthetic */ C34671a f89328a = new C34671a();

        private C34671a() {
        }
    }

    @C12706h(mo23876a = "aweme/v1/familiar/unread/count/multi/")
    C17832m<Object> getMultiUnReadVideoList(@C12724z(mo23894a = "target_user_ids") String str);
}
