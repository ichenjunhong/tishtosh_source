package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.chatroom.model.C5754k;
import com.bytedance.android.livesdk.chatroom.model.C5763r;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8012v;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.rank.C8213m;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.j */
public final class C5876j extends C5868cl<C5877a> implements C9382a, OnMessageListener {

    /* renamed from: a */
    public long f15384a;

    /* renamed from: b */
    public long f15385b;

    /* renamed from: c */
    public C1690c f15386c;

    /* renamed from: d */
    private boolean f15387d;

    /* renamed from: e */
    private C9381g f15388e;

    /* renamed from: f */
    private boolean f15389f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.j$a */
    public interface C5877a extends C6463ay {
        /* renamed from: a */
        void mo11759a(C5754k kVar);

        /* renamed from: a */
        void mo11760a(C8012v vVar);

        /* renamed from: a */
        void mo11761a(C8214a aVar);
    }

    /* renamed from: a */
    public final void mo8247a() {
        this.f15388e.removeCallbacksAndMessages(null);
        super.mo8247a();
    }

    /* renamed from: d */
    private boolean m12793d() {
        if (C8213m.m16290b(this.f15389f)) {
            return true;
        }
        C5763r rVar = (C5763r) LiveSettingKeys.LIVE_RANK_CONFIG.mo9431a();
        if (rVar == null || !rVar.f15152b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo11758b() {
        if (!this.f15387d && this.f15384a > 0) {
            C5014i.m11510a((Handler) this.f15388e, this.f15384a, this.f15385b, 12, 1);
            this.f15387d = true;
        }
    }

    /* renamed from: a */
    private void m12792a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "receive_daily_rank_msg_and_not_show");
        hashMap.put("is_enable_location_rank", Boolean.valueOf(m12793d()));
        hashMap.put("msg_type", String.valueOf(i));
        C8064d.m16005b().mo9197a("ttlive_msg", (Map<String, ?>) hashMap);
    }

    public final void handleMsg(Message message) {
        long j;
        if (12 == message.what) {
            this.f15387d = false;
            if ((message.obj instanceof C4175b) && mo8518c() != null) {
                C4175b bVar = (C4175b) message.obj;
                C8214a aVar = (C8214a) bVar.data;
                if (bVar.extra != null) {
                    j = bVar.extra.now;
                } else {
                    j = 0;
                }
                aVar.f22430r = j;
                ((C5877a) mo8518c()).mo11761a(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5877a aVar) {
        super.mo8520a(aVar);
        if (DailyRankWidget.m13450a() && this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.DAILY_RANK.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.DAILY_REGION_RANK.getIntType(), this);
        }
        this.f15388e = new C9381g(this);
        boolean z = false;
        if (this.f15366s != null && ((Boolean) this.f15366s.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
            z = true;
        }
        this.f15389f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r0 == 5) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        if (r0 == 7) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.p683ss.ugc.live.sdk.message.data.IMessage r6) {
        /*
            r5 = this;
            com.bytedance.android.livesdkapi.depend.e.a r0 = com.bytedance.android.livesdkapi.depend.p437e.C8629a.DAILY_RANK
            int r0 = r0.getIntType()
            int r1 = r6.getIntType()
            if (r0 != r1) goto L_0x0091
            com.bytedance.ies.a.a r0 = r5.mo8518c()
            if (r0 == 0) goto L_0x0091
            com.bytedance.android.livesdk.message.model.v r6 = (com.bytedance.android.livesdk.message.model.C8012v) r6
            boolean r0 = r5.m12793d()
            r1 = 1
            if (r0 == 0) goto L_0x007e
            int r0 = r6.f21928f
            r2 = 6
            r3 = 0
            if (r0 != r2) goto L_0x0022
            goto L_0x006c
        L_0x0022:
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.chatroom.model.r> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RANK_CONFIG
            java.lang.Object r2 = r2.mo9431a()
            com.bytedance.android.livesdk.chatroom.model.r r2 = (com.bytedance.android.livesdk.chatroom.model.C5763r) r2
            boolean r4 = r5.f15389f
            if (r4 != 0) goto L_0x0030
            if (r2 == 0) goto L_0x006b
        L_0x0030:
            boolean r4 = r5.f15389f
            if (r4 == 0) goto L_0x003e
            if (r2 != 0) goto L_0x003e
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.chatroom.model.q> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG
            java.lang.Object r2 = r2.mo9431a()
            if (r2 == 0) goto L_0x006b
        L_0x003e:
            boolean r2 = r5.f15389f
            boolean r2 = com.bytedance.android.livesdk.rank.C8213m.m16290b(r2)
            if (r2 == 0) goto L_0x0051
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.chatroom.model.q> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG
            java.lang.Object r2 = r2.mo9431a()
            com.bytedance.android.livesdk.chatroom.model.q r2 = (com.bytedance.android.livesdk.chatroom.model.C5762q) r2
            int r2 = r2.f15154d
            goto L_0x005f
        L_0x0051:
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.chatroom.model.r> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_RANK_CONFIG
            java.lang.Object r2 = r2.mo9431a()
            com.bytedance.android.livesdk.chatroom.model.r r2 = (com.bytedance.android.livesdk.chatroom.model.C5763r) r2
            if (r2 == 0) goto L_0x005e
            int r2 = r2.f15154d
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 != 0) goto L_0x0065
            r4 = 5
            if (r0 != r4) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            if (r2 != r1) goto L_0x006b
            r2 = 7
            if (r0 != r2) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 == 0) goto L_0x0078
            com.bytedance.ies.a.a r0 = r5.mo8518c()
            com.bytedance.android.livesdk.chatroom.presenter.j$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.C5876j.C5877a) r0
            r0.mo11760a(r6)
            return
        L_0x0078:
            int r6 = r6.f21928f
            r5.m12792a(r6)
            return
        L_0x007e:
            int r0 = r6.f21928f
            if (r0 != r1) goto L_0x008c
            com.bytedance.ies.a.a r0 = r5.mo8518c()
            com.bytedance.android.livesdk.chatroom.presenter.j$a r0 = (com.bytedance.android.livesdk.chatroom.presenter.C5876j.C5877a) r0
            r0.mo11760a(r6)
            return
        L_0x008c:
            int r6 = r6.f21928f
            r5.m12792a(r6)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.presenter.C5876j.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
