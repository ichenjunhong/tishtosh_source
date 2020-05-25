package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.r */
public class C8007r extends C7859c {
    @C17952c(mo34828a = "discardable")

    /* renamed from: a */
    public boolean f21899a;
    @C17952c(mo34828a = "immediate")

    /* renamed from: b */
    public boolean f21900b;
    @C17952c(mo34828a = "duration")

    /* renamed from: c */
    public int f21901c;
    @C17952c(mo34828a = "background_color_start")

    /* renamed from: d */
    public String f21902d;
    @C17952c(mo34828a = "background_color_end")

    /* renamed from: e */
    public String f21903e;
    @C17952c(mo34828a = "text_color")

    /* renamed from: f */
    public String f21904f;
    @C17952c(mo34828a = "position")

    /* renamed from: g */
    public int f21905g;
    @C17952c(mo34828a = "top_img")

    /* renamed from: h */
    public ImageModel f21906h;
    @C17952c(mo34828a = "top_img_width")

    /* renamed from: i */
    public int f21907i;
    @C17952c(mo34828a = "top_img_height")

    /* renamed from: j */
    public int f21908j;
    @C17952c(mo34828a = "show_mongolia_layer")

    /* renamed from: k */
    public boolean f21909k;

    public C8007r() {
        this.f21902d = "#ff9d5c";
        this.f21903e = "#ff9d5c";
        this.f21904f = "#ffffff";
        this.f21905g = 1;
        this.type = C8629a.COMMON_TOAST;
    }
}
