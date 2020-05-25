package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.support.p030v4.p038f.C0800n;
import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15518i;
import com.ss.android.ugc.trill.R;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C15444e {

    /* renamed from: a */
    private static final C0800n<String, String> f39845a = new C0800n<>();

    /* renamed from: a */
    public static String m32088a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 20) {
            return m32089a(context, "common_google_play_services_restricted_profile_title");
        }
        switch (i) {
            case 1:
                return resources.getString(R.string.acl);
            case 2:
                return resources.getString(R.string.acs);
            case 3:
                return resources.getString(R.string.aci);
            case 4:
            case 6:
                break;
            case 5:
                return m32089a(context, "common_google_play_services_invalid_account_title");
            case 7:
                return m32089a(context, "common_google_play_services_network_error_title");
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            default:
                switch (i) {
                    case 16:
                        return null;
                    case 17:
                        return m32089a(context, "common_google_play_services_sign_in_failed_title");
                    case 18:
                        break;
                    default:
                        return null;
                }
        }
        return null;
    }

    /* renamed from: b */
    public static String m32091b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m32087a(context);
        if (i == 5) {
            return m32090a(context, "common_google_play_services_invalid_account_text", a);
        }
        if (i == 7) {
            return m32090a(context, "common_google_play_services_network_error_text", a);
        }
        if (i == 9) {
            return resources.getString(R.string.acp, new Object[]{a});
        } else if (i == 20) {
            return m32090a(context, "common_google_play_services_restricted_profile_text", a);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(R.string.ack, new Object[]{a});
                case 2:
                    if (C15518i.m32285b(context)) {
                        return resources.getString(R.string.acu);
                    }
                    return resources.getString(R.string.acr, new Object[]{a});
                case 3:
                    return resources.getString(R.string.ach, new Object[]{a});
                default:
                    switch (i) {
                        case 16:
                            return m32090a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m32090a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(R.string.act, new Object[]{a});
                        default:
                            return resources.getString(R.string.aco, new Object[]{a});
                    }
            }
        }
    }

    /* renamed from: c */
    public static String m32092c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.acj);
            case 2:
                return resources.getString(R.string.acq);
            case 3:
                return resources.getString(R.string.acg);
            default:
                return resources.getString(17039370);
        }
    }

    /* renamed from: a */
    public static String m32087a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C15377d.m31951a(context).mo28322b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    public static String m32090a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m32089a(context, str);
        if (a == null) {
            a = resources.getString(R.string.aco);
        }
        return C2240a.m6773a(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32089a(android.content.Context r4, java.lang.String r5) {
        /*
            android.support.v4.f.n<java.lang.String, java.lang.String> r0 = f39845a
            monitor-enter(r0)
            android.support.v4.f.n<java.lang.String, java.lang.String> r1 = f39845a     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x000f:
            android.content.res.Resources r4 = com.google.android.gms.common.C15384g.m31961b(r4)     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r4 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0018:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0053
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0058
        L_0x0053:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x005a:
            android.support.v4.f.n<java.lang.String, java.lang.String> r1 = f39845a     // Catch:{ all -> 0x0061 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C15444e.m32089a(android.content.Context, java.lang.String):java.lang.String");
    }
}
