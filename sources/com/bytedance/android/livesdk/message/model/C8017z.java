package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.z */
public class C8017z extends C7859c implements C7776b {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21944a;
    @C17952c(mo34828a = "to_user")

    /* renamed from: b */
    public User f21945b;
    @C17952c(mo34828a = "gift_id")

    /* renamed from: c */
    public long f21946c;
    @C17952c(mo34828a = "repeat_count")

    /* renamed from: d */
    public int f21947d;
    @C17952c(mo34828a = "fan_ticket_count")

    /* renamed from: e */
    public long f21948e;
    @C17952c(mo34828a = "room_fan_ticket_count")

    /* renamed from: f */
    public long f21949f;
    @C17952c(mo34828a = "compose")

    /* renamed from: g */
    public C7794aa f21950g;
    @C17952c(mo34828a = "priority")

    /* renamed from: h */
    public C7809an f21951h;

    /* renamed from: i */
    public transient boolean f21952i;

    /* renamed from: a */
    public final C7809an mo14121a() {
        return this.f21951h;
    }

    /* renamed from: b */
    public final boolean mo14122b() {
        return this.f21952i;
    }

    public C8017z() {
        this.type = C8629a.DOODLE_GIFT;
    }

    public boolean canText() {
        if (this.f21944a != null) {
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
        StringBuilder sb = new StringBuilder("DoodleGiftMessage{fromUserId=");
        long j2 = 0;
        if (this.f21944a != null) {
            j = this.f21944a.getId();
        } else {
            j = 0;
        }
        sb.append(j);
        sb.append(", toUserId=");
        if (this.f21945b != null) {
            j2 = this.f21945b.getId();
        }
        sb.append(j2);
        sb.append(", giftId=");
        sb.append(this.f21946c);
        sb.append(", repeatCount=");
        sb.append(this.f21947d);
        sb.append(", fanTicketCount=");
        sb.append(this.f21948e);
        sb.append(", compose=");
        sb.append(C2942b.m8369a().mo34889b(this.f21950g));
        sb.append('}');
        return sb.toString();
    }
}
