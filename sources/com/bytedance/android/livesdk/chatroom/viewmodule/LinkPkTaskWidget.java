package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4784g;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4784g.C4785a;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4784g.C4786b;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.chatroom.event.C5178ax;
import com.bytedance.android.livesdk.chatroom.interact.C5279am;
import com.bytedance.android.livesdk.chatroom.interact.C5646k;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5592gx;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5592gx.C5593a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkPkTaskWidget extends LiveWidget implements C0199s<KVData>, C4786b, C5593a {

    /* renamed from: a */
    public boolean f17244a = false;

    /* renamed from: b */
    public C4697b f17245b;

    /* renamed from: c */
    public C4703e f17246c;

    /* renamed from: d */
    public boolean f17247d;

    /* renamed from: e */
    public LinkCrossRoomDataHolder f17248e;

    /* renamed from: f */
    public C6462ax f17249f;

    /* renamed from: g */
    private ViewGroup f17250g;

    /* renamed from: h */
    private C5592gx f17251h;

    /* renamed from: i */
    private long f17252i;

    /* renamed from: j */
    private Room f17253j;

    /* renamed from: k */
    private C6312a f17254k;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget$a */
    final class C6312a implements C0199s<KVData>, C4702d {
        /* renamed from: a */
        public final void mo12443a() {
            LinkPkTaskWidget.this.f17248e.removeObserver(this);
        }

        private C6312a() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            KVData kVData = (KVData) obj;
            if (kVData != null && kVData.getData() != null) {
                List<String> list = (List) kVData.getData();
                for (String str : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("data", str);
                        jSONObject.put("type", "json");
                    } catch (JSONException e) {
                        LinkPkTaskWidget.this.mo8500a((Throwable) e);
                    }
                    LinkPkTaskWidget.this.f17245b.mo10496a(LinkPkTaskWidget.this.f17246c, "H5_commonMessage", jSONObject);
                }
                list.clear();
            }
        }

        /* renamed from: a */
        public final void mo8983a(WebView webView, String str) {
            if (LinkPkTaskWidget.this.f17244a) {
                LinkPkTaskWidget.this.f17248e.observeForever("data_banner_pending_data", this, true);
            } else {
                LinkPkTaskWidget.this.f17248e.observeForever("data_inroom_banner_pending_data", this, true);
                LinkPkTaskWidget.this.f17246c.f12813a.setVisibility(0);
            }
            if (LinkPkTaskWidget.this.f17249f != null) {
                LinkPkTaskWidget.this.f17249f.mo12577g();
            }
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
        return R.layout.by6;
    }

    /* renamed from: c */
    public final void mo12442c() {
        if (this.f17249f != null) {
            this.f17249f.mo12579i();
        }
    }

    /* renamed from: e */
    private int m13688e() {
        String str = this.f17248e.f12607B;
        if (str != null) {
            try {
                return Integer.parseInt(Uri.parse(str).getQueryParameter("banner_height"));
            } catch (Exception unused) {
                C3831a.m9712b("webview height translate", "translate wrong");
            }
        }
        return 105;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f17245b.mo10494a(this.f17246c);
        if (this.f17251h != null) {
            this.f17251h.mo8247a();
        }
        if (this.f17254k != null) {
            this.f17254k.mo12443a();
        }
        if (this.f17248e != null) {
            this.f17248e.removeObserver(this);
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    /* renamed from: d */
    private void m13687d() {
        if (!this.f17247d) {
            this.f17247d = true;
            if (this.f17254k != null) {
                this.f17254k.mo12443a();
            }
            this.f17254k = new C6312a();
            this.f17246c = this.f17245b.mo10489a((Activity) this.context, (C4702d) this.f17254k);
            if (VERSION.SDK_INT <= 19) {
                this.f17246c.f12813a.setLayerType(1, null);
            }
            this.f17246c.f12813a.setBackgroundColor(0);
            this.f17246c.f12813a.setLayoutParams(new LayoutParams(-1, -1));
            if (!this.f17244a) {
                LayoutParams layoutParams = this.f17250g.getLayoutParams();
                layoutParams.height = C3922z.m9899a((float) m13688e());
                this.f17250g.setLayoutParams(layoutParams);
            }
            this.f17250g.addView(this.f17246c.f12813a);
            this.f17246c.f12813a.setVisibility(4);
            if (this.f17249f != null) {
                this.f17249f.mo12578h();
            }
            if (!this.f17244a) {
                this.f17246c.f12814b.mo10483a().mo19579a("sendInRoomPkStatus", (C10782e<?, ?>) new C4784g<Object,Object>(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo11487a() {
        String str;
        if (this.dataCenter != null) {
            if (this.f17244a) {
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(5));
            }
            m13687d();
            if (this.f17244a) {
                str = (String) LiveConfigSettingKeys.PKTASK_BANNER_URL.mo9431a();
                if (TextUtils.isEmpty(str)) {
                    str = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/pk_task/banner/index.html";
                }
            } else {
                str = this.f17248e.f12607B;
            }
            if (!TextUtils.isEmpty(str) && str != null) {
                this.f17245b.mo10495a(this.f17246c, Uri.parse(str).buildUpon().appendQueryParameter("channel_id", String.valueOf(this.f17248e.f12612c)).appendQueryParameter("battle_id", String.valueOf(this.f17248e.f12613d)).appendQueryParameter("anchor_id", String.valueOf(this.f17253j.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(this.f17252i)).toString());
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f17248e = LinkCrossRoomDataHolder.m11103a();
        this.f17253j = (Room) this.dataCenter.get("data_room", null);
        this.f17252i = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        this.f17250g = (ViewGroup) this.contentView;
        this.f17245b = C4514j.m10883j().mo10322c();
        this.dataCenter.observe("data_pre_show_keyboard", this).observe("data_keyboard_status", this);
        if (!this.f17244a) {
            this.dataCenter.observe("data_right_bottom_banner_show", this, true).observe("data_pk_chiji_stage", this);
            if (this.dataCenter.get("data_right_bottom_banner_show") instanceof C5178ax) {
                m13686a((C5178ax) this.dataCenter.get("data_right_bottom_banner_show"));
            }
        } else {
            this.f17251h = new C5592gx();
            this.f17251h.mo8520a((C5593a) this);
            this.f17248e.observeForever("data_pk_state", this);
        }
        mo11487a();
    }

    public LinkPkTaskWidget(boolean z) {
    }

    /* renamed from: a */
    private void m13686a(C5178ax axVar) {
        if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo9431a()).intValue() != 1 && axVar.f13872b == 0) {
            if (axVar.f13871a) {
                C9432q.m18680a((View) this.containerView, -3, -3, -3, (int) C9432q.m18687b(getContext(), 132.0f));
                return;
            }
            C9432q.m18680a((View) this.containerView, -3, -3, -3, (int) C9432q.m18687b(getContext(), 86.0f));
        }
    }

    /* renamed from: a */
    public final void mo11488a(int i) {
        if (i == 0) {
            this.f17246c.f12813a.setVisibility(4);
            if (this.f17249f != null) {
                this.f17249f.mo12578h();
            }
        } else {
            this.f17246c.f12813a.setVisibility(0);
            if (this.f17249f != null) {
                this.f17249f.mo12577g();
            }
        }
    }

    /* renamed from: a */
    public final void mo10600a(C4785a aVar) {
        if (aVar != null && aVar.f13005a != 0 && this.dataCenter != null) {
            if (!((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue()) {
                C5279am.m11944b();
            } else if (LinkCrossRoomDataHolder.m11103a().f12627r == 2) {
                C8049c.m15979a().mo14203a("connection_over", new C8056g().mo14208a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12633x) / 1000)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            }
            if (aVar.f13005a == 1) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(2));
                this.f17248e.mo10412c();
                return;
            }
            if (aVar.f13005a == 2) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(3));
                this.f17248e.mo10412c();
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null && this.dataCenter != null) {
            String key = kVData.getKey();
            char c = 65535;
            int i = 0;
            switch (key.hashCode()) {
                case -1931352685:
                    if (key.equals("data_pk_chiji_stage")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1357019912:
                    if (key.equals("data_pre_show_keyboard")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1446063636:
                    if (key.equals("data_right_bottom_banner_show")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    boolean booleanValue = ((Boolean) kVData.getData()).booleanValue();
                    if (!(this.f17246c == null || this.f17246c.f12813a == null)) {
                        if (booleanValue) {
                            this.f17246c.f12813a.setFocusable(false);
                        } else {
                            this.f17246c.f12813a.setFocusable(true);
                        }
                    }
                    if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo9431a()).intValue() == 1) {
                        ViewGroup viewGroup = this.f17250g;
                        if (booleanValue) {
                            i = 8;
                        }
                        viewGroup.setVisibility(i);
                        return;
                    }
                    break;
                case 2:
                    if (kVData.getData().equals(C4632d.PENAL) && this.dataCenter != null) {
                        this.f17250g.removeAllViews();
                        this.f17245b.mo10494a(this.f17246c);
                        this.f17247d = false;
                        if (!this.f17244a) {
                            this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(4));
                        }
                        if (this.f17249f != null) {
                            this.f17249f.mo12578h();
                        }
                    }
                    return;
                case 3:
                    if (kVData.getData() instanceof C5178ax) {
                        m13686a((C5178ax) kVData.getData());
                        return;
                    } else {
                        C9432q.m18680a((View) this.f17250g, -3, -3, -3, (int) C9432q.m18687b(getContext(), 86.0f));
                        return;
                    }
                case 4:
                    int intValue = ((Integer) kVData.getData()).intValue();
                    if (!(intValue == 5 || intValue == 4)) {
                        if (this.dataCenter.get("data_right_bottom_banner_show") instanceof C5178ax) {
                            m13686a((C5178ax) this.dataCenter.get("data_right_bottom_banner_show"));
                        } else {
                            C9432q.m18680a((View) this.f17250g, -3, -3, -3, (int) C9432q.m18687b(getContext(), 86.0f));
                        }
                        mo11487a();
                        break;
                    }
            }
        }
    }
}
