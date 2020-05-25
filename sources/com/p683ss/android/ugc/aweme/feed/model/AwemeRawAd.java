package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25906d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26108ac;
import com.p683ss.android.ugc.aweme.commercialize.model.C26115b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26119d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.model.C26133n;
import com.p683ss.android.ugc.aweme.commercialize.model.C26137r;
import com.p683ss.android.ugc.aweme.commercialize.model.C26141u;
import com.p683ss.android.ugc.aweme.commercialize.model.C26144w;
import com.p683ss.android.ugc.aweme.commercialize.model.C26146y;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.utils.C47770ck;
import com.p683ss.android.ugc.aweme.utils.C47917gi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRawAd */
public class AwemeRawAd implements Serializable {
    @C17952c(mo34828a = "action_extra")
    public String actionExtra;
    @C17952c(mo34828a = "show_special_avatar_style")
    private int adAvatarLinkTagStyle = 0;
    @C17952c(mo34828a = "hint_data")
    private C26115b adHintData;
    @C17952c(mo34828a = "ad_id")
    Long adId;
    @C17952c(mo34828a = "ad_more_textual")
    private String adMoreTextual;
    @C17952c(mo34828a = "play_node_track_url")
    List<C26119d> adNodeTrackUrlList;
    @C17952c(mo34828a = "ad_poi_control")
    boolean adPoiControl;
    @C17952c(mo34828a = "ad_source_type")
    private int adSourceType;
    @C17952c(mo34828a = "ad_tag_position")
    private int adTagPosition;
    @C17952c(mo34828a = "top_icon_list")
    UrlModel adTopIcon;
    @C17952c(mo34828a = "ad_type")
    int adType;
    @C17952c(mo34828a = "aggregation_sdk")
    AggregationSdk aggregationSdk;
    @C17952c(mo34828a = "allow_dsp_autojump")
    private boolean allowDspAutoJump;
    @C17952c(mo34828a = "animation_type")
    private int animationType;
    @C17952c(mo34828a = "app_category")
    String appCategory;
    @C17952c(mo34828a = "app_data")
    private String appData;
    @C17952c(mo34828a = "app_install")
    String appInstall = "";
    @C17952c(mo34828a = "app_like")
    String appLike;
    @C17952c(mo34828a = "app_name")
    String appName = "";
    @C17952c(mo34828a = "author_url")
    private String authorUrl;
    @C17952c(mo34828a = "avatar_icon")
    UrlModel avatarIcon;
    @C17952c(mo34828a = "background_color")
    private String backgroundColor;
    @C17952c(mo34828a = "button_style")
    int buttonStyle;
    @C17952c(mo34828a = "button_text")
    String buttonText;
    @C17952c(mo34828a = "card_infos")
    Map<String, CardStruct> cardInfos;
    @C17952c(mo34828a = "card_interaction_seconds")
    private int cardInteractionSeconds;
    @C17950a(mo34824a = false, mo34825b = false)
    boolean cardOnceClick;
    @C17952c(mo34828a = "click_track_url_list")
    UrlModel clickTrackUrlList;
    @C17952c(mo34828a = "comment_area")
    private C26129j commentArea;
    @C17952c(mo34828a = "comment_area_switch")
    private boolean commentAreaSwitch;
    @C17952c(mo34828a = "consult_url")
    String consultUrl;
    @C17952c(mo34828a = "context_track_url_list")
    private UrlModel contextTrack;
    private transient boolean contextTrackSent;
    @C17952c(mo34828a = "creative_id")
    Long creativeId;
    @C17952c(mo34828a = "description")
    String description;
    @C17952c(mo34828a = "disable_show_ad_link")
    boolean disableAdLink;
    @C17952c(mo34828a = "disable_ad_show_filter")
    boolean disableAdShowFilter;
    @C17952c(mo34828a = "disable_auto_track_click")
    boolean disableAutoTrackClick;
    @C17952c(mo34828a = "disable_download_dialog")
    int disableDownloadDialog = 1;
    @C17952c(mo34828a = "disable_follow_to_click")
    private int disableFollowToClick;
    @C17952c(mo34828a = "disable_show_link_label")
    public boolean disableShowLinkLabel = false;
    @C17952c(mo34828a = "disable_authorpage_button")
    private boolean disableUserprofileAdLabel;
    @C17952c(mo34828a = "display_type")
    Long displayType;
    @C17952c(mo34828a = "link_data")
    private C26133n douPlusLinkData;
    @C17952c(mo34828a = "download_url")
    String downloadUrl;
    @C17952c(mo34828a = "e_ad_info")
    private String eAdInfo;
    @C17952c(mo34828a = "effective_play_time")
    Float effectivePlayTime;
    @C17952c(mo34828a = "effective_play_track_url_list")
    UrlModel effectivePlayTrackUrlList;
    @C17952c(mo34828a = "enable_title_click")
    int enableDescClick;
    @C17952c(mo34828a = "enable_filter_same_video")
    private boolean enableFilterSameVideo = true;
    @C17952c(mo34828a = "enable_web_report")
    private boolean enableWebReport;
    @C17952c(mo34828a = "enter_from_merge")
    private String enterFromMerge;
    @C17952c(mo34828a = "expire_seconds")
    Long expireSeconds;
    @C17952c(mo34828a = "extra_effective_play_action")
    private int extraEffectivePlayAction;
    @C17952c(mo34828a = "fake_author")
    private C26137r fakeAuthor;
    @C17952c(mo34828a = "feature_label")
    String featureLabel;
    @C17952c(mo34828a = "form_height")
    private int formHeight;
    @C17952c(mo34828a = "form_url")
    private String formUrl;
    @C17952c(mo34828a = "form_width")
    private int formWidth;
    @C17952c(mo34828a = "get_ad_status")
    private int getAdStatus;
    @C17952c(mo34828a = "get_ad_time")
    private int getAdTime;
    @C17952c(mo34828a = "group_id")
    Long groupId;
    @C17952c(mo34828a = "hide_if_exists")
    int hideIfExists;
    @C17952c(mo34828a = "high_light_color")
    public String highLightColor;
    @C17952c(mo34828a = "high_light_position")
    public List<Position> highLightPosition;
    @C17952c(mo34828a = "homepage_bottom_textual")
    private String homepageBottomTextual;
    @C17952c(mo34828a = "icon_image_list")
    private List<UrlModel> iconImageList;
    @C17952c(mo34828a = "image_list")
    List<UrlModel> imageList;
    @C17952c(mo34828a = "image_url")
    private UrlModel imageUrl;
    @C17952c(mo34828a = "indicator_data")
    private IndicatorData indicatorData;
    @C17952c(mo34828a = "instance_phone_id")
    private long instancePhoneId;
    @C17952c(mo34828a = "interaction_seconds")
    int interactionSeconds;
    @C17952c(mo34828a = "interesting_play")
    private AwemePlayFunModel interestingPlay;
    @C17952c(mo34828a = "is_ack_action")
    private int isAckAction = 0;
    @C17952c(mo34828a = "is_dsp")
    private boolean isDsp;
    @C17952c(mo34828a = "is_preview")
    boolean isPreview;
    @C17952c(mo34828a = "js_actlog_url")
    private String jsActLogUrl;
    @C17952c(mo34828a = "label")
    private AwemeTextLabelModel label;
    @C17952c(mo34828a = "learn_more_bg_color")
    private String learnMoreBgColor;
    @C17952c(mo34828a = "left_slide_click_time")
    private int leftSlideClickDuration;
    @C17952c(mo34828a = "left_slide_click_type")
    private int leftSlideClickType;
    @C17952c(mo34828a = "light_web_url")
    private String lightWebUrl;
    @C17952c(mo34828a = "link_label")
    private AwemeLinkLabel linkLabel;
    @C17952c(mo34828a = "live_ad_type")
    private int liveAdType;
    @C17952c(mo34828a = "live_room")
    public int liveRoom;
    @C17952c(mo34828a = "log_extra")
    String logExtra;
    @C17952c(mo34828a = "template_url")
    private String lynxButtonUrl;
    @C17951b(mo34826a = C47770ck.class)
    @C17952c(mo34828a = "lynx_raw_data")
    private String lynxRawData;
    @C17952c(mo34828a = "download_mode")
    int mDownloadMode;
    @C17952c(mo34828a = "auto_open")
    int mLinkMode;
    @C17952c(mo34828a = "support_multiple")
    int mSupportMultiple;
    @C17952c(mo34828a = "mask_form_style")
    int maskFormStyle;
    @C17952c(mo34828a = "mp_url")
    private String microAppUrl;
    @C17952c(mo34828a = "music")
    private Music music;
    @C17952c(mo34828a = "native_card_info")
    private C26141u nativeCardInfo;
    @C17952c(mo34828a = "native_card_type")
    int nativeCardType;
    @C17952c(mo34828a = "native_site_ad_info")
    private String nativeSiteAdInfo;
    @C17952c(mo34828a = "native_site_config")
    private C26144w nativeSiteConfig;
    @C17952c(mo34828a = "vast")
    C26146y omVast;
    @C17952c(mo34828a = "open_system_browser")
    private boolean openSystemBrowser;
    @C17952c(mo34828a = "open_url")
    String openUrl;
    @C17952c(mo34828a = "origin_price")
    String originPrice;
    @C17952c(mo34828a = "outflow_button_style")
    int outFlowButtonStyle;
    @C17952c(mo34828a = "package")
    String packageName;
    private String pageFrom = "";
    @C17952c(mo34828a = "phone_key")
    private String phoneKey;
    @C17952c(mo34828a = "phone_number")
    private String phoneNumber;
    @C17952c(mo34828a = "playover_track_url_list")
    UrlModel playOverTrackUrlList;
    @C17952c(mo34828a = "play_track_url_list")
    UrlModel playTrackUrlList;
    @C17952c(mo34828a = "playback_seconds_track_url")
    private List<C26108ac> playbackSecondsTrackList = new ArrayList();
    @C17952c(mo34828a = "pop_ups")
    private boolean popUps;
    @C17952c(mo34828a = "position")
    private int position;
    @C17952c(mo34828a = "preload_data")
    private C25906d preloadData;
    @C17952c(mo34828a = "preload_extra_web")
    private int preloadExtraWeb;
    @C17952c(mo34828a = "preload_web")
    private int preloadWeb;
    @C17952c(mo34828a = "price")
    String price;
    @C17952c(mo34828a = "profile_with_webview")
    private int profileWithWebview;
    @C17952c(mo34828a = "promotion_label")
    String promotionLabel;
    @C17952c(mo34828a = "quick_app_url")
    String quickAppUrl;
    @C17952c(mo34828a = "recommend_extra")
    private String recommendExtra;
    @C17952c(mo34828a = "recommend_title")
    private String recommendTitle;
    @C17952c(mo34828a = "red_mp_url")
    private String redMpUrl;
    @C17952c(mo34828a = "red_open_url")
    private String redOpenUrl;
    @C17952c(mo34828a = "red_url")
    private String redUrl;
    @C17952c(mo34828a = "report_ad_type")
    private int reportAdType;
    @C17952c(mo34828a = "report_enable")
    boolean reportEnable;
    @C17952c(mo34828a = "schema_name")
    String schemaName;
    @C17952c(mo34828a = "raw_search_ad_type")
    private int searchAdType;
    @C17952c(mo34828a = "shop_ad_data")
    private String shopAdData;
    @C17952c(mo34828a = "show_ad_after_interaction")
    boolean showAdAfterInteraction;
    @C17952c(mo34828a = "show_button_color_seconds")
    int showButtonColorSeconds;
    @C17952c(mo34828a = "show_button_seconds")
    private int showButtonSeconds;
    @C17952c(mo34828a = "show_mask_times")
    private int showMaskTimes;
    @C17952c(mo34828a = "show_outflow_mask_times")
    private int showOutflowMaskTimes;
    @C17952c(mo34828a = "show_poi_deil_seconds")
    int showPoiDeilSeconds;
    @C17952c(mo34828a = "show_type")
    int showType;
    @C17952c(mo34828a = "similar_animation")
    private int similarAnimation = 0;
    @C17952c(mo34828a = "slide_action")
    private int slideAction;
    @C17952c(mo34828a = "source")
    String source;
    @C17952c(mo34828a = "splash_info")
    private AwemeSplashInfo splashInfo;
    @C17952c(mo34828a = "system_origin")
    int systemOrigin;
    @C17952c(mo34828a = "tips_type")
    int tipsType;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "top_title")
    String topTitle;
    @C17952c(mo34828a = "track_url_list")
    UrlModel trackUrlList;
    @C17952c(mo34828a = "type")
    String type;
    @C17952c(mo34828a = "use_default_color")
    boolean useDefaultColor;
    @C17952c(mo34828a = "use_ordinary_web")
    Boolean useOrdinaryWeb;
    @C17952c(mo34828a = "video_transpose")
    Long videoTranspose;
    @C17952c(mo34828a = "web_title")
    String webTitle;
    @C17952c(mo34828a = "web_type")
    int webType;
    @C17952c(mo34828a = "web_url")
    String webUrl;
    @C17952c(mo34828a = "webview_pannel_style")
    private int webviewPannelStyle;
    @C17952c(mo34828a = "webview_progress_bar")
    private int webviewProgressBar;
    @C17952c(mo34828a = "webview_type")
    private int webviewType;

    private void vastFromXml() {
    }

    public int getAdAvatarLinkTagStyle() {
        return this.adAvatarLinkTagStyle;
    }

    public C26115b getAdHintData() {
        return this.adHintData;
    }

    public Long getAdId() {
        return this.adId;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<C26119d> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public int getAdType() {
        return this.adType;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public String getAppData() {
        return this.appData;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAuthorUrl() {
        return this.authorUrl;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public C26129j getCommentArea() {
        return this.commentArea;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public int getDisableFollowToClick() {
        return this.disableFollowToClick;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public C26133n getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getEAdInfo() {
        return this.eAdInfo;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public C26137r getFakeAuthor() {
        return this.fakeAuthor;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public int getGetAdStatus() {
        return this.getAdStatus;
    }

    public int getGetAdTime() {
        return this.getAdTime;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public String getHomepageBottomTextual() {
        return this.homepageBottomTextual;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public IndicatorData getIndicatorData() {
        return this.indicatorData;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLeftSlideClickDuration() {
        return this.leftSlideClickDuration;
    }

    public int getLeftSlideClickType() {
        return this.leftSlideClickType;
    }

    public String getLightWebUrl() {
        return this.lightWebUrl;
    }

    public AwemeLinkLabel getLinkLabel() {
        return this.linkLabel;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public int getLiveAdType() {
        return this.liveAdType;
    }

    public String getLiveEnterFromMerge() {
        return this.enterFromMerge;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getLynxButtonUrl() {
        return this.lynxButtonUrl;
    }

    public String getLynxRawData() {
        return this.lynxRawData;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public Music getMusic() {
        return this.music;
    }

    public C26141u getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public C26144w getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public C26146y getOmVast() {
        return this.omVast;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public int getOutFlowButtonStyle() {
        return this.outFlowButtonStyle;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.pageFrom;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public AwemePlayFunModel getPlayFunModel() {
        return this.interestingPlay;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<C26108ac> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public int getPosition() {
        return this.position;
    }

    public C25906d getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public String getPrice() {
        return this.price;
    }

    public int getProfileWithWebview() {
        return this.profileWithWebview;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRecommendExtra() {
        return this.recommendExtra;
    }

    public String getRedMpUrl() {
        return this.redMpUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public int getReportAdType() {
        return this.reportAdType;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public int getSearchAdType() {
        return this.searchAdType;
    }

    public String getShopAdData() {
        return this.shopAdData;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getShowOutflowMaskTimes() {
        return this.showOutflowMaskTimes;
    }

    public int getSimilarAnimation() {
        return this.similarAnimation;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public int getSystemOrigin() {
        return this.systemOrigin;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopTitle() {
        return this.topTitle;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getUseOrdinaryWeb_() {
        return this.useOrdinaryWeb;
    }

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public int getWebviewPannelStyle() {
        return this.webviewPannelStyle;
    }

    public int getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public int getWebviewType() {
        return this.webviewType;
    }

    public boolean isAdPoiControl() {
        return this.adPoiControl;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public boolean isCardOnceClick() {
        return this.cardOnceClick;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.contextTrackSent;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isEnableWebReport() {
        return this.enableWebReport;
    }

    public boolean isOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public boolean allowJumpToPlayStore() {
        if (this.slideAction == 1) {
            return true;
        }
        return false;
    }

    public boolean getEnableDescClick() {
        if (this.enableDescClick != 0) {
            return true;
        }
        return false;
    }

    public int getShowPoiMillisecond() {
        return this.showPoiDeilSeconds * 1000;
    }

    public boolean isAckAction() {
        if (this.isAckAction == 1) {
            return true;
        }
        return false;
    }

    public boolean isAppAd() {
        return isTypeOf("app");
    }

    public boolean isDisableDownloadDialog() {
        if (this.disableDownloadDialog == 1) {
            return true;
        }
        return false;
    }

    public boolean isHardAd() {
        if (this.adSourceType == 1) {
            return true;
        }
        return false;
    }

    public boolean isHideIfExists() {
        if (this.hideIfExists == 1) {
            return true;
        }
        return false;
    }

    public boolean isNewStyleAd() {
        if (this.showType == 1) {
            return true;
        }
        return false;
    }

    public boolean isPreloadExtraWeb() {
        if (this.preloadExtraWeb == 1) {
            return true;
        }
        return false;
    }

    public boolean isSupportMultiple() {
        if (this.mSupportMultiple > 0) {
            return true;
        }
        return false;
    }

    public boolean useEffectivePlayAction() {
        if (this.extraEffectivePlayAction == 1) {
            return true;
        }
        return false;
    }

    public String getCreativeIdStr() {
        if (this.creativeId == null) {
            return null;
        }
        return this.creativeId.toString();
    }

    public boolean isImageValid() {
        if (this.imageList == null || this.imageList.isEmpty()) {
            return false;
        }
        return true;
    }

    public String[] getAppCategory() {
        if (TextUtils.isEmpty(this.appCategory)) {
            return new String[0];
        }
        return this.appCategory.split(" ");
    }

    public float getAppLike() {
        if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        }
        return Float.parseFloat(this.appLike);
    }

    public CardStruct getDefaultCardInfo() {
        if (this.cardInfos == null || !this.cardInfos.containsKey("3")) {
            return null;
        }
        return (CardStruct) this.cardInfos.get("3");
    }

    public Float getEffectivePlayTime() {
        if (this.effectivePlayTime == null || this.effectivePlayTime.floatValue() <= 0.001f) {
            return Float.valueOf(3.0f);
        }
        return this.effectivePlayTime;
    }

    public UrlModel getRedImageUrl() {
        if (C47917gi.m103681a((Collection<? extends T>) this.iconImageList)) {
            return null;
        }
        return (UrlModel) this.iconImageList.get(0);
    }

    public boolean isClickTrackUrlListValid() {
        if (this.clickTrackUrlList == null || this.clickTrackUrlList.getUrlList() == null || this.clickTrackUrlList.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isRightStyle() {
        if (getAdTagPosition() != 2 || this.label == null || TextUtils.isEmpty(this.label.getLabelName())) {
            return false;
        }
        return true;
    }

    public void setAdHintData(C26115b bVar) {
        this.adHintData = bVar;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdTagPosition(int i) {
        this.adTagPosition = i;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnimationType(int i) {
        this.animationType = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setButtonStyle(int i) {
        this.buttonStyle = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCardOnceClick(boolean z) {
        this.cardOnceClick = z;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentArea(C26129j jVar) {
        this.commentArea = jVar;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.contextTrackSent = z;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i) {
        this.disableDownloadDialog = i;
    }

    public void setDisableFollowToClick(int i) {
        this.disableFollowToClick = i;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l) {
        this.displayType = l;
    }

    public void setDownloadMode(int i) {
        this.mDownloadMode = i;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setExpireSeconds(Long l) {
        this.expireSeconds = l;
    }

    public void setFakeAuthor(C26137r rVar) {
        this.fakeAuthor = rVar;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFormHeight(int i) {
        this.formHeight = i;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i) {
        this.formWidth = i;
    }

    public void setGetAdStatus(int i) {
        this.getAdStatus = i;
    }

    public void setGetAdTime(int i) {
        this.getAdTime = i;
    }

    public void setGroupId(Long l) {
        this.groupId = l;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setIndicatorData(IndicatorData indicatorData2) {
        this.indicatorData = indicatorData2;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLightWebUrl(String str) {
        this.lightWebUrl = str;
    }

    public void setLinkMode(int i) {
        this.mLinkMode = i;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setMaskFormStyle(int i) {
        this.maskFormStyle = i;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setOmVast(C26146y yVar) {
        this.omVast = yVar;
    }

    public void setOpenSystemBrowser(boolean z) {
        this.openSystemBrowser = z;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.pageFrom = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadData(C25906d dVar) {
        this.preloadData = dVar;
    }

    public void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProfileWithWebview(int i) {
        this.profileWithWebview = i;
    }

    public void setRecommendExtra(String str) {
        this.recommendExtra = str;
    }

    public void setRedMpUrl(String str) {
        this.redMpUrl = str;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setReportAdType(int i) {
        this.reportAdType = i;
    }

    public void setShopAdData(String str) {
        this.shopAdData = str;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowButtonSeconds(int i) {
        this.showButtonSeconds = i;
    }

    public void setShowMaskTimes(int i) {
        this.showMaskTimes = i;
    }

    public void setShowOutflowMaskTimes(int i) {
        this.showOutflowMaskTimes = i;
    }

    public void setSimilarAnimation(int i) {
        this.similarAnimation = i;
    }

    public void setSlideAction(int i) {
        this.slideAction = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i) {
        this.mSupportMultiple = i;
    }

    public void setSystemOrigin(int i) {
        this.systemOrigin = i;
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

    public void setVideoTranspose(Long l) {
        this.videoTranspose = l;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i) {
        this.webType = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebviewProgressBar(int i) {
        this.webviewProgressBar = i;
    }

    public void setWebviewType(int i) {
        this.webviewType = i;
    }

    public boolean isTypeOf(String str) {
        return TextUtils.equals(this.type, str);
    }
}
