package com.bytedance.android.livesdk.cov19;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4826af;
import com.bytedance.android.livesdk.chatroom.api.LuckyBoxApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.cov19.C6724b.C6728c;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p280a.C4551a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.C8267l;
import com.bytedance.android.livesdk.user.C8348m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.net.URLEncoder;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;

public class DonationLuckyWidget extends LiveRecyclableWidget implements C6728c {

    /* renamed from: a */
    LottieAnimationView f18368a;

    /* renamed from: b */
    TextView f18369b;

    /* renamed from: c */
    boolean f18370c;

    /* renamed from: d */
    private C6724b f18371d;

    /* renamed from: e */
    private ImageView f18372e;

    /* renamed from: f */
    private Room f18373f;

    /* renamed from: g */
    private LottieAnimationView f18374g;

    /* renamed from: h */
    private Handler f18375h = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.android.livesdk.cov19.DonationLuckyWidget$a */
    enum C6721a {
        PANEL_SHOW,
        PANEL_CLICK
    }

    /* renamed from: com.bytedance.android.livesdk.cov19.DonationLuckyWidget$b */
    enum C6722b {
        NOT_ACTIVE,
        PENDING,
        READY,
        GOT,
        FINISHED
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    /* renamed from: c */
    public final void mo12835c() {
        m14105f();
    }

    public int getLayoutId() {
        return R.layout.by5;
    }

    /* renamed from: d */
    public final void mo12836d() {
        this.containerView.setVisibility(0);
        m14104a(C6721a.PANEL_SHOW);
    }

    /* renamed from: g */
    private void m14106g() {
        this.f18368a.setVisibility(0);
        this.f18368a.mo6654b();
        this.f18375h.postDelayed(new C6734h(this), 2000);
    }

    /* renamed from: a */
    public final void mo12833a() {
        this.f18371d.f18391e = C6722b.READY;
        m14105f();
        this.f18371d.mo12838a(((Integer) LiveSettingKeys.LIVE_LUCKY_BOX_TO_EXPIRE.mo9431a()).intValue() / 60, ((Integer) LiveSettingKeys.LIVE_LUCKY_BOX_TO_EXPIRE.mo9431a()).intValue() % 60, C6725a.EXPIRE);
    }

    public void onUnload() {
        C4826af.f13043a = null;
        this.f18375h.removeCallbacksAndMessages(null);
        this.f18371d.mo8247a();
        C6724b bVar = this.f18371d;
        if (bVar.f18394h != null) {
            C6726b bVar2 = bVar.f18394h;
            if (bVar2.f18399a != null) {
                bVar2.f18399a.cancel();
                bVar2.f18399a = null;
            }
        }
    }

    /* renamed from: f */
    private void m14105f() {
        if (getContext() != null && this.f18371d != null) {
            switch (this.f18371d.f18391e) {
                case NOT_ACTIVE:
                    this.f18368a.setVisibility(8);
                    this.f18374g.mo6661f();
                    this.f18374g.setVisibility(8);
                    this.f18372e.setVisibility(0);
                    this.f18372e.setImageDrawable(C0726c.m2091a(getContext(), 2131956370));
                    this.f18369b.setVisibility(4);
                    return;
                case PENDING:
                    this.f18374g.mo6661f();
                    this.f18374g.setVisibility(8);
                    this.f18372e.setVisibility(0);
                    this.f18372e.setImageDrawable(C0726c.m2091a(getContext(), 2131956370));
                    m14106g();
                    return;
                case READY:
                    this.f18368a.setVisibility(8);
                    this.f18372e.setVisibility(8);
                    this.f18374g.setVisibility(0);
                    this.f18369b.setVisibility(4);
                    this.f18374g.mo6654b();
                    return;
                case GOT:
                case FINISHED:
                    this.f18368a.setVisibility(8);
                    this.f18374g.mo6661f();
                    this.f18374g.setVisibility(8);
                    this.f18372e.setVisibility(0);
                    this.f18372e.setImageDrawable(C0726c.m2091a(getContext(), 2131956371));
                    this.f18369b.setVisibility(4);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo12837e() {
        int i;
        String str;
        if (!this.f18370c) {
            boolean z = true;
            this.f18370c = true;
            this.f18375h.postDelayed(new C6733g(this), 2000);
            m14104a(C6721a.PANEL_CLICK);
            if (getContext() != null && this.f18371d != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", Long.valueOf(this.f18373f.getOwner().getId()));
                C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
                String str2 = "";
                String str3 = "";
                if (a.mo14192a().containsKey("enter_from_merge")) {
                    str2 = (String) a.mo14192a().get("enter_from_merge");
                }
                if (a.mo14192a().containsKey("enter_method")) {
                    str3 = (String) a.mo14192a().get("enter_method");
                }
                if (!(str2 == null || str3 == null)) {
                    hashMap.put("enter_from_page", str2);
                    hashMap.put("enter_method", str3);
                }
                if (this.dataCenter != null) {
                    C8348m mVar = (C8348m) this.dataCenter.get("data_user_center");
                    if (mVar != null) {
                        hashMap.put("user_id", Long.valueOf(mVar.mo14529b()));
                    }
                }
                String str4 = "status";
                if (!(getContext() == null || this.f18371d == null)) {
                    switch (this.f18371d.f18391e) {
                        case NOT_ACTIVE:
                        case PENDING:
                        case READY:
                            break;
                        default:
                            i = 1;
                            break;
                    }
                }
                i = 0;
                hashMap.put(str4, Integer.valueOf(i));
                hashMap.put("box_id", Long.valueOf(this.f18371d.f18395i));
                String str5 = "is_end";
                C6724b bVar = this.f18371d;
                if (!bVar.f18393g || !((bVar.f18391e == C6722b.NOT_ACTIVE && bVar.mo12842e() == -1) || bVar.f18391e == C6722b.FINISHED)) {
                    z = false;
                }
                hashMap.put(str5, Boolean.valueOf(z));
                hashMap.put("remain_time", Integer.valueOf(this.f18371d.mo12842e()));
                hashMap.put("room_id", Long.valueOf(this.f18373f.getId()));
                hashMap.put("interval", LiveSettingKeys.LIVE_LUCKY_BOX_TO_SHOW.mo9431a());
                hashMap.put("time_stamp", Long.valueOf(C4551a.m10939a()));
                String a2 = C6723a.m14114a(hashMap);
                Context context = getContext();
                if (a2 != null) {
                    try {
                        str = URLEncoder.encode(a2);
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder("sslocal://webcast_webview/?disable_background=true&close_button=true&type=popup&gravity=center&width=280&height=303&radius=8&url=");
                        sb.append(str);
                        new C8267l().handle(context, Uri.parse(sb.toString()));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12834a(String str) {
        this.f18369b.setText(str);
    }

    public DonationLuckyWidget(Room room) {
        this.f18373f = room;
    }

    public void onInit(Object[] objArr) {
        this.f18371d = new C6724b();
        this.f18371d.f18388b = this;
        this.f18372e = (ImageView) this.containerView.findViewById(R.id.mn);
        this.f18369b = (TextView) this.containerView.findViewById(R.id.e3t);
        this.f18369b.getBackground().setAlpha(178);
        this.f18372e.setOnClickListener(new C6731e(this));
        this.f18374g = (LottieAnimationView) this.containerView.findViewById(R.id.e02);
        this.f18374g.setOnClickListener(new C6732f(this));
        this.f18368a = (LottieAnimationView) findViewById(R.id.f02);
    }

    public void onLoad(Object[] objArr) {
        C4826af.f13043a = this.f18371d;
        this.containerView.setVisibility(8);
        this.f18371d.f18391e = C6722b.NOT_ACTIVE;
        m14105f();
        if (this.dataCenter != null) {
            this.f18373f = (Room) this.dataCenter.get("data_room", new Room());
        }
        this.f18371d.mo8520a((C6728c) this);
        C6724b bVar = this.f18371d;
        long id = this.f18373f.getId();
        bVar.f18395i = 0;
        bVar.f18393g = false;
        bVar.f18392f = false;
        bVar.f18389c = id;
        bVar.f18390d.clear();
        C6724b bVar2 = this.f18371d;
        ((C4002ac) ((LuckyBoxApi) C4514j.m10883j().mo10321b().mo9550a(LuckyBoxApi.class)).fetchCurrentListV2(bVar2.f18389c).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) bVar2.mo11752q())).mo9406a(new C6729c(bVar2), new C6730d(bVar2));
        this.f18370c = false;
    }

    /* renamed from: a */
    private void m14104a(C6721a aVar) {
        HashMap hashMap = new HashMap();
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        String str = "";
        String str2 = "";
        hashMap.put("anchor_id", String.valueOf(this.f18373f.getOwner().getId()));
        hashMap.put("room_id", String.valueOf(this.f18373f.getId()));
        if (a.mo14192a().containsKey("enter_from_merge")) {
            str = (String) a.mo14192a().get("enter_from_merge");
        }
        if (a.mo14192a().containsKey("enter_method")) {
            str2 = (String) a.mo14192a().get("enter_method");
        }
        if (!(str == null || str2 == null)) {
            hashMap.put("enter_from_page", str);
            hashMap.put("enter_method", str2);
        }
        if (this.dataCenter != null) {
            C8348m mVar = (C8348m) this.dataCenter.get("data_user_center");
            if (mVar != null) {
                hashMap.put("user_id", String.valueOf(mVar.mo14529b()));
            }
        }
        String str3 = "";
        String str4 = "";
        switch (aVar) {
            case PANEL_SHOW:
                str4 = "show";
                str3 = "livesdk_red_envelope_icon_show";
                break;
            case PANEL_CLICK:
                str4 = "click";
                str3 = "livesdk_red_envelope_icon_click";
                break;
        }
        C8049c.m15979a().mo14202a(str3, hashMap, new C8059j().mo14218f(str4).mo14214b(CustomActionPushReceiver.f104061f).mo14213a("donation_lucky_box"));
    }
}
