package com.bytedance.android.livesdk.live.data;

import android.arch.lifecycle.C0198r;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.model.C7759c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class RoomStatsViewModel extends RxViewModel {

    /* renamed from: a */
    public final C0198r<Map<String, C7759c>> f21314a = new C0198r<>();

    /* renamed from: a */
    public final void mo14099a(List<Room> list) {
        if (C9414h.m18630a(list)) {
            this.f21314a.setValue(new HashMap());
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (Room room : list) {
            if (room != null) {
                linkedList.add(Long.valueOf(room.getId()));
            }
        }
        ((RoomStatApi) C4157e.m10322a().mo9550a(RoomStatApi.class)).checkRoom(TextUtils.join(",", linkedList)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7754b<Object>(this), (C1710e<? super Throwable>) new C7755c<Object>(this));
    }
}
