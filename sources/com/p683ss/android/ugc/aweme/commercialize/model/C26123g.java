package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.g */
public final class C26123g implements Serializable {
    public static final C26124a Companion = new C26124a(null);
    @C17952c(mo34828a = "aweme_id")

    /* renamed from: a */
    private final String f68975a;
    @C17952c(mo34828a = "item_type")

    /* renamed from: b */
    private final int f68976b;
    @C17952c(mo34828a = "creative_id")

    /* renamed from: c */
    private final String f68977c;
    @C17952c(mo34828a = "repack_aweme")

    /* renamed from: d */
    private final Aweme f68978d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.g$a */
    public static final class C26124a {
        private C26124a() {
        }

        public /* synthetic */ C26124a(C52707g gVar) {
            this();
        }
    }

    public C26123g() {
        this(null, 0, null, null, 15, null);
    }

    public final String getAwemeId() {
        return this.f68975a;
    }

    public final String getCreativeId() {
        return this.f68977c;
    }

    public final int getItemType() {
        return this.f68976b;
    }

    public final Aweme getRepackAweme() {
        return this.f68978d;
    }

    public C26123g(String str, int i, String str2, Aweme aweme) {
        this.f68975a = str;
        this.f68976b = i;
        this.f68977c = str2;
        this.f68978d = aweme;
    }

    public /* synthetic */ C26123g(String str, int i, String str2, Aweme aweme, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            aweme = null;
        }
        this(str, i, str2, aweme);
    }
}
