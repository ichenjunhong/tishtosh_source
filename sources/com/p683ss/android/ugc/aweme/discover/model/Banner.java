package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Banner */
public class Banner implements C22982e, Serializable {
    private static final long serialVersionUID = 1;
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")
    BannerAdData adData;
    @C17952c(mo34828a = "banner_url")
    UrlModel bannerUrl;
    @C17952c(mo34828a = "bid")
    String bid;
    @C17952c(mo34828a = "height")
    int height;
    private String requestId;
    @C17952c(mo34828a = "schema")
    String schema;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "width")
    int width;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Banner$BannerAdData */
    public static class BannerAdData implements Serializable {
        @C17952c(mo34828a = "ad_label")
        AdLabel adLabel;
        @C17952c(mo34828a = "click_track_url_list")
        List<String> clickTrackUrlList;
        @C17952c(mo34828a = "creative_id")
        long creativeId;
        @C17952c(mo34828a = "is_ad")
        boolean isAd = true;
        @C17952c(mo34828a = "log_extra")
        String logExtra;
        @C17952c(mo34828a = "package_name")
        String packageName;
        @C17952c(mo34828a = "track_url_list")
        List<String> trackUrlList;
        @C17952c(mo34828a = "type")
        String type;

        public AdLabel getAdLabel() {
            return this.adLabel;
        }
    }

    public BannerAdData getAdData() {
        return this.adData;
    }

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public int getHeight() {
        return this.height;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public List<String> getClickTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.clickTrackUrlList;
    }

    public long getCreativeId() {
        if (this.adData == null) {
            return 0;
        }
        return this.adData.creativeId;
    }

    public String getLogExtra() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.logExtra;
    }

    public String getPackageName() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.packageName;
    }

    public List<String> getTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.trackUrlList;
    }

    public String getType() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.type;
    }

    public boolean isAd() {
        if (this.adData == null || !this.adData.isAd) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.bid != null) {
            i = this.bid.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (this.title != null) {
            i2 = this.title.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.bannerUrl != null) {
            i3 = this.bannerUrl.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((((i6 + i3) * 31) + this.height) * 31) + this.width) * 31;
        if (this.schema != null) {
            i4 = this.schema.hashCode();
        }
        return i7 + i4;
    }

    public void setBannerUrl(UrlModel urlModel) {
        this.bannerUrl = urlModel;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (this.height != banner.height || this.width != banner.width) {
            return false;
        }
        if (this.bid == null ? banner.bid != null : !this.bid.equals(banner.bid)) {
            return false;
        }
        if (this.title == null ? banner.title != null : !this.title.equals(banner.title)) {
            return false;
        }
        if (this.bannerUrl == null ? banner.bannerUrl != null : !this.bannerUrl.equals(banner.bannerUrl)) {
            return false;
        }
        if (this.schema != null) {
            return this.schema.equals(banner.schema);
        }
        if (banner.schema == null) {
            return true;
        }
        return false;
    }
}
