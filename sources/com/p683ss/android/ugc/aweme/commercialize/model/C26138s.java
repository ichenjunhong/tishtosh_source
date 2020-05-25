package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.s */
public class C26138s implements Serializable {
    @C17952c(mo34828a = "image_list")

    /* renamed from: a */
    List<UrlModel> f69024a;
    @C17952c(mo34828a = "avatar_icon")
    public UrlModel avatarIcon;

    /* renamed from: b */
    private User f69025b;
    @C17952c(mo34828a = "background_type")
    public int backgroundType;
    @C17952c(mo34828a = "button_style")
    public int buttonStyle;
    @C17952c(mo34828a = "button_text")
    public String buttonText;
    @C17952c(mo34828a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @C17952c(mo34828a = "comment_area")
    public C26139a commentArea;
    @C17952c(mo34828a = "creative_id")
    public String creativeId;
    @C17952c(mo34828a = "description")
    public String description;
    @C17952c(mo34828a = "download_url")
    public String downloadUrl;
    @C17952c(mo34828a = "feed_show_type")
    public int feedShowType;
    public boolean hasDislike;
    @C17952c(mo34828a = "is_preview")
    public boolean isPreview;
    @C17952c(mo34828a = "label")
    public String label;
    @C17952c(mo34828a = "label_type")
    public int labelType;
    public int linkType;
    @C17952c(mo34828a = "log_extra")
    public String logExtra;
    @C17952c(mo34828a = "mp_url")
    public String mpUrl;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "package")
    public String packageName;
    @C17952c(mo34828a = "report_enable")
    public boolean reportEnabled = true;
    @C17952c(mo34828a = "show_close_tips")
    public boolean showCloseTips;
    @C17952c(mo34828a = "show_type")
    public int showType;
    @C17952c(mo34828a = "source")
    public String source;
    @C17952c(mo34828a = "tips_schema")
    public String tipsSchema;
    @C17952c(mo34828a = "tips_text")
    public String tipsText;
    @C17952c(mo34828a = "tips_type")
    public int tipsType;
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

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.s$a */
    public static class C26139a implements Serializable {
        @C17952c(mo34828a = "avatar_icon")
        public UrlModel avatarIcon;
        @C17952c(mo34828a = "feature_label")
        public String featureLabel;
        @C17952c(mo34828a = "title")
        public String title;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.f69024a;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public User getUser() {
        return this.f69025b;
    }

    public boolean isHasDislike() {
        return this.hasDislike;
    }

    public boolean showOnFeed() {
        if (this.showType == 0 || this.showType == 1) {
            return true;
        }
        return false;
    }

    public UrlModel getCommentAvatarIcon() {
        if (this.commentArea == null || this.commentArea.avatarIcon == null) {
            return this.avatarIcon;
        }
        return this.commentArea.avatarIcon;
    }

    public boolean showOnComment() {
        if ((this.showType != 0 && this.showType != 2) || this.commentArea == null || this.commentArea.title == null || this.commentArea.featureLabel == null) {
            return false;
        }
        return true;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setHasDislike(boolean z) {
        this.hasDislike = z;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setUser(User user) {
        this.f69025b = user;
    }
}
