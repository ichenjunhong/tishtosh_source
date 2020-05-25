package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C15524o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C16299uq
final class aab {

    /* renamed from: a */
    static final Map<String, String> f40042a;

    /* renamed from: b */
    final Context f40043b;

    /* renamed from: c */
    final List<String> f40044c;

    /* renamed from: d */
    final C16432zo f40045d;

    aab(Context context, List<String> list, C16432zo zoVar) {
        this.f40043b = context;
        this.f40044c = list;
        this.f40045d = zoVar;
    }

    static {
        HashMap hashMap = new HashMap();
        if (C15524o.m32299g()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f40042a = hashMap;
    }
}
