package com.bytedance.android.livesdk.chatroom.interact;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4784g.C4785a;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4784g.C4786b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5506ec;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5506ec.C5507a;
import com.bytedance.android.livesdk.chatroom.p325ui.InRoomPKAnimationView;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6542dw;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;

public class LinkInRoomPkWidget extends LiveWidget implements C0199s<KVData>, C4786b, C5507a {

    /* renamed from: a */
    public int f13978a;

    /* renamed from: b */
    private LinkCrossRoomDataHolder f13979b;

    /* renamed from: c */
    private InRoomPKAnimationView f13980c;

    /* renamed from: d */
    private C5506ec f13981d;

    /* renamed from: e */
    private LinkPkTaskWidget f13982e;

    /* renamed from: f */
    private boolean f13983f;

    /* renamed from: g */
    private boolean f13984g;

    /* renamed from: h */
    private Room f13985h;

    /* renamed from: i */
    private C8056g f13986i;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.ase;
    }

    /* renamed from: a */
    private void m11861a() {
        this.f13980c.mo11821a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f13981d != null) {
            this.f13981d.mo8247a();
        }
        if (this.f13982e != null) {
            this.f13982e.mo12442c();
        }
        if (this.f13984g && this.f13978a == 3) {
            C8056g gVar = new C8056g();
            C8049c.m15979a().mo14203a("livesdk_pk_end", new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), gVar.mo14212c("disconnect").mo14208a(String.valueOf((System.currentTimeMillis() - this.f13979b.f12633x) / 1000)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            if (!(this.dataCenter == null || !(this.dataCenter.get("cmd_inroompk_state_change") instanceof C5646k) || ((C5646k) this.dataCenter.get("cmd_inroompk_state_change")).f14783a == 3)) {
                C8049c.m15979a().mo14203a("connection_over", gVar.mo14208a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12633x) / 1000)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            }
        } else if (!this.f13984g && this.f13978a == 3) {
            C5279am.m11944b();
        }
        this.f13979b.removeObserver(this);
        this.dataCenter.removeObserver(this);
    }

    public void onCreate() {
        super.onCreate();
        this.f13979b = LinkCrossRoomDataHolder.m11103a();
        this.f13985h = (Room) this.dataCenter.get("data_room");
        this.f13984g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f13980c = (InRoomPKAnimationView) this.contentView.findViewById(R.id.b31);
        this.f13981d = new C5506ec();
        this.f13981d.mo8520a((C5507a) this);
        enableSubWidgetManager();
        this.f13982e = new LinkPkTaskWidget(false);
        if (((Integer) LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER.mo9431a()).intValue() == 1) {
            C4495a.m10823a().mo10301a((Object) new C6542dw(this.f13982e));
        } else {
            this.subWidgetManager.load(R.id.dud, this.f13982e);
        }
        this.f13983f = true;
        this.f13978a = ((Integer) this.dataCenter.get("data_pk_chiji_stage", Integer.valueOf(0))).intValue();
        if (this.f13983f && (!this.f13984g || !((Boolean) C4525b.f12306B.mo10345a()).booleanValue())) {
            this.f13980c.mo11822a(this.f13985h.getOwner().getNickName(), this.f13985h.getOwner().getAvatarThumb());
            if (this.f13979b.f12606A != null) {
                this.f13980c.mo11823b(this.f13979b.f12606A.getNickName(), this.f13979b.f12606A.getAvatarThumb());
                m11861a();
            }
        }
        if (!this.f13984g && this.f13978a == 3) {
            C5279am.m11943a();
        }
        this.f13986i = new C8056g();
        if (this.f13984g) {
            if (this.f13985h.getId() == this.f13979b.f12612c) {
                this.f13986i.mo14209b(this.f13985h.getOwner().getId()).mo14211c(this.f13979b.f12614e);
                return;
            }
            this.f13986i.mo14209b(this.f13979b.f12614e).mo14211c(this.f13985h.getOwner().getId());
        }
    }

    /* renamed from: a */
    public final void mo10600a(C4785a aVar) {
        if (aVar != null && aVar.f13005a != 0) {
            if (!this.f13984g) {
                C5279am.m11944b();
            } else if (LinkCrossRoomDataHolder.m11103a().f12627r == 2) {
                C8049c.m15979a().mo14203a("connection_over", this.f13986i.mo14208a(String.valueOf((System.currentTimeMillis() - LinkCrossRoomDataHolder.m11103a().f12633x) / 1000)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            }
            if (aVar.f13005a == 1) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(2));
                if (this.f13984g) {
                    C8049c.m15979a().mo14203a("livesdk_pk_end", new C8059j().mo14213a("live_detail").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), this.f13986i.mo14212c("time_out").mo14208a(String.valueOf((System.currentTimeMillis() - this.f13979b.f12633x) / 1000)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
                }
                this.f13979b.mo10412c();
                return;
            }
            if (aVar.f13005a == 2) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(3));
                this.f13979b.mo10412c();
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (!(kVData == null || kVData.getData() == null || !kVData.getKey().equals("data_pk_chiji_stage"))) {
            this.f13978a = ((Integer) kVData.getData()).intValue();
            if (this.f13978a == 1 || this.f13978a == 2) {
                this.f13983f = false;
            } else if (this.f13978a == 3) {
                this.f13983f = true;
            }
            if (this.f13983f && (!this.f13984g || !((Boolean) C4525b.f12306B.mo10345a()).booleanValue())) {
                this.f13980c.mo11822a(this.f13985h.getOwner().getNickName(), this.f13985h.getOwner().getAvatarThumb());
                if (this.f13979b.f12606A != null) {
                    this.f13980c.mo11823b(this.f13979b.f12606A.getNickName(), this.f13979b.f12606A.getAvatarThumb());
                    m11861a();
                }
            }
            if (this.f13978a == 3 && !this.f13984g) {
                C5279am.m11943a();
            }
        }
    }
}
