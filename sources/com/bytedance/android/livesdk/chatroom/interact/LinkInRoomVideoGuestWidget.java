package com.bytedance.android.livesdk.chatroom.interact;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.C2240a;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.p190d.C2971a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p197d.C3051b.C3052a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.p312b.C5286a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5529ew.C5534b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5596h;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5632b;
import com.bytedance.android.livesdk.chatroom.interact.p322k.C5657g;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5695d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.p325ui.C5939aq;
import com.bytedance.android.livesdk.chatroom.p325ui.C5994bp;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.verify.C8380e;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.Client.Listener;
import com.p683ss.avframework.livestreamv2.core.Guest;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.model.CommonType.FrameFormat;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.Config.Character;
import com.p683ss.video.rtc.interact.model.Config.InteractMode;
import com.p683ss.video.rtc.interact.model.Config.Type;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class LinkInRoomVideoGuestWidget extends LiveWidget implements C5534b, C9382a {

    /* renamed from: a */
    C5994bp f14004a;

    /* renamed from: b */
    public C5529ew f14005b;

    /* renamed from: c */
    public C5630a f14006c;

    /* renamed from: d */
    public C5657g f14007d;

    /* renamed from: e */
    Guest f14008e;

    /* renamed from: f */
    C5280an f14009f;

    /* renamed from: g */
    Runnable f14010g;

    /* renamed from: h */
    Room f14011h;

    /* renamed from: i */
    public C1689b f14012i = new C1689b();

    /* renamed from: j */
    long f14013j;

    /* renamed from: k */
    private Dialog f14014k;

    /* renamed from: l */
    private C9381g f14015l;

    /* renamed from: m */
    private FrameLayout f14016m;

    /* renamed from: n */
    private Listener f14017n = new Listener() {
        public final void onError(Client client, int i, long j, Exception exc) {
            C1689b bVar = LinkInRoomVideoGuestWidget.this.f14012i;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C5267aa aaVar = new C5267aa(this, i, j, exc);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) aaVar, C5268ab.f14106a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C1689b bVar = LinkInRoomVideoGuestWidget.this.f14012i;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C5687y yVar = new C5687y(this, i, j, objArr);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) yVar, C5688z.f14913a));
        }
    };

    /* renamed from: o */
    private C5632b f14018o = new C5632b() {
        /* renamed from: a */
        public final void mo11092a(List<C5696e> list) {
            super.mo11092a(list);
            if (((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
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
                if (!z && LinkInRoomVideoGuestWidget.this.f14005b != null && LinkInRoomVideoGuestWidget.this.f14005b.f14580g) {
                    LinkInRoomVideoGuestWidget.this.f14005b.mo11442i();
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.aqb;
    }

    /* renamed from: a */
    public final void mo11078a() {
        if (isViewValid()) {
            C4575an.m10981a((int) R.string.ejq);
        }
    }

    /* renamed from: d */
    public final void mo11088d() {
        if (this.f14008e != null) {
            this.f14008e.stop();
            this.f14008e.dispose();
        } else {
            this.f14005b.mo11441h();
        }
        if (this.f14009f != null) {
            this.f14009f.mo9040d();
        }
    }

    /* renamed from: e */
    public final void mo11089e() {
        new C8552a(this.context).mo15008c((int) R.string.gyb).mo15003b(0, (int) R.string.exh, C5685w.f14907a).mo15001b().show();
    }

    /* renamed from: f */
    public final void mo11090f() {
        new C8552a(this.context, 0).mo15008c((int) R.string.ekb).mo15003b(0, (int) R.string.exh, C5686x.f14908a).mo15001b().show();
    }

    /* renamed from: g */
    public final void mo11091g() {
        this.f14007d.mo11544b(true);
        if (this.f14010g != null) {
            this.f14010g.run();
            this.f14010g = null;
        }
    }

    public void onPause() {
        if (this.f14005b.f14580g) {
            this.f14008e.switchAudio(false);
            if (this.f14009f != null) {
                this.f14009f.mo9037a();
            }
            this.f14006c.mo11525d();
            this.f14015l.sendEmptyMessageDelayed(140000, 180000);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f14015l.removeCallbacksAndMessages(null);
        if (this.f14005b.f14580g) {
            if (this.f14009f != null) {
                this.f14009f.mo9038b();
            }
            this.f14006c.mo11526e();
            this.f14008e.switchAudio(true);
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(3));
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f14011h = (Room) this.dataCenter.get("data_room");
        this.f14006c = new C5630a(this.f14011h, this.dataCenter);
        this.f14005b = new C5529ew(this.f14011h, this.dataCenter);
        this.f14015l = new C9381g(this);
        this.f14006c.mo11514a();
        C5657g gVar = new C5657g(this.f14005b.f14582i, false, this.f14016m, (FrameLayout) this.contentView, this.f14006c);
        this.f14007d = gVar;
        this.f14007d.f14828m = this.dataCenter;
        this.f14007d.mo11541a(true);
        this.f14005b.mo8520a((C5534b) this);
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        this.f14006c.mo11515a((C5631a) this.f14018o);
    }

    public void onDestroy() {
        C4638d.m11114a().mo10414a(Boolean.valueOf(false));
        this.f14005b.mo8247a();
        this.f14007d.mo11545c();
        if (this.f14006c != null) {
            this.f14006c.mo11523b((C5631a) this.f14018o);
            this.f14006c.mo11522b();
        }
        if (this.f14009f != null) {
            this.f14009f.mo9040d();
        }
        if (this.f14008e != null) {
            this.f14008e.stop();
            this.f14008e.dispose();
        }
        if (this.f14014k != null && this.f14014k.isShowing()) {
            this.f14014k.dismiss();
        }
        if (this.f14012i != null && !this.f14012i.isDisposed()) {
            this.f14012i.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    public final void mo11086c() {
        int i;
        VideoQuality videoQuality;
        if (C4639e.m11122a().f12681m == 2) {
            this.f14009f = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createLinkInRoomView(null, this.context, 1);
        } else {
            C3052a aVar = new C3052a();
            aVar.f8928a = C4639e.m11122a().f12675g;
            aVar.f8929b = C4639e.m11122a().f12676h;
            aVar.f8930c = C4639e.m11122a().f12674f ^ true ? 1 : 0;
            this.f14009f = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).createLinkVideoView(this.context, aVar);
        }
        C4639e.m11122a().f12673e = SystemClock.currentThreadTimeMillis();
        FrameFormat frameFormat = FrameFormat.TEXTURE_2D;
        boolean z = false;
        if (C4639e.m11122a().f12681m == 2) {
            ((C3053c) this.f14009f).setOutputFormat(3553);
            i = 300;
        } else {
            i = 0;
        }
        InteractConfig interactConfig = new InteractConfig();
        C5286a.m11965a(interactConfig);
        Config logReportInterval = interactConfig.setContext(this.context).setUserId(C5529ew.m12382n()).setInteractId(C4638d.m11114a().f12665h).useInteractVersionV2(C4638d.m11114a().f12668k).setLogReportInterval(5);
        if (this.f14005b.f14582i.getStreamUrlExtraSafely().f23983m > 0) {
            z = true;
        }
        if (z) {
            videoQuality = VideoQuality.GUEST_HIGH;
        } else {
            videoQuality = VideoQuality.GUEST_NORMAL;
        }
        logReportInterval.setVideoQuality(videoQuality).setVendor(C5529ew.m12383o()).setProjectKey(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).setInteractMode(InteractMode.NORMAL).setChannelName(this.f14005b.mo11446m()).setCharacter(Character.GUEST).setFrameFormat(frameFormat).setVolumeCallbackInterval(i).enableMixStream().setType(Type.VIDEO).setForceGlobalAPIServer(true);
        this.f14008e = (Guest) ((C5281ao) this.f14009f).mo9036a(interactConfig, Boolean.valueOf(true));
        this.f14008e.setListener(this.f14017n);
        this.f14008e.start();
    }

    /* renamed from: c */
    public final void mo11087c(Throwable th) {
        C4602l.m11046a(this.context, th);
    }

    public LinkInRoomVideoGuestWidget(FrameLayout frameLayout) {
        this.f14016m = frameLayout;
    }

    /* renamed from: a */
    public final void mo11080a(String str) {
        this.f14006c.mo11517a(str);
        this.f14007d.mo11125b(0, str);
    }

    public void handleMsg(Message message) {
        if (isViewValid() && 140000 == message.what && this.f14005b != null) {
            this.f14005b.mo11442i();
        }
    }

    /* renamed from: a */
    public final void mo11081a(List<C5696e> list) {
        if (isViewValid() && this.f14004a == null) {
            this.f14004a = new C5994bp(this.context, this.f14005b.f14582i, list, this.f14005b);
            this.f14004a.setOnDismissListener(new C5684v(this));
            this.f14004a.show();
            C4563ad.m10956a(this.f14005b.f14582i, "show_connection_management", "guest_connection", false);
        }
    }

    /* renamed from: b */
    public final void mo11084b(Throwable th) {
        C2971a aVar;
        if (th instanceof C2949a) {
            C2949a aVar2 = (C2949a) th;
            int errorCode = aVar2.getErrorCode();
            if (errorCode == 20048) {
                new C8552a(getContext()).mo14996a(true).mo15009c((CharSequence) C2240a.m6772a(getContext().getResources().getString(R.string.h19), new Object[]{LiveSettingKeys.LIVE_MT_LOW_AGE_AUDIENCE_LINKMIC_LIMIT.mo9431a()})).mo15003b(0, (int) R.string.e9e, (OnClickListener) new C5682t(this)).mo15003b(1, (int) R.string.e9f, C5683u.f14905a).mo15011d();
                return;
            } else if (30010 == errorCode) {
                try {
                    aVar = (C2971a) C2942b.m8369a().mo34884a(aVar2.getExtra(), C2971a.class);
                } catch (Exception e) {
                    C3831a.m9714b("LinkInRoomVideoGuestWid", (Throwable) e);
                    C3831a.m9707a("LinkInRoomVideoGuestWid", aVar2.getExtra());
                    aVar = null;
                }
                C8380e.m16603a(C3889d.m9831a(this.context), 111, aVar, null);
                return;
            } else if (31002 == errorCode) {
                C4563ad.m10955a(this.f14005b.f14582i);
            }
        }
        C4602l.m11046a(this.context, th);
    }

    /* renamed from: b */
    public final void mo11085b(List<C5695d> list, String str) {
        m11880a(false, list, str);
    }

    /* renamed from: a */
    public final void mo11079a(int i, String str) {
        C5529ew ewVar = this.f14005b;
        ewVar.f14579f = false;
        ewVar.f14580g = false;
        ewVar.mo11443j();
        StringBuilder sb = new StringBuilder("code: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(str);
        C5274ah.m11925a(1, 301, sb.toString(), "audience", C31483a.f82385b, C5529ew.m12383o().toString(), this.f14005b.mo11446m());
    }

    /* renamed from: a */
    public final void mo11082a(List<C5695d> list, String str) {
        if (list == null || list.isEmpty()) {
            C4575an.m10981a((int) R.string.edl);
        } else {
            m11880a(true, list, str);
        }
    }

    /* renamed from: a */
    public final void mo11083a(String[] strArr, boolean[] zArr) {
        int length = strArr.length;
        String str = C4638d.m11114a().f12665h;
        int i = 0;
        while (i < length) {
            if (!TextUtils.equals(strArr[i], str) || !zArr[i]) {
                i++;
            } else {
                this.f14009f.mo9039c();
                return;
            }
        }
    }

    /* renamed from: a */
    private void m11880a(boolean z, List<C5695d> list, String str) {
        if (this.f14014k == null || !this.f14014k.isShowing()) {
            this.f14014k = new C5939aq((Activity) this.context, new C5596h(this.f14005b.f14582i, z, list, str), this.dataCenter);
            this.f14014k.show();
        }
    }
}
