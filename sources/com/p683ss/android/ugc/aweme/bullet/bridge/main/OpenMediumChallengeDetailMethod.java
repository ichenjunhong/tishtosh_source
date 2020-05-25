package com.p683ss.android.ugc.aweme.bullet.bridge.main;

import android.content.Intent;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45379ae;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.main.OpenMediumChallengeDetailMethod */
public final class OpenMediumChallengeDetailMethod extends BaseBridgeMethod {

    /* renamed from: b */
    private final String f64295b = "enterHashtagFeed";

    /* renamed from: c */
    private C10269a f64296c = C10269a.PRIVATE;

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64296c;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64295b;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64296c = aVar;
    }

    public OpenMediumChallengeDetailMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("tag_id");
        if (optString == null) {
            optString = "";
        }
        jSONObject.optBoolean("is_commerce");
        Object opt = jSONObject.opt("log");
        if (opt != null) {
            JSONObject jSONObject2 = (JSONObject) opt;
            Intent intent = new Intent(mo18743e(), DetailActivity.class);
            intent.putExtra("refer", "entertainment");
            intent.putExtra("video_from", "from_challenge");
            intent.putExtra("previous_page", "entertainment");
            intent.putExtra("page_type", "entertainment");
            intent.putExtra("challenge_id", optString);
            DetailActivity.m66078a(mo18743e(), intent, null);
            C45379ae.m98933a(jSONObject2.optString("enter_from"), jSONObject2.optString("entertainment_id"), jSONObject2.optString("type"), jSONObject2.optString("order"));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type org.json.JSONObject");
    }
}
