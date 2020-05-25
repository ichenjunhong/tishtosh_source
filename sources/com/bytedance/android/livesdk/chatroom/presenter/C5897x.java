package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.p248b.C4122a;
import com.bytedance.android.live.gift.p248b.C4123b;
import com.bytedance.android.live.gift.p248b.C4124c;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.C5173as;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.x */
public final class C5897x extends C4122a {

    /* renamed from: a */
    public DataCenter f15425a;

    /* renamed from: b */
    public final Room f15426b;

    /* renamed from: c */
    public IMessageManager f15427c;

    /* renamed from: d */
    private final boolean f15428d;

    /* renamed from: e */
    private C4123b f15429e;

    /* renamed from: a */
    public final void mo8247a() {
        if (mo8518c() != null) {
            ((C4124c) mo8518c()).mo9495b();
        }
        this.f15429e = null;
        super.mo8247a();
    }

    public C5897x(DataCenter dataCenter) {
        this.f15425a = dataCenter;
        this.f15426b = (Room) dataCenter.get("data_room");
        this.f15428d = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8520a(C10175a aVar) {
        super.mo8520a((C4124c) aVar);
        this.f15427c = (IMessageManager) this.f15425a.get("data_message_manager");
        this.f15429e = new C4123b() {
            /* renamed from: b */
            public final void mo9494b() {
                if (C5897x.this.mo8518c() != null) {
                    C4575an.m10981a((int) R.string.eh4);
                }
            }

            /* renamed from: a */
            public final void mo9491a() {
                C5173as asVar = new C5173as(0, "live_detail", "gift_guide");
                C4575an.m10981a((int) R.string.f0x);
                C5897x.this.f15425a.lambda$put$1$DataCenter("cmd_show_recharge_dialog", asVar);
            }

            /* renamed from: a */
            public final void mo9493a(String str) {
                if (C5897x.this.mo8518c() != null) {
                    C4575an.m10987a(str);
                }
            }

            /* renamed from: a */
            public final void mo9492a(C7514m mVar) {
                if (C5897x.this.mo8518c() != null) {
                    ((C4124c) C5897x.this.mo8518c()).mo9495b();
                }
                User user = (User) C5897x.this.f15425a.get("data_user_in_room");
                if (C5897x.this.f15427c != null) {
                    C5897x.this.f15427c.insertMessage(C7519o.m15511a(C5897x.this.f15426b.getId(), mVar, user));
                }
                C5897x.this.f15425a.get("log_enter_live_source");
                String str = (String) C5897x.this.f15425a.get("log_action_type");
                C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
                String str2 = "";
                String str3 = "";
                if (a.mo14192a().containsKey("source")) {
                    str3 = (String) a.mo14192a().get("source");
                }
                if (a.mo14192a().containsKey("enter_from")) {
                    str2 = (String) a.mo14192a().get("enter_from");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_type", "core");
                hashMap.put("event_belong", "live_interact");
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(C5897x.this.f15426b.getId()));
                hashMap.put("enter_from", str2);
                hashMap.put("anchor_id", String.valueOf(C5897x.this.f15426b.getOwner().getId()));
                hashMap.put("gift_id", String.valueOf(mVar.f20613e));
                hashMap.put("live_type", "video_live");
                hashMap.put("gift_type", "convenient_gift");
                hashMap.put("source", str3);
                hashMap.put("request_page", "shortcut");
                hashMap.put("event_type", "other");
                hashMap.put("event_module", "bottom_tab");
                hashMap.put("money", "1");
                hashMap.put("gift_cnt", "1");
                hashMap.put("action_type", str);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Long.valueOf(mVar.f20613e), Integer.valueOf(1));
                hashMap.put("gift_info", C7459a.m15414a(hashMap2));
                hashMap.put("is_first_consume", String.valueOf(C4627a.m11090a(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
                hashMap.put("growth_deepevent", "1");
                C8049c.m15979a().mo14202a("send_gift", hashMap, new C8059j());
            }
        };
    }
}
