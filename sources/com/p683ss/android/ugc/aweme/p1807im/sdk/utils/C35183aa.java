package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.C2240a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aa */
public final class C35183aa {

    /* renamed from: a */
    public static final String[] f90464a = {"http://p1-dy.bytecdn.cn", "http://p3-dy.bytecdn.cn", "http://p9-dy.bytecdn.cn"};

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aa$a */
    public static class C35185a {

        /* renamed from: d */
        public static String f90465d = "";

        /* renamed from: e */
        public static String f90466e = "large";

        /* renamed from: f */
        public static String f90467f = "medium";

        /* renamed from: g */
        public static String f90468g = "thumb";

        /* renamed from: a */
        public List<String> f90469a;

        /* renamed from: b */
        String f90470b;

        /* renamed from: c */
        String f90471c;

        /* renamed from: h */
        private String f90472h;

        /* renamed from: a */
        public String mo73318a() {
            return C2240a.m6772a("/img/%s~tplv-x-get:%s.image%s%s", new Object[]{this.f90470b, this.f90472h, "%%secretKey=", this.f90471c});
        }

        private C35185a(List<String> list, String str, String str2) {
            this.f90472h = f90465d;
            this.f90469a = list;
            this.f90470b = str;
            this.f90471c = str2;
        }
    }
}
