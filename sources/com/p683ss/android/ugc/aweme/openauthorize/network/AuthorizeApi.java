package com.p683ss.android.ugc.aweme.openauthorize.network;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.openauthorize.p2035a.C38472a;
import p064c.p065a.C1680ad;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.network.AuthorizeApi */
public interface AuthorizeApi {
    @C12706h(mo23876a = "/passport/open/check_login/")
    C1680ad<C38472a> getLoginStatus(@C12724z(mo23894a = "client_key") String str);
}
