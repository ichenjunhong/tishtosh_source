package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Message;
import android.os.SystemClock;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.livepullstream.p249a.C4138c;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.event.C5203v;
import com.bytedance.android.livesdk.chatroom.interact.C5280an;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.interact.C5284aq;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5252a;
import com.bytedance.android.livesdk.chatroom.interact.p312b.C5286a;
import com.bytedance.android.livesdk.chatroom.interact.p317f.C5376d;
import com.bytedance.android.livesdk.chatroom.interact.p317f.C5376d.C5377a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5387a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5474b;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5632b;
import com.bytedance.android.livesdk.chatroom.interact.p322k.C5647a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5974c;
import com.bytedance.android.livesdk.chatroom.p325ui.C5977ba;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.Client.Listener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.model.CommonType.FrameFormat;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.Config.Character;
import com.p683ss.video.rtc.interact.model.Config.InteractMode;
import com.p683ss.video.rtc.interact.model.Config.Type;
import com.p683ss.video.rtc.interact.model.Config.Vendor;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LinkInRoomAudioWidget extends LiveWidget implements C5377a, C5474b, C9382a {

    /* renamed from: a */
    C5977ba f17155a;

    /* renamed from: b */
    public C5470cy f17156b;

    /* renamed from: c */
    public C5387a f17157c;

    /* renamed from: d */
    C5630a f17158d;

    /* renamed from: e */
    public C5647a f17159e;

    /* renamed from: f */
    public Client f17160f;

    /* renamed from: g */
    C5280an f17161g;

    /* renamed from: h */
    Runnable f17162h;

    /* renamed from: i */
    public C5284aq f17163i;

    /* renamed from: j */
    public boolean f17164j;

    /* renamed from: k */
    public C5974c f17165k;

    /* renamed from: l */
    C6305a f17166l = new C6305a();

    /* renamed from: m */
    public C1689b f17167m = new C1689b();

    /* renamed from: n */
    Map<Long, C1690c> f17168n = new HashMap();

    /* renamed from: o */
    private C8548h f17169o;

    /* renamed from: p */
    private C9381g f17170p;

    /* renamed from: q */
    private C3048a f17171q;

    /* renamed from: r */
    private C4138c f17172r;

    /* renamed from: s */
    private Room f17173s;

    /* renamed from: t */
    private Listener f17174t = new Listener() {
        public final void onError(Client client, int i, long j, Exception exc) {
            C1689b bVar = LinkInRoomAudioWidget.this.f17167m;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C6497ce ceVar = new C6497ce(this, i, j, exc);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) ceVar, C6498cf.f17807a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C1689b bVar = LinkInRoomAudioWidget.this.f17167m;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C6495cc ccVar = new C6495cc(this, i, j, objArr);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) ccVar, C6496cd.f17802a));
        }
    };

    /* renamed from: u */
    private C5632b f17175u = new C5632b() {
        /* renamed from: a */
        public final void mo11092a(List<C5696e> list) {
            super.mo11092a(list);
            if (!LinkInRoomAudioWidget.this.f17164j && ((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
                long b = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
                boolean z = false;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5696e eVar = (C5696e) it.next();
                    if (eVar != null && eVar.f14953d != null && eVar.f14953d.getId() == b) {
                        z = true;
                        break;
                    }
                }
                if (!z && LinkInRoomAudioWidget.this.f17156b != null && LinkInRoomAudioWidget.this.f17156b.f14489g) {
                    LinkInRoomAudioWidget.this.f17156b.mo11377j();
                }
            }
        }
    };

    /* renamed from: v */
    private boolean f17176v;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget$a */
    class C6305a implements C6601a {

        /* renamed from: b */
        private boolean f17180b;

        /* renamed from: c */
        private View f17181c;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6305a() {
            this.f17180b = true;
        }

        /* renamed from: a */
        public final void mo12428a(boolean z) {
            int i;
            this.f17180b = z;
            if (this.f17181c != null) {
                this.f17181c.setVisibility(0);
                View view = this.f17181c;
                if (z) {
                    i = R.drawable.bv7;
                } else {
                    i = R.drawable.bv6;
                }
                view.setBackgroundResource(i);
            }
        }

        public final void onClick(View view) {
            if (this.f17180b) {
                if (LinkInRoomAudioWidget.this.f17157c.mo11292a(false) && LinkInRoomAudioWidget.this.f17160f != null) {
                    LinkInRoomAudioWidget.this.f17160f.switchAudio(false);
                    LinkInRoomAudioWidget.this.f17157c.mo11291a(C5470cy.m12294e());
                    C4575an.m10981a((int) R.string.eq6);
                    if (LinkInRoomAudioWidget.this.f17164j) {
                        LinkInRoomAudioWidget.this.f17163i.mo11128a(C5470cy.m12294e(), true);
                    }
                    mo12428a(false);
                }
            } else if (!LinkInRoomAudioWidget.this.f17157c.mo11292a(true) || LinkInRoomAudioWidget.this.f17160f == null) {
                C4575an.m10981a((int) R.string.elx);
            } else {
                LinkInRoomAudioWidget.this.f17160f.switchAudio(true);
                LinkInRoomAudioWidget.this.f17157c.mo11294b(C5470cy.m12294e());
                C4575an.m10981a((int) R.string.eq9);
                if (LinkInRoomAudioWidget.this.f17164j) {
                    LinkInRoomAudioWidget.this.f17163i.mo11128a(C5470cy.m12294e(), false);
                }
                mo12428a(true);
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17181c = view;
        }
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.aqc;
    }

    /* renamed from: h */
    public final void mo11408h() {
        C4575an.m10981a((int) R.string.eqc);
    }

    /* renamed from: d */
    public final void mo11400d() {
        if (isViewValid()) {
            C4575an.m10981a((int) R.string.ejq);
        }
    }

    /* renamed from: f */
    public final void mo11404f() {
        if (isViewValid()) {
            this.f17159e.mo11527a();
        }
    }

    /* renamed from: g */
    public final void mo11406g() {
        if (isViewValid()) {
            this.f17159e.mo11527a();
        }
    }

    /* renamed from: i */
    public final void mo11409i() {
        if (this.f17162h != null) {
            this.f17162h.run();
            this.f17162h = null;
        }
    }

    /* renamed from: e */
    public final void mo11402e() {
        if (isViewValid()) {
            m13630c(false);
            C4575an.m10981a((int) R.string.e37);
        }
    }

    /* renamed from: c */
    public final void mo11398c() {
        if (isViewValid()) {
            if (this.f17161g != null) {
                this.f17161g.mo9040d();
            }
            if (this.f17160f != null) {
                this.f17160f.stop();
                this.f17160f.dispose();
                return;
            }
            this.f17156b.mo11375h();
        }
    }

    public void onPause() {
        boolean z;
        if (this.f17156b.f14489g) {
            if (this.f17157c.mo11293b() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17176v = z;
            this.f17160f.switchAudio(false);
            if (this.f17157c.mo11293b() == 0) {
                this.f17157c.mo11291a(C5470cy.m12294e());
            }
            if (this.f17161g != null) {
                this.f17161g.mo9037a();
            }
            this.f17158d.mo11525d();
            this.f17170p.sendEmptyMessageDelayed(140000, 180000);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f17170p.removeCallbacksAndMessages(null);
        if (this.f17156b.f14489g) {
            if (this.f17161g != null) {
                this.f17161g.mo9038b();
            }
            this.f17158d.mo11526e();
            if (this.f17176v) {
                this.f17160f.switchAudio(true);
                this.f17157c.mo11294b(C5470cy.m12294e());
            }
            if (!this.f17164j) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(3));
            }
        }
    }

    /* renamed from: a */
    public final void mo11392a() {
        Character character;
        if (isViewValid()) {
            C4639e.m11122a().f12673e = SystemClock.currentThreadTimeMillis();
            if (this.f17173s.getStreamUrl().f23784l != null) {
                this.f17173s.getStreamUrl();
            }
            Vendor f_ = C5470cy.m12295f_();
            C5376d dVar = new C5376d(this);
            InteractConfig backgroundColor = new InteractConfig().setStreamMixer(dVar).setBackgroundColor("#161823");
            C5286a.m11965a(backgroundColor);
            Config volumeCallbackInterval = backgroundColor.setContext(this.context).setUserId(C5470cy.m12294e()).setLogReportInterval(5).setInteractId(C4638d.m11114a().f12665h).setVideoQuality(VideoQuality.GUEST_NORMAL).setVendor(f_).setProjectKey(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).setInteractMode(InteractMode.NORMAL).setVolumeCallbackInterval(300);
            if (this.f17164j) {
                character = Character.ANCHOR;
            } else {
                character = Character.GUEST;
            }
            volumeCallbackInterval.setCharacter(character).setSeiVersion(3).enableMixStream().setChannelName(this.f17156b.mo11373d());
            dVar.mo11286a(backgroundColor);
            if (this.f17164j) {
                ((C3053c) this.f17161g).setOutputFormat(3553);
                backgroundColor.setMixStreamRtmpUrl(this.f17156b.f14495m.getStreamUrl().mo15381a()).setFrameFormat(FrameFormat.TEXTURE_2D).setAutoUpdateSeiForTalk(true).setType(Type.VIDEO);
                this.f17160f = ((C5281ao) this.f17161g).mo9036a(backgroundColor, Boolean.valueOf(false));
            } else {
                backgroundColor.setType(Type.AUDIO);
                this.f17160f = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createGuestClient(this.context, backgroundColor);
            }
            this.f17160f.setListener(this.f17174t);
            this.f17160f.start();
        }
    }

    public void onDestroy() {
        if (this.f17164j) {
            C6610k.m13985a().mo12667a(C6605h.RADIO_COVER, (C6597a) new C6435e(0));
        }
        C6610k.m13985a().mo12670b(C6605h.AUDIO_TOGGLE, this.f17166l);
        C4638d.m11114a().mo10414a(Boolean.valueOf(false));
        this.f17168n.clear();
        this.f17157c.mo8247a();
        this.f17156b.mo8247a();
        C5647a aVar = this.f17159e;
        aVar.f14795l = false;
        if (aVar.f14799p != null && aVar.f14799p.isShowing()) {
            aVar.f14799p.dismiss();
        }
        if (aVar.f14798o != null) {
            aVar.f14798o.mo8247a();
        }
        aVar.f14785b.removeAllViews();
        C5203v vVar = new C5203v(false);
        C4495a.m10823a().mo10301a((Object) vVar);
        aVar.f14796m.lambda$put$1$DataCenter("cmd_interact_audio", vVar);
        C4639e.m11122a().mo10415b(aVar.f14797n);
        if (this.f17158d != null) {
            this.f17158d.mo11523b((C5631a) this.f17175u);
            this.f17158d.mo11522b();
        }
        if (this.f17161g != null) {
            this.f17161g.mo9040d();
        }
        if (this.f17160f != null) {
            this.f17160f.stop();
            this.f17160f.dispose();
        }
        if (this.f17167m != null && !this.f17167m.isDisposed()) {
            this.f17167m.dispose();
        }
        this.f17171q = null;
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f17173s = (Room) this.dataCenter.get("data_room");
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17158d = new C5630a(this.f17173s, this.dataCenter);
        this.f17172r = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayerLog();
        this.f17156b = new C5470cy(this.f17173s, booleanValue, this.dataCenter);
        this.f17157c = new C5387a(this.f17173s, booleanValue, this.f17158d);
        this.f17157c.mo8520a(null);
        this.f17170p = new C9381g(this);
        this.f17164j = booleanValue;
        this.f17158d.mo11514a();
        C5647a aVar = new C5647a(this.f17156b.f14495m, this.f17164j, (FrameLayout) this.containerView, this.f17158d, this.context, this.f17163i, this.dataCenter);
        this.f17159e = aVar;
        C5647a aVar2 = this.f17159e;
        C5203v vVar = new C5203v(true);
        C4495a.m10823a().mo10301a((Object) vVar);
        aVar2.f14796m.lambda$put$1$DataCenter("cmd_interact_audio", vVar);
        aVar2.f14795l = true;
        aVar2.f14786c = LayoutInflater.from(aVar2.f14785b.getContext()).inflate(R.layout.ar6, aVar2.f14785b, false);
        aVar2.f14786c.setVisibility(4);
        aVar2.f14787d = (ImageView) aVar2.f14786c.findViewById(R.id.dtk);
        aVar2.f14788e = (TextView) aVar2.f14786c.findViewById(R.id.dtl);
        aVar2.f14789f = (RecyclerView) LayoutInflater.from(aVar2.f14785b.getContext()).inflate(R.layout.ar5, aVar2.f14785b, false);
        aVar2.f14789f.setLayoutManager(new GridLayoutManager(aVar2.f14785b.getContext(), 4));
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            C5696e eVar = new C5696e();
            eVar.f14952c = 0;
            arrayList.add(eVar);
        }
        aVar2.f14790g = new C5252a(arrayList, aVar2);
        aVar2.f14789f.setAdapter(aVar2.f14790g);
        aVar2.f14785b.addView(aVar2.f14786c);
        LayoutParams layoutParams = new LayoutParams(-2, -2, 1);
        layoutParams.topMargin = C3922z.m9913d(R.dimen.ra);
        aVar2.f14785b.addView(aVar2.f14789f, layoutParams);
        aVar2.f14791h.mo11515a((C5631a) aVar2);
        aVar2.mo11527a();
        C4639e.m11122a().mo10413a(aVar2.f14797n);
        this.f17156b.mo8520a((C5474b) this);
        if (!this.f17164j) {
            C4639e.m11122a().mo10414a(Integer.valueOf(0));
        } else {
            this.f17161g = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createLinkInRoomView(this.f17171q, this.context, 0);
        }
        if (this.f17164j) {
            C6610k.m13985a().mo12667a(C6605h.RADIO_COVER, (C6597a) new C6435e(8));
        }
        this.f17158d.mo11515a((C5631a) this.f17175u);
    }

    /* renamed from: a */
    public final long mo11288a(String str) {
        return this.f17158d.mo11520b(str);
    }

    /* renamed from: a */
    public final void mo11395a(boolean z) {
        m13630c(true);
    }

    /* renamed from: c */
    public final void mo11399c(Throwable th) {
        if (isViewValid()) {
            m13630c(false);
            C4602l.m11047a(getContext(), th, (int) R.string.ej1);
        }
    }

    /* renamed from: d */
    public final void mo11401d(Throwable th) {
        if (isViewValid()) {
            C4602l.m11047a(getContext(), th, (int) R.string.elm);
        }
    }

    /* renamed from: f */
    public final void mo11405f(Throwable th) {
        if (isViewValid()) {
            C4602l.m11046a(this.context, th);
        }
    }

    public void handleMsg(Message message) {
        if (isViewValid() && 140000 == message.what && this.f17156b != null) {
            this.f17156b.mo11377j();
        }
    }

    /* renamed from: c */
    private void m13630c(boolean z) {
        if (z) {
            if (this.f17169o == null) {
                this.f17169o = new C8552a(getContext(), 2).mo15008c((int) R.string.ej3).mo15001b();
            }
            if (!this.f17169o.isShowing()) {
                this.f17169o.show();
            }
        } else if (this.f17169o != null && this.f17169o.isShowing()) {
            this.f17169o.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo12426b(String str) {
        if (((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue() && this.f17158d != null) {
            C5696e a = this.f17158d.mo11513a(this.f17158d.mo11520b(str), str);
            if (!(a == null || a.f14953d == null)) {
                C1690c cVar = (C1690c) this.f17168n.remove(Long.valueOf(a.f14953d.getId()));
                if (cVar != null) {
                    cVar.dispose();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11403e(Throwable th) {
        if (isViewValid()) {
            C4602l.m11047a(getContext(), th, (int) R.string.elm);
        }
    }

    /* renamed from: a */
    public final void mo11394a(List<C5696e> list) {
        if (isViewValid() && this.f17155a == null) {
            C5977ba baVar = new C5977ba(this.context, this.f17164j, this.f17156b.f14495m, list, this.f17156b);
            this.f17155a = baVar;
            this.f17155a.setOnDismissListener(new C6494cb(this));
            this.f17155a.show();
            C4563ad.m10956a(this.f17156b.f14495m, "show_connection_management", "guest_connection", false);
        }
    }

    /* renamed from: b */
    public final void mo11396b(Throwable th) {
        if (isViewValid()) {
            m13630c(false);
            if (th instanceof C2949a) {
                int errorCode = ((C2949a) th).getErrorCode();
                if (30010 == errorCode) {
                    new C8552a(this.context).mo15008c((int) R.string.emq).mo15003b(0, (int) R.string.emp, (OnClickListener) new C6491bz(this)).mo15003b(1, (int) R.string.e45, C6493ca.f17796a).mo15011d();
                    return;
                } else if (31002 == errorCode) {
                    C4563ad.m10955a(this.f17156b.f14495m);
                }
            }
            C4602l.m11046a(this.context, th);
        }
    }

    /* renamed from: b */
    public final void mo11397b(boolean z) {
        if (isViewValid() && this.f17160f != null) {
            this.f17160f.switchAudio(z);
            if (z) {
                this.f17166l.mo12428a(true);
                C4575an.m10981a((int) R.string.eqe);
                return;
            }
            this.f17166l.mo12428a(false);
            C4575an.m10981a((int) R.string.elx);
        }
    }

    /* renamed from: c */
    public final void mo12427c(String str) {
        User user;
        if (this.f17158d != null) {
            if (this.f17164j && ((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
                C5696e a = this.f17158d.mo11513a(0, str);
                if (a == null) {
                    user = null;
                } else {
                    user = a.f14953d;
                }
                if (!(user == null || this.f17156b == null)) {
                    this.f17156b.mo11371b(user.getId(), user.getSecUid());
                }
            }
            this.f17158d.mo11517a(str);
            this.f17159e.mo11125b(0, str);
        }
    }

    public LinkInRoomAudioWidget(C3048a aVar, C5284aq aqVar) {
        this.f17171q = aVar;
        this.f17163i = aqVar;
    }

    /* renamed from: a */
    public final void mo11393a(long j, String str) {
        if (((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
            this.f17168n.put(Long.valueOf(j), ((C4002ac) C2201v.m6592a((long) ((Integer) LiveConfigSettingKeys.LIVE_INTERACT_TIME_OUT.mo9431a()).intValue(), TimeUnit.SECONDS).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6490by<Object>(this, j, str)));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.f17156b.mo11378k();
        }
    }
}
