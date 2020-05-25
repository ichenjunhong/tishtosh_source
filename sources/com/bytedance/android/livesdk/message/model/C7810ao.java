package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ao */
public class C7810ao extends C7859c implements C7776b {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21492a;
    @C17952c(mo34828a = "to_user")

    /* renamed from: b */
    public User f21493b;
    @C17952c(mo34828a = "gift_id")

    /* renamed from: c */
    public long f21494c;
    @C17952c(mo34828a = "repeat_count")

    /* renamed from: d */
    public int f21495d;
    @C17952c(mo34828a = "fan_ticket_count")

    /* renamed from: e */
    public int f21496e;
    @C17952c(mo34828a = "room_fan_ticket_count")

    /* renamed from: f */
    public long f21497f;
    @C17952c(mo34828a = "repeat_end")

    /* renamed from: g */
    public int f21498g;
    @C17952c(mo34828a = "combo_count")

    /* renamed from: h */
    public int f21499h;
    @C17952c(mo34828a = "group_count")

    /* renamed from: i */
    public int f21500i;
    @C17952c(mo34828a = "group_id")

    /* renamed from: j */
    public long f21501j;
    @C17952c(mo34828a = "text_effect")

    /* renamed from: k */
    public C7872cm f21502k;
    @C17952c(mo34828a = "income_taskgifts")

    /* renamed from: l */
    public long f21503l;

    /* renamed from: m */
    public boolean f21504m;

    /* renamed from: n */
    public transient boolean f21505n;
    @C17952c(mo34828a = "priority")

    /* renamed from: o */
    public C7809an f21506o;

    /* renamed from: a */
    public final C7809an mo14121a() {
        return this.f21506o;
    }

    /* renamed from: b */
    public final boolean mo14122b() {
        return this.f21505n;
    }

    public C7810ao() {
        this.type = C8629a.GIFT;
    }

    public boolean canText() {
        if (this.f21492a != null) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j;
        StringBuilder sb = new StringBuilder("GiftMessage{fromUserId=");
        sb.append(this.f21492a);
        sb.append(", toUserId=");
        if (this.f21493b != null) {
            j = this.f21493b.getId();
        } else {
            j = 0;
        }
        sb.append(j);
        sb.append(", giftId=");
        sb.append(this.f21494c);
        sb.append(", repeatCount=");
        sb.append(this.f21495d);
        sb.append(", fanTicketCount=");
        sb.append(this.f21496e);
        sb.append(", repeatEnd=");
        sb.append(this.f21498g);
        sb.append(", comboCount=");
        sb.append(this.f21499h);
        sb.append(", groupCount=");
        sb.append(this.f21500i);
        sb.append(", groupId=");
        sb.append(this.f21501j);
        sb.append(", textEffect=");
        sb.append(C2942b.m8369a().mo34889b(this.f21502k));
        sb.append(", incomeTaskgifts=");
        sb.append(this.f21503l);
        sb.append(", isUrgent=");
        sb.append(this.f21504m);
        sb.append(", isLocal=");
        sb.append(this.f21505n);
        sb.append('}');
        return sb.toString();
    }
}
