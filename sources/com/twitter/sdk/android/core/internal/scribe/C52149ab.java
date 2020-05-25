package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ab */
public final class C52149ab extends C52181v {
    @C17952c(mo34828a = "external_ids")

    /* renamed from: f */
    public final C52150a f129806f;
    @C17952c(mo34828a = "device_id_created_at")

    /* renamed from: g */
    public final long f129807g = 0;
    @C17952c(mo34828a = "language")

    /* renamed from: h */
    public final String f129808h;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ab$a */
    public class C52150a {
        @C17952c(mo34828a = "AD_ID")

        /* renamed from: a */
        public final String f129809a;

        public C52150a(String str) {
            this.f129809a = str;
        }
    }

    public C52149ab(C52158e eVar, long j, String str, String str2, List<C52144aa> list) {
        super("syndicated_sdk_impression", eVar, j, list);
        this.f129808h = str;
        this.f129806f = new C52150a(str2);
    }
}
