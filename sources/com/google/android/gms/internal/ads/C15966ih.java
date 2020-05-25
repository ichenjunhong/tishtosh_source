package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ih */
public final class C15966ih implements C15948hq<Object> {

    /* renamed from: a */
    private final C15967ii f45069a;

    public C15966ih(C15967ii iiVar) {
        this.f45069a = iiVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbaz zzbaz = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbaz = new zzbaz(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                abv.m32795c("Unable to parse reward amount.", e);
            }
            this.f45069a.mo27664b(zzbaz);
        } else if ("video_start".equals(str)) {
            this.f45069a.mo27661G();
        } else {
            if ("video_complete".equals(str)) {
                this.f45069a.mo27662H();
            }
        }
    }
}
