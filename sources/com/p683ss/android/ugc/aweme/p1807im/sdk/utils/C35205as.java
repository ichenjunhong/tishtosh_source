package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.as */
public final class C35205as {

    /* renamed from: b */
    private static C35208au<C35205as> f90494b = new C35208au<C35205as>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C35205as();
        }
    };

    /* renamed from: a */
    public Map<String, Bundle> f90495a;

    private C35205as() {
        this.f90495a = new HashMap();
    }

    /* renamed from: a */
    public static C35205as m79585a() {
        return (C35205as) f90494b.mo73326b();
    }

    /* renamed from: a */
    public final String mo73324a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && this.f90495a.containsKey(str)) {
            Bundle bundle = (Bundle) this.f90495a.get(str);
            if (bundle != null) {
                return bundle.getString(str2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo73325a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (this.f90495a.containsKey(str)) {
                Bundle bundle = (Bundle) this.f90495a.get(str);
                if (bundle != null) {
                    bundle.putString(str2, str3);
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(str2, str3);
            this.f90495a.put(str, bundle2);
        }
    }
}
