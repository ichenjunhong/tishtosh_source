package com.bytedance.opensdk.p800b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.b.n */
public final class C12477n {

    /* renamed from: a */
    public static final C12477n f32780a = new C12477n();

    private C12477n() {
    }

    /* renamed from: a */
    public static List<String> m25077a(Context context, String str) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "pkgName");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                C52711k.m112236a((Object) packageInfo, "context.packageManager.g…geManager.GET_SIGNATURES)");
                Signature[] signatureArr = packageInfo.signatures;
                boolean z2 = true;
                if (signatureArr != null) {
                    if (signatureArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    for (Signature byteArray : signatureArr) {
                        byte[] byteArray2 = byteArray.toByteArray();
                        C52711k.m112236a((Object) byteArray2, "signature.toByteArray()");
                        String a = C12472j.m25067a(byteArray2);
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                }
            } catch (NameNotFoundException unused) {
                return arrayList;
            }
        }
        return arrayList;
    }
}
