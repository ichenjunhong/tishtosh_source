package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hb */
final /* synthetic */ class C15933hb implements C15948hq {

    /* renamed from: a */
    static final C15948hq f45026a = new C15933hb();

    private C15933hb() {
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map map) {
        amy amy = (amy) obj;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            abv.m32798e("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = amy.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((C16037ky) amy).mo29242a("openableURLs", (Map<String, ?>) hashMap);
    }
}
