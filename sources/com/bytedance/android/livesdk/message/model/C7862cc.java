package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.cc */
public class C7862cc extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21746a;
    @C17952c(mo34828a = "color")

    /* renamed from: b */
    public String f21747b;
    @C17952c(mo34828a = "traceid")

    /* renamed from: c */
    public String f21748c;
    @C17952c(mo34828a = "icon")

    /* renamed from: d */
    public ImageModel f21749d;
    @C17952c(mo34828a = "action_content")

    /* renamed from: e */
    public String f21750e;
    @C17952c(mo34828a = "action_type")

    /* renamed from: f */
    public String f21751f;
    @C17952c(mo34828a = "push_message_display_time")

    /* renamed from: g */
    public long f21752g;

    /* renamed from: h */
    public ImageModel f21753h;

    /* renamed from: i */
    public transient ImageModel f21754i;

    /* renamed from: j */
    public transient CharSequence f21755j;

    /* renamed from: k */
    public transient int f21756k;

    public boolean canText() {
        return true;
    }

    public C7862cc() {
        this.type = C8629a.ROOM_RICH_CHAT_MESSAGE;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }
}
