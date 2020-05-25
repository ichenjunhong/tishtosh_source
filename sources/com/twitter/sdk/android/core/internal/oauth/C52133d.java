package com.twitter.sdk.android.core.internal.oauth;

import android.os.Build;
import android.os.Build.VERSION;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.internal.C52136q;
import com.twitter.sdk.android.core.internal.p2617a.C52102e;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import okhttp3.C53676u;
import okhttp3.C53682y.C53684a;
import p2666g.C53095e.C53096a;
import p2666g.C53134n;
import p2666g.C53134n.C53136a;
import p2666g.p2669b.p2670a.C53062a;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.d */
public abstract class C52133d {

    /* renamed from: b */
    public final C52225r f129771b;

    /* renamed from: c */
    public final C52136q f129772c;

    /* renamed from: d */
    public final String f129773d;

    /* renamed from: e */
    public final C53134n f129774e = new C53136a().mo110655a(this.f129772c.f129776a).mo110656a(new C53684a().mo111665a((C53676u) new C52134e(this)).mo111658a(C52102e.m111436a()).mo111667a()).mo110654a((C53096a) C53062a.m112827a()).mo110657a();

    C52133d(C52225r rVar, C52136q qVar) {
        this.f129771b = rVar;
        this.f129772c = qVar;
        String b = C52225r.m111639b();
        StringBuilder sb = new StringBuilder("TwitterAndroidSDK");
        sb.append('/');
        sb.append(b);
        sb.append(' ');
        sb.append(Build.MODEL);
        sb.append('/');
        sb.append(VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build.MANUFACTURER);
        sb.append(';');
        sb.append(Build.MODEL);
        sb.append(';');
        sb.append(Build.BRAND);
        sb.append(';');
        sb.append(Build.PRODUCT);
        sb.append(')');
        this.f129773d = C52136q.m111511a(Normalizer.normalize(sb.toString(), Form.NFD));
    }
}
