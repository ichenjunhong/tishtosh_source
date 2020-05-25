package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4000aa;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.chatroom.event.C5178ax;
import com.bytedance.android.livesdk.chatroom.model.C5743c;
import com.bytedance.android.livesdk.chatroom.presenter.C5774a;
import com.bytedance.android.livesdk.chatroom.presenter.C5774a.C5775a;
import com.bytedance.android.livesdk.message.model.C7816au;
import com.bytedance.android.livesdk.message.model.C7848bq;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p388k.C7709b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.common.util.C18922i;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C1681ae;
import p064c.p065a.C2151i;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

public class BottomRightBannerWidget extends LiveRecyclableWidget implements C0199s<KVData>, C5775a {

    /* renamed from: a */
    C4703e f16801a;

    /* renamed from: b */
    Room f16802b;

    /* renamed from: c */
    boolean f16803c;

    /* renamed from: d */
    C4697b f16804d;

    /* renamed from: e */
    C5743c f16805e;

    /* renamed from: f */
    public boolean f16806f;

    /* renamed from: g */
    public C6462ax f16807g;

    /* renamed from: h */
    public boolean f16808h;

    /* renamed from: i */
    private C5774a f16809i;

    /* renamed from: j */
    private C1689b f16810j = new C1689b();

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.by3;
    }

    public void onClear() {
        super.onClear();
        this.f16804d.mo10494a(this.f16801a);
        this.f16801a = null;
    }

    public void onUnload() {
        this.f16809i.mo8247a();
        this.dataCenter.removeObserver(this);
        if (this.f16810j != null) {
            this.f16810j.mo6180a();
        }
        this.f16806f = false;
        this.f16807g = null;
    }

    public void onPause() {
        super.onPause();
        if (this.f16804d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", false);
                jSONObject.put("type", "app");
                jSONObject.put("args", jSONObject2);
                this.f16804d.mo10496a(this.f16801a, "H5_appStateChange", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f16804d != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("foreground", true);
                jSONObject.put("type", "app");
                jSONObject.put("args", jSONObject2);
                this.f16804d.mo10496a(this.f16801a, "H5_appStateChange", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo11666a(C7816au auVar) {
        if (isViewValid() && auVar != null && this.f16801a != null) {
            ((C4005af) C1680ad.m5961a(auVar.f21521a).mo6148a(C2168a.m6521b()).mo6157b(C6588l.f17927a).mo6157b((C1711f<? super T, ? extends R>) new C6589m<Object,Object>(this)).mo6148a(C1667a.m5940a()).mo6153a((C1681ae<T, ? extends R>) autoDispose())).mo9409a(new C6590n(this));
        }
    }

    public void onInit(Object... objArr) {
        this.f16804d = C4514j.m10883j().mo10322c();
        try {
            this.f16801a = this.f16804d.mo10489a((Activity) this.context, (C4702d) new C6583g(this));
        } catch (Throwable th) {
            C3831a.m9714b("BottomRightBannerWidget", th);
        }
        if (this.f16801a != null) {
            if (VERSION.SDK_INT <= 19) {
                this.f16801a.f12813a.setLayerType(1, null);
            }
            this.f16801a.f12813a.setBackgroundColor(0);
            this.f16801a.f12813a.setLayoutParams(new LayoutParams(-1, -1));
            ((ViewGroup) this.contentView).addView(this.f16801a.f12813a);
        }
    }

    /* renamed from: a */
    public final void mo11667a(C7848bq bqVar) {
        if (!this.f16806f) {
            C9432q.m18691b((View) this.containerView, 0);
            if (this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new C5178ax(0, true));
            }
            if (this.f16801a != null) {
                this.f16801a.f12813a.setVisibility(4);
                this.containerView.setVisibility(4);
                if (this.f16807g != null) {
                    this.f16807g.mo12578h();
                }
            }
            this.f16806f = true;
        }
        Uri parse = Uri.parse(bqVar.f21684b);
        if (this.f16804d != null && this.f16801a != null && parse != null) {
            this.f16804d.mo10495a(this.f16801a, parse.buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f16802b.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f16802b.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b())).toString());
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode != -1357019912) {
                    if (hashCode == 1060055221 && key.equals("data_keyboard_status")) {
                        c = 1;
                    }
                } else if (key.equals("data_pre_show_keyboard")) {
                    c = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c = 2;
            }
            switch (c) {
                case 0:
                case 1:
                    boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                    if (!(this.f16801a == null || this.f16801a.f12813a == null)) {
                        if (booleanValue) {
                            this.f16801a.f12813a.setFocusable(false);
                            return;
                        } else {
                            this.f16801a.f12813a.setFocusable(true);
                            return;
                        }
                    }
                case 2:
                    if (kVData.getData() != null) {
                        if (((Integer) kVData.getData()).intValue() == 0) {
                            this.contentView.setVisibility(0);
                            break;
                        } else {
                            this.contentView.setVisibility(8);
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo11665a(C5743c cVar) {
        String str;
        if (!isViewValid() || cVar == null || cVar.f15097a == null || C9414h.m18630a(cVar.f15097a.f15102b)) {
            this.f16806f = false;
            if (this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new C5178ax(0, false));
            }
            C9432q.m18691b((View) this.containerView, 8);
            return;
        }
        this.f16806f = true;
        C9432q.m18691b((View) this.containerView, 0);
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_right_bottom_banner_show", new C5178ax(0, true));
        }
        if (this.f16801a != null) {
            this.f16801a.f12813a.setVisibility(4);
            this.containerView.setVisibility(4);
        }
        this.f16805e = cVar;
        C5774a aVar = this.f16809i;
        String str2 = cVar.f15097a.f15101a;
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = "";
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        if (a instanceof C8042k) {
            C8042k kVar = (C8042k) a;
            if (kVar.mo14192a().containsKey("enter_from")) {
                str3 = (String) kVar.mo14192a().get("enter_from");
            }
            if (kVar.mo14192a().containsKey("source")) {
                str4 = (String) kVar.mo14192a().get("source");
            }
        }
        C8038g a2 = C8049c.m15979a().mo14201a(Room.class);
        if (a2 instanceof C8045n) {
            C8045n nVar = (C8045n) a2;
            if (nVar.mo14192a().containsKey("anchor_id")) {
                str5 = (String) nVar.mo14192a().get("anchor_id");
            }
            if (nVar.mo14192a().containsKey("log_pb")) {
                str6 = (String) nVar.mo14192a().get("log_pb");
            }
            if (nVar.mo14192a().containsKey("request_id")) {
                str7 = (String) nVar.mo14192a().get("request_id");
            }
        }
        C18922i iVar = new C18922i(str2);
        iVar.mo38777a("room_id", aVar.f15222b.getId());
        iVar.mo38778a("mode", "live_room");
        iVar.mo38777a("anchor_id", aVar.f15222b.getOwner().getId());
        iVar.mo38778a("is_anchor", String.valueOf(aVar.f15221a));
        iVar.mo38778a("enter_from", str3);
        iVar.mo38778a("source_v3", str4);
        iVar.mo38778a("anchor_id", str5);
        iVar.mo38778a("log_pb", str6);
        iVar.mo38778a("request_id", str7);
        String str8 = "event_page";
        if (aVar.f15221a) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        iVar.mo38778a(str8, str);
        iVar.mo38778a("event_belong", "live_interact");
        this.f16804d.mo10495a(this.f16801a, Uri.parse(iVar.mo38774a()).buildUpon().appendQueryParameter("request_page", "bottomright").appendQueryParameter("room_id", String.valueOf(this.f16802b.getId())).appendQueryParameter("anchor_id", String.valueOf(this.f16802b.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b())).toString());
        if (this.f16807g != null) {
            this.f16807g.mo12578h();
        }
    }

    public void onLoad(Object... objArr) {
        ViewGroup.LayoutParams layoutParams = this.contentView.getLayoutParams();
        if (this.f16808h) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = C3922z.m9913d(R.dimen.sc);
            layoutParams.height = C3922z.m9913d(R.dimen.sb);
        }
        this.contentView.setLayoutParams(layoutParams);
        if (this.f16801a != null) {
            this.f16801a.f12813a.setVisibility(4);
        }
        this.containerView.setVisibility(4);
        if (this.dataCenter.get("data_is_anchor") != null) {
            this.f16803c = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        }
        if (this.dataCenter.get("data_room") != null) {
            this.f16802b = (Room) this.dataCenter.get("data_room");
            if (this.f16810j != null) {
                this.f16810j.mo6180a();
            }
            this.f16809i = new C5774a(this.f16802b, this.f16803c);
            this.f16809i.mo8520a((C5775a) this);
            InRoomBannerManager inRoomBannerManager = (InRoomBannerManager) this.dataCenter.get("data_in_room_banner_manager", null);
            if (inRoomBannerManager != null) {
                ((C4002ac) inRoomBannerManager.mo10435a(Long.valueOf(this.f16802b.getId())).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9406a(new C6584h(this), new C6585i(this));
            }
            this.dataCenter.observe("data_pre_show_keyboard", this).observe("data_xt_landscape_tab_change", this).observe("data_keyboard_status", this);
            this.f16810j.mo6181a(C4495a.m10823a().mo10300a(C7709b.class).mo6545f((C1710e<? super T>) new C6591o<Object>(this)));
            ((C4000aa) TTLiveSDKContext.getHostService().mo10315h().mo14533d().mo6455d().mo6447a(C6586j.f17925a).mo6448a((C2151i<T, ? extends R>) C4021e.m10136a((C0184k) this))).mo9402a(new C6587k(this));
        }
    }
}
