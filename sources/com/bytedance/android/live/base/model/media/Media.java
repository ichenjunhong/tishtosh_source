package com.bytedance.android.live.base.model.media;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.media.VideoModel.C2986a;
import com.bytedance.android.live.base.model.share.ShareSourceInfo;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import java.util.List;

public class Media implements C2990d {
    public static final int CELL_STYLE_A = 1;
    public static final int CELL_STYLE_B = 2;
    public static final int CELL_STYLE_C = 3;
    public static final int MEDIA_DETAIL_TYPE_AD = 1;
    public static final int MEDIA_DETAIL_TYPE_MEDIA = 0;
    @C17952c(mo34828a = "ad_info")
    private MediaAdInfo adInfo;
    @C17952c(mo34828a = "at_users")
    private List<TextExtraStruct> aiteUserItems;
    @C17952c(mo34828a = "allow_comment")
    private boolean allowComment;
    @C17952c(mo34828a = "allow_dislike")
    private boolean allowDislike;
    @C17952c(mo34828a = "allow_share")
    private boolean allowShare;
    private long apiTime;
    @C17952c(mo34828a = "author")
    private User author;
    @C17952c(mo34828a = "auto_play")
    private int autoPlay;
    @C17952c(mo34828a = "cell_height")
    private int cellHeight;
    @C17952c(mo34828a = "cell_style")
    private int cellStyle;
    @C17952c(mo34828a = "cell_width")
    private int cellWidth;
    @C17952c(mo34828a = "comment_delay")
    private int commentDelay;
    @C17952c(mo34828a = "comment_prompts")
    private String commentPrompts;
    @C17952c(mo34828a = "commerce")
    private C2987a commerce;
    @C17952c(mo34828a = "create_time")
    private long createTime;
    private long danmakuShowTime;
    @C17952c(mo34828a = "private_info")
    private MediaDebugInfo debugInfo;
    @C17952c(mo34828a = "description")
    private String description;
    @C17952c(mo34828a = "display_style")
    private int displayStyle;
    @C17952c(mo34828a = "enable_send_flame")
    private boolean enableSendFlame;
    @C17952c(mo34828a = "feed_tips")
    private String feedTips;
    @C17952c(mo34828a = "feed_tips_type")
    private int feedTipsType;
    @C17952c(mo34828a = "from_ad")
    private boolean fromAd;
    @C17952c(mo34828a = "guide_card_id")
    private int guideCardId;
    @C17952c(mo34828a = "has_free_flame")
    private boolean hasFreeFlame;
    @C17952c(mo34828a = "has_sync_aweme")
    private boolean hasSyncAweme;
    @C17952c(mo34828a = "hashtag")
    private C2989c hashTag;
    @C17952c(mo34828a = "hide_nickname")
    private boolean hideNickName;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private long f8746id;
    private boolean isDeleted;
    @C17952c(mo34828a = "is_rich")
    private int isRich;
    @C17952c(mo34828a = "stats")
    private MediaItemStats itemStats;
    @C17952c(mo34828a = "location")
    private String location;
    private int mDetailType;
    @C17952c(mo34828a = "mark")
    private VideoMark mark;
    @C17952c(mo34828a = "recommend_reason")
    private MediaRecommendReason mediaRecommendReason;
    @C17952c(mo34828a = "media_type")
    private int mediaType;
    @C17952c(mo34828a = "song")
    private C2991e music;
    @C17952c(mo34828a = "new_cell_style")
    private int newCellStyle;
    private boolean noNeedQuery;
    @C17952c(mo34828a = "position")
    private String position;
    @C17952c(mo34828a = "share_description")
    private String shareDesc;
    @C17952c(mo34828a = "share_enable")
    private boolean shareEnable;
    @C17952c(mo34828a = "share_prompts")
    private String sharePrompts;
    @C17952c(mo34828a = "share_source_info")
    private ShareSourceInfo shareSourceInfo;
    @C17952c(mo34828a = "share_strong_guide")
    private int shareStrongGuide;
    @C17952c(mo34828a = "share_text")
    private String shareText;
    @C17952c(mo34828a = "share_tips")
    private String shareTips;
    @C17952c(mo34828a = "share_title")
    private String shareTitle;
    @C17952c(mo34828a = "share_url")
    private String shareUrl;
    @C17952c(mo34828a = "status")
    private int status;
    @C17952c(mo34828a = "title")
    private String text;
    @C17952c(mo34828a = "tips")
    private String tips;
    @C17952c(mo34828a = "tips_url")
    private String tipsUrl;
    @C17952c(mo34828a = "user_bury")
    private int userBury;
    @C17952c(mo34828a = "user_digg")
    private int userDigg;
    @C17952c(mo34828a = "video")
    private VideoModel videoModel;
    @C17952c(mo34828a = "video_pic_num")
    private int videoPicNum;
    @C17952c(mo34828a = "weibo_share_title")
    private String weiboShareTitle;

    public MediaAdInfo getAdInfo() {
        return this.adInfo;
    }

    public List<TextExtraStruct> getAiteUserItems() {
        return this.aiteUserItems;
    }

    public long getApiTime() {
        return this.apiTime;
    }

    public User getAuthor() {
        return this.author;
    }

    public int getAutoPlay() {
        return this.autoPlay;
    }

    public int getCellHeight() {
        return this.cellHeight;
    }

    public int getCellStyle() {
        return this.cellStyle;
    }

    public int getCellWidth() {
        return this.cellWidth;
    }

    public int getCommentDelay() {
        return this.commentDelay;
    }

    public String getCommentPrompts() {
        return this.commentPrompts;
    }

    public C2987a getCommerce() {
        return this.commerce;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDanmakuShowTime() {
        return this.danmakuShowTime;
    }

    public MediaDebugInfo getDebugInfo() {
        return this.debugInfo;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDetailType() {
        return this.mDetailType;
    }

    public int getDisplayStyle() {
        return this.displayStyle;
    }

    public String getFeedTips() {
        return this.feedTips;
    }

    public int getFeedTipsType() {
        return this.feedTipsType;
    }

    public int getGuideCardId() {
        return this.guideCardId;
    }

    public C2989c getHashTag() {
        return this.hashTag;
    }

    public long getId() {
        return this.f8746id;
    }

    public int getIsRich() {
        return this.isRich;
    }

    public MediaItemStats getItemStats() {
        return this.itemStats;
    }

    public String getLocation() {
        return this.location;
    }

    public VideoMark getMark() {
        return this.mark;
    }

    public MediaRecommendReason getMediaRecommendReason() {
        return this.mediaRecommendReason;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public C2991e getMusic() {
        return this.music;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public String getPlayKey() {
        return null;
    }

    public String getPosition() {
        return this.position;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public boolean getShareEnable() {
        return this.shareEnable;
    }

    public String getSharePrompts() {
        return this.sharePrompts;
    }

    public ShareSourceInfo getShareSourceInfo() {
        return this.shareSourceInfo;
    }

    public int getShareStrongGuide() {
        return this.shareStrongGuide;
    }

    public String getShareText() {
        return this.shareText;
    }

    public String getShareTips() {
        return this.shareTips;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getText() {
        return this.text;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTipsUrl() {
        return this.tipsUrl;
    }

    public int getUserBury() {
        return this.userBury;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public VideoModel getVideoModel() {
        return this.videoModel;
    }

    public int getVideoPicNum() {
        return this.videoPicNum;
    }

    public String getWeiboShareTitle() {
        return this.weiboShareTitle;
    }

    public boolean isAllowComment() {
        return this.allowComment;
    }

    public boolean isAllowDislike() {
        return this.allowDislike;
    }

    public boolean isAllowShare() {
        return this.allowShare;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public boolean isEnableSendFlame() {
        return this.enableSendFlame;
    }

    public boolean isFromAd() {
        return this.fromAd;
    }

    public boolean isHasFreeFlame() {
        return this.hasFreeFlame;
    }

    public boolean isHasSyncAweme() {
        return this.hasSyncAweme;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isNativeAd() {
        return false;
    }

    public boolean isNoNeedQuery() {
        return this.noNeedQuery;
    }

    public boolean isShareEnable() {
        return this.shareEnable;
    }

    public String getAdStatus() {
        if (isNativeAd()) {
            return C29094ad.f76264a;
        }
        if (isFromAd()) {
            return C31483a.f82385b;
        }
        return "";
    }

    public ImageModel getVideoCoverImage() {
        if (this.videoModel == null) {
            return null;
        }
        if (this.videoModel.getCoverType() != C2986a.MEDIUM) {
            return this.videoModel.getCoverModel();
        }
        return this.videoModel.getCoverMediumModel();
    }

    public boolean isBitRate() {
        if (getVideoModel() == null || getVideoModel().getQualityInfo() == null || getVideoModel().getQualityInfo().size() <= 1) {
            return false;
        }
        return true;
    }

    public void setAdInfo(MediaAdInfo mediaAdInfo) {
        this.adInfo = mediaAdInfo;
    }

    public void setAiteUserItems(List<TextExtraStruct> list) {
        this.aiteUserItems = list;
    }

    public void setAllowComment(boolean z) {
        this.allowComment = z;
    }

    public void setAllowDislike(boolean z) {
        this.allowDislike = z;
    }

    public void setAllowShare(boolean z) {
        this.allowShare = z;
    }

    public void setApiTime(long j) {
        this.apiTime = j;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAutoPlay(int i) {
        this.autoPlay = i;
    }

    public void setCellHeight(int i) {
        this.cellHeight = i;
    }

    public void setCellWidth(int i) {
        this.cellWidth = i;
    }

    public void setCommentDelay(int i) {
        this.commentDelay = i;
    }

    public void setCommentPrompts(String str) {
        this.commentPrompts = str;
    }

    public void setCommerce(C2987a aVar) {
        this.commerce = aVar;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDanmakuShowTime(long j) {
        this.danmakuShowTime = j;
    }

    public void setDebugInfo(MediaDebugInfo mediaDebugInfo) {
        this.debugInfo = mediaDebugInfo;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailType(int i) {
        this.mDetailType = i;
    }

    public void setDisplayStyle(int i) {
        this.displayStyle = i;
    }

    public void setEnableSendFlame(boolean z) {
        this.enableSendFlame = z;
    }

    public void setFeedTips(String str) {
        this.feedTips = str;
    }

    public void setFeedTipsType(int i) {
        this.feedTipsType = i;
    }

    public void setFromAd(boolean z) {
        this.fromAd = z;
    }

    public void setGuideCardId(int i) {
        this.guideCardId = i;
    }

    public void setHasFreeFlame(boolean z) {
        this.hasFreeFlame = z;
    }

    public void setHasSyncAweme(boolean z) {
        this.hasSyncAweme = z;
    }

    public void setHashTag(C2989c cVar) {
        this.hashTag = cVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setId(long j) {
        this.f8746id = j;
    }

    public void setIsRich(int i) {
        this.isRich = i;
    }

    public void setItemStats(MediaItemStats mediaItemStats) {
        this.itemStats = mediaItemStats;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMark(VideoMark videoMark) {
        this.mark = videoMark;
    }

    public void setMediaRecommendReason(MediaRecommendReason mediaRecommendReason2) {
        this.mediaRecommendReason = mediaRecommendReason2;
    }

    public void setMediaType(int i) {
        this.mediaType = i;
    }

    public void setMusic(C2991e eVar) {
        this.music = eVar;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setNoNeedQuery(boolean z) {
        this.noNeedQuery = z;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareEnable(boolean z) {
        this.shareEnable = z;
    }

    public void setSharePrompts(String str) {
        this.sharePrompts = str;
    }

    public void setShareSourceInfo(ShareSourceInfo shareSourceInfo2) {
        this.shareSourceInfo = shareSourceInfo2;
    }

    public void setShareStrongGuide(int i) {
        this.shareStrongGuide = i;
    }

    public void setShareText(String str) {
        this.shareText = str;
    }

    public void setShareTips(String str) {
        this.shareTips = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTipsUrl(String str) {
        this.tipsUrl = str;
    }

    public void setUserBury(int i) {
        this.userBury = i;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setVideoModel(VideoModel videoModel2) {
        this.videoModel = videoModel2;
    }

    public void setVideoPicNum(int i) {
        this.videoPicNum = i;
    }

    public void setWeiboShareTitle(String str) {
        this.weiboShareTitle = str;
    }

    public void setCellStyle(int i) {
        if (!(i == 1 || i == 2 || i == 3)) {
            i = 1;
        }
        this.cellStyle = i;
    }

    public void updateItemStats(MediaItemStats mediaItemStats) {
        if (mediaItemStats != null) {
            if (this.itemStats == null) {
                this.itemStats = mediaItemStats;
                return;
            }
            this.itemStats.setCommentCount(mediaItemStats.getCommentCount());
            this.itemStats.setDiggCount(Math.max(mediaItemStats.getDiggCount(), this.itemStats.getDiggCount()));
            this.itemStats.setPlayCount(Math.max(mediaItemStats.getPlayCount(), this.itemStats.getPlayCount()));
            this.itemStats.setShareCount(Math.max(mediaItemStats.getShareCount(), this.itemStats.getShareCount()));
        }
    }

    public void update(Media media) {
        if (media != null && media.getId() == this.f8746id) {
            this.text = media.text;
            this.createTime = media.createTime;
            this.userDigg = media.userDigg;
            this.userBury = media.userBury;
            this.mediaType = media.mediaType;
            this.status = media.status;
            updateItemStats(media.itemStats);
            if (media.author != null) {
                this.author = media.author;
            }
            if (media.videoModel != null) {
                this.videoModel = media.videoModel;
            }
            this.shareUrl = media.shareUrl;
            this.shareTitle = media.shareTitle;
            this.shareDesc = media.shareDesc;
            this.shareEnable = media.shareEnable;
            this.allowShare = media.allowShare;
            this.allowComment = media.allowComment;
            this.allowDislike = media.allowDislike;
            this.cellStyle = media.cellStyle;
            this.tips = media.tips;
            this.tipsUrl = media.tipsUrl;
            if (media.debugInfo != null) {
                this.debugInfo = media.debugInfo;
            }
            if (media.mark != null) {
                this.mark = media.mark;
            }
            this.shareText = media.shareText;
            this.cellHeight = media.cellHeight;
            this.cellWidth = media.cellWidth;
            this.feedTipsType = media.feedTipsType;
            this.feedTips = media.feedTips;
            this.location = media.location;
            this.displayStyle = media.displayStyle;
            this.commentDelay = media.commentDelay;
            this.guideCardId = media.guideCardId;
            this.sharePrompts = media.sharePrompts;
            this.commentPrompts = media.commentPrompts;
            this.weiboShareTitle = media.weiboShareTitle;
            this.shareTips = media.shareTips;
            this.enableSendFlame = media.enableSendFlame;
            this.hideNickName = media.hideNickName;
            this.music = media.music;
            this.videoPicNum = media.videoPicNum;
            this.apiTime = media.getApiTime();
            this.noNeedQuery = media.noNeedQuery;
            if (media.commerce != null) {
                this.commerce = media.commerce;
            }
        }
    }
}
