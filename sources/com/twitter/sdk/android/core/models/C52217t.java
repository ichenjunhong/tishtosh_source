package com.twitter.sdk.android.core.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.t */
public final class C52217t implements Serializable {
    @C17952c(mo34828a = "aspect_ratio")
    public final List<Integer> aspectRatio;
    @C17952c(mo34828a = "duration_millis")
    public final long durationMillis;
    @C17952c(mo34828a = "variants")
    public final List<C52218a> variants;

    /* renamed from: com.twitter.sdk.android.core.models.t$a */
    public static class C52218a implements Serializable {
        @C17952c(mo34828a = "bitrate")
        public final long bitrate;
        @C17952c(mo34828a = "content_type")
        public final String contentType;
        @C17952c(mo34828a = "url")
        public final String url;

        public C52218a(long j, String str, String str2) {
            this.bitrate = j;
            this.contentType = str;
            this.url = str2;
        }
    }

    public C52217t(List<Integer> list, long j, List<C52218a> list2) {
        this.aspectRatio = C52206k.m111631a(list);
        this.durationMillis = j;
        this.variants = C52206k.m111631a(list2);
    }
}
