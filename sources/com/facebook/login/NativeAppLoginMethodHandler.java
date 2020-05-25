package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C13739d;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14366y;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo26719a(Intent intent, int i) {
        return C14527h.m29750a(this, intent, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo26638a(Request request);

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    private static String m29706a(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    /* renamed from: b */
    private static String m29707b(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    /* renamed from: b */
    public final boolean mo26720b(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f37672b.f37630c.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private Result m29705a(Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String a = m29706a(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        String b = m29707b(extras);
        String string = extras.getString("e2e");
        if (!C14277aa.m29276a(string)) {
            mo26717b(string);
        }
        if (a == null && str == null && b == null) {
            try {
                return Result.m29658a(request, m29693a(request.f37639b, extras, C13739d.FACEBOOK_APPLICATION_WEB, request.f37641d));
            } catch (C14457k e) {
                return Result.m29660a(request, null, e.getMessage());
            }
        } else if (C14366y.f37365a.contains(a)) {
            return null;
        } else {
            if (C14366y.f37366b.contains(a)) {
                return Result.m29659a(request, (String) null);
            }
            return Result.m29661a(request, a, b, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26637a(int i, int i2, Intent intent) {
        Result result;
        Request request = this.f37672b.f37634g;
        if (intent == null) {
            result = Result.m29659a(request, "Operation canceled");
        } else {
            String str = null;
            if (i2 == 0) {
                Bundle extras = intent.getExtras();
                String a = m29706a(extras);
                if (extras.get("error_code") != null) {
                    str = extras.get("error_code").toString();
                }
                if ("CONNECTION_FAILURE".equals(str)) {
                    result = Result.m29661a(request, a, m29707b(extras), str);
                } else {
                    result = Result.m29659a(request, a);
                }
            } else if (i2 != -1) {
                result = Result.m29660a(request, "Unexpected resultCode from authorization.", null);
            } else {
                result = m29705a(request, intent);
            }
        }
        if (result != null) {
            this.f37672b.mo26682a(result);
        } else {
            this.f37672b.mo26685d();
        }
        return true;
    }
}
