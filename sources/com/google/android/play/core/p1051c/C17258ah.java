package com.google.android.play.core.p1051c;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.c.ah */
public final class C17258ah {

    /* renamed from: a */
    private static final C17384b f48728a = new C17384b("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m42284a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                f48728a.mo33688c("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature byteArray : signatureArr) {
                String a = C17295h.m42358a(byteArray.toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a) || "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }
}
