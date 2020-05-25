package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class amp implements C15948hq<ama> {

    /* renamed from: a */
    private final /* synthetic */ amn f40991a;

    amp(amn amn) {
        this.f40991a = amn;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f40991a) {
                        if (this.f40991a.f40965a != parseInt) {
                            this.f40991a.f40965a = parseInt;
                            this.f40991a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    abv.m32795c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
