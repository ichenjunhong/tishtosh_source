package com.bytedance.android.livesdk.chatroom.model.p323a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.e */
public final class C5696e {

    /* renamed from: a */
    public int f14950a;
    @C17952c(mo34828a = "fan_ticket")

    /* renamed from: b */
    public long f14951b;
    @C17952c(mo34828a = "linkmic_id")

    /* renamed from: c */
    public int f14952c;
    @C17952c(mo34828a = "user")

    /* renamed from: d */
    public User f14953d;
    @C17952c(mo34828a = "modify_time")

    /* renamed from: e */
    public long f14954e;
    @C17952c(mo34828a = "link_status")

    /* renamed from: f */
    public int f14955f;
    @C17952c(mo34828a = "link_type")

    /* renamed from: g */
    public int f14956g;
    @C17952c(mo34828a = "role_type")

    /* renamed from: h */
    public int f14957h;
    @C17952c(mo34828a = "payed_money")

    /* renamed from: i */
    public int f14958i;
    @C17952c(mo34828a = "link_duration")

    /* renamed from: j */
    public int f14959j;
    @C17952c(mo34828a = "user_position")

    /* renamed from: k */
    public int f14960k;
    @C17952c(mo34828a = "silence_status")

    /* renamed from: l */
    public int f14961l;
    @C17952c(mo34828a = "linkmic_id_str")

    /* renamed from: m */
    public String f14962m;

    /* renamed from: n */
    public boolean f14963n;

    /* renamed from: o */
    public boolean f14964o;

    /* renamed from: a */
    public final String mo11637a() {
        if (TextUtils.isEmpty(this.f14962m)) {
            return String.valueOf(this.f14952c);
        }
        return this.f14962m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkPlayerInfo{mInteractingState=");
        sb.append(this.f14950a);
        sb.append(", mFanTicket=");
        sb.append(this.f14951b);
        sb.append(", mInteractId=");
        sb.append(this.f14952c);
        sb.append(", mUser=");
        sb.append(this.f14953d);
        sb.append(", mModifyTime=");
        sb.append(this.f14954e);
        sb.append(", mLinkStatus=");
        sb.append(this.f14955f);
        sb.append(", mLinkType=");
        sb.append(this.f14956g);
        sb.append(", mRoleType=");
        sb.append(this.f14957h);
        sb.append(", paidMoney=");
        sb.append(this.f14958i);
        sb.append(", linkDuration=");
        sb.append(this.f14959j);
        sb.append(", userPosition=");
        sb.append(this.f14960k);
        sb.append(", silenceStatus=");
        sb.append(this.f14961l);
        sb.append(", mInteractIdStr='");
        sb.append(this.f14962m);
        sb.append('\'');
        sb.append(", outOfDate=");
        sb.append(this.f14963n);
        sb.append(", isTalking=");
        sb.append(this.f14964o);
        sb.append('}');
        return sb.toString();
    }
}
