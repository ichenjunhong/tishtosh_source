package com.p683ss.android.ugc.trill.abtest;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33105e;
import com.p683ss.android.ugc.aweme.setting.C41594e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.trill.abtest.b */
public final class C50295b {

    /* renamed from: c */
    private static final C33105e<C50295b> f126180c = new C33105e<C50295b>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo70134a() {
            return new C50295b();
        }
    };

    /* renamed from: a */
    public JSONObject f126181a;

    /* renamed from: b */
    private Map<String, C50294a> f126182b;

    private C50295b() {
        this.f126182b = new HashMap();
    }

    /* renamed from: a */
    public static C50295b m108561a() {
        return (C50295b) f126180c.mo70135b();
    }

    /* renamed from: a */
    public final boolean mo98203a(String str) {
        C50294a aVar = (C50294a) this.f126182b.get(str);
        if (aVar == null) {
            return false;
        }
        if (this.f126181a == null) {
            try {
                this.f126181a = new JSONObject((String) C41594e.m91457b().mo49459a(C11010c.m22280a(), "ab_test_model", String.class));
            } catch (Exception unused) {
                return false;
            }
        }
        Object opt = this.f126181a.opt(str);
        if (opt == null) {
            opt = aVar.mo98200a();
        }
        return aVar.mo98201a(opt);
    }

    /* renamed from: a */
    public final void mo98202a(String str, C50294a aVar) {
        this.f126182b.put(str, aVar);
    }
}
