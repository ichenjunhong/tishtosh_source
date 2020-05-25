package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.relay.p381a.C7629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.aj */
public class C7804aj extends C7859c {
    @C17952c(mo34828a = "gift_id")

    /* renamed from: a */
    public long f21464a;
    @C17952c(mo34828a = "fan_ticket_count")

    /* renamed from: b */
    public long f21465b;
    @C17952c(mo34828a = "group_count")

    /* renamed from: c */
    public long f21466c;
    @C17952c(mo34828a = "repeat_count")

    /* renamed from: d */
    public long f21467d;
    @C17952c(mo34828a = "combo_count")

    /* renamed from: e */
    public long f21468e;
    @C17952c(mo34828a = "user")

    /* renamed from: f */
    public User f21469f;
    @C17952c(mo34828a = "to_user")

    /* renamed from: g */
    public User f21470g;
    @C17952c(mo34828a = "free_cell")

    /* renamed from: h */
    public C7629a f21471h;

    /* renamed from: i */
    public boolean f21472i;

    public boolean canText() {
        if (this.f21469f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C7810ao m15865a(C7804aj ajVar) {
        if (ajVar == null) {
            return null;
        }
        C7810ao aoVar = new C7810ao();
        aoVar.f21505n = ajVar.f21472i;
        aoVar.baseMessage = ajVar.baseMessage;
        aoVar.f21494c = ajVar.f21464a;
        aoVar.f21496e = (int) ajVar.f21465b;
        aoVar.f21500i = (int) ajVar.f21466c;
        aoVar.f21495d = (int) ajVar.f21467d;
        aoVar.f21499h = (int) ajVar.f21468e;
        aoVar.f21492a = ajVar.f21469f;
        aoVar.f21493b = ajVar.f21470g;
        aoVar.f21498g = 0;
        return aoVar;
    }
}
