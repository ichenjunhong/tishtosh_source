package com.bytedance.android.live.livepullstream;

import android.content.Context;
import android.os.Bundle;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.p249a.C4134a;
import com.bytedance.android.live.livepullstream.p249a.C4136b;
import com.bytedance.android.live.livepullstream.p249a.C4138c;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.livepullstream.p250b.C4147d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4179a;
import com.bytedance.android.live.room.C4181b;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.livesdk.chatroom.detail.C5058a;
import com.bytedance.android.livesdk.chatroom.detail.C5078l;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.p160b.C2831a;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.bytedance.android.p160b.C2833b;

public class PullStreamService implements C4139d {
    public PullStreamService() {
        C4116c.m10251a(C4139d.class, this);
    }

    public C4134a getCpuInfoFetcher() {
        return C4147d.m10295f().mo9532e();
    }

    public C4181b getDnsOptimizer() {
        return C4147d.m10295f().mo9530c();
    }

    public C4136b getGpuInfoFetcher() {
        return C4147d.m10295f().mo9531d();
    }

    public C4189h getLivePlayController() {
        return C4147d.m10295f().mo9528a();
    }

    public C4138c getLivePlayerLog() {
        return C4147d.m10295f().mo9529b();
    }

    public String getProjectKey() {
        if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
            return "musically_live";
        }
        return "tiktok_live";
    }

    public C4179a getAudioFocusController(C8649h hVar) {
        return new C5058a(hVar);
    }

    public void recycleRoomPlayer(String str) {
        C5078l a = C5078l.m11603a();
        if (str != null) {
            C2833b a2 = a.mo10972a(str);
            if (a2 != null) {
                a.mo10973a(a2);
            }
        }
    }

    public void stopRoomPlayer(String str, boolean z) {
        C5078l a = C5078l.m11603a();
        if (str != null) {
            C2833b a2 = a.mo10972a(str);
            if (a2 != null) {
                a2.stop(z);
            }
        }
    }

    public C2833b warmUp(Room room, Context context) {
        C5078l a = C5078l.m11603a();
        if (room == null || C5078l.m11606b()) {
            return null;
        }
        return a.mo10971a(room.getId(), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().f23984n, room.getStreamType());
    }

    public C2833b warmUp(long j, Bundle bundle, Context context) {
        C5078l a = C5078l.m11603a();
        if (C5078l.m11606b() || bundle == null) {
            return null;
        }
        if (bundle == null) {
            bundle = null;
        } else {
            Bundle bundle2 = bundle.getBundle("live.intent.extra.WARM_UP_ROOM_ARGS");
            if (bundle2 != null) {
                bundle.remove("live.intent.extra.WARM_UP_ROOM_ARGS");
                bundle = bundle2;
            }
        }
        String string = bundle.getString("live.intent.extra.PULL_STREAM_URL");
        String string2 = bundle.getString("live.intent.extra.PULL_STREAM_DATA");
        String string3 = bundle.getString("live.intent.extra.PULL_DEFAULT_RESOLUTION");
        C8710m valueOf = C8710m.valueOf(bundle.getInt("live.intent.extra.STREAM_TYPE", 0));
        return a.mo10971a(j, context, string, bundle.getString("live.intent.extra.PULL_SDK_PARAMS"), string2, string3, new C8726a(bundle.getBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", false), bundle.getBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", false), bundle.getInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", 0)), valueOf);
    }

    public C2831a createRoomPlayer(String str, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str2) {
        RoomPlayer roomPlayer = new RoomPlayer(str, mVar, aVar, textureView, aVar2, context, str2);
        return roomPlayer;
    }

    public C2831a createRoomPlayer(String str, String str2, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context) {
        RoomPlayer roomPlayer = new RoomPlayer(str, str2, mVar, aVar, textureView, aVar2, context);
        return roomPlayer;
    }

    public C2831a ensureRoomPlayer(long j, String str, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str2, String str3) {
        TextureView textureView2 = textureView;
        C2832a aVar3 = aVar2;
        Context context2 = context;
        C5078l a = C5078l.m11603a();
        if (C5078l.m11606b()) {
            return ((C4139d) C4116c.m10249a(C4139d.class)).createRoomPlayer(str, mVar, aVar, textureView, aVar2, context, str2);
        }
        C2833b a2 = a.mo10972a(str3);
        if (a2 != null) {
            a2.attach(context2, textureView2, aVar3);
            return a2;
        }
        Context context3 = context2;
        C2833b b = a.mo10974b(j, context, str, str2, null, null, aVar, mVar);
        C5078l.m11604a(b, context3, textureView2, aVar3);
        return b;
    }

    public C2831a ensureRoomPlayer(long j, String str, String str2, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str3) {
        TextureView textureView2 = textureView;
        C2832a aVar3 = aVar2;
        Context context2 = context;
        C5078l a = C5078l.m11603a();
        if (C5078l.m11606b()) {
            return ((C4139d) C4116c.m10249a(C4139d.class)).createRoomPlayer(str, str2, mVar, aVar, textureView, aVar2, context);
        }
        C2833b a2 = a.mo10972a(str3);
        if (a2 != null) {
            a2.attach(context2, textureView2, aVar3);
            return a2;
        }
        Context context3 = context2;
        C2833b b = a.mo10974b(j, context, null, null, str, str2, aVar, mVar);
        C5078l.m11604a(b, context3, textureView2, aVar3);
        return b;
    }
}
