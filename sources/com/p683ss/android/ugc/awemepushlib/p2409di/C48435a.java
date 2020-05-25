package com.p683ss.android.ugc.awemepushlib.p2409di;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.message.C19477e;
import com.p683ss.android.pushmanager.C19699e;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.awemepushlib.interaction.C48441a;
import com.p683ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.p683ss.android.ugc.awemepushlib.p2407b.C48431b;
import com.p683ss.android.ugc.awemepushlib.p2408c.C48434c;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.di.a */
public final class C48435a implements C19699e {
    /* renamed from: e */
    public final C19477e mo41061e() {
        return C48431b.m104787b();
    }

    /* renamed from: b */
    public final Pair<String, String> mo41058b() {
        return new Pair<>("2882303761517509924", "5571750917924");
    }

    /* renamed from: c */
    public final Pair<String, String> mo41059c() {
        return new Pair<>("110437", "c5c279eeedb44a3dad07655240d72ded");
    }

    /* renamed from: d */
    public final Pair<String, String> mo41060d() {
        return new Pair<>("Cufg9mt6OIKNDk5DqYVEk7XX", "uJPS25PQ1uMkIe1b6aCVStzm");
    }

    /* renamed from: a */
    public final String mo41053a() {
        IAccountUserService iAccountUserService;
        Object a = C27991b.m66756a(IAccountUserService.class);
        if (a != null) {
            iAccountUserService = (IAccountUserService) a;
        } else {
            iAccountUserService = (IAccountUserService) C20302a.m50070a(IAccountUserService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        return iAccountUserService.getSessionKey();
    }

    /* renamed from: a */
    public final void mo41057a(String str, JSONObject jSONObject) {
        C26890h.m65012a(str, jSONObject);
    }

    /* renamed from: a */
    public final String mo41054a(Context context, String str) {
        return C48441a.m104825a().filterUrl(context, str);
    }

    /* renamed from: a */
    public final void mo41055a(Context context, int i, String str, int i2, String str2) {
        MessageShowHandler.m104891a(context, str, i2, str2);
    }

    /* renamed from: a */
    public final void mo41056a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        C26883g.m64994a(context, str, str2, str3, j, j2, jSONObject);
        try {
            if (TextUtils.equals(str2, "red_badge")) {
                C48434c a = C48434c.m104801a().mo95907a("label", str3).mo95907a("category", str).mo95906a("value", Long.valueOf(j)).mo95906a("ext_value", Long.valueOf(j2));
                String str5 = "ext_json";
                if (jSONObject == null) {
                    str4 = "";
                } else {
                    str4 = jSONObject.toString();
                }
                C23569o.m57779a(str2, a.mo95907a(str5, str4).mo95908b());
            }
        } catch (Exception unused) {
        }
        if (TextUtils.equals(str2, "red_badge") && j > 0) {
            C23859b.m58575b().mo49463a(context, "red_point_count", j);
        }
    }
}
