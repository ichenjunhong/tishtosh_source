package com.bytedance.android.live.gift;

import android.app.Dialog;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.gift.p246a.p247a.C4118a;
import com.bytedance.android.live.gift.p248b.C4122a;
import com.bytedance.android.live.gift.p248b.C4123b;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5180az;
import com.bytedance.android.livesdk.chatroom.p325ui.C5929ah;
import com.bytedance.android.livesdk.chatroom.presenter.C5897x;
import com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.C7624q;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7201a;
import com.bytedance.android.livesdk.gift.assets.C7209f;
import com.bytedance.android.livesdk.gift.assets.C7210g;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.effect.video.p374a.C7444c;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p353a.C7192a;
import com.bytedance.android.livesdk.gift.p353a.C7193b;
import com.bytedance.android.livesdk.gift.p353a.C7200e;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.message.C7772a;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.p397b.C7777a;
import com.bytedance.android.livesdk.message.p397b.C7781d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdk.p399o.p402c.C8063n;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8640b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.socialbase.downloader.downloader.C19895g;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.ugc.live.p2595a.p2596a.C51582e;
import com.p683ss.ugc.live.p2595a.p2596a.C51582e.C51584a;
import com.p683ss.ugc.live.p2595a.p2596a.C51588f;
import com.p683ss.ugc.live.p2595a.p2596a.p2597a.C51558a;
import com.p683ss.ugc.live.p2595a.p2596a.p2600d.C51580e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;

public class GiftService implements IGiftService {
    public void clearGiftIconBitmapCache() {
    }

    public Fragment createLiveGiftAdFragment() {
        return null;
    }

    public C7211h getAssetsManager() {
        return C7209f.m14962a("effects");
    }

    public Widget getGiftWidget() {
        return new GiftWidget();
    }

    public C8640b getLiveGiftPlayControllerManager() {
        return giftPlayControllerManager();
    }

    public void removeMonkeyGameEngine() {
        C4127e.m10264a().f11317a = null;
    }

    public C7505d getFastGift() {
        return GiftManager.inst().getFastGift();
    }

    public C7505d getRedEnvelopeGift() {
        return GiftManager.inst().getRedEnvelopeGift();
    }

    public List<C7505d> getStickerGifts() {
        return GiftManager.inst().getStickerGifts();
    }

    public void syncGiftList() {
        GiftManager.inst().syncGiftList(1);
    }

    public C8640b giftPlayControllerManager() {
        if (C7444c.f20420a == null) {
            C7444c.f20420a = new C7444c(((IHostContext) C4116c.m10249a(IHostContext.class)).context(), (IHostPlugin) C4116c.m10249a(IHostPlugin.class));
        }
        return C7444c.f20420a;
    }

    public void clearAssets(String str) {
        C7209f.m14962a(str).mo13425a();
    }

    public C7772a getAssetsInterceptor(boolean z) {
        return new C7777a(z);
    }

    public C4122a getGiftGuidePresenter(DataCenter dataCenter) {
        return new C5897x(dataCenter);
    }

    public C8063n getSendGiftResultLog(C7514m mVar) {
        return C7519o.m15513a(mVar);
    }

    public void registerMonkeyGameEngine(C4118a aVar) {
        C4127e.m10264a().f11317a = aVar;
    }

    public void removeTemporaryFastGift(long j) {
        GiftManager.inst().removeTemporaryFastGift(j);
    }

    public void setTemporaryFastGift(long j) {
        GiftManager.inst().setTemporaryFastGift(j);
    }

    public void syncGiftList(int i) {
        GiftManager.inst().syncGiftList(i);
    }

    public C7505d findGiftById(long j) {
        return GiftManager.inst().findGiftById(j);
    }

    public void removeAnimationEngine(C4121b bVar) {
        C4117a a = C4117a.m10252a();
        if (a.f11314a.containsKey(bVar)) {
            C4125c cVar = (C4125c) a.f11314a.get(bVar);
            if (cVar != null) {
                cVar.mo8665a();
            }
            a.f11314a.remove(bVar);
        }
    }

    public void onTurnTableUrlEmpty(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        C3837e.m9743a(C7647s.m15652b("ttlive_turn_table_url_empty"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_turn_table_url_empty", 1, (Map) hashMap);
    }

    public void initGiftResourceManager(Context context) {
        if (!C7192a.f19551a) {
            C19895g gVar = new C19895g(context);
            gVar.f54694g = new C7193b();
            Downloader.init(gVar);
            C7192a.f19551a = true;
        }
        C51584a aVar = new C51584a(context);
        aVar.f128848b = new C7200e();
        aVar.f128847a = new C7201a(context);
        aVar.f128852f = 5;
        aVar.f128851e = 3;
        if (aVar.f128847a == null) {
            aVar.f128847a = new C51558a(aVar.f128853g);
        }
        if (aVar.f128848b == null) {
            aVar.f128848b = new C51580e();
        }
        C51582e eVar = new C51582e(aVar);
        if (C51588f.f128855a == null) {
            C51588f.f128855a = new C51588f(eVar);
        }
    }

    public C7772a getGiftInterceptor(long j, boolean z) {
        return new C7781d(j, z);
    }

    public void syncAssetsList(String str, int i) {
        C7209f.m14962a(str).mo13426a(i);
    }

    public AssetsModel getAssets(String str, long j) {
        return C7209f.m14962a(str).mo13434c(j);
    }

    public String getAssetsPath(String str, long j) {
        return C7209f.m14962a(str).mo13432b(j);
    }

    public boolean isAssetsDownloaded(String str, long j) {
        return C7209f.m14962a(str).mo13431a(j);
    }

    public void openGiftDialog(String str, boolean z) {
        C7595ao aoVar;
        C4495a a = C4495a.m10823a();
        if ("gift".equals(str)) {
            aoVar = C7595ao.GIFT;
        } else {
            aoVar = C7595ao.PROP;
        }
        a.mo10301a((Object) new C5180az(aoVar, z));
    }

    public void sendGift(String str, boolean z) {
        C7595ao aoVar;
        C4495a a = C4495a.m10823a();
        if ("gift".equals(str)) {
            aoVar = C7595ao.GIFT;
        } else {
            aoVar = C7595ao.PROP;
        }
        a.mo10301a((Object) new C5180az(aoVar, z));
    }

    public void setGiftAnimationEngine(C4121b bVar, C4125c cVar) throws Exception {
        C4117a a = C4117a.m10252a();
        if (!a.f11314a.containsKey(bVar)) {
            a.f11314a.put(bVar, cVar);
            return;
        }
        StringBuilder sb = new StringBuilder("GiftType ");
        sb.append(bVar.toString());
        sb.append(" already has been set, or you should call release firstly.");
        throw new Exception(sb.toString());
    }

    public boolean showGiftIcon(Room room, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        long b = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b();
        Boolean bool = (Boolean) LiveSettingKeys.HIDE_GIFT_ICON_FOR_USER.mo9431a();
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || b > 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            return false;
        }
        int a = C7624q.m15618a(room, z);
        if (a == 0 || a == 3 || a == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean b2 = C7624q.m15620b(room, z);
        if (z4 || b2) {
            return true;
        }
        return false;
    }

    public C7810ao getGiftMessage(long j, C7514m mVar, User user) {
        return C7519o.m15511a(j, mVar, user);
    }

    public void sendGiftInternal(long j, int i, C4126d dVar) {
        GiftManager.inst().sendGiftInternal(j, i, dVar);
    }

    public void downloadAssets(String str, long j, C7210g gVar, int i) {
        C7209f.m14962a(str).mo13428a(j, gVar, i);
    }

    public C2201v<C4177d<C7514m>> sendGift(long j, long j2, long j3, int i) {
        return ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(j, j2, j3, i);
    }

    public void syncGiftList(C4128f fVar, long j, int i, boolean z) {
        GiftManager.inst().syncGiftList(fVar, j, i, z);
    }

    public Dialog getGiftGuideDialog(Context context, Room room, C3009i iVar, C4123b bVar, long j, String str, long j2, String str2, DataCenter dataCenter) {
        C5929ah ahVar = new C5929ah(context, room, iVar, bVar, j, str, j2, str2, dataCenter);
        return ahVar;
    }
}
