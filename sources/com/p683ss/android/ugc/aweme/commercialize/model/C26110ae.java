package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26051ar;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ae */
public final class C26110ae implements C26051ar, Serializable {
    @C17952c(mo34828a = "ad_id")
    public long adId = -1;
    @C17952c(mo34828a = "ad_type")
    public int adType = -1;
    @C17952c(mo34828a = "advanced_infos")
    public List<C26111a> advancedInfoList;
    @C17952c(mo34828a = "advertiser_info")
    public User advertisementInfo;
    @C17952c(mo34828a = "brand_billboard_info")
    public BlueVBrandInfo brandInfo;
    @C17952c(mo34828a = "challenge_list")
    public List<Challenge> challengeList;
    @C17952c(mo34828a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @C17952c(mo34828a = "count_down_ts")
    public long countDownTimeStamp;
    @C17952c(mo34828a = "guide_text")
    public String guideText = "";
    @C17952c(mo34828a = "icon_list")
    public List<UrlModel> iconList = new ArrayList();
    @C17952c(mo34828a = "creative_id")

    /* renamed from: id */
    public long f68945id = -1;
    @C17952c(mo34828a = "image_list")
    public List<UrlModel> imageList;
    @C17952c(mo34828a = "is_preview")
    public boolean isPreview;
    @C17952c(mo34828a = "label")
    public String label;
    @C17952c(mo34828a = "log_extra")
    public String logExtra;
    @C17952c(mo34828a = "mp_url")
    public String mpUrl;
    @C17952c(mo34828a = "native_type")
    public int nativeType;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "source")
    public String source;
    @C17952c(mo34828a = "sub_text")
    public String subText = "";
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "track_url_list")
    public UrlModel trackUrlList;
    @C17952c(mo34828a = "type")
    public String type;
    @C17952c(mo34828a = "web_title")
    public String webTitle;
    @C17952c(mo34828a = "web_url")
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.ae$a */
    public static class C26111a {
        @C17952c(mo34828a = "title")

        /* renamed from: a */
        public String f68946a;
        @C17952c(mo34828a = "web_title")

        /* renamed from: b */
        public String f68947b;
        @C17952c(mo34828a = "web_url")

        /* renamed from: c */
        public String f68948c;
        @C17952c(mo34828a = "open_url")

        /* renamed from: d */
        public String f68949d;
        @C17952c(mo34828a = "mp_url")

        /* renamed from: e */
        public String f68950e;
        @C17952c(mo34828a = "image_info")

        /* renamed from: f */
        public UrlModel f68951f;
    }

    public final long getCreativeId() {
        return this.f68945id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }
}
