package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.api.C4992b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.data.C5360e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5690a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5695d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.p683ss.video.rtc.interact.model.Config.Vendor;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1681ae;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cy */
public final class C5470cy extends C5868cl<C5474b> implements OnMessageListener {

    /* renamed from: a */
    boolean f14483a;

    /* renamed from: b */
    boolean f14484b;

    /* renamed from: c */
    boolean f14485c;

    /* renamed from: d */
    boolean f14486d;

    /* renamed from: e */
    boolean f14487e;

    /* renamed from: f */
    boolean f14488f;

    /* renamed from: g */
    public boolean f14489g;

    /* renamed from: h */
    public boolean f14490h;

    /* renamed from: i */
    public boolean f14491i;

    /* renamed from: j */
    boolean f14492j;

    /* renamed from: k */
    boolean f14493k;

    /* renamed from: l */
    boolean f14494l;

    /* renamed from: m */
    public Room f14495m;

    /* renamed from: n */
    public boolean f14496n;

    /* renamed from: o */
    long f14497o;

    /* renamed from: p */
    long f14498p;

    /* renamed from: q */
    public C5473a f14499q;

    /* renamed from: r */
    public DataCenter f14500r;

    /* renamed from: u */
    private boolean f14501u;

    /* renamed from: v */
    private boolean f14502v;

    /* renamed from: w */
    private C0199s<KVData> f14503w = new C5475cz(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cy$a */
    public interface C5473a {
        /* renamed from: a */
        void mo11384a(long j);

        /* renamed from: a */
        void mo11385a(long j, Throwable th);

        /* renamed from: a */
        void mo11386a(Throwable th);

        /* renamed from: b */
        void mo11387b();

        /* renamed from: b */
        void mo11388b(long j);

        /* renamed from: c */
        void mo11389c();

        /* renamed from: d */
        void mo11390d();

        /* renamed from: e */
        void mo11391e();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cy$b */
    public interface C5474b extends C6463ay {
        /* renamed from: a */
        void mo11392a();

        /* renamed from: a */
        void mo11393a(long j, String str);

        /* renamed from: a */
        void mo11394a(List<C5696e> list);

        /* renamed from: a */
        void mo11395a(boolean z);

        /* renamed from: b */
        void mo11396b(Throwable th);

        /* renamed from: b */
        void mo11397b(boolean z);

        /* renamed from: c */
        void mo11398c();

        /* renamed from: c */
        void mo11399c(Throwable th);

        /* renamed from: d */
        void mo11400d();

        /* renamed from: d */
        void mo11401d(Throwable th);

        /* renamed from: e */
        void mo11402e();

        /* renamed from: e */
        void mo11403e(Throwable th);

        /* renamed from: f */
        void mo11404f();

        /* renamed from: f */
        void mo11405f(Throwable th);

        /* renamed from: g */
        void mo11406g();

        Context getContext();

        /* renamed from: h */
        void mo11408h();

        /* renamed from: i */
        void mo11409i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11369a(Throwable th) {
        mo11751c(th);
    }

    /* renamed from: f_ */
    public static Vendor m12295f_() {
        return C5360e.m12169a();
    }

    /* renamed from: e */
    public static long m12294e() {
        return TTLiveSDKContext.getHostService().mo10315h().mo14529b();
    }

    /* renamed from: d */
    public final String mo11373d() {
        return String.valueOf(this.f14495m.getId());
    }

    /* renamed from: h */
    public final void mo11375h() {
        this.f14501u = false;
        this.f14489g = false;
        if (this.f14496n) {
            mo11383p();
        } else {
            m12296t();
        }
    }

    /* renamed from: j */
    public final void mo11377j() {
        if (mo8518c() != null && !this.f14501u) {
            this.f14501u = true;
            ((C5474b) mo8518c()).mo11398c();
        }
    }

    /* renamed from: k */
    public final void mo11378k() {
        if (mo8518c() != null) {
            C8828a.LiveResource.checkInstall(((C5474b) mo8518c()).getContext(), "interact", new C8768a() {
                /* renamed from: a */
                public final void mo8214a(String str) {
                    C5470cy.this.mo11379l();
                }
            });
        }
    }

    /* renamed from: t */
    private void m12296t() {
        if (!this.f14488f) {
            this.f14488f = true;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5498dv(this), new C5499dw(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11370b() {
        this.f14500r.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(4));
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        if (mo8518c() != null) {
            ((C5474b) mo8518c()).mo11409i();
        }
    }

    /* renamed from: g */
    public final void mo11374g() {
        ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(C5496dt.f14528a, new C5497du(this));
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
    }

    /* renamed from: i */
    public final void mo11376i() {
        if (this.f14496n) {
            this.f14501u = false;
            if (this.f14490h) {
                this.f14489g = false;
                mo11383p();
            } else if (this.f14499q != null) {
                this.f14499q.mo11391e();
            }
        } else {
            this.f14501u = false;
            this.f14489g = false;
            m12296t();
        }
    }

    /* renamed from: n */
    public final void mo11381n() {
        if (!this.f14483a) {
            this.f14483a = true;
            ((C4005af) C4992b.m11476a((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class), this.f14495m.getId(), 4).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5502dz(this), new C5478db(this));
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (2 == ((Integer) C4639e.m11122a().f12651b).intValue() || 1 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(C5494dr.f14526a, new C5495ds(this));
        }
        this.f14500r.removeObserver("cmd_interact_state_change", this.f14503w);
        if (!this.f14496n) {
            mo11370b();
        }
        super.mo8247a();
    }

    /* renamed from: l */
    public final void mo11379l() {
        C8828a aVar;
        if (mo8518c() != null) {
            Context context = ((C5474b) mo8518c()).getContext();
            if (((Boolean) LiveConfigSettingKeys.LIVE_FIX_CHECK_PLUGIN_ERROR.mo9431a()).booleanValue()) {
                aVar = C8828a.Camera;
            } else {
                aVar = C8828a.LiveResource;
            }
            if (aVar.isInstalled()) {
                ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).init();
                mo11380m();
                return;
            }
            aVar.checkInstall(context, "interact", new C8768a() {
                /* renamed from: a */
                public final void mo8214a(String str) {
                    ((C4002ac) ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).loadShortVideoRes().mo6525a((C2203w<T, ? extends R>) C5470cy.this.mo11752q())).mo9406a(new C5504ea(this), new C5505eb(this));
                }
            });
        }
    }

    /* renamed from: m */
    public final void mo11380m() {
        if (!this.f14484b) {
            this.f14484b = true;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).checkPermissionV1(this.f14495m.getId(), this.f14495m.getOwnerUserId(), 8).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5500dx(this), new C5501dy(this));
        }
    }

    /* renamed from: o */
    public final void mo11382o() {
        if (mo8518c() != null && !this.f14487e && !this.f14491i) {
            if (!this.f14502v) {
                this.f14487e = true;
                ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).joinChannelV1(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5481de(this), new C5482df(this));
            } else if (!this.f14489g) {
                this.f14500r.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(7));
                this.f14491i = true;
                ((C5474b) mo8518c()).mo11392a();
            } else {
                if (this.f14499q != null) {
                    this.f14499q.mo11387b();
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo11383p() {
        if (mo8518c() != null && !this.f14488f && !this.f14501u && !this.f14492j) {
            if (this.f14489g) {
                this.f14501u = true;
                ((C5474b) mo8518c()).mo11398c();
            } else if (this.f14502v) {
                this.f14488f = true;
                ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5483dg(this), new C5484dh(this));
            } else {
                this.f14492j = true;
                ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).finishV1(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5485di(this), new C5486dj(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11366a(C4177d dVar) throws Exception {
        this.f14488f = false;
        this.f14502v = false;
        mo11383p();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11372b(C4177d dVar) throws Exception {
        this.f14487e = false;
        this.f14502v = true;
        mo11382o();
    }

    /* renamed from: a */
    public final void mo8520a(C5474b bVar) {
        super.mo8520a(bVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
        }
        this.f14500r.observeForever("cmd_interact_state_change", this.f14503w);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11365a(C4175b bVar) throws Exception {
        this.f14484b = false;
        if (bVar.extra == null) {
            ((C5474b) mo8518c()).mo11396b((Throwable) new Exception());
            return;
        }
        List<C5695d> list = ((C5690a) bVar.extra).f14919a;
        String str = ((C5690a) bVar.extra).f14920b;
        if (!this.f14485c) {
            this.f14485c = true;
            C4639e a = C4639e.m11122a();
            a.f12678j = false;
            a.f12679k = 0;
            a.f12680l = 0;
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", "1");
            hashMap.put("guest_supported_vendor", "6");
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", "0");
            hashMap.put("link_duration", "0");
            ((C4005af) ((LinkApi) C4157e.m10322a().mo9550a(LinkApi.class)).apply(this.f14495m.getId(), this.f14495m.getOwnerUserId(), hashMap).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5492dp(this), new C5493dq(this));
            C4563ad.m10957a(this.f14495m, false, "");
        }
    }

    public final void onMessage(IMessage iMessage) {
        String str;
        if (mo8518c() != null && (iMessage instanceof C7829bd)) {
            C7829bd bdVar = (C7829bd) iMessage;
            switch (bdVar.f21563a) {
                case 2:
                    C4638d a = C4638d.m11114a();
                    a.mo10417a(bdVar.f21565c);
                    a.f12662e = bdVar.f21564b;
                    a.f12664g = bdVar.f21566d;
                    a.mo10418a(bdVar.f21568f, bdVar.f21567e);
                    if (!this.f14487e) {
                        this.f14487e = true;
                        ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).joinChannelV1(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5477da(this), new C5488dl(this));
                        HashMap hashMap = new HashMap();
                        if (this.f14495m != null) {
                            String str2 = "room_type";
                            if (this.f14495m.getStreamType() == C8710m.AUDIO) {
                                str = "radio";
                            } else {
                                str = "video";
                            }
                            hashMap.put(str2, str);
                        }
                        hashMap.put("audience_connection_type", "video");
                        C8049c.m15979a().mo14202a("audience_connection_success", hashMap, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"), C8059j.class, Room.class);
                    }
                    return;
                case 3:
                    C4639e.m11122a().mo10424b();
                    if (mo8518c() != null) {
                        ((C5474b) mo8518c()).mo11408h();
                    }
                    if (!this.f14501u) {
                        this.f14501u = true;
                        ((C5474b) mo8518c()).mo11398c();
                        return;
                    }
                    break;
                case 10:
                    if (bdVar.f21585w == TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                        ((C5474b) mo8518c()).mo11397b(false);
                        return;
                    }
                    break;
                case 11:
                    if (bdVar.f21585w == TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                        ((C5474b) mo8518c()).mo11397b(true);
                        break;
                    }
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11368a(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            C5202u uVar = (C5202u) kVData.getData();
            if (mo8518c() != null) {
                int i = uVar.f13919a;
                if (i == 5) {
                    mo11377j();
                } else if (i != 9) {
                    switch (i) {
                        case 0:
                            mo11381n();
                            return;
                        case 1:
                            ((C5474b) mo8518c()).mo11395a(true);
                            mo11378k();
                            return;
                    }
                } else if (!this.f14486d) {
                    this.f14486d = true;
                    ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14495m.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5479dc(this), new C5480dd(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11364a(long j, String str) {
        if (!this.f14493k) {
            this.f14497o = j;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).permit(this.f14495m.getId(), j, str).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5487dk(this, str), new C5489dm(this));
        }
    }

    /* renamed from: b */
    public final void mo11371b(long j, String str) {
        if (!this.f14494l) {
            this.f14494l = true;
            this.f14498p = j;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).kickOut(this.f14495m.getId(), j, str).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5490dn(this), new C5491do(this));
        }
    }

    public C5470cy(Room room, boolean z, DataCenter dataCenter) {
        this.f14495m = room;
        this.f14496n = z;
        this.f14500r = dataCenter;
    }
}
