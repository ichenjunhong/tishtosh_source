package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15424ao;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.C15466s;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.google.android.gms.common.api.internal.e */
public final class C15333e {

    /* renamed from: a */
    private static final Object f39608a = new Object();

    /* renamed from: b */
    private static C15333e f39609b;

    /* renamed from: c */
    private final String f39610c;

    /* renamed from: d */
    private final Status f39611d;

    /* renamed from: e */
    private final boolean f39612e;

    /* renamed from: f */
    private final boolean f39613f;

    private C15333e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.aco));
        boolean z = true;
        if (identifier != 0) {
            if (resources.getInteger(identifier) == 0) {
                z = false;
            }
            this.f39613f = !z;
        } else {
            this.f39613f = false;
        }
        this.f39612e = z;
        C15424ao.m32017a(context);
        String str = C15424ao.f39778a;
        if (str == null) {
            str = new C15466s(context).mo28451a("google_app_id");
        }
        if (TextUtils.isEmpty(str)) {
            this.f39611d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f39610c = null;
            return;
        }
        this.f39610c = str;
        this.f39611d = Status.f39265a;
    }

    /* renamed from: a */
    public static Status m31883a(Context context) {
        Status status;
        C15464q.m32124a(context, (Object) "Context must not be null.");
        synchronized (f39608a) {
            if (f39609b == null) {
                f39609b = new C15333e(context);
            }
            status = f39609b.f39611d;
        }
        return status;
    }

    /* renamed from: a */
    public static String m31885a() {
        return m31884a("getGoogleAppId").f39610c;
    }

    /* renamed from: b */
    public static boolean m31886b() {
        return m31884a("isMeasurementExplicitlyDisabled").f39613f;
    }

    /* renamed from: a */
    private static C15333e m31884a(String str) {
        C15333e eVar;
        synchronized (f39608a) {
            if (f39609b != null) {
                eVar = f39609b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new IllegalStateException(sb.toString());
            }
        }
        return eVar;
    }
}
