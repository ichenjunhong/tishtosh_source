package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.commerce.C25483a;
import com.p683ss.android.ugc.aweme.commerce.model.C25516b;
import com.p683ss.android.ugc.aweme.commerce.model.C25518d;
import com.p683ss.android.ugc.aweme.commerce.model.C25519e;
import com.p683ss.android.ugc.aweme.commercialize.model.C26119d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26132m;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.feed.model.dongchedi.DCDVideoExtra;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.poi.NearbyCardStruct;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct;
import com.p683ss.android.ugc.aweme.live.C36061c;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.poi.model.C39098ad;
import com.p683ss.android.ugc.aweme.poi.model.C39108an;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.p2121a.C41399b;
import com.p683ss.android.ugc.aweme.shortvideo.C43895j;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.utils.C47917gi;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Aweme */
public class Aweme implements C22982e, Serializable, Cloneable {
    public static final int COMMERCIALIZE_CONST_MAX_LINES = 4;
    @C17952c(mo34828a = "activity_id")
    public String activityId;
    @C17952c(mo34828a = "activity_pendant")
    public C25516b activityPendant;
    @C17952c(mo34828a = "ad_aweme_source")
    public int adAwemeSource;
    public boolean adDescHandle = true;
    public int adDescMaxLines = 4;
    @C17952c(mo34828a = "ad_link_type")
    public int adLinkType;
    @C17952c(mo34828a = "ad_order_id")
    public String adOrderId;
    @C17952c(mo34828a = "ad_schedule")
    public String adSchedule;
    @C17952c(mo34828a = "aweme_id")
    public String aid;
    @C17952c(mo34828a = "anchor")
    public Anchor anchor;
    @C17952c(mo34828a = "anchor_info")
    public AnchorInfo anchorInfo;
    @C17952c(mo34828a = "anchors")
    public List<AnchorCommonStruct> anchors;
    @C17952c(mo34828a = "author")
    public User author;
    @C17952c(mo34828a = "acl_info")
    public AwemeACLShare awemeACLShareInfo;
    @C17952c(mo34828a = "aweme_control")
    public AwemeControl awemeControl = new AwemeControl();
    @C17952c(mo34828a = "national_task_info")
    public AwemeNationalTask awemeNationalTask;
    public int awemePosition = -1;
    @C17952c(mo34828a = "raw_ad_data")
    public AwemeRawAd awemeRawAd;
    @C17952c(mo34828a = "risk_infos")
    public AwemeRiskModel awemeRiskModel;
    @C17952c(mo34828a = "aweme_type")
    public int awemeType;
    @C17952c(mo34828a = "banner_tip")
    public BannerTip bannerTip;
    public transient C43895j cacheAvUploadMiscInfoStruct;
    @C17952c(mo34828a = "can_play")
    public boolean canPlay = true;
    public String challengeId;
    @C17952c(mo34828a = "cha_list")
    public List<Challenge> challengeList;
    @C17952c(mo34828a = "cmt_swt")
    public boolean cmtSwt;
    @C17952c(mo34828a = "collect_stat")
    public int collectStatus;
    @C17952c(mo34828a = "item_comment_settings")
    public int commentSetting;
    @C17952c(mo34828a = "commerce_config_data")
    public List<CommerceConfigData> commerceConfigDataList;
    @C17952c(mo34828a = "commerce_sticker_info")
    public C26132m commerceStickerInfo;
    @C17952c(mo34828a = "create_time")
    public long createTime;
    public long date;
    @C17952c(mo34828a = "dcd_video_extra")
    public DCDVideoExtra dcdVideoExtra;
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "desc_language")
    public String descLanguage;
    @C17952c(mo34828a = "descendants")
    public DescendantsModel descendantsModel;
    @C17952c(mo34828a = "distance")
    public String distance;
    @C17952c(mo34828a = "distribute_type")
    public int distributeType;
    @C17952c(mo34828a = "without_watermark")
    public boolean downloadWithoutWatermark;
    @C17952c(mo34828a = "item_duet")
    public int duetSetting;
    public transient WeakReference<CharSequence> ellipsizeDesc;
    public transient CharSequence ellipsizeTransDesc;
    @C17952c(mo34828a = "enable_top_view")
    public boolean enableTopView = true;
    @C17952c(mo34828a = "external_video_type")
    public int externalType;
    @C17952c(mo34828a = "extra")
    public String extra;
    public List<User> familiarRecommendUser;
    public long feedCount;
    @C17952c(mo34828a = "feed_relation_label")
    public RelationLabelNew feedRelationLabel;
    @C17952c(mo34828a = "floating_card_content")
    public FloatingCardInfo floatingCardInfo;
    @C17952c(mo34828a = "forward_comment_id")
    public String forwardCommentId;
    @C17952c(mo34828a = "forward_item")
    public Aweme forwardItem;
    @C17952c(mo34828a = "forward_item_id")
    public String forwardItemId;
    public Challenge fromRawChallenge;
    @C17952c(mo34828a = "game_info")
    public GameInfo gameInfo;
    @C17952c(mo34828a = "has_vs_entry")
    public boolean hasVisionSearchEntry;
    @C17952c(mo34828a = "hot_list")
    public HotListStruct hotListStruct;
    @C17952c(mo34828a = "hot_info")
    public HotSearchInfo hotSearchInfo;
    @C17952c(mo34828a = "hotsearch_info")
    public HotSearchInfoStruct hotSearchInfoStruct;
    public String hotSpot;
    @C17952c(mo34828a = "hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;
    @C17952c(mo34828a = "image_infos")
    public List<ImageInfo> imageInfos;
    @C17952c(mo34828a = "interaction_stickers")
    public List<InteractStickerStruct> interactStickerStructs;
    @C17952c(mo34828a = "is_ads")
    public boolean isAd;
    public boolean isCanCache = true;
    @C17952c(mo34828a = "is_effect_designer")
    public boolean isEffectDesigner;
    public boolean isFakeResponse;
    @C17952c(mo34828a = "is_familiar")
    public boolean isFamiliar;
    @C17952c(mo34828a = "is_fantasy")
    public boolean isFantasy;
    public boolean isFirstInSpot;
    public boolean isFromDouPlusGuideAnimate;
    @C17952c(mo34828a = "is_hash_tag")
    public int isHashTag;
    public boolean isLastInSpot;
    @C17952c(mo34828a = "is_live_replay")
    public boolean isLiveReplay;
    @C17952c(mo34828a = "is_pgcshow")
    public boolean isPgcShow;
    public boolean isPreloadScroll;
    @C17952c(mo34828a = "is_preview")
    public int isPreview;
    @C17952c(mo34828a = "is_prohibited")
    public boolean isProhibited;
    @C17952c(mo34828a = "is_relieve")
    public boolean isRelieve;
    @C17952c(mo34828a = "is_top")
    public int isTop;
    @C17952c(mo34828a = "is_vr")
    public boolean isVr;
    @C17952c(mo34828a = "label_large")
    public UrlModel labelLarge;
    @C17952c(mo34828a = "label_private")
    public UrlModel labelPrivate;
    @C17952c(mo34828a = "label_thumb")
    public UrlModel labelThumb;
    @C17952c(mo34828a = "label_top")
    public UrlModel labelTop;
    @C17952c(mo34828a = "landing_page")
    public String landingPage;
    @C17952c(mo34828a = "law_critical_country")
    public boolean lawCriticalCountry;
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "link_ad_data")
    public C26138s linkAdData;
    @C17952c(mo34828a = "link_match")
    public C41399b linkMatch;
    @C17952c(mo34828a = "live_id")
    public long liveId;
    @C17952c(mo34828a = "live_reason")
    public String liveReaSon;
    @C17952c(mo34828a = "live_window_show_time")
    public long liveWindowShowTime;
    @C17952c(mo34828a = "long_video")
    public List<LongVideo> longVideos;
    @C17952c(mo34828a = "commerce_info")
    public C25483a mCommerceVideoAuthInfo;
    public int mConcatAndUploadState;
    @C17952c(mo34828a = "label_music_starter_text")
    public String mLabelMusicStarterText;
    @C17952c(mo34828a = "label_origin_author_text")
    public String mLabelOriginAuthorText;
    @C17952c(mo34828a = "cny_info")
    public LiveAwesomeSplashInfo mLiveAwesomeSplashInfo;
    public HashMap<String, String> mMobParams;
    @C17952c(mo34828a = "new_relation_label")
    public List<RelationLabelNew> mNewRelationLabel;
    @C17952c(mo34828a = "cell_room")
    public RoomFeedCellStruct mRoomFeedCellStruct;
    @C17952c(mo34828a = "micro_app_info")
    public C36966e microAppInfo;
    @C17952c(mo34828a = "mix_info")
    public MixStruct mixInfo;
    @C17952c(mo34828a = "music")
    public Music music;
    @C17952c(mo34828a = "label_music_starter")
    public UrlModel musicStarter;
    @C17952c(mo34828a = "nearby_card")
    public NearbyCardStruct nearbyCardStruct;
    @C17952c(mo34828a = "nearby_fresh_label")
    public String nearbyHotLabel;
    @C17952c(mo34828a = "need_vs_entry")
    public boolean needVisionSearchEntry;
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "rawdata")
    public NewLiveRoomStruct newLiveRoomData;
    @C17952c(mo34828a = "new_source_id")
    public String newSourceId;
    @C17952c(mo34828a = "new_source_type")
    public String newSourceType;
    @C17952c(mo34828a = "nickname_position")
    public List<Position> nicknamePosition;
    @C17952c(mo34828a = "label_origin_author")
    public UrlModel originAuthor;
    @C17952c(mo34828a = "origin_comment_ids")
    public List<String> originCommentIds;
    public int originalPos;
    public C39098ad poiOpCardStruct;
    public C39108an poiRankCardStruct;
    @C17952c(mo34828a = "poi_info")
    public PoiStruct poiStruct;
    @C17952c(mo34828a = "position")
    public List<Position> position;
    @C17952c(mo34828a = "pre_forward_id")
    public String preForwardId;
    @C17952c(mo34828a = "preload")
    public Preload preload;
    @C17952c(mo34828a = "prevent_download")
    public boolean preventDownload;
    public transient WeakReference<CharSequence> processedDesc;
    @C17952c(mo34828a = "promotion_other_info")
    public C25518d promotionOtherInfo;
    @C17952c(mo34828a = "rate")
    public int rate = -1;
    public String rateScore;
    @C17952c(mo34828a = "react_from")
    public String reactFrom;
    @C17952c(mo34828a = "react_origin")
    public String reactOrigin;
    @C17952c(mo34828a = "item_react")
    public int reactSetting;
    @C17952c(mo34828a = "react_view")
    public String reactView;
    @C17952c(mo34828a = "recommend_card_type")
    public int recommendCardType;
    @C17952c(mo34828a = "region")
    public String region;
    @C17952c(mo34828a = "relation_label")
    public RelationDynamicLabel relationLabel;
    @C17952c(mo34828a = "relation_recommend_info")
    public AwemeRelationRecommendModel relationRecommendInfo;
    public String repostFromGroupId;
    public String repostFromUserId;
    public String requestId;
    @C17952c(mo34828a = "room")
    public RoomStruct room;
    @C17952c(mo34828a = "scenario")
    public int scenario;
    @C17952c(mo34828a = "share_info")
    public ShareInfo shareInfo;
    @C17952c(mo34828a = "share_url")
    public String shareUrl;
    public SimplePoiInfoStruct simplePoiInfoStruct;
    public List<C25519e> simplePromotions;
    @C17952c(mo34828a = "sp_sticker")
    public SpecialSticker specialSticker;
    @C17952c(mo34828a = "star_atlas_info")
    public AwemeStarAtlas starAtlasInfo;
    @C17952c(mo34828a = "star_atlas_order_id")
    public long starAtlasOrderId;
    @C17952c(mo34828a = "star_recommend_tag")
    public String starRecommendTag;
    @C17952c(mo34828a = "statistics")
    public AwemeStatistics statistics;
    @C17952c(mo34828a = "status")
    public AwemeStatus status;
    @C17952c(mo34828a = "sticker_detail")
    public C46069d stickerEntranceInfo;
    @C17952c(mo34828a = "stickers")
    public String stickerIDs;
    @C17952c(mo34828a = "stream_url")
    public StreamUrlModel streamUrlModel;
    @C17952c(mo34828a = "take_down_desc")
    public String takeDownDesc;
    @C17952c(mo34828a = "take_down_reason")
    public int takeDownReason;
    @C17952c(mo34828a = "text_extra")
    public List<TextExtraStruct> textExtra;
    @C17952c(mo34828a = "label_top_text")
    public List<AwemeTextLabelModel> textTopLabels;
    @C17952c(mo34828a = "video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
    @C17952c(mo34828a = "title")
    public String title;
    public transient CharSequence transDesc;
    public transient int transDescLines;
    @C17952c(mo34828a = "uniqid_position")
    public List<Position> uniqidPosition;
    @C17952c(mo34828a = "misc_info")
    public String uploadMiscInfoStructStr;
    @C17952c(mo34828a = "user_digged")
    public int userDigg;
    @C17952c(mo34828a = "user_profile_init_info")
    public UserProfileInitInfo userProfileInitInfo;
    @C17952c(mo34828a = "video")
    public Video video;
    @C17952c(mo34828a = "video_control")
    public VideoControl videoControl;
    @C17952c(mo34828a = "video_feed_tag")
    public String videoFeedTag;
    @C17952c(mo34828a = "video_labels")
    public List<AwemeLabelModel> videoLabels;
    @C17952c(mo34828a = "mask_info")
    public VideoMaskInfo videoMaskInfo;
    @C17952c(mo34828a = "video_reply_info")
    public VideoReplyStruct videoReplyStruct;
    @C17952c(mo34828a = "with_promotional_music")
    public boolean withPromotionalMusic;
    @C17952c(mo34828a = "with_survey")
    public boolean withSurvey;
    @C17952c(mo34828a = "xigua_task")
    public XiGuaTaskStruct xiGuaTask;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.Aweme$ConcatAndUploadState */
    public interface ConcatAndUploadState {
    }

    public String getActivityId() {
        return this.activityId;
    }

    public C25516b getActivityPendant() {
        return this.activityPendant;
    }

    public int getAdAwemeSource() {
        return this.adAwemeSource;
    }

    public int getAdDescMaxLines() {
        return this.adDescMaxLines;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public String getAdSchedule() {
        return this.adSchedule;
    }

    public String getAid() {
        return this.aid;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public List<AnchorCommonStruct> getAnchors() {
        return this.anchors;
    }

    public User getAuthor() {
        return this.author;
    }

    public AwemeACLShare getAwemeACLShareInfo() {
        return this.awemeACLShareInfo;
    }

    public AwemeNationalTask getAwemeNationalTask() {
        return this.awemeNationalTask;
    }

    public int getAwemePosition() {
        return this.awemePosition;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public AwemeRiskModel getAwemeRiskModel() {
        return this.awemeRiskModel;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public BannerTip getBannerTip() {
        return this.bannerTip;
    }

    public boolean getCanCache() {
        return this.isCanCache;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public List<CommerceConfigData> getCommerceConfigDataList() {
        return this.commerceConfigDataList;
    }

    public C26132m getCommerceStickerInfo() {
        return this.commerceStickerInfo;
    }

    public C25483a getCommerceVideoAuthInfo() {
        return this.mCommerceVideoAuthInfo;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDate() {
        return this.date;
    }

    public DCDVideoExtra getDcdVideoExtra() {
        return this.dcdVideoExtra;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescLanguage() {
        return this.descLanguage;
    }

    public DescendantsModel getDescendantsModel() {
        return this.descendantsModel;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistributeType() {
        return this.distributeType;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<User> getFamiliarRecommendUser() {
        return this.familiarRecommendUser;
    }

    public long getFeedCount() {
        return this.feedCount;
    }

    public RelationLabelNew getFeedRelationLabel() {
        return this.feedRelationLabel;
    }

    public FloatingCardInfo getFloatingCardInfo() {
        return this.floatingCardInfo;
    }

    public String getForwardCommentId() {
        return this.forwardCommentId;
    }

    public Aweme getForwardItem() {
        return this.forwardItem;
    }

    public String getForwardItemId() {
        return this.forwardItemId;
    }

    public Challenge getFromRawChallenge() {
        return this.fromRawChallenge;
    }

    public GameInfo getGameInfo() {
        return this.gameInfo;
    }

    public HotListStruct getHotListStruct() {
        return this.hotListStruct;
    }

    public HotSearchInfo getHotSearchInfo() {
        return this.hotSearchInfo;
    }

    public HotSearchInfoStruct getHotSearchInfoStruct() {
        return this.hotSearchInfoStruct;
    }

    public String getHotSpot() {
        return this.hotSpot;
    }

    public List<AwemeHybridLabelModel> getHybridLabels() {
        return this.hybridLabels;
    }

    public List<ImageInfo> getImageInfos() {
        return this.imageInfos;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public boolean getIsFromDouPlusGuideAnimate() {
        return this.isFromDouPlusGuideAnimate;
    }

    public boolean getIsPreloadScroll() {
        return this.isPreloadScroll;
    }

    public int getIsTop() {
        return this.isTop;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public String getLabelMusicStarterText() {
        return this.mLabelMusicStarterText;
    }

    public String getLabelOriginAuthorText() {
        return this.mLabelOriginAuthorText;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public UrlModel getLabelTop() {
        return this.labelTop;
    }

    public String getLandingPage() {
        return this.landingPage;
    }

    public C26138s getLinkAdData() {
        return this.linkAdData;
    }

    public C41399b getLinkMatch() {
        return this.linkMatch;
    }

    public LiveAwesomeSplashInfo getLiveAwesomeSplashInfo() {
        return this.mLiveAwesomeSplashInfo;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public String getLiveReaSon() {
        return this.liveReaSon;
    }

    public long getLiveWindowShowTime() {
        return this.liveWindowShowTime;
    }

    public List<LongVideo> getLongVideos() {
        return this.longVideos;
    }

    public C36966e getMicroAppInfo() {
        return this.microAppInfo;
    }

    public MixStruct getMixInfo() {
        return this.mixInfo;
    }

    public HashMap<String, String> getMobParams() {
        return this.mMobParams;
    }

    public Music getMusic() {
        return this.music;
    }

    public UrlModel getMusicStarter() {
        return this.musicStarter;
    }

    public NearbyCardStruct getNearbyCardStruct() {
        return this.nearbyCardStruct;
    }

    public String getNearbyHotLabel() {
        return this.nearbyHotLabel;
    }

    public List<RelationLabelNew> getNewRelationLabel() {
        return this.mNewRelationLabel;
    }

    public String getNewSourceId() {
        return this.newSourceId;
    }

    public String getNewSourceType() {
        return this.newSourceType;
    }

    public List<Position> getNicknamePosition() {
        return this.nicknamePosition;
    }

    public UrlModel getOriginAuthor() {
        return this.originAuthor;
    }

    public List<String> getOriginCommentIds() {
        return this.originCommentIds;
    }

    public int getOriginalPos() {
        return this.originalPos;
    }

    public C39098ad getPoiOpCardStruct() {
        return this.poiOpCardStruct;
    }

    public C39108an getPoiRankCardStruct() {
        return this.poiRankCardStruct;
    }

    public PoiStruct getPoiStruct() {
        return this.poiStruct;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public Preload getPreload() {
        return this.preload;
    }

    public C25518d getPromotionOtherInfo() {
        return this.promotionOtherInfo;
    }

    public int getRate() {
        return this.rate;
    }

    public String getRateScore() {
        return this.rateScore;
    }

    public String getReactFrom() {
        return this.reactFrom;
    }

    public String getReactOrigin() {
        return this.reactOrigin;
    }

    public int getReactSetting() {
        return this.reactSetting;
    }

    public String getReactView() {
        return this.reactView;
    }

    public int getRecommendCardType() {
        return this.recommendCardType;
    }

    public String getRegion() {
        return this.region;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public AwemeRelationRecommendModel getRelationRecommendInfo() {
        return this.relationRecommendInfo;
    }

    public String getRepostFromGroupId() {
        return this.repostFromGroupId;
    }

    public String getRepostFromUserId() {
        return this.repostFromUserId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RoomStruct getRoom() {
        return this.room;
    }

    public RoomFeedCellStruct getRoomFeedCellStruct() {
        return this.mRoomFeedCellStruct;
    }

    public int getScenario() {
        return this.scenario;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public SimplePoiInfoStruct getSimplePoiInfoStruct() {
        return this.simplePoiInfoStruct;
    }

    public SpecialSticker getSpecialSticker() {
        return this.specialSticker;
    }

    public AwemeStarAtlas getStarAtlasInfo() {
        return this.starAtlasInfo;
    }

    public long getStarAtlasOrderId() {
        return this.starAtlasOrderId;
    }

    public String getStarRecommendTag() {
        return this.starRecommendTag;
    }

    public AwemeStatistics getStatistics() {
        return this.statistics;
    }

    public AwemeStatus getStatus() {
        return this.status;
    }

    public C46069d getStickerEntranceInfo() {
        return this.stickerEntranceInfo;
    }

    public String getStickerIDs() {
        return this.stickerIDs;
    }

    public StreamUrlModel getStreamUrlModel() {
        return this.streamUrlModel;
    }

    public String getTakeDownDesc() {
        return this.takeDownDesc;
    }

    public int getTakeDownReason() {
        return this.takeDownReason;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public List<AwemeTextLabelModel> getTextTopLabels() {
        return this.textTopLabels;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public String getTitle() {
        return this.title;
    }

    public CharSequence getTransDesc() {
        return this.transDesc;
    }

    public int getTransDescLines() {
        return this.transDescLines;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public UserProfileInitInfo getUserProfileInitInfo() {
        return this.userProfileInitInfo;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public String getVideoFeedTag() {
        return this.videoFeedTag;
    }

    public List<AwemeLabelModel> getVideoLabels() {
        return this.videoLabels;
    }

    public VideoMaskInfo getVideoMaskInfo() {
        return this.videoMaskInfo;
    }

    public VideoReplyStruct getVideoReplyStruct() {
        return this.videoReplyStruct;
    }

    public XiGuaTaskStruct getXiGuaTask() {
        return this.xiGuaTask;
    }

    public boolean hasVisionSearchEntry() {
        return this.hasVisionSearchEntry;
    }

    public boolean isAdDescHandle() {
        return this.adDescHandle;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public boolean isEffectDesigner() {
        return this.isEffectDesigner;
    }

    public boolean isEnableTopView() {
        return this.enableTopView;
    }

    public boolean isFakeResponse() {
        return this.isFakeResponse;
    }

    public boolean isFamiliar() {
        return this.isFamiliar;
    }

    public boolean isFantasy() {
        return this.isFantasy;
    }

    public boolean isFirstInSpot() {
        return this.isFirstInSpot;
    }

    public boolean isLastInSpot() {
        return this.isLastInSpot;
    }

    public boolean isLawCriticalCountry() {
        return this.lawCriticalCountry;
    }

    public boolean isLiveReplay() {
        return this.isLiveReplay;
    }

    public boolean isPgcShow() {
        return this.isPgcShow;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRelieve() {
        return this.isRelieve;
    }

    public boolean isVr() {
        return this.isVr;
    }

    public boolean isWithPromotionalMusic() {
        return this.withPromotionalMusic;
    }

    public boolean isWithSurvey() {
        return this.withSurvey;
    }

    public boolean needVisionSearchEntry() {
        return this.needVisionSearchEntry;
    }

    public int getFollowStatus() {
        return this.author.getFollowStatus();
    }

    public boolean hasStickerID() {
        if (this.stickerIDs != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.aid.hashCode();
    }

    public boolean isAwemeFromXiGua() {
        if (this.externalType == 1) {
            return true;
        }
        return false;
    }

    public boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public boolean isConcating() {
        if (this.mConcatAndUploadState == 1) {
            return true;
        }
        return false;
    }

    public boolean isHashTag() {
        if (this.isHashTag == 1) {
            return true;
        }
        return false;
    }

    public boolean isLike() {
        if (this.userDigg == 1) {
            return true;
        }
        return false;
    }

    public boolean isPoiRegion() {
        if (this.nearbyCardStruct != null) {
            return true;
        }
        return false;
    }

    public boolean isPreview() {
        if (this.isPreview == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportGameChallenge() {
        if (this.gameInfo != null) {
            return true;
        }
        return false;
    }

    public boolean isTop() {
        if (this.isTop == 1) {
            return true;
        }
        return false;
    }

    public boolean needPreloadAdLink() {
        if (this.adLinkType == 1) {
            return true;
        }
        return false;
    }

    public String getAuthorUid() {
        if (this.author != null) {
            return this.author.getUid();
        }
        return "";
    }

    public AwemeControl getAwemeControl() {
        if (this.awemeControl == null) {
            this.awemeControl = new AwemeControl();
        }
        return this.awemeControl;
    }

    public String getAwemeRawAdIdStr() {
        if (this.awemeRawAd != null) {
            return this.awemeRawAd.getCreativeIdStr();
        }
        return "";
    }

    public int getDownloadStatus() {
        if (this.status == null) {
            return 0;
        }
        return this.status.getDownloadStatus();
    }

    public CharSequence getEllipsizeTransDesc() {
        if (TextUtils.isEmpty(this.ellipsizeTransDesc)) {
            return getTransDesc();
        }
        return this.ellipsizeTransDesc;
    }

    public int getEnterpriseType() {
        if (this.author == null) {
            return 0;
        }
        return this.author.getCommerceUserLevel();
    }

    public String getForwardGroupId() {
        if (isMultiForwardAweme()) {
            return this.preForwardId;
        }
        return "";
    }

    public String getMixId() {
        if (this.mixInfo != null) {
            return this.mixInfo.mixId;
        }
        return "";
    }

    public OcrLocation getOcrLocation() {
        return getUploadMiscInfoStruct().getOcrLocation();
    }

    public String getRecallType() {
        if (this.promotionOtherInfo == null) {
            return "";
        }
        return this.promotionOtherInfo.getRecallReason();
    }

    public String getReviewDetailUrl() {
        if (this.status == null) {
            return "";
        }
        return this.status.getReviewDetailUrl();
    }

    public String getSecAuthorUid() {
        if (this.author != null) {
            return this.author.getSecUid();
        }
        return "";
    }

    public TVStationRoomStruct getTvRoomStruct() {
        if (this.room != null) {
            return this.room.tvStationRoomStruct;
        }
        return null;
    }

    public C43895j getUploadMiscInfoStruct() {
        if (this.cacheAvUploadMiscInfoStruct == null) {
            this.cacheAvUploadMiscInfoStruct = C43895j.createStruct(this.uploadMiscInfoStructStr);
        }
        return this.cacheAvUploadMiscInfoStruct;
    }

    public boolean hasPromotion() {
        if (getPromotion() != null) {
            return true;
        }
        return false;
    }

    public boolean isAd() {
        if (!this.isAd || this.awemeRawAd == null) {
            return false;
        }
        return true;
    }

    public boolean isAwemeFromDongCheDi() {
        if (this.externalType == 2) {
            return true;
        }
        return false;
    }

    public boolean isDelete() {
        if (this.status == null || !this.status.isDelete()) {
            return false;
        }
        return true;
    }

    public boolean isForwardAweme() {
        if (this.awemeType == 13) {
            return true;
        }
        return false;
    }

    public boolean isGreenScreenSticker() {
        if (getUploadMiscInfoStruct().greenScreen == 1) {
            return true;
        }
        return false;
    }

    public boolean isHotListAweme() {
        if (this.hotListStruct == null || this.hotListStruct.getType() == 0) {
            return false;
        }
        return true;
    }

    public boolean isImage() {
        if (this.awemeType == 2) {
            return true;
        }
        return false;
    }

    public boolean isInReviewing() {
        if (this.status == null || !this.status.isInReviewing()) {
            return false;
        }
        return true;
    }

    public boolean isLive() {
        if (this.awemeType == 101) {
            return true;
        }
        return false;
    }

    public boolean isOrderShareRecommend() {
        if (this.promotionOtherInfo == null) {
            return false;
        }
        return this.promotionOtherInfo.isOrderShareRecommend();
    }

    public boolean isPoiOperate() {
        if (this.awemeType == 3002) {
            return true;
        }
        return false;
    }

    public boolean isPoiRank() {
        if (this.awemeType == 3001) {
            return true;
        }
        return false;
    }

    public boolean isPrivate() {
        if (this.status == null || this.status.getPrivateStatus() != 1) {
            return false;
        }
        return true;
    }

    public boolean isProhibited() {
        if (this.status == null || !this.status.isProhibited()) {
            return false;
        }
        return true;
    }

    public boolean isProhibitedAndShouldTell() {
        if (this.status == null || !this.status.isProhibitedAndShouldTell()) {
            return false;
        }
        return true;
    }

    public boolean isPublic() {
        if (this.status == null || this.status.getPrivateStatus() != 0) {
            return false;
        }
        return true;
    }

    public boolean isReviewed() {
        if (this.status == null || !this.status.isReviewed()) {
            return false;
        }
        return true;
    }

    public boolean isSelfSee() {
        if (this.status == null || !this.status.isSelfSee()) {
            return false;
        }
        return true;
    }

    public boolean isSelfSeeAndShouldTell() {
        if (this.status == null || !this.status.isSelfSeeAndShouldTell()) {
            return false;
        }
        return true;
    }

    public boolean isUploadFailure() {
        if (this.mConcatAndUploadState == 3) {
            return true;
        }
        return false;
    }

    public boolean isUploading() {
        if (this.mConcatAndUploadState == 2) {
            return true;
        }
        return false;
    }

    public boolean isUserPost() {
        if (this.awemeType == 33 || this.adAwemeSource == 1) {
            return true;
        }
        return false;
    }

    public boolean shouldShowReviewStatus() {
        if (this.status == null || !this.status.shouldShowReviewStatus()) {
            return false;
        }
        return true;
    }

    public C26129j getAdCommentStruct() {
        if (getAwemeRawAd() != null) {
            return getAwemeRawAd().getCommentArea();
        }
        return null;
    }

    public String getFromRequestId() {
        if (getAwemeType() != 13) {
            return getRequestId();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getRequestId();
        }
        return "";
    }

    public String getFromUserId() {
        if (getAwemeType() != 13) {
            return getAuthorUid();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getAuthorUid();
        }
        return "";
    }

    public C25519e getPromotion() {
        if (getPromotions().isEmpty()) {
            return null;
        }
        return (C25519e) getPromotions().get(0);
    }

    public List<String> getRawAdClickTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel clickTrackUrlList = getAwemeRawAd().getClickTrackUrlList();
        if (clickTrackUrlList == null) {
            return null;
        }
        return clickTrackUrlList.getUrlList();
    }

    public List<String> getRawAdEffectivePlayTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel effectivePlayTrackUrlList = getAwemeRawAd().getEffectivePlayTrackUrlList();
        if (effectivePlayTrackUrlList == null) {
            return null;
        }
        return effectivePlayTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayOverTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel playOverTrackUrlList = getAwemeRawAd().getPlayOverTrackUrlList();
        if (playOverTrackUrlList == null) {
            return null;
        }
        return playOverTrackUrlList.getUrlList();
    }

    public List<String> getRawAdPlayTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel playTrackUrlList = getAwemeRawAd().getPlayTrackUrlList();
        if (playTrackUrlList == null) {
            return null;
        }
        return playTrackUrlList.getUrlList();
    }

    public List<String> getRawAdShowTrackUrlList() {
        if (getAwemeRawAd() == null) {
            return null;
        }
        UrlModel trackUrlList = getAwemeRawAd().getTrackUrlList();
        if (trackUrlList == null) {
            return null;
        }
        return trackUrlList.getUrlList();
    }

    public boolean hasValidPoi() {
        if (this.poiStruct == null || TextUtils.isEmpty(this.poiStruct.poiId)) {
            return false;
        }
        return true;
    }

    public boolean isAppAd() {
        if (!isAd() || !this.awemeRawAd.isAppAd()) {
            return false;
        }
        return true;
    }

    public boolean isHotSearchAweme() {
        if (this.hotSearchInfo == null || TextUtils.isEmpty(this.hotSearchInfo.getSentence())) {
            return false;
        }
        return true;
    }

    public boolean isHotVideoAweme() {
        if (this.hotSearchInfo == null || this.hotSearchInfo.getVideoRank() <= 0 || this.hotSearchInfo.getVideoRankVV() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isMixAweme() {
        if (this.mixInfo == null || TextUtils.isEmpty(this.mixInfo.mixId)) {
            return false;
        }
        return true;
    }

    public boolean withFakeUser() {
        if (this.author == null || this.author.isAdFake()) {
            return true;
        }
        return false;
    }

    private boolean commerceVideoTypeAllowDuetReact() {
        if (this.awemeType == 1 || this.awemeType == 29 || this.awemeType == 30 || this.awemeType == 32 || this.awemeType == 33 || this.awemeType == 201) {
            return true;
        }
        return false;
    }

    private boolean isMultiForwardAweme() {
        if (C47917gi.m103681a((Collection<? extends T>) this.textExtra)) {
            return false;
        }
        for (TextExtraStruct type : this.textExtra) {
            if (type.getType() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean canDuetVideoType() {
        if (this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 52 || this.awemeType == 58 || this.awemeType == 54 || this.awemeType == 53 || this.awemeType == 55 || this.awemeType == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canReactVideoType() {
        if (this.awemeType == 52 || this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 58 || this.awemeType == 54 || this.awemeType == 53 || this.awemeType == 55 || this.awemeType == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public boolean canStitchVideoType() {
        if (this.awemeType == 0 || this.awemeType == 51 || this.awemeType == 52 || this.awemeType == 54 || this.awemeType == 53 || this.awemeType == 55 || this.awemeType == 56 || commerceVideoTypeAllowDuetReact()) {
            return true;
        }
        return false;
    }

    public ItemCommentEggGroup getCommentEggGroup() {
        if (this.commerceConfigDataList != null && !this.commerceConfigDataList.isEmpty()) {
            for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
                if (commerceConfigData.type == 4) {
                    return commerceConfigData.itemCommentEggGroup;
                }
            }
        }
        return null;
    }

    public ItemLikeEggData getCommerceAdLikeDigg() {
        if (this.commerceConfigDataList != null && !this.commerceConfigDataList.isEmpty()) {
            for (CommerceConfigData commerceConfigData : this.commerceConfigDataList) {
                if (commerceConfigData.type == 1 && commerceConfigData.itemLikeEggData != null) {
                    return commerceConfigData.itemLikeEggData;
                }
            }
        }
        return null;
    }

    public UrlModel getDynamicPreferredCover() {
        if (this.video == null) {
            if (this.imageInfos == null || this.imageInfos.isEmpty()) {
                return null;
            }
            return ((ImageInfo) this.imageInfos.get(0)).labelThumb;
        } else if (this.video.dynamicCover != null) {
            return this.video.dynamicCover;
        } else {
            if (this.video.cover != null) {
                return this.video.cover;
            }
            return null;
        }
    }

    public CharSequence getEllipsizeDesc() {
        if (this.ellipsizeDesc == null || TextUtils.isEmpty((CharSequence) this.ellipsizeDesc.get())) {
            return getDesc();
        }
        return (CharSequence) this.ellipsizeDesc.get();
    }

    public String getFirstPlayAddr() {
        if (this.video != null) {
            VideoUrlModel properPlayAddr = this.video.getProperPlayAddr();
            if (properPlayAddr != null && !C47917gi.m103681a((Collection<? extends T>) properPlayAddr.getUrlList())) {
                return (String) properPlayAddr.getUrlList().get(0);
            }
        }
        return null;
    }

    public String getForwardUserId() {
        String str = "";
        if (C47917gi.m103681a((Collection<? extends T>) this.textExtra)) {
            return "";
        }
        for (TextExtraStruct textExtraStruct : this.textExtra) {
            if (textExtraStruct.getType() == 2) {
                return textExtraStruct.getUserId();
            }
        }
        return str;
    }

    public String getFromGroupId() {
        if (getAwemeType() != 13) {
            return getAid();
        }
        if (getForwardItem() != null) {
            return getForwardItem().getAid();
        }
        return getForwardItemId();
    }

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            if (this.mRoomFeedCellStruct != null && this.mRoomFeedCellStruct.getNewLiveRoomData() != null) {
                return this.mRoomFeedCellStruct.getNewLiveRoomData();
            }
            if (this.newLiveRoomData != null) {
                this.newLiveRoomData.init();
                return this.newLiveRoomData.roomStructConstructor();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public CharSequence getProcessedDesc() {
        if (this.processedDesc == null || TextUtils.isEmpty((CharSequence) this.processedDesc.get())) {
            return getDesc();
        }
        return (CharSequence) this.processedDesc.get();
    }

    public List<C25519e> getPromotions() {
        ArrayList arrayList;
        if (this.simplePromotions != null) {
            return this.simplePromotions;
        }
        if (this.anchorInfo == null || this.anchorInfo.getType() == null || this.anchorInfo.getType().intValue() != 3 || TextUtils.isEmpty(this.anchorInfo.getExtra())) {
            this.simplePromotions = new ArrayList();
        } else {
            try {
                C25519e[] eVarArr = (C25519e[]) new C17971f().mo34884a(this.anchorInfo.getExtra(), C25519e[].class);
                if (eVarArr == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(Arrays.asList(eVarArr));
                }
                this.simplePromotions = arrayList;
            } catch (Exception unused) {
                this.simplePromotions = new ArrayList();
            }
        }
        return this.simplePromotions;
    }

    public void convertChallengeToHashTag() {
        String str;
        List challengeList2 = getChallengeList();
        if (challengeList2 != null && !challengeList2.isEmpty()) {
            Challenge challenge = (Challenge) challengeList2.get(0);
            if (challenge != null && !TextUtils.isEmpty(challenge.getChallengeName())) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(challenge.getChallengeName());
                sb.append(" ");
                TextExtraStruct textExtraStruct = new TextExtraStruct();
                textExtraStruct.setType(1);
                textExtraStruct.setHashTagName(challenge.getChallengeName());
                textExtraStruct.setStart(0);
                textExtraStruct.setCid(challenge.getCid());
                textExtraStruct.setEnd(sb.length());
                if (getDesc() == null) {
                    str = "";
                } else {
                    str = getDesc();
                }
                StringBuilder sb2 = new StringBuilder("#");
                sb2.append(challenge.getChallengeName());
                if (!str.contains(sb2.toString())) {
                    sb.append(getDesc());
                    setDesc(sb.toString());
                    int end = textExtraStruct.getEnd() - textExtraStruct.getStart();
                    List textExtra2 = getTextExtra();
                    if (textExtra2 != null) {
                        for (TextExtraStruct textExtraStruct2 : getTextExtra()) {
                            textExtraStruct2.setStart(textExtraStruct2.getStart() + end);
                            textExtraStruct2.setEnd(textExtraStruct2.getEnd() + end);
                        }
                    } else {
                        textExtra2 = new ArrayList();
                        setTextExtra(textExtra2);
                    }
                    textExtra2.add(textExtraStruct);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Aweme{aid='");
        sb.append(this.aid);
        sb.append('\'');
        sb.append(", desc='");
        sb.append(this.desc);
        sb.append('\'');
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", challengeList=");
        sb.append(this.challengeList);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", shareUrl='");
        sb.append(this.shareUrl);
        sb.append('\'');
        sb.append(", userDigg=");
        sb.append(this.userDigg);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", extra='");
        sb.append(this.extra);
        sb.append('\'');
        sb.append(", rate=");
        sb.append(this.rate);
        sb.append(", shareInfo=");
        sb.append(this.shareInfo);
        sb.append(", labelLarge=");
        sb.append(this.labelLarge);
        sb.append(", labelThumb=");
        sb.append(this.labelThumb);
        sb.append(", textExtra=");
        sb.append(this.textExtra);
        sb.append(", isTop=");
        sb.append(this.isTop);
        sb.append(", labelTop=");
        sb.append(this.labelTop);
        sb.append(", originalPos=");
        sb.append(this.originalPos);
        sb.append(", isAd=");
        sb.append(this.isAd);
        sb.append(", awemeType=");
        sb.append(this.awemeType);
        sb.append(", awemeRawAd=");
        sb.append(this.awemeRawAd);
        sb.append(", specialSticker=");
        sb.append(this.specialSticker);
        sb.append(", videoLabels=");
        sb.append(this.videoLabels);
        sb.append(", cmtSwt=");
        sb.append(this.cmtSwt);
        sb.append(", adSchedule=");
        sb.append(this.adSchedule);
        sb.append(", simplePromotions=");
        sb.append(this.simplePromotions);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", recommendCardType=");
        sb.append(this.recommendCardType);
        sb.append('}');
        return sb.toString();
    }

    public Aweme clone() {
        AwemeStatistics awemeStatistics;
        Aweme aweme = new Aweme();
        aweme.aid = this.aid;
        aweme.commerceConfigDataList = this.commerceConfigDataList;
        aweme.starAtlasOrderId = this.starAtlasOrderId;
        aweme.desc = this.desc;
        aweme.createTime = this.createTime;
        aweme.author = this.author;
        aweme.music = this.music;
        aweme.challengeList = this.challengeList;
        aweme.video = this.video;
        aweme.longVideos = this.longVideos;
        aweme.shareUrl = this.shareUrl;
        aweme.userDigg = this.userDigg;
        AwemeStatus awemeStatus = null;
        if (this.statistics == null) {
            awemeStatistics = null;
        } else {
            awemeStatistics = this.statistics.clone();
        }
        aweme.statistics = awemeStatistics;
        if (this.status != null) {
            awemeStatus = this.status.clone();
        }
        aweme.status = awemeStatus;
        aweme.reactFrom = this.reactFrom;
        aweme.reactOrigin = this.reactOrigin;
        aweme.reactView = this.reactView;
        aweme.commerceStickerInfo = this.commerceStickerInfo;
        aweme.videoControl = this.videoControl;
        aweme.distributeType = this.distributeType;
        aweme.extra = this.extra;
        aweme.rate = this.rate;
        aweme.shareInfo = this.shareInfo;
        aweme.textVideoLabels = this.textVideoLabels;
        aweme.textTopLabels = this.textTopLabels;
        aweme.videoLabels = this.videoLabels;
        aweme.isHashTag = this.isHashTag;
        aweme.awemeType = this.awemeType;
        aweme.adAwemeSource = this.adAwemeSource;
        aweme.awemeRawAd = this.awemeRawAd;
        aweme.specialSticker = this.specialSticker;
        aweme.poiStruct = this.poiStruct;
        aweme.relationLabel = this.relationLabel;
        aweme.cmtSwt = this.cmtSwt;
        aweme.streamUrlModel = this.streamUrlModel;
        aweme.title = this.title;
        aweme.isPgcShow = this.isPgcShow;
        aweme.imageInfos = this.imageInfos;
        aweme.awemeRiskModel = this.awemeRiskModel;
        aweme.descendantsModel = this.descendantsModel;
        aweme.collectStatus = this.collectStatus;
        aweme.scenario = this.scenario;
        aweme.lawCriticalCountry = this.lawCriticalCountry;
        aweme.canPlay = this.canPlay;
        aweme.commentSetting = this.commentSetting;
        aweme.reactSetting = this.reactSetting;
        aweme.duetSetting = this.duetSetting;
        aweme.simplePromotions = this.simplePromotions;
        aweme.activityPendant = this.activityPendant;
        aweme.promotionOtherInfo = this.promotionOtherInfo;
        aweme.position = this.position;
        aweme.uniqidPosition = this.uniqidPosition;
        aweme.nicknamePosition = this.nicknamePosition;
        aweme.room = this.room;
        aweme.stickerIDs = this.stickerIDs;
        aweme.uploadMiscInfoStructStr = this.uploadMiscInfoStructStr;
        aweme.takeDownReason = this.takeDownReason;
        aweme.takeDownDesc = this.takeDownDesc;
        aweme.forwardItem = this.forwardItem;
        aweme.forwardItemId = this.forwardItemId;
        aweme.forwardCommentId = this.forwardCommentId;
        aweme.preForwardId = this.preForwardId;
        aweme.preventDownload = this.preventDownload;
        aweme.region = this.region;
        aweme.microAppInfo = this.microAppInfo;
        aweme.gameInfo = this.gameInfo;
        aweme.isProhibited = this.isProhibited;
        aweme.hotSearchInfo = this.hotSearchInfo;
        aweme.hotListStruct = this.hotListStruct;
        aweme.downloadWithoutWatermark = this.downloadWithoutWatermark;
        aweme.linkAdData = this.linkAdData;
        aweme.adLinkType = this.adLinkType;
        aweme.awemeNationalTask = this.awemeNationalTask;
        aweme.enableTopView = this.enableTopView;
        aweme.isCanCache = this.isCanCache;
        aweme.isPreloadScroll = this.isPreloadScroll;
        aweme.isFakeResponse = this.isFakeResponse;
        aweme.repostFromGroupId = this.repostFromGroupId;
        aweme.repostFromUserId = this.repostFromUserId;
        aweme.date = this.date;
        aweme.labelLarge = this.labelLarge;
        aweme.labelPrivate = this.labelPrivate;
        aweme.labelThumb = this.labelThumb;
        aweme.textExtra = this.textExtra;
        aweme.isTop = this.isTop;
        aweme.labelTop = this.labelTop;
        aweme.originAuthor = this.originAuthor;
        aweme.musicStarter = this.musicStarter;
        aweme.mLabelOriginAuthorText = this.mLabelOriginAuthorText;
        aweme.mLabelMusicStarterText = this.mLabelMusicStarterText;
        aweme.originalPos = this.originalPos;
        aweme.distance = this.distance;
        aweme.landingPage = this.landingPage;
        aweme.isAd = this.isAd;
        aweme.isVr = this.isVr;
        aweme.isRelieve = this.isRelieve;
        aweme.adSchedule = this.adSchedule;
        aweme.xiGuaTask = this.xiGuaTask;
        aweme.preload = this.preload;
        aweme.feedCount = this.feedCount;
        aweme.isEffectDesigner = this.isEffectDesigner;
        aweme.withPromotionalMusic = this.withPromotionalMusic;
        aweme.stickerEntranceInfo = this.stickerEntranceInfo;
        aweme.anchors = this.anchors;
        aweme.starRecommendTag = this.starRecommendTag;
        aweme.adOrderId = this.adOrderId;
        aweme.interactStickerStructs = this.interactStickerStructs;
        aweme.starAtlasInfo = this.starAtlasInfo;
        aweme.descLanguage = this.descLanguage;
        aweme.floatingCardInfo = this.floatingCardInfo;
        aweme.originCommentIds = this.originCommentIds;
        aweme.requestId = this.requestId;
        aweme.awemePosition = this.awemePosition;
        aweme.mConcatAndUploadState = this.mConcatAndUploadState;
        aweme.awemeControl = this.awemeControl;
        aweme.hasVisionSearchEntry = this.hasVisionSearchEntry;
        aweme.anchor = this.anchor;
        aweme.mCommerceVideoAuthInfo = this.mCommerceVideoAuthInfo;
        aweme.isPreview = this.isPreview;
        aweme.nearbyHotLabel = this.nearbyHotLabel;
        aweme.videoReplyStruct = this.videoReplyStruct;
        aweme.linkMatch = this.linkMatch;
        aweme.liveWindowShowTime = this.liveWindowShowTime;
        aweme.hybridLabels = this.hybridLabels;
        aweme.newLiveRoomData = this.newLiveRoomData;
        aweme.relationRecommendInfo = this.relationRecommendInfo;
        aweme.recommendCardType = this.recommendCardType;
        aweme.withSurvey = this.withSurvey;
        aweme.isLiveReplay = this.isLiveReplay;
        return aweme;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdAwemeSource(int i) {
        this.adAwemeSource = i;
    }

    public void setAdDescHandle(boolean z) {
        this.adDescHandle = z;
    }

    public void setAdDescMaxLines(int i) {
        this.adDescMaxLines = i;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAdSchedule(String str) {
        this.adSchedule = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAnchor(Anchor anchor2) {
        this.anchor = anchor2;
    }

    public void setAnchorInfo(AnchorInfo anchorInfo2) {
        this.anchorInfo = anchorInfo2;
    }

    public void setAnchors(List<AnchorCommonStruct> list) {
        this.anchors = list;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAwemeACLShareInfo(AwemeACLShare awemeACLShare) {
        this.awemeACLShareInfo = awemeACLShare;
    }

    public void setAwemeControl(AwemeControl awemeControl2) {
        this.awemeControl = awemeControl2;
    }

    public void setAwemeNationalTask(AwemeNationalTask awemeNationalTask2) {
        this.awemeNationalTask = awemeNationalTask2;
    }

    public void setAwemePosition(int i) {
        this.awemePosition = i;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd2) {
        this.awemeRawAd = awemeRawAd2;
    }

    public void setAwemeRiskModel(AwemeRiskModel awemeRiskModel2) {
        this.awemeRiskModel = awemeRiskModel2;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setBannerTip(BannerTip bannerTip2) {
        this.bannerTip = bannerTip2;
    }

    public void setCanCache(boolean z) {
        this.isCanCache = z;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceConfigDataList(List<CommerceConfigData> list) {
        this.commerceConfigDataList = list;
    }

    public void setCommerceStickerInfo(C26132m mVar) {
        this.commerceStickerInfo = mVar;
    }

    public void setConcatAndUploadState(int i) {
        this.mConcatAndUploadState = i;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDate(long j) {
        this.date = j;
    }

    public void setDcdVideoExtra(DCDVideoExtra dCDVideoExtra) {
        this.dcdVideoExtra = dCDVideoExtra;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescLanguage(String str) {
        this.descLanguage = str;
    }

    public void setDescendantsModel(DescendantsModel descendantsModel2) {
        this.descendantsModel = descendantsModel2;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistributeType(int i) {
        this.distributeType = i;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setEffectDesigner(boolean z) {
        this.isEffectDesigner = z;
    }

    public void setEllipsizeTransDesc(CharSequence charSequence) {
        this.ellipsizeTransDesc = charSequence;
    }

    public void setEnableTopView(boolean z) {
        this.enableTopView = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFakeResponse(boolean z) {
        this.isFakeResponse = z;
    }

    public void setFamiliar(boolean z) {
        this.isFamiliar = z;
    }

    public void setFamiliarRecommendUser(List<User> list) {
        this.familiarRecommendUser = list;
    }

    public Aweme setFantasy(boolean z) {
        this.isFantasy = z;
        return this;
    }

    public void setFeedCount(long j) {
        this.feedCount = j;
    }

    public void setFeedRelationLabel(RelationLabelNew relationLabelNew) {
        this.feedRelationLabel = relationLabelNew;
    }

    public void setFirstInSpot(boolean z) {
        this.isFirstInSpot = z;
    }

    public void setFloatingCardInfo(FloatingCardInfo floatingCardInfo2) {
        this.floatingCardInfo = floatingCardInfo2;
    }

    public void setForwardCommentId(String str) {
        this.forwardCommentId = str;
    }

    public void setForwardItem(Aweme aweme) {
        this.forwardItem = aweme;
    }

    public void setForwardItemId(String str) {
        this.forwardItemId = str;
    }

    public void setFromRawChallenge(Challenge challenge) {
        this.fromRawChallenge = challenge;
    }

    public void setGameInfo(GameInfo gameInfo2) {
        this.gameInfo = gameInfo2;
    }

    public void setHasVisionSearchEntry(boolean z) {
        this.hasVisionSearchEntry = z;
    }

    public void setHashTag(int i) {
        this.isHashTag = i;
    }

    public Aweme setHotListStruct(HotListStruct hotListStruct2) {
        this.hotListStruct = hotListStruct2;
        return this;
    }

    public void setHotSearchInfo(HotSearchInfo hotSearchInfo2) {
        this.hotSearchInfo = hotSearchInfo2;
    }

    public Aweme setHotSearchInfoStruct(HotSearchInfoStruct hotSearchInfoStruct2) {
        this.hotSearchInfoStruct = hotSearchInfoStruct2;
        return this;
    }

    public Aweme setHotSpot(String str) {
        this.hotSpot = str;
        return this;
    }

    public void setHybridLabels(List<AwemeHybridLabelModel> list) {
        this.hybridLabels = list;
    }

    public void setImageInfos(List<ImageInfo> list) {
        this.imageInfos = list;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setIsFromDouPlusGuideAnimate(boolean z) {
        this.isFromDouPlusGuideAnimate = z;
    }

    public void setIsPreloadScroll(boolean z) {
        this.isPreloadScroll = z;
    }

    public void setIsTop(int i) {
        this.isTop = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelMusicStarterText(String str) {
        this.mLabelMusicStarterText = str;
    }

    public void setLabelOriginAuthorText(String str) {
        this.mLabelOriginAuthorText = str;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLabelTop(UrlModel urlModel) {
        this.labelTop = urlModel;
    }

    public void setLandingPage(String str) {
        this.landingPage = str;
    }

    public void setLastInSpot(boolean z) {
        this.isLastInSpot = z;
    }

    public void setLawCriticalCountry(boolean z) {
        this.lawCriticalCountry = z;
    }

    public void setLike(boolean z) {
        this.userDigg = z ? 1 : 0;
    }

    public void setLinkAdData(C26138s sVar) {
        this.linkAdData = sVar;
    }

    public void setLinkMatch(C41399b bVar) {
        this.linkMatch = bVar;
    }

    public void setLiveAwesomeSplashInfo(LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        this.mLiveAwesomeSplashInfo = liveAwesomeSplashInfo;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public void setLiveReaSon(String str) {
        this.liveReaSon = str;
    }

    public void setLiveReplay(boolean z) {
        this.isLiveReplay = z;
    }

    public void setLiveWindowShowTime(long j) {
        this.liveWindowShowTime = j;
    }

    public void setLongVideos(List<LongVideo> list) {
        this.longVideos = list;
    }

    public void setMicroAppInfo(C36966e eVar) {
        this.microAppInfo = eVar;
    }

    public void setMixInfo(MixStruct mixStruct) {
        this.mixInfo = mixStruct;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setMusicStarter(UrlModel urlModel) {
        this.musicStarter = urlModel;
    }

    public void setNearbyCardStruct(NearbyCardStruct nearbyCardStruct2) {
        this.nearbyCardStruct = nearbyCardStruct2;
    }

    public void setNearbyHotLabel(String str) {
        this.nearbyHotLabel = str;
    }

    public void setNeedVisionSearchEntry(boolean z) {
        this.needVisionSearchEntry = z;
    }

    public void setNewRelationLabel(List<RelationLabelNew> list) {
        this.mNewRelationLabel = list;
    }

    public void setNewSourceId(String str) {
        this.newSourceId = str;
    }

    public void setNewSourceType(String str) {
        this.newSourceType = str;
    }

    public void setNicknamePosition(List<Position> list) {
        this.nicknamePosition = list;
    }

    public void setOriginAuthor(UrlModel urlModel) {
        this.originAuthor = urlModel;
    }

    public void setOriginCommentIds(List<String> list) {
        this.originCommentIds = list;
    }

    public void setOriginalPos(int i) {
        this.originalPos = i;
    }

    public void setPgcShow(boolean z) {
        this.isPgcShow = z;
    }

    public void setPoiOpCardStruct(C39098ad adVar) {
        this.poiOpCardStruct = adVar;
    }

    public void setPoiRankCardStruct(C39108an anVar) {
        this.poiRankCardStruct = anVar;
    }

    public void setPoiStruct(PoiStruct poiStruct2) {
        this.poiStruct = poiStruct2;
    }

    public void setPosition(List<Position> list) {
        this.position = list;
    }

    public void setPreload(Preload preload2) {
        this.preload = preload2;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPromotionOtherInfo(C25518d dVar) {
        this.promotionOtherInfo = dVar;
    }

    public void setRate(int i) {
        this.rate = i;
    }

    public void setRateScore(String str) {
        this.rateScore = str;
    }

    public void setReactFrom(String str) {
        this.reactFrom = str;
    }

    public void setReactOrigin(String str) {
        this.reactOrigin = str;
    }

    public void setReactSetting(int i) {
        this.reactSetting = i;
    }

    public void setReactView(String str) {
        this.reactView = str;
    }

    public void setRecommendCardType(int i) {
        this.recommendCardType = i;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setRelationRecommendInfo(AwemeRelationRecommendModel awemeRelationRecommendModel) {
        this.relationRecommendInfo = awemeRelationRecommendModel;
    }

    public void setRelieve(boolean z) {
        this.isRelieve = z;
    }

    public void setRepostFromGroupId(String str) {
        this.repostFromGroupId = str;
    }

    public void setRepostFromUserId(String str) {
        this.repostFromUserId = str;
    }

    public void setRoom(RoomStruct roomStruct) {
        this.room = roomStruct;
    }

    public void setRoomFeedCellStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.mRoomFeedCellStruct = roomFeedCellStruct;
    }

    public void setScenario(int i) {
        this.scenario = i;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSimplePoiInfoStruct(SimplePoiInfoStruct simplePoiInfoStruct2) {
        this.simplePoiInfoStruct = simplePoiInfoStruct2;
    }

    public void setSpecialSticker(SpecialSticker specialSticker2) {
        this.specialSticker = specialSticker2;
    }

    public void setStarAtlasInfo(AwemeStarAtlas awemeStarAtlas) {
        this.starAtlasInfo = awemeStarAtlas;
    }

    public void setStarAtlasOrderId(long j) {
        this.starAtlasOrderId = j;
    }

    public void setStarRecommendTag(String str) {
        this.starRecommendTag = str;
    }

    public void setStatistics(AwemeStatistics awemeStatistics) {
        this.statistics = awemeStatistics;
    }

    public void setStatus(AwemeStatus awemeStatus) {
        this.status = awemeStatus;
    }

    public void setStickerEntranceInfo(C46069d dVar) {
        this.stickerEntranceInfo = dVar;
    }

    public void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public void setStreamUrlModel(StreamUrlModel streamUrlModel2) {
        this.streamUrlModel = streamUrlModel2;
    }

    public void setTakeDownDesc(String str) {
        this.takeDownDesc = str;
    }

    public void setTakeDownReason(int i) {
        this.takeDownReason = i;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextTopLabels(List<AwemeTextLabelModel> list) {
        this.textTopLabels = list;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTransDesc(CharSequence charSequence) {
        this.transDesc = charSequence;
    }

    public void setTransDescLines(int i) {
        this.transDescLines = i;
    }

    public void setUniqidPosition(List<Position> list) {
        this.uniqidPosition = list;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setUserProfileInitInfo(UserProfileInitInfo userProfileInitInfo2) {
        this.userProfileInitInfo = userProfileInitInfo2;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }

    public void setVideoFeedTag(String str) {
        this.videoFeedTag = str;
    }

    public void setVideoLabels(List<AwemeLabelModel> list) {
        this.videoLabels = list;
    }

    public void setVideoMaskInfo(VideoMaskInfo videoMaskInfo2) {
        this.videoMaskInfo = videoMaskInfo2;
    }

    public void setWithSurvey(boolean z) {
        this.withSurvey = z;
    }

    public void setXiGuaTask(XiGuaTaskStruct xiGuaTaskStruct) {
        this.xiGuaTask = xiGuaTaskStruct;
    }

    public void setAwemeNationalTask(VideoReplyStruct videoReplyStruct2) {
        this.videoReplyStruct = videoReplyStruct2;
    }

    public static Aweme newDateSection(long j) {
        Aweme aweme = new Aweme();
        aweme.setAid("");
        aweme.setDate(j);
        return aweme;
    }

    public void setEllipsizeDesc(CharSequence charSequence) {
        if (charSequence == null) {
            this.ellipsizeDesc = null;
        } else {
            this.ellipsizeDesc = new WeakReference<>(charSequence);
        }
    }

    public void setProcessedDesc(CharSequence charSequence) {
        if (this.ellipsizeDesc == null) {
            this.processedDesc = null;
        } else {
            this.processedDesc = new WeakReference<>(charSequence);
        }
    }

    public void setNewLiveRoomDataStr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.newLiveRoomData = (NewLiveRoomStruct) C36061c.m81417a().mo34884a(str, NewLiveRoomStruct.class);
        }
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (isForwardAweme() && this.forwardItem != null) {
            this.forwardItem.setRequestId(str);
        }
        if (this.author != null) {
            this.author.setRequestId(str);
        }
    }

    public void setVr(boolean z) {
        this.isVr = z;
        if (this.video != null) {
            setVr(this.video.getPlayAddrH264(), z);
            setVr(this.video.getPlayAddrH265(), z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Aweme)) {
            return false;
        }
        Aweme aweme = (Aweme) obj;
        if (!TextUtils.equals(this.aid, aweme.aid) || this.userDigg != aweme.userDigg || !C23722i.m58215a(this.status, aweme.status) || !C23722i.m58215a(this.statistics, aweme.statistics)) {
            return false;
        }
        return true;
    }

    public List<String> getRawAdPlayNodeTrackUrlList(int i) {
        if (getAwemeRawAd() == null) {
            return null;
        }
        List<C26119d> adNodeTrackUrlList = getAwemeRawAd().getAdNodeTrackUrlList();
        if (C47917gi.m103681a((Collection<? extends T>) adNodeTrackUrlList)) {
            return null;
        }
        for (C26119d dVar : adNodeTrackUrlList) {
            if (dVar.percent == i) {
                return dVar.urlList;
            }
        }
        return null;
    }

    public void updateSameAweme(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            String str = aweme.aid;
            String str2 = this.aid;
            C52711k.m112240b(str2, "s2");
            if ((!C47917gi.m103680a(str) || !C47917gi.m103680a(str2)) && (str == null || !C52711k.m112239a((Object) str, (Object) str2))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                update(aweme);
            }
        }
    }

    public void update(Aweme aweme) {
        String str;
        String str2;
        long j;
        Boolean bool;
        User user;
        String str3;
        AwemeStatus awemeStatus;
        List<Challenge> list;
        Music music2;
        Video video2;
        String str4;
        List<TextExtraStruct> list2;
        C36966e eVar;
        C46069d dVar;
        List<AnchorCommonStruct> list3;
        String str5;
        List<LongVideo> list4;
        VideoControl videoControl2;
        StreamUrlModel streamUrlModel2;
        String str6;
        String str7;
        String str8;
        RoomFeedCellStruct roomFeedCellStruct;
        VideoReplyStruct videoReplyStruct2;
        C41399b bVar;
        NewLiveRoomStruct newLiveRoomStruct;
        String str9;
        UserProfileInitInfo userProfileInitInfo2;
        if (aweme != null) {
            if (TextUtils.isEmpty(aweme.aid)) {
                str = this.aid;
            } else {
                str = aweme.aid;
            }
            this.aid = str;
            if (aweme.desc == null) {
                str2 = this.desc;
            } else {
                str2 = aweme.desc;
            }
            this.desc = str2;
            if (aweme.createTime == 0) {
                j = this.createTime;
            } else {
                j = aweme.createTime;
            }
            this.createTime = j;
            if (this.author == null) {
                bool = null;
            } else {
                bool = this.author.isHasUnreadStory();
            }
            if (aweme.author == null) {
                user = this.author;
            } else {
                user = aweme.author;
            }
            this.author = user;
            if (!(bool == null || this.author == null || this.author.isHasUnreadStory() != null)) {
                this.author.setHasUnreadStory(bool.booleanValue());
            }
            if (aweme.commerceConfigDataList != null && !aweme.commerceConfigDataList.isEmpty()) {
                this.commerceConfigDataList = aweme.commerceConfigDataList;
            }
            if (TextUtils.isEmpty(aweme.shareUrl)) {
                str3 = this.shareUrl;
            } else {
                str3 = aweme.shareUrl;
            }
            this.shareUrl = str3;
            this.userDigg = aweme.userDigg;
            this.statistics = aweme.statistics;
            if (aweme.status == null) {
                awemeStatus = this.status;
            } else {
                awemeStatus = aweme.status;
            }
            this.status = awemeStatus;
            if (aweme.challengeList == null) {
                list = this.challengeList;
            } else {
                list = aweme.challengeList;
            }
            this.challengeList = list;
            if (aweme.music == null) {
                music2 = this.music;
            } else {
                music2 = aweme.music;
            }
            this.music = music2;
            if (aweme.video == null) {
                video2 = this.video;
            } else {
                video2 = aweme.video;
            }
            this.video = video2;
            if (TextUtils.isEmpty(aweme.extra)) {
                str4 = this.extra;
            } else {
                str4 = aweme.extra;
            }
            this.extra = str4;
            if (aweme.textExtra == null) {
                list2 = this.textExtra;
            } else {
                list2 = aweme.textExtra;
            }
            this.textExtra = list2;
            this.rate = aweme.rate;
            this.starAtlasOrderId = aweme.starAtlasOrderId;
            this.isFantasy = aweme.isFantasy;
            this.labelTop = aweme.labelTop;
            this.labelLarge = aweme.labelLarge;
            this.labelThumb = aweme.labelThumb;
            this.shareInfo = aweme.shareInfo;
            this.originAuthor = aweme.originAuthor;
            this.musicStarter = aweme.musicStarter;
            this.mLabelMusicStarterText = aweme.mLabelMusicStarterText;
            this.mLabelOriginAuthorText = aweme.mLabelOriginAuthorText;
            this.isHashTag = aweme.isHashTag;
            this.videoLabels = aweme.videoLabels;
            this.poiStruct = aweme.poiStruct;
            this.isAd = aweme.isAd;
            this.awemeType = aweme.awemeType;
            this.collectStatus = aweme.collectStatus;
            this.awemeRawAd = aweme.awemeRawAd;
            this.specialSticker = aweme.specialSticker;
            this.mLiveAwesomeSplashInfo = aweme.mLiveAwesomeSplashInfo;
            this.videoLabels = aweme.videoLabels;
            this.textVideoLabels = aweme.textVideoLabels;
            this.textTopLabels = aweme.textTopLabels;
            this.imageInfos = aweme.imageInfos;
            this.awemeRiskModel = aweme.awemeRiskModel;
            this.cmtSwt = aweme.cmtSwt;
            this.canPlay = aweme.canPlay;
            this.scenario = aweme.scenario;
            this.position = aweme.position;
            this.lawCriticalCountry = aweme.lawCriticalCountry;
            this.room = aweme.room;
            this.adSchedule = aweme.adSchedule;
            this.feedCount = aweme.feedCount;
            this.preventDownload = aweme.preventDownload;
            this.forwardItem = aweme.forwardItem;
            this.forwardItemId = aweme.forwardItemId;
            this.forwardCommentId = aweme.forwardCommentId;
            this.preForwardId = aweme.preForwardId;
            this.withPromotionalMusic = aweme.withPromotionalMusic;
            this.linkAdData = aweme.linkAdData;
            this.starAtlasInfo = aweme.starAtlasInfo;
            this.awemeNationalTask = aweme.awemeNationalTask;
            this.activityPendant = aweme.activityPendant;
            this.xiGuaTask = aweme.xiGuaTask;
            if (aweme.microAppInfo == null) {
                eVar = this.microAppInfo;
            } else {
                eVar = aweme.microAppInfo;
            }
            this.microAppInfo = eVar;
            if (aweme.stickerEntranceInfo == null) {
                dVar = this.stickerEntranceInfo;
            } else {
                dVar = aweme.stickerEntranceInfo;
            }
            this.stickerEntranceInfo = dVar;
            if (aweme.anchors == null) {
                list3 = this.anchors;
            } else {
                list3 = aweme.anchors;
            }
            this.anchors = list3;
            if (TextUtils.isEmpty(aweme.stickerIDs)) {
                str5 = this.stickerIDs;
            } else {
                str5 = aweme.stickerIDs;
            }
            this.stickerIDs = str5;
            if (this.hotListStruct == null || this.hotListStruct.getType() != 9) {
                this.hotListStruct = aweme.hotListStruct;
            }
            if (aweme.longVideos == null) {
                list4 = this.longVideos;
            } else {
                list4 = aweme.longVideos;
            }
            this.longVideos = list4;
            this.takeDownReason = aweme.takeDownReason;
            this.takeDownDesc = aweme.takeDownDesc;
            this.starRecommendTag = aweme.starRecommendTag;
            this.adOrderId = aweme.adOrderId;
            this.downloadWithoutWatermark = aweme.downloadWithoutWatermark;
            if (!C47917gi.m103681a((Collection<? extends T>) aweme.interactStickerStructs)) {
                this.interactStickerStructs = aweme.interactStickerStructs;
            }
            this.originCommentIds = aweme.originCommentIds;
            this.duetSetting = aweme.duetSetting;
            this.reactSetting = aweme.reactSetting;
            this.isEffectDesigner = aweme.isEffectDesigner;
            this.enableTopView = aweme.enableTopView;
            this.commentSetting = aweme.commentSetting;
            if (aweme.videoControl == null) {
                videoControl2 = this.videoControl;
            } else {
                videoControl2 = aweme.videoControl;
            }
            this.videoControl = videoControl2;
            this.distributeType = aweme.distributeType;
            this.mixInfo = aweme.mixInfo;
            if (aweme.getMobParams() != null) {
                this.mMobParams = aweme.getMobParams();
            }
            if (!TextUtils.isEmpty(aweme.getRateScore())) {
                this.rateScore = aweme.getRateScore();
            }
            if (aweme.getCommerceVideoAuthInfo() != null) {
                this.mCommerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            }
            this.uploadMiscInfoStructStr = aweme.uploadMiscInfoStructStr;
            this.cacheAvUploadMiscInfoStruct = C43895j.createStruct(this.uploadMiscInfoStructStr);
            this.feedRelationLabel = aweme.feedRelationLabel;
            this.videoMaskInfo = aweme.videoMaskInfo;
            if (aweme.streamUrlModel == null) {
                streamUrlModel2 = this.streamUrlModel;
            } else {
                streamUrlModel2 = aweme.streamUrlModel;
            }
            this.streamUrlModel = streamUrlModel2;
            if (aweme.title == null) {
                str6 = this.title;
            } else {
                str6 = aweme.title;
            }
            this.title = str6;
            if (aweme.videoFeedTag == null) {
                str7 = this.videoFeedTag;
            } else {
                str7 = aweme.videoFeedTag;
            }
            this.videoFeedTag = str7;
            if (aweme.liveReaSon == null) {
                str8 = this.liveReaSon;
            } else {
                str8 = aweme.liveReaSon;
            }
            this.liveReaSon = str8;
            if (aweme.mRoomFeedCellStruct == null) {
                roomFeedCellStruct = this.mRoomFeedCellStruct;
            } else {
                roomFeedCellStruct = aweme.mRoomFeedCellStruct;
            }
            this.mRoomFeedCellStruct = roomFeedCellStruct;
            if (aweme.videoReplyStruct == null) {
                videoReplyStruct2 = this.videoReplyStruct;
            } else {
                videoReplyStruct2 = aweme.videoReplyStruct;
            }
            this.videoReplyStruct = videoReplyStruct2;
            this.liveWindowShowTime = aweme.liveWindowShowTime;
            if (aweme.linkMatch == null) {
                bVar = this.linkMatch;
            } else {
                bVar = aweme.linkMatch;
            }
            this.linkMatch = bVar;
            if (aweme.newLiveRoomData == null) {
                newLiveRoomStruct = this.newLiveRoomData;
            } else {
                newLiveRoomStruct = aweme.newLiveRoomData;
            }
            this.newLiveRoomData = newLiveRoomStruct;
            this.hybridLabels = aweme.hybridLabels;
            if (aweme.distance == null) {
                str9 = this.distance;
            } else {
                str9 = aweme.distance;
            }
            this.distance = str9;
            this.withSurvey = aweme.withSurvey;
            if (aweme.userProfileInitInfo == null) {
                userProfileInitInfo2 = this.userProfileInitInfo;
            } else {
                userProfileInitInfo2 = aweme.userProfileInitInfo;
            }
            this.userProfileInitInfo = userProfileInitInfo2;
            this.recommendCardType = aweme.recommendCardType;
            this.isLiveReplay = aweme.isLiveReplay;
        }
    }

    private void setVr(VideoUrlModel videoUrlModel, boolean z) {
        if (videoUrlModel != null) {
            videoUrlModel.setVr(z);
        }
    }

    public void appendMobParam(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.mMobParams == null) {
                this.mMobParams = new HashMap<>();
            }
            this.mMobParams.put(str, str2);
        }
    }
}
