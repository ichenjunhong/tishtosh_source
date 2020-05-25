package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.polaris.browser.p823a.C12608b;
import com.bytedance.polaris.browser.p823a.C12610d;
import com.bytedance.polaris.p821a.C12555a;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12563i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.b */
public final class C12595b implements C12608b {

    /* renamed from: a */
    private final WeakReference<Activity> f33066a;

    /* renamed from: b */
    private final C12597c f33067b;

    /* renamed from: c */
    private String f33068c;

    /* renamed from: d */
    private String f33069d;

    /* renamed from: e */
    private C12555a f33070e = new C12555a() {
    };

    /* renamed from: b */
    public final void mo23676b() {
    }

    /* renamed from: a */
    public final void mo23674a() {
        if (!C9431p.m18664a(this.f33068c)) {
            C12559e g = C12563i.m25225g();
            int i = 1;
            if (g == null) {
                i = 0;
            } else if (C9431p.m18664a(this.f33069d)) {
                boolean c = g.mo23618c();
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                this.f33067b.mo23678a(this.f33068c, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.f33068c = null;
        this.f33069d = null;
    }

    public C12595b(WeakReference<Activity> weakReference, C12597c cVar) {
        this.f33066a = weakReference;
        this.f33067b = cVar;
    }

    /* renamed from: a */
    public final boolean mo23675a(C12610d dVar, JSONObject jSONObject) {
        Activity activity;
        String str = dVar.f33101c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("login".equals(str)) {
            String str2 = dVar.f33100b;
            JSONObject jSONObject2 = dVar.f33102d;
            if (this.f33066a != null) {
                activity = (Activity) this.f33066a.get();
            } else {
                activity = null;
            }
            Activity activity2 = activity;
            if (activity2 != null) {
                String optString = jSONObject2.optString("title_type");
                String optString2 = jSONObject2.optString("login_source");
                String optString3 = jSONObject2.optString("platform");
                if (C9431p.m18664a(optString3)) {
                    optString3 = "all";
                }
                C12563i.m25225g().mo23610a(activity2, optString3, optString, optString2, jSONObject2, this.f33070e);
                if (!C9431p.m18664a(str2)) {
                    this.f33068c = str2;
                    this.f33069d = optString3;
                }
            }
        } else if ("is_login".equals(str)) {
            String str3 = dVar.f33100b;
            JSONObject jSONObject3 = dVar.f33102d;
            try {
                C12559e g = C12563i.m25225g();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("code", 1);
                if (g == null) {
                    jSONObject4.put("is_login", -1);
                } else if (g.mo23618c()) {
                    jSONObject4.put("is_login", 1);
                } else {
                    jSONObject4.put("is_login", 0);
                }
                this.f33067b.mo23678a(str3, jSONObject4);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }
}
