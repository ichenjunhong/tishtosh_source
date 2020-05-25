package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.C5274ah;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cc */
final /* synthetic */ class C6495cc implements C1710e {

    /* renamed from: a */
    private final C63031 f17798a;

    /* renamed from: b */
    private final int f17799b;

    /* renamed from: c */
    private final long f17800c;

    /* renamed from: d */
    private final Object[] f17801d;

    C6495cc(C63031 r1, int i, long j, Object[] objArr) {
        this.f17798a = r1;
        this.f17799b = i;
        this.f17800c = j;
        this.f17801d = objArr;
    }

    public final void accept(Object obj) {
        String str;
        C63031 r0 = this.f17798a;
        int i = this.f17799b;
        long j = this.f17800c;
        Object[] objArr = this.f17801d;
        Integer num = (Integer) obj;
        switch (i) {
            case 1:
                LinkInRoomAudioWidget linkInRoomAudioWidget = LinkInRoomAudioWidget.this;
                C5274ah.m11927a((long) ((int) j), C31483a.f82385b, C5470cy.m12295f_().toString());
                return;
            case 2:
                LinkInRoomAudioWidget linkInRoomAudioWidget2 = LinkInRoomAudioWidget.this;
                long longValue = ((Long) objArr[0]).longValue();
                if (linkInRoomAudioWidget2.f17165k != null) {
                    linkInRoomAudioWidget2.f17165k.mo11962a(j, longValue);
                }
                return;
            case 4:
                LinkInRoomAudioWidget linkInRoomAudioWidget3 = LinkInRoomAudioWidget.this;
                if (linkInRoomAudioWidget3.isViewValid()) {
                    C5274ah.m11929a(C5470cy.m12295f_().toString(), 0, 0);
                    C6610k.m13985a().mo12668a(C6605h.AUDIO_TOGGLE, (C6601a) linkInRoomAudioWidget3.f17166l);
                    linkInRoomAudioWidget3.f17166l.mo12428a(true);
                    C5470cy cyVar = linkInRoomAudioWidget3.f17156b;
                    cyVar.f14489g = true;
                    if (cyVar.f14496n) {
                        cyVar.f14491i = false;
                        if (cyVar.f14499q != null) {
                            cyVar.f14499q.mo11387b();
                        }
                    } else {
                        cyVar.f14500r.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(3));
                        C4639e.m11122a().mo10414a(Integer.valueOf(2));
                    }
                    C5274ah.m11924a(0, 0, null, "audience", C31483a.f82385b, C5470cy.m12295f_().toString());
                    JSONObject jSONObject = new JSONObject();
                    C4639e a = C4639e.m11122a();
                    if (a.f12678j) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(String.valueOf(a.f12679k));
                        sb.append("-");
                        sb.append(a.f12680l);
                        str = sb.toString();
                    } else {
                        str = "";
                    }
                    try {
                        jSONObject.put("type", str);
                        jSONObject.put("connection_type", C4639e.m11122a().f12681m == 2 ? "voice_type" : "live_type");
                        C8068g.m16014a(linkInRoomAudioWidget3.context);
                        linkInRoomAudioWidget3.f17156b.f14495m.getOwner().getId();
                        linkInRoomAudioWidget3.f17156b.f14495m.getId();
                    } catch (JSONException unused) {
                    }
                    if (linkInRoomAudioWidget3.f17164j) {
                        C5202u uVar = new C5202u(10);
                        uVar.f13920b = linkInRoomAudioWidget3.f17161g;
                        linkInRoomAudioWidget3.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", uVar);
                    }
                    linkInRoomAudioWidget3.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, C5470cy.m12295f_().name()));
                }
                return;
            case 5:
                LinkInRoomAudioWidget linkInRoomAudioWidget4 = LinkInRoomAudioWidget.this;
                if (linkInRoomAudioWidget4.f17164j) {
                    linkInRoomAudioWidget4.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(11));
                }
                linkInRoomAudioWidget4.f17160f = null;
                C6610k.m13985a().mo12670b(C6605h.AUDIO_TOGGLE, linkInRoomAudioWidget4.f17166l);
                linkInRoomAudioWidget4.f17156b.mo11375h();
                linkInRoomAudioWidget4.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(false, null));
                C5274ah.m11925a(0, 0, null, linkInRoomAudioWidget4.f17164j ? "anchor" : "audience", C31483a.f82385b, C5470cy.m12295f_().toString(), linkInRoomAudioWidget4.f17156b.mo11373d());
                return;
            case 6:
                LinkInRoomAudioWidget linkInRoomAudioWidget5 = LinkInRoomAudioWidget.this;
                String str2 = (String) objArr[0];
                long id = linkInRoomAudioWidget5.f17156b.f14495m.getId();
                String d = linkInRoomAudioWidget5.f17156b.mo11373d();
                String vendor = C5470cy.m12295f_().toString();
                StringBuilder sb2 = new StringBuilder("onWarn:");
                sb2.append(str2);
                C5274ah.m11928a(id, d, vendor, 402, sb2.toString());
                return;
            case 7:
                LinkInRoomAudioWidget.this.mo12426b(String.valueOf(objArr[0]));
                return;
            case 8:
                LinkInRoomAudioWidget.this.mo12427c(String.valueOf(objArr[0]));
                return;
            case 9:
                LinkInRoomAudioWidget linkInRoomAudioWidget6 = LinkInRoomAudioWidget.this;
                String[] strArr = (String[]) objArr[0];
                boolean[] zArr = (boolean[]) objArr[1];
                if (linkInRoomAudioWidget6.f17159e != null) {
                    linkInRoomAudioWidget6.f17159e.onTalkStateUpdated(strArr, zArr);
                    break;
                }
                break;
        }
    }
}
