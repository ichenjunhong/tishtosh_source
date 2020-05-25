package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.p */
public class C8004p extends C7859c {
    @C17952c(mo34828a = "message_type")

    /* renamed from: a */
    public int f21883a;
    @C17952c(mo34828a = "main_content")

    /* renamed from: b */
    public C8851g f21884b;
    @C17952c(mo34828a = "secondary_content")

    /* renamed from: c */
    public List<C8005a> f21885c;
    @C17952c(mo34828a = "icon")

    /* renamed from: d */
    public ImageModel f21886d;
    @C17952c(mo34828a = "button_content")

    /* renamed from: e */
    public C8851g f21887e;
    @C17952c(mo34828a = "button_action_schema")

    /* renamed from: f */
    public String f21888f;
    @C17952c(mo34828a = "button_icon")

    /* renamed from: g */
    public ImageModel f21889g;
    @C17952c(mo34828a = "duration")

    /* renamed from: h */
    public long f21890h;

    /* renamed from: com.bytedance.android.livesdk.message.model.p$a */
    public static class C8005a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        public String f21891a;
        @C17952c(mo34828a = "text")

        /* renamed from: b */
        public String f21892b;
        @C17952c(mo34828a = "font_color")

        /* renamed from: c */
        public String f21893c;
        @C17952c(mo34828a = "font_size")

        /* renamed from: d */
        public int f21894d;
        @C17952c(mo34828a = "weight")

        /* renamed from: e */
        public int f21895e;
        @C17952c(mo34828a = "img")

        /* renamed from: f */
        public ImageModel f21896f;
    }

    public C8004p() {
        this.type = C8629a.COMMON_GUIDE;
    }
}
