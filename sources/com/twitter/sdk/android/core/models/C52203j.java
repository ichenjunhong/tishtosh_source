package com.twitter.sdk.android.core.models;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.twitter.sdk.android.core.models.j */
public final class C52203j extends C52212p {
    @C17952c(mo34828a = "ext_alt_text")
    public final String altText;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public final long f129939id;
    @C17952c(mo34828a = "id_str")
    public final String idStr;
    @C17952c(mo34828a = "media_url")
    public final String mediaUrl;
    @C17952c(mo34828a = "media_url_https")
    public final String mediaUrlHttps;
    @C17952c(mo34828a = "sizes")
    public final C52205b sizes;
    @C17952c(mo34828a = "source_status_id")
    public final long sourceStatusId;
    @C17952c(mo34828a = "source_status_id_str")
    public final String sourceStatusIdStr;
    @C17952c(mo34828a = "type")
    public final String type;
    @C17952c(mo34828a = "video_info")
    public final C52217t videoInfo;

    /* renamed from: com.twitter.sdk.android.core.models.j$a */
    public static class C52204a implements Serializable {
        @C17952c(mo34828a = "h")

        /* renamed from: h */
        public final int f129940h;
        @C17952c(mo34828a = "resize")
        public final String resize;
        @C17952c(mo34828a = "w")

        /* renamed from: w */
        public final int f129941w;

        public C52204a(int i, int i2, String str) {
            this.f129941w = i;
            this.f129940h = i2;
            this.resize = str;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.models.j$b */
    public static class C52205b implements Serializable {
        @C17952c(mo34828a = "large")
        public final C52204a large;
        @C17952c(mo34828a = "medium")
        public final C52204a medium;
        @C17952c(mo34828a = "small")
        public final C52204a small;
        @C17952c(mo34828a = "thumb")
        public final C52204a thumb;

        public C52205b(C52204a aVar, C52204a aVar2, C52204a aVar3, C52204a aVar4) {
            this.thumb = aVar;
            this.small = aVar2;
            this.medium = aVar3;
            this.large = aVar4;
        }
    }

    public C52203j(String str, String str2, String str3, int i, int i2, long j, String str4, String str5, String str6, C52205b bVar, long j2, String str7, String str8, C52217t tVar, String str9) {
        super(str, str2, str3, i, i2);
        this.f129939id = j;
        this.idStr = str4;
        this.mediaUrl = str5;
        this.mediaUrlHttps = str6;
        this.sizes = bVar;
        this.sourceStatusId = j2;
        this.sourceStatusIdStr = str7;
        this.type = str8;
        this.videoInfo = tVar;
        this.altText = str9;
    }
}
