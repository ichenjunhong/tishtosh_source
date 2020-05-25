package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.http.p1169a.p1174d.C19190d;

/* renamed from: com.bytedance.android.livesdk.message.model.cr */
public class C7878cr extends C7859c {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21830a;
    @C17952c(mo34828a = "goods_order")

    /* renamed from: b */
    public C7879a f21831b;

    /* renamed from: com.bytedance.android.livesdk.message.model.cr$a */
    public static class C7879a {
        @C17952c(mo34828a = "goods_room_order")

        /* renamed from: a */
        public long f21832a;
        @C17952c(mo34828a = "order_num")

        /* renamed from: b */
        public long f21833b;
        @C17952c(mo34828a = "order_money")

        /* renamed from: c */
        public long f21834c;
        @C17952c(mo34828a = "order_id")

        /* renamed from: d */
        public String f21835d;
    }

    public boolean canText() {
        return true;
    }

    public C7878cr() {
        this.type = C8629a.GOODS_ORDER;
    }

    public int hashCode() {
        return C19190d.m46779a(17, (Object) Long.valueOf(this.baseMessage.f24133d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7878cr) || this.baseMessage.f24133d != ((C7878cr) obj).baseMessage.f24133d) {
            return false;
        }
        return true;
    }
}
