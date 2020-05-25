package com.p683ss.android.ugc.aweme.i18n.musically.cut;

import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.c */
final /* synthetic */ class C33138c implements ITransformCallback {

    /* renamed from: a */
    private final C331251 f86033a;

    C33138c(C331251 r1) {
        this.f86033a = r1;
    }

    public final void finish(Object obj) {
        C331251 r0 = this.f86033a;
        Integer num = (Integer) obj;
        C18842a.m45934b(AvatarCutActivity.this.f86011u);
        if (num.intValue() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", num);
            } catch (JSONException unused) {
            }
            C23131p.m57776a("aweme_video_clip_success_rate", 1, jSONObject);
        } else {
            C23131p.m57776a("aweme_video_clip_success_rate", 0, (JSONObject) null);
        }
        AvatarCutActivity.this.f86006p = true;
        AvatarCutActivity.this.f86007q = true;
    }
}
