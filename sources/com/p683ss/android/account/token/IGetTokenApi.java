package com.p683ss.android.account.token;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;

/* renamed from: com.ss.android.account.token.IGetTokenApi */
public interface IGetTokenApi {
    @C12706h(mo23876a = "/passport/user/logout/")
    C12690b<String> logout(@C12724z(mo23894a = "logout_from") String str, @C12724z(mo23894a = "user_was_login") String str2);

    @C12718t(mo23886a = "/passport/token/change/")
    C12690b<String> requestChangeToken(@C12700b String str);

    @C12718t(mo23886a = "/passport/token/beat/")
    C12690b<String> requestToken(@C12700b String str);
}
