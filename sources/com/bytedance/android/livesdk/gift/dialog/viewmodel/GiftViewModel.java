package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.p307c.C5035a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7625r.C7626a;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.C7649u.C7650a;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.dialog.C7246c;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7507f;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7492c;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;
import com.bytedance.android.livesdk.gift.model.p379a.C7496g;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.android.livesdk.gift.model.p379a.C7498i;
import com.bytedance.android.livesdk.gift.p354b.C7219d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class GiftViewModel extends C0209x {

    /* renamed from: a */
    public final C0198r<C7290b> f19824a = new C0198r<>();

    /* renamed from: b */
    public final C7290b f19825b = new C7290b();

    /* renamed from: c */
    public DataCenter f19826c;

    /* renamed from: d */
    protected Room f19827d;

    /* renamed from: e */
    protected boolean f19828e;

    /* renamed from: f */
    protected boolean f19829f;

    /* renamed from: g */
    boolean f19830g;

    /* renamed from: h */
    public User f19831h;

    /* renamed from: i */
    public String f19832i;

    /* renamed from: j */
    public C7626a f19833j;

    /* renamed from: k */
    private final C7291c f19834k = new C7291c();

    /* renamed from: l */
    private final C1689b f19835l = new C1689b();

    /* renamed from: m */
    private final Map<GiftPage, LongSparseArray<Integer>> f19836m = new HashMap();

    /* renamed from: n */
    private Map<GiftPage, List<C7491b>> f19837n = new HashMap();

    /* renamed from: o */
    private int f19838o;

    /* renamed from: p */
    private int f19839p;

    /* renamed from: q */
    private C7514m f19840q;

    /* renamed from: r */
    private LongSparseArray<String> f19841r = new LongSparseArray<>();

    /* renamed from: s */
    private LongSparseArray<String> f19842s = new LongSparseArray<>();

    /* renamed from: t */
    private WeakReference<Context> f19843t;

    /* renamed from: u */
    private C8335g<C3009i> f19844u = new C8335g<C3009i>() {
        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((C3009i) obj);
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
            GiftViewModel.this.f19824a.postValue(GiftViewModel.this.f19825b);
            GiftViewModel.this.mo13537b();
        }
    };

    /* renamed from: v */
    private C7650a f19845v = new C7650a() {
        /* renamed from: a */
        public final void mo13538a() {
        }

        /* renamed from: a */
        public final void mo13539a(List<Prop> list) {
            GiftViewModel giftViewModel = GiftViewModel.this;
            if (!C9414h.m18630a(list)) {
                ArrayList arrayList = new ArrayList();
                for (Prop hVar : list) {
                    arrayList.add(new C7497h(hVar));
                }
                C7290b bVar = giftViewModel.f19825b;
                bVar.f19854d.clear();
                bVar.f19854d.addAll(arrayList);
                giftViewModel.f19824a.postValue(giftViewModel.f19825b);
            }
        }
    };

    /* renamed from: a */
    public final void mo13531a(Context context) {
        this.f19843t = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo13533a(DataCenter dataCenter) {
        this.f19826c = dataCenter;
        if (this.f19826c != null) {
            this.f19827d = (Room) this.f19826c.get("data_room", null);
            this.f19828e = ((Boolean) this.f19826c.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            this.f19829f = ((Boolean) this.f19826c.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13536a(com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a r3) {
        /*
            r2 = this;
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r0 = r2.f19825b
            com.bytedance.android.livesdk.gift.dialog.viewmodel.C7291c.m15109a(r0, r3)
            int r3 = r3.f19849a
            r0 = 0
            r1 = 1
            switch(r3) {
                case 2: goto L_0x005e;
                case 3: goto L_0x005a;
                case 4: goto L_0x0056;
                case 5: goto L_0x004f;
                case 6: goto L_0x004b;
                case 7: goto L_0x002d;
                case 8: goto L_0x0027;
                case 9: goto L_0x0023;
                case 10: goto L_0x000c;
                case 11: goto L_0x001d;
                case 12: goto L_0x0019;
                case 13: goto L_0x0015;
                case 14: goto L_0x0011;
                case 15: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0061
        L_0x000d:
            r2.mo13537b()
            goto L_0x0061
        L_0x0011:
            r2.m15083k()
            goto L_0x0061
        L_0x0015:
            r2.m15086n()
            goto L_0x0061
        L_0x0019:
            r2.m15082j()
            goto L_0x0061
        L_0x001d:
            r3 = 1001(0x3e9, float:1.403E-42)
            r2.m15067a(r3)
            goto L_0x0061
        L_0x0023:
            m15081i()
            goto L_0x0061
        L_0x0027:
            java.lang.String r3 = "click"
            r2.m15070a(r3)
            goto L_0x0061
        L_0x002d:
            boolean r3 = r2.f19830g
            if (r3 == 0) goto L_0x0040
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r3 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_NEW_COMBO_STYLE
            java.lang.Object r3 = r3.mo9431a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0040
            return r1
        L_0x0040:
            boolean r3 = r2.m15080h()
            if (r3 == 0) goto L_0x0062
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r3 = r2.f19825b
            r3.f19861k = r0
            goto L_0x0061
        L_0x004b:
            r2.m15084l()
            goto L_0x0061
        L_0x004f:
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r3 = r2.f19825b
            r0 = 0
            r3.mo13541a(r0)
            goto L_0x0061
        L_0x0056:
            r2.m15077e()
            goto L_0x0061
        L_0x005a:
            r2.m15078f()
            goto L_0x0061
        L_0x005e:
            r2.m15076d()
        L_0x0061:
            r0 = 1
        L_0x0062:
            android.arch.lifecycle.r<com.bytedance.android.livesdk.gift.dialog.viewmodel.b> r3 = r2.f19824a
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r1 = r2.f19825b
            r3.postValue(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.mo13536a(com.bytedance.android.livesdk.gift.dialog.viewmodel.a):boolean");
    }

    /* renamed from: a */
    public final void mo13535a(List<GiftPage> list, boolean z) {
        this.f19825b.mo13545b(GiftManager.inst().getGroupCountInfo());
        if (!C9414h.m18630a(list)) {
            boolean z2 = false;
            if (this.f19826c != null && ((Boolean) this.f19826c.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
                z2 = true;
            }
            for (GiftPage giftPage : list) {
                GiftManager.filterNotSupportGift(giftPage.gifts, z2);
                GiftManager.filterNotDisplayedOnPanel(giftPage.gifts);
                if (giftPage.pageType != 5) {
                    ArrayList arrayList = new ArrayList();
                    for (C7505d dVar : giftPage.gifts) {
                        if (dVar.f20533B == 2) {
                            C8692a aVar = new C8692a();
                            aVar.f23799f = dVar.f20534C;
                            aVar.f23796c = dVar.f20541b;
                            aVar.f23800g = dVar.f20540a;
                            arrayList.add(new C7492c(aVar));
                        } else if (dVar.f20544e != 5) {
                            if (dVar.f20544e == 3) {
                                arrayList.add(new C7498i(dVar));
                            } else if (dVar.f20544e == 9) {
                                arrayList.add(new C7496g(dVar));
                            } else {
                                arrayList.add(new C7495f(dVar));
                            }
                        }
                    }
                    this.f19837n.put(giftPage, arrayList);
                    m15079g();
                }
            }
            this.f19825b.mo13543a(list);
            this.f19825b.f19856f = this.f19837n;
            this.f19824a.postValue(this.f19825b);
        }
    }

    /* renamed from: a */
    private boolean m15073a(C7505d dVar, int i, int i2, boolean z) {
        boolean z2 = false;
        if (dVar == null) {
            return false;
        }
        if (((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10093b((long) dVar.f20545f) || ((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest()) {
            int i3 = dVar.f20544e;
            if (!(i3 == 5 || i3 == 10)) {
                z2 = m15072a(dVar, i2);
            }
            if (z) {
                mo13536a(new C7289a(1, null));
            }
            return z2;
        }
        String str = "";
        switch (i) {
            case 1:
                str = "gift";
                break;
            case 2:
                str = "fans_club_gift";
                break;
            case 3:
                str = "honor_level_gift";
                break;
        }
        m15070a(str);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13532a(Prop prop, long j, long j2, C4177d dVar) throws Exception {
        C4177d dVar2 = dVar;
        C7514m mVar = (C7514m) dVar2.data;
        long j3 = dVar2.extra.now;
        long currentTimeMillis = System.currentTimeMillis();
        for (Prop nowTimeDiff : mVar.f20623o) {
            nowTimeDiff.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        this.f19830g = false;
        m15069a(mVar);
        C7647s.m15653b(prop.f20511id, j, SystemClock.uptimeMillis() - j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15072a(com.bytedance.android.livesdk.gift.model.C7505d r21, int r22) {
        /*
            r20 = this;
            r11 = r20
            r12 = r21
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostContext> r0 = com.bytedance.android.livesdkapi.host.IHostContext.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.livesdkapi.host.IHostContext r0 = (com.bytedance.android.livesdkapi.host.IHostContext) r0
            boolean r0 = r0.isLocalTest()
            r1 = 0
            if (r0 != 0) goto L_0x002f
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.b r0 = r0.walletCenter()
            int r2 = r12.f20545f
            long r2 = (long) r2
            boolean r0 = r0.mo10093b(r2)
            if (r0 != 0) goto L_0x002f
            r0 = 2132551364(0x7f1c26c4, float:2.0756085E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r0)
            return r1
        L_0x002f:
            if (r12 != 0) goto L_0x0032
            return r1
        L_0x0032:
            android.content.Context r0 = r20.m15075c()
            if (r0 != 0) goto L_0x0039
            return r1
        L_0x0039:
            boolean r2 = r12.f20537F
            r13 = 1
            if (r2 == 0) goto L_0x009a
            com.bytedance.android.livesdk.ad.c<java.lang.Boolean> r2 = com.bytedance.android.livesdk.p272ad.C4525b.f12392bH
            java.lang.Object r2 = r2.mo10345a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x007a
            com.bytedance.android.livesdk.ad.c<java.lang.Boolean> r2 = com.bytedance.android.livesdk.p272ad.C4525b.f12392bH
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r2.mo10346a(r3)
            com.bytedance.android.live.core.setting.p<java.lang.String> r2 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.PORTAL_INTRODUCTION_URI     // Catch:{ Throwable -> 0x006d }
            java.lang.Object r2 = r2.mo9431a()     // Catch:{ Throwable -> 0x006d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x006d }
            java.lang.Class<com.bytedance.android.livesdk.schema.interfaces.a> r3 = com.bytedance.android.livesdk.schema.interfaces.C8260a.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.p245d.C4116c.m10249a(r3)     // Catch:{ Throwable -> 0x006d }
            com.bytedance.android.livesdk.schema.interfaces.a r3 = (com.bytedance.android.livesdk.schema.interfaces.C8260a) r3     // Catch:{ Throwable -> 0x006d }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Throwable -> 0x006d }
            r3.handle(r0, r2)     // Catch:{ Throwable -> 0x006d }
            goto L_0x0094
        L_0x006d:
            r0 = move-exception
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            r2 = 5
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.bytedance.android.livesdk.p399o.C8064d.m9718a(r2, r0)
            goto L_0x0094
        L_0x007a:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r11.f19826c
            java.lang.String r3 = "data_allow_send_portal_gift"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)
            java.lang.Object r2 = r2.get(r3, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0096
            r2 = 2132551281(0x7f1c2671, float:2.0755917E38)
            com.bytedance.android.live.uikit.p257c.C4204a.m10421a(r0, r2)
        L_0x0094:
            r0 = 0
            goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            if (r0 != 0) goto L_0x009a
            return r1
        L_0x009a:
            long r14 = r12.f20543d
            r11.f19830g = r13
            long r16 = android.os.SystemClock.uptimeMillis()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r11.f19826c
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r11.f19826c
            java.lang.String r2 = "data_room"
            java.lang.Object r0 = r0.get(r2, r1)
            r1 = r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        L_0x00b2:
            r2 = 0
            if (r1 == 0) goto L_0x00bd
            long r0 = r1.getId()
            r18 = r0
            goto L_0x00bf
        L_0x00bd:
            r18 = r2
        L_0x00bf:
            c.a.b.b r0 = r11.f19835l
            com.bytedance.android.live.network.e r1 = com.bytedance.android.live.network.C4157e.m10322a()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi> r4 = com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi.class
            java.lang.Object r1 = r1.mo9550a(r4)
            com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi r1 = (com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi) r1
            com.bytedance.android.live.base.model.user.User r4 = r11.f19831h
            if (r4 == 0) goto L_0x00d7
            com.bytedance.android.live.base.model.user.User r2 = r11.f19831h
            long r2 = r2.getId()
        L_0x00d7:
            r7 = r2
            r2 = r1
            r3 = r14
            r5 = r18
            r9 = r22
            c.a.v r1 = r2.send(r3, r5, r7, r9)
            com.bytedance.android.live.core.rxutils.g r2 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
            c.a.v r10 = r1.mo6513a(r2)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.l r9 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.l
            r1 = r9
            r2 = r20
            r7 = r16
            r13 = r9
            r9 = r21
            r12 = r10
            r10 = r22
            r1.<init>(r2, r3, r5, r7, r9, r10)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.m r9 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.m
            r1 = r9
            r7 = r21
            r8 = r22
            r1.<init>(r2, r3, r5, r7, r8)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.n r1 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.n
            r1.<init>(r11)
            c.a.b.c r1 = r12.mo6506a(r13, r9, r1)
            r0.mo6181a(r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.m15072a(com.bytedance.android.livesdk.gift.model.d, int):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13534a(Exception exc) {
        if (this.f19833j != null) {
            this.f19833j.mo12403a(exc, new C7294f(this));
        }
    }

    /* renamed from: n */
    private void m15086n() {
        m15085m();
        m15087o();
    }

    /* renamed from: a */
    public final int mo13527a() {
        return this.f19825b.mo13544b();
    }

    /* renamed from: c */
    private Context m15075c() {
        if (this.f19843t != null) {
            return (Context) this.f19843t.get();
        }
        return null;
    }

    /* renamed from: i */
    private static void m15081i() {
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    /* renamed from: d */
    private void m15076d() {
        if (GiftManager.inst().isGiftListLoaded()) {
            mo13535a(GiftManager.inst().getGiftPageList(), false);
        }
    }

    /* renamed from: o */
    private void m15087o() {
        if (this.f19840q != null) {
            C7246c.m15030a(this.f19840q, this.f19831h, this.f19828e, this.f19827d, this.f19839p);
        }
        this.f19840q = null;
    }

    public void onCleared() {
        super.onCleared();
        if (!this.f19835l.isDisposed()) {
            this.f19835l.dispose();
        }
        C7649u.m15656a().mo14014b(this.f19845v);
    }

    /* renamed from: e */
    private void m15077e() {
        long j;
        Room room = null;
        if (this.f19826c != null) {
            room = (Room) this.f19826c.get("data_room", null);
        }
        C7649u a = C7649u.m15656a();
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        a.mo14013b(j);
    }

    /* renamed from: j */
    private void m15082j() {
        long j;
        if (this.f19825b.f19852b != null) {
            j = this.f19825b.f19852b.mo13919p();
        } else {
            j = 0;
        }
        C4495a.m10823a().mo10301a((Object) new C7219d(j, this.f19831h, this.f19832i));
    }

    /* renamed from: b */
    public final void mo13537b() {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            this.f19825b.f19859i = 0;
            this.f19824a.postValue(this.f19825b);
            return;
        }
        GiftManager.inst().syncXgCoin(new C7295g(this));
    }

    /* renamed from: f */
    private void m15078f() {
        boolean z;
        Room room = null;
        if (this.f19826c != null) {
            room = (Room) this.f19826c.get("data_room", null);
        }
        if (this.f19826c == null || !((Boolean) this.f19826c.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (room != null) {
            GiftManager.inst().syncGiftList(new C4128f() {
                /* renamed from: a */
                public final void mo8456a(List<C7505d> list) {
                }

                /* renamed from: b */
                public final void mo8457b(List<GiftPage> list) {
                    GiftViewModel.this.mo13535a(list, true);
                }
            }, room.getId(), 3, z);
        }
    }

    /* renamed from: g */
    private void m15079g() {
        Set<GiftPage> keySet = this.f19837n.keySet();
        this.f19836m.clear();
        for (GiftPage giftPage : keySet) {
            List list = (List) this.f19837n.get(giftPage);
            if (!C9414h.m18630a(list)) {
                LongSparseArray longSparseArray = new LongSparseArray();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C7491b bVar = (C7491b) list.get(i);
                    if (bVar.f20516d instanceof C7505d) {
                        longSparseArray.append(bVar.mo13919p(), Integer.valueOf(i + 1));
                    }
                }
                this.f19836m.put(giftPage, longSparseArray);
            }
        }
    }

    /* renamed from: l */
    private void m15084l() {
        C7491b bVar = this.f19825b.f19852b;
        if (bVar != null) {
            if (bVar.f20516d instanceof C7505d) {
                C7505d dVar = (C7505d) bVar.f20516d;
                LongSparseArray longSparseArray = null;
                Iterator it = this.f19836m.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    GiftPage giftPage = (GiftPage) it.next();
                    if (giftPage.pageType == this.f19825b.f19857g) {
                        longSparseArray = (LongSparseArray) this.f19836m.get(giftPage);
                        break;
                    }
                }
                m15087o();
                if (longSparseArray == null || longSparseArray.get(dVar.f20543d) == null) {
                    this.f19839p = -1;
                } else {
                    this.f19839p = ((Integer) longSparseArray.get(dVar.f20543d)).intValue();
                }
            }
            m15068a(bVar);
            m15085m();
        }
    }

    public GiftViewModel() {
        boolean z = false;
        this.f19835l.mo6182a(C4495a.m10823a().mo10300a(C7713e.class).mo6545f(C7292d.f19864a), ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6505a((C1710e<? super T>) new C7293e<Object>(this), C7296h.f19868a));
        C7649u.m15656a().mo14011a(this.f19845v);
        this.f19824a.postValue(this.f19825b);
        if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo9431a()).intValue() & 2) == 2) {
            z = true;
        }
        if (z) {
            LongSparseArray<String> longSparseArray = (LongSparseArray) C4525b.f12399bO.mo10345a();
            if (longSparseArray != null) {
                this.f19841r = longSparseArray;
            }
            LongSparseArray<String> longSparseArray2 = (LongSparseArray) C4525b.f12400bP.mo10345a();
            if (longSparseArray2 != null) {
                this.f19842s = longSparseArray2;
            }
        }
    }

    /* renamed from: h */
    private boolean m15080h() {
        Context c = m15075c();
        if (c == null) {
            return false;
        }
        if (this.f19830g && !((Boolean) LiveConfigSettingKeys.LIVE_NEW_COMBO_STYLE.mo9431a()).booleanValue()) {
            return false;
        }
        if (!C7303o.m15113a(c)) {
            C4204a.m10421a(c, (int) R.string.e77);
            return false;
        } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            m15067a(1001);
            return false;
        } else if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.GIFT)) {
            return false;
        } else {
            if (((IHostContext) C4116c.m10249a(IHostContext.class)).isNeedProtectUnderage()) {
                C4575an.m10981a((int) R.string.epj);
                return false;
            }
            C7491b bVar = this.f19825b.f19852b;
            GiftPage a = this.f19825b.mo13540a();
            if (bVar == null || a == null) {
                return false;
            }
            int b = this.f19825b.mo13544b();
            if ((bVar instanceof C7490a) && (bVar.f20516d instanceof C7505d)) {
                return m15073a((C7505d) bVar.f20516d, a.pageType, b, ((C7490a) bVar).mo13908e());
            } else if (!(bVar instanceof C7497h) || !(bVar.f20516d instanceof Prop)) {
                return false;
            } else {
                C7497h hVar = (C7497h) bVar;
                this.f19838o = b;
                return m15071a((Prop) bVar.f20516d, this.f19838o, hVar.mo13908e());
            }
        }
    }

    /* renamed from: k */
    private void m15083k() {
        long j;
        long j2;
        Room room = (Room) this.f19826c.get("data_room", null);
        C7491b bVar = this.f19825b.f19852b;
        if ((bVar instanceof C7497h) && (bVar.f20516d instanceof Prop)) {
            Prop prop = (Prop) bVar.f20516d;
            if (prop.propType == 4) {
                C7497h hVar = (C7497h) bVar;
                if (((Prop) hVar.f20516d).banner != null) {
                    HashMap hashMap = new HashMap();
                    if (((Prop) hVar.f20516d).count <= 0) {
                        hashMap.put("has_popularity_card", Boolean.valueOf(false));
                        ((Prop) hVar.f20516d).banner.f23797d = 306;
                    } else {
                        hashMap.put("has_popularity_card", Boolean.valueOf(true));
                        ((Prop) hVar.f20516d).banner.f23797d = 373;
                    }
                    ((Prop) hVar.f20516d).banner.f23798e = 280;
                    ((Prop) hVar.f20516d).banner.f23801h = 3;
                    hashMap.put("count", Integer.valueOf(1));
                    String str = "room_id";
                    long j3 = 0;
                    if (room != null) {
                        j = room.getId();
                    } else {
                        j = 0;
                    }
                    hashMap.put(str, Long.valueOf(j));
                    hashMap.put("prop_def_id", Long.valueOf(hVar.mo13919p()));
                    String str2 = "to_uid";
                    if (room != null) {
                        j2 = room.getOwnerUserId();
                    } else {
                        j2 = 0;
                    }
                    hashMap.put(str2, Long.valueOf(j2));
                    hashMap.put("is_aweme_free_gift", Integer.valueOf(0));
                    hashMap.put("describe", hVar.mo13915l());
                    hashMap.put("next_expire", Long.valueOf(((Prop) hVar.f20516d).nextExpire));
                    if (m15075c() != null) {
                        C5035a.m11519a(m15075c(), ((Prop) hVar.f20516d).banner, hashMap);
                    }
                    int i = prop.count;
                    if (room != null) {
                        j3 = room.getId();
                    }
                    C7246c.m15029a(i, j3);
                }
            }
        }
    }

    /* renamed from: m */
    private void m15085m() {
        if (this.f19826c != null) {
            Room room = (Room) this.f19826c.get("data_room", null);
            User user = (User) this.f19826c.get("data_user_in_room", null);
            boolean z = false;
            if (!((Boolean) this.f19826c.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
                this.f19825b.f19861k = false;
            } else if ((((Integer) LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION.mo9431a()).intValue() & 4) != 4) {
                this.f19825b.f19861k = false;
            } else {
                C7491b bVar = this.f19825b.f19852b;
                if (room == null || room.getOwner() == null || bVar == null) {
                    this.f19825b.f19861k = false;
                    return;
                }
                if (bVar.f20516d instanceof C7505d) {
                    C7505d dVar = (C7505d) bVar.f20516d;
                    boolean z2 = dVar.f20548i;
                    if (!z2) {
                        this.f19825b.f19861k = false;
                        return;
                    } else if (dVar.mo13924c()) {
                        z = GiftManager.inst().canSendNobleGift(user, dVar);
                    } else if (dVar.mo13923b()) {
                        z = GiftManager.inst().canSendHonorGift(user, dVar);
                    } else if (dVar.f20564y) {
                        z = GiftManager.inst().canSendFansClubGift(room.getOwner(), user, dVar);
                    } else {
                        z = z2;
                    }
                }
                this.f19825b.f19861k = z;
            }
        }
    }

    /* renamed from: a */
    public final void mo13529a(C0184k kVar) {
        this.f19824a.removeObservers(kVar);
    }

    /* renamed from: a */
    private void m15067a(int i) {
        Context c = m15075c();
        if (c != null) {
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(c, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14539a(i).mo14544d("live_detail").mo14545e("gift_send").mo14543c("enableGift").mo14541a()).mo6314a((C1674ab<? super T>) this.f19844u);
        }
    }

    /* renamed from: b */
    private void m15074b(String str) {
        FragmentActivity fragmentActivity;
        Context c = m15075c();
        if (c instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) c;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f19828e);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, str);
            if (((IWalletService) C4116c.m10249a(IWalletService.class)).getRechargeType() != 3) {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog(fragmentActivity, bundle, this.f19826c, null);
            } else {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog(fragmentActivity, bundle, this.f19826c, null);
            }
        }
    }

    /* renamed from: a */
    private void m15068a(C7491b bVar) {
        String str;
        C7507f fVar;
        int i;
        if (bVar != null) {
            C7507f fVar2 = this.f19825b.f19858h;
            if (fVar2 != null) {
                fVar2.f20573c = false;
            }
            if (bVar.f20516d instanceof C7505d) {
                str = (String) this.f19841r.get(((C7505d) bVar.f20516d).f20543d);
            } else if (bVar.f20516d instanceof Prop) {
                str = (String) this.f19842s.get(((Prop) bVar.f20516d).f20511id);
            } else {
                return;
            }
            List<C7507f> list = this.f19825b.f19855e;
            if (list.size() > 0) {
                fVar = (C7507f) list.get(0);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                try {
                    i = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C7507f fVar3 = (C7507f) it.next();
                    if (fVar3 != null && fVar3.f20571a == i) {
                        fVar2 = fVar3;
                        break;
                    }
                }
                if (i == 0) {
                    fVar2 = fVar;
                }
                if (fVar2 != null) {
                    fVar2.f20573c = true;
                    this.f19825b.mo13542a(fVar2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15069a(com.bytedance.android.livesdk.gift.model.C7514m r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r13.f20622n
            r1 = 2
            if (r0 != r1) goto L_0x0009
            return
        L_0x0009:
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            long r2 = r13.f20613e
            com.bytedance.android.livesdk.gift.model.d r0 = r0.findGiftById(r2)
            int r2 = r0.f20544e
            r3 = 10
            if (r2 != r3) goto L_0x002b
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r2 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r2 = com.bytedance.android.live.p245d.C4116c.m10249a(r2)
            com.bytedance.android.live.wallet.IWalletService r2 = (com.bytedance.android.live.wallet.IWalletService) r2
            com.bytedance.android.live.wallet.b r2 = r2.walletCenter()
            int r3 = r13.f20627s
            r2.mo10090a(r3)
            goto L_0x003c
        L_0x002b:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r2 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r2 = com.bytedance.android.live.p245d.C4116c.m10249a(r2)
            com.bytedance.android.live.wallet.IWalletService r2 = (com.bytedance.android.live.wallet.IWalletService) r2
            com.bytedance.android.live.wallet.b r2 = r2.walletCenter()
            long r3 = r13.f20611c
            r2.mo10091a(r3)
        L_0x003c:
            long r2 = r13.f20620l
            r4 = 0
            r5 = 0
            r7 = 1
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a8
            com.bytedance.android.livesdk.gift.u r2 = com.bytedance.android.livesdk.gift.C7649u.m15656a()
            long r8 = r13.f20620l
            com.bytedance.android.livesdk.gift.model.Prop r2 = r2.mo14010a(r8)
            r13.f20629u = r2
            com.bytedance.android.livesdk.gift.model.Prop r2 = r13.f20629u
            if (r2 == 0) goto L_0x00a8
            com.bytedance.android.livesdk.gift.model.Prop r2 = r13.f20629u
            com.bytedance.android.livesdk.gift.model.d r2 = r2.gift
            long r2 = r2.f20543d
            r13.f20613e = r2
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r2 = r13.f20623o
            boolean r2 = com.bytedance.common.utility.C9414h.m18630a(r2)
            if (r2 != 0) goto L_0x0082
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r2 = r13.f20623o
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r2.next()
            com.bytedance.android.livesdk.gift.model.Prop r3 = (com.bytedance.android.livesdk.gift.model.Prop) r3
            long r8 = r3.f20511id
            long r10 = r13.f20620l
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x006c
            r2 = 0
            goto L_0x0083
        L_0x0082:
            r2 = 1
        L_0x0083:
            if (r2 == 0) goto L_0x00a8
            com.bytedance.android.livesdk.gift.model.Prop r2 = r13.f20629u
            com.bytedance.android.livesdk.gift.model.Prop r2 = com.bytedance.android.livesdk.gift.model.Prop.newInstance(r2)
            int r3 = r2.count
            int r8 = r12.f19838o
            int r3 = r3 - r8
            r2.count = r3
            int r3 = r2.count
            if (r3 >= 0) goto L_0x0098
            r2.count = r4
        L_0x0098:
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r3 = r13.f20623o
            if (r3 != 0) goto L_0x00a3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r13.f20623o = r3
        L_0x00a3:
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r3 = r13.f20623o
            r3.add(r2)
        L_0x00a8:
            com.bytedance.android.livesdk.gift.r$a r2 = r12.f19833j
            if (r2 == 0) goto L_0x00b7
            com.bytedance.android.livesdk.gift.r$a r2 = r12.f19833j
            int r3 = r12.f19839p
            boolean r2 = r2.mo12402a(r13, r3, r7)
            if (r2 != 0) goto L_0x00b7
            return
        L_0x00b7:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r12.f19826c
            r3 = 0
            if (r2 == 0) goto L_0x00c7
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r12.f19826c
            java.lang.String r8 = "data_room"
            java.lang.Object r2 = r2.get(r8, r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            goto L_0x00c8
        L_0x00c7:
            r2 = r3
        L_0x00c8:
            if (r2 == 0) goto L_0x00cf
            long r8 = r2.getId()
            goto L_0x00d0
        L_0x00cf:
            r8 = r5
        L_0x00d0:
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r2 = r13.f20623o
            if (r2 == 0) goto L_0x00e5
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r2 = r13.f20623o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00e5
            com.bytedance.android.livesdk.gift.u r2 = com.bytedance.android.livesdk.gift.C7649u.m15656a()
            java.util.List<com.bytedance.android.livesdk.gift.model.Prop> r10 = r13.f20623o
            r2.mo14012a(r10)
        L_0x00e5:
            java.lang.Class<com.bytedance.android.live.user.a> r2 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r2 = com.bytedance.android.live.p245d.C4116c.m10249a(r2)
            com.bytedance.android.live.user.a r2 = (com.bytedance.android.live.user.C4282a) r2
            com.bytedance.android.livesdk.user.e r2 = r2.user()
            r2.mo14527a(r7)
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r12.f19826c
            if (r2 == 0) goto L_0x0103
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r12.f19826c
            java.lang.String r10 = "data_message_manager"
            java.lang.Object r2 = r2.get(r10, r3)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r2 = (com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager) r2
            goto L_0x0104
        L_0x0103:
            r2 = r3
        L_0x0104:
            com.bytedance.ies.sdk.widgets.DataCenter r10 = r12.f19826c
            if (r10 == 0) goto L_0x0112
            com.bytedance.ies.sdk.widgets.DataCenter r10 = r12.f19826c
            java.lang.String r11 = "data_user_in_room"
            java.lang.Object r3 = r10.get(r11, r3)
            com.bytedance.android.live.base.model.user.User r3 = (com.bytedance.android.live.base.model.user.User) r3
        L_0x0112:
            com.bytedance.android.live.base.model.user.User r10 = r12.f19831h
            java.util.List r10 = com.bytedance.android.livesdk.gift.C7519o.m15515b(r8, r13, r10, r3)
            if (r2 == 0) goto L_0x013e
            boolean r11 = com.bytedance.common.utility.C9414h.m18630a(r10)
            if (r11 == 0) goto L_0x012a
            com.bytedance.android.live.base.model.user.User r10 = r12.f19831h
            com.bytedance.android.livesdk.message.model.ao r3 = com.bytedance.android.livesdk.gift.C7519o.m15512a(r8, r13, r10, r3)
            r2.insertMessage(r3)
            goto L_0x013e
        L_0x012a:
            java.util.Iterator r3 = r10.iterator()
        L_0x012e:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x013e
            java.lang.Object r8 = r3.next()
            com.bytedance.android.livesdk.message.model.ao r8 = (com.bytedance.android.livesdk.message.model.C7810ao) r8
            r2.insertMessage(r8)
            goto L_0x012e
        L_0x013e:
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r2 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_GIFT_PANEL_FUNCTION
            java.lang.Object r2 = r2.mo9431a()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r2 = r2 & r1
            if (r2 != r1) goto L_0x014e
            r4 = 1
        L_0x014e:
            if (r13 == 0) goto L_0x0182
            if (r4 != 0) goto L_0x0153
            goto L_0x0182
        L_0x0153:
            long r1 = r13.f20620l
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x016e
            android.util.LongSparseArray<java.lang.String> r1 = r12.f19842s
            long r2 = r13.f20620l
            int r4 = r13.f20614f
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.append(r2, r4)
            com.bytedance.android.livesdk.ad.c<android.util.LongSparseArray<java.lang.String>> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12400bP
            android.util.LongSparseArray<java.lang.String> r2 = r12.f19842s
            r1.mo10346a(r2)
            goto L_0x0182
        L_0x016e:
            android.util.LongSparseArray<java.lang.String> r1 = r12.f19841r
            long r2 = r13.f20613e
            int r4 = r13.f20614f
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.append(r2, r4)
            com.bytedance.android.livesdk.ad.c<android.util.LongSparseArray<java.lang.String>> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12399bO
            android.util.LongSparseArray<java.lang.String> r2 = r12.f19841r
            r1.mo10346a(r2)
        L_0x0182:
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r1 = r12.f19825b
            r1.f19862l = r13
            r12.f19840q = r13
            android.arch.lifecycle.r<com.bytedance.android.livesdk.gift.dialog.viewmodel.b> r1 = r12.f19824a
            com.bytedance.android.livesdk.gift.dialog.viewmodel.b r2 = r12.f19825b
            r1.postValue(r2)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r12.f19827d
            if (r1 == 0) goto L_0x01db
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r12.f19827d
            boolean r1 = r1.isStar()
            if (r1 == 0) goto L_0x01db
            if (r0 == 0) goto L_0x01b4
            boolean r0 = r0.f20539H
            if (r0 == 0) goto L_0x01b4
            com.bytedance.android.livesdk.aa.a r0 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.k.b r1 = new com.bytedance.android.livesdk.k.b
            java.lang.String r2 = "cny_send_gift"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r1.<init>(r7, r2, r3)
            r0.mo10301a(r1)
        L_0x01b4:
            if (r13 == 0) goto L_0x01db
            com.bytedance.android.livesdk.gift.model.Prop r0 = r13.f20629u
            if (r0 == 0) goto L_0x01db
            com.bytedance.android.livesdk.gift.model.Prop r0 = r13.f20629u
            com.bytedance.android.livesdk.gift.model.d r0 = r0.gift
            if (r0 == 0) goto L_0x01db
            com.bytedance.android.livesdk.gift.model.Prop r13 = r13.f20629u
            com.bytedance.android.livesdk.gift.model.d r13 = r13.gift
            boolean r13 = r13.f20539H
            if (r13 == 0) goto L_0x01db
            com.bytedance.android.livesdk.aa.a r13 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.k.b r0 = new com.bytedance.android.livesdk.k.b
            java.lang.String r1 = "cny_send_gift"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.<init>(r7, r1, r2)
            r13.mo10301a(r0)
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.m15069a(com.bytedance.android.livesdk.gift.model.m):void");
    }

    /* renamed from: a */
    private void m15070a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                m15067a((int) BaseNotice.CHECK_PROFILE);
            } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.RECHARGE)) {
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo9431a()).intValue() == 1) {
                    m15074b(str);
                } else {
                    Context c = m15075c();
                    if (c instanceof Activity) {
                        ((IWalletService) C4116c.m10249a(IWalletService.class)).openWallet((Activity) c);
                    }
                }
                this.f19825b.f19863m = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo13530a(C0184k kVar, C0199s<C7290b> sVar) {
        this.f19824a.observe(kVar, sVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15071a(com.bytedance.android.livesdk.gift.model.Prop r20, int r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = 0
            if (r8 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r1 = r8.count
            if (r1 > 0) goto L_0x0013
            r1 = 2132550910(0x7f1c24fe, float:2.0755164E38)
            com.bytedance.android.livesdk.p279af.C4575an.m10981a(r1)
            return r0
        L_0x0013:
            com.bytedance.android.livesdk.gift.model.d r1 = r8.gift
            r2 = 10
            r9 = 1
            if (r1 == 0) goto L_0x0042
            com.bytedance.android.livesdk.gift.model.d r1 = r8.gift
            boolean r1 = r1.f20539H
            if (r1 == 0) goto L_0x0042
            int r1 = r8.count
            if (r1 >= r2) goto L_0x003b
            r1 = 2132551015(0x7f1c2567, float:2.0755377E38)
            java.lang.String r1 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r1)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r0] = r2
            java.lang.String r1 = com.bytedance.android.live.core.p230g.C3897k.m9852a(r1, r3)
            com.bytedance.android.livesdk.p279af.C4575an.m10987a(r1)
            return r0
        L_0x003b:
            r0 = r21
            if (r0 >= r2) goto L_0x0044
            r15 = 10
            goto L_0x0045
        L_0x0042:
            r0 = r21
        L_0x0044:
            r15 = r0
        L_0x0045:
            r7.f19838o = r15
            r7.f19830g = r9
            long r5 = android.os.SystemClock.uptimeMillis()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f19826c
            r3 = 0
            if (r0 == 0) goto L_0x005d
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f19826c
            java.lang.String r1 = "data_room"
            java.lang.Object r0 = r0.get(r1, r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            goto L_0x005e
        L_0x005d:
            r0 = r3
        L_0x005e:
            r1 = 0
            if (r0 == 0) goto L_0x0068
            long r10 = r0.getId()
            r13 = r10
            goto L_0x0069
        L_0x0068:
            r13 = r1
        L_0x0069:
            c.a.b.b r4 = r7.f19835l
            com.bytedance.android.live.network.e r0 = com.bytedance.android.live.network.C4157e.m10322a()
            java.lang.Class<com.bytedance.android.livesdk.gift.domain.api.PropApi> r10 = com.bytedance.android.livesdk.gift.domain.api.PropApi.class
            java.lang.Object r0 = r0.mo9550a(r10)
            r10 = r0
            com.bytedance.android.livesdk.gift.domain.api.PropApi r10 = (com.bytedance.android.livesdk.gift.domain.api.PropApi) r10
            long r11 = r8.f20511id
            com.bytedance.android.live.base.model.user.User r0 = r7.f19831h
            if (r0 == 0) goto L_0x0087
            com.bytedance.android.live.base.model.user.User r0 = r7.f19831h
            long r0 = r0.getId()
            r16 = r0
            goto L_0x0089
        L_0x0087:
            r16 = r1
        L_0x0089:
            int r0 = r8.isAwemeFreeGift
            r1 = r13
            r18 = r0
            c.a.v r0 = r10.sendProp(r11, r13, r15, r16, r18)
            com.bytedance.android.live.core.rxutils.g r10 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
            c.a.v r10 = r0.mo6513a(r10)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.i r11 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.i
            r0 = r11
            r12 = r1
            r1 = r19
            r2 = r20
            r15 = r3
            r14 = r4
            r3 = r12
            r0.<init>(r1, r2, r3, r5)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.j r0 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.j
            r0.<init>(r7, r8, r12)
            com.bytedance.android.livesdk.gift.dialog.viewmodel.k r1 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.k
            r1.<init>(r7)
            c.a.b.c r0 = r10.mo6506a(r11, r0, r1)
            r14.mo6181a(r0)
            if (r22 == 0) goto L_0x00c3
            com.bytedance.android.livesdk.gift.dialog.viewmodel.a r0 = new com.bytedance.android.livesdk.gift.dialog.viewmodel.a
            r0.<init>(r9, r15)
            r7.mo13536a(r0)
        L_0x00c3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel.m15071a(com.bytedance.android.livesdk.gift.model.Prop, int, boolean):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13528a(long j, long j2, long j3, C7505d dVar, int i, C4177d dVar2) throws Exception {
        C7505d dVar3 = dVar;
        m15069a((C7514m) dVar2.data);
        C7647s.m15648a(j, j2, SystemClock.uptimeMillis() - j3);
        if (dVar3 != null && dVar3.f20539H) {
            C7647s.m15646a(j, j2, i, "gift_panel", SystemClock.uptimeMillis() - j3);
        }
        this.f19830g = false;
        this.f19824a.postValue(this.f19825b);
    }
}
