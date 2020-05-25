package com.bytedance.android.livesdk.chatroom.viewmodule.p326a;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p325ui.C6079df;
import com.bytedance.android.livesdk.chatroom.p325ui.C6080dg;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.b */
public final class C6436b implements C0199s<KVData>, C6601a {

    /* renamed from: a */
    private Room f17718a;

    /* renamed from: b */
    private boolean f17719b = true;

    /* renamed from: c */
    private View f17720c;

    /* renamed from: d */
    private DataCenter f17721d;

    /* renamed from: e */
    private boolean f17722e = true;

    /* renamed from: f */
    private View f17723f;

    /* renamed from: g */
    private C8710m f17724g;

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    public C6436b(boolean z) {
    }

    /* renamed from: a */
    public final void mo8420a(C6597a aVar) {
        if (!this.f17722e && (aVar instanceof C6435e) && this.f17720c != null) {
            this.f17720c.setVisibility(((C6435e) aVar).f17717a);
        }
    }

    public final void onClick(View view) {
        String str;
        if (!C6437c.m13893a(view.getContext())) {
            C4575an.m10981a((int) R.string.e77);
            return;
        }
        if (this.f17718a != null) {
            if (((Integer) LiveSettingKeys.LIVE_PROFILE_MANAGE_DIALOG_STYLE.mo9431a()).intValue() == 0) {
                C6079df dfVar = new C6079df(view.getContext(), this.f17718a, this.f17718a.getOwner(), true, this.f17719b);
                dfVar.show();
            } else {
                C6080dg dgVar = new C6080dg(view.getContext(), this.f17718a, this.f17718a.getOwner(), true, this.f17719b);
                dgVar.show();
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", String.valueOf(this.f17718a.getOwnerUserId()));
                hashMap.put("room_id", this.f17718a.getIdStr());
                String str2 = "live_type";
                if (this.f17724g == null || this.f17724g.equals(C8710m.VIDEO)) {
                    str = "video_live";
                } else if (this.f17724g.equals(C8710m.THIRD_PARTY)) {
                    str = "third_party";
                } else {
                    str = "video_live";
                }
                hashMap.put(str2, str);
                C8049c.m15979a().mo14202a("livesdk_anchor_set_page_click", hashMap, new Object[0]);
            }
        }
        if (!this.f17722e) {
            C4525b.f12397bM.mo10346a(Boolean.valueOf(false));
            if (this.f17723f != null) {
                this.f17723f.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo8421b(View view, DataCenter dataCenter) {
        this.f17721d.removeObserver(this);
    }

    /* renamed from: a */
    public final void mo8419a(View view, DataCenter dataCenter) {
        this.f17721d = dataCenter;
        this.f17718a = (Room) this.f17721d.get("data_room");
        this.f17719b = ((Boolean) this.f17721d.get("data_is_portrait")).booleanValue();
        this.f17724g = (C8710m) dataCenter.get("data_live_mode");
        if (!this.f17722e) {
            this.f17720c = view;
            this.f17723f = view.findViewById(R.id.drp);
            int i = 8;
            this.f17720c.setVisibility(8);
            boolean booleanValue = ((Boolean) C4525b.f12397bM.mo10345a()).booleanValue();
            if (this.f17723f != null) {
                View view2 = this.f17723f;
                if (booleanValue) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            this.f17721d.observe("data_user_in_room", this);
        }
    }
}
