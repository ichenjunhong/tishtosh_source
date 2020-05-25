package com.bytedance.android.livesdkapi.depend.live;

import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdkapi.depend.live.k */
public interface C8661k extends C2952b {
    Room getCurrentRoom();

    C2180b<Long> getLiveWatchTime();

    boolean isInteracting();

    void recordEnterStart(C8638a aVar);

    void registerInteractStateChangeListener(C8646e eVar);

    void removeInteractStateChangeListener(C8646e eVar);

    void setCurrentRoom(Room room);
}
