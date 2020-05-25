package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.cj */
public class C7869cj extends C7859c {
    @C17952c(mo34828a = "chat_id")

    /* renamed from: a */
    public long f21786a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f21787b;
    @C17952c(mo34828a = "user")

    /* renamed from: c */
    public User f21788c;
    @C17952c(mo34828a = "screen_chat_type")

    /* renamed from: d */
    public int f21789d;
    @C17952c(mo34828a = "priority")

    /* renamed from: e */
    public int f21790e;
    @C17952c(mo34828a = "effect_v2")

    /* renamed from: f */
    public C7999k f21791f;
    @C17952c(mo34828a = "background_image_v2")

    /* renamed from: g */
    public ImageModel f21792g;

    public C7869cj() {
        this.type = C8629a.SCREEN;
    }

    /* renamed from: a */
    public final boolean mo14160a() {
        if (this.f21790e != 0) {
            return true;
        }
        return false;
    }

    public boolean canText() {
        if (this.f21788c == null || C9431p.m18664a(this.f21787b)) {
            return false;
        }
        return true;
    }
}
