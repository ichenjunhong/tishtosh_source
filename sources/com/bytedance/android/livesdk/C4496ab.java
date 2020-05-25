package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.live.C8667q;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.ab */
public final class C4496ab implements C8667q {

    /* renamed from: a */
    private Map<String, C4497a> f12271a = new HashMap();

    /* renamed from: com.bytedance.android.livesdk.ab$a */
    interface C4497a {
        /* renamed from: a */
        String mo10303a();

        /* renamed from: a */
        boolean mo10304a(Map<String, String> map);
    }

    public C4496ab() {
        C8584z zVar = new C8584z();
        this.f12271a.put(zVar.mo10303a(), zVar);
    }

    /* renamed from: a */
    public final boolean mo10302a(Map<String, String> map) {
        if (this.f12271a == null) {
            return false;
        }
        Set keySet = this.f12271a.keySet();
        if (C9376b.m18558a((Collection<T>) keySet)) {
            return false;
        }
        String str = (String) map.remove("intercept");
        if (C9431p.m18664a(str) || !keySet.contains(str) || this.f12271a.get(str) == null) {
            return false;
        }
        return ((C4497a) this.f12271a.get(str)).mo10304a(map);
    }
}
