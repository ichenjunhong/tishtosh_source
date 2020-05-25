package com.bytedance.android.livesdk.chatroom.interact;

import android.arch.lifecycle.C0199s;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.livepullstream.p249a.C4138c;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4637c;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4640f;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.interact.p312b.C5286a;
import com.bytedance.android.livesdk.chatroom.interact.p317f.C5373b;
import com.bytedance.android.livesdk.chatroom.interact.p317f.C5373b.C5374a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5511eg;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5511eg.C5513b;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5631a;
import com.bytedance.android.livesdk.chatroom.interact.p321j.C5630a.C5632b;
import com.bytedance.android.livesdk.chatroom.interact.p322k.C5657g;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5974c;
import com.bytedance.android.livesdk.chatroom.p325ui.C5988bj;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.avframework.livestreamv2.core.Anchor;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.Client.Listener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.model.CommonType.FrameFormat;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.Config.Character;
import com.p683ss.video.rtc.interact.model.Config.InteractMode;
import com.p683ss.video.rtc.interact.model.Config.Type;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LinkInRoomVideoAnchorWidget extends LiveWidget implements C0199s<KVData>, C5374a, C5513b {

    /* renamed from: a */
    public Anchor f13987a;

    /* renamed from: b */
    public C5511eg f13988b;

    /* renamed from: c */
    public C5630a f13989c;

    /* renamed from: d */
    C5988bj f13990d;

    /* renamed from: e */
    C5269ac f13991e;

    /* renamed from: f */
    public C1689b f13992f = new C1689b();

    /* renamed from: g */
    Map<Long, C1690c> f13993g = new HashMap();

    /* renamed from: h */
    long f13994h;

    /* renamed from: i */
    public C5974c f13995i;

    /* renamed from: j */
    Room f13996j;

    /* renamed from: k */
    private C5657g f13997k;

    /* renamed from: l */
    private C5281ao f13998l;

    /* renamed from: m */
    private C4138c f13999m;

    /* renamed from: n */
    private C5631a f14000n = new C5632b() {
        /* renamed from: a */
        public final void mo11074a(long j, String str, boolean z) {
            if (LinkInRoomVideoAnchorWidget.this.f13987a != null) {
                LinkInRoomVideoAnchorWidget.this.f13987a.invalidateSei();
            }
        }
    };

    /* renamed from: o */
    private Listener f14001o = new Listener() {
        public final void onError(Client client, int i, long j, Exception exc) {
            C1689b bVar = LinkInRoomVideoAnchorWidget.this.f13992f;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C5667p pVar = new C5667p(this, i, j, exc);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) pVar, C5668q.f14858a));
        }

        public final void onInfo(Client client, int i, long j, Object... objArr) {
            if (i == 7) {
                C5630a aVar = LinkInRoomVideoAnchorWidget.this.f13989c;
                aVar.f14762j.put(String.valueOf(objArr[0]), Boolean.TRUE);
            } else if (i == 8) {
                LinkInRoomVideoAnchorWidget.this.f13989c.mo11517a(String.valueOf(objArr[0]));
            }
            C1689b bVar = LinkInRoomVideoAnchorWidget.this.f13992f;
            C2201v a = C2201v.m6614b(Integer.valueOf(1)).mo6514a(C1667a.m5940a());
            C5665n nVar = new C5665n(this, i, j, objArr);
            bVar.mo6181a(a.mo6505a((C1710e<? super T>) nVar, C5666o.f14853a));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo11075a(int i, long j, Object[] objArr, Integer num) throws Exception {
            VideoQuality videoQuality;
            switch (i) {
                case 1:
                    LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget = LinkInRoomVideoAnchorWidget.this;
                    C5274ah.m11927a((long) ((int) j), C31483a.f82385b, C5511eg.m12351h().toString());
                    return;
                case 2:
                    LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget2 = LinkInRoomVideoAnchorWidget.this;
                    long longValue = objArr[0].longValue();
                    if (linkInRoomVideoAnchorWidget2.f13995i != null) {
                        linkInRoomVideoAnchorWidget2.f13995i.mo11962a(j, longValue);
                    }
                    return;
                case 4:
                    LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget3 = LinkInRoomVideoAnchorWidget.this;
                    if (linkInRoomVideoAnchorWidget3.isViewValid()) {
                        C5274ah.m11929a(C5511eg.m12351h().toString(), 0, 0);
                        C5511eg egVar = linkInRoomVideoAnchorWidget3.f13988b;
                        C5274ah.m11924a(0, 0, null, "anchor", C31483a.f82385b, C5511eg.m12351h().toString());
                        egVar.f14548g = false;
                        egVar.f14550i = true;
                        if (egVar.f14555n != null) {
                            egVar.f14555n.mo11428b();
                        }
                        linkInRoomVideoAnchorWidget3.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, C5511eg.m12351h().name()));
                        String i2 = linkInRoomVideoAnchorWidget3.f13988b.mo11423i();
                        long id = linkInRoomVideoAnchorWidget3.f13988b.f14552k.getId();
                        String lowerCase = C5511eg.m12351h().name().toLowerCase();
                        if (linkInRoomVideoAnchorWidget3.f13988b.mo11421g()) {
                            videoQuality = VideoQuality.ANCHOR_HIGH;
                        } else {
                            videoQuality = VideoQuality.ANCHOR_NORMAL;
                        }
                        C5269ac acVar = new C5269ac(lowerCase, i2, id, videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getBitrate(), videoQuality.getFps());
                        linkInRoomVideoAnchorWidget3.f13991e = acVar;
                        linkInRoomVideoAnchorWidget3.f13991e.mo11118a();
                        C8056g gVar = new C8056g();
                        gVar.mo14209b(linkInRoomVideoAnchorWidget3.f13996j.getOwner().getId()).mo14211c(linkInRoomVideoAnchorWidget3.f13994h);
                        HashMap hashMap = new HashMap();
                        hashMap.put("room_id", String.valueOf(linkInRoomVideoAnchorWidget3.f13988b.f14552k.getId()));
                        hashMap.put("anchor_id", String.valueOf(linkInRoomVideoAnchorWidget3.f13988b.f14552k.getOwner().getId()));
                        hashMap.put("channel_id", String.valueOf(linkInRoomVideoAnchorWidget3.f13996j.getId()));
                        hashMap.put("connection_type", "audience");
                        LinkCrossRoomDataHolder.m11103a().f12632w = System.currentTimeMillis();
                        C8049c.m15979a().mo14202a("connection_success", hashMap, gVar);
                    }
                    return;
                case 5:
                    LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget4 = LinkInRoomVideoAnchorWidget.this;
                    if (linkInRoomVideoAnchorWidget4.isViewValid()) {
                        linkInRoomVideoAnchorWidget4.f13988b.mo11422g_();
                        linkInRoomVideoAnchorWidget4.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(false, null));
                    }
                    linkInRoomVideoAnchorWidget4.mo11070c();
                    C5274ah.m11925a(0, 0, null, "anchor", C31483a.f82385b, C5511eg.m12351h().toString(), linkInRoomVideoAnchorWidget4.f13988b.mo11424j());
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("room_id", String.valueOf(linkInRoomVideoAnchorWidget4.f13996j.getId()));
                    hashMap2.put("anchor_id", String.valueOf(linkInRoomVideoAnchorWidget4.f13996j.getOwnerUserId()));
                    hashMap2.put("right_user_id", String.valueOf(linkInRoomVideoAnchorWidget4.f13994h));
                    hashMap2.put("channel_id", String.valueOf(linkInRoomVideoAnchorWidget4.f13996j.getId()));
                    hashMap2.put("connection_type", "audience");
                    hashMap2.put("connection_time", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12632w) / 1000));
                    C8049c.m15979a().mo14202a("connection_over", hashMap2, new Object[0]);
                    return;
                case 6:
                    LinkInRoomVideoAnchorWidget linkInRoomVideoAnchorWidget5 = LinkInRoomVideoAnchorWidget.this;
                    String str = objArr[0];
                    long id2 = linkInRoomVideoAnchorWidget5.f13988b.f14552k.getId();
                    String j2 = linkInRoomVideoAnchorWidget5.f13988b.mo11424j();
                    String vendor = C5511eg.m12351h().toString();
                    StringBuilder sb = new StringBuilder("onWarn:");
                    sb.append(str);
                    C5274ah.m11928a(id2, j2, vendor, 402, sb.toString());
                    return;
                case 7:
                    String.valueOf(objArr[0]);
                    return;
                case 8:
                    LinkInRoomVideoAnchorWidget.this.mo11072d(String.valueOf(objArr[0]));
                    return;
                case 11:
                    LinkInRoomVideoAnchorWidget.this.mo11065a(String.valueOf(objArr[0]), objArr[1]);
                    break;
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
        return R.layout.aqc;
    }

    /* renamed from: d */
    public final void mo11071d() {
        this.f13987a.start();
    }

    /* renamed from: a */
    public final void mo11063a() {
        if (isViewValid()) {
            C4575an.m10981a((int) R.string.ejq);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo11070c() {
        if (this.f13991e != null) {
            this.f13991e.mo11119b();
            this.f13991e = null;
        }
    }

    /* renamed from: e */
    public final void mo11073e() {
        if (this.f13987a != null) {
            this.f13987a.stop();
            this.f13987a.dispose();
            return;
        }
        this.f13988b.mo11422g_();
    }

    public void onPause() {
        if (this.f13988b.f14550i) {
            this.f13987a.switchAudio(false);
            this.f13989c.mo11525d();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.f13988b.f14550i) {
            this.f13987a.switchAudio(true);
            this.f13989c.mo11526e();
        }
    }

    public void onDestroy() {
        this.f13988b.mo8247a();
        this.f13997k.mo11545c();
        this.f13989c.mo11523b(this.f14000n);
        this.f13989c.mo11522b();
        if (this.f13987a != null) {
            this.f13987a.stop();
            this.f13987a.dispose();
        }
        mo11070c();
        if (this.f13990d != null && this.f13990d.isShowing()) {
            this.f13990d.mo11984f();
            this.f13990d.dismiss();
        }
        if (this.f13992f != null && !this.f13992f.isDisposed()) {
            this.f13992f.dispose();
        }
        super.onDestroy();
    }

    public void onCreate() {
        VideoQuality videoQuality;
        super.onCreate();
        this.f13999m = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayerLog();
        this.f13996j = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observe("cmd_force_close_linkin", this);
        this.f13988b = new C5511eg(this.f13996j, this.dataCenter);
        this.f13989c = new C5630a(this.f13996j, this.dataCenter);
        this.f13989c.mo11515a(this.f14000n);
        this.f13989c.mo11514a();
        if (this.f13996j.getStreamUrl().f23784l != null) {
            this.f13996j.getStreamUrl();
        }
        if (this.f13988b.mo11421g()) {
            videoQuality = VideoQuality.ANCHOR_HIGH;
        } else {
            videoQuality = VideoQuality.ANCHOR_NORMAL;
        }
        C5373b bVar = new C5373b(videoQuality, this);
        InteractConfig mixStreamRtmpUrl = new InteractConfig().setStreamMixer(bVar).setBackgroundColor("#161823").setMixStreamRtmpUrl(this.f13988b.mo11423i());
        C5286a.m11965a(mixStreamRtmpUrl);
        mixStreamRtmpUrl.setContext(this.context).setUserId(TTLiveSDKContext.getHostService().mo10315h().mo14529b()).setInteractId(C4638d.m11114a().f12665h).useInteractVersionV2(C4638d.m11114a().f12668k).setVideoQuality(videoQuality).setVendor(C5511eg.m12351h()).setLogReportInterval(5).setProjectKey(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).setInteractMode(InteractMode.NORMAL).setChannelName(this.f13988b.mo11424j()).setCharacter(Character.ANCHOR).setFrameFormat(FrameFormat.TEXTURE_2D).setSeiVersion(1).enableMixStream().setType(Type.VIDEO).setForceGlobalAPIServer(true);
        bVar.mo11286a(mixStreamRtmpUrl);
        this.f13987a = (Anchor) this.f13998l.mo9036a(mixStreamRtmpUrl, Boolean.valueOf(false));
        this.f13987a.setListener(this.f14001o);
        C5657g gVar = new C5657g(this.f13988b.f14552k, true, null, (FrameLayout) this.containerView, this.f13989c);
        this.f13997k = gVar;
        this.f13997k.f14828m = this.dataCenter;
        this.f13997k.mo11541a(false);
        this.f13988b.mo8520a((C5513b) this);
        C4575an.m10982a((int) R.string.gy5, 1);
    }

    /* renamed from: c */
    public final long mo11069c(String str) {
        return this.f13989c.mo11520b(str);
    }

    /* renamed from: b */
    public final int mo11068b(String str) {
        C5696e a = this.f13989c.mo11513a(0, str);
        if (a == null) {
            return 1;
        }
        return a.f14956g;
    }

    /* renamed from: a */
    public final boolean mo11067a(String str) {
        Boolean bool = (Boolean) this.f13989c.f14762j.get(str);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public LinkInRoomVideoAnchorWidget(C5281ao aoVar) {
        this.f13998l = aoVar;
    }

    /* renamed from: a */
    public final void mo11064a(long j) {
        if (((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
            this.f13993g.put(Long.valueOf(j), ((C4002ac) C2201v.m6592a((long) ((Integer) LiveConfigSettingKeys.LIVE_INTERACT_TIME_OUT.mo9431a()).intValue(), TimeUnit.SECONDS).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C5664m<Object>(this, j)));
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -95319361 && key.equals("cmd_force_close_linkin")) {
                c = 0;
            }
            if (c == 0 && this.f13988b != null) {
                this.f13988b.mo11420e();
            }
        }
    }

    /* renamed from: a */
    public final void mo11066a(List<C5696e> list) {
        if (isViewValid() && this.f13990d == null) {
            Room room = this.f13988b.f14552k;
            this.f13990d = new C5988bj(this.context, room, list, this.f13988b);
            this.f13990d.setOnDismissListener(new C5663l(this));
            this.f13990d.show();
            C4563ad.m10956a(room, "show_connection_management", "anchor_connection", false);
        }
    }

    /* renamed from: d */
    public final void mo11072d(String str) {
        C5696e b = this.f13989c.mo11521b(0, str);
        if (!(b == null || b.f14953d == null || this.f13988b == null || !((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue())) {
            this.f13988b.mo11416b(b.f14953d.getId(), b.f14953d.getSecUid());
        }
        this.f13989c.mo11517a(str);
        this.f13997k.mo11125b(0, str);
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f13996j.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f13996j.getOwnerUserId()));
        hashMap.put("right_user_id", String.valueOf(this.f13994h));
        hashMap.put("connection_type", "audience");
        hashMap.put("channel_id", String.valueOf(this.f13996j.getId()));
        hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12632w) / 1000));
        C8049c.m15979a().mo14202a("connection_over", hashMap, LinkCrossRoomDataHolder.m11103a().mo10411b());
    }

    /* renamed from: a */
    public final void mo11065a(String str, SurfaceView surfaceView) {
        long j;
        this.f13997k.mo11540a(str, surfaceView);
        this.f13994h = this.f13989c.mo11520b(str);
        if (this.f13994h > 0) {
            C4640f fVar = C4638d.m11114a().f12667j;
            int a = C4637c.m11113a(fVar.f12683a, fVar.f12685c, this.f13994h);
            if (a < 0) {
                j = 0;
            } else {
                j = fVar.f12684b[a];
            }
            if (j > 0) {
                C5274ah.m11926a(System.currentTimeMillis() - j, 0, C5511eg.m12351h().toString());
            }
            C4640f fVar2 = C4638d.m11114a().f12667j;
            int a2 = C4637c.m11113a(fVar2.f12683a, fVar2.f12685c, this.f13994h);
            if (a2 >= 0) {
                int i = a2 + 1;
                System.arraycopy(fVar2.f12683a, i, fVar2.f12683a, a2, fVar2.f12685c - i);
                System.arraycopy(fVar2.f12684b, i, fVar2.f12684b, a2, fVar2.f12685c - i);
                fVar2.f12685c--;
            }
            if (this.f13989c != null && ((Boolean) LiveConfigSettingKeys.LINK_INTERACT_AUDIENCE_OPT_ENABLE.mo9431a()).booleanValue()) {
                C5696e a3 = this.f13989c.mo11513a(this.f13989c.mo11520b(str), str);
                if (!(a3 == null || a3.f14953d == null)) {
                    C1690c cVar = (C1690c) this.f13993g.remove(Long.valueOf(a3.f14953d.getId()));
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }
    }
}
