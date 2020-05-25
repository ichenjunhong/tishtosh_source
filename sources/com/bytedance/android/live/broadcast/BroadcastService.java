package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p194a.C3034a;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3043d;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p197d.C3051b.C3052a;
import com.bytedance.android.live.broadcast.api.p197d.C3053c;
import com.bytedance.android.live.broadcast.api.p197d.C3054d;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.bgbroadcast.C3114c;
import com.bytedance.android.live.broadcast.dutygift.C3177f;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.p202d.C3164c;
import com.bytedance.android.live.broadcast.p202d.C3165d;
import com.bytedance.android.live.broadcast.p202d.C3166e;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.C3430b;
import com.bytedance.android.live.broadcast.p213h.C3441c.C3442a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3439a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3440b;
import com.bytedance.android.live.broadcast.p213h.p217c.C3443a;
import com.bytedance.android.live.broadcast.preview.C3537b;
import com.bytedance.android.live.broadcast.preview.C3549bl;
import com.bytedance.android.live.broadcast.share.C3621a;
import com.bytedance.android.live.broadcast.widget.BroadcastInfoWidget;
import com.bytedance.android.live.broadcast.widget.C3764d;
import com.bytedance.android.live.broadcast.widget.C3773h;
import com.bytedance.android.live.broadcast.widget.C3781o;
import com.bytedance.android.live.broadcast.widget.LinkInRoomAudioView;
import com.bytedance.android.live.broadcast.widget.LinkVideo2View;
import com.bytedance.android.live.broadcast.widget.StickerTipWidget;
import com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
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
import com.p683ss.avframework.livestreamv2.core.Guest;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import p064c.p065a.C2201v;

public class BroadcastService implements IBroadcastService {
    private C3549bl startLiveManager;

    public String getLiveCoreVersion() {
        return "6.7.0.20";
    }

    public C8601a createBgBroadcastBinder() {
        return new BgBroadcastServiceImpl();
    }

    public void init() {
        C3023a.m8461a().mo8215b();
    }

    public C2201v<Integer> loadShortVideoRes() {
        C3023a.m8461a();
        return C3023a.m8462c();
    }

    public BroadcastService() {
        C4116c.m10251a(IBroadcastService.class, this);
    }

    public C3040c composerManager() {
        return C3395f.m9156f().mo8740a();
    }

    public boolean haveNewFilter() {
        return C3266p.m8943a().mo8636d();
    }

    public C8683f startLiveManager() {
        if (this.startLiveManager == null) {
            this.startLiveManager = new C3549bl();
        }
        return this.startLiveManager;
    }

    public C3043d stickerPresenter() {
        return C3395f.m9156f().mo8741b().mo8551a();
    }

    public IXTBroadcastService getXTBroadcastService() {
        IXTBroadcastService iXTBroadcastService = (IXTBroadcastService) C3395f.m9156f().mo8743d().mo8739a(IXTBroadcastService.class);
        if (iXTBroadcastService == null) {
            return null;
        }
        return iXTBroadcastService;
    }

    public void updateGameMsgViewUserCount(int i) {
        C3764d.m9598a(i);
    }

    public C8688c convertStickerBean(Effect effect) {
        return C3287f.m9010a(effect);
    }

    public LiveActivityProxy createStartLiveActivityProxy(FragmentActivity fragmentActivity) {
        return new StartLiveActivityProxy(fragmentActivity);
    }

    public C8677a createBgBroadcastFragment(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        C3114c cVar = new C3114c();
        cVar.setArguments(bundle2);
        return cVar;
    }

    public C8682e createStartLiveFragment(C8832a aVar) {
        C3537b bVar = (C3537b) C3395f.m9156f().mo8743d().mo8739a(C3537b.class);
        if (bVar == null) {
            return null;
        }
        C3621a.f10325a = aVar;
        return bVar.mo8887a();
    }

    public <T> Class<T> getWidgetClass(int i) {
        switch (i) {
            case 0:
                return BroadcastInfoWidget.class;
            case 1:
                return StickerTipWidget.class;
            case 2:
                return TaskFinishAnimationWidget.class;
            default:
                return null;
        }
    }

    public C3054d createCoverController(Fragment fragment, Room room) {
        return new C3781o(fragment, room);
    }

    public C3034a createDutyGiftBaseControlPresenter(Room room, DataCenter dataCenter) {
        return new C3177f(room, dataCenter);
    }

    public C5280an createLinkVideoView(Context context, C3052a aVar) {
        return new LinkVideo2View(context, aVar);
    }

    public Fragment createLiveBroadcastFragment(C8680c cVar, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        C3134c cVar2 = new C3134c();
        cVar2.setArguments(bundle2);
        cVar2.f9128b = cVar;
        return cVar2;
    }

    public Client createGuestClient(Context context, InteractConfig interactConfig) {
        return (Guest) new C3430b(new C3442a(context).mo8827a(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).mo8823a((C3439a) new C3165d()).mo8824a((C3440b) new C3166e()).mo8840j(0).mo8825a((C3443a) new C3164c()).mo8829a()).mo8812a(interactConfig, true);
    }

    public C3053c createLinkInRoomView(C3048a aVar, Context context, int i) {
        if (i == 1) {
            return new LinkInRoomAudioView(context);
        }
        if (i == 0) {
            return new C3773h(aVar, context);
        }
        return null;
    }
}
