package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p271ac.C4519a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b.C8635a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class LiveShareWidget extends LiveWidget {

    /* renamed from: a */
    public final C1689b f17307a = new C1689b();

    /* renamed from: b */
    public Room f17308b;

    /* renamed from: c */
    User f17309c;

    /* renamed from: d */
    private boolean f17310d;

    /* renamed from: e */
    private C0199s<KVData> f17311e = new C6534do(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget$a */
    class C6323a implements C6601a {

        /* renamed from: a */
        C8374c f17313a;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6323a() {
        }

        public final void onClick(View view) {
            LiveShareWidget.this.mo12457a();
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            if (C8607a.f23572a && ((Boolean) C4525b.f12362ae.mo10345a()).booleanValue()) {
                LiveShareWidget.this.f17307a.mo6181a(C2201v.m6592a((long) ((Integer) LiveSettingKeys.LIVE_SHARE_GET_DIAMONDS_TIME.mo9431a()).intValue(), TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6536dq<Object>(this, view), C6537dr.f17862a));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.dataCenter.removeObserver(this.f17311e);
        this.f17307a.mo6180a();
    }

    /* renamed from: a */
    public final void mo12457a() {
        String str;
        String str2 = (String) this.dataCenter.get("log_action_type");
        C4519a e = TTLiveSDKContext.getHostService().mo10312e();
        FragmentActivity fragmentActivity = (FragmentActivity) this.context;
        C8635a a = C8633b.m17040a(this.f17308b);
        if (this.f17310d) {
            str = this.f17308b.getAnchorShareText();
        } else {
            str = this.f17308b.getUserShareText();
        }
        e.mo10343a(fragmentActivity, a.mo15117b(str).mo15115a(this.f17310d).mo15112a(C4600j.m11037a(this.dataCenter)).mo15120e(str2).mo15116a(), new C8632a() {
            /* renamed from: a */
            public final void mo8971a(Throwable th) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x0165  */
            /* JADX WARNING: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo8970a(java.lang.String r17, java.lang.String r18) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = r18
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r2 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f17308b
                    long r3 = r3.getId()
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r5 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r5.f17308b
                    java.lang.String r5 = r5.getLabels()
                    com.bytedance.android.livesdk.af.o r6 = new com.bytedance.android.livesdk.af.o
                    r6.<init>()
                    java.lang.String r7 = "target_id"
                    int r8 = r18.hashCode()
                    r9 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
                    r10 = 0
                    r11 = 4
                    r12 = 3
                    r13 = -1
                    r14 = 2
                    r15 = 1
                    if (r8 == r9) goto L_0x0068
                    r9 = 3616(0xe20, float:5.067E-42)
                    if (r8 == r9) goto L_0x005e
                    r9 = 108102557(0x671839d, float:4.5423756E-35)
                    if (r8 == r9) goto L_0x0054
                    r9 = 113011944(0x6bc6ce8, float:7.0877763E-35)
                    if (r8 == r9) goto L_0x004a
                    r9 = 1355475581(0x50caea7d, float:2.72349204E10)
                    if (r8 == r9) goto L_0x0040
                    goto L_0x0072
                L_0x0040:
                    java.lang.String r8 = "weixin_moment"
                    boolean r8 = r1.equals(r8)
                    if (r8 == 0) goto L_0x0072
                    r8 = 3
                    goto L_0x0073
                L_0x004a:
                    java.lang.String r8 = "weibo"
                    boolean r8 = r1.equals(r8)
                    if (r8 == 0) goto L_0x0072
                    r8 = 4
                    goto L_0x0073
                L_0x0054:
                    java.lang.String r8 = "qzone"
                    boolean r8 = r1.equals(r8)
                    if (r8 == 0) goto L_0x0072
                    r8 = 1
                    goto L_0x0073
                L_0x005e:
                    java.lang.String r8 = "qq"
                    boolean r8 = r1.equals(r8)
                    if (r8 == 0) goto L_0x0072
                    r8 = 0
                    goto L_0x0073
                L_0x0068:
                    java.lang.String r8 = "weixin"
                    boolean r8 = r1.equals(r8)
                    if (r8 == 0) goto L_0x0072
                    r8 = 2
                    goto L_0x0073
                L_0x0072:
                    r8 = -1
                L_0x0073:
                    switch(r8) {
                        case 0: goto L_0x007e;
                        case 1: goto L_0x007c;
                        case 2: goto L_0x007a;
                        case 3: goto L_0x007f;
                        case 4: goto L_0x0078;
                        default: goto L_0x0076;
                    }
                L_0x0076:
                    r11 = -1
                    goto L_0x007f
                L_0x0078:
                    r11 = 5
                    goto L_0x007f
                L_0x007a:
                    r11 = 3
                    goto L_0x007f
                L_0x007c:
                    r11 = 2
                    goto L_0x007f
                L_0x007e:
                    r11 = 1
                L_0x007f:
                    java.lang.String r8 = java.lang.String.valueOf(r11)
                    com.bytedance.android.livesdk.af.o r6 = r6.mo10399a(r7, r8)
                    java.lang.String r7 = "share_type"
                    java.lang.String r8 = "1"
                    com.bytedance.android.livesdk.af.o r6 = r6.mo10399a(r7, r8)
                    java.lang.String r7 = "common_label_list"
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    com.bytedance.android.livesdk.af.o r5 = r6.mo10399a(r7, r5)
                    java.util.HashMap<java.lang.String, java.lang.String> r5 = r5.f12568a
                    com.bytedance.android.livesdk.ab.f r6 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
                    com.bytedance.android.live.network.e r6 = r6.mo10321b()
                    java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r7 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
                    java.lang.Object r6 = r6.mo9550a(r7)
                    com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r6 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r6
                    c.a.v r3 = r6.sendShare(r3, r5)
                    com.bytedance.android.live.core.rxutils.g r4 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
                    c.a.v r3 = r3.mo6513a(r4)
                    com.bytedance.android.livesdk.chatroom.viewmodule.dp r4 = new com.bytedance.android.livesdk.chatroom.viewmodule.dp
                    r4.<init>(r2)
                    c.a.d.e r2 = com.bytedance.android.live.core.rxutils.C4064k.m10187b()
                    r3.mo6505a(r4, r2)
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r2 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    java.util.HashMap r3 = new java.util.HashMap
                    r3.<init>()
                    java.lang.String r4 = "platform"
                    r5 = r17
                    r3.put(r4, r5)
                    java.lang.String r4 = "is_pyramid_sale"
                    java.lang.String r5 = "0"
                    r3.put(r4, r5)
                    java.lang.String r4 = "type"
                    r3.put(r4, r1)
                    java.lang.String r1 = "log_pb"
                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f17308b
                    java.lang.String r2 = r2.getLog_pb()
                    r3.put(r1, r2)
                    com.bytedance.android.livesdk.o.c r1 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                    java.lang.String r2 = "share"
                    java.lang.Object[] r4 = new java.lang.Object[r14]
                    com.bytedance.android.livesdk.o.c.j r5 = new com.bytedance.android.livesdk.o.c.j
                    r5.<init>()
                    java.lang.String r6 = "click"
                    com.bytedance.android.livesdk.o.c.j r5 = r5.mo14219g(r6)
                    r4[r10] = r5
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r5 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r4[r15] = r5
                    r1.mo14202a(r2, r3, r4)
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.ies.sdk.widgets.DataCenter r1 = r1.dataCenter
                    boolean r1 = com.bytedance.android.livesdk.p279af.C4600j.m11040b(r1)
                    if (r1 == 0) goto L_0x015b
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r1.f17308b
                    com.bytedance.android.live.base.model.user.i r1 = r1.author()
                    if (r1 == 0) goto L_0x015b
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r2 = "anchor_id"
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this     // Catch:{ JSONException -> 0x0143 }
                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f17308b     // Catch:{ JSONException -> 0x0143 }
                    com.bytedance.android.live.base.model.user.i r3 = r3.author()     // Catch:{ JSONException -> 0x0143 }
                    long r3 = r3.getId()     // Catch:{ JSONException -> 0x0143 }
                    java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0143 }
                    r1.put(r2, r3)     // Catch:{ JSONException -> 0x0143 }
                    java.lang.String r2 = "room_id"
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this     // Catch:{ JSONException -> 0x0143 }
                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f17308b     // Catch:{ JSONException -> 0x0143 }
                    long r3 = r3.getId()     // Catch:{ JSONException -> 0x0143 }
                    java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x0143 }
                    r1.put(r2, r3)     // Catch:{ JSONException -> 0x0143 }
                L_0x0143:
                    java.lang.Class<com.bytedance.android.livesdkapi.d.a> r2 = com.bytedance.android.livesdkapi.p432d.C8612a.class
                    com.bytedance.android.live.p245d.C4116c.m10249a(r2)
                    com.bytedance.android.livesdk.o.e$a r2 = com.bytedance.android.livesdk.p399o.C8065e.C8066a.m16007a()
                    com.bytedance.android.livesdk.o.e$a r1 = r2.mo14223a(r1)
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r2 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.dataCenter
                    java.util.Map r2 = com.bytedance.android.livesdk.p279af.C4600j.m11041c(r2)
                    r1.mo14222a(r2)
                L_0x015b:
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.ies.sdk.widgets.DataCenter r1 = r1.dataCenter
                    boolean r1 = com.bytedance.android.livesdk.p279af.C4600j.m11043d(r1)
                    if (r1 == 0) goto L_0x01b2
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r1 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r1.f17308b
                    com.bytedance.android.live.base.model.user.i r1 = r1.author()
                    if (r1 == 0) goto L_0x01b2
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r2 = "anchor_id"
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this     // Catch:{ JSONException -> 0x019a }
                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f17308b     // Catch:{ JSONException -> 0x019a }
                    com.bytedance.android.live.base.model.user.i r3 = r3.author()     // Catch:{ JSONException -> 0x019a }
                    long r3 = r3.getId()     // Catch:{ JSONException -> 0x019a }
                    java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x019a }
                    r1.put(r2, r3)     // Catch:{ JSONException -> 0x019a }
                    java.lang.String r2 = "room_id"
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this     // Catch:{ JSONException -> 0x019a }
                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f17308b     // Catch:{ JSONException -> 0x019a }
                    long r3 = r3.getId()     // Catch:{ JSONException -> 0x019a }
                    java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x019a }
                    r1.put(r2, r3)     // Catch:{ JSONException -> 0x019a }
                L_0x019a:
                    java.lang.Class<com.bytedance.android.livesdkapi.d.a> r2 = com.bytedance.android.livesdkapi.p432d.C8612a.class
                    com.bytedance.android.live.p245d.C4116c.m10249a(r2)
                    com.bytedance.android.livesdk.o.e$a r2 = com.bytedance.android.livesdk.p399o.C8065e.C8066a.m16007a()
                    com.bytedance.android.livesdk.o.e$a r1 = r2.mo14223a(r1)
                    com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r2 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.this
                    com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.dataCenter
                    java.util.Map r2 = com.bytedance.android.livesdk.p279af.C4600j.m11044e(r2)
                    r1.mo14222a(r2)
                L_0x01b2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget.C63221.mo8970a(java.lang.String, java.lang.String):void");
            }
        });
    }

    public void onCreate() {
        super.onCreate();
        ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f17310d = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f17308b = (Room) this.dataCenter.get("data_room");
        this.f17309c = (User) this.dataCenter.get("data_user_in_room");
        C6610k.m13987c().mo12668a(C6605h.SHARE, (C6601a) new C6323a());
        this.dataCenter.observe("cmd_wanna_share_live", this.f17311e);
    }
}
