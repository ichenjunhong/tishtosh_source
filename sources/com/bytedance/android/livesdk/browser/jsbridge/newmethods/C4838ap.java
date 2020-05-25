package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.gift.C4126d;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7509h;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8050a;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ap */
public final class C4838ap extends C10779d<JSONObject, JSONObject> {

    /* renamed from: a */
    private String f13052a;

    /* renamed from: b */
    private C4126d f13053b = new C4126d() {
        /* renamed from: a */
        public final void mo9497a(Throwable th) {
            C4838ap.this.mo10626a(th);
        }

        /* renamed from: a */
        public final void mo9496a(C7514m mVar) {
            if (mVar == null || C9414h.m18630a(mVar.f20628t)) {
                C4838ap.this.mo10626a((Throwable) new AssertionError());
            } else {
                C4838ap.this.mo10625a(mVar);
            }
        }
    };

    public final void onTerminate() {
    }

    /* renamed from: a */
    public final void mo10626a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            if (th instanceof C2944a) {
                jSONObject.put("error_code", ((C2944a) th).getErrorCode());
            }
            finishWithResult(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo10625a(C7514m mVar) {
        int i;
        List<C7509h> list = mVar.f20628t;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            JSONArray jSONArray = new JSONArray();
            for (C7509h hVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("gift_id", hVar.f20581c);
                jSONObject2.put("group_count", hVar.f20582d);
                C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(hVar.f20581c);
                String str = "gift_type";
                if (findGiftById != null) {
                    i = findGiftById.f20544e;
                } else {
                    i = 1;
                }
                jSONObject2.put(str, i);
                jSONObject2.put("combo_count", hVar.f20584f);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("result_list", jSONArray);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        if ("lottery".equals(this.f13052a)) {
            hashMap.put("request_page", "lottery");
        }
        C8049c.m15979a().mo14202a("send_gift", hashMap, Room.class, C8059j.class, C8050a.class, ((IGiftService) C4116c.m10249a(IGiftService.class)).getSendGiftResultLog(mVar));
        finishWithResult(jSONObject);
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        long optLong = jSONObject.optLong("gift_id");
        int optInt = jSONObject.optInt("gift_count");
        this.f13052a = jSONObject.optString("gift_type");
        if (optLong <= 0 || optInt <= 0) {
            mo10626a((Throwable) new IllegalArgumentException());
        } else {
            ((IGiftService) C4116c.m10249a(IGiftService.class)).sendGiftInternal(optLong, optInt, this.f13053b);
        }
    }
}
