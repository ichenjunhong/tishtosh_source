package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class anz implements C15948hq<ama> {

    /* renamed from: a */
    private final /* synthetic */ any f41151a;

    anz(any any) {
        this.f41151a = any;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f41151a) {
                        if (this.f41151a.f41125a != parseInt) {
                            this.f41151a.f41125a = parseInt;
                            this.f41151a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    abv.m32795c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
