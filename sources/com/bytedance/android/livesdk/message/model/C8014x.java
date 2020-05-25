package com.bytedance.android.livesdk.message.model;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.x */
public class C8014x extends C7859c {
    @C17952c(mo34828a = "extra")

    /* renamed from: a */
    public String f21937a;

    /* renamed from: com.bytedance.android.livesdk.message.model.x$a */
    class C8015a {
        @C17952c(mo34828a = "deco_list")

        /* renamed from: a */
        public List<C8721u> f21938a;
    }

    public C8014x() {
        this.type = C8629a.MODIFY_DECORATION;
    }

    /* renamed from: a */
    public final List<C8721u> mo14170a() {
        if (TextUtils.isEmpty(this.f21937a)) {
            return new ArrayList(0);
        }
        try {
            return ((C8015a) C4514j.m10883j().mo10320a().mo34884a(this.f21937a, C8015a.class)).f21938a;
        } catch (Exception unused) {
            return new ArrayList(0);
        }
    }
}
