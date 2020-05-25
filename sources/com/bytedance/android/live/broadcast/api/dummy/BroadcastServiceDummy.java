package com.bytedance.android.live.broadcast.api.dummy;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p194a.C3034a;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3043d;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3051b.C3052a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.broadcast.api.p197d.C3054d;
import com.bytedance.android.live.p245d.C4116c;
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

public class BroadcastServiceDummy implements IBroadcastService {
    public static boolean hasShown;

    public C3040c composerManager() {
        return null;
    }

    public C8688c convertStickerBean(Effect effect) {
        return null;
    }

    public C8601a createBgBroadcastBinder() {
        return null;
    }

    public C8677a createBgBroadcastFragment(Bundle bundle) {
        return null;
    }

    public C3054d createCoverController(Fragment fragment, Room room) {
        return null;
    }

    public C3034a createDutyGiftBaseControlPresenter(Room room, DataCenter dataCenter) {
        return null;
    }

    public Client createGuestClient(Context context, InteractConfig interactConfig) {
        return null;
    }

    public C3053c createLinkInRoomView(C3048a aVar, Context context, int i) {
        return null;
    }

    public C5280an createLinkVideoView(Context context, C3052a aVar) {
        return null;
    }

    public Fragment createLiveBroadcastFragment(C8680c cVar, Bundle bundle) {
        return null;
    }

    public LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity) {
        return null;
    }

    public C8682e createStartLiveFragment(C8832a aVar) {
        return null;
    }

    public String getLiveCoreVersion() {
        return "";
    }

    public <T> Class<T> getWidgetClass(int i) {
        return null;
    }

    public IXTBroadcastService getXTBroadcastService() {
        return null;
    }

    public boolean haveNewFilter() {
        return false;
    }

    public void init() {
    }

    public C2201v<Integer> loadShortVideoRes() {
        return null;
    }

    public C8683f startLiveManager() {
        return null;
    }

    public C3043d stickerPresenter() {
        return null;
    }

    public void updateGameMsgViewUserCount(int i) {
    }

    public BroadcastServiceDummy() {
        C4116c.m10251a(IBroadcastService.class, this);
    }
}
