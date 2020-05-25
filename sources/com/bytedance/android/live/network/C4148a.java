package com.bytedance.android.live.network;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p223b.C3830b;
import com.bytedance.android.live.core.setting.C4098q;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.network.C4154c.C4155a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p279af.C4623x;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.live.network.a */
final class C4148a implements C4154c {

    /* renamed from: a */
    private final String[] f11328a = {"CN", "MR", "SA", "FR", "AE"};

    C4148a() {
    }

    /* renamed from: a */
    public final C4155a mo9546a(C4155a aVar) {
        String str = aVar.f11332a;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            m10309a(sb);
            aVar.f11332a = sb.toString();
        }
        return aVar;
    }

    /* renamed from: a */
    private void m10309a(StringBuilder sb) {
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mo9547a((Map<String, String>) linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        sb.append(C4156d.m10321a((List<Pair<String, String>>) arrayList, "UTF-8"));
    }

    /* renamed from: a */
    public final void mo9547a(Map<String, String> map) {
        Locale locale;
        map.put("webcast_sdk_version", "1510");
        if (C4116c.m10249a(IHostContext.class) != null) {
            locale = ((IHostContext) C4116c.m10249a(IHostContext.class)).currentLocale();
        } else {
            locale = null;
        }
        map.put("webcast_language", C3830b.m9703a(locale));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (C4098q.m10218a() && !C4623x.m11086a()) {
            int intValue = ((Integer) CoreSettingKeys.TEST_FAKE_REGION.mo9431a()).intValue();
            String str = "";
            if (intValue >= 0 && intValue < this.f11328a.length) {
                str = this.f11328a[intValue];
            }
            map.put("fake_region", str);
        }
    }
}
