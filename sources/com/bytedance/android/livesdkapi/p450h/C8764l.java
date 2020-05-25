package com.bytedance.android.livesdkapi.p450h;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.h.l */
public final class C8764l {

    /* renamed from: com.bytedance.android.livesdkapi.h.l$a */
    static class C8766a {

        /* renamed from: a */
        public static C8764l f24032a = new C8764l();
    }

    private C8764l() {
    }

    /* renamed from: a */
    public static C8764l m17249a() {
        return C8766a.f24032a;
    }

    /* renamed from: a */
    public final Room mo15420a(long j) {
        if (C8759i.m17243b().mo15417a() == null || C8759i.m17243b().mo15417a().mo13146d() == null) {
            return null;
        }
        Room a = m17248a(C8759i.m17243b().mo15417a().mo13146d(), j);
        if (a == null) {
            a = m17248a(C8759i.m17243b().mo15417a().mo14085a(), j);
        }
        return a;
    }

    /* renamed from: a */
    private static Room m17248a(List<Room> list, long j) {
        if (C9414h.m18630a(list)) {
            return null;
        }
        for (Room room : list) {
            if (room.getId() == j) {
                return room;
            }
        }
        return null;
    }
}
