package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.af */
public class C7799af extends C7859c {
    @C17952c(mo34828a = "action")

    /* renamed from: a */
    public int f21449a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f21450b;
    @C17952c(mo34828a = "user")

    /* renamed from: c */
    public User f21451c;
    @C17952c(mo34828a = "upgrade_privilege")

    /* renamed from: d */
    public C7800a f21452d;

    /* renamed from: com.bytedance.android.livesdk.message.model.af$a */
    public static class C7800a {
        @C17952c(mo34828a = "content")

        /* renamed from: a */
        public String f21453a;
        @C17952c(mo34828a = "description")

        /* renamed from: b */
        public String f21454b;
        @C17952c(mo34828a = "button_type")

        /* renamed from: c */
        public int f21455c;
    }

    public boolean canText() {
        if (!C9431p.m18664a(this.f21450b)) {
            return true;
        }
        return false;
    }
}
