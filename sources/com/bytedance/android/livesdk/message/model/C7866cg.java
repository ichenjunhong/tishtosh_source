package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.FlexImageModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.cg */
public class C7866cg extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21767a;
    @C17952c(mo34828a = "color")

    /* renamed from: b */
    public String f21768b;
    @C17952c(mo34828a = "traceid")

    /* renamed from: c */
    public String f21769c;
    @C17952c(mo34828a = "icon")

    /* renamed from: d */
    public ImageModel f21770d;
    @C17952c(mo34828a = "action_content")

    /* renamed from: e */
    public String f21771e;
    @C17952c(mo34828a = "action_type")

    /* renamed from: f */
    public String f21772f;
    @C17952c(mo34828a = "push_message_display_time")

    /* renamed from: g */
    public long f21773g;
    @C17952c(mo34828a = "background_image")

    /* renamed from: h */
    public FlexImageModel f21774h;
    @C17952c(mo34828a = "new_background_image")

    /* renamed from: i */
    public FlexImageModel f21775i;
    @C17952c(mo34828a = "action_icon")

    /* renamed from: j */
    public ImageModel f21776j;
    @C17952c(mo34828a = "source")

    /* renamed from: k */
    public String f21777k;

    /* renamed from: l */
    public transient int f21778l;

    public C7866cg() {
        this.f21772f = "0";
        this.type = C8629a.ROOM_PUSH;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }
}
