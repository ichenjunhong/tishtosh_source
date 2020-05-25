package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.FacebookActivity;
import com.facebook.internal.C14336o.C14337a;
import com.facebook.internal.C14353v.C14360f;

/* renamed from: com.facebook.internal.g */
public final class C14313g {

    /* renamed from: com.facebook.internal.g$a */
    public interface C14314a {
        /* renamed from: a */
        Bundle mo26525a();

        /* renamed from: b */
        Bundle mo26526b();
    }

    /* renamed from: a */
    public static boolean m29355a(C14312f fVar) {
        if (m29357b(fVar).f37353b != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static C14360f m29357b(C14312f fVar) {
        String k = C14533n.m29777k();
        String action = fVar.getAction();
        return C14353v.m29436a(action, m29356a(k, action, fVar));
    }

    /* renamed from: a */
    public static void m29353a(C14262a aVar, C14457k kVar) {
        m29358b(aVar, kVar);
    }

    /* renamed from: b */
    private static void m29358b(C14262a aVar, C14457k kVar) {
        if (kVar != null) {
            C14283ab.m29304a(C14533n.m29773g());
            Intent intent = new Intent();
            intent.setClass(C14533n.m29773g(), FacebookActivity.class);
            intent.setAction(FacebookActivity.f35193a);
            C14353v.m29440a(intent, aVar.f37173a.toString(), (String) null, C14353v.m29426a(), C14353v.m29435a(kVar));
            aVar.f37174b = intent;
        }
    }

    /* renamed from: a */
    private static int[] m29356a(String str, String str2, C14312f fVar) {
        C14337a a = C14336o.m29395a(str, str2, fVar.name());
        if (a != null) {
            return a.f37307d;
        }
        return new int[]{fVar.getMinVersion()};
    }

    /* renamed from: a */
    public static void m29352a(C14262a aVar, C14314a aVar2, C14312f fVar) {
        Bundle bundle;
        Context g = C14533n.m29773g();
        String action = fVar.getAction();
        C14360f b = m29357b(fVar);
        int i = b.f37353b;
        if (i != -1) {
            if (C14353v.m29441a(i)) {
                bundle = aVar2.mo26525a();
            } else {
                bundle = aVar2.mo26526b();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent a = C14353v.m29431a(g, aVar.f37173a.toString(), action, b, bundle);
            if (a != null) {
                aVar.f37174b = a;
                return;
            }
            throw new C14457k("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new C14457k("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    /* renamed from: a */
    public static void m29354a(C14262a aVar, String str, Bundle bundle) {
        C14283ab.m29304a(C14533n.m29773g());
        C14283ab.m29305a(C14533n.m29773g(), true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C14353v.m29440a(intent, aVar.f37173a.toString(), str, C14353v.m29426a(), bundle2);
        intent.setClass(C14533n.m29773g(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.f37174b = intent;
    }
}
