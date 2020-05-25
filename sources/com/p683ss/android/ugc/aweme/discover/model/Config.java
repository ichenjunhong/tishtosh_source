package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Config */
public final class Config implements Serializable {
    @C17952c(mo34828a = "cover_video")
    private Aweme aweme;
    @C17952c(mo34828a = "banner")
    private MovieBanner banner;
    @C17952c(mo34828a = "bg_color")
    private String bgColor;
    @C17952c(mo34828a = "center_color")
    private String centerColor;
    @C17952c(mo34828a = "center_color_ratio")
    private Float centerColorRatio;
    @C17952c(mo34828a = "cid")
    private String cid;
    @C17952c(mo34828a = "name")
    private String name;

    public static /* synthetic */ Config copy$default(Config config, String str, String str2, Aweme aweme2, MovieBanner movieBanner, String str3, String str4, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = config.cid;
        }
        if ((i & 2) != 0) {
            str2 = config.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            aweme2 = config.aweme;
        }
        Aweme aweme3 = aweme2;
        if ((i & 8) != 0) {
            movieBanner = config.banner;
        }
        MovieBanner movieBanner2 = movieBanner;
        if ((i & 16) != 0) {
            str3 = config.bgColor;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = config.centerColor;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            f = config.centerColorRatio;
        }
        return config.copy(str, str5, aweme3, movieBanner2, str6, str7, f);
    }

    public final String component1() {
        return this.cid;
    }

    public final String component2() {
        return this.name;
    }

    public final Aweme component3() {
        return this.aweme;
    }

    public final MovieBanner component4() {
        return this.banner;
    }

    public final String component5() {
        return this.bgColor;
    }

    public final String component6() {
        return this.centerColor;
    }

    public final Float component7() {
        return this.centerColorRatio;
    }

    public final Config copy(String str, String str2, Aweme aweme2, MovieBanner movieBanner, String str3, String str4, Float f) {
        String str5 = str;
        C52711k.m112240b(str, "cid");
        Config config = new Config(str5, str2, aweme2, movieBanner, str3, str4, f);
        return config;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.centerColorRatio, (java.lang.Object) r3.centerColorRatio) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.Config
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.discover.model.Config r3 = (com.p683ss.android.ugc.aweme.discover.model.Config) r3
            java.lang.String r0 = r2.cid
            java.lang.String r1 = r3.cid
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.aweme
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.aweme
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.discover.model.MovieBanner r0 = r2.banner
            com.ss.android.ugc.aweme.discover.model.MovieBanner r1 = r3.banner
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.bgColor
            java.lang.String r1 = r3.bgColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.centerColor
            java.lang.String r1 = r3.centerColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Float r0 = r2.centerColorRatio
            java.lang.Float r3 = r3.centerColorRatio
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.Config.equals(java.lang.Object):boolean");
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final MovieBanner getBanner() {
        return this.banner;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final Float getCenterColorRatio() {
        return this.centerColorRatio;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.cid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Aweme aweme2 = this.aweme;
        int hashCode3 = (hashCode2 + (aweme2 != null ? aweme2.hashCode() : 0)) * 31;
        MovieBanner movieBanner = this.banner;
        int hashCode4 = (hashCode3 + (movieBanner != null ? movieBanner.hashCode() : 0)) * 31;
        String str3 = this.bgColor;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.centerColor;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Float f = this.centerColorRatio;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(cid=");
        sb.append(this.cid);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", aweme=");
        sb.append(this.aweme);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", bgColor=");
        sb.append(this.bgColor);
        sb.append(", centerColor=");
        sb.append(this.centerColor);
        sb.append(", centerColorRatio=");
        sb.append(this.centerColorRatio);
        sb.append(")");
        return sb.toString();
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setBanner(MovieBanner movieBanner) {
        this.banner = movieBanner;
    }

    public final void setBgColor(String str) {
        this.bgColor = str;
    }

    public final void setCenterColor(String str) {
        this.centerColor = str;
    }

    public final void setCenterColorRatio(Float f) {
        this.centerColorRatio = f;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setCid(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.cid = str;
    }

    public Config(String str, String str2, Aweme aweme2, MovieBanner movieBanner, String str3, String str4, Float f) {
        C52711k.m112240b(str, "cid");
        this.cid = str;
        this.name = str2;
        this.aweme = aweme2;
        this.banner = movieBanner;
        this.bgColor = str3;
        this.centerColor = str4;
        this.centerColorRatio = f;
    }
}
