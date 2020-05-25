package com.p683ss.android.ugc.aweme.protection.p2093a;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.a.a */
public final class C40837a {

    /* renamed from: b */
    public static final C40838a f103982b = new C40838a(null);

    /* renamed from: a */
    public final Keva f103983a;

    /* renamed from: c */
    private ComplianceSetting f103984c;

    /* renamed from: d */
    private int f103985d;

    /* renamed from: e */
    private ComplianceSetting f103986e;

    /* renamed from: f */
    private int f103987f;

    /* renamed from: com.ss.android.ugc.aweme.protection.a.a$a */
    public static final class C40838a {
        private C40838a() {
        }

        public /* synthetic */ C40838a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    private void m90313d() {
        this.f103983a.clear();
    }

    /* renamed from: a */
    public final ComplianceSetting mo83162a() {
        if (this.f103986e == null) {
            return m90312c();
        }
        return this.f103986e;
    }

    /* renamed from: b */
    public final int mo83165b() {
        return this.f103983a.getInt("vpa_content_choice", 0);
    }

    public C40837a() {
        Keva repo = Keva.getRepo("compliance_setting");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f103983a = repo;
    }

    /* renamed from: c */
    private final ComplianceSetting m90312c() {
        if (this.f103984c != null) {
            return this.f103984c;
        }
        String string = this.f103983a.getString("cached_setting", "");
        C52711k.m112236a((Object) string, "keva.getString(CACHED_SETTING, \"\")");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.f103984c = (ComplianceSetting) new C17971f().mo34884a(string, ComplianceSetting.class);
            } catch (Exception unused) {
            }
        }
        return this.f103984c;
    }

    /* renamed from: a */
    public final void mo83164a(ComplianceSetting complianceSetting) {
        this.f103986e = complianceSetting;
        m90311b(complianceSetting);
    }

    /* renamed from: b */
    private final void m90311b(ComplianceSetting complianceSetting) {
        this.f103984c = complianceSetting;
        if (complianceSetting == null) {
            m90313d();
        } else {
            this.f103983a.storeString("cached_setting", new C17971f().mo34889b(complianceSetting));
        }
    }

    /* renamed from: a */
    public final void mo83163a(int i) {
        this.f103985d = i;
        this.f103983a.storeInt("do_not_sell_data", i);
    }

    /* renamed from: b */
    public final void mo83166b(int i) {
        this.f103987f = i;
        this.f103983a.storeInt("vpa_content_choice", this.f103987f);
    }
}
