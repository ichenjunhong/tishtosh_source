package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.C0183j;
import com.p683ss.android.ugc.aweme.C23786bf;
import com.p683ss.android.ugc.aweme.C23786bf.C23787a;
import com.p683ss.android.ugc.aweme.C23786bf.C23788b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.BaseVerificationService */
public class BaseVerificationService implements C0183j, C23786bf {
    public String getPhoneCountryCode() {
        return "";
    }

    public boolean isDangerZone() {
        return false;
    }

    public void letActionContinue() {
    }

    public void showRebindView(Activity activity, String str) {
        C52711k.m112240b(activity, "activity");
    }

    public void showRebindView(Activity activity, String str, C23787a aVar) {
        C52711k.m112240b(activity, "activity");
    }

    public void verifyCredential(C23788b bVar) {
        C52711k.m112240b(bVar, "param");
    }
}
