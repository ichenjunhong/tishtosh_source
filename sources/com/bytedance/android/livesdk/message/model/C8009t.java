package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.message.model.t */
public class C8009t extends C7859c {
    @C17952c(mo34828a = "action")

    /* renamed from: a */
    public int f21914a;
    @C17952c(mo34828a = "tips")

    /* renamed from: b */
    public String f21915b;
    @C17952c(mo34828a = "extra")

    /* renamed from: c */
    public C8010a f21916c;

    /* renamed from: com.bytedance.android.livesdk.message.model.t$a */
    public static class C8010a {
        @C17952c(mo34828a = "ban_info_url")

        /* renamed from: a */
        public String f21917a;
        @C17952c(mo34828a = "reason_no")

        /* renamed from: b */
        public long f21918b;
        @C17952c(mo34828a = "title")

        /* renamed from: c */
        public C8851g f21919c;
        @C17952c(mo34828a = "violation_reason")

        /* renamed from: d */
        public C8851g f21920d;
        @C17952c(mo34828a = "display_text")

        /* renamed from: e */
        public C8851g f21921e;
    }

    public C8009t() {
        this.type = C8629a.CONTROL;
    }

    public boolean canText() {
        if (!C9431p.m18664a(mo14168a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo14168a() {
        Context e = C3922z.m9915e();
        Resources resources = e.getResources();
        switch (this.f21914a) {
            case 1:
                if (VERSION.SDK_INT >= 24) {
                    return C3922z.m9906a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.eo1);
                }
                return resources.getString(R.string.eo1);
            case 2:
                if (VERSION.SDK_INT >= 24) {
                    return C3922z.m9906a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.es1);
                }
                return resources.getString(R.string.es1);
            default:
                return "";
        }
    }
}
