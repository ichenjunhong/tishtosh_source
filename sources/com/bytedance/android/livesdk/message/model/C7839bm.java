package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.bm */
public class C7839bm extends C7859c implements C7776b {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21658a;
    @C17952c(mo34828a = "open_url")

    /* renamed from: b */
    public String f21659b;
    @C17952c(mo34828a = "background_pop")

    /* renamed from: c */
    public ImageModel f21660c;
    @C17952c(mo34828a = "background_normal")

    /* renamed from: d */
    public ImageModel f21661d;
    @C17952c(mo34828a = "display_style")

    /* renamed from: e */
    public int f21662e;
    @C17952c(mo34828a = "priority")

    /* renamed from: f */
    public C7809an f21663f;

    /* renamed from: a */
    public final C7809an mo14121a() {
        return this.f21663f;
    }

    /* renamed from: b */
    public final boolean mo14122b() {
        return false;
    }

    public C7839bm() {
        this.type = C8629a.NOBLE_UPGRADE_MESSAGE;
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
