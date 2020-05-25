package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ac */
public final class C52151ac extends C52181v {
    @C17952c(mo34828a = "language")

    /* renamed from: f */
    public final String f129811f;
    @C17952c(mo34828a = "event_info")

    /* renamed from: g */
    public final String f129812g;
    @C17952c(mo34828a = "external_ids")

    /* renamed from: h */
    public final C52152a f129813h;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.ac$a */
    public class C52152a {
        @C17952c(mo34828a = "6")

        /* renamed from: a */
        public final String f129814a;

        public C52152a(String str) {
            this.f129814a = str;
        }
    }

    public C52151ac(C52158e eVar, String str, long j, String str2, String str3, List<C52144aa> list) {
        super("tfw_client_event", eVar, j, list);
        this.f129811f = str2;
        this.f129812g = str;
        this.f129813h = new C52152a(str3);
    }
}
