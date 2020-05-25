package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.bullet.BulletEventObserver.C24096a;
import com.p683ss.android.ugc.aweme.commercialize.star.C26255a;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28101i;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28108p;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28645cj;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29662d;
import com.p683ss.android.ugc.aweme.music.p1975c.C37352e;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29786b;
import com.p683ss.android.ugc.aweme.p1706fe.p1707a.C29787c;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39047g;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39048h;
import com.p683ss.android.ugc.aweme.profile.C39806c;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39805i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47897fr;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.BroadcastMethod */
public class BroadcastMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public static void m69893a(JSONObject jSONObject) throws JSONException {
        C47718bf.m103288a(new C29906l("notification", jSONObject));
        C47718bf.m103288a(new C24096a("notification", jSONObject));
        C20854a.m53168h().notifyFromRnAndH5(jSONObject);
        if (TextUtils.equals(jSONObject.getString("eventName"), "activity_view")) {
            C39806c.m88518a().mo80877a(jSONObject.getJSONObject("data"));
            C39806c.m88518a().mo80878a(false);
            C39806c.m88518a().mo80880b(false);
            C39806c.m88518a().mo80883c(false);
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "passPlaceholder")) {
            C53755c.m114319a().mo112960d(new C28101i(jSONObject.getJSONObject("data").getString("placeholder")));
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "music_feedback_send_success")) {
            C53755c.m114319a().mo112960d(new C37352e());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "updateKeyword")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("search_word");
            String string2 = jSONObject2.getString("type");
            Word word = new Word();
            word.setWord(string);
            C53755c.m114319a().mo112960d(new C28108p(word, string2));
        } else if (TextUtils.equals(jSONObject.getString("eventName"), "scrollToTop")) {
            C53755c.m114319a().mo112960d(new C28645cj());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "proAccountUsePhone")) {
            C53755c.m114319a().mo112960d(new C29786b());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "switchToProAccount")) {
            C53755c.m114319a().mo112960d(new C29787c());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "poi_event_spu_collect_status")) {
            C47718bf.m103288a(new C29662d());
            C47718bf.m103288a(new C39805i());
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "movieDetailStateChange")) {
            C47718bf.m103288a(new C39805i());
        }
        if (TextUtils.equals(jSONObject.optString("eventName"), "anchor_TCM_content")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                C26255a.m63626b(optJSONObject.optString("starAtlasHashTag"));
                C26255a.m63625a(optJSONObject.optString("campaignInfo"));
            }
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "userBlockSuccess")) {
            DefaultIMService.provideIMService_Monster().onBlockUserSuccessEvent();
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "_dou_ad_create_tcm_order")) {
            C47897fr.m103603b();
        }
        if (TextUtils.equals(jSONObject.getString("eventName"), "poi_qa_update")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            C47718bf.m103288a(new C39047g(new C39048h(jSONObject3.optString("poi_id", ""), jSONObject3.optString("question_id", ""), jSONObject3.optString("answer_id", ""), jSONObject3.optInt("action", -1))));
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        try {
            m69893a(jSONObject);
            aVar.mo60039a((Object) "");
        } catch (JSONException unused) {
            aVar.mo60038a(-1, "");
        }
    }
}
