package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import org.json.JSONObject;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenMediumChallengeDetailMethod */
public final class OpenMediumChallengeDetailMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject == null) {
            aVar.mo60038a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("tag_id");
        if (optString == null) {
            optString = "";
        }
        jSONObject.optBoolean("is_commerce");
        Object opt = jSONObject.opt("log");
        if (opt != null) {
            JSONObject jSONObject2 = (JSONObject) opt;
            Intent intent = new Intent((Context) this.f77793e.get(), DetailActivity.class);
            intent.putExtra("refer", "entertainment");
            intent.putExtra("video_from", "from_challenge");
            intent.putExtra("previous_page", "entertainment");
            intent.putExtra("page_type", "entertainment");
            intent.putExtra("challenge_id", optString);
            DetailActivity.m66078a((Context) this.f77793e.get(), intent, null);
            C45379ae.m98933a(jSONObject2.optString("enter_from"), jSONObject2.optString("entertainment_id"), jSONObject2.optString("type"), jSONObject2.optString("order"));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type org.json.JSONObject");
    }
}
