package com.bytedance.android.livesdk.chatroom.interact;

import android.content.Context;
import com.bytedance.android.live.core.p230g.C3920x;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C5758n;
import com.p683ss.android.common.util.NetworkUtils;
import org.json.JSONObject;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.ad */
final /* synthetic */ class C5270ad implements C1711f {

    /* renamed from: a */
    private final C5269ac f14116a;

    C5270ad(C5269ac acVar) {
        this.f14116a = acVar;
    }

    public final Object apply(Object obj) {
        C5269ac acVar = this.f14116a;
        Long l = (Long) obj;
        JSONObject jSONObject = new JSONObject();
        float a = ((float) C3920x.m9896a()) / 1024.0f;
        float f = a - acVar.f14109c;
        String a2 = C3920x.m9897a(C3922z.m9915e().getPackageName());
        Context e = C3922z.m9915e();
        jSONObject.put("vendor", acVar.f14107a);
        jSONObject.put("server_ip", acVar.f14108b);
        jSONObject.put("resolution_ratio", acVar.f14111e * acVar.f14112f);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("MB");
        jSONObject.put("memory", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f);
        sb2.append("MB");
        jSONObject.put("live_push_memory", sb2.toString());
        jSONObject.put("cpu", a2);
        jSONObject.put("room_id", acVar.f14110d);
        jSONObject.put("video_bitrate", acVar.f14113g);
        jSONObject.put("video_fps", acVar.f14114h);
        jSONObject.put("rtmp_type", 2);
        C5758n nVar = new C5758n();
        nVar.f15133a = jSONObject.toString();
        nVar.f15135c = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        nVar.f15134b = TTLiveSDKContext.getHostService().mo10308a().getServerDeviceId();
        nVar.f15137e = NetworkUtils.getNetworkOperatorCode(e);
        nVar.f15136d = NetworkUtils.getNetworkAccessType(e);
        return nVar;
    }
}
