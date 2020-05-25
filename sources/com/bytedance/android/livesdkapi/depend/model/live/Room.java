package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.C2973f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import com.google.gson.p1076a.C17952c;
import java.util.List;
import java.util.Map;

public class Room implements C2973f {
    public static final int ROOM_FINISH = 4;
    public static final int ROOM_FINISH_REASON_FORCE_FINISH_OF_ILLEGAL = 8;
    public static final int ROOM_FINISH_REASON_NORMAL = 1;
    public static final int ROOM_FINISH_REASON_STREAM_PUSH_FAILED = 6;
    public static final int ROOM_PAUSE = 3;
    public static final int ROOM_PLAYING = 2;
    public static final int ROOM_PREPARE = 1;
    public static final long ROOM_TYPE_KOI_ACTIVITY = 3;
    public static final long ROOM_TYPE_NORMAL = 0;
    public static final long ROOM_TYPE_OFFICIAL_ACTIVITY = 1;
    public static final long ROOM_TYPE_STAR_ACTIVITY = 2;
    public static final long USER_FROM_FOLLOW = 2;
    public static final long USER_FROM_LIVE_FEED_FOLLOW = 2001;
    public static final long USER_FROM_PROFILE = 3;
    public static final long USER_FROM_PUSH = 4;
    public static final long USER_FROM_RECOMMEND = 1;
    public static final long USER_FROM_TIMELINE = 0;
    public static final long USER_FROM_WEB = 5;
    @C17952c(mo34828a = "admin_user_ids")
    List<Long> adminUserIds;
    @C17952c(mo34828a = "anchor_share_text")
    String anchorShareText;
    @C17952c(mo34828a = "background")
    public ImageModel background;
    @C17952c(mo34828a = "burst")
    C8702h burstInfo;
    @C17952c(mo34828a = "cell_style")
    long cellStyle;
    @C17952c(mo34828a = "client_version")
    String clientVersion;
    @C17952c(mo34828a = "cover")
    ImageModel cover;
    @C17952c(mo34828a = "create_time")
    long createTime;
    @C17952c(mo34828a = "sun_daily_icon_content")
    String dailyRankContent;
    @C17952c(mo34828a = "deco_list")
    List<C8721u> decorationList;
    @C17952c(mo34828a = "distance")
    String distance;
    @C17952c(mo34828a = "distance_city")
    String distanceCity;
    @C17952c(mo34828a = "distance_km")
    String distanceKm;
    @C17952c(mo34828a = "dynamic_cover")
    ImageModel dynamicCover;
    @C17952c(mo34828a = "dynamic_cover_dict")
    Map<Long, String> dynamicCoverDict;
    @C17952c(mo34828a = "dynamic_cover_low")
    ImageModel dynamicCoverLow;
    @C17952c(mo34828a = "dynamic_cover_uri")
    String dynamicCoverUri;
    @C17952c(mo34828a = "enable_room_perspective")
    boolean enableRoomPerspective;
    @C17952c(mo34828a = "feed_room_label")
    ImageModel feedRoomLabel;
    @C17952c(mo34828a = "finish_time")
    long finishTime;
    @C17952c(mo34828a = "finish_url")
    public String finish_url;
    @C17952c(mo34828a = "gift_msg_style")
    public int giftMessageStyle;
    @C17952c(mo34828a = "has_commerce_goods")
    public boolean hasCommerceGoods;
    @C17952c(mo34828a = "health_score")
    C8694ab healthScoreInfo;
    @C17952c(mo34828a = "hide_nickname")
    boolean hideNickName;
    @C17952c(mo34828a = "hide_status_tag")
    boolean hideStatusTag;
    @C17952c(mo34828a = "hide_title")
    boolean hideTitle;
    @C17952c(mo34828a = "hide_user_count")
    boolean hideUserCount;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    long f23771id;
    @C17952c(mo34828a = "id_str")
    String idStr;
    @C17952c(mo34828a = "introduction")
    public String introduction;
    public boolean isDouPlusPromotion;
    public boolean isFromRecommendCard;
    @C17952c(mo34828a = "is_replay")
    public boolean isReplay;
    @C17952c(mo34828a = "live_type_screenshot")
    public boolean isScreenshot;
    @C17952c(mo34828a = "live_type_third_party")
    public boolean isThirdParty;
    @C17952c(mo34828a = "common_label_list")
    String labels;
    @C17952c(mo34828a = "last_ping_time")
    long lastPingTime;
    @C17952c(mo34828a = "layout")
    public long layout;
    @C17952c(mo34828a = "link_mic")
    C8722v linkMicInfoGson;
    @C17952c(mo34828a = "linkmic_layout")
    long linkMicLayout;
    private transient int linkmicLayout;
    @C17952c(mo34828a = "live_id")
    long liveId;
    @C17952c(mo34828a = "live_type_audio")
    boolean liveTypeAudio;
    @C17952c(mo34828a = "live_type_linkmic")
    boolean liveTypeLinkmic;
    @C17952c(mo34828a = "live_type_normal")
    boolean liveTypeNormal;
    @C17952c(mo34828a = "live_type_sandbox")
    boolean liveTypeSandbox;
    @C17952c(mo34828a = "living_room_attrs")
    C8724x livingRoomAttrs;
    @C17952c(mo34828a = "location")
    String location;
    private String logPb;
    @C17952c(mo34828a = "group_id")
    public long mGroupId;
    @C17952c(mo34828a = "group_source")
    public int mGroupSource;
    @C17952c(mo34828a = "guide_button")
    public ImageModel mGuideButton;
    @C17952c(mo34828a = "lottery_finish_time")
    public long mLotteryFinishTime;
    @C17952c(mo34828a = "activity_tag")
    public C8711n mPlayTagInfo;
    @C17952c(mo34828a = "portrait_cover")
    public ImageModel mPortraitCover;
    @C17952c(mo34828a = "preview_copy")
    public String mPreviewCopy;
    private String mRequestId;
    @C17952c(mo34828a = "room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    @C17952c(mo34828a = "room_tabs")
    public List<C8723w> mRoomTabs;
    private long mUserFrom;
    @C17952c(mo34828a = "wait_copy")
    public String mWaitCopy;
    @C17952c(mo34828a = "match_info")
    public C8713p matchInfo;
    @C17952c(mo34828a = "message")
    public String message;
    @C17952c(mo34828a = "mosaic_status")
    int mosaicStatus;
    @C17952c(mo34828a = "mosaic_tip")
    String mosaicTip;
    @C17952c(mo34828a = "new_cell_style")
    int newCellStyle;
    public long nowTime;
    @C17952c(mo34828a = "official_room_info")
    public C8718r officialRoomInfo;
    @C17952c(mo34828a = "orientation")
    int orientation;
    @C17952c(mo34828a = "owner")
    User owner;
    @C17952c(mo34828a = "owner_user_id")
    long ownerUserId;
    @C17952c(mo34828a = "os_type")
    int platform;
    @C17952c(mo34828a = "popularity")
    public long popularity;
    @C17952c(mo34828a = "popularity_str")
    public String popularityStr;
    @C17952c(mo34828a = "private_info")
    String privateInfo;
    @C17952c(mo34828a = "prompts")
    public String prompts;
    @C17952c(mo34828a = "real_distance")
    String realDistance;
    @C17952c(mo34828a = "luckymoney_num")
    public int redEnvelopeNumber;
    @C17952c(mo34828a = "share_url")
    String shareUrl;
    @C17952c(mo34828a = "is_show_inquiry_ball")
    public boolean showInquiryBall;
    @C17952c(mo34828a = "source_type")
    String sourceType;
    @C17952c(mo34828a = "stats")
    RoomStats stats;
    @C17952c(mo34828a = "status")
    int status;
    @C17952c(mo34828a = "stream_id")
    long streamId;
    @C17952c(mo34828a = "stream_id_str")
    String streamIdStr;
    @C17952c(mo34828a = "stream_provider")
    long streamProvider;
    @C17952c(mo34828a = "stream_url")
    StreamUrl streamUrl;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "top_fans")
    List<C8727z> topFanTickets;
    @C17952c(mo34828a = "top_users")
    List<User> topUsers;
    @C17952c(mo34828a = "use_filter")
    public boolean unusedEffect;
    @C17952c(mo34828a = "user_count")
    int userCount;
    @C17952c(mo34828a = "user_share_text")
    String userShareText;
    @C17952c(mo34828a = "vid")
    public String vid;
    @C17952c(mo34828a = "with_linkmic")
    boolean withLinkMic;

    public C3009i author() {
        return this.owner;
    }

    public ImageModel cover() {
        return this.cover;
    }

    public List<Long> getAdminUserIds() {
        return this.adminUserIds;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public C8702h getBurstInfo() {
        return this.burstInfo;
    }

    public long getCellStyle() {
        return this.cellStyle;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDailyRankContent() {
        return this.dailyRankContent;
    }

    public List<C8721u> getDecorationList() {
        return this.decorationList;
    }

    public List<Object> getDislikeReason() {
        return null;
    }

    public String getDistance() {
        return this.distance;
    }

    public String getDistanceCity() {
        return this.distanceCity;
    }

    public String getDistanceKm() {
        return this.distanceKm;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public Map<Long, String> getDynamicCoverDict() {
        return this.dynamicCoverDict;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public String getDynamicCoverUri() {
        return this.dynamicCoverUri;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public C8694ab getHealthScoreInfo() {
        return this.healthScoreInfo;
    }

    public long getId() {
        return this.f23771id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLastPingTime() {
        return this.lastPingTime;
    }

    public C8722v getLinkMicInfo() {
        return this.linkMicInfoGson;
    }

    public long getLinkMicLayout() {
        return this.linkMicLayout;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public C8724x getLivingRoomAttrs() {
        return this.livingRoomAttrs;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public String getMosaicTip() {
        return this.mosaicTip;
    }

    public int getNewCellStyle() {
        return this.newCellStyle;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public String getRealDistance() {
        return this.realDistance;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public String getStreamIdStr() {
        return this.streamIdStr;
    }

    public long getStreamProvider() {
        return this.streamProvider;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<C8727z> getTopFanTickets() {
        return this.topFanTickets;
    }

    public List<User> getTopUsers() {
        return this.topUsers;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public String getVideoUrl() {
        return "";
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isEnableRoomPerspective() {
        return this.enableRoomPerspective;
    }

    public boolean isHideNickName() {
        return this.hideNickName;
    }

    public boolean isHideStatusTag() {
        return this.hideStatusTag;
    }

    public boolean isHideTitle() {
        return this.hideTitle;
    }

    public boolean isHideUserCount() {
        return this.hideUserCount;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isLiveTypeLinkmic() {
        return this.liveTypeLinkmic;
    }

    public boolean isLiveTypeNormal() {
        return this.liveTypeNormal;
    }

    public boolean isLiveTypeSandbox() {
        return this.liveTypeSandbox;
    }

    public boolean isUnusedEffect() {
        return this.unusedEffect;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String subtitle() {
        return "";
    }

    public String title() {
        return this.title;
    }

    public String getMixId() {
        return String.valueOf(this.f23771id);
    }

    public String buildPullUrl() {
        if (this.streamUrl == null) {
            return null;
        }
        return buildPullUrl(this.streamUrl.f23790r);
    }

    public String getSdkParams() {
        if (this.streamUrl == null) {
            return null;
        }
        return getSdkParams(this.streamUrl.f23790r);
    }

    public C8726a getStreamSrConfig() {
        C8725y streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.f23984n;
    }

    public C8725y getStreamUrlExtra() {
        if (this.streamUrl == null) {
            return null;
        }
        return this.streamUrl.f23784l;
    }

    public C8725y getStreamUrlExtraSafely() {
        C8725y streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new C8725y();
        }
        return streamUrlExtra;
    }

    public boolean isKoiRoom() {
        if (this.layout == 3) {
            return true;
        }
        return false;
    }

    public boolean isOfficial() {
        if (this.layout == 1) {
            return true;
        }
        return false;
    }

    public boolean isStar() {
        if (this.layout == 2) {
            return true;
        }
        return false;
    }

    public void init() {
        if (this.streamUrl != null) {
            this.streamUrl.mo15382b();
            if (this.streamUrl.f23787o != null) {
                this.streamUrl.mo15383c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isMultiPullDataValid() {
        /*
            r4 = this;
            com.bytedance.android.livesdkapi.depend.model.live.StreamUrl r0 = r4.streamUrl
            r1 = 0
            if (r0 == 0) goto L_0x001d
            com.bytedance.android.livesdkapi.depend.model.live.StreamUrl r0 = r4.streamUrl
            com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData r2 = r0.f23787o
            r3 = 1
            if (r2 == 0) goto L_0x0019
            r0.mo15383c()
            java.util.LinkedList<com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData$Quality> r0 = r0.qualityList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            return r3
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.live.Room.isMultiPullDataValid():boolean");
    }

    public boolean isPullUrlValid() {
        if (this.streamUrl != null) {
            StreamUrl streamUrl2 = this.streamUrl;
            streamUrl2.mo15382b();
            if (!streamUrl2.qualityMap.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public String getMultiStreamData() {
        if (this.streamUrl == null || this.streamUrl.f23787o == null || this.streamUrl.f23787o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.f23787o.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.streamUrl == null || this.streamUrl.f23787o == null || this.streamUrl.f23787o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.f23787o.getDefaultQuality().sdkKey;
    }

    public C8710m getStreamType() {
        if (this.layout == 1) {
            return C8710m.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return C8710m.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return C8710m.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return C8710m.AUDIO;
        }
        return C8710m.VIDEO;
    }

    public void setAdminUserIds(List<Long> list) {
        this.adminUserIds = list;
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    public void setCellStyle(long j) {
        this.cellStyle = j;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    @C17952c(mo34828a = "cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDailyRankContent(String str) {
        this.dailyRankContent = str;
    }

    public void setDecorationList(List<C8721u> list) {
        this.decorationList = list;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistanceCity(String str) {
        this.distanceCity = str;
    }

    public void setDistanceKm(String str) {
        this.distanceKm = str;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverDict(Map<Long, String> map) {
        this.dynamicCoverDict = map;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setDynamicCoverUri(String str) {
        this.dynamicCoverUri = str;
    }

    public void setEnableRoomPerspective(boolean z) {
        this.enableRoomPerspective = z;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setHealthScoreInfo(C8694ab abVar) {
        this.healthScoreInfo = abVar;
    }

    public void setHideNickName(boolean z) {
        this.hideNickName = z;
    }

    public void setHideStatusTag(boolean z) {
        this.hideStatusTag = z;
    }

    public void setHideTitle(boolean z) {
        this.hideTitle = z;
    }

    public void setHideUserCount(boolean z) {
        this.hideUserCount = z;
    }

    public void setId(long j) {
        this.f23771id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLastPingTime(long j) {
        this.lastPingTime = j;
    }

    public void setLinkMicLayout(long j) {
        this.linkMicLayout = j;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLiveTypeLinkmic(boolean z) {
        this.liveTypeLinkmic = z;
    }

    public void setLiveTypeNormal(boolean z) {
        this.liveTypeNormal = z;
    }

    public void setLiveTypeSandbox(boolean z) {
        this.liveTypeSandbox = z;
    }

    public void setLivingRoomAttrs(C8724x xVar) {
        this.livingRoomAttrs = xVar;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setMosaicTip(String str) {
        this.mosaicTip = str;
    }

    public void setNewCellStyle(int i) {
        this.newCellStyle = i;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setRealDistance(String str) {
        this.realDistance = str;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStreamId(long j) {
        this.streamId = j;
    }

    public void setStreamIdStr(String str) {
        this.streamIdStr = str;
    }

    public void setStreamProvider(long j) {
        this.streamProvider = j;
    }

    @C17952c(mo34828a = "stream_url")
    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<C8727z> list) {
        this.topFanTickets = list;
    }

    public void setTopUsers(List<User> list) {
        this.topUsers = list;
    }

    public void setUnusedEffect(boolean z) {
        this.unusedEffect = z;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }

    public static boolean isValid(Room room) {
        if (room == null || room.getId() <= 0 || room.getOwner() == null) {
            return false;
        }
        return true;
    }

    public String getSdkParams(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        return (String) this.streamUrl.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        String str2 = (String) this.streamUrl.qualityMap.get(str);
        if (str2 == null) {
            return null;
        }
        C8839e eVar = new C8839e(str2);
        eVar.mo15825a("anchor_device_platform", this.platform);
        eVar.mo15827a("anchor_version", this.clientVersion);
        eVar.mo15826a("room_id", this.f23771id);
        eVar.mo15826a("anchor_id", this.ownerUserId);
        return eVar.mo15824a();
    }
}
