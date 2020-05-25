package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4846au.C4847a;
import com.bytedance.android.livesdk.browser.p294h.C4757b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.av */
public final class C4849av extends C10779d<C4852a, Object> {

    /* renamed from: a */
    private C4847a f13068a;

    /* renamed from: b */
    private C1690c f13069b;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.av$a */
    static final class C4852a {
        @C17952c(mo34828a = "title")

        /* renamed from: a */
        String f13074a;
        @C17952c(mo34828a = "desc")

        /* renamed from: b */
        String f13075b;
        @C17952c(mo34828a = "image")

        /* renamed from: c */
        String f13076c;
        @C17952c(mo34828a = "url")

        /* renamed from: d */
        String f13077d;

        C4852a() {
        }
    }

    public final void onTerminate() {
        if (this.f13069b != null) {
            this.f13069b.dispose();
        }
        this.f13068a = null;
    }

    public C4849av(C4847a aVar) {
        this.f13068a = aVar;
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        C4852a aVar = (C4852a) obj;
        final Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        HashMap hashMap = new HashMap();
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        if (a != null) {
            hashMap.putAll(a.mo14192a());
        }
        C8038g a2 = C8049c.m15979a().mo14201a(Room.class);
        if (a != null) {
            hashMap.putAll(a2.mo14192a());
        }
        if (currentRoom != null) {
            TTLiveSDKContext.getHostService().mo10312e().mo10343a((Activity) fVar.f28972a, C8633b.m17040a(currentRoom).mo15114a((Map<String, String>) hashMap).mo15116a(), new C8632a() {
                /* renamed from: a */
                public final void mo8971a(Throwable th) {
                    C3831a.m9714b("SharePanelMethod", th);
                }

                /* renamed from: a */
                public final void mo8970a(String str, String str2) {
                    C4849av.this.mo10627a(currentRoom.getId(), str, 1, currentRoom.getLabels());
                    C4849av.m11379a(currentRoom, str, str2);
                }
            });
            return;
        }
        C4757b d = this.f13068a.mo10557d();
        if (aVar != null) {
            d = new C4757b(aVar.f13074a, aVar.f13075b, aVar.f13076c, aVar.f13077d);
        }
        if (d != null && !TextUtils.isEmpty(d.f12959d)) {
            Builder buildUpon = Uri.parse(d.f12959d).buildUpon();
            buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
            TTLiveSDKContext.getHostService().mo10312e().mo10343a((Activity) fVar.f28972a, C8633b.m17039a().mo15113a(d.f12956a).mo15117b(d.f12957b).mo15118c(d.f12958c).mo15119d(buildUpon.toString()).mo15114a((Map<String, String>) hashMap).mo15116a(), new C8632a() {
                /* renamed from: a */
                public final void mo8971a(Throwable th) {
                    C3831a.m9714b("SharePanelMethod", th);
                }

                /* renamed from: a */
                public final void mo8970a(String str, String str2) {
                    String labels;
                    C4849av avVar = C4849av.this;
                    if (currentRoom == null) {
                        labels = "";
                    } else {
                        labels = currentRoom.getLabels();
                    }
                    avVar.mo10627a(0, str, 1, labels);
                    C4849av.m11379a(currentRoom, str, str2);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m11379a(Room room, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("share_platform", str);
        hashMap.put("is_pyramid_sale", "0");
        hashMap.put("share_type", str2);
        if (room != null) {
            hashMap.put("log_pb", room.getLog_pb());
        }
        C8049c.m15979a().mo14202a("share", hashMap, new C8059j().mo14219g("click"), Room.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10627a(long r9, java.lang.String r11, int r12, java.lang.String r13) {
        /*
            r8 = this;
            com.bytedance.android.livesdk.af.o r12 = new com.bytedance.android.livesdk.af.o
            r12.<init>()
            java.lang.String r0 = "target_id"
            int r1 = r11.hashCode()
            r2 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = -1
            if (r1 == r2) goto L_0x0051
            r2 = 3616(0xe20, float:5.067E-42)
            if (r1 == r2) goto L_0x0047
            r2 = 108102557(0x671839d, float:4.5423756E-35)
            if (r1 == r2) goto L_0x003d
            r2 = 113011944(0x6bc6ce8, float:7.0877763E-35)
            if (r1 == r2) goto L_0x0033
            r2 = 1355475581(0x50caea7d, float:2.72349204E10)
            if (r1 == r2) goto L_0x0029
            goto L_0x005b
        L_0x0029:
            java.lang.String r1 = "weixin_moment"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x005b
            r11 = 3
            goto L_0x005c
        L_0x0033:
            java.lang.String r1 = "weibo"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x005b
            r11 = 4
            goto L_0x005c
        L_0x003d:
            java.lang.String r1 = "qzone"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x005b
            r11 = 1
            goto L_0x005c
        L_0x0047:
            java.lang.String r1 = "qq"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x005b
            r11 = 0
            goto L_0x005c
        L_0x0051:
            java.lang.String r1 = "weixin"
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x005b
            r11 = 2
            goto L_0x005c
        L_0x005b:
            r11 = -1
        L_0x005c:
            switch(r11) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0065;
                case 2: goto L_0x0063;
                case 3: goto L_0x0068;
                case 4: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            r3 = -1
            goto L_0x0068
        L_0x0061:
            r3 = 5
            goto L_0x0068
        L_0x0063:
            r3 = 3
            goto L_0x0068
        L_0x0065:
            r3 = 2
            goto L_0x0068
        L_0x0067:
            r3 = 1
        L_0x0068:
            java.lang.String r11 = java.lang.String.valueOf(r3)
            com.bytedance.android.livesdk.af.o r11 = r12.mo10399a(r0, r11)
            java.lang.String r12 = "share_type"
            java.lang.String r0 = "1"
            com.bytedance.android.livesdk.af.o r11 = r11.mo10399a(r12, r0)
            java.lang.String r12 = "common_label_list"
            java.lang.String r13 = java.lang.String.valueOf(r13)
            com.bytedance.android.livesdk.af.o r11 = r11.mo10399a(r12, r13)
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r11.f12568a
            com.bytedance.android.livesdk.ab.f r12 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.live.network.e r12 = r12.mo10321b()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r13 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
            java.lang.Object r12 = r12.mo9550a(r13)
            com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r12 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r12
            c.a.v r9 = r12.sendShare(r9, r11)
            com.bytedance.android.live.core.rxutils.g r10 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
            c.a.v r9 = r9.mo6513a(r10)
            c.a.d.e r10 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4853aw.f13078a
            c.a.d.e r11 = com.bytedance.android.live.core.rxutils.C4064k.m10187b()
            c.a.b.c r9 = r9.mo6505a(r10, r11)
            r8.f13069b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4849av.mo10627a(long, java.lang.String, int, java.lang.String):void");
    }
}
