package com.bytedance.android.livesdk.feed.tab;

import android.support.p030v4.app.Fragment;
import com.bytedance.android.livesdk.feed.C6952h;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.tab.p349b.C7128p;
import com.bytedance.android.livesdkapi.host.C8792b;
import com.bytedance.android.livesdkapi.p450h.C8751b;
import com.bytedance.common.utility.C9414h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.tab.a */
public final class C7107a implements C8792b {
    /* renamed from: a */
    public final Fragment mo13237a(C8751b bVar) {
        return new C6952h().mo13014a(bVar);
    }

    /* renamed from: a */
    public final Map<String, Object> mo13238a(long j) {
        return m14783a(j, C7128p.m14812d().mo13185c());
    }

    /* renamed from: b */
    public final Map<String, Object> mo13239b(long j) {
        return m14783a(-1, C7128p.m14812d().f19332a.mo13252d());
    }

    /* renamed from: a */
    private static Map<String, Object> m14783a(long j, List<C6945f> list) {
        HashMap hashMap = new HashMap();
        if (C9414h.m18630a(list)) {
            return hashMap;
        }
        C6945f fVar = null;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C6945f fVar2 = (C6945f) it.next();
            if (fVar2 != null && fVar2.f19009a == j) {
                fVar = fVar2;
                break;
            }
        }
        if (fVar == null) {
            fVar = (C6945f) list.get(0);
        }
        if (fVar != null) {
            hashMap.put("feed_url", fVar.f19013e);
            hashMap.put("feed_style", Integer.valueOf(fVar.mo13132a()));
        }
        return hashMap;
    }
}
