package com.bytedance.android.live.linkpk;

import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.p399o.p402c.C8055f;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.live.linkpk.a */
public interface C4133a extends C2952b {
    C4632d getCurrentPkState();

    C8055f getLinkCrossRoomLog();

    C2201v<C4632d> observePkState();

    void registerObserve();

    void removeObserve();
}
