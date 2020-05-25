package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5159ae;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.entry.p366d.C7393a;
import com.bytedance.android.livesdk.gift.effect.normal.p369a.C7415a;
import com.bytedance.android.livesdk.gift.effect.normal.p370b.C7416a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;

public class NormalGiftAnimWidget extends LiveRecyclableWidget implements C0199s<KVData>, C7393a {

    /* renamed from: a */
    private NormalGiftAnimationView f17390a;

    /* renamed from: b */
    private C7415a f17391b = new C7415a();

    /* renamed from: c */
    private Room f17392c;

    public int getLayoutId() {
        return R.layout.asg;
    }

    /* renamed from: a */
    public final void mo12488a() {
        if (isViewValid() && this.f17390a != null) {
            this.f17390a.mo13724b();
        }
    }

    public void onUnload() {
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    public void onInit(Object... objArr) {
        this.f17390a = (NormalGiftAnimationView) this.contentView;
    }

    /* renamed from: b */
    public final void mo12492b(C7810ao aoVar) {
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_special_group_gift", aoVar);
        }
    }

    /* renamed from: a */
    public final void mo12489a(long j) {
        if (j != 0 && this.dataCenter != null) {
            if (this.f17392c != null && this.f17392c.isStar()) {
                return;
            }
            if (this.f17392c == null || !this.f17392c.isKoiRoom()) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f17390a.setNormalGiftEventListener(this);
        for (C7416a aVar : this.f17390a.f20346a) {
            aVar.f20303d = false;
        }
        this.f17392c = (Room) this.dataCenter.get("data_room");
        if (this.f17392c != null) {
            this.f17390a.setOrientation(this.f17392c.getOrientation());
        }
        this.dataCenter.observe("data_xt_landscape_tab_change", this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode == -763908145 && key.equals("cmd_clear_gift_message")) {
                    c = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    if (isViewValid() && this.f17390a != null) {
                        this.f17390a.mo13724b();
                        return;
                    }
                case 1:
                    if (((Integer) kVData.getData()).intValue() == 0) {
                        C9432q.m18691b(this.contentView, 0);
                        break;
                    } else {
                        C9432q.m18691b(this.contentView, 8);
                        return;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo12491a(C7810ao aoVar) {
        C7505d findGiftById = GiftManager.inst().findGiftById(aoVar.f21494c);
        if (!(findGiftById == null || this.f17390a == null || this.f17392c == null)) {
            this.f17390a.mo13723a(this.f17391b, aoVar, findGiftById, this.f17392c.getOwner());
        }
    }

    /* renamed from: a */
    public final void mo12490a(User user, String str, long j, C7810ao aoVar) {
        C5159ae aeVar = new C5159ae(user, str, j);
        if (aoVar != null) {
            aeVar.f13829d = aoVar.baseMessage;
        }
        C7505d findGiftById = GiftManager.inst().findGiftById(j);
        if ((findGiftById == null || findGiftById.f20544e != 8) && this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_normal_gift_end_event", aeVar);
        }
    }
}
