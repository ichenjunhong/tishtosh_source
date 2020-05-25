package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ho */
final class C15946ho implements C15948hq<ama> {
    C15946ho() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        View view = (View) ama;
        DisplayMetrics a = acd.m32572a((WindowManager) ama.getContext().getSystemService("window"));
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        ama.mo29242a("locationReady", (Map<String, ?>) hashMap);
        abv.m32798e("GET LOCATION COMPILED");
    }
}
