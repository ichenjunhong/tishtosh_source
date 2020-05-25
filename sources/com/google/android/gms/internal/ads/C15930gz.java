package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.gz */
public final class C15930gz implements C15948hq<ama> {
    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        C15804ci ciVar;
        ama ama = (ama) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                abv.m32798e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                abv.m32798e("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C14963ax.m30837g().mo28524b() + (Long.parseLong(str4) - C14963ax.m30837g().mo28523a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    C15805cj j = ama.mo28943j();
                    C15806ck ckVar = j.f44780b;
                    C15804ci ciVar2 = (C15804ci) j.f44779a.get(str3);
                    String[] strArr = {str2};
                    if (!(ckVar == null || ciVar2 == null)) {
                        ckVar.mo30901a(ciVar2, b, strArr);
                    }
                    Map<String, C15804ci> map2 = j.f44779a;
                    C15806ck ckVar2 = j.f44780b;
                    if (ckVar2 == null) {
                        ciVar = null;
                    } else {
                        ciVar = ckVar2.mo30898a(b);
                    }
                    map2.put(str2, ciVar);
                } catch (NumberFormatException e) {
                    abv.m32795c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                abv.m32798e("No value given for CSI experiment.");
                return;
            }
            C15806ck ckVar3 = ama.mo28943j().f44780b;
            if (ckVar3 == null) {
                abv.m32798e("No ticker for WebView, dropping experiment ID.");
            } else {
                ckVar3.mo30900a("e", str5);
            }
        } else {
            if ("extra".equals(str)) {
                String str6 = (String) map.get(LeakCanaryFileProvider.f132049i);
                String str7 = (String) map.get("value");
                if (TextUtils.isEmpty(str7)) {
                    abv.m32798e("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str6)) {
                    abv.m32798e("No name given for CSI extra.");
                } else {
                    C15806ck ckVar4 = ama.mo28943j().f44780b;
                    if (ckVar4 == null) {
                        abv.m32798e("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    ckVar4.mo30900a(str6, str7);
                }
            }
        }
    }
}
