package com.p683ss.android.ugc.aweme.commercialize.log;

import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter.C26027a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.g */
final /* synthetic */ class C26082g implements C26027a {

    /* renamed from: a */
    private final C26057av f68879a;

    /* renamed from: b */
    private final String f68880b;

    /* renamed from: c */
    private final long f68881c;

    /* renamed from: d */
    private final JSONObject f68882d;

    C26082g(C26057av avVar, String str, long j, JSONObject jSONObject) {
        this.f68879a = avVar;
        this.f68880b = str;
        this.f68881c = j;
        this.f68882d = jSONObject;
    }

    /* renamed from: a */
    public final void mo53492a(int i, boolean z, Exception exc) {
        C26057av avVar = this.f68879a;
        String str = this.f68880b;
        long j = this.f68881c;
        JSONObject jSONObject = this.f68882d;
        if (avVar != null) {
            avVar.mo52818a(str, String.valueOf(i), j);
        }
        if (exc != null) {
            C32458a.m75143a(exc);
            try {
                jSONObject.put("error_message", exc.getMessage());
            } catch (JSONException unused) {
            }
        }
        try {
            jSONObject.put("status_code", i);
        } catch (JSONException unused2) {
        }
        C23131p.m57776a("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
    }
}
