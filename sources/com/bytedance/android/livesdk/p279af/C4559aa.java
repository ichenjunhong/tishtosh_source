package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.af.aa */
public final class C4559aa {

    /* renamed from: a */
    public Context f12520a;

    /* renamed from: b */
    public Room f12521b;

    /* renamed from: c */
    public boolean f12522c;

    /* renamed from: d */
    private long f12523d;

    /* renamed from: a */
    public static void m10949a(String str) {
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        if (a instanceof C8042k) {
            C8042k kVar = (C8042k) a;
            if (kVar.mo14192a().containsKey("enter_from_merge")) {
                hashMap.put("enter_from_merge", (String) kVar.mo14192a().get("enter_from_merge"));
            }
            if (kVar.mo14192a().containsKey("enter_method")) {
                hashMap.put("enter_method", (String) kVar.mo14192a().get("enter_method"));
            }
            if (kVar.mo14192a().containsKey("action_type")) {
                hashMap.put("action_type", kVar.mo14192a().get("action_type"));
            }
            if (kVar.mo14192a().containsKey("video_id")) {
                hashMap.put("video_id", kVar.mo14192a().get("video_id"));
            }
        }
        C8038g a2 = C8049c.m15979a().mo14201a(Room.class);
        if (a2 instanceof C8045n) {
            C8045n nVar = (C8045n) a2;
            if (nVar.mo14192a().containsKey("anchor_id")) {
                hashMap.put("anchor_id", (String) nVar.mo14192a().get("anchor_id"));
            }
            if (nVar.mo14192a().containsKey("room_id")) {
                hashMap.put("room_id", (String) nVar.mo14192a().get("room_id"));
            }
            if (nVar.mo14192a().containsKey("log_pb")) {
                hashMap.put("log_pb", (String) nVar.mo14192a().get("log_pb"));
            }
            if (nVar.mo14192a().containsKey("request_id")) {
                hashMap.put("request_id", (String) nVar.mo14192a().get("request_id"));
            }
        }
        C8049c.m15979a().mo14202a("livesdk_enter_personal_detail", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public final void mo10374a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rid", this.f12521b.getId());
            jSONObject.put("request_id", this.f12521b.getRequestId());
            jSONObject.put("log_pb", this.f12521b.getLog_pb());
        } catch (Exception unused) {
        }
    }

    public C4559aa(Context context, Room room, long j) {
        this.f12520a = context;
        this.f12521b = room;
        this.f12523d = j;
    }

    /* renamed from: a */
    public final void mo10375a(boolean z, long j, String str, boolean z2, int i, String str2, boolean z3) {
        String str3;
        C8052c cVar = new C8052c("", this.f12523d);
        if (z3) {
            cVar.f21993d = "right_anchor";
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        } else if (str.equals("guest_connection") || str.equals("guest_contribution_list") || str.equals("guest_waiting_list")) {
            cVar.f21993d = str;
        }
        if (z2) {
            if (z3) {
                cVar.f21990a = "anchor_c_anchor";
            } else {
                cVar.f21990a = "live_anchor_c_audience";
                if (cVar.f21993d == null) {
                    str = "live_anchor_c_audience";
                }
            }
            if (TextUtils.isEmpty(str)) {
                cVar.f21990a = "live_anchor_c_audience";
            }
        } else if (i != 1) {
            cVar.f21990a = "live_audience_c_anchor";
        } else {
            if (z3) {
                cVar.f21990a = "audience_c_anchor";
                if (cVar.f21993d == null) {
                    str = "audience_c_anchor";
                }
            } else {
                cVar.f21990a = "live_audience_c_audience";
                if (cVar.f21993d == null) {
                    str = "live_audience_c_audience";
                }
            }
            if (TextUtils.isEmpty(str)) {
                cVar.f21990a = "live_audience_c_audience";
            }
        }
        cVar.f21994e = z;
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("growth_deepevent", "1");
        }
        C8049c a = C8049c.m15979a();
        if (z) {
            str3 = "follow";
        } else {
            str3 = "unfollow";
        }
        a.mo14202a(str3, hashMap, cVar, new C8059j().mo14214b("live_interact").mo14213a("live_detail"), Room.class);
    }
}
