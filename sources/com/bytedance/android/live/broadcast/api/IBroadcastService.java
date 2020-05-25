package com.bytedance.android.live.broadcast.api;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.broadcast.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.p194a.C3034a;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3043d;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3051b.C3052a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.broadcast.api.p197d.C3054d;
import com.bytedance.android.livesdk.chatroom.interact.C5280an;
import com.bytedance.android.livesdkapi.C8601a;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8677a;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.android.livesdkapi.p457k.C8832a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import p064c.p065a.C2201v;

public interface IBroadcastService extends C2952b {
    public static final int COPYING = 1;
    public static final int REC_COPY_DONE = 2;
    public static final String TAG_MSG_VIEW = "msg_view";
    public static final int TYPE_LINK_IN_ROOM_VIEW_AUDIO = 1;
    public static final int TYPE_LINK_IN_ROOM_VIEW_RADIO = 0;
    public static final int WIDGET_TYPE_BROADCAST_INFO = 0;
    public static final int WIDGET_TYPE_STICKER_TIP = 1;
    public static final int WIDGET_TYPE_TASK_FINISH_ANIM = 2;

    C3040c composerManager();

    C8688c convertStickerBean(Effect effect);

    C8601a createBgBroadcastBinder();

    C8677a createBgBroadcastFragment(Bundle bundle);

    C3054d createCoverController(Fragment fragment, Room room);

    C3034a createDutyGiftBaseControlPresenter(Room room, DataCenter dataCenter);

    Client createGuestClient(Context context, InteractConfig interactConfig);

    C3053c createLinkInRoomView(C3048a aVar, Context context, int i);

    C5280an createLinkVideoView(Context context, C3052a aVar);

    Fragment createLiveBroadcastFragment(C8680c cVar, Bundle bundle);

    LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity);

    C8682e createStartLiveFragment(C8832a aVar);

    String getLiveCoreVersion();

    <T> Class<T> getWidgetClass(int i);

    IXTBroadcastService getXTBroadcastService();

    boolean haveNewFilter();

    void init();

    C2201v<Integer> loadShortVideoRes();

    C8683f startLiveManager();

    C3043d stickerPresenter();

    void updateGameMsgViewUserCount(int i);
}
