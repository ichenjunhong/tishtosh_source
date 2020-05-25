package com.p683ss.android.ugc.aweme.web;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.web.q */
public final class C48380q implements C19767n {

    /* renamed from: a */
    private static C48380q f121679a = new C48380q();

    /* renamed from: c */
    private static boolean f121680c = true;

    /* renamed from: b */
    private String f121681b;

    private C48380q() {
    }

    /* renamed from: e */
    public static C48380q m104672e() {
        return f121679a;
    }

    /* renamed from: f */
    public static boolean m104673f() {
        return f121680c;
    }

    /* renamed from: i */
    public static String m104675i() {
        return "offlineX";
    }

    /* renamed from: k */
    public static String m104676k() {
        return "gecko-sg.tiktokv.com";
    }

    /* renamed from: n */
    private static String m104678n() {
        return "f9e6186803d872f739d3d1707d9a652e";
    }

    /* renamed from: o */
    private static String m104679o() {
        return "4776c874d6caa9b5e7c3ed2234893fd9";
    }

    /* renamed from: a */
    public final boolean mo41207a() {
        return true;
    }

    /* renamed from: l */
    public final String mo95835l() {
        return mo41210d();
    }

    /* renamed from: h */
    public static String m104674h() {
        File file = new File(C11010c.m22280a().getFilesDir(), "offline");
        C48016e.m103937a(file);
        return file.getPath();
    }

    /* renamed from: b */
    public final String mo41208b() {
        File file = new File(mo95833g(), mo41210d());
        C48016e.m103937a(file);
        return file.getPath();
    }

    /* renamed from: d */
    public final String mo41210d() {
        String str;
        if (TextUtils.isEmpty(this.f121681b)) {
            if (m104677m()) {
                str = m104679o();
            } else {
                str = m104678n();
            }
            this.f121681b = str;
        }
        return this.f121681b;
    }

    /* renamed from: g */
    public final String mo95833g() {
        if (C47731bq.m103352f()) {
            return mo95834j().getPath();
        }
        return m104674h();
    }

    /* renamed from: j */
    public final File mo95834j() {
        File file = new File(C11010c.m22280a().getFilesDir(), m104675i());
        C48016e.m103937a(file);
        return file;
    }

    /* renamed from: m */
    private static boolean m104677m() {
        boolean equals = TextUtils.equals(C11010c.m22295p(), "local_test");
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getGeckoLocalTestUseOnline().mo47782d()).booleanValue();
        if (!equals || booleanValue) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final List<Pattern> mo41209c() {
        ArrayList arrayList = new ArrayList();
        List<String> b = C23859b.m58575b().mo49469b(C11010c.m22280a(), "aweme_gecko_offline_host_prefix", String.class);
        if (!C9376b.m18558a((Collection<T>) b)) {
            for (String compile : b) {
                arrayList.add(Pattern.compile(compile));
            }
            return arrayList;
        }
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/ies/resource/falcon"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/ies/resource/falcon"));
        arrayList.add(Pattern.compile("aweme.snssdk.com/falcon/"));
        arrayList.add(Pattern.compile("ic.snssdk.com/game_channel"));
        arrayList.add(Pattern.compile("s3.pstatp.com/bytecom/game_channel_fe/"));
        arrayList.add(Pattern.compile("s3.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s3a.bytecdn.cn/aweme/resource/falcon/"));
        arrayList.add(Pattern.compile("s16.tiktokcdn.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("s0.ipstatp.com/tiktok/falcon/"));
        arrayList.add(Pattern.compile("www.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("m.tiktok.com/falcon/"));
        arrayList.add(Pattern.compile("snssdk.com/feoffline/"));
        arrayList.add(Pattern.compile("pstatp.com/toutiao/feoffline/"));
        arrayList.add(Pattern.compile("test-aweme.snssdk.com/falcon/fe_activity/"));
        return arrayList;
    }

    /* renamed from: a */
    public final String mo41206a(String str) {
        File file = new File(mo95833g(), str);
        C48016e.m103937a(file);
        return file.getPath();
    }
}
