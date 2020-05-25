package com.p683ss.android.ugc.aweme.shortvideo;

import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.base.C23569o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ff */
public final class C43829ff implements C17824h<SynthetiseResult> {
    public final /* synthetic */ void onSuccess(Object obj) {
        C23569o.m57776a("aweme_synthesis_error_rate_vesdk", 0, C43213dg.m94816a((SynthetiseResult) obj).mo86522b());
    }

    public final void onFailure(Throwable th) {
        int i;
        SynthetiseResult synthetiseResult;
        if (th instanceof C43809fd) {
            C43809fd fdVar = (C43809fd) th;
            i = fdVar.getCode();
            synthetiseResult = fdVar.getResult();
            String synthetiseResult2 = synthetiseResult.toString();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fileInfo", synthetiseResult2);
            } catch (JSONException unused) {
            }
            C23569o.m57783b("aweme_movie_publish_log", "synthesis_error", jSONObject);
        } else {
            i = 10038;
            synthetiseResult = null;
        }
        C23569o.m57776a("aweme_synthesis_error_rate_vesdk", i, C43213dg.m94816a(synthetiseResult).mo86521a("exception", C13696m.m27668c(th)).mo86522b());
    }
}
