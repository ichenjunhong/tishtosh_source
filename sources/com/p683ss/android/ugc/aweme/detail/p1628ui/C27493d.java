package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.d */
public final class C27493d {
    /* renamed from: a */
    public static boolean m66096a(Activity activity, C30669b bVar, int i) {
        if (!"undefined".equalsIgnoreCase(bVar.getAid())) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String stringExtra = activity.getIntent().getStringExtra("invitation_code");
            String stringExtra2 = activity.getIntent().getStringExtra("invitor");
            jSONObject.put("id", bVar.getAid());
            jSONObject.put("refer", bVar.getEventType());
            jSONObject.put("ids", bVar.getIds());
            jSONObject.put("userid", bVar.getUid());
            jSONObject.put("video_from", bVar.getFrom());
            jSONObject.put("page_type", i);
            jSONObject.put("music_id", bVar.getMusicId());
            jSONObject.put("sticker_id", bVar.getStickerId());
            jSONObject.put("movie_id", bVar.getMvId());
            jSONObject.put("challenge_id", bVar.getChallengeId());
            jSONObject.put("invitation_code", stringExtra);
            jSONObject.put("invitor", stringExtra2);
            jSONObject.put("video_type", bVar.getVideoType());
            jSONObject.put("push_params", bVar.getPushParams());
        } catch (JSONException unused) {
        }
        C23131p.m57779a("aweme_detail_aid_undefined", jSONObject);
        activity.finish();
        return true;
    }
}
