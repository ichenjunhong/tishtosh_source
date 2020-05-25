package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.bl */
public class C7838bl extends C7859c {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21656a;
    @C17952c(mo34828a = "toast_icon")

    /* renamed from: b */
    public ImageModel f21657b;

    public C7838bl() {
        this.type = C8629a.NOBLE_TOAST_MESSAGE;
    }

    public boolean canText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }
}
