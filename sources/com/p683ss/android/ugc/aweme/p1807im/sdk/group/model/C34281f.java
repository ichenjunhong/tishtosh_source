package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.f */
public final class C34281f implements Serializable {
    public static final C34282a Companion = new C34282a(null);
    @C17952c(mo34828a = "search_nil_item")

    /* renamed from: a */
    private String f88516a;
    @C17952c(mo34828a = "text_type")

    /* renamed from: b */
    private Integer f88517b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.f$a */
    public static final class C34282a {
        private C34282a() {
        }

        public /* synthetic */ C34282a(C52707g gVar) {
            this();
        }
    }

    public final String getNilItem() {
        return this.f88516a;
    }

    public final Integer getTextType() {
        return this.f88517b;
    }

    public final boolean isHate() {
        return SearchNilInfo.HIT_HEAT_SPEECH.equals(this.f88516a);
    }

    public final boolean isHitLimit() {
        return SearchNilInfo.HIT_LIMIT.equals(this.f88516a);
    }

    public final boolean isSensitive() {
        return Integer.valueOf(12).equals(this.f88517b);
    }

    public final void setNilItem(String str) {
        this.f88516a = str;
    }

    public final void setTextType(Integer num) {
        this.f88517b = num;
    }
}
