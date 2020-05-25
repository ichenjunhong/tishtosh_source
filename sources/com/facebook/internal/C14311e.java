package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C14533n;

/* renamed from: com.facebook.internal.e */
public final class C14311e {

    /* renamed from: a */
    public Uri f37253a;

    public C14311e(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a = C14366y.m29468a();
        StringBuilder sb = new StringBuilder();
        sb.append(C14533n.m29774h());
        sb.append("/dialog/");
        sb.append(str);
        this.f37253a = C14277aa.m29246a(a, sb.toString(), bundle);
    }
}
