package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.te */
final class C16260te implements C15948hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C15832dj f45588a;

    /* renamed from: b */
    private final /* synthetic */ C16256ta f45589b;

    C16260te(C16256ta taVar, C15832dj djVar) {
        this.f45589b = taVar;
        this.f45588a = djVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = (String) map.get("asset");
        C16256ta taVar = this.f45589b;
        C15832dj djVar = this.f45588a;
        try {
            C15900fw c = taVar.f45569b.mo27530c(djVar.mo30921c());
            if (c != null) {
                c.mo31078a(djVar, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            abv.m32795c(sb.toString(), e);
        }
    }
}
