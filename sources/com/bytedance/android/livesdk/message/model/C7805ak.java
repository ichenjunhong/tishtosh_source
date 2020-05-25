package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ak */
public class C7805ak extends C7859c {
    @C17952c(mo34828a = "gift_id")

    /* renamed from: a */
    public long f21473a;
    @C17952c(mo34828a = "fan_ticket_count")

    /* renamed from: b */
    public long f21474b;
    @C17952c(mo34828a = "user")

    /* renamed from: c */
    public User f21475c;
    @C17952c(mo34828a = "to_user")

    /* renamed from: d */
    public User f21476d;
    @C17952c(mo34828a = "normal_content")

    /* renamed from: e */
    public String f21477e;
    @C17952c(mo34828a = "monkey_data")

    /* renamed from: f */
    public C7806a f21478f;

    /* renamed from: com.bytedance.android.livesdk.message.model.ak$a */
    public static class C7806a {
        @C17952c(mo34828a = "score")

        /* renamed from: a */
        public int f21479a;
        @C17952c(mo34828a = "break_record")

        /* renamed from: b */
        public boolean f21480b;
        @C17952c(mo34828a = "need_popup")

        /* renamed from: c */
        public boolean f21481c;
        @C17952c(mo34828a = "popup_content")

        /* renamed from: d */
        public String f21482d;
    }

    public C7805ak() {
        this.type = C8629a.GAME_GIFT_MESSAGE;
    }

    public boolean canText() {
        if (this.f21475c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C7810ao m15866a(C7805ak akVar) {
        if (akVar == null) {
            return null;
        }
        C7810ao aoVar = new C7810ao();
        aoVar.baseMessage = akVar.baseMessage;
        aoVar.f21494c = akVar.f21473a;
        aoVar.f21492a = akVar.f21475c;
        aoVar.f21493b = akVar.f21476d;
        aoVar.f21498g = 0;
        return aoVar;
    }
}
