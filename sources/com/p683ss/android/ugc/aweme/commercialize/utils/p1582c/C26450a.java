package com.p683ss.android.ugc.aweme.commercialize.utils.p1582c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26147z.C26148a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a */
public final class C26450a {

    /* renamed from: a */
    public static final C26450a f69725a = new C26450a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.a$a */
    static final class C26451a implements C26534a {

        /* renamed from: a */
        final /* synthetic */ Context f69726a;

        /* renamed from: b */
        final /* synthetic */ Aweme f69727b;

        /* renamed from: c */
        final /* synthetic */ String f69728c;

        C26451a(Context context, Aweme aweme, String str) {
            this.f69726a = context;
            this.f69727b = aweme;
            this.f69728c = str;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            if (z) {
                Context context = this.f69726a;
                Aweme aweme = this.f69727b;
                String str = this.f69728c;
                if (C26088l.m63256C(context, aweme)) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str);
                    hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
                    C26088l.m63322b(context, "deeplink_success", aweme, C26088l.m63264a(context, aweme, "raw ad deeplink success", false, (Map<String, String>) hashMap));
                    new C26148a().mo53762a("draw_ad").mo53760a(System.currentTimeMillis() - 5000).mo53761a(aweme.getAwemeRawAd()).mo53763a();
                }
                return;
            }
            C26088l.m63341d(this.f69726a, this.f69727b, this.f69728c, "user_canceled");
        }
    }

    private C26450a() {
    }

    /* renamed from: a */
    private static Intent m63950a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        return intent;
    }

    /* renamed from: a */
    private static List<String> m63951a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://"));
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        C52711k.m112236a((Object) queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable = queryIntentActivities;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        return (List) arrayList;
    }

    /* renamed from: d */
    public static final boolean m63958d(Context context, Uri uri) {
        if (context == null || uri == null || C26540w.m64227a(uri) || f69725a.m63959e(context, uri).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m63957c(Context context, Uri uri) {
        if (context == null || uri == null || !C26540w.m64227a(uri)) {
            return false;
        }
        if (!C52575l.m112124a((Iterable<? extends T>) f69725a.m63959e(context, uri), (Iterable<? extends T>) m63951a(context)).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final List<String> m63959e(Context context, Uri uri) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(m63950a(uri), 65536);
        C52711k.m112236a((Object) queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
        Iterable<ResolveInfo> iterable = queryIntentActivities;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (ResolveInfo resolveInfo : iterable) {
            arrayList.add(resolveInfo.activityInfo.packageName);
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    public static final boolean m63955b(Context context, Uri uri) {
        if (context == null || uri == null || !m63958d(context, uri)) {
            return false;
        }
        Intent a = m63950a(uri);
        List e = f69725a.m63959e(context, uri);
        if (!(!e.isEmpty())) {
            e = null;
        }
        if (e == null) {
            return false;
        }
        a.setPackage((String) C52575l.m112138e((Iterable<? extends T>) e).get(0));
        a.addFlags(268435456);
        return C26540w.m64210a(context, a);
    }

    /* renamed from: a */
    public static final boolean m63953a(Context context, Uri uri) {
        if (context == null || uri == null || !m63957c(context, uri)) {
            return false;
        }
        Intent a = m63950a(uri);
        Set a2 = C52575l.m112124a((Iterable<? extends T>) f69725a.m63959e(context, uri), (Iterable<? extends T>) m63951a(context));
        if (!(!a2.isEmpty())) {
            a2 = null;
        }
        if (a2 == null) {
            return false;
        }
        a.setPackage((String) C52575l.m112138e((Iterable<? extends T>) a2).get(0));
        a.addFlags(268435456);
        return C26540w.m64210a(context, a);
    }

    /* renamed from: c */
    public static final void m63956c(Context context, Aweme aweme, String str) {
        C52711k.m112240b(context, "context");
        C26088l.m63364h(context, aweme, str);
        C26088l.m63341d(context, aweme, str, "whitelist_not_found");
    }

    /* renamed from: a */
    public static final void m63952a(Context context, Aweme aweme, String str) {
        C52711k.m112240b(context, "context");
        C26088l.m63364h(context, aweme, str);
        C26088l.m63366i(context, aweme, str);
    }

    /* renamed from: b */
    public static final void m63954b(Context context, Aweme aweme, String str) {
        C52711k.m112240b(context, "context");
        C26088l.m63364h(context, aweme, str);
        C26540w.m64208a((C26534a) new C26451a(context, aweme, str));
    }
}
