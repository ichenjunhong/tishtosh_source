package com.bytedance.android.livesdk.live.model;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RaceConfigInfo {
    @C17952c(mo34828a = "top_bg_url")
    public List<String> bgUrls;
    @C17952c(mo34828a = "race_anchor_ids")
    public List<Long> raceAnchorIds;

    /* renamed from: com.bytedance.android.livesdk.live.model.RaceConfigInfo$a */
    static class C7756a {

        /* renamed from: a */
        public static RaceConfigInfo f21319a = new RaceConfigInfo();
    }

    public static RaceConfigInfo getDefaultInstance() {
        return C7756a.f21319a;
    }

    public boolean isGameRaceRoom(Room room) {
        boolean z = false;
        if (room == null || C9376b.m18558a((Collection<T>) this.raceAnchorIds)) {
            return false;
        }
        Iterator it = this.raceAnchorIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Long l = (Long) it.next();
            if (l != null && l.longValue() == room.getOwnerUserId()) {
                z = true;
                break;
            }
        }
        return z;
    }
}
