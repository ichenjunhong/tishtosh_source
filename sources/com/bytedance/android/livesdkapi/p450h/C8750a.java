package com.bytedance.android.livesdkapi.p450h;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.h.a */
public final class C8750a {
    /* renamed from: b */
    public static Bundle m17219b(Room room) {
        Bundle bundle = new Bundle();
        if (room != null) {
            bundle.putLong("live.intent.extra.ROOM_ID", room.getId());
            bundle.putString("live.intent.extra.PULL_STREAM_URL", room.buildPullUrl());
            bundle.putString("live.intent.extra.PULL_SDK_PARAMS", room.getSdkParams());
            bundle.putString("live.intent.extra.PULL_STREAM_DATA", room.getMultiStreamData());
            bundle.putString("live.intent.extra.PULL_DEFAULT_RESOLUTION", room.getMultiStreamDefaultQualitySdkKey());
            C8726a aVar = room.getStreamUrlExtraSafely().f23984n;
            if (aVar != null) {
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", aVar.f23992a);
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", aVar.f23993b);
                bundle.putInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", aVar.f23994c);
            }
            bundle.putInt("live.intent.extra.STREAM_TYPE", room.getStreamType().ordinal());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m17218a(Room room) {
        Bundle bundle = new Bundle();
        if (room != null) {
            bundle.putLong("live.intent.extra.ROOM_ID", room.getId());
            if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null)) {
                bundle.putStringArrayList("live.intent.extra.BG_URLS", new ArrayList(room.getOwner().getAvatarThumb().getUrls()));
            }
            bundle.putString("live.intent.extra.REQUEST_ID", room.getRequestId());
            bundle.putString("live.intent.extra.LOG_PB", room.getLog_pb());
            bundle.putString("live.intent.extra.SOURCE_EXTRA", room.getSourceType());
            if (!(C8830k.m17330d() == null || C8830k.m17330d().mo15050c() == null || C8830k.m17330d().mo15050c().getCurrentRoom() == null)) {
                Room currentRoom = C8830k.m17330d().mo15050c().getCurrentRoom();
                bundle.putLong("live.intent.extra.USER_FROM", currentRoom.getUserFrom());
                bundle.putBoolean("live.intent.extra.IS_THIRD_PARTY", currentRoom.isThirdParty);
            }
            bundle.putString("live.intent.extra.ROOM_LABELS", room.getLabels());
            bundle.putString("live.intent.extra.PULL_STREAM_URL", room.buildPullUrl());
            bundle.putString("live.intent.extra.PULL_SDK_PARAMS", room.getSdkParams());
            bundle.putString("live.intent.extra.PULL_STREAM_DATA", room.getMultiStreamData());
            bundle.putString("live.intent.extra.PULL_DEFAULT_RESOLUTION", room.getMultiStreamDefaultQualitySdkKey());
            C8726a aVar = room.getStreamUrlExtraSafely().f23984n;
            if (aVar != null) {
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", aVar.f23992a);
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", aVar.f23993b);
                bundle.putInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", aVar.f23994c);
            }
            bundle.putInt("live.intent.extra.STREAM_TYPE", room.getStreamType().ordinal());
            bundle.putString("live.intent.extra.PRIVATE_INFO", room.getPrivateInfo());
            bundle.putLong("anchor_id", room.getOwnerUserId());
        }
        return bundle;
    }
}
