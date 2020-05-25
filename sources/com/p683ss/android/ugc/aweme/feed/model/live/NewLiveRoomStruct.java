package com.p683ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.p683ss.android.ugc.aweme.live.C36061c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct */
public class NewLiveRoomStruct extends C23453a implements C22982e, Serializable {
    public static final int ROOM_FINISH = 4;
    public static final int ROOM_FINISH_REASON_HUANGFAN = 4;
    public static final int ROOM_FINISH_REASON_KICTOUT = 2;
    public static final int ROOM_FINISH_REASON_KICTOUT_BY_ADMIN = 3;
    public static final int ROOM_FINISH_REASON_MULTI_LOGIN_KICOUT = 8;
    public static final int ROOM_FINISH_REASON_NORMAL = 1;
    public static final int ROOM_FINISH_REASON_PAUSE_PING_TIMEOUT = 7;
    public static final int ROOM_FINISH_REASON_PING_TIMEOUT = 5;
    public static final int ROOM_FINISH_REASON_STREAM_PUSH_FAILED = 6;
    public static final int ROOM_FINISH_REASON_UNKNOWN = 999;
    public static final int ROOM_LONGTIME_NO_NET = 1004;
    public static final int ROOM_PAUSE = 3;
    public static final int ROOM_PLAYING = 2;
    public static final int ROOM_PREPARE = 1;
    private Challenge challenge;
    @C17952c(mo34828a = "challenge_info")
    public String challengeInfo;
    @C17952c(mo34828a = "client_version")
    String clientVersion;
    @C17952c(mo34828a = "content_label")
    public LiveImageModel contentLabel;
    @C17952c(mo34828a = "content_tag")
    public String contentTag;
    public String errorMsg;
    @C17952c(mo34828a = "room_id", mo34829b = {"id"})

    /* renamed from: id */
    public long f79737id;
    @C17952c(mo34828a = "live_type_official")
    public boolean isOfficialType;
    @C17952c(mo34828a = "live_type_screenshot")
    public boolean isScreenshot;
    @C17952c(mo34828a = "live_type_third_party")
    public boolean isThirdParty;
    @C17952c(mo34828a = "live_type_audio")
    public boolean liveTypeAudio;
    private String mRequestId;
    private long mUserFrom;
    public String message;
    @C17952c(mo34828a = "operation_label")
    public LiveImageModel operationLabel;
    @C17952c(mo34828a = "owner")
    public LiveUser owner;
    @C17952c(mo34828a = "owner_user_id")
    public long ownerUserId;
    @C17952c(mo34828a = "os_type")
    int platform;
    public String prompts;
    @C17952c(mo34828a = "room_cover", mo34829b = {"cover"})
    public UrlModel roomCover;
    @C17952c(mo34828a = "room_layout")
    public int roomLayout;
    @C17952c(mo34828a = "stats")
    public RoomStas roomStas;
    public int roomType = 3;
    @C17952c(mo34828a = "status")
    public int status;
    public int status_code;
    public String status_msg;
    @C17952c(mo34828a = "stream_url")
    public LiveStreamUrl stream_url;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;
    public long userId;
    @C17952c(mo34828a = "user_count")
    public int user_count;
    @C17952c(mo34828a = "video_feed_tag")
    public String videoFeedTag;
    @C17952c(mo34828a = "with_linkmic")
    public boolean withLinkmic;

    public String getChallengeInfo() {
        return this.challengeInfo;
    }

    public LiveImageModel getContentLabel() {
        return this.contentLabel;
    }

    public String getContentTag() {
        return this.contentTag;
    }

    public LiveImageModel getOperationLabel() {
        return this.operationLabel;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getSdkParams() {
        if (this.stream_url == null) {
            return null;
        }
        return getSdkParams(this.stream_url.defaultQualityName);
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        if (this.stream_url == null) {
            return null;
        }
        return this.stream_url.getExtra();
    }

    public LiveStreamUrlExtra getStreamUrlExtraSafely() {
        LiveStreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new LiveStreamUrlExtra();
        }
        return streamUrlExtra;
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public Challenge getChallenge() {
        try {
            if (this.challenge == null) {
                this.challenge = (Challenge) C36061c.m81417a().mo34884a(this.challengeInfo, Challenge.class);
            }
            return this.challenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public void init() {
        if (this.stream_url != null) {
            this.stream_url.validatePullUrl();
            if (this.stream_url.getLiveCoreSDKData() != null) {
                this.stream_url.validateMultiPullData();
            }
        }
    }

    public boolean isPullUrlValid() {
        if (this.stream_url == null || TextUtils.isEmpty(this.stream_url.rtmp_pull_url)) {
            return false;
        }
        return true;
    }

    public String getMultiStreamData() {
        if (this.stream_url == null || this.stream_url.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getPullData() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.stream_url == null || this.stream_url.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getDefaultQuality().sdkKey;
    }

    public LiveRoomStruct roomStructConstructor() {
        LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        if (this.stream_url != null) {
            streamUrlStruct.liveCoreSDKData = this.stream_url.liveCoreSDKData;
            streamUrlStruct.liveStreamUrlExtra = getStreamUrlExtraSafely();
            streamUrlStruct.mCandidateResolutionList = this.stream_url.candidateResolution;
            streamUrlStruct.mDefaultResolution = this.stream_url.defaultResolution;
            streamUrlStruct.mFlvPullUrlMap = this.stream_url.flvPullUrl;
            streamUrlStruct.provider = this.stream_url.provider;
            streamUrlStruct.rtmp_pull_url = this.stream_url.rtmp_pull_url;
            streamUrlStruct.rtmp_push_url = this.stream_url.rtmp_push_url;
            streamUrlStruct.sid = this.stream_url.f79735id;
            streamUrlStruct.sdkParams = getSdkParams();
        }
        User user = new User();
        if (this.owner != null) {
            user.setUid(String.valueOf(this.owner.f79736id));
            user.setSecUid(this.owner.secUid);
            user.setShortId(String.valueOf(this.owner.shortId));
            user.setNickname(this.owner.nickname);
            user.setAvatarLarger(this.owner.avatarLarger);
            user.setAvatarMedium(this.owner.avatarMedium);
            user.setAvatarThumb(this.owner.avatarThumb);
            if (this.owner.followInfo != null) {
                user.setFollowStatus((int) this.owner.followInfo.followStatus);
            }
            user.setUniqueId(this.owner.uniqueId);
        }
        if (this.roomStas != null) {
            liveRoomStruct.total_user = this.roomStas.totalUser;
        }
        liveRoomStruct.f79734id = this.f79737id;
        liveRoomStruct.status = this.status;
        liveRoomStruct.owner = user;
        liveRoomStruct.title = this.title;
        liveRoomStruct.user_count = this.user_count;
        liveRoomStruct.roomCover = this.roomCover;
        liveRoomStruct.liveTypeAudio = this.liveTypeAudio;
        liveRoomStruct.isThirdParty = this.isThirdParty;
        liveRoomStruct.isScreenshot = this.isScreenshot;
        liveRoomStruct.isOfficialType = this.isOfficialType;
        liveRoomStruct.ownerUserId = this.ownerUserId;
        liveRoomStruct.videoFeedTag = this.videoFeedTag;
        liveRoomStruct.withLinkmic = this.withLinkmic;
        liveRoomStruct.stream_url = streamUrlStruct;
        liveRoomStruct.clientVersion = this.clientVersion;
        liveRoomStruct.platform = this.platform;
        liveRoomStruct.tvStationRoomStruct = this.tvStationRoomStruct;
        liveRoomStruct.challengeInfo = this.challengeInfo;
        liveRoomStruct.roomLayout = this.roomLayout;
        liveRoomStruct.contentLabel = this.contentLabel;
        liveRoomStruct.operationLabel = this.operationLabel;
        liveRoomStruct.contentTag = this.contentTag;
        return liveRoomStruct;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NewLiveRoomStruct{mUserFrom=");
        sb.append(this.mUserFrom);
        sb.append(", mRequestId='");
        sb.append(this.mRequestId);
        sb.append('\'');
        sb.append(", status_code=");
        sb.append(this.status_code);
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", status_msg='");
        sb.append(this.status_msg);
        sb.append('\'');
        sb.append(", prompts='");
        sb.append(this.prompts);
        sb.append('\'');
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", roomType=");
        sb.append(this.roomType);
        sb.append(", id=");
        sb.append(this.f79737id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", user_count=");
        sb.append(this.user_count);
        sb.append(", roomCover=");
        sb.append(this.roomCover);
        sb.append(", liveTypeAudio=");
        sb.append(this.liveTypeAudio);
        sb.append(", isThirdParty=");
        sb.append(this.isThirdParty);
        sb.append(", isScreenshot=");
        sb.append(this.isScreenshot);
        sb.append(", isOfficialType=");
        sb.append(this.isOfficialType);
        sb.append(", ownerUserId=");
        sb.append(this.ownerUserId);
        sb.append(", videoFeedTag='");
        sb.append(this.videoFeedTag);
        sb.append('\'');
        sb.append(", withLinkmic=");
        sb.append(this.withLinkmic);
        sb.append(", stream_url=");
        sb.append(this.stream_url);
        sb.append(", clientVersion='");
        sb.append(this.clientVersion);
        sb.append('\'');
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", tvStationRoomStruct=");
        sb.append(this.tvStationRoomStruct);
        sb.append(", errorMsg='");
        sb.append(this.errorMsg);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setChallengeInfo(String str) {
        this.challengeInfo = str;
    }

    public void setContentLabel(LiveImageModel liveImageModel) {
        this.contentLabel = liveImageModel;
    }

    public void setContentTag(String str) {
        this.contentTag = str;
    }

    public void setOperationLabel(LiveImageModel liveImageModel) {
        this.operationLabel = liveImageModel;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public static boolean isValid(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct == null || newLiveRoomStruct.f79737id <= 0 || newLiveRoomStruct.owner == null) {
            return false;
        }
        return true;
    }

    public String getSdkParams(String str) {
        if (this.stream_url == null) {
            return null;
        }
        return (String) this.stream_url.sdkParamsMap.get(str);
    }
}
