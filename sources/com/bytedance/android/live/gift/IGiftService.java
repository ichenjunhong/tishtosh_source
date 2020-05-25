package com.bytedance.android.live.gift;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.p246a.p247a.C4118a;
import com.bytedance.android.live.gift.p248b.C4122a;
import com.bytedance.android.live.gift.p248b.C4123b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7210g;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.message.C7772a;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p399o.p402c.C8063n;
import com.bytedance.android.livesdkapi.depend.live.C8648g;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8640b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.List;
import p064c.p065a.C2201v;

public interface IGiftService extends C8648g {
    void clearAssets(String str);

    void clearGiftIconBitmapCache();

    void downloadAssets(String str, long j, C7210g gVar, int i);

    C7505d findGiftById(long j);

    AssetsModel getAssets(String str, long j);

    C7772a getAssetsInterceptor(boolean z);

    C7211h getAssetsManager();

    String getAssetsPath(String str, long j);

    C7505d getFastGift();

    Dialog getGiftGuideDialog(Context context, Room room, C3009i iVar, C4123b bVar, long j, String str, long j2, String str2, DataCenter dataCenter);

    C4122a getGiftGuidePresenter(DataCenter dataCenter);

    C7772a getGiftInterceptor(long j, boolean z);

    C7810ao getGiftMessage(long j, C7514m mVar, User user);

    Widget getGiftWidget();

    C7505d getRedEnvelopeGift();

    C8063n getSendGiftResultLog(C7514m mVar);

    List<C7505d> getStickerGifts();

    C8640b giftPlayControllerManager();

    boolean isAssetsDownloaded(String str, long j);

    void onTurnTableUrlEmpty(String str);

    void openGiftDialog(String str, boolean z);

    void registerMonkeyGameEngine(C4118a aVar);

    void removeAnimationEngine(C4121b bVar);

    void removeMonkeyGameEngine();

    void removeTemporaryFastGift(long j);

    C2201v<C4177d<C7514m>> sendGift(long j, long j2, long j3, int i);

    void sendGiftInternal(long j, int i, C4126d dVar);

    void setGiftAnimationEngine(C4121b bVar, C4125c cVar) throws Exception;

    void setTemporaryFastGift(long j);

    boolean showGiftIcon(Room room, boolean z);

    void syncAssetsList(String str, int i);

    void syncGiftList(int i);

    void syncGiftList(C4128f fVar, long j, int i, boolean z);
}
