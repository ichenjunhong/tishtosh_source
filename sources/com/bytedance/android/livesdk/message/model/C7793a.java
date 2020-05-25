package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.C7776b;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.a */
public class C7793a extends C7859c implements C7776b {
    @C17952c(mo34828a = "asset_id")

    /* renamed from: a */
    public long f21426a;
    @C17952c(mo34828a = "panel_display_text")

    /* renamed from: b */
    public C8851g f21427b;
    @C17952c(mo34828a = "show_message")

    /* renamed from: c */
    public boolean f21428c;
    @C17952c(mo34828a = "show_panel")

    /* renamed from: d */
    public boolean f21429d;
    @C17952c(mo34828a = "user")

    /* renamed from: e */
    public User f21430e;
    @C17952c(mo34828a = "to_user")

    /* renamed from: f */
    public User f21431f;
    @C17952c(mo34828a = "priority")

    /* renamed from: g */
    public C7809an f21432g;

    /* renamed from: a */
    public final C7809an mo14121a() {
        return this.f21432g;
    }

    /* renamed from: b */
    public final boolean mo14122b() {
        return false;
    }

    public C7793a() {
        this.type = C8629a.ASSET_MESSAGE;
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
