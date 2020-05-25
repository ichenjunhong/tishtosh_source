package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.api.C4992b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.data.C5360e;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5695d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.presenter.C5868cl;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6463ay;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
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
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ew */
public final class C5529ew extends C5868cl<C5534b> implements OnMessageListener {

    /* renamed from: a */
    boolean f14574a;

    /* renamed from: b */
    boolean f14575b;

    /* renamed from: c */
    boolean f14576c;

    /* renamed from: d */
    boolean f14577d;

    /* renamed from: e */
    boolean f14578e;

    /* renamed from: f */
    public boolean f14579f;

    /* renamed from: g */
    public boolean f14580g;

    /* renamed from: h */
    public boolean f14581h;

    /* renamed from: i */
    public Room f14582i;

    /* renamed from: j */
    public C5533a f14583j;

    /* renamed from: k */
    C4639e f14584k = C4639e.m11122a();

    /* renamed from: l */
    public DataCenter f14585l;

    /* renamed from: m */
    private C0199s<KVData> f14586m = new C5535ex(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ew$a */
    public interface C5533a {
        /* renamed from: a */
        void mo11447a(Throwable th);

        /* renamed from: b */
        void mo11448b();

        /* renamed from: b */
        void mo11449b(Throwable th);

        /* renamed from: c */
        void mo11450c();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.ew$b */
    public interface C5534b extends C6463ay {
        /* renamed from: a */
        void mo11078a();

        /* renamed from: a */
        void mo11081a(List<C5696e> list);

        /* renamed from: a */
        void mo11082a(List<C5695d> list, String str);

        /* renamed from: b */
        void mo11084b(Throwable th);

        /* renamed from: b */
        void mo11085b(List<C5695d> list, String str);

        /* renamed from: c */
        void mo11086c();

        /* renamed from: c */
        void mo11087c(Throwable th);

        /* renamed from: d */
        void mo11088d();

        /* renamed from: e */
        void mo11089e();

        /* renamed from: f */
        void mo11090f();

        /* renamed from: g */
        void mo11091g();

        Context getContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11435a(Throwable th) {
        mo11751c(th);
    }

    /* renamed from: o */
    public static Vendor m12383o() {
        return C5360e.m12169a();
    }

    /* renamed from: n */
    public static long m12382n() {
        return TTLiveSDKContext.getHostService().mo10315h().mo14529b();
    }

    /* renamed from: h */
    public final void mo11441h() {
        this.f14579f = false;
        this.f14580g = false;
        mo11443j();
    }

    /* renamed from: m */
    public final String mo11446m() {
        return String.valueOf(this.f14582i.getId());
    }

    /* renamed from: i */
    public final void mo11442i() {
        if (mo8518c() != null && !this.f14579f) {
            this.f14579f = true;
            ((C5534b) mo8518c()).mo11088d();
        }
    }

    /* renamed from: b */
    public final void mo11436b() {
        if (!this.f14574a) {
            this.f14574a = true;
            ((C4005af) C4992b.m11476a((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class), this.f14582i.getId(), 1).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5536ey(this), new C5544ff(this));
        }
    }

    /* renamed from: d */
    public final void mo11437d() {
        if (mo8518c() != null) {
            final Context context = ((C5534b) mo8518c()).getContext();
            Activity a = C3889d.m9831a(context);
            if (a != null) {
                C8302f.m16453a(a).mo14483a(new C5547fi(a)).mo14484a(new C8288d() {
                    /* renamed from: b */
                    public final void mo9069b(String... strArr) {
                    }

                    /* renamed from: a */
                    public final void mo9068a(String... strArr) {
                        C8828a.LiveResource.checkInstall(context, "interact", new C8768a() {
                            /* renamed from: a */
                            public final void mo8214a(String str) {
                                C5529ew.this.mo11438e();
                            }
                        });
                    }
                }, "android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
    }

    /* renamed from: g */
    public final void mo11440g() {
        ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14582i.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(C5550fl.f14606a, new C5551fm(this));
    }

    /* renamed from: j */
    public void mo11443j() {
        if (!this.f14578e) {
            this.f14578e = true;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14582i.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5537ez(this), new C5539fa(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo11445l() {
        if (this.f14585l != null) {
            this.f14585l.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(4));
        }
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        if (mo8518c() != null) {
            ((C5534b) mo8518c()).mo11091g();
        }
    }

    /* renamed from: a */
    public final void mo8247a() {
        if (2 == ((Integer) C4639e.m11122a().f12651b).intValue() || 1 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
            ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14582i.getId()).mo6152a(C5545fg.f14601a, (C1710e<? super Throwable>) new C5546fh<Object>(this));
        }
        mo11445l();
        this.f14585l.removeObserver("cmd_interact_state_change", this.f14586m);
        super.mo8247a();
    }

    /* renamed from: e */
    public final void mo11438e() {
        C8828a aVar;
        if (mo8518c() != null) {
            Context context = ((C5534b) mo8518c()).getContext();
            if (((Boolean) LiveConfigSettingKeys.LIVE_FIX_CHECK_PLUGIN_ERROR.mo9431a()).booleanValue()) {
                aVar = C8828a.Camera;
            } else {
                aVar = C8828a.LiveResource;
            }
            if (aVar.isInstalled()) {
                ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).init();
                mo11439f();
                return;
            }
            aVar.checkInstall(context, "interact", new C8768a() {
                /* renamed from: a */
                public final void mo8214a(String str) {
                    ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).loadShortVideoRes().mo6505a((C1710e<? super T>) new C5552fn<Object>(this), C5553fo.f14609a);
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo11439f() {
        if (!this.f14575b) {
            this.f14575b = true;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).checkPermissionV1(this.f14582i.getId(), this.f14582i.getOwnerUserId(), 1).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5548fj(this), new C5549fk(this));
        }
    }

    /* renamed from: k */
    public final void mo11444k() {
        if (!this.f14576c && mo8518c() != null) {
            this.f14576c = true;
            ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).leave(this.f14582i.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5540fb(this), new C5541fc(this));
        }
    }

    /* renamed from: a */
    public final void mo8520a(C5534b bVar) {
        super.mo8520a(bVar);
        if (this.f15367t != null) {
            this.f15367t.addMessageListener(C8629a.LINK_MIC.getIntType(), this);
        }
        this.f14585l.observeForever("cmd_interact_state_change", this.f14586m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11434a(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            C5202u uVar = (C5202u) kVData.getData();
            if (mo8518c() != null) {
                int i = uVar.f13919a;
                if (i != 5) {
                    switch (i) {
                        case 0:
                            mo11436b();
                            return;
                        case 1:
                            mo11437d();
                            return;
                    }
                } else {
                    mo11442i();
                }
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        String str;
        if (mo8518c() != null && (iMessage instanceof C7829bd)) {
            C7829bd bdVar = (C7829bd) iMessage;
            switch (bdVar.f21563a) {
                case 2:
                    C4638d a = C4638d.m11114a();
                    a.f12662e = bdVar.f21564b;
                    a.mo10417a(bdVar.f21565c);
                    a.f12664g = bdVar.f21566d;
                    a.mo10418a(bdVar.f21568f, bdVar.f21567e);
                    if (!this.f14577d) {
                        this.f14577d = true;
                        ((C4005af) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).joinChannelV1(this.f14582i.getId()).mo6153a((C1681ae<T, ? extends R>) mo11753r())).mo9410a(new C5542fd(this), new C5543fe(this));
                        HashMap hashMap = new HashMap();
                        if (this.f14582i != null) {
                            String str2 = "room_type";
                            if (this.f14582i.getStreamType() == C8710m.AUDIO) {
                                str = "radio";
                            } else {
                                str = "video";
                            }
                            hashMap.put(str2, str);
                        }
                        hashMap.put("audience_connection_type", "video");
                        C8049c.m15979a().mo14202a("audience_connection_success", hashMap, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"), C8059j.class, Room.class);
                        break;
                    }
                    break;
                case 3:
                    C4639e.m11122a().mo10424b();
                    if (mo8518c() != null) {
                        ((C5534b) mo8518c()).mo11089e();
                    }
                    if (!this.f14579f) {
                        this.f14579f = true;
                        ((C5534b) mo8518c()).mo11088d();
                        return;
                    }
                    break;
            }
        }
    }

    public C5529ew(Room room, DataCenter dataCenter) {
        this.f14582i = room;
        this.f14585l = dataCenter;
    }
}
