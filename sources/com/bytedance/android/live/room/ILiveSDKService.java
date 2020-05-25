package com.bytedance.android.live.room;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.base.model.p190d.C2971a;
import com.bytedance.android.live.room.C4182c.C4183a;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;

public interface ILiveSDKService extends C2952b {
    C4182c createImagePicker(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, C4183a aVar);

    C4184d createInteractionFragment(int i);

    C4187f createLiveBroadcastEndFragment(boolean z);

    C4181b dnsOptimizer();

    C4190i getLottiePlayService();

    IMessageManager getMessageManager(long j, boolean z, Context context);

    C4196o getXTSDKService();

    void handleRealNameConflict(Activity activity, int i, C2971a aVar, Bundle bundle);

    C4194m hostStickerViewService();

    C4186e linkCrossRoomWidget();

    C4188g liveCommerceService();
}
