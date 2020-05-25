package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4 */
public final class DiscoverCategoryStructV4 {
    public static final Companion Companion = new Companion(null);
    public BannerList bannerList;
    @C17952c(mo34828a = "cover_url")
    public final UrlModel coverUrl;
    public boolean isFirst;
    public LogPbBean logPb;
    public int order;
    @C17952c(mo34828a = "tab_name")
    public final String tabName;
    @C17952c(mo34828a = "tab_text")
    public final String tabText;
    public int type;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public static /* synthetic */ DiscoverCategoryStructV4 copy$default(DiscoverCategoryStructV4 discoverCategoryStructV4, String str, String str2, UrlModel urlModel, LogPbBean logPbBean, BannerList bannerList2, int i, boolean z, int i2, int i3, Object obj) {
        DiscoverCategoryStructV4 discoverCategoryStructV42 = discoverCategoryStructV4;
        int i4 = i3;
        return discoverCategoryStructV4.copy((i4 & 1) != 0 ? discoverCategoryStructV42.tabName : str, (i4 & 2) != 0 ? discoverCategoryStructV42.tabText : str2, (i4 & 4) != 0 ? discoverCategoryStructV42.coverUrl : urlModel, (i4 & 8) != 0 ? discoverCategoryStructV42.logPb : logPbBean, (i4 & 16) != 0 ? discoverCategoryStructV42.bannerList : bannerList2, (i4 & 32) != 0 ? discoverCategoryStructV42.type : i, (i4 & 64) != 0 ? discoverCategoryStructV42.isFirst : z, (i4 & 128) != 0 ? discoverCategoryStructV42.order : i2);
    }

    public final DiscoverCategoryStructV4 copy(String str, String str2, UrlModel urlModel, LogPbBean logPbBean, BannerList bannerList2, int i, boolean z, int i2) {
        String str3 = str;
        C52711k.m112240b(str, "tabName");
        DiscoverCategoryStructV4 discoverCategoryStructV4 = new DiscoverCategoryStructV4(str3, str2, urlModel, logPbBean, bannerList2, i, z, i2);
        return discoverCategoryStructV4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverCategoryStructV4) {
                DiscoverCategoryStructV4 discoverCategoryStructV4 = (DiscoverCategoryStructV4) obj;
                if (C52711k.m112239a((Object) this.tabName, (Object) discoverCategoryStructV4.tabName) && C52711k.m112239a((Object) this.tabText, (Object) discoverCategoryStructV4.tabText) && C52711k.m112239a((Object) this.coverUrl, (Object) discoverCategoryStructV4.coverUrl) && C52711k.m112239a((Object) this.logPb, (Object) discoverCategoryStructV4.logPb) && C52711k.m112239a((Object) this.bannerList, (Object) discoverCategoryStructV4.bannerList)) {
                    if (this.type == discoverCategoryStructV4.type) {
                        if (this.isFirst == discoverCategoryStructV4.isFirst) {
                            if (this.order == discoverCategoryStructV4.order) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.tabName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.tabText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.coverUrl;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode4 = (hashCode3 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        BannerList bannerList2 = this.bannerList;
        if (bannerList2 != null) {
            i = bannerList2.hashCode();
        }
        int hashCode5 = (((hashCode4 + i) * 31) + Integer.hashCode(this.type)) * 31;
        boolean z = this.isFirst;
        if (z) {
            z = true;
        }
        return ((hashCode5 + (z ? 1 : 0)) * 31) + Integer.hashCode(this.order);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverCategoryStructV4(tabName=");
        sb.append(this.tabName);
        sb.append(", tabText=");
        sb.append(this.tabText);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(", bannerList=");
        sb.append(this.bannerList);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", isFirst=");
        sb.append(this.isFirst);
        sb.append(", order=");
        sb.append(this.order);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverCategoryStructV4(String str, String str2) {
        C52711k.m112240b(str, "tabName");
        this(str, str2, null, null, null, 4, false, 0, 192, null);
    }

    public DiscoverCategoryStructV4(String str, String str2, int i) {
        C52711k.m112240b(str, "tabName");
        this(str, str2, null, null, null, i, false, 0, 192, null);
    }

    public DiscoverCategoryStructV4(String str, String str2, BannerList bannerList2) {
        C52711k.m112240b(str, "tabName");
        this(str, str2, null, null, bannerList2, 0, false, 0, 192, null);
    }

    public DiscoverCategoryStructV4(String str, String str2, UrlModel urlModel, LogPbBean logPbBean, BannerList bannerList2, int i, boolean z, int i2) {
        C52711k.m112240b(str, "tabName");
        this.tabName = str;
        this.tabText = str2;
        this.coverUrl = urlModel;
        this.logPb = logPbBean;
        this.bannerList = bannerList2;
        this.type = i;
        this.isFirst = z;
        this.order = i2;
    }

    public /* synthetic */ DiscoverCategoryStructV4(String str, String str2, UrlModel urlModel, LogPbBean logPbBean, BannerList bannerList2, int i, boolean z, int i2, int i3, C52707g gVar) {
        LogPbBean logPbBean2;
        BannerList bannerList3;
        int i4;
        boolean z2;
        int i5;
        int i6 = i3;
        if ((i6 & 8) != 0) {
            logPbBean2 = null;
        } else {
            logPbBean2 = logPbBean;
        }
        if ((i6 & 16) != 0) {
            bannerList3 = null;
        } else {
            bannerList3 = bannerList2;
        }
        if ((i6 & 32) != 0) {
            i4 = 4;
        } else {
            i4 = i;
        }
        if ((i6 & 64) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i6 & 128) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        this(str, str2, urlModel, logPbBean2, bannerList3, i4, z2, i5);
    }
}
