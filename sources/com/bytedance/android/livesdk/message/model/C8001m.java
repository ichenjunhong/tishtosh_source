package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.m */
public class C8001m extends C7859c {
    @C17952c(mo34828a = "chat_id")

    /* renamed from: a */
    public long f21868a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f21869b;
    @C17952c(mo34828a = "user")

    /* renamed from: c */
    public User f21870c;
    @C17952c(mo34828a = "visible_to_sender")

    /* renamed from: d */
    public boolean f21871d;
    @C17952c(mo34828a = "background_image")

    /* renamed from: e */
    public ImageModel f21872e;
    @C17952c(mo34828a = "full_screen_text_color")

    /* renamed from: f */
    public String f21873f;

    /* renamed from: g */
    public transient String f21874g;

    public C8001m() {
        this.f21873f = "#FF0000";
        this.type = C8629a.CHAT;
    }

    public boolean canText() {
        if (this.f21870c == null || C9431p.m18664a(this.f21869b)) {
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
