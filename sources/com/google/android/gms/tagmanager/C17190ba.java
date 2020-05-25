package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.tagmanager.ba */
final class C17190ba implements C17205b {

    /* renamed from: a */
    private final Context f48611a;

    public C17190ba(Context context) {
        this.f48611a = context;
    }

    /* renamed from: a */
    public final void mo33441a(Map<String, Object> map) {
        Object obj = map.get("gtm.url");
        if (obj == null) {
            Object obj2 = map.get("gtm");
            if (obj2 != null && (obj2 instanceof Map)) {
                obj = ((Map) obj2).get("url");
            }
        }
        if (obj != null && (obj instanceof String)) {
            String queryParameter = Uri.parse((String) obj).getQueryParameter("referrer");
            if (queryParameter != null) {
                C17228x.m42190a(this.f48611a, queryParameter);
            }
        }
    }
}
