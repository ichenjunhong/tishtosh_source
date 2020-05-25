package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.base.api.C23460b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47770ck;
import com.p683ss.android.ugc.aweme.utils.C47850ei;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Challenge */
public class Challenge extends C23453a implements Serializable {
    @C17952c(mo34828a = "allow_upload_cover")
    public int allowUploadCover;
    @C17952c(mo34828a = "cha_attrs")
    public List<String> attrs;
    @C17952c(mo34828a = "author")
    public User author;
    @C17952c(mo34828a = "background_image_url")
    public UrlModel backgroundImageUrl;
    @C17952c(mo34828a = "is_history_billboard")
    public boolean billBoardIsHistory;
    @C17952c(mo34828a = "billboard_rank")
    public int billBoardRank;
    @C17952c(mo34828a = "billboard_type")
    public int billBoardType;
    @C17952c(mo34828a = "billboard_url")
    public String billBoardUrl;
    @C17952c(mo34828a = "billboard_version")
    public int billBoardVersion;
    @C17952c(mo34828a = "category_cover_info")
    public CategoryCoverStruct categoryCover;
    @C17952c(mo34828a = "announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;
    @C17952c(mo34828a = "cover_photo")
    public String challengeBgUrl;
    @C17952c(mo34828a = "disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;
    @C17952c(mo34828a = "cha_name")
    public String challengeName;
    @C17952c(mo34828a = "new_cover_photo")
    public UrlModel challengeNewCoverPhoto;
    @C17952c(mo34828a = "hashtag_profile")
    public String challengeProfileUrl;
    @C17951b(mo34826a = C47770ck.class)
    @C17952c(mo34828a = "sticker_detail")
    public String challengeStickerDetail;
    @C23460b
    @C17952c(mo34828a = "cid")
    public String cid;
    @C17952c(mo34828a = "collect_stat")
    public int collectStatus;
    @C17952c(mo34828a = "banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;
    @C17952c(mo34828a = "commerce_challenge_task")
    public CommerceChallengeTask commerceChallengeTask;
    @C17952c(mo34828a = "commerce_sub_type")
    public int commerceSubType = 0;
    @C17952c(mo34828a = "connect_music")
    public List<Music> connectMusics;
    @C17952c(mo34828a = "content_type")
    public int contentType;
    @C17952c(mo34828a = "cover_item")
    public UrlModel coverItem;
    @C17951b(mo34826a = C47850ei.class)
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "elastic_layer_title")
    public String elasticLayerTitle;
    @C17952c(mo34828a = "inquiry")
    public InquiryStruct inquiryStruct;
    @C17952c(mo34828a = "is_challenge")
    public int isChallenge;
    @C17952c(mo34828a = "is_commerce")
    public boolean isCommerceAndValid;
    @C17952c(mo34828a = "is_hot_search")
    public int isHotSearch;
    @C17952c(mo34828a = "is_strong_music")
    public int isStrongMusic;
    @C17952c(mo34828a = "link_action")
    public String linkAction;
    @C17952c(mo34828a = "link_text")
    public String linkText;
    @C17952c(mo34828a = "link_title")
    public String linkTitle;
    @C17952c(mo34828a = "link_type")
    public int linkType;
    @C17952c(mo34828a = "elastic_layers")
    public List<ChallengeElasticLayer> mChallengeElasticLayers;
    @C17952c(mo34828a = "is_status")
    public int mStatus;
    @C17952c(mo34828a = "related_media_source")
    public RelatedMediaSourceStruct mediaSource;
    @C17952c(mo34828a = "module_type")
    public int moduleType;
    @C17952c(mo34828a = "mv_id")
    public String mvId;
    @C17952c(mo34828a = "label_origin_author")
    public String originAuthor;
    @C17952c(mo34828a = "is_pgcshow")
    public boolean pgcshow;
    @C17952c(mo34828a = "profile_tag")
    public String profileTagUrl;
    @C17952c(mo34828a = "related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();
    public String requestId;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "share_info")
    public ShareInfo shareInfo;
    @C17952c(mo34828a = "show_items")
    public List<ShowItemsStruct> showItems;
    @C17952c(mo34828a = "spring_game_id")
    public String springGameId;
    @C17952c(mo34828a = "star_user")
    public User starUser;
    @C17952c(mo34828a = "sticker_id")
    public String stickerId;
    @C17952c(mo34828a = "sub_type")
    public int subType;
    @C17952c(mo34828a = "tag")
    public int tag;
    @C17952c(mo34828a = "button")
    public ChallengeTransform transfrom;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "user_count")
    public int userCount;
    @C17952c(mo34828a = "vertical_type")
    public int verticalType;
    @C17952c(mo34828a = "view_count")
    public long viewCount = -1;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.Challenge$ChallengeSubType */
    public interface ChallengeSubType {
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public int getBillBoardRank() {
        return this.billBoardRank;
    }

    public int getBillBoardType() {
        return this.billBoardType;
    }

    public String getBillBoardUrl() {
        return this.billBoardUrl;
    }

    public int getBillBoardVersion() {
        return this.billBoardVersion;
    }

    public CategoryCoverStruct getCategoryCover() {
        return this.categoryCover;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public List<ChallengeElasticLayer> getChallengeElasticLayers() {
        return this.mChallengeElasticLayers;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public UrlModel getChallengeNewCoverPhoto() {
        return this.challengeNewCoverPhoto;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public CommerceChallengeTask getCommerceChallengeTask() {
        return this.commerceChallengeTask;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getElasticLayerTitle() {
        return this.elasticLayerTitle;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public RelatedMediaSourceStruct getMediaSource() {
        return this.mediaSource;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getSpringGameId() {
        return this.springGameId;
    }

    public User getStarUser() {
        return this.starUser;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getTag() {
        return this.tag;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public int getVerticalType() {
        return this.verticalType;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isBillBoardIsHistory() {
        return this.billBoardIsHistory;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean allowUploadCover() {
        if (this.allowUploadCover == 1) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.isChallenge == 1) {
            return true;
        }
        return false;
    }

    public boolean isCommerce() {
        if (this.subType == 1) {
            return true;
        }
        return false;
    }

    public boolean isStrongMusic() {
        if (this.isStrongMusic == 1) {
            return true;
        }
        return false;
    }

    public boolean isTrending() {
        if (this.isHotSearch == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.cid != null) {
            return this.cid.hashCode();
        }
        return 0;
    }

    public boolean isLinkActionAsOpenUrl() {
        if (this.linkType == 7) {
            return true;
        }
        return false;
    }

    public long getDisplayCount() {
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setBillBoardIsHistory(boolean z) {
        this.billBoardIsHistory = z;
    }

    public void setBillBoardRank(int i) {
        this.billBoardRank = i;
    }

    public void setBillBoardType(int i) {
        this.billBoardType = i;
    }

    public void setBillBoardUrl(String str) {
        this.billBoardUrl = str;
    }

    public void setBillBoardVersion(int i) {
        this.billBoardVersion = i;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement2) {
        this.challengeAnnouncement = challengeAnnouncement2;
    }

    public void setChallengeElasticLayers(List<ChallengeElasticLayer> list) {
        this.mChallengeElasticLayers = list;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setChallengeNewCoverPhoto(UrlModel urlModel) {
        this.challengeNewCoverPhoto = urlModel;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setCommerceChallengeTask(CommerceChallengeTask commerceChallengeTask2) {
        this.commerceChallengeTask = commerceChallengeTask2;
    }

    public void setConnectMusics(List<Music> list) {
        this.connectMusics = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setElasticLayerTitle(String str) {
        this.elasticLayerTitle = str;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setMediaSource(RelatedMediaSourceStruct relatedMediaSourceStruct) {
        this.mediaSource = relatedMediaSourceStruct;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setStarUser(User user) {
        this.starUser = user;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setVerticalType(int i) {
        this.verticalType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Challenge) obj).cid);
    }
}
