package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.d */
public final class C21839d {

    /* renamed from: a */
    public static final C21839d f59130a = new C21839d();

    private C21839d() {
    }

    /* renamed from: a */
    public static String m54504a(Bundle bundle) {
        C52711k.m112240b(bundle, "data");
        String string = bundle.getString("args_email");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: b */
    public static C21135a m54509b(Bundle bundle) {
        C52711k.m112240b(bundle, "data");
        return (C21135a) bundle.getSerializable("args_phone_number");
    }

    /* renamed from: c */
    public static String m54511c(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        String string = arguments.getString("args_string_phone_number", "");
        C52711k.m112236a((Object) string, "fragment.arguments!!.get…(PHONE_NUMBER_STRING, \"\")");
        return string;
    }

    /* renamed from: d */
    public static boolean m54513d(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        return arguments.getBoolean("code_sent", false);
    }

    /* renamed from: e */
    public static String m54514e(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        String string = arguments.getString("ticket", "");
        C52711k.m112236a((Object) string, "fragment.arguments!!.getString(\"ticket\", \"\")");
        return string;
    }

    /* renamed from: b */
    public final C21135a mo45973b(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) arguments, "fragment.arguments!!");
        return m54509b(arguments);
    }

    /* renamed from: a */
    public final String mo45972a(Fragment fragment) {
        C52711k.m112240b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) arguments, "fragment.arguments!!");
        return m54504a(arguments);
    }

    /* renamed from: c */
    public static void m54512c(Bundle bundle, String str) {
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(str, "ticket");
        bundle.putString("ticket", str);
    }

    /* renamed from: a */
    public static void m54505a(Bundle bundle, String str) {
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(str, "email");
        bundle.putString("args_email", str);
    }

    /* renamed from: b */
    public static void m54510b(Bundle bundle, String str) {
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(str, "phone");
        bundle.putString("args_string_phone_number", str);
    }

    /* renamed from: a */
    public static void m54506a(Fragment fragment, C21135a aVar) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(aVar, "phone");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        arguments.putSerializable("args_phone_number", aVar);
    }

    /* renamed from: a */
    public static void m54507a(Fragment fragment, String str) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(str, "email");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        arguments.putString("args_email", str);
    }

    /* renamed from: b */
    public final void mo45974b(Fragment fragment, String str) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(str, "ticket");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) arguments, "fragment.arguments!!");
        m54512c(arguments, str);
    }

    /* renamed from: a */
    public static void m54508a(Fragment fragment, boolean z) {
        C52711k.m112240b(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C52711k.m112234a();
        }
        arguments.putBoolean("code_sent", z);
    }
}
