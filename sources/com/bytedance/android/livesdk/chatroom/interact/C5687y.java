package com.bytedance.android.livesdk.chatroom.interact;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.y */
final /* synthetic */ class C5687y implements C1710e {

    /* renamed from: a */
    private final C52471 f14909a;

    /* renamed from: b */
    private final int f14910b;

    /* renamed from: c */
    private final long f14911c;

    /* renamed from: d */
    private final Object[] f14912d;

    C5687y(C52471 r1, int i, long j, Object[] objArr) {
        this.f14909a = r1;
        this.f14910b = i;
        this.f14911c = j;
        this.f14912d = objArr;
    }

    public final void accept(Object obj) {
        String str;
        C52471 r1 = this.f14909a;
        int i = this.f14910b;
        long j = this.f14911c;
        Object[] objArr = this.f14912d;
        Integer num = (Integer) obj;
        switch (i) {
            case 1:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = LinkInRoomVideoGuestWidget.this;
                C5274ah.m11927a((long) ((int) j), C31483a.f82385b, C5529ew.m12383o().toString());
                return;
            case 4:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget2 = LinkInRoomVideoGuestWidget.this;
                if (linkInRoomVideoGuestWidget2.f14004a != null && linkInRoomVideoGuestWidget2.f14004a.isShowing()) {
                    linkInRoomVideoGuestWidget2.f14004a.dismiss();
                }
                linkInRoomVideoGuestWidget2.f14013j = SystemClock.elapsedRealtime();
                LinkCrossRoomDataHolder.m11103a().f12632w = System.currentTimeMillis();
                C5274ah.m11929a(C5529ew.m12383o().toString(), 0, 0);
                C5529ew ewVar = linkInRoomVideoGuestWidget2.f14005b;
                ewVar.f14580g = true;
                ewVar.f14585l.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(3));
                C4639e.m11122a().mo10414a(Integer.valueOf(2));
                linkInRoomVideoGuestWidget2.f14007d.mo11544b(false);
                C5274ah.m11924a(0, 0, null, "audience", C31483a.f82385b, C5529ew.m12383o().toString());
                JSONObject jSONObject = new JSONObject();
                C4639e a = C4639e.m11122a();
                if (a.f12678j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.f12679k);
                    sb.append("-");
                    sb.append(a.f12680l);
                    str = sb.toString();
                } else {
                    str = "";
                }
                try {
                    jSONObject.put("type", str);
                    jSONObject.put("connection_type", C4639e.m11122a().f12681m == 2 ? "voice_type" : "live_type");
                    C8068g.m16014a(linkInRoomVideoGuestWidget2.context);
                    linkInRoomVideoGuestWidget2.f14005b.f14582i.getOwner().getId();
                    linkInRoomVideoGuestWidget2.f14005b.f14582i.getId();
                } catch (JSONException unused) {
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(linkInRoomVideoGuestWidget2.f14005b.f14582i.getId()));
                hashMap.put("channel_id", String.valueOf(linkInRoomVideoGuestWidget2.f14011h.getId()));
                hashMap.put("connection_type", "audience");
                hashMap.put("money", a.f12678j ? String.valueOf(a.f12679k) : "0");
                hashMap.put("time", a.f12678j ? String.valueOf(C4574am.m10976a(a.f12680l)) : "1440");
                hashMap.put("anchor_id", String.valueOf(linkInRoomVideoGuestWidget2.f14005b.f14582i.getOwnerUserId()));
                C8049c.m15979a().mo14202a("guest_connection_success", hashMap, new C8059j().mo14214b("live_function").mo14213a("live_detail"));
                linkInRoomVideoGuestWidget2.f14007d.mo11540a(C4638d.m11114a().f12665h, (SurfaceView) linkInRoomVideoGuestWidget2.f14009f);
                linkInRoomVideoGuestWidget2.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, C5529ew.m12383o().name()));
                C8056g gVar = new C8056g();
                gVar.mo14209b(linkInRoomVideoGuestWidget2.f14011h.getOwner().getId()).mo14211c(C5529ew.m12382n());
                C8049c.m15979a().mo14202a("connection_success", hashMap, gVar);
                return;
            case 5:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget3 = LinkInRoomVideoGuestWidget.this;
                linkInRoomVideoGuestWidget3.f14008e = null;
                linkInRoomVideoGuestWidget3.f14005b.mo11441h();
                linkInRoomVideoGuestWidget3.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(false, null));
                C5274ah.m11925a(0, 0, null, "audience", C31483a.f82385b, C5529ew.m12383o().toString(), linkInRoomVideoGuestWidget3.f14005b.mo11446m());
                long elapsedRealtime = linkInRoomVideoGuestWidget3.f14013j > 0 ? SystemClock.elapsedRealtime() - linkInRoomVideoGuestWidget3.f14013j : 0;
                linkInRoomVideoGuestWidget3.f14013j = 0;
                int i2 = C4639e.m11122a().f12681m;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("guest_connection_type", i2 == 1 ? "video" : "voice");
                hashMap2.put("duration", String.valueOf(elapsedRealtime));
                C8049c.m15979a().mo14202a("guest_connection_over", hashMap2, new C8059j().mo14213a("live_detail"), Room.class);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("room_id", String.valueOf(linkInRoomVideoGuestWidget3.f14011h.getId()));
                hashMap3.put("anchor_id", String.valueOf(linkInRoomVideoGuestWidget3.f14011h.getOwnerUserId()));
                hashMap3.put("right_user_id", String.valueOf(C5529ew.m12382n()));
                hashMap3.put("channel_id", String.valueOf(linkInRoomVideoGuestWidget3.f14011h.getId()));
                hashMap3.put("connection_type", "audience");
                hashMap3.put("connection_time", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12632w) / 1000));
                C8049c.m15979a().mo14202a("connection_over", hashMap3, new Object[0]);
                return;
            case 6:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget4 = LinkInRoomVideoGuestWidget.this;
                String str2 = (String) objArr[0];
                long id = linkInRoomVideoGuestWidget4.f14005b.f14582i.getId();
                String m = linkInRoomVideoGuestWidget4.f14005b.mo11446m();
                String vendor = C5529ew.m12383o().toString();
                StringBuilder sb2 = new StringBuilder("onWarn:");
                sb2.append(str2);
                C5274ah.m11928a(id, m, vendor, 402, sb2.toString());
                return;
            case 8:
                LinkInRoomVideoGuestWidget.this.mo11080a(String.valueOf(objArr[0]));
                return;
            case 9:
                LinkInRoomVideoGuestWidget.this.mo11083a((String[]) objArr[0], (boolean[]) objArr[1]);
                break;
            case 11:
                LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget5 = LinkInRoomVideoGuestWidget.this;
                String valueOf = String.valueOf(objArr[0]);
                SurfaceView surfaceView = (SurfaceView) objArr[1];
                long j2 = C4639e.m11122a().f12673e;
                if (TextUtils.equals(valueOf, C4638d.m11114a().f12661d) && j2 > 0) {
                    C5274ah.m11926a(SystemClock.currentThreadTimeMillis() - j2, 1, C5529ew.m12383o().toString());
                    C4639e.m11122a().f12673e = 0;
                }
                linkInRoomVideoGuestWidget5.f14007d.mo11540a(valueOf, surfaceView);
                return;
        }
    }
}
