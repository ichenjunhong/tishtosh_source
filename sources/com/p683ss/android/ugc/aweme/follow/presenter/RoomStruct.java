package com.p683ss.android.ugc.aweme.follow.presenter;

import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.RoomStruct */
public class RoomStruct extends LiveRoomStruct {
    public static C8710m getStreamType(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct.isScreenshot) {
            return C8710m.SCREEN_RECORD;
        }
        if (liveRoomStruct.isThirdParty) {
            return C8710m.THIRD_PARTY;
        }
        if (liveRoomStruct.liveTypeAudio) {
            return C8710m.AUDIO;
        }
        return C8710m.VIDEO;
    }

    public static RoomStruct fromAweme(Aweme aweme) {
        UrlModel urlModel;
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.owner = aweme.getAuthor();
        if (roomStruct.owner != null) {
            roomStruct.f79734id = roomStruct.owner.roomId;
        }
        if (aweme.getRoom() != null) {
            roomStruct.f79734id = aweme.getRoom().roomId;
            roomStruct.tvStationRoomStruct = aweme.getRoom().tvStationRoomStruct;
        }
        if (aweme.getAuthor() != null) {
            if (aweme.getAuthor().roomCover != null) {
                urlModel = aweme.getAuthor().roomCover;
            } else {
                urlModel = aweme.getAuthor().getAvatarThumb();
            }
            roomStruct.roomCover = urlModel;
        }
        if (aweme.getStreamUrlModel() != null) {
            roomStruct.stream_url = new StreamUrlStruct();
            roomStruct.stream_url.rtmp_pull_url = aweme.getStreamUrlModel().rtmpPullUrl;
        }
        roomStruct.isOfficialType = false;
        roomStruct.isScreenshot = false;
        roomStruct.isThirdParty = false;
        roomStruct.liveTypeAudio = false;
        if (aweme.getVideoFeedTag() != null) {
            roomStruct.videoFeedTag = aweme.getVideoFeedTag();
        }
        return roomStruct;
    }
}
