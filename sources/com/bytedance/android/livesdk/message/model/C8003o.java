package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.o */
public class C8003o extends C7859c {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21877a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f21878b;
    @C17952c(mo34828a = "color")

    /* renamed from: c */
    public String f21879c;
    @C17952c(mo34828a = "back_ground")

    /* renamed from: d */
    public ImageModel f21880d;
    @C17952c(mo34828a = "action_type")

    /* renamed from: e */
    public long f21881e;
    @C17952c(mo34828a = "action_content")

    /* renamed from: f */
    public String f21882f;

    public boolean canText() {
        return true;
    }

    public C8003o() {
        this.type = C8629a.COMMENT_IMAGE;
    }
}
