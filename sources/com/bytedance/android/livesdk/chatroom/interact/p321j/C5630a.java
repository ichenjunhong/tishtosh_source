package com.bytedance.android.livesdk.chatroom.interact.p321j;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.api.C4992b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.data.C5359d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5697f;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.a */
public final class C5630a implements OnMessageListener {

    /* renamed from: a */
    boolean f14753a;

    /* renamed from: b */
    boolean f14754b;

    /* renamed from: c */
    boolean f14755c;

    /* renamed from: d */
    Room f14756d;

    /* renamed from: e */
    boolean f14757e;

    /* renamed from: f */
    List<C5631a> f14758f = new ArrayList();

    /* renamed from: g */
    final C1689b f14759g = new C1689b();

    /* renamed from: h */
    public List<C5696e> f14760h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i */
    public List<C5696e> f14761i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j */
    public Map<String, Boolean> f14762j = new ConcurrentHashMap();

    /* renamed from: k */
    private IMessageManager f14763k;

    /* renamed from: l */
    private DataCenter f14764l;

    /* renamed from: m */
    private List<C5696e> f14765m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    private C0199s<KVData> f14766n = new C5633b(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.a$a */
    public interface C5631a {
        /* renamed from: a */
        void mo11122a(long j, long j2);

        /* renamed from: a */
        void mo11074a(long j, String str, boolean z);

        /* renamed from: a */
        void mo11092a(List<C5696e> list);

        /* renamed from: a */
        void mo11123a(List<C5697f> list, long j);

        /* renamed from: b */
        void mo11125b(long j, String str);

        /* renamed from: b */
        void mo11126b(List<C5696e> list);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.a$b */
    public static abstract class C5632b implements C5631a {
        /* renamed from: a */
        public final void mo11122a(long j, long j2) {
        }

        /* renamed from: a */
        public void mo11074a(long j, String str, boolean z) {
        }

        /* renamed from: a */
        public void mo11092a(List<C5696e> list) {
        }

        /* renamed from: a */
        public final void mo11123a(List<C5697f> list, long j) {
        }

        /* renamed from: b */
        public final void mo11125b(long j, String str) {
        }

        /* renamed from: b */
        public final void mo11126b(List<C5696e> list) {
        }
    }

    /* renamed from: f */
    private void m12535f() {
        m12534b(false);
    }

    /* renamed from: g */
    private void m12536g() {
        mo11519a(false);
    }

    /* renamed from: c */
    public final int mo11524c() {
        return this.f14761i.size();
    }

    /* renamed from: d */
    public final void mo11525d() {
        C5359d dVar = new C5359d();
        dVar.f14294g = 100101;
        dVar.f14291d = String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b());
        dVar.f14292e = C4638d.m11114a().f12665h;
        dVar.f14289b = "0";
        dVar.f14290c = "0";
        ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).sendSignalV1(this.f14756d.getId(), C2942b.m8369a().mo34889b(dVar), null).mo6155b(C2168a.m6521b()).mo6152a(C5645n.f14782a, C5635d.f14770a);
    }

    /* renamed from: e */
    public final void mo11526e() {
        C5359d dVar = new C5359d();
        dVar.f14294g = 100102;
        dVar.f14291d = String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b());
        dVar.f14292e = C4638d.m11114a().f12665h;
        dVar.f14289b = "0";
        dVar.f14290c = "0";
        ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).sendSignalV1(this.f14756d.getId(), C2942b.m8369a().mo34889b(dVar), null).mo6155b(C2168a.m6521b()).mo6152a(C5636e.f14771a, C5637f.f14772a);
    }

    /* renamed from: a */
    public final void mo11514a() {
        if (this.f14763k != null) {
            this.f14763k.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
            this.f14763k.addMessageListener(C8629a.LINK_MIC_SIGNAL.getIntType(), this);
        }
        this.f14764l.observeForever("cmd_interact_state_change", this.f14766n);
        this.f14757e = true;
        if (this.f14756d.isWithLinkMic()) {
            mo11519a(true);
            m12534b(true);
        }
    }

    /* renamed from: b */
    public final void mo11522b() {
        this.f14757e = false;
        this.f14764l.removeObserver("cmd_interact_state_change", this.f14766n);
        this.f14759g.mo6180a();
        if (this.f14763k != null) {
            this.f14763k.removeMessageListener(this);
        }
    }

    /* renamed from: a */
    public final void mo11515a(C5631a aVar) {
        this.f14758f.add(aVar);
    }

    /* renamed from: b */
    public final void mo11523b(C5631a aVar) {
        this.f14758f.remove(aVar);
    }

    /* renamed from: a */
    static void m12532a(Throwable th) {
        C3831a.m9706a(6, "LinkUserInfoCenter", th.getStackTrace());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11516a(C5696e eVar) {
        if (this.f14765m.size() >= 5) {
            this.f14765m.remove(0);
        }
        this.f14765m.add(eVar);
    }

    /* renamed from: b */
    public final long mo11520b(String str) {
        C5696e a = mo11513a(0, str);
        if (a == null || a.f14953d == null) {
            return 0;
        }
        return a.f14953d.getId();
    }

    /* renamed from: b */
    private void m12534b(boolean z) {
        if (!this.f14753a) {
            this.f14753a = true;
            this.f14759g.mo6181a(C4992b.m11476a((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class), this.f14756d.getId(), 1).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5639h<Object>(this, z), (C1710e<? super Throwable>) new C5640i<Object>(this)));
        }
    }

    /* renamed from: a */
    public final void mo11517a(String str) {
        this.f14762j.remove(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        m12536g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.p683ss.ugc.live.sdk.message.data.IMessage r9) {
        /*
            r8 = this;
            boolean r0 = r8.f14757e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9 instanceof com.bytedance.android.livesdk.message.model.C7829bd
            if (r0 == 0) goto L_0x0051
            com.bytedance.android.livesdk.message.model.bd r9 = (com.bytedance.android.livesdk.message.model.C7829bd) r9
            int r0 = r9.f21563a
            switch(r0) {
                case 5: goto L_0x004b;
                case 6: goto L_0x0046;
                case 7: goto L_0x003f;
                case 8: goto L_0x0016;
                case 9: goto L_0x0010;
                case 10: goto L_0x0011;
                case 11: goto L_0x0042;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0050
        L_0x0011:
            r8.m12536g()
            goto L_0x00f6
        L_0x0016:
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.j.a$a> r0 = r8.f14758f
            java.util.Iterator r0 = r0.iterator()
        L_0x001c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            com.bytedance.android.livesdk.chatroom.interact.j.a$a r1 = (com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a) r1
            long r2 = r9.f21569g
            long r4 = r9.f21570h
            r1.mo11122a(r2, r4)
            goto L_0x001c
        L_0x0030:
            long r0 = r9.f21569g
            r2 = 0
            com.bytedance.android.livesdk.chatroom.model.a.e r0 = r8.mo11513a(r0, r2)
            if (r0 == 0) goto L_0x0050
            long r1 = r9.f21570h
            r0.f14951b = r1
            goto L_0x00f6
        L_0x003f:
            r8.m12535f()
        L_0x0042:
            r8.m12536g()
            goto L_0x0050
        L_0x0046:
            r8.m12536g()
            goto L_0x00f6
        L_0x004b:
            r8.m12535f()
            goto L_0x00f6
        L_0x0050:
            return
        L_0x0051:
            boolean r0 = r9 instanceof com.bytedance.android.livesdk.message.model.C7830be
            if (r0 == 0) goto L_0x00f6
            com.bytedance.android.livesdk.message.model.be r9 = (com.bytedance.android.livesdk.message.model.C7830be) r9
            com.bytedance.android.livesdk.chatroom.interact.data.d r0 = r9.mo14144a()
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            com.bytedance.android.livesdk.chatroom.interact.data.d r9 = r9.mo14144a()
            java.lang.String r0 = r9.f14291d     // Catch:{ NumberFormatException -> 0x00f6 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00f6 }
            java.lang.String r2 = r9.f14292e     // Catch:{ NumberFormatException -> 0x00f6 }
            int r3 = r9.f14294g     // Catch:{ NumberFormatException -> 0x00f6 }
            r4 = 101002(0x18a8a, float:1.41534E-40)
            r5 = 0
            if (r3 == r4) goto L_0x009e
            switch(r3) {
                case 100101: goto L_0x0077;
                case 100102: goto L_0x0077;
                default: goto L_0x0075;
            }     // Catch:{ NumberFormatException -> 0x00f6 }
        L_0x0075:
            goto L_0x00f5
        L_0x0077:
            int r9 = r9.f14294g     // Catch:{ NumberFormatException -> 0x00f6 }
            r3 = 100102(0x18706, float:1.40273E-40)
            if (r9 != r3) goto L_0x007f
            r5 = 1
        L_0x007f:
            java.util.Map<java.lang.String, java.lang.Boolean> r9 = r8.f14762j     // Catch:{ NumberFormatException -> 0x00f6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch:{ NumberFormatException -> 0x00f6 }
            r9.put(r2, r3)     // Catch:{ NumberFormatException -> 0x00f6 }
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.j.a$a> r9 = r8.f14758f     // Catch:{ NumberFormatException -> 0x00f6 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ NumberFormatException -> 0x00f6 }
        L_0x008e:
            boolean r3 = r9.hasNext()     // Catch:{ NumberFormatException -> 0x00f6 }
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r3 = r9.next()     // Catch:{ NumberFormatException -> 0x00f6 }
            com.bytedance.android.livesdk.chatroom.interact.j.a$a r3 = (com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a) r3     // Catch:{ NumberFormatException -> 0x00f6 }
            r3.mo11074a(r0, r2, r5)     // Catch:{ NumberFormatException -> 0x00f6 }
            goto L_0x008e
        L_0x009e:
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.j.a$a> r9 = r8.f14758f     // Catch:{ NumberFormatException -> 0x00f6 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ NumberFormatException -> 0x00f6 }
        L_0x00a4:
            boolean r3 = r9.hasNext()     // Catch:{ NumberFormatException -> 0x00f6 }
            if (r3 == 0) goto L_0x00b4
            java.lang.Object r3 = r9.next()     // Catch:{ NumberFormatException -> 0x00f6 }
            com.bytedance.android.livesdk.chatroom.interact.j.a$a r3 = (com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a) r3     // Catch:{ NumberFormatException -> 0x00f6 }
            r3.mo11125b(r0, r2)     // Catch:{ NumberFormatException -> 0x00f6 }
            goto L_0x00a4
        L_0x00b4:
            r8.mo11517a(r2)     // Catch:{ NumberFormatException -> 0x00f6 }
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.e> r9 = r8.f14760h     // Catch:{ NumberFormatException -> 0x00f6 }
            int r9 = r9.size()     // Catch:{ NumberFormatException -> 0x00f6 }
        L_0x00bd:
            if (r5 >= r9) goto L_0x00f5
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.e> r3 = r8.f14760h     // Catch:{ NumberFormatException -> 0x00f6 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ NumberFormatException -> 0x00f6 }
            com.bytedance.android.livesdk.chatroom.model.a.e r3 = (com.bytedance.android.livesdk.chatroom.model.p323a.C5696e) r3     // Catch:{ NumberFormatException -> 0x00f6 }
            if (r3 == 0) goto L_0x00f2
            if (r2 == 0) goto L_0x00d5
            java.lang.String r4 = r3.mo11637a()     // Catch:{ NumberFormatException -> 0x00f6 }
            boolean r4 = android.text.TextUtils.equals(r4, r2)     // Catch:{ NumberFormatException -> 0x00f6 }
            if (r4 != 0) goto L_0x00e9
        L_0x00d5:
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f2
            com.bytedance.android.live.base.model.user.User r4 = r3.f14953d     // Catch:{ NumberFormatException -> 0x00f6 }
            if (r4 == 0) goto L_0x00f2
            com.bytedance.android.live.base.model.user.User r4 = r3.f14953d     // Catch:{ NumberFormatException -> 0x00f6 }
            long r6 = r4.getId()     // Catch:{ NumberFormatException -> 0x00f6 }
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00f2
        L_0x00e9:
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.e> r9 = r8.f14760h     // Catch:{ NumberFormatException -> 0x00f6 }
            r9.remove(r5)     // Catch:{ NumberFormatException -> 0x00f6 }
            r8.mo11516a(r3)     // Catch:{ NumberFormatException -> 0x00f6 }
            goto L_0x00f6
        L_0x00f2:
            int r5 = r5 + 1
            goto L_0x00bd
        L_0x00f5:
            return
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11518a(List<C5696e> list) {
        if (((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
            long b = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
            C5696e eVar = null;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5696e eVar2 = (C5696e) it.next();
                if (eVar2 != null && eVar2.f14953d != null && b == eVar2.f14953d.getId()) {
                    eVar = eVar2;
                    break;
                }
            }
            if (eVar != null) {
                this.f14759g.mo6181a(((LinkApi) C4157e.m10322a().mo9550a(LinkApi.class)).leave(this.f14756d.getId()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a(C5643l.f14780a, C5644m.f14781a));
                list.remove(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo11519a(boolean z) {
        if (!this.f14754b) {
            this.f14754b = true;
            this.f14759g.mo6181a(C4992b.m11476a((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class), this.f14756d.getId(), 2).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5641j<Object>(this, z), (C1710e<? super Throwable>) new C5642k<Object>(this)));
        }
    }

    /* renamed from: b */
    public final C5696e mo11521b(long j, String str) {
        for (C5696e eVar : this.f14760h) {
            if (m12533a(j, str, eVar)) {
                return eVar;
            }
        }
        return null;
    }

    public C5630a(Room room, DataCenter dataCenter) {
        this.f14756d = room;
        this.f14764l = dataCenter;
        this.f14763k = (IMessageManager) dataCenter.get("data_message_manager");
    }

    /* renamed from: a */
    public final C5696e mo11513a(long j, String str) {
        for (C5696e eVar : this.f14760h) {
            if (m12533a(j, str, eVar)) {
                return eVar;
            }
        }
        for (C5696e eVar2 : this.f14761i) {
            if (m12533a(j, str, eVar2)) {
                return eVar2;
            }
        }
        for (C5696e eVar3 : this.f14765m) {
            if (m12533a(j, str, eVar3)) {
                return eVar3;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m12533a(long j, String str, C5696e eVar) {
        if ((j <= 0 && str == null) || eVar == null || eVar.f14953d == null) {
            return false;
        }
        if ((j <= 0 || eVar.f14953d.getId() != j) && !TextUtils.equals(eVar.mo11637a(), str)) {
            return false;
        }
        return true;
    }
}
