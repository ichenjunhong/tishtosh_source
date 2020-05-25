package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo */
public class CategoryListAdInfo implements Serializable {
    @C17952c(mo34828a = "ad_id")
    Long adId;
    @C17952c(mo34828a = "ad_position")
    private int adPosition = -1;
    @C17952c(mo34828a = "click_track_url_list")
    UrlModel clickTrackUrlList;
    @C17952c(mo34828a = "creative_id")
    Long creativeId;
    @C17952c(mo34828a = "description")
    String description;
    @C17952c(mo34828a = "image_list")
    List<UrlModel> imageList;
    @C17952c(mo34828a = "is_preview")
    boolean isPreview;
    @C17952c(mo34828a = "label")
    private AwemeTextLabelModel label;
    @C17952c(mo34828a = "log_extra")
    String logExtra;
    @C17952c(mo34828a = "mp_url")
    String mpUrl;
    @C17952c(mo34828a = "open_url")
    String openUrl;
    @C17952c(mo34828a = "source")
    String source;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "track_url_list")
    UrlModel trackUrlList;
    @C17952c(mo34828a = "type")
    String type;
    @C17952c(mo34828a = "web_title")
    String webTitle;
    @C17952c(mo34828a = "web_url")
    String webUrl;

    public Long getAdId() {
        return this.adId;
    }

    public int getAdPosition() {
        return this.adPosition;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getMpUrl() {
        return this.mpUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdPosition(int i) {
        this.adPosition = i;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
