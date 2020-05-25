package com.p683ss.android.ugc.aweme.user.p2382c;

import android.os.Handler;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.user.C47541b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.user.c.a */
public final class C47550a {

    /* renamed from: a */
    public static final String f119971a;

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        sb.append("/aweme/v1/friend/register/notice/");
        f119971a = sb.toString();
    }

    /* renamed from: a */
    public static void m102988a(Handler handler, final Map<String, String> map, int i) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                return C47541b.m102967a(map);
            }
        }, i);
    }

    /* renamed from: a */
    public static void m102987a(Handler handler, final String str, boolean z, int i) {
        C23566n.m57766a().mo48750a(handler, new Callable(false) {
            public final Object call() throws Exception {
                return C47541b.m102968a(str, false);
            }
        }, 112);
    }

    /* renamed from: a */
    public static void m102984a(Handler handler, String str, int i, String str2, int i2) {
        m102985a(handler, str, i, str2, null, i2);
    }

    /* renamed from: a */
    public static void m102986a(Handler handler, final String str, final String str2, final int i, int i2) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                String str = str;
                String str2 = str2;
                int i = i;
                HashMap hashMap = new HashMap();
                hashMap.put("page_from", String.valueOf(i));
                if (str.equals("unique_id")) {
                    hashMap.put("login_name", str2);
                    hashMap.put("mt_update_username", "mt_update_username");
                    return C47541b.m102967a((Map<String, String>) hashMap);
                }
                hashMap.put(str, str2);
                return C47541b.m102967a((Map<String, String>) hashMap);
            }
        }, i2);
    }

    /* renamed from: a */
    public static void m102985a(Handler handler, final String str, final int i, final String str2, final List<C19180e> list, int i2) {
        C23566n.m57766a().mo48750a(handler, new Callable() {
            public final Object call() throws Exception {
                return C24514cb.m59920a().mo46186a(str, i, str2, AvatarUri.class, "data", list);
            }
        }, i2);
    }
}
