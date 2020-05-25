package com.p683ss.android.ugc.aweme.account.p1278k;

import com.bytedance.sdk.account.p844a.C13011d;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;

/* renamed from: com.ss.android.ugc.aweme.account.k.b */
public class C21008b {

    /* renamed from: a */
    static final String f57127a;

    /* renamed from: d */
    private static volatile C21008b f57128d;

    /* renamed from: b */
    public IAccountUserService f57129b = C23826bi.m58449a();

    /* renamed from: c */
    C13011d f57130c;

    private C21008b() {
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        sb.append("/aweme/v1/check/out/");
        f57127a = sb.toString();
    }

    /* renamed from: a */
    public static C21008b m53393a() {
        if (f57128d == null) {
            synchronized (C21008b.class) {
                if (f57128d == null) {
                    f57128d = new C21008b();
                }
            }
        }
        return f57128d;
    }
}
