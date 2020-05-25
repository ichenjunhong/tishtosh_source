package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.effect.doodle.C7330a;
import com.bytedance.android.livesdk.gift.effect.doodle.view.C7369a;
import com.bytedance.android.livesdk.gift.p354b.C7219d;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class DoodleWidget extends LiveRecyclableWidget implements C4129g {

    /* renamed from: a */
    private C7369a f16961a;

    /* renamed from: b */
    private Room f16962b;

    /* renamed from: c */
    private boolean f16963c;

    /* renamed from: d */
    private boolean f16964d;

    /* renamed from: e */
    private boolean f16965e;

    /* renamed from: f */
    private C7330a f16966f;

    /* renamed from: g */
    private C1689b f16967g = new C1689b();

    /* renamed from: a */
    public final void mo12365a() {
        if (this.f16961a != null) {
            C7369a aVar = this.f16961a;
            if (aVar.f20121a != null) {
                aVar.f20121a.clear();
            }
        }
    }

    public void onUnload() {
        this.containerView.removeView(this.f16961a);
        if (this.f16966f != null && this.f16966f.f18412j) {
            this.f16966f.dismiss();
        }
        if (this.f16967g != null) {
            this.f16967g.mo6180a();
        }
    }

    public void onInit(Object... objArr) {
        this.f16961a = new C7369a(this.context);
        this.f16961a.setUserEventListener(this);
    }

    /* renamed from: a */
    private <T> void m13504a(Class<T> cls) {
        this.f16967g.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C8745a) {
                    DoodleWidget.this.onEvent((C8745a) t);
                    return;
                }
                if (t instanceof C7219d) {
                    DoodleWidget.this.onEvent((C7219d) t);
                }
            }
        }));
    }

    public void onEvent(C8745a aVar) {
        if (aVar.f24023b == 3) {
            this.f16963c = true;
            return;
        }
        if (aVar.f24023b == 4) {
            this.f16963c = false;
        }
    }

    /* renamed from: a */
    public final void mo9499a(long j) {
        if (j != 0) {
            if (this.f16962b != null && this.f16962b.isStar()) {
                return;
            }
            if (this.f16962b == null || !this.f16962b.isKoiRoom()) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
            }
        }
    }

    /* renamed from: a */
    public final void mo12366a(C8017z zVar) {
        if (isViewValid() && zVar != null && this.f16961a != null) {
            if (zVar.f21945b == null || 0 == zVar.f21945b.getId() || zVar.f21945b.getId() == this.f16962b.getOwner().getId()) {
                this.dataCenter.lambda$put$1$DataCenter("data_anchor_ticket_count", Long.valueOf(zVar.f21948e));
                this.dataCenter.lambda$put$1$DataCenter("data_current_room_ticket_count", Long.valueOf(zVar.f21949f));
            }
            if (this.f16964d || !this.f16963c) {
                this.f16961a.mo13639a(zVar);
                return;
            }
            if (zVar.f21944a != null && zVar.f21944a.getId() == ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()) {
                this.f16961a.mo13639a(zVar);
            }
        }
    }

    public void onEvent(C7219d dVar) {
        boolean z;
        if (this.f16966f != null && this.f16966f.mo12851g()) {
            this.f16966f.dismiss();
            this.f16966f = null;
        }
        Activity activity = (Activity) this.context;
        User user = dVar.f19598b;
        boolean z2 = this.f16965e;
        boolean z3 = this.f16964d;
        DataCenter dataCenter = this.dataCenter;
        Room room = this.f16962b;
        long j = dVar.f19597a;
        String str = dVar.f19599c;
        C7330a aVar = new C7330a();
        aVar.f19995a = activity;
        aVar.f20002h = user;
        aVar.f19996b = z2;
        aVar.f19997c = z3;
        aVar.f20000f = dataCenter;
        aVar.f20001g = room;
        aVar.f19999e = j;
        aVar.f20016w = str;
        if (!z3 || (!z2 && !C3894h.m9842a(activity))) {
            z = false;
        } else {
            z = true;
        }
        aVar.f19998d = z;
        this.f16966f = aVar;
        if (this.context instanceof FragmentActivity) {
            this.f16966f.show(((FragmentActivity) this.context).getSupportFragmentManager(), "DoodleGiftDialogFragment");
        }
    }

    public void onLoad(Object... objArr) {
        this.containerView.addView(this.f16961a);
        this.f16962b = (Room) this.dataCenter.get("data_room");
        this.f16964d = ((Boolean) this.dataCenter.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        this.f16965e = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        m13504a(C8745a.class);
        m13504a(C7219d.class);
    }
}
