package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.k */
public final class C17875k implements C17876l<Context> {
    private C17875k() {
    }

    public /* synthetic */ C17875k(byte b) {
        this();
    }

    /* renamed from: a */
    private static Bundle m43822a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
            if (serviceInfo == null) {
                return null;
            }
            return serviceInfo.metaData;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ List mo34706a(Object obj) {
        Bundle a = m43822a((Context) obj);
        if (a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }
}
