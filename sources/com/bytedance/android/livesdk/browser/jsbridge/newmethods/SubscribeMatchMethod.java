package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.event.C5162ah;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C1686aj;
import p064c.p065a.p071d.C1710e;

public final class SubscribeMatchMethod extends C10782e<JSONObject, Object> {

    interface RaceRoomApi {
        @C12718t(mo23886a = "/webcast/match/push_msg_subscribe/")
        C1680ad<C4177d<Object>> subscribePushMsg(@C12724z(mo23894a = "plan_id") String str, @C12724z(mo23894a = "subscribe") boolean z);
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        String string = jSONObject.getString("match_id");
        int i = jSONObject.getInt("status");
        boolean z = false;
        if (string == null) {
            C3831a.m9707a("SubscribeMatchMethod", "plan id not exist");
            C5162ah ahVar = new C5162ah();
            ahVar.f13841a = false;
            C4495a.m10823a().mo10301a((Object) ahVar);
        }
        RaceRoomApi raceRoomApi = (RaceRoomApi) C4514j.m10883j().mo10321b().mo9550a(RaceRoomApi.class);
        if (i > 0) {
            z = true;
        }
        raceRoomApi.subscribePushMsg(string, z).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6152a((C1710e<? super T>) new C4863ba<Object>(this, i, fVar), C4864bb.f13096a);
        return null;
    }
}
