package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p683ss.android.ugc.aweme.follow.presenter.RoomStruct;

/* renamed from: com.ss.android.ugc.aweme.utils.em */
public final class C47855em {
    /* renamed from: a */
    public static RoomStruct m103503a(Room room) {
        boolean z;
        if (room == null) {
            return null;
        }
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.f79734id = room.getId();
        roomStruct.ownerUserId = room.getOwnerUserId();
        StreamUrlStruct a = m103502a(room.getStreamUrl(), room.getMultiStreamDefaultQualitySdkKey());
        if (a == null) {
            return null;
        }
        roomStruct.stream_url = a;
        roomStruct.isThirdParty = room.isThirdParty;
        roomStruct.isScreenshot = room.isScreenshot;
        if (room.getStreamType() == C8710m.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        roomStruct.liveTypeAudio = z;
        return roomStruct;
    }

    /* renamed from: a */
    private static String m103504a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new C18087q().mo35029a(str).mo35009m().mo35025e("data").mo35025e("origin").mo35025e("main").mo35022b("flv").mo34905c();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static StreamUrlStruct m103502a(StreamUrl streamUrl, String str) {
        if (streamUrl == null) {
            return null;
        }
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        streamUrlStruct.sid = streamUrl.f23773a;
        streamUrlStruct.provider = streamUrl.f23775c;
        streamUrlStruct.rtmp_push_url = streamUrl.mo15381a();
        streamUrlStruct.rtmp_pull_url = streamUrl.f23778f;
        if (TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            LiveCoreSDKData liveCoreSDKData = streamUrl.f23787o;
            if (!(liveCoreSDKData == null || liveCoreSDKData.getPullData() == null)) {
                streamUrlStruct.rtmp_pull_url = m103504a(liveCoreSDKData.getPullData().getStreamData());
            }
        }
        if (TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) {
            return null;
        }
        streamUrlStruct.mDefaultResolution = str;
        return streamUrlStruct;
    }
}
