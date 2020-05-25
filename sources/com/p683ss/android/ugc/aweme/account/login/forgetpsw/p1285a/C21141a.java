package com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1285a;

import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.a.a */
public final class C21141a {

    /* renamed from: a */
    public static final String f57441a;

    /* renamed from: b */
    public static final String f57442b;

    /* renamed from: c */
    public static final String f57443c;

    /* renamed from: a */
    private static String m53656a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C12998a.f34022a);
        sb.append(C24095a.m58955l());
        return sb.toString();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(m53656a());
        sb.append("/aweme/v1/passport/find-password-via-email/");
        f57441a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m53656a());
        sb2.append("/passport/email/send_code/");
        f57442b = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://www.tiktok.com/mail-forgetpwd-new/index.html?aid=");
        sb3.append(C23018b.f61359a);
        f57443c = sb3.toString();
    }
}
