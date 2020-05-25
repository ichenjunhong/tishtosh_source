package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.cb */
public class C7861cb extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21738a;
    @C17952c(mo34828a = "notice_type")

    /* renamed from: b */
    public int f21739b;
    @C17952c(mo34828a = "style")

    /* renamed from: c */
    public String f21740c;
    @C17952c(mo34828a = "title")

    /* renamed from: d */
    public C8851g f21741d;
    @C17952c(mo34828a = "violation_reason")

    /* renamed from: e */
    public C8851g f21742e;
    @C17952c(mo34828a = "display_text")

    /* renamed from: f */
    public C8851g f21743f;
    @C17952c(mo34828a = "tips_title")

    /* renamed from: g */
    public C8851g f21744g;
    @C17952c(mo34828a = "tips_url")

    /* renamed from: h */
    public String f21745h;

    public C7861cb() {
        this.type = C8629a.REMIND;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }
}
