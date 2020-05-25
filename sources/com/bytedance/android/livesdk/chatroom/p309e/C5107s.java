package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5183c;
import com.bytedance.android.livesdk.message.model.C7850bs;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.s */
public final class C5107s extends C5081a<C7850bs> {
    /* renamed from: a */
    public final ImageModel mo10975a() {
        return null;
    }

    /* renamed from: b */
    public final int mo10977b() {
        return 0;
    }

    /* renamed from: d */
    public final boolean mo10979d() {
        return true;
    }

    /* renamed from: g */
    public final String mo10982g() {
        return "#ff8533";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo10984l() {
        return new SpannableString(((C7850bs) this.f13643a).f21691b);
    }

    public C5107s(C7850bs bsVar) {
        super(bsVar);
    }

    /* renamed from: a */
    public final void mo10976a(Context context, Room room) {
        C4495a.m10823a().mo10301a((Object) new C5183c((C7850bs) this.f13643a));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", room.getUserFrom());
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
        } catch (Exception unused) {
        }
        C8068g.m16014a(context);
        TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        room.getId();
    }
}
