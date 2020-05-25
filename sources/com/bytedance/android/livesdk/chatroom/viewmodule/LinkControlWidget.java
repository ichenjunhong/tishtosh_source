package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.interact.C5249a;
import com.bytedance.android.livesdk.chatroom.interact.C5249a.C5251a;
import com.bytedance.android.livesdk.chatroom.interact.C5629j;
import com.bytedance.android.livesdk.chatroom.interact.C5646k;
import com.bytedance.android.livesdk.chatroom.interact.C5669r;
import com.bytedance.android.livesdk.chatroom.interact.C5681s;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomPkWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5362a;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5369h.C5370a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5379a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5423bh;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5423bh.C5424a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.message.model.C8002n;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4550a;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4610t;
import com.bytedance.android.livesdk.p329e.C6751a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p421v.C8368a;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LinkControlWidget extends LiveWidget implements C0199s<KVData>, C5424a, C6751a {

    /* renamed from: a */
    public LinkInRoomVideoAnchorWidget f17088a;

    /* renamed from: b */
    public LinkInRoomVideoGuestWidget f17089b;

    /* renamed from: c */
    public LinkCrossRoomWidget f17090c;

    /* renamed from: d */
    public LinkInRoomAudioWidget f17091d;

    /* renamed from: e */
    public C5423bh f17092e;

    /* renamed from: f */
    public Room f17093f;

    /* renamed from: g */
    public C8710m f17094g;

    /* renamed from: h */
    public boolean f17095h;

    /* renamed from: i */
    public int f17096i;

    /* renamed from: j */
    public C5249a f17097j;

    /* renamed from: k */
    public LinkAutoMatchModel f17098k;

    /* renamed from: l */
    public C1690c f17099l;

    /* renamed from: m */
    public C6302c f17100m = new C6302c();

    /* renamed from: n */
    public boolean f17101n;

    /* renamed from: o */
    public long f17102o;

    /* renamed from: p */
    private TextView f17103p;

    /* renamed from: q */
    private LinkInRoomPkWidget f17104q;

    /* renamed from: r */
    private C6300a f17105r;

    /* renamed from: s */
    private C6301b f17106s = new C6301b();

    /* renamed from: t */
    private Dialog f17107t;

    /* renamed from: u */
    private long f17108u;

    /* renamed from: v */
    private C8002n f17109v;

    /* renamed from: w */
    private C5370a f17110w = new C5370a() {
        /* renamed from: a */
        public final boolean mo11242a(C2949a aVar) {
            return false;
        }

        /* renamed from: c */
        public final boolean mo11246c() {
            LinkControlWidget.this.f17098k = null;
            LinkControlWidget.this.f17100m.mo12419a();
            return false;
        }

        /* renamed from: a */
        public final boolean mo11241a() {
            C6302c cVar = LinkControlWidget.this.f17100m;
            cVar.f17120c.setVisibility(0);
            cVar.f17120c.startAnimation(cVar.f17121d);
            return false;
        }

        /* renamed from: b */
        public final boolean mo11244b() {
            if (LinkControlWidget.this.f17097j != null && LinkControlWidget.this.f17097j.f18412j) {
                LinkControlWidget.this.f17100m.mo12419a();
            } else if (((Boolean) C4525b.f12350aS.mo10345a()).booleanValue()) {
                LinkControlWidget.this.f17099l = ((C4002ac) C2201v.m6592a(3, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) LinkControlWidget.this.autoDispose())).mo9406a(new C1710e<Long>() {
                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        Long l = (Long) obj;
                        C5362a.m12170a().mo11280a(LinkControlWidget.this.f17093f.getId());
                    }
                }, new C1710e<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        LinkControlWidget.this.mo8500a((Throwable) obj);
                    }
                });
            } else {
                LinkControlWidget linkControlWidget = LinkControlWidget.this;
                C5251a a = C5249a.m11898a(LinkControlWidget.this.dataCenter, LinkControlWidget.this);
                a.f14043f = LinkControlWidget.this.f17098k;
                linkControlWidget.f17097j = a.mo11101a(3);
                LinkControlWidget.this.f17097j.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                LinkControlWidget.this.f17100m.mo12419a();
            }
            LinkControlWidget.this.f17098k = null;
            return false;
        }

        /* renamed from: a */
        public final boolean mo11243a(LinkAutoMatchModel linkAutoMatchModel) {
            LinkControlWidget.this.f17098k = linkAutoMatchModel;
            return false;
        }

        /* renamed from: b */
        public final boolean mo11245b(LinkAutoMatchModel linkAutoMatchModel) {
            LinkControlWidget.this.f17098k = null;
            LinkControlWidget.this.f17100m.mo12419a();
            if (LinkControlWidget.this.f17097j != null && LinkControlWidget.this.f17097j.f18412j) {
                return false;
            }
            LinkControlWidget.this.f17097j = C5249a.m11898a(LinkControlWidget.this.dataCenter, LinkControlWidget.this).mo11102a(linkAutoMatchModel);
            LinkControlWidget.this.f17097j.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
            return false;
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$a */
    public interface C6300a {
        /* renamed from: a */
        Widget mo12180a(int i);

        /* renamed from: a */
        void mo12181a(Widget widget);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$b */
    class C6301b implements C6601a {

        /* renamed from: a */
        public boolean f17114a;

        /* renamed from: b */
        public boolean f17115b;

        /* renamed from: d */
        private View f17117d;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6301b() {
        }

        /* renamed from: b */
        public final void mo12417b(int i) {
            if (this.f17117d != null) {
                this.f17117d.setBackgroundResource(i);
            }
        }

        /* renamed from: a */
        public final void mo12416a(int i) {
            if (this.f17117d != null) {
                if (i == 0) {
                    if (C4610t.m11070a(LinkControlWidget.this.context, C4550a.LINK_MIC)) {
                        if (LinkControlWidget.this.f17095h) {
                            C5629j.m12529a();
                        } else {
                            C5629j.m12530a("connection_button");
                        }
                    } else {
                        return;
                    }
                }
                this.f17117d.setVisibility(i);
            }
        }

        public final void onClick(View view) {
            String str;
            if (LinkControlWidget.this.f17095h) {
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", "click");
                C8049c.m15979a().mo14202a("guest_connection_anchor", hashMap, Room.class);
            } else {
                C5629j.m12531b("connection_button");
            }
            C4632d dVar = (C4632d) LinkCrossRoomDataHolder.m11103a().get("data_pk_state");
            if (VERSION.SDK_INT < 17) {
                C4575an.m10981a((int) R.string.emb);
            } else if (!C8607a.f23572a && LinkControlWidget.this.f17094g == C8710m.VIDEO && !((Boolean) C6718b.f18315L.mo9431a()).booleanValue()) {
                C4575an.m10987a(LinkControlWidget.this.context.getString(R.string.ekd));
            } else if (LinkControlWidget.this.f17093f != null && LinkControlWidget.this.f17093f.getMosaicStatus() == 1) {
                C4575an.m10981a((int) R.string.eol);
            } else if (LinkControlWidget.this.f17096i == 1) {
                if (LinkControlWidget.this.f17095h) {
                    LinkControlWidget.this.f17088a.f13988b.mo11415b();
                } else {
                    LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = LinkControlWidget.this.f17089b;
                    if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                        TTLiveSDKContext.getHostService().mo10315h().mo14516a(linkInRoomVideoGuestWidget.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ek_)).mo14543c("interact").mo14539a(0).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) linkInRoomVideoGuestWidget.getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                    } else if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.INTERACT)) {
                        if (linkInRoomVideoGuestWidget.f14006c.mo11524c() > 0 || ((Integer) C4639e.m11122a().f12651b).intValue() != 0) {
                            linkInRoomVideoGuestWidget.f14005b.mo11436b();
                        } else {
                            linkInRoomVideoGuestWidget.f14005b.mo11437d();
                        }
                    }
                }
                C4563ad.m10956a(LinkControlWidget.this.f17093f, "click_connection_button", "anchor_connection", true);
            } else if (LinkControlWidget.this.f17096i == 4) {
                C4575an.m10981a((int) R.string.ejf);
            } else {
                if (LinkControlWidget.this.f17096i == 2) {
                    if (dVar != C4632d.DISABLED) {
                        C4575an.m10981a((int) R.string.eje);
                    } else if (LinkControlWidget.this.f17090c != null) {
                        LinkControlWidget.this.f17090c.mo12423h();
                    }
                } else if (LinkControlWidget.this.f17094g == C8710m.AUDIO) {
                    if (LinkControlWidget.this.f17096i == 0) {
                        LinkControlWidget linkControlWidget = LinkControlWidget.this;
                        HashMap hashMap2 = new HashMap();
                        String str2 = "room_type";
                        if (linkControlWidget.f17093f.getStreamType() == C8710m.AUDIO) {
                            str = "radio";
                        } else {
                            str = "video";
                        }
                        hashMap2.put(str2, str);
                        C8049c.m15979a().mo14202a("anchor_audience_connection_open", hashMap2, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"), Room.class);
                        new C8552a(linkControlWidget.context).mo14996a(false).mo15012d((int) R.string.ee7).mo15009c((CharSequence) linkControlWidget.context.getString(R.string.eq7)).mo15003b(0, (int) R.string.e59, (OnClickListener) new C6466ba(linkControlWidget)).mo15003b(1, (int) R.string.e45, C6467bb.f17768a).mo15011d();
                        return;
                    }
                    LinkInRoomAudioWidget linkInRoomAudioWidget = LinkControlWidget.this.f17091d;
                    if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                        TTLiveSDKContext.getHostService().mo10315h().mo14516a(linkInRoomAudioWidget.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ek_)).mo14543c("interact").mo14539a(0).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) linkInRoomAudioWidget.getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                    } else {
                        if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.INTERACT)) {
                            if (linkInRoomAudioWidget.f17158d.mo11524c() > 0 || ((Integer) C4639e.m11122a().f12651b).intValue() != 0) {
                                linkInRoomAudioWidget.f17156b.mo11381n();
                            } else {
                                linkInRoomAudioWidget.f17156b.mo11378k();
                            }
                        }
                    }
                } else if (LinkControlWidget.this.f17096i == 0 && C5362a.m12170a().mo11284c()) {
                    new C8552a(LinkControlWidget.this.context).mo15013d((CharSequence) LinkControlWidget.this.context.getString(R.string.ejk)).mo15003b(0, (int) R.string.exh, C6470be.f17771a).mo15003b(1, (int) R.string.e45, C6471bf.f17772a).mo15011d();
                } else if (LinkControlWidget.this.f17097j == null || !LinkControlWidget.this.f17097j.isVisible()) {
                    if (!this.f17115b || this.f17114a) {
                        LinkControlWidget.this.mo12414i();
                    } else {
                        LinkControlWidget.this.f17101n = false;
                        LinkControlWidget.this.f17092e.mo11325b(0);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("connection_type", "anchor");
                        C8049c.m15979a().mo14202a("connection_click", hashMap3, new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"), Room.class);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17117d = view;
            if (LinkControlWidget.this.f17094g != C8710m.VIDEO || !LinkControlWidget.this.f17095h) {
                this.f17115b = true;
                this.f17114a = true;
                return;
            }
            this.f17117d.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c */
    class C6302c implements C6601a {

        /* renamed from: a */
        C8368a f17118a;

        /* renamed from: b */
        View f17119b;

        /* renamed from: c */
        View f17120c;

        /* renamed from: d */
        Animation f17121d;

        /* renamed from: f */
        private final int f17123f;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: a */
        public final void mo12419a() {
            this.f17120c.setVisibility(8);
            this.f17120c.clearAnimation();
        }

        /* renamed from: b */
        public final void mo12421b() {
            if (this.f17118a != null && this.f17118a.mo14577e()) {
                this.f17118a.dismiss();
            }
        }

        private C6302c() {
            this.f17123f = 1;
        }

        /* renamed from: a */
        public final void mo12420a(int i) {
            if (this.f17119b != null) {
                this.f17119b.setBackgroundResource(i);
            }
        }

        public final void onClick(View view) {
            C4632d dVar = (C4632d) LinkCrossRoomDataHolder.m11103a().get("data_pk_state");
            HashMap hashMap = new HashMap();
            hashMap.put("current_mode", String.valueOf(LinkControlWidget.this.f17096i));
            if (dVar != null) {
                hashMap.put("pk_state", dVar.toString());
            }
            C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
            if (VERSION.SDK_INT < 17) {
                C4575an.m10981a((int) R.string.emb);
            } else if (!((Boolean) C6718b.f18315L.mo9431a()).booleanValue()) {
                C4575an.m10987a(LinkControlWidget.this.context.getString(R.string.ekd));
            } else if (LinkControlWidget.this.f17093f != null && LinkControlWidget.this.f17093f.getMosaicStatus() == 1) {
                C4575an.m10981a((int) R.string.eol);
            } else if (LinkControlWidget.this.f17096i == 0) {
                if (C5362a.m12170a().mo11284c() || (LinkControlWidget.this.f17099l != null && !LinkControlWidget.this.f17099l.isDisposed())) {
                    LinkControlWidget.this.f17097j = C5249a.m11898a(LinkControlWidget.this.dataCenter, LinkControlWidget.this).mo11102a(LinkControlWidget.this.f17098k);
                    LinkControlWidget.this.f17097j.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                } else {
                    LinkControlWidget.this.f17101n = true;
                    LinkControlWidget.this.f17092e.mo11325b(1);
                }
                C8049c.m15979a().mo14203a("pk_icon_click", LinkControlWidget.this.f17093f);
            } else {
                if (LinkControlWidget.this.f17096i != 2 || dVar == C4632d.DISABLED) {
                    int i = LinkControlWidget.this.f17096i;
                    C4575an.m10981a((int) R.string.ejf);
                } else if (LinkControlWidget.this.f17090c != null) {
                    LinkControlWidget.this.f17090c.mo12423h();
                }
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            mo12419a();
            mo12421b();
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17119b = view;
            this.f17120c = this.f17119b.findViewById(R.id.b34);
            this.f17121d = AnimationUtils.loadAnimation(LinkControlWidget.this.context, R.anim.cm);
            this.f17121d.setInterpolator(new LinearInterpolator());
            ((Boolean) C4525b.f12305A.mo10345a()).booleanValue();
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
        return R.layout.apw;
    }

    /* renamed from: e */
    public final void mo11338e() {
        m13567b(0);
    }

    /* renamed from: k */
    private void m13568k() {
        try {
            if (this.f17097j != null && this.f17097j.isVisible()) {
                this.f17097j.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo11329a() {
        C4638d.m11114a().mo10414a(Boolean.valueOf(true));
        if (this.f17093f.isLiveTypeAudio()) {
            m13567b(3);
        } else {
            m13567b(1);
        }
    }

    /* renamed from: c */
    public final void mo11335c() {
        C4638d.m11114a().mo10414a(Boolean.valueOf(false));
        m13567b(0);
        if (!this.f17095h) {
            this.f17106s.mo12416a(8);
        }
    }

    /* renamed from: d */
    public final void mo11337d() {
        if (this.f17097j != null && this.f17097j.isVisible()) {
            this.f17097j.dismiss();
        }
        m13567b(2);
    }

    /* renamed from: f */
    public final void mo11339f() {
        if (!isViewValid() || this.f17096i == 2) {
            return;
        }
        if (this.f17096i != 1 || !this.f17095h) {
            m13567b(0);
        }
    }

    /* renamed from: h */
    public final void mo11341h() {
        if (this.f17090c != null && this.f17095h) {
            LinkCrossRoomWidget linkCrossRoomWidget = this.f17090c;
            if (linkCrossRoomWidget.f17131d != null) {
                linkCrossRoomWidget.f17131d.mo11348d();
            }
        }
    }

    /* renamed from: l */
    private void m13569l() {
        if (isViewValid() && this.f17095h && LinkCrossRoomDataHolder.m11103a().f12627r == 1 && ((Boolean) C4525b.f12350aS.mo10345a()).booleanValue()) {
            this.f17097j = C5249a.m11898a(this.dataCenter, this).mo11102a((LinkAutoMatchModel) null);
            this.f17097j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        }
    }

    /* renamed from: g */
    public final void mo11340g() {
        if (isViewValid()) {
            m13568k();
            if (LinkCrossRoomDataHolder.m11103a().f12627r == 1) {
                C4575an.m10982a((int) R.string.edi, 1);
                m13569l();
                return;
            }
            C4575an.m10982a((int) R.string.ejg, 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo12415j() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "room_type";
        if (this.f17093f.getStreamType() == C8710m.AUDIO) {
            str = "radio";
        } else {
            str = "video";
        }
        hashMap.put(str2, str);
        C8049c.m15979a().mo14202a("anchor_audience_connection_open_success", hashMap, Room.class);
    }

    public void onDestroy() {
        this.dataCenter.removeObserver(this);
        if (LinkCrossRoomDataHolder.m11103a() != LinkCrossRoomDataHolder.f12605a) {
            LinkCrossRoomDataHolder.m11103a().removeObserver(this);
        }
        this.f17105r = null;
        this.f17092e.mo8247a();
        m13568k();
        C5362a.m12170a().mo11281a(this.f17110w);
        C5362a.m12170a().mo11283b();
        super.onDestroy();
    }

    /* renamed from: i */
    public final void mo12414i() {
        if (this.f17107t != null) {
            C6472bg.m13909a(this.f17107t);
        }
        if (this.f17097j != null) {
            this.f17097j.dismiss();
        }
        C4563ad.m10956a(this.f17093f, "click_connection_button", "anchor_connection", true);
        C8552a aVar = new C8552a(this.context);
        aVar.mo15012d((int) R.string.gy4);
        aVar.mo15008c((int) R.string.gy3);
        aVar.mo14996a(false).mo15003b(0, (int) R.string.gy2, (OnClickListener) new C6468bc(this)).mo15003b(1, (int) R.string.e45, C6469bd.f17770a);
        C8548h b = aVar.mo15001b();
        this.f17107t = b;
        b.show();
    }

    public void onCreate() {
        super.onCreate();
        this.f17093f = (Room) this.dataCenter.get("data_room");
        this.f17095h = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17094g = (C8710m) this.dataCenter.get("data_live_mode");
        C6600d a = C6610k.m13985a();
        a.mo12668a(C6605h.INTERACTION, (C6601a) this.f17106s);
        a.mo12668a(C6605h.PK, (C6601a) this.f17100m);
        this.f17103p = (TextView) this.contentView.findViewById(R.id.aud);
        if (!this.f17095h) {
            this.f17106s.mo12416a(8);
        }
        this.f17092e = new C5423bh(this.f17093f, this.f17095h, this.f17094g);
        this.f17092e.mo8520a((C5424a) this);
        C5362a a2 = C5362a.m12170a();
        C5370a aVar = this.f17110w;
        if (aVar != null) {
            a2.mo11282a(aVar, a2.f14297a.size());
        }
        this.dataCenter.observeForever("data_keyboard_status", this).observeForever("cmd_pk_state_change", this).observeForever("data_interact_debug_info", this).observeForever("cmd_inroompk_state_change", this).observe("cmd_audience_turn_on_link", this).observe("data_pk_chiji_stage", this);
        if (LinkCrossRoomDataHolder.m11103a() != LinkCrossRoomDataHolder.f12605a) {
            LinkCrossRoomDataHolder.m11103a().observe("data_pk_state", this);
        }
        C4610t.m11071b(this.context, C4550a.LINK_MIC);
        C4610t.m11071b(this.context, C4550a.QUIC);
    }

    /* renamed from: a */
    public final void mo11333a(boolean z) {
        C6301b bVar = this.f17106s;
        bVar.f17114a = z;
        if (z) {
            bVar.mo12416a(0);
        }
    }

    /* renamed from: b */
    public final void mo11334b(Throwable th) {
        C4602l.m11047a(this.context, th, (int) R.string.emk);
    }

    public LinkControlWidget(C6300a aVar) {
        this.f17105r = aVar;
    }

    /* renamed from: c */
    public final void mo11336c(Throwable th) {
        if (isViewValid()) {
            if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                int errorCode = aVar.getErrorCode();
                if (errorCode == 32001 || errorCode == 32002 || errorCode == 32003) {
                    mo11332a((C5379a) null, aVar);
                    return;
                }
            }
            C4602l.m11046a(this.context, th);
        }
    }

    /* renamed from: a */
    public final void mo11330a(int i) {
        if (isViewValid()) {
            m13568k();
            if (i != 1 || LinkCrossRoomDataHolder.m11103a().f12614e == 0) {
                LinkCrossRoomDataHolder.m11103a().f12611b = false;
                LinkCrossRoomDataHolder.m11103a().f12617h = 0;
                LinkCrossRoomDataHolder.m11103a().f12614e = 0;
                int i2 = R.string.edh;
                switch (i) {
                    case 2:
                        if (LinkCrossRoomDataHolder.m11103a().f12627r == 1) {
                            i2 = R.string.edi;
                            break;
                        }
                        break;
                    case 3:
                        i2 = R.string.edg;
                        break;
                    case 4:
                        i2 = R.string.edf;
                        break;
                    case 5:
                        break;
                    case 6:
                        i2 = R.string.ede;
                        break;
                    case 7:
                        i2 = R.string.edj;
                        break;
                    default:
                        i2 = R.string.edd;
                        break;
                }
                C4575an.m10982a(i2, 1);
                if (i == 2) {
                    m13569l();
                }
                LinkCrossRoomDataHolder.m11103a().mo10412c();
                return;
            }
            if (this.f17097j != null && this.f17097j.isVisible()) {
                this.f17097j.dismiss();
            }
            if (LinkCrossRoomDataHolder.m11103a().f12627r == 2) {
                this.f17092e.mo11324b();
            } else {
                m13567b(2);
            }
        }
    }

    /* renamed from: b */
    private void m13567b(int i) {
        String str;
        String str2;
        if (isViewValid() && i != this.f17096i) {
            if (this.f17096i == 1) {
                this.f17105r.mo12181a((Widget) this.f17088a);
                this.f17105r.mo12181a((Widget) this.f17089b);
                this.f17088a = null;
                this.f17089b = null;
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(4));
            } else if (this.f17096i == 2) {
                if (this.f17095h) {
                    HashMap hashMap = new HashMap();
                    C8056g gVar = new C8056g();
                    hashMap.put("event_page", "live_detail");
                    hashMap.put("room_id", String.valueOf(this.f17093f.getId()));
                    hashMap.put("anchor_id", String.valueOf(this.f17093f.getOwnerUserId()));
                    if (this.f17093f.getId() == LinkCrossRoomDataHolder.m11103a().f12612c) {
                        hashMap.put("inviter_id", String.valueOf(this.f17093f.getOwner().getId()));
                        hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12614e));
                    } else {
                        hashMap.put("inviter_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12614e));
                        hashMap.put("invitee_id", String.valueOf(this.f17093f.getOwner().getId()));
                    }
                    String str3 = "match_type";
                    if (LinkCrossRoomDataHolder.m11103a().f12627r == 1) {
                        str = "random";
                    } else {
                        str = "manual";
                    }
                    hashMap.put(str3, str);
                    if (LinkCrossRoomDataHolder.m11103a().f12619j > 0) {
                        hashMap.put("pk_time", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12619j));
                    }
                    String str4 = "is_oncemore";
                    if (LinkCrossRoomDataHolder.m11103a().f12631v) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    hashMap.put(str4, str2);
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12612c));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12613d));
                    if (LinkCrossRoomDataHolder.m11103a().f12619j > 0 && LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                        gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                    }
                    hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - this.f17108u) / 1000));
                }
                this.f17105r.mo12181a((Widget) this.f17090c);
                this.f17090c = null;
                m13569l();
                LinkCrossRoomDataHolder.m11103a().mo10412c();
            } else if (this.f17096i == 3) {
                this.f17105r.mo12181a((Widget) this.f17091d);
                this.f17091d = null;
            }
            this.f17096i = i;
            LinkCrossRoomDataHolder.m11103a().lambda$put$1$DataCenter("data_link_model", Integer.valueOf(this.f17096i));
            if (this.f17096i == 1) {
                if (this.f17095h) {
                    this.f17088a = (LinkInRoomVideoAnchorWidget) this.f17105r.mo12180a(0);
                } else {
                    this.f17089b = (LinkInRoomVideoGuestWidget) this.f17105r.mo12180a(1);
                }
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(5));
                this.f17106s.mo12416a(0);
                this.f17106s.mo12417b(R.drawable.c4m);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(1));
            } else if (this.f17096i == 2) {
                this.f17108u = SystemClock.elapsedRealtime();
                if (LinkCrossRoomDataHolder.m11103a().f12619j > 0) {
                    LinkCrossRoomDataHolder.m11103a().f12633x = this.f17108u;
                }
                this.f17090c = (LinkCrossRoomWidget) this.f17105r.mo12180a(2);
                if (this.f17095h) {
                    this.f17106s.mo12416a(0);
                    this.f17106s.mo12417b(R.drawable.bvp);
                } else {
                    this.f17106s.mo12416a(8);
                }
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(2));
            } else if (this.f17096i == 3) {
                this.f17091d = (LinkInRoomAudioWidget) this.f17105r.mo12180a(3);
                this.f17106s.mo12416a(8);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(3));
            } else if (this.f17095h) {
                this.f17106s.mo12416a(0);
                this.f17106s.mo12417b(R.drawable.c4m);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(0));
            } else {
                this.f17106s.mo12416a(8);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(0));
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int i = 0;
            switch (key.hashCode()) {
                case -1931352685:
                    if (key.equals("data_pk_chiji_stage")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1540323875:
                    if (key.equals("cmd_pk_state_change")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1087608658:
                    if (key.equals("data_interact_debug_info")) {
                        c = 2;
                        break;
                    }
                    break;
                case 204814877:
                    if (key.equals("cmd_inroompk_state_change")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1325017518:
                    if (key.equals("cmd_audience_turn_on_link")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (this.f17090c != null) {
                        LinkCrossRoomWidget linkCrossRoomWidget = this.f17090c;
                        boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                        View view = linkCrossRoomWidget.contentView;
                        if (booleanValue) {
                            i = 4;
                        }
                        view.setVisibility(i);
                        return;
                    }
                    return;
                case 1:
                    C5200s sVar = (C5200s) kVData.getData();
                    if (sVar.f13914a == 4) {
                        m13567b(2);
                        break;
                    } else {
                        if (sVar.f13914a == 5) {
                            C6302c cVar = this.f17100m;
                            if (((Boolean) C4525b.f12439m.mo10345a()).booleanValue() && LinkControlWidget.this.f17095h) {
                                C4525b.f12439m.mo10346a(Boolean.valueOf(false));
                                cVar.mo12421b();
                                cVar.f17118a = ((C8374c) ((C8374c) ((C8374c) C8374c.m16598b(LinkControlWidget.this.getContext()).mo14562a((int) R.layout.ar0)).mo14568b(C3922z.m9899a(160.0f))).mo14572c(true)).mo14561a();
                                cVar.f17118a.mo14566a(cVar.f17119b, 1, 0, C3922z.m9899a(1.0f), C3922z.m9899a(-4.0f));
                                break;
                            }
                        } else if (sVar.f13914a == 1) {
                            this.f17100m.mo12421b();
                        }
                        return;
                    }
                case 2:
                    C5201t tVar = (C5201t) kVData.getData();
                    if (TTLiveSDKContext.getHostService().mo10308a().getChannel().equals("local_test")) {
                        TextView textView = this.f17103p;
                        if (!tVar.f13917a) {
                            i = 8;
                        }
                        textView.setVisibility(i);
                        TextView textView2 = this.f17103p;
                        StringBuilder sb = new StringBuilder();
                        sb.append(tVar.f13918b);
                        sb.append("  channel_id:");
                        sb.append(LinkCrossRoomDataHolder.m11103a().f12612c);
                        textView2.setText(sb.toString());
                    }
                    return;
                case 3:
                    C4632d dVar = (C4632d) kVData.getData();
                    if (this.f17095h) {
                        this.f17106s.mo12416a(0);
                        C6302c cVar2 = this.f17100m;
                        if (cVar2.f17119b != null) {
                            cVar2.f17119b.setVisibility(0);
                        }
                        if (LinkCrossRoomDataHolder.m11103a().f12611b) {
                            if (dVar == C4632d.DISABLED) {
                                this.f17106s.mo12417b(R.drawable.bvp);
                                this.f17100m.mo12420a((int) R.drawable.c4p);
                                break;
                            } else {
                                this.f17106s.mo12417b(R.drawable.c4m);
                                this.f17100m.mo12420a((int) R.drawable.bvu);
                                break;
                            }
                        } else {
                            this.f17106s.mo12417b(R.drawable.c4m);
                            this.f17100m.mo12420a((int) R.drawable.c4p);
                        }
                    }
                    return;
                case 4:
                    mo12414i();
                    return;
                case 5:
                    if (kVData.getData() instanceof C5646k) {
                        switch (((C5646k) kVData.getData()).f14783a) {
                            case 0:
                                this.f17096i = 4;
                                return;
                            case 1:
                                if (this.f17095h) {
                                    this.f17092e.mo11324b();
                                    return;
                                }
                                break;
                            case 2:
                                this.f17096i = 0;
                                return;
                            case 3:
                                if (((Integer) this.dataCenter.get("data_pk_chiji_stage", Integer.valueOf(0))).intValue() == 3 && this.f17102o > 0 && this.f17109v != null) {
                                    LinkCrossRoomDataHolder.m11103a().f12607B = this.f17109v.f21876b;
                                    if (this.f17109v.f21875a == 1) {
                                        this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(1));
                                        if (this.f17104q == null) {
                                            this.f17104q = (LinkInRoomPkWidget) this.f17105r.mo12180a(4);
                                            return;
                                        }
                                    } else if (this.f17109v.f21875a == 2) {
                                        this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(2));
                                        if (this.f17104q == null) {
                                            this.f17104q = (LinkInRoomPkWidget) this.f17105r.mo12180a(4);
                                            return;
                                        }
                                    }
                                } else if (!(this.f17104q == null || this.f17105r == null || this.f17096i != 0)) {
                                    this.f17105r.mo12181a((Widget) this.f17104q);
                                    this.f17104q = null;
                                    return;
                                }
                                break;
                            default:
                                return;
                        }
                    }
                    break;
                case 6:
                    if (((Integer) kVData.getData()).intValue() != 4) {
                        if (!(((Integer) kVData.getData()).intValue() != 5 || this.f17104q == null || this.f17105r == null)) {
                            this.f17105r.mo12181a((Widget) this.f17104q);
                            this.f17104q = null;
                            break;
                        }
                    } else if (this.f17102o > 0 && this.f17109v != null) {
                        LinkCrossRoomDataHolder.m11103a().f12607B = this.f17109v.f21876b;
                        if (this.f17109v.f21875a == 1) {
                            this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(1));
                            if (this.f17104q == null) {
                                this.f17104q = (LinkInRoomPkWidget) this.f17105r.mo12180a(4);
                                return;
                            }
                        } else if (this.f17109v.f21875a == 2) {
                            this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(2));
                            if (this.f17104q == null) {
                                this.f17104q = (LinkInRoomPkWidget) this.f17105r.mo12180a(4);
                                return;
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo11332a(C5379a aVar, C2949a aVar2) {
        boolean z;
        if (isViewValid()) {
            if (this.f17097j == null || !this.f17097j.isVisible()) {
                boolean z2 = false;
                if (VERSION.SDK_INT < 21) {
                    C4575an.m10981a((int) R.string.emb);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!this.f17106s.f17115b || this.f17106s.f17114a) {
                        if (((Boolean) C4525b.f12351aT.mo10345a()).booleanValue()) {
                            LinkCrossRoomDataHolder.m11103a().f12627r = 1;
                            this.f17097j = C5249a.m11898a(this.dataCenter, this).mo11101a(5);
                            this.f17097j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                        }
                    } else if (!this.f17101n) {
                        C5251a a = C5249a.m11898a(this.dataCenter, this);
                        if (this.f17106s.f17115b && !this.f17106s.f17114a) {
                            z2 = true;
                        }
                        a.f14042e = z2;
                        this.f17097j = a.mo11101a(6);
                        this.f17097j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    }
                    this.f17097j = C5249a.m11898a(this.dataCenter, this).mo11103a(aVar, aVar2);
                    this.f17097j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12259a(Runnable runnable, boolean z) {
        if (!this.f17095h && this.f17089b != null) {
            LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = this.f17089b;
            if (2 != ((Integer) C4639e.m11122a().f12651b).intValue()) {
                return false;
            }
            new C8552a(linkInRoomVideoGuestWidget.getContext()).mo15008c((int) R.string.elk).mo15003b(0, (int) R.string.exh, (OnClickListener) new C5669r(linkInRoomVideoGuestWidget, runnable)).mo15003b(1, (int) R.string.e45, C5681s.f14903a).mo15011d();
            return true;
        } else if (this.f17095h || this.f17091d == null) {
            return false;
        } else {
            LinkInRoomAudioWidget linkInRoomAudioWidget = this.f17091d;
            if (((Integer) C4639e.m11122a().f12651b).intValue() == 0) {
                return false;
            }
            new C8552a(linkInRoomAudioWidget.getContext()).mo15008c((int) R.string.elk).mo15003b(0, (int) R.string.exh, (OnClickListener) new C6488bw(linkInRoomAudioWidget, runnable)).mo15003b(1, (int) R.string.e45, C6489bx.f17790a).mo15011d();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo11331a(long j, C4177d<Room> dVar, String str, int i, C5382c cVar) {
        if (isViewValid() && j != 0) {
            m13568k();
            String str2 = LinkCrossRoomDataHolder.m11103a().f12620k;
            C5362a.m12170a().mo11283b();
            C5251a a = C5249a.m11898a(this.dataCenter, this);
            Room room = (Room) dVar.data;
            C5249a a2 = a.mo11101a(1);
            a.f14039b = room;
            if (room != null) {
                a.f14038a = room.getOwner();
            }
            a.f14041d = str2;
            a.f14040c = j;
            a.f14044g = str;
            a.f14045h = i;
            a.f14046i = cVar;
            this.f17097j = a2;
            this.f17097j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        }
    }
}
