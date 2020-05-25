package com.p683ss.android.ugc.aweme.web.p2398b;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.web.b.b */
public final class C48269b extends C48268a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo95775a() {
        return "(.*)/ies_fonts/(.+).ttf$";
    }

    public C48269b(boolean z) {
        super(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo95776b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m104562d(str.substring(str.lastIndexOf("/") + 1));
    }

    /* renamed from: d */
    private static InputStream m104562d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context context = C48270c.m104565a().f121477b;
        Map<String, String> map = C48270c.m104565a().f121476a;
        if (map == null || map.size() == 0) {
            return null;
        }
        String str2 = (String) map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return context.getAssets().open(str2);
        } catch (IOException unused) {
            return null;
        }
    }
}
