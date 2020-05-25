package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p232b.C3882b;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4629a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.event.C5201t;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.C5278al;
import com.bytedance.android.livesdk.chatroom.interact.C5279am;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5453cj;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5453cj.C5455a;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d;
import com.bytedance.android.livesdk.chatroom.p307c.C5044e;
import com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5974c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.video.rtc.interact.controller.SEIHelper;
import com.p683ss.video.rtc.interact.controller.SEIHelper.Callback;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.SEI;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LinkCrossRoomWidget extends LiveWidget implements C0199s<KVData>, C5455a, Callback {

    /* renamed from: a */
    public static int f17124a;

    /* renamed from: i */
    private static int f17125i;

    /* renamed from: j */
    private static int f17126j;

    /* renamed from: A */
    private SEI f17127A;

    /* renamed from: B */
    private C1690c f17128B;

    /* renamed from: b */
    public boolean f17129b;

    /* renamed from: c */
    Room f17130c;

    /* renamed from: d */
    C5453cj f17131d;

    /* renamed from: e */
    LinkCrossRoomDataHolder f17132e;

    /* renamed from: f */
    public SEIHelper f17133f;

    /* renamed from: g */
    public C5974c f17134g;

    /* renamed from: h */
    public boolean f17135h;

    /* renamed from: k */
    private int f17136k;

    /* renamed from: l */
    private C5281ao f17137l;

    /* renamed from: m */
    private ViewGroup f17138m;

    /* renamed from: n */
    private ImageView f17139n;

    /* renamed from: o */
    private TextView f17140o;

    /* renamed from: p */
    private FrameLayout f17141p;

    /* renamed from: q */
    private View f17142q;

    /* renamed from: r */
    private Guideline f17143r;

    /* renamed from: s */
    private TextView f17144s;

    /* renamed from: t */
    private TextView f17145t;

    /* renamed from: u */
    private C5044e f17146u;

    /* renamed from: v */
    private C5038d<TextView> f17147v;

    /* renamed from: w */
    private C5038d<VHeadView> f17148w;

    /* renamed from: x */
    private C5038d<HSImageView> f17149x;

    /* renamed from: y */
    private C8548h f17150y;

    /* renamed from: z */
    private LinkPKWidget f17151z;

    static abstract class SubWidget extends LiveWidget {

        /* renamed from: a */
        LinkCrossRoomDataHolder f17152a;

        /* renamed from: b */
        Room f17153b;

        /* renamed from: c */
        boolean f17154c;

        public void onCreate() {
            super.onCreate();
            this.f17152a = LinkCrossRoomDataHolder.m11103a();
            this.f17153b = (Room) this.dataCenter.get("data_room");
            this.f17154c = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        }

        SubWidget(View view, ViewGroup viewGroup) {
            this.contentView = view;
            this.containerView = viewGroup;
        }
    }

    /* renamed from: j */
    public static int m13613j() {
        return f17125i;
    }

    /* renamed from: k */
    public static int m13614k() {
        return f17126j;
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
        return R.layout.aq5;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo12423h() {
        m13615l();
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
    }

    /* renamed from: e */
    public final void mo11361e() {
        C4575an.m10981a((int) R.string.hqp);
    }

    /* renamed from: f */
    public final void mo11362f() {
        C4575an.m10981a((int) R.string.ed9);
    }

    /* renamed from: g */
    public final void mo11363g() {
        m13607a(0);
    }

    /* renamed from: c */
    public final void mo11359c() {
        C4575an.m10982a((int) R.string.ed8, 1);
        this.f17131d.mo11348d();
    }

    /* renamed from: d */
    public final void mo11360d() {
        C4575an.m10981a((int) R.string.emn);
        this.f17131d.mo11348d();
    }

    public void onPause() {
        super.onPause();
        if (this.f17129b) {
            this.f17131d.mo11346a(false);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f17129b) {
            this.f17131d.mo11346a(true);
        }
    }

    /* renamed from: a */
    public final void mo11355a() {
        if (this.f17151z == null) {
            enableSubWidgetManager();
            this.f17151z = new LinkPKWidget(this.contentView, this.containerView);
            this.subWidgetManager.load(this.f17151z);
        }
    }

    /* renamed from: l */
    private void m13615l() {
        boolean z;
        if (C4629a.TURN_ON_ENGINE_SUCCEED.compareTo((C4629a) this.f17132e.get("data_link_state", C4629a.DISABLED)) <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C4575an.m10981a((int) R.string.ed7);
        } else if (this.f17151z != null) {
            this.f17151z.mo12440f();
        } else {
            if (this.f17150y == null) {
                this.f17150y = new C8552a(this.context).mo15013d((CharSequence) C3922z.m9903a((int) R.string.ejh)).mo15003b(0, (int) R.string.exh, (OnClickListener) new C6476bk(this)).mo15003b(1, (int) R.string.e45, C6477bl.f17777a).mo15012d((int) R.string.ejh).mo15001b();
                this.f17150y.f23444b.setVisibility(8);
            }
            if (!this.f17150y.isShowing()) {
                this.f17150y.show();
            }
        }
    }

    /* renamed from: m */
    private void m13616m() {
        boolean z;
        if (!C3882b.m9818b() || C3882b.m9816a() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f17136k = C3922z.m9910c();
        if (z) {
            this.f17136k = (int) (((float) C3922z.m9908b()) * 0.5625f);
        }
        LayoutParams layoutParams = (LayoutParams) this.contentView.getLayoutParams();
        if (z) {
            layoutParams.width = this.f17136k;
            layoutParams.gravity = 17;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        this.contentView.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo12424i() {
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.f17132e.f12614e);
        userProfileEvent.interactLogLabel = "right_anchor";
        this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", userProfileEvent);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(this.f17130c.getOwnerUserId()));
        if (this.f17132e.f12619j == 0) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "pk");
        }
        C8049c.m15979a().mo14202a("right_anchor_click", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_detail").mo14217e("live_detail"), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
    }

    public void onDestroy() {
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_link_cross_load", Boolean.valueOf(false));
        }
        C8056g gVar = new C8056g();
        if (this.f17132e.f12619j > 0 && this.f17132e.f12627r == 0) {
            gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
        }
        if (this.f17129b) {
            C8049c.m15979a().mo14203a("connection_over", gVar.mo14208a(String.valueOf((System.currentTimeMillis() - this.f17132e.f12632w) / 1000)), new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), this.f17132e.mo10411b());
            if (this.f17132e.get("data_pk_state") == C4632d.PK) {
                if (LinkCrossRoomDataHolder.m11103a().f12619j > 0 && LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                    gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                }
                C8049c.m15979a().mo14203a("livesdk_pk_end", new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), gVar.mo14212c("disconnect").mo14208a(String.valueOf((System.currentTimeMillis() - this.f17132e.f12633x) / 1000)), this.f17132e.mo10411b(), Room.class);
            } else if (this.f17132e.get("data_pk_state") == C4632d.PENAL) {
                C8049c.m15979a().mo14203a("punish_end", gVar.mo14212c("disconnect").mo14208a(String.valueOf((System.currentTimeMillis() - this.f17132e.f12635z) / 1000)), this.f17132e.mo10411b(), Room.class);
            }
        }
        try {
            this.f17131d.mo8247a();
            this.f17146u.mo10906a();
            this.f17132e.removeObserver(this);
            if (!this.f17129b) {
                C5279am.m11944b();
            }
            this.f17132e.mo10412c();
        } catch (Throwable unused) {
            C3831a.m9716d("DATA_CENTER", "should crash at onDestroy()");
        }
        this.f17141p.removeAllViews();
        this.f17141p.setBackgroundColor(0);
        this.f17141p.setVisibility(8);
        super.onDestroy();
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        this.f17130c = (Room) this.dataCenter.get("data_room");
        this.f17129b = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17132e = LinkCrossRoomDataHolder.m11103a();
        this.f17132e.f12611b = true;
        if (this.f17132e.lifecycleOwner == null) {
            C3831a.m9716d("DATA_CENTER", "LifecycleOwner == null! ");
            return;
        }
        if (this.f17132e != LinkCrossRoomDataHolder.f12605a) {
            this.f17132e.observeForever("data_link_state", this).observeForever("cmd_log_link", this);
        }
        this.f17136k = C3922z.m9910c();
        if (!C3882b.m9818b() || C3882b.m9816a() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f17136k = (int) (((float) C3922z.m9908b()) * 0.5625f);
        }
        double d = (double) ((((float) this.f17136k) * 1.0f) / 360.0f);
        Double.isNaN(d);
        f17125i = (int) (d * 108.0d);
        int i = this.f17136k / 2;
        f17124a = i;
        f17126j = (int) (((((float) i) * 1.0f) / 9.0f) * 13.0f);
        m13616m();
        this.f17141p.setVisibility(0);
        this.f17145t = (TextView) this.contentView.findViewById(R.id.da0);
        this.f17142q = this.contentView.findViewById(R.id.zr);
        this.f17143r = (Guideline) this.contentView.findViewById(R.id.am0);
        this.f17138m = (ViewGroup) this.contentView.findViewById(R.id.b_d);
        this.f17139n = (ImageView) this.contentView.findViewById(R.id.b33);
        this.f17140o = (TextView) this.contentView.findViewById(R.id.dh7);
        this.f17146u = new C5044e(this.f17132e, this.contentView);
        if (!(this.f17132e.lifecycleOwner == null || this.f17132e.lifecycleOwner.getLifecycle() == null)) {
            this.f17147v = this.f17146u.mo10905a(R.id.dco).mo10900a(new C6474bi(this)).mo10901a("data_guest_user", new C6480bo(this)).mo10902a();
            this.f17148w = this.f17146u.mo10905a(R.id.ao0).mo10900a(new C6481bp(this)).mo10901a("data_guest_user", new C6482bq(this)).mo10902a();
            this.f17149x = this.f17146u.mo10905a(R.id.b3q).mo10900a(new C6483br(this)).mo10901a("data_guest_user", new C6484bs(this)).mo10902a();
        }
        if (this.f17129b) {
            m13608a(f17125i, f17126j);
        } else {
            this.f17133f = new SEIHelper(this);
            this.f17145t.setVisibility(8);
            this.f17128B = ((C4002ac) C2201v.m6614b(Integer.valueOf(1)).mo6539d((long) ((Integer) LiveConfigSettingKeys.LIVE_PK_SEI_OVER_TIME.mo9431a()).intValue(), TimeUnit.SECONDS).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6473bh<Object>(this));
        }
        this.f17131d = new C5453cj(this.dataCenter, this.f17137l);
        this.f17131d.mo8520a((C5455a) this);
        if (this.f17129b) {
            this.f17131d.mo11347b();
        }
        if (!this.f17129b && this.f17132e.f12619j <= 0) {
            C5279am.m11943a();
        }
        if (this.f17129b || this.f17132e.f12619j <= 0) {
            this.f17138m.setVisibility(0);
            this.f17139n.setVisibility(8);
            this.f17140o.setVisibility(8);
        } else {
            mo11355a();
        }
        this.f17132e.f12632w = System.currentTimeMillis();
        this.dataCenter.lambda$put$1$DataCenter("data_link_cross_load", Boolean.valueOf(true));
        m13612b("LinkCrossRoomWidget loaded");
    }

    /* renamed from: a */
    public final void mo11357a(String str) {
        m13612b(str);
    }

    /* renamed from: a */
    private void m13609a(Enum enumR) {
        m13612b(enumR.name());
    }

    /* renamed from: b */
    private void m13612b(String str) {
        m13610a(str, "");
    }

    public boolean isVersionSupported(int i) {
        if (this.f17129b || i != 2) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m13616m();
        if (this.f17127A != null) {
            onSeiUpdated(this.f17127A);
        }
        m13611b(f17125i, f17126j);
    }

    /* renamed from: a */
    private void m13607a(int i) {
        this.f17141p.removeView(this.f17144s);
        if (i == 0) {
            ((HSImageView) this.f17149x.f13491b).setVisibility(8);
            this.f17145t.setVisibility(8);
            return;
        }
        this.f17144s = new TextView(this.context);
        LayoutParams layoutParams = new LayoutParams(f17124a, f17126j);
        layoutParams.topMargin = f17125i;
        layoutParams.leftMargin = f17124a;
        this.f17144s.setLayoutParams(layoutParams);
        this.f17144s.setGravity(17);
        if (i == R.string.eda) {
            this.f17144s.setTextColor(-1);
        } else {
            this.f17144s.setTextColor(-16777216);
        }
        this.f17144s.setTextSize(16.0f);
        this.f17144s.setText(i);
        this.f17141p.addView(this.f17144s);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -612633460:
                    if (key.equals("data_pk_result")) {
                        c = 3;
                        break;
                    }
                    break;
                case 436641052:
                    if (key.equals("data_pk_steal_tower_state")) {
                        c = 2;
                        break;
                    }
                    break;
                case 872172481:
                    if (key.equals("data_link_state")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1227596154:
                    if (key.equals("cmd_log_link")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C4629a aVar = (C4629a) kVData.getData();
                    m13609a((Enum) aVar);
                    if (C4629a.CONNECTION_SUCCEED.equals(aVar) && this.f17132e.f12619j > 0) {
                        mo11355a();
                        return;
                    }
                case 1:
                case 2:
                case 3:
                    m13609a((Enum) kVData.getData());
                    return;
                case 4:
                    m13612b((String) kVData.getData());
                    break;
            }
        }
    }

    public void onSeiUpdated(SEI sei) {
        Object obj;
        if (!this.f17129b && isViewValid() && sei.getGridList() != null && !sei.getGridList().isEmpty()) {
            boolean z = false;
            Region region = (Region) sei.getGridList().get(0);
            if (region != null) {
                this.f17127A = sei;
                this.f17135h = true;
                if (this.f17132e.f12614e <= 0) {
                    Iterator it = sei.getGridList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Region) it.next()).getUserId() != TTLiveSDKContext.getHostService().mo10315h().mo14529b()) {
                                this.f17132e.f12614e = region.getUserId();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f17131d.mo11347b();
                float width = (((float) this.f17136k) * 1.0f) / ((float) sei.getWidth());
                double height = (double) sei.getHeight();
                double y = region.getY();
                Double.isNaN(height);
                double d = height * y;
                double d2 = (double) width;
                Double.isNaN(d2);
                f17125i = (int) (d * d2);
                double height2 = region.getHeight();
                double height3 = (double) sei.getHeight();
                Double.isNaN(height3);
                double d3 = height2 * height3;
                Double.isNaN(d2);
                f17126j = (int) (d3 * d2);
                this.dataCenter.lambda$put$1$DataCenter("cmd_adjust_video_interact_stream_bottom", Integer.valueOf(f17125i + f17126j));
                if (this.f17151z == null) {
                    this.f17132e.f12608C = sei;
                }
                m13608a(f17125i, f17126j);
                if (region.getStatus() == 0) {
                    m13607a(0);
                } else if (region.getStatus() == 1) {
                    m13607a((int) R.string.gyc);
                }
                if (this.f17128B != null && !this.f17128B.isDisposed()) {
                    this.f17128B.dispose();
                    LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.f17132e;
                    String idStr = this.f17130c.getIdStr();
                    HashMap hashMap = new HashMap();
                    hashMap.put("channel_id", String.valueOf(linkCrossRoomDataHolder.f12612c));
                    hashMap.put("match_type", Integer.valueOf(linkCrossRoomDataHolder.f12627r));
                    hashMap.put("room_id", String.valueOf(idStr));
                    hashMap.put("guest_id", Long.valueOf(linkCrossRoomDataHolder.f12614e));
                    String str = "vendor";
                    if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue() == 0) {
                        obj = Integer.valueOf(linkCrossRoomDataHolder.f12622m);
                    } else {
                        obj = LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a();
                    }
                    hashMap.put(str, obj);
                    hashMap.put("startTimeMs", Long.valueOf(linkCrossRoomDataHolder.f12621l));
                    if (sei != null) {
                        hashMap.put("sei", C2942b.m8369a().mo34889b(sei));
                    }
                    C3837e.m9743a(C5278al.f14123a, 0, (Map<String, Object>) hashMap);
                }
                StringBuilder sb = new StringBuilder("SEI Updated, LinkPkWidget:");
                if (this.f17151z == null) {
                    z = true;
                }
                sb.append(String.valueOf(z));
                mo11357a(sb.toString());
                StringBuilder sb2 = new StringBuilder(",marginTop:");
                sb2.append(f17125i);
                sb2.append(",height:");
                sb2.append(f17126j);
                sb2.append(",region.getHeight()=");
                sb2.append(region.getHeight());
                sb2.append(",region.getWidth()=");
                sb2.append(region.getWidth());
                sb2.append(",region.getY()=");
                sb2.append(region.getY());
                m13610a("SEI Debug Stream Height", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo11358a(boolean z) {
        int i;
        String str;
        if (z) {
            i = 0;
        } else {
            i = R.string.gyc;
        }
        m13607a(i);
        StringBuilder sb = new StringBuilder("Guest entered");
        if (z) {
            str = "foreground";
        } else {
            str = "background";
        }
        sb.append(str);
        mo11357a(sb.toString());
    }

    public LinkCrossRoomWidget(C5281ao aoVar, FrameLayout frameLayout) {
        this.f17137l = aoVar;
        this.f17141p = frameLayout;
    }

    /* renamed from: a */
    public final void mo11356a(long j, long j2) {
        if (this.f17134g != null) {
            this.f17134g.mo11962a(j, j2);
        }
    }

    /* renamed from: b */
    private void m13611b(int i, int i2) {
        boolean z = false;
        C5200s sVar = new C5200s(0);
        sVar.f13915b = Integer.valueOf(i + i2 + C3922z.m9899a(64.0f));
        if (this.f17132e.f12619j > 0) {
            z = true;
        }
        sVar.f13916c = z;
        this.dataCenter.lambda$put$1$DataCenter("cmd_pk_state_change", sVar);
        C3974b.m10061a().mo9383b(C3983a.LivePk.name(), getLifecycle(), getContext(), 10000);
        C3974b.m10061a().mo9376a(C3983a.LivePk.name(), getLifecycle(), getContext(), 10000);
    }

    /* renamed from: a */
    private void m13610a(String str, String str2) {
        String str3;
        new StringBuilder();
        if (!this.f17129b) {
            str3 = "audience";
        } else if (this.f17132e.f12618i) {
            str3 = "inviter";
        } else {
            str3 = "invitee";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        hashMap.put("role", str3);
        hashMap.put("channel_id", Long.valueOf(this.f17132e.f12612c));
        hashMap.put("room_id", Long.valueOf(this.f17130c.getId()));
        hashMap.put("guest_uid", Long.valueOf(this.f17132e.f12614e));
        hashMap.put("start_time", Long.valueOf(this.f17132e.f12621l));
        hashMap.put("duration", Integer.valueOf(this.f17132e.f12619j));
        hashMap.put("pk_id", Long.valueOf(this.f17132e.f12613d));
        hashMap.put("link_mic_id", Integer.valueOf(this.f17132e.f12624o));
        hashMap.put("guest_link_mic_id", Integer.valueOf(this.f17132e.f12617h));
        hashMap.put("vendor", this.f17131d.mo11353i().name());
        hashMap.put("extra", str2);
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    private void m13608a(int i, int i2) {
        String str;
        m13611b(i, i2);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f17142q.getLayoutParams();
        layoutParams.height = i2;
        this.f17142q.setLayoutParams(layoutParams);
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(i);
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new C5201t(true, sb.toString()));
        this.f17143r.setGuidelineBegin(i);
        if (!this.f17129b) {
            ((VHeadView) this.f17148w.f13491b).setVisibility(0);
            ((TextView) this.f17147v.f13491b).setVisibility(0);
        }
        if (this.f17151z != null) {
            this.f17151z.mo12439e();
        }
        if (this.f17142q.getVisibility() != 0) {
            this.f17142q.setVisibility(0);
            if (this.f17130c.getLinkMicInfo() == null) {
                C8056g gVar = new C8056g();
                if (this.f17129b) {
                    if (this.f17130c.getId() == this.f17132e.f12612c) {
                        gVar.mo14209b(this.f17130c.getOwner().getId()).mo14211c(this.f17132e.f12614e);
                    } else {
                        gVar.mo14209b(this.f17132e.f12614e).mo14211c(this.f17130c.getOwner().getId());
                    }
                    HashMap hashMap = new HashMap();
                    if (this.f17132e.f12619j > 0 && this.f17132e.f12627r == 0) {
                        gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                    }
                    if (this.f17132e.f12627r == 1 || this.f17132e.f12627r == 2) {
                        String str2 = "is_rematch";
                        if (this.f17132e.f12634y) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        hashMap.put(str2, str);
                    }
                    LinkCrossRoomDataHolder.m11103a().f12632w = SystemClock.elapsedRealtime();
                    C8049c.m15979a().mo14202a("connection_success", hashMap, new C8059j().mo14213a("live_detail").mo14218f("other").mo14214b(CustomActionPushReceiver.f104061f), gVar.mo14207a(Boolean.valueOf(this.f17132e.f12634y)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                    return;
                }
                C8049c.m15979a().mo14203a("connection_transform", new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other").mo14213a("live_detail"), gVar, LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                if (this.f17132e.f12619j > 0) {
                    if (this.f17132e.f12627r == 0) {
                        gVar.mo14206a(this.f17132e.f12616g);
                    }
                    C8049c.m15979a().mo14203a("pk_transform", new C8059j().mo14214b("live_function").mo14213a("live_detail"), gVar, LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                }
            }
        }
    }
}
