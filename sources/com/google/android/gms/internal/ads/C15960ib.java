package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ib */
public final class C15960ib implements C15948hq<Object> {

    /* renamed from: a */
    private final Context f45057a;

    public C15960ib(Context context) {
        this.f45057a = context;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        if (C14963ax.m30849s().mo28557a(this.f45057a)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c = 1;
                    }
                } else if (str.equals("_ac")) {
                    c = 0;
                }
            } else if (str.equals("_aa")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    C14963ax.m30849s().mo28561c(this.f45057a, str2);
                    return;
                case 1:
                    C14963ax.m30849s().mo28563d(this.f45057a, str2);
                    return;
                case 2:
                    C14963ax.m30849s().mo28554a(this.f45057a, "_aa", str2, (Bundle) null);
                    return;
                default:
                    abv.m32794c("logScionEvent gmsg contained unsupported eventName");
                    return;
            }
        }
    }
}
