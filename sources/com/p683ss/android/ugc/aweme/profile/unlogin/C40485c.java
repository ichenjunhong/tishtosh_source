package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.c */
public final class C40485c {

    /* renamed from: a */
    static List<? extends Aweme> f103348a;

    /* renamed from: b */
    public static final C40485c f103349b = new C40485c();

    private C40485c() {
    }

    /* renamed from: a */
    private static int m89892a(String str) {
        List<? extends Aweme> list = f103348a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (C52711k.m112239a((Object) ((Aweme) list.get(i)).getAid(), (Object) str)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final void m89893a(String str, String str2, String str3, C52682m<? super String, ? super String, ? extends Object> mVar) {
        C52711k.m112240b(mVar, "invoker");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin() && C52711k.m112239a((Object) str, (Object) "personal_homepage") && C52711k.m112239a((Object) str2, (Object) "like")) {
            mVar.invoke("is_login", "0");
            mVar.invoke("order", String.valueOf(m89892a(str3)));
        }
    }
}
