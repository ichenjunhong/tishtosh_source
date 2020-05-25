package com.p683ss.android.ugc.aweme.account.login;

import android.support.p030v4.p038f.C0779b;
import com.p683ss.android.p1140c.C18844a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.aweme.account.login.s */
public final class C21459s {

    /* renamed from: a */
    public static final String f58191a;

    /* renamed from: b */
    public static final String f58192b;

    /* renamed from: c */
    public static final String f58193c;

    /* renamed from: d */
    public static final C0779b<Integer> f58194d = new C0779b<>();

    /* renamed from: e */
    public static final C0779b<Integer> f58195e = new C0779b<>();

    /* renamed from: f */
    public static final C0779b<Integer> f58196f = new C0779b<>();

    /* renamed from: g */
    public static String f58197g = "setting";

    /* renamed from: h */
    public static String f58198h = "personal_home";

    /* renamed from: i */
    public static String f58199i = "enter_from_after_login";

    /* renamed from: j */
    public static String f58200j = "ENTER_REASON";

    /* renamed from: k */
    public static String f58201k = "ENTER_TYPE";

    /* renamed from: l */
    public static String f58202l = "pro_account_type";

    /* renamed from: m */
    public static String f58203m = "pro_account_category";

    /* renamed from: n */
    public static String f58204n = "current_use_mobile";

    /* renamed from: o */
    public static String f58205o = "url_path";

    /* renamed from: p */
    public static final int f58206p = BaseNotice.HASHTAG;

    /* renamed from: q */
    public static final int f58207q;

    /* renamed from: r */
    public static final int f58208r;

    /* renamed from: s */
    public static final int f58209s;

    /* renamed from: t */
    public static final int f58210t;

    /* renamed from: u */
    public static final int f58211u;

    /* renamed from: v */
    public static final int f58212v;

    /* renamed from: w */
    private static int f58213w;

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C18844a.f52030e);
        sb.append("/passport/auth/unbind/");
        f58191a = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(C18844a.f52030e);
        sb2.append("/2/user/info/");
        f58192b = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://");
        sb3.append(C18844a.f52030e);
        sb3.append("/aweme/v1/multiple/login/unbind/");
        f58193c = sb3.toString();
        f58194d.add(Integer.valueOf(2020));
        f58194d.add(Integer.valueOf(2032));
        f58194d.add(Integer.valueOf(2033));
        f58194d.add(Integer.valueOf(2025));
        f58194d.add(Integer.valueOf(2031));
        f58195e.add(Integer.valueOf(2020));
        f58195e.add(Integer.valueOf(2022));
        f58195e.add(Integer.valueOf(2025));
        f58196f.add(Integer.valueOf(1101));
        f58196f.add(Integer.valueOf(1102));
        f58196f.add(Integer.valueOf(1103));
        f58196f.add(Integer.valueOf(1104));
        f58196f.add(Integer.valueOf(1105));
        f58213w = 100;
        f58213w = BaseNotice.HASHTAG;
        int i = f58213w + 1;
        f58213w = i;
        f58207q = i;
        int i2 = f58213w + 1;
        f58213w = i2;
        f58208r = i2;
        int i3 = f58213w + 1;
        f58213w = i3;
        f58209s = i3;
        int i4 = f58213w + 1;
        f58213w = i4;
        f58210t = i4;
        int i5 = f58213w + 1;
        f58213w = i5;
        f58211u = i5;
        int i6 = f58213w + 1;
        f58213w = i6;
        f58212v = i6;
    }
}
