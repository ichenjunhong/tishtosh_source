package com.p683ss.android.ugc.aweme.commercialize.splash;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p831b.C12696ac;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12700b;
import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12709k;
import com.bytedance.retrofit2.p831b.C12713o;
import com.bytedance.retrofit2.p831b.C12718t;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.SplashAdApi */
public interface SplashAdApi {
    @C12706h
    C12690b<String> executeGet(@C12713o int i, @C12699af String str);

    @C12706h
    @C12696ac(mo23871a = "vas_ad_track")
    C12690b<String> executeGet(@C12713o int i, @C12699af String str, @C12709k(mo23881a = "User-Agent") String str2);

    @C12718t
    C12690b<String> executePost(@C12713o int i, @C12699af String str, @C12700b TypedOutput typedOutput);

    @C12718t
    @C12705g
    C12690b<String> executePost(@C12713o int i, @C12699af String str, @C12704f Map<String, String> map);
}
