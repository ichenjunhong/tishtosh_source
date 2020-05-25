package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.arch.lifecycle.C0199s;
import android.view.SurfaceView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.livepullstream.p249a.C4138c;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4629a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5199r;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.C5269ac;
import com.bytedance.android.livesdk.chatroom.interact.C5274ah;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.interact.data.C5359d;
import com.bytedance.android.livesdk.chatroom.interact.p317f.C5375c;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7825ba;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.message.model.C7830be;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4568ah;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p683ss.avframework.livestreamv2.core.Anchor;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.Client.Listener;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.Config.Vendor;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1681ae;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cj */
public final class C5453cj extends C5868cl<C5455a> implements C0199s<KVData>, OnMessageListener {

    /* renamed from: a */
    Room f14447a;

    /* renamed from: b */
    boolean f14448b;

    /* renamed from: c */
    DataCenter f14449c;

    /* renamed from: d */
    LinkCrossRoomDataHolder f14450d;

    /* renamed from: e */
    C1690c f14451e;

    /* renamed from: f */
    boolean f14452f;

    /* renamed from: g */
    boolean f14453g;

    /* renamed from: h */
    boolean f14454h;

    /* renamed from: i */
    Anchor f14455i;

    /* renamed from: j */
    C5375c f14456j;

    /* renamed from: k */
    C5281ao f14457k;

    /* renamed from: l */
    C5269ac f14458l;

    /* renamed from: m */
    public C1689b f14459m = new C1689b();

    /* renamed from: n */
    Listener f14460n = new Listener() {
        public final void onError(Client client, int i, long j, Exception exc) {
            C1689b bVar = C5453cj.this.f14459m;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C5468cw cwVar = new C5468cw(this, i, j, exc);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) cwVar, C5469cx.f14482a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C1689b bVar = C5453cj.this.f14459m;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C5466cu cuVar = new C5466cu(this, i, j, objArr);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) cuVar, C5467cv.f14477a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo11354a(int i, long j, Object[] objArr, Integer num) throws Exception {
            VideoQuality videoQuality;
            int i2;
            switch (i) {
                case 1:
                    C5274ah.m11927a((long) ((int) j), "pk", C5453cj.this.mo11353i().toString());
                    return;
                case 2:
                    C5453cj cjVar = C5453cj.this;
                    long longValue = objArr[0].longValue();
                    if (cjVar.mo8518c() != null) {
                        ((C5455a) cjVar.mo8518c()).mo11356a(j, longValue);
                    }
                    return;
                case 4:
                    C5453cj cjVar2 = C5453cj.this;
                    if (cjVar2.f14450d.f12619j > 0) {
                        C5274ah.m11924a(0, 0, null, "anchor", "pk", cjVar2.mo11353i().toString());
                    }
                    C5274ah.m11929a(cjVar2.mo11353i().toString(), 0, 0);
                    cjVar2.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.TURN_ON_ENGINE_SUCCEED);
                    cjVar2.f14452f = true;
                    if (cjVar2.f14449c != null) {
                        cjVar2.f14449c.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, cjVar2.mo11353i().name()));
                    }
                    String a = cjVar2.f14447a.getStreamUrl().mo15381a();
                    long id = cjVar2.f14447a.getId();
                    String lowerCase = cjVar2.mo11353i().name().toLowerCase();
                    if (cjVar2.mo11352h()) {
                        videoQuality = VideoQuality.ANCHOR_HIGH;
                    } else {
                        videoQuality = VideoQuality.ANCHOR_NORMAL;
                    }
                    C5269ac acVar = new C5269ac(lowerCase, a, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
                    cjVar2.f14458l = acVar;
                    cjVar2.f14458l.mo11118a();
                    if (cjVar2.f14450d.f12619j > 0 && cjVar2.f14448b && cjVar2.f14450d.f12618i) {
                        ((C5455a) cjVar2.mo8518c()).mo11355a();
                    }
                    return;
                case 5:
                    C5453cj.this.mo11351g();
                    return;
                case 6:
                    C5453cj cjVar3 = C5453cj.this;
                    String str = objArr[0];
                    long id2 = cjVar3.f14447a.getId();
                    String valueOf = String.valueOf(cjVar3.f14450d.f12612c);
                    String vendor = cjVar3.mo11353i().toString();
                    StringBuilder sb = new StringBuilder("onWarn:");
                    sb.append(str);
                    C5274ah.m11928a(id2, valueOf, vendor, 402, sb.toString());
                    return;
                case 7:
                    C5453cj cjVar4 = C5453cj.this;
                    C4568ah.m10970b(objArr[0]);
                    ((C5455a) cjVar4.mo8518c()).mo11357a("STREAM_ON_USER_JOINED");
                    if (cjVar4.f14450d.f12619j > 0 && cjVar4.f14448b && !cjVar4.f14450d.f12618i) {
                        ((C5455a) cjVar4.mo8518c()).mo11355a();
                    }
                    return;
                case 8:
                    C5453cj.this.mo11342a(C4568ah.m10970b(objArr[0]));
                    return;
                case 11:
                    C5453cj cjVar5 = C5453cj.this;
                    C4568ah.m10970b(objArr[0]);
                    SurfaceView surfaceView = objArr[1];
                    if (cjVar5.f14451e != null) {
                        cjVar5.f14451e.dispose();
                    }
                    if (cjVar5.f14450d.f12626q > 0) {
                        long currentTimeMillis = System.currentTimeMillis() - cjVar5.f14450d.f12626q;
                        if (cjVar5.f14450d.f12618i) {
                            i2 = 2;
                        } else {
                            i2 = 3;
                        }
                        C5274ah.m11926a(currentTimeMillis, i2, cjVar5.mo11353i().toString());
                        cjVar5.f14450d.f12626q = 0;
                    }
                    C5200s sVar = new C5200s(2);
                    sVar.f13915b = surfaceView;
                    if (cjVar5.f14449c != null) {
                        cjVar5.f14449c.lambda$put$1$DataCenter("cmd_pk_state_change", sVar);
                    }
                    ((C5455a) cjVar5.mo8518c()).mo11363g();
                    ((C5455a) cjVar5.mo8518c()).mo11357a("STREAM_ON_FIRST_REMOTE_VIDEO_FRAME");
                    cjVar5.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.CONNECTION_SUCCEED);
                    break;
            }
        }
    };

    /* renamed from: o */
    private C4138c f14461o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cj$a */
    public interface C5455a extends C6463ay {
        /* renamed from: a */
        void mo11355a();

        /* renamed from: a */
        void mo11356a(long j, long j2);

        /* renamed from: a */
        void mo11357a(String str);

        /* renamed from: a */
        void mo11358a(boolean z);

        /* renamed from: c */
        void mo11359c();

        /* renamed from: d */
        void mo11360d();

        /* renamed from: e */
        void mo11361e();

        /* renamed from: f */
        void mo11362f();

        /* renamed from: g */
        void mo11363g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11345a(Throwable th) {
        mo11751c(th);
    }

    /* renamed from: k */
    private void m12268k() {
        if (this.f14458l != null) {
            this.f14458l.mo11119b();
            this.f14458l = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo11352h() {
        if (this.f14447a.getStreamUrlExtraSafely().f23982l > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m12267j() {
        this.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.TURN_OFF_ENGINE);
        if (this.f14455i != null) {
            this.f14455i.stop();
            this.f14455i.dispose();
            return;
        }
        mo11351g();
    }

    /* renamed from: e */
    public final void mo11349e() {
        if (mo8518c() != null) {
            this.f14454h = false;
            if (this.f14448b) {
                m12267j();
            } else {
                mo11350e_();
            }
        }
    }

    /* renamed from: b */
    public final void mo11347b() {
        if (this.f14450d.f12614e != 0) {
            ((C4005af) TTLiveSDKContext.getHostService().mo10315h().mo14530b(this.f14450d.f12614e).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5456ck(this), new C5457cl(this));
        }
    }

    /* renamed from: g */
    public final void mo11351g() {
        this.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.TURN_OFF_ENGINE_SUCCEED);
        this.f14452f = false;
        mo11350e_();
        m12268k();
        if (this.f14449c != null) {
            this.f14449c.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(false, null));
        }
        C5274ah.m11925a(0, 0, null, "anchor", "pk", mo11353i().toString(), String.valueOf(this.f14450d.f12612c));
    }

    /* renamed from: i */
    public final Vendor mo11353i() {
        int i;
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue() == 0) {
            i = this.f14450d.f12622m;
        } else {
            i = ((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue();
        }
        if (i == 4) {
            return Vendor.BYTE;
        }
        switch (i) {
            case 1:
                return Vendor.AGORA;
            case 2:
                return Vendor.ZEGO;
            default:
                return Vendor.AGORA;
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        this.f14449c.lambda$put$1$DataCenter("cmd_pk_state_change", new C5200s(3));
        m12268k();
        if (this.f14455i != null) {
            this.f14455i.stop();
            this.f14455i.dispose();
        }
        this.f14450d.f12611b = false;
        this.f14450d.lambda$put$1$DataCenter("data_pk_state", C4632d.DISABLED);
        C4629a aVar = (C4629a) this.f14450d.get("data_link_state", C4629a.DISABLED);
        if (this.f14448b && C4629a.FINISH_SUCCEED.compareTo(aVar) <= 0) {
            mo11348d();
        }
        this.f14450d.removeObserver(this);
        this.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.UNLOADED);
        if (this.f14451e != null) {
            this.f14451e.dispose();
        }
        if (this.f14459m != null && !this.f14459m.isDisposed()) {
            this.f14459m.dispose();
        }
        super.mo8247a();
    }

    /* renamed from: d */
    public final void mo11348d() {
        this.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.FINISH);
        if (!this.f14453g) {
            this.f14453g = true;
            this.f14450d.lambda$put$1$DataCenter("data_pk_state", C4632d.DISABLED);
            ((C4002ac) ((LinkApi) C4157e.m10322a().mo9550a(LinkApi.class)).finishV3(this.f14450d.f12612c).mo6525a((C2203w<T, ? extends R>) mo11754s())).mo9406a(new C5464cs(this), new C5465ct(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e_ */
    public void mo11350e_() {
        if (this.f14448b) {
            this.f14449c.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(8));
        }
        C4495a.m10823a().mo10301a((Object) new C5199r(2));
        this.f14449c.lambda$put$1$DataCenter("cmd_pk_state_change", new C5200s(1));
        C3974b.m10061a().mo9379a(C3983a.LivePk.name(), C3982g.m10083a("isAnchor", String.valueOf(this.f14448b)));
        if (((Boolean) LiveConfigSettingKeys.SHOW_LINK_CROSS_ROOM_RESET_STACKTRACE.mo9431a()).booleanValue() && !this.f14448b) {
            C3831a.m9708a("ttlive_pk", "LinkCrossRoomDataHolder.unloadModule", (Throwable) new IllegalStateException());
        }
    }

    /* renamed from: a */
    public final void mo11342a(int i) {
        if (this.f14448b) {
            C4204a.m10421a(TTLiveSDKContext.getHostService().mo10308a().context(), (int) R.string.ejn);
        }
        mo11348d();
        if (this.f14450d.f12619j > 0) {
            this.f14450d.lambda$put$1$DataCenter("data_pk_result", C4631c.LEFT_WON);
            this.f14450d.lambda$put$1$DataCenter("data_pk_state", C4632d.DISABLED);
        }
        ((C5455a) mo8518c()).mo11357a("STREAM_ON_USER_LEAVED");
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (!(kVData == null || kVData.getData() == null || !"cmd_stop_interact".equals(kVData.getKey()))) {
            if (((Boolean) kVData.getData()).booleanValue()) {
                ((C5455a) mo8518c()).mo11360d();
            } else if (this.f14448b) {
                mo11348d();
            }
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5455a aVar) {
        super.mo8520a(aVar);
        this.f14461o = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayerLog();
        this.f14450d = LinkCrossRoomDataHolder.m11103a();
        this.f14450d.lambda$put$1$DataCenter("data_pk_state", C4632d.DISABLED).observeForever("cmd_stop_interact", this);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_SIGNAL.getIntType(), this);
            this.f15367t.addMessageListener(C8629a.LINK_MIC_BATTLE.getIntType(), this);
        }
        if (this.f14448b) {
            this.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.SELF_JOIN);
            ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).joinChannelV3(this.f14450d.f12612c).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(new C5462cq(this), new C5463cr(this));
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C7829bd) {
            int i = ((C7829bd) iMessage).f21563a;
            if (i != 4) {
                if (i == 105) {
                    mo11349e();
                } else if (i == 205 && this.f14450d.get("data_pk_state") == C4632d.PENAL) {
                    C8056g gVar = new C8056g();
                    if (LinkCrossRoomDataHolder.m11103a().f12619j > 0 && LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                        gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                    }
                    C8049c.m15979a().mo14203a("punish_end", gVar.mo14212c("disconnect").mo14208a(String.valueOf((System.currentTimeMillis() - this.f14450d.f12635z) / 1000)), this.f14450d.mo10411b(), Room.class);
                }
            } else if (this.f14448b) {
                mo11348d();
                if (this.f14450d.f12619j > 0) {
                    this.f14450d.lambda$put$1$DataCenter("data_pk_result", C4631c.LEFT_WON);
                    this.f14450d.lambda$put$1$DataCenter("data_pk_state", C4632d.DISABLED);
                }
            } else {
                mo11349e();
            }
        } else if (iMessage instanceof C7830be) {
            if (this.f14448b) {
                C7830be beVar = (C7830be) iMessage;
                if (beVar.mo14144a() != null) {
                    C5359d a = beVar.mo14144a();
                    try {
                        if (Long.parseLong(a.f14291d) == this.f14450d.f12614e && this.f14456j != null) {
                            if (a.f14294g == 100102) {
                                ((C5455a) mo8518c()).mo11358a(true);
                                this.f14456j.f14320c = true;
                            } else if (a.f14294g == 100101) {
                                ((C5455a) mo8518c()).mo11358a(false);
                                this.f14456j.f14320c = false;
                            }
                            if (this.f14455i != null) {
                                this.f14455i.invalidateSei();
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        } else if ((iMessage instanceof C7825ba) && !this.f14448b) {
            C7825ba baVar = (C7825ba) iMessage;
            this.f14450d.f12612c = baVar.f21539a.f23829a;
            this.f14450d.f12619j = baVar.f21539a.f23830b;
            this.f14450d.f12620k = baVar.f21539a.f23831c;
            this.f14450d.f12621l = baVar.f21539a.f23832d;
            this.f14450d.f12613d = baVar.f21539a.f23833e;
            this.f14449c.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, ""));
            ((C5455a) mo8518c()).mo11355a();
        }
    }

    /* renamed from: a */
    public final void mo11346a(boolean z) {
        int i;
        if (this.f14452f) {
            this.f14456j.f14319b = z;
            C5359d dVar = new C5359d();
            if (z) {
                i = 100102;
            } else {
                i = 100101;
            }
            dVar.f14294g = i;
            dVar.f14291d = String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b());
            dVar.f14292e = String.valueOf(this.f14450d.f12624o);
            dVar.f14289b = "0";
            dVar.f14290c = "0";
            ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).sendSignalV3(this.f14450d.f12612c, C2942b.m8369a().mo34889b(dVar), null).mo6525a((C2203w<T, ? extends R>) mo11753r())).mo9406a(C5458cm.f14465a, new C5459cn(this));
        }
        if (this.f14455i != null) {
            this.f14455i.switchAudio(z);
            this.f14455i.invalidateSei();
        }
    }

    public C5453cj(DataCenter dataCenter, C5281ao aoVar) {
        this.f14449c = dataCenter;
        this.f14457k = aoVar;
        this.f14447a = (Room) this.f14449c.get("data_room");
        this.f14448b = ((Boolean) this.f14449c.get("data_is_anchor")).booleanValue();
    }

    /* renamed from: a */
    public final void mo11343a(int i, String str) {
        mo11350e_();
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C5274ah.m11925a(1, 301, sb.toString(), "anchor", "pk", mo11353i().toString(), String.valueOf(this.f14450d.f12612c));
    }
}
