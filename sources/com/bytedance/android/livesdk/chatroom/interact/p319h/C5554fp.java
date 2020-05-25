package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5703l;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.message.model.C7820ay;
import com.bytedance.android.livesdk.message.model.C7825ba;
import com.bytedance.android.livesdk.message.model.C7826bb;
import com.bytedance.android.livesdkapi.depend.model.live.C8716q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fp */
public final class C5554fp extends C5868cl<C5555a> implements C0199s<KVData>, OnMessageListener {

    /* renamed from: a */
    private Room f14610a;

    /* renamed from: b */
    private LinkCrossRoomDataHolder f14611b = LinkCrossRoomDataHolder.m11103a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fp$a */
    public interface C5555a extends C6463ay {
        /* renamed from: a */
        void mo11453a();

        /* renamed from: a */
        void mo11454a(User user, User user2, C5703l lVar);
    }

    /* renamed from: a */
    public final void mo8247a() {
        this.f14611b.removeObserver(this);
        super.mo8247a();
    }

    public C5554fp(DataCenter dataCenter) {
        this.f14610a = (Room) dataCenter.get("data_room");
    }

    /* renamed from: a */
    public final void mo8520a(C5555a aVar) {
        super.mo8520a(aVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC_ARMIES.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE_PUNISH.getIntType(), this);
        }
        if (this.f14611b != LinkCrossRoomDataHolder.f12605a) {
            this.f14611b.observeForever("data_pk_current_room_interact_info", this).observeForever("data_pk_state", this);
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7825ba) {
            this.f14611b.lambda$put$1$DataCenter("data_pk_mvp_list_anchor", new ArrayList());
            this.f14611b.lambda$put$1$DataCenter("data_pk_mvp_list_guest", new ArrayList());
            ((C5555a) mo8518c()).mo11453a();
        } else if (iMessage instanceof C7820ay) {
            C7820ay ayVar = (C7820ay) iMessage;
            if (ayVar.f21529a != null) {
                List<C8716q> list = ayVar.f21529a;
                if (!C9414h.m18630a(list)) {
                    if (list.get(0) != null) {
                        this.f14611b.lambda$put$1$DataCenter("data_pk_mvp_list_anchor", ((C8716q) list.get(0)).f23919b);
                    }
                    if (list.size() >= 2 && list.get(1) != null) {
                        this.f14611b.lambda$put$1$DataCenter("data_pk_mvp_list_guest", ((C8716q) list.get(1)).f23919b);
                    }
                }
            }
        } else {
            if (iMessage instanceof C7826bb) {
                C7826bb bbVar = (C7826bb) iMessage;
                if (bbVar.f21542a == 101 && bbVar.f21545d != null && bbVar.f21549h != null && bbVar.f21547f != null) {
                    ((C5555a) mo8518c()).mo11454a(bbVar.f21545d, bbVar.f21549h, bbVar.f21547f);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [com.bytedance.android.livesdkapi.depend.model.live.q] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v3
      assigns: []
      uses: []
      mth insns count: 109
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r12) {
        /*
            r11 = this;
            com.bytedance.ies.sdk.widgets.KVData r12 = (com.bytedance.ies.sdk.widgets.KVData) r12
            if (r12 == 0) goto L_0x0116
            java.lang.Object r0 = r12.getData()
            if (r0 != 0) goto L_0x000c
            goto L_0x0116
        L_0x000c:
            java.lang.String r0 = r12.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -1692693464(0xffffffff9b1b8c28, float:-1.2866586E-22)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x002c
            r3 = 1505611330(0x59bdce42, float:6.6781942E15)
            if (r2 == r3) goto L_0x0022
            goto L_0x0035
        L_0x0022:
            java.lang.String r2 = "data_pk_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0035
            r1 = 1
            goto L_0x0035
        L_0x002c:
            java.lang.String r2 = "data_pk_current_room_interact_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0035
            r1 = 0
        L_0x0035:
            r0 = 0
            switch(r1) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0115
        L_0x003b:
            java.lang.Object r12 = r12.getData()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d.PENAL
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0115
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r12 = r11.f14611b
            java.lang.String r1 = "data_pk_result"
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$c r2 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c.EVEN
            java.lang.Object r12 = r12.get(r1, r2)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$c r12 = (com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c) r12
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$c r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c.LEFT_WON
            if (r12 != r1) goto L_0x0062
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r11.f14611b
            java.lang.String r2 = "data_pk_mvp_list_anchor"
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            goto L_0x0070
        L_0x0062:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$c r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c.RIGHT_WON
            if (r12 != r1) goto L_0x00c3
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = r11.f14611b
            java.lang.String r2 = "data_pk_mvp_list_guest"
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
        L_0x0070:
            boolean r2 = com.bytedance.common.utility.C9414h.m18630a(r1)
            if (r2 != 0) goto L_0x0115
            java.lang.Object r2 = r1.get(r5)
            com.bytedance.android.livesdkapi.depend.model.live.q$a r2 = (com.bytedance.android.livesdkapi.depend.model.live.C8716q.C8717a) r2
            java.lang.String r2 = r2.f23924c
            java.lang.Object r1 = r1.get(r5)
            com.bytedance.android.livesdkapi.depend.model.live.q$a r1 = (com.bytedance.android.livesdkapi.depend.model.live.C8716q.C8717a) r1
            long r6 = r1.f23922a
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r1 = r1.mo10315h()
            long r8 = r1.mo14529b()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x009e
            r12 = 2132550745(0x7f1c2459, float:2.075483E38)
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r12)
            goto L_0x00ad
        L_0x009e:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$c r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c.LEFT_WON
            if (r12 != r1) goto L_0x00ad
            r12 = 2132550744(0x7f1c2458, float:2.0754827E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r12, r0)
        L_0x00ad:
            if (r0 == 0) goto L_0x0115
            com.bytedance.android.livesdkapi.depend.model.live.Room r12 = r11.f14610a
            long r1 = r12.getId()
            com.bytedance.android.livesdk.message.model.ce r12 = com.bytedance.android.livesdk.chatroom.p306bl.C5006c.m11494a(r1, r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = r11.f15367t
            if (r0 == 0) goto L_0x0115
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = r11.f15367t
            r0.insertMessage(r12, r4)
            goto L_0x0115
        L_0x00c3:
            return
        L_0x00c4:
            java.lang.Object r12 = r12.getData()
            com.bytedance.android.live.network.response.d r12 = (com.bytedance.android.live.network.response.C4177d) r12
            java.lang.Object r1 = r12.data
            if (r1 == 0) goto L_0x0115
            java.lang.Object r12 = r12.data
            com.bytedance.android.livesdkapi.depend.model.live.v r12 = (com.bytedance.android.livesdkapi.depend.model.live.C8722v) r12
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.q> r1 = r12.f23961g
            if (r1 == 0) goto L_0x0114
            com.bytedance.android.livesdk.message.model.ay r1 = new com.bytedance.android.livesdk.message.model.ay
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.q> r12 = r12.f23961g
            java.util.Iterator r12 = r12.iterator()
            r3 = r0
        L_0x00e7:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0103
            java.lang.Object r5 = r12.next()
            com.bytedance.android.livesdkapi.depend.model.live.q r5 = (com.bytedance.android.livesdkapi.depend.model.live.C8716q) r5
            long r6 = r5.f23918a
            com.bytedance.android.livesdkapi.depend.model.live.Room r8 = r11.f14610a
            long r8 = r8.getOwnerUserId()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0101
            r0 = r5
            goto L_0x00e7
        L_0x0101:
            r3 = r5
            goto L_0x00e7
        L_0x0103:
            r2.add(r0)
            r2.add(r3)
            r1.f21529a = r2
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r12 = r11.f15367t
            if (r12 == 0) goto L_0x0114
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r12 = r11.f15367t
            r12.insertMessage(r1, r4)
        L_0x0114:
            return
        L_0x0115:
            return
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p319h.C5554fp.onChanged(java.lang.Object):void");
    }
}
