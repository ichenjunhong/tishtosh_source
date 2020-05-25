package com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35268h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35281r;
import com.p683ss.android.ugc.aweme.p1807im.service.p1907i.C35459a;
import com.p683ss.android.websocket.p2539b.C50819b.C50820a;
import com.p683ss.android.websocket.p2539b.p2541b.C50821a;
import com.p683ss.android.websocket.p2539b.p2541b.C50822b;
import com.p683ss.android.websocket.p2539b.p2541b.C50823c;
import com.p683ss.android.websocket.p2539b.p2541b.C50824d;
import com.p683ss.android.websocket.p2539b.p2541b.C50826f;
import com.p683ss.android.websocket.p2539b.p2541b.C50827g;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.l.d */
public class C34401d {

    /* renamed from: d */
    private static C34401d f88775d;

    /* renamed from: e */
    private static boolean f88776e;

    /* renamed from: a */
    public Context f88777a;

    /* renamed from: b */
    public String f88778b;

    /* renamed from: c */
    public volatile C50820a f88779c = C50820a.CLOSED;

    private C34401d() {
    }

    /* renamed from: b */
    public final boolean mo72406b() {
        if (this.f88779c == C50820a.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C34401d m78329a() {
        if (f88775d == null) {
            synchronized (C34401d.class) {
                if (f88775d == null) {
                    f88775d = new C34401d();
                }
            }
        }
        return f88775d;
    }

    /* renamed from: c */
    static String m78332c() {
        String wsUrl = C34004b.m77717a().mo71949f().getWsUrl();
        if (TextUtils.isEmpty(wsUrl)) {
            return C35268h.f90600a;
        }
        return wsUrl;
    }

    @C53771m
    public void onEvent(C50824d dVar) {
        if (TextUtils.equals(m78332c(), dVar.f127701a)) {
            C35459a.m80150b("ImWebSocketManager", "ws WSFailEvent");
            C35281r.f90615b.mo73373b("FAILED");
        }
    }

    /* renamed from: a */
    public static synchronized void m78330a(Context context) {
        synchronized (C34401d.class) {
            if (!f88776e) {
                m78329a().f88777a = context;
                f88776e = true;
            }
        }
    }

    @C53771m
    public void onEvent(C50821a aVar) {
        StringBuilder sb = new StringBuilder("ws CloseWSSuccessEvent url=");
        sb.append(aVar.f127692c);
        C35459a.m80150b("ImWebSocketManager", sb.toString());
        if (TextUtils.equals(m78332c(), aVar.f127692c)) {
            C35281r.f90615b.mo73373b("CLOSED");
            this.f88779c = C50820a.CLOSED;
        }
    }

    @C53771m
    public void onEvent(C50822b bVar) {
        StringBuilder sb = new StringBuilder("ws OpenWSSuccessEvent url=");
        sb.append(bVar.f127693a);
        C35459a.m80150b("ImWebSocketManager", sb.toString());
        if (TextUtils.equals(m78332c(), bVar.f127693a)) {
            C35281r.f90615b.mo73373b("OPENED");
            this.f88779c = C50820a.CONNECTED;
        }
    }

    @C53771m
    public void onEvent(C50823c cVar) {
        if (TextUtils.equals(m78332c(), cVar.f127696a)) {
            StringBuilder sb = new StringBuilder("ws ReceivedMsgEvent success url=");
            sb.append(cVar.f127696a);
            C35459a.m80148a("ImWebSocketManager", sb.toString());
            m78331a(cVar.f127696a, cVar.f127698c, cVar.f127699d, cVar.f127700e, cVar.f127697b);
        }
    }

    @C53771m
    public void onEvent(C50826f fVar) {
        if (TextUtils.equals(m78332c(), fVar.f127707a)) {
            C35459a.m80150b("ImWebSocketManager", "ws WSSendMsgFailEvent");
        }
    }

    @C53771m
    public void onEvent(C50827g gVar) {
        if (TextUtils.equals(m78332c(), gVar.f127710a)) {
            this.f88779c = gVar.f127711b;
            if (this.f88779c == C50820a.CONNECTED) {
                C35281r.f90615b.mo73373b("CONNECTED");
                C35459a.m80150b("ImWebSocketManager", "ws WSStatusChangeEvent CONNECTED");
                if (System.currentTimeMillis() - C34004b.m77717a().f87930b >= 30000) {
                    C35197am.m79562c();
                }
            } else if (gVar.f127711b == C50820a.CLOSED || gVar.f127711b == C50820a.CLOSING || gVar.f127711b == C50820a.RETRY_WAITING) {
                C35281r.f90615b.mo73373b("DISCONNECTED");
                C35459a.m80150b("ImWebSocketManager", "ws WSStatusChangeEvent DISCONNECTED");
                C35197am.m79558a(false);
            } else {
                C35281r rVar = C35281r.f90615b;
                StringBuilder sb = new StringBuilder();
                sb.append(gVar.f127711b);
                rVar.mo73373b(sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r2 == android.net.NetworkInfo.State.CONNECTING) goto L_0x00a9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m78331a(java.lang.String r6, java.lang.Object r7, int r8, int r9, byte[] r10) {
        /*
            boolean r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79727a()
            r10 = 1
            if (r6 == 0) goto L_0x010a
            if (r8 != r10) goto L_0x010a
            r6 = 5
            if (r9 != r6) goto L_0x010a
            com.ss.android.ugc.aweme.im.sdk.l.b r7 = (com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34399b) r7
            com.bytedance.im.core.a.c r6 = com.bytedance.p702im.core.p703a.C11165c.m22588a()
            java.lang.String r8 = r7.f88772e
            byte[] r7 = r7.f88774g
            boolean r6 = r6.f30110e
            if (r6 == 0) goto L_0x0109
            com.bytedance.im.core.internal.c.b r6 = com.bytedance.p702im.core.internal.p720c.C11442b.m23355a()
            r9 = 0
            r0 = 0
            com.bytedance.im.core.proto.Response r7 = com.bytedance.p702im.core.internal.p720c.C11448g.m23405a(r8, r7)     // Catch:{ a -> 0x0025 }
            goto L_0x0062
        L_0x0025:
            r7 = move-exception
            java.lang.String r8 = "readFromQueue"
            com.bytedance.p702im.core.internal.utils.C11467e.m23465a(r8, r7)
            java.lang.String r8 = "im_pbdecode_error"
            java.lang.String r1 = "decode"
            r2 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.p702im.core.p705b.C11176d.m22633a(r8, r1, r2)
            com.bytedance.im.core.b.c r8 = com.bytedance.p702im.core.p705b.C11175c.m22624a()
            java.lang.String r1 = "network"
            com.bytedance.im.core.b.c r8 = r8.mo20526a(r1)
            java.lang.String r1 = "ws"
            com.bytedance.im.core.b.c r8 = r8.mo20528b(r1)
            java.lang.String r1 = "error"
            com.bytedance.im.core.b.c r8 = r8.mo20527a(r1, r7)
            java.lang.String r1 = "error_stack"
            java.lang.String r7 = com.bytedance.p702im.core.p705b.C11176d.m22638b(r7)
            com.bytedance.im.core.b.c r7 = r8.mo20527a(r1, r7)
            java.lang.String r8 = "success"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.bytedance.im.core.b.c r7 = r7.mo20527a(r8, r1)
            r7.mo20530b()
            r7 = r9
        L_0x0062:
            if (r7 == 0) goto L_0x0109
            java.lang.Long r8 = r7.start_time_stamp
            if (r8 == 0) goto L_0x00f0
            com.bytedance.p702im.core.internal.p718b.p719a.C11409r.m23292a()
            com.bytedance.im.core.internal.b.a.d r8 = new com.bytedance.im.core.internal.b.a.d
            r8.<init>()
            com.bytedance.im.core.a.c r1 = com.bytedance.p702im.core.p703a.C11165c.m22588a()
            android.app.Application r1 = r1.f30106a
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r2 = com.bytedance.p702im.core.internal.utils.C11471h.m23482a(r2, r10)
            if (r2 == 0) goto L_0x0093
            android.net.NetworkInfo$State r2 = r2.getState()
            if (r2 == 0) goto L_0x0093
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTED
            if (r2 == r3) goto L_0x00a9
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.CONNECTING
            if (r2 != r3) goto L_0x0093
            goto L_0x00a9
        L_0x0093:
            java.lang.String r10 = "phone"
            java.lang.Object r10 = r1.getSystemService(r10)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            int r10 = r10.getNetworkType()
            switch(r10) {
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a6;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00a6;
                case 7: goto L_0x00a8;
                case 8: goto L_0x00a6;
                case 9: goto L_0x00a6;
                case 10: goto L_0x00a6;
                case 11: goto L_0x00a8;
                case 12: goto L_0x00a6;
                case 13: goto L_0x00a4;
                case 14: goto L_0x00a6;
                case 15: goto L_0x00a6;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r10 = 0
            goto L_0x00a9
        L_0x00a4:
            r10 = 4
            goto L_0x00a9
        L_0x00a6:
            r10 = 3
            goto L_0x00a9
        L_0x00a8:
            r10 = 2
        L_0x00a9:
            com.bytedance.im.core.proto.NetworkType r10 = com.bytedance.p702im.core.proto.NetworkType.fromValue(r10)
            com.bytedance.im.core.proto.ClientACKRequestBody$Builder r1 = new com.bytedance.im.core.proto.ClientACKRequestBody$Builder
            r1.<init>()
            java.lang.Integer r2 = r7.cmd
            com.bytedance.im.core.proto.ClientACKRequestBody$Builder r1 = r1.cmd(r2)
            com.bytedance.im.core.proto.ClientACKRequestBody$Builder r10 = r1.network_type(r10)
            java.lang.Long r1 = r7.start_time_stamp
            com.bytedance.im.core.proto.ClientACKRequestBody$Builder r10 = r10.start_time_stamp(r1)
            java.lang.String r1 = r7.log_id
            com.bytedance.im.core.proto.ClientACKRequestBody$Builder r10 = r10.logid(r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.bytedance.im.core.proto.ClientACKRequestBody$Builder r10 = r10.client_time_stamp(r1)
            com.bytedance.im.core.proto.ClientACKRequestBody r10 = r10.build()
            com.bytedance.im.core.proto.RequestBody$Builder r1 = new com.bytedance.im.core.proto.RequestBody$Builder
            r1.<init>()
            com.bytedance.im.core.proto.RequestBody$Builder r10 = r1.client_ack_body(r10)
            com.bytedance.im.core.proto.RequestBody r10 = r10.build()
            java.lang.Integer r1 = r7.inbox_type
            int r1 = r1.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8.mo21053a(r1, r10, r9, r0)
        L_0x00f0:
            java.lang.Integer r8 = r7.cmd
            int r8 = r8.intValue()
            com.bytedance.im.core.proto.IMCMD r9 = com.bytedance.p702im.core.proto.IMCMD.SEND_MESSAGE
            int r9 = r9.getValue()
            if (r8 != r9) goto L_0x0104
            com.bytedance.im.core.internal.c.c r6 = r6.f30715a
            r6.mo21078a(r7)
            goto L_0x0145
        L_0x0104:
            com.bytedance.im.core.internal.c.c r6 = r6.f30716b
            r6.mo21078a(r7)
        L_0x0109:
            return
        L_0x010a:
            boolean r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79727a()
            if (r6 == 0) goto L_0x0145
            if (r8 != r10) goto L_0x0145
            r6 = 1015(0x3f7, float:1.422E-42)
            if (r9 != r6) goto L_0x0145
            com.ss.android.ugc.aweme.im.sdk.l.b r7 = (com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34399b) r7     // Catch:{ Throwable -> 0x0141 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Throwable -> 0x0141 }
            byte[] r7 = r7.f88774g     // Catch:{ Throwable -> 0x0141 }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0141 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.l.a> r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34398a.class
            java.lang.Object r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r6, r7)     // Catch:{ Throwable -> 0x0141 }
            com.ss.android.ugc.aweme.im.sdk.l.a r6 = (com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34398a) r6     // Catch:{ Throwable -> 0x0141 }
            if (r6 != 0) goto L_0x012f
            java.lang.String r6 = "ImWebSocketManager onReceivedMsg im business received empty data"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r6)     // Catch:{ Throwable -> 0x0141 }
            return
        L_0x012f:
            int r6 = r6.getAction()     // Catch:{ Throwable -> 0x0141 }
            if (r6 != r10) goto L_0x0140
            com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89988d     // Catch:{ Throwable -> 0x0141 }
            com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a.a r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a.WS_DIFF     // Catch:{ Throwable -> 0x0141 }
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79104a(r0, r1, r2, r3, r4, r5)     // Catch:{ Throwable -> 0x0141 }
        L_0x0140:
            return
        L_0x0141:
            r6 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r6)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l.C34401d.m78331a(java.lang.String, java.lang.Object, int, int, byte[]):void");
    }
}
