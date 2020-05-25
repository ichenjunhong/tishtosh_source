package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import okhttp3.C53682y;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig */
public final class StickerDownloadConfig {
    public static final Companion Companion = new Companion(null);
    private int enterFromType;
    private C53682y httpClient;
    private C52671b<? super Integer, C52860x> onFail;
    private C52670a<C52860x> onSuccess;
    private final String region;
    private final String stickerId;
    private Integer type;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final int getEnterFromType() {
        return this.enterFromType;
    }

    public final C53682y getHttpClient() {
        return this.httpClient;
    }

    public final C52671b<Integer, C52860x> getOnFail() {
        return this.onFail;
    }

    public final C52670a<C52860x> getOnSuccess() {
        return this.onSuccess;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setEnterFromType(int i) {
        this.enterFromType = i;
    }

    public final void setHttpClient(C53682y yVar) {
        this.httpClient = yVar;
    }

    public final void setOnFail(C52671b<? super Integer, C52860x> bVar) {
        this.onFail = bVar;
    }

    public final void setOnSuccess(C52670a<C52860x> aVar) {
        this.onSuccess = aVar;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public StickerDownloadConfig(String str, String str2, C53682y yVar) {
        C52711k.m112240b(str, "stickerId");
        C52711k.m112240b(str2, "region");
        this.stickerId = str;
        this.region = str2;
        this.httpClient = yVar;
        this.type = Integer.valueOf(0);
        this.enterFromType = 10002;
    }

    public /* synthetic */ StickerDownloadConfig(String str, String str2, C53682y yVar, int i, C52707g gVar) {
        if ((i & 4) != 0) {
            yVar = null;
        }
        this(str, str2, yVar);
    }
}
