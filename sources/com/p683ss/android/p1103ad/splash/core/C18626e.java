package com.p683ss.android.p1103ad.splash.core;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.core.e */
public final class C18626e {

    /* renamed from: a */
    public boolean f51418a = true;

    /* renamed from: b */
    private String f51419b;

    /* renamed from: c */
    private String f51420c;

    /* renamed from: d */
    private String f51421d;

    /* renamed from: e */
    private String f51422e;

    /* renamed from: f */
    private String f51423f;

    /* renamed from: g */
    private String f51424g;

    /* renamed from: h */
    private String f51425h;

    /* renamed from: i */
    private String f51426i;

    /* renamed from: j */
    private String f51427j;

    /* renamed from: k */
    private String f51428k;

    /* renamed from: l */
    private String f51429l;

    /* renamed from: m */
    private String f51430m;

    /* renamed from: n */
    private long f51431n;

    /* renamed from: o */
    private String f51432o;

    /* renamed from: p */
    private String f51433p;

    /* renamed from: q */
    private String f51434q;

    /* renamed from: r */
    private String f51435r;

    /* renamed from: s */
    private String f51436s;

    /* renamed from: t */
    private String f51437t;

    /* renamed from: e */
    private String m45107e() {
        if (m45106a(this.f51420c)) {
            this.f51420c = C18642g.m45215ae().mo37816c();
        }
        return this.f51420c;
    }

    /* renamed from: f */
    private String m45108f() {
        if (m45106a(this.f51421d)) {
            this.f51421d = C18642g.m45215ae().mo37817d();
        }
        return this.f51421d;
    }

    /* renamed from: g */
    private String m45109g() {
        if (m45106a(this.f51422e)) {
            this.f51422e = C18642g.m45215ae().mo37818e();
        }
        return this.f51422e;
    }

    /* renamed from: h */
    private String m45110h() {
        if (m45106a(this.f51423f)) {
            this.f51423f = C18642g.m45215ae().mo37819f();
        }
        return this.f51423f;
    }

    /* renamed from: i */
    private String m45111i() {
        if (m45106a(this.f51425h)) {
            this.f51425h = C18642g.m45215ae().mo37821h();
        }
        return this.f51425h;
    }

    /* renamed from: j */
    private String m45112j() {
        if (m45106a(this.f51426i)) {
            this.f51426i = C18642g.m45215ae().mo37822i();
        }
        return this.f51426i;
    }

    /* renamed from: k */
    private String m45113k() {
        if (m45106a(this.f51427j)) {
            this.f51427j = C18642g.m45215ae().mo37823j();
        }
        return this.f51427j;
    }

    /* renamed from: l */
    private String m45114l() {
        if (m45106a(this.f51430m)) {
            this.f51430m = C18642g.m45215ae().mo37826m();
        }
        return this.f51430m;
    }

    /* renamed from: m */
    private String m45115m() {
        if (m45106a(this.f51429l)) {
            this.f51429l = C18642g.m45215ae().mo37825l();
        }
        return this.f51429l;
    }

    /* renamed from: n */
    private String m45116n() {
        if (m45106a(this.f51433p)) {
            this.f51433p = C18642g.m45215ae().mo37827n();
        }
        return this.f51433p;
    }

    /* renamed from: o */
    private String m45117o() {
        if (m45106a(this.f51434q)) {
            this.f51434q = C18642g.m45215ae().mo37828o();
        }
        return this.f51434q;
    }

    /* renamed from: p */
    private String m45118p() {
        if (m45106a(this.f51435r)) {
            this.f51435r = C18642g.m45215ae().mo37829p();
        }
        return this.f51435r;
    }

    /* renamed from: q */
    private String m45119q() {
        if (m45106a(this.f51436s)) {
            this.f51436s = C18642g.m45215ae().mo37830q();
        }
        return this.f51436s;
    }

    /* renamed from: r */
    private String m45120r() {
        if (m45106a(this.f51437t)) {
            this.f51437t = C18642g.m45215ae().mo37831r();
        }
        return this.f51437t;
    }

    /* renamed from: s */
    private String m45121s() {
        if (m45106a(this.f51432o)) {
            this.f51432o = C18642g.m45215ae().mo37814a();
        }
        return this.f51432o;
    }

    /* renamed from: a */
    public final String mo38025a() {
        if (m45106a(this.f51419b)) {
            this.f51419b = C18642g.m45215ae().mo37815b();
        }
        return this.f51419b;
    }

    /* renamed from: b */
    public final String mo38026b() {
        if (m45106a(this.f51424g)) {
            this.f51424g = C18642g.m45215ae().mo37820g();
        }
        return this.f51424g;
    }

    /* renamed from: c */
    public final String mo38027c() {
        if (m45106a(this.f51428k)) {
            this.f51428k = C18642g.m45215ae().mo37824k();
        }
        return this.f51428k;
    }

    /* renamed from: d */
    public final long mo38028d() {
        if (this.f51431n == 0 && C18642g.m45215ae() != null) {
            this.f51431n = 0;
        }
        return this.f51431n;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(mo38026b())) {
            sb.append("&channel=");
            sb.append(Uri.encode(mo38026b()));
        }
        if (!TextUtils.isEmpty(mo38025a())) {
            sb.append("&aid=");
            sb.append(Uri.encode(mo38025a()));
        }
        if (!TextUtils.isEmpty(m45120r())) {
            sb.append("&gaid=");
            sb.append(Uri.encode(m45120r()));
        }
        if (!TextUtils.isEmpty(m45107e())) {
            sb.append("&app_name=");
            sb.append(Uri.encode(m45107e()));
        }
        if (!TextUtils.isEmpty(m45110h())) {
            sb.append("&update_version_code=");
            sb.append(Uri.encode(m45110h()));
        }
        if (!TextUtils.isEmpty(m45108f())) {
            sb.append("&version_code=");
            sb.append(Uri.encode(m45108f()));
        }
        if (!TextUtils.isEmpty(m45109g())) {
            sb.append("&version_name=");
            sb.append(Uri.encode(m45109g()));
        }
        if (!TextUtils.isEmpty(m45111i())) {
            sb.append("&manifest_version_code=");
            sb.append(Uri.encode(m45111i()));
        }
        sb.append("&language=");
        if (TextUtils.isEmpty(m45112j())) {
            str = "zh";
        } else {
            str = Uri.encode(m45112j());
        }
        sb.append(str);
        if (!TextUtils.isEmpty(m45113k())) {
            sb.append("&iid=");
            sb.append(Uri.encode(m45113k()));
        }
        if (!TextUtils.isEmpty(mo38027c())) {
            sb.append("&device_id=");
            sb.append(Uri.encode(mo38027c()));
        }
        if (!TextUtils.isEmpty(m45114l())) {
            sb.append("&openudid=");
            sb.append(Uri.encode(m45114l()));
        }
        if (!TextUtils.isEmpty(m45115m())) {
            sb.append("&uuid=");
            sb.append(Uri.encode(m45115m()));
        }
        if (!TextUtils.isEmpty(m45121s())) {
            sb.append("&mac_address=");
            sb.append(Uri.encode(m45121s()));
        }
        if (this.f51418a) {
            if (!TextUtils.isEmpty(m45116n())) {
                sb.append("&ab_version=");
                sb.append(Uri.encode(m45116n()));
            }
            if (!TextUtils.isEmpty(m45117o())) {
                sb.append("&ab_client=");
                sb.append(Uri.encode(m45117o()));
            }
            if (!TextUtils.isEmpty(m45118p())) {
                sb.append("&ab_group=");
                sb.append(Uri.encode(m45118p()));
            }
            if (!TextUtils.isEmpty(m45119q())) {
                sb.append("&ab_feature=");
                sb.append(Uri.encode(m45119q()));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m45106a(String str) {
        if (!TextUtils.isEmpty(str) || C18642g.m45215ae() == null) {
            return false;
        }
        return true;
    }
}
