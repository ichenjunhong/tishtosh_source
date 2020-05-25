package com.bytedance.android.livesdk.cov19;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.livesdk.cov19.a */
public final class C6723a {
    /* renamed from: a */
    static String m14114a(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder((String) LiveSettingKeys.LIVE_LUCKY_BOX_URL.mo9431a());
        if (map.size() <= 0) {
            return null;
        }
        sb.append("?");
        int i = 0;
        for (Entry entry : map.entrySet()) {
            i++;
            if (i > 1) {
                sb.append("&");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }
}
