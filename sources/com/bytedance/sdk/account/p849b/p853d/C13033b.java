package com.bytedance.sdk.account.p849b.p853d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.account.b.d.b */
public final class C13033b {
    /* renamed from: a */
    public static List<String> m26207a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return null;
            }
            for (Signature byteArray : signatureArr) {
                arrayList.add(C13032a.m26206a(byteArray.toByteArray()));
            }
            return arrayList;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
