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

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct */
public class LiveRoomStruct extends C23453a implements C22982e, Serializable {
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
    @C17952c(mo34828a = "additional_stream_url")
    public StreamUrlStruct additional_stream_url;
    public Challenge challenge;
    @C17952c(mo34828a = "challenge_info")
    public String challengeInfo;
    @C17952c(mo34828a = "client_version")
    public String clientVersion;
    @C17952c(mo34828a = "coins")
    public int coins;
    @C17952c(mo34828a = "content_label")
    public LiveImageModel contentLabel;
    @C17952c(mo34828a = "content_tag")
    public String contentTag;
    @C17952c(mo34828a = "create_time")
    public long create_time;
    @C17952c(mo34828a = "digg_count")
    public int digg_count;
    @C17952c(mo34828a = "distance")
    public String distance;
    public String errorMsg;
    @C17952c(mo34828a = "finish_time")
    public long finish_time;
    public int fromInnerPush;
    @C17952c(mo34828a = "room_id", mo34829b = {"id"})

    /* renamed from: id */
    public long f79734id;
    @C17952c(mo34828a = "in_sandbox")
    public boolean inSandbox;
    @C17952c(mo34828a = "live_type_official")
    public boolean isOfficialType;
    @C17952c(mo34828a = "live_type_screenshot")
    public boolean isScreenshot;
    @C17952c(mo34828a = "live_type_third_party")
    public boolean isThirdParty;
    @C17952c(mo34828a = "live_total_time")
    public long liveTotalTime;
    @C17952c(mo34828a = "live_type_audio")
    public boolean liveTypeAudio;
    public String mRequestId;
    public long mUserFrom;
    public String message;
    @C17952c(mo34828a = "new_fans_count")
    public int newFansCount;
    @C17952c(mo34828a = "operation_label")
    public LiveImageModel operationLabel;
    @C17952c(mo34828a = "owner")
    public User owner;
    @C17952c(mo34828a = "owner_user_id")
    public long ownerUserId;
    @C17952c(mo34828a = "os_type")
    public int platform;
    public String prompts;
    @C17952c(mo34828a = "activity")
    public RoomBuilding roomActivity;
    @C17952c(mo34828a = "room_cover", mo34829b = {"cover"})
    public UrlModel roomCover;
    @C17952c(mo34828a = "room_layout")
    public int roomLayout;
    public int roomType = 3;
    @C17952c(mo34828a = "room_type_tag")
    public String roomTypeTag;
    @C17952c(mo34828a = "share_info")
    public ShareStruct share_info;
    @C17952c(mo34828a = "status")
    public int status;
    public int status_code;
    public String status_msg;
    @C17952c(mo34828a = "stream_id")
    public long stream_id;
    @C17952c(mo34828a = "stream_url")
    public StreamUrlStruct stream_url;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "total_user")
    public int total_user;
    @C17952c(mo34828a = "total_user_count")
    public int total_user_count;
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

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public boolean isMediaRoom() {
        if (this.roomLayout == 1) {
            return true;
        }
        return false;
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        if (this.stream_url == null) {
            return null;
        }
        return this.stream_url.liveStreamUrlExtra;
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

    public long getAnchorId() {
        if (this.owner == null || TextUtils.isEmpty(this.owner.getUid())) {
            return 0;
        }
        return Long.parseLong(this.owner.getUid());
    }

    public Challenge getChallenge() {
        try {
            if (this.challenge != null) {
                return this.challenge;
            }
            this.challenge = ((LiveChallenge) C36061c.m81417a().mo34884a(this.challengeInfo, LiveChallenge.class)).toAwemeChallenge();
            return this.challenge;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isPullUrlValid() {
        if (this.stream_url == null || TextUtils.isEmpty(this.stream_url.rtmp_pull_url)) {
            return false;
        }
        return true;
    }

    public String getMultiStreamData() {
        if (this.stream_url == null || this.stream_url.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.stream_url == null || this.stream_url.liveCoreSDKData == null || this.stream_url.liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveRoomStruct{mUserFrom=");
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
        sb.append(this.f79734id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", user_count=");
        sb.append(this.user_count);
        sb.append(", create_time=");
        sb.append(this.create_time);
        sb.append(", finish_time=");
        sb.append(this.finish_time);
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", additional_stream_url=");
        sb.append(this.additional_stream_url);
        sb.append(", share_info=");
        sb.append(this.share_info);
        sb.append(", digg_count=");
        sb.append(this.digg_count);
        sb.append(", coins=");
        sb.append(this.coins);
        sb.append(", inSandbox=");
        sb.append(this.inSandbox);
        sb.append(", total_user_count=");
        sb.append(this.total_user_count);
        sb.append(", roomActivity=");
        sb.append(this.roomActivity);
        sb.append(", roomCover=");
        sb.append(this.roomCover);
        sb.append(", roomTypeTag='");
        sb.append(this.roomTypeTag);
        sb.append('\'');
        sb.append(", newFansCount=");
        sb.append(this.newFansCount);
        sb.append(", liveTypeAudio=");
        sb.append(this.liveTypeAudio);
        sb.append(", isThirdParty=");
        sb.append(this.isThirdParty);
        sb.append(", isScreenshot=");
        sb.append(this.isScreenshot);
        sb.append(", isOfficialType=");
        sb.append(this.isOfficialType);
        sb.append(", liveTotalTime=");
        sb.append(this.liveTotalTime);
        sb.append(", ownerUserId=");
        sb.append(this.ownerUserId);
        sb.append(", videoFeedTag='");
        sb.append(this.videoFeedTag);
        sb.append('\'');
        sb.append(", withLinkmic=");
        sb.append(this.withLinkmic);
        sb.append(", distance='");
        sb.append(this.distance);
        sb.append('\'');
        sb.append(", stream_url=");
        sb.append(this.stream_url);
        sb.append(", clientVersion='");
        sb.append(this.clientVersion);
        sb.append('\'');
        sb.append(", platform=");
        sb.append(this.platform);
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

    public static boolean isValid(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct == null || liveRoomStruct.f79734id <= 0 || liveRoomStruct.owner == null) {
            return false;
        }
        return true;
    }
}
