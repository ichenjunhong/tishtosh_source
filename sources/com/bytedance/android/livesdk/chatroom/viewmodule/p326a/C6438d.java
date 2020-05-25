package com.bytedance.android.livesdk.chatroom.viewmodule.p326a;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5177aw;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6433c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6602e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6611l;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.d */
public final class C6438d implements C0199s<KVData>, C6601a {

    /* renamed from: a */
    private Room f17725a;

    /* renamed from: b */
    private List<C6605h> f17726b = new ArrayList();

    /* renamed from: c */
    private C6602e f17727c;

    /* renamed from: d */
    private View f17728d;

    /* renamed from: e */
    private Context f17729e;

    /* renamed from: f */
    private View f17730f;

    /* renamed from: g */
    private DataCenter f17731g;

    /* renamed from: h */
    private C8710m f17732h;

    /* renamed from: b */
    private static boolean m13895b() {
        return C6611l.m13991a().mo12690b();
    }

    /* renamed from: a */
    private void m13894a() {
        if (this.f17730f == null || (!m13896c() && !m13895b())) {
            if (this.f17730f != null) {
                this.f17730f.setVisibility(8);
            }
            return;
        }
        this.f17730f.setVisibility(0);
    }

    /* renamed from: c */
    private boolean m13896c() {
        if ((this.f17732h == null || this.f17732h.equals(C8710m.VIDEO)) && ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).haveNewFilter()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo8420a(C6597a aVar) {
        if (aVar instanceof C6433c) {
            m13894a();
        }
    }

    public C6438d(Context context) {
        this.f17729e = context;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 982604344) {
                if (hashCode == 1631824572 && key.equals("cmd_video_orientation_changed")) {
                    c = 0;
                }
            } else if (key.equals("cmd_toolbar_click_filter")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (((C5177aw) kVData.getData()).f13869a) {
                        this.f17726b.add(C6605h.SWITCH_SCREEN_ORIENTATION);
                    }
                    if (this.f17725a.getStreamUrl().mo15384d().size() > 1) {
                        this.f17726b.add(C6605h.SWITCH_VIDEO_QUALITY);
                    }
                    if (!C9414h.m18630a(this.f17726b)) {
                        this.f17728d.setVisibility(0);
                        return;
                    }
                    break;
                case 1:
                    m13894a();
                    break;
            }
        }
    }

    public final void onClick(View view) {
        String str;
        String str2;
        if (this.f17731g != null) {
            this.f17731g.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(true));
        }
        if (!C9414h.m18630a(this.f17726b)) {
            this.f17727c = new C6602e(this.f17729e, this.f17726b);
            this.f17727c.mo12674a(this.f17728d);
        }
        C8068g.m16014a(C3922z.m9915e());
        TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        this.f17725a.getId();
        HashMap hashMap = new HashMap();
        String str3 = "notice_type";
        if (this.f17730f.getVisibility() == 0) {
            str = "red_dot";
        } else {
            str = "";
        }
        hashMap.put(str3, str);
        hashMap.put("room_id", String.valueOf(this.f17725a.getId()));
        String str4 = "live_type";
        if (this.f17732h == null || this.f17732h.equals(C8710m.VIDEO)) {
            str2 = "video_live";
        } else if (this.f17732h.equals(C8710m.THIRD_PARTY)) {
            str2 = "third_party";
        } else {
            str2 = "video_live";
        }
        hashMap.put(str4, str2);
        C8049c.m15979a().mo14202a("anchor_more_function_click", hashMap, new C8059j().mo14213a("live_take_detail").mo14214b("live_take"), new C8060k(), Room.class);
    }

    /* renamed from: b */
    public final void mo8421b(View view, DataCenter dataCenter) {
        dataCenter.removeObserver(this);
        if (this.f17727c != null) {
            this.f17727c.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo8419a(View view, DataCenter dataCenter) {
        ArrayList arrayList;
        this.f17731g = dataCenter;
        this.f17725a = (Room) dataCenter.get("data_room");
        this.f17732h = (C8710m) dataCenter.get("data_live_mode");
        this.f17728d = view;
        this.f17730f = view.findViewById(R.id.drp);
        if (((Boolean) dataCenter.get("data_is_anchor")).booleanValue()) {
            m13894a();
            dataCenter.observeForever("cmd_toolbar_click_filter", this);
            C4514j.m10883j().mo10325f().mo12673b(dataCenter, this.f17726b);
            C6611l a = C6611l.m13991a();
            if (this.f17726b == null || this.f17726b.size() <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f17726b.size());
                for (C6605h name : this.f17726b) {
                    arrayList.add(name.name());
                }
            }
            a.mo12687a((List<String>) arrayList);
            return;
        }
        this.f17728d.setVisibility(8);
        this.f17728d.setBackgroundResource(R.drawable.c4o);
        dataCenter.observe("cmd_video_orientation_changed", this, true);
    }
}
