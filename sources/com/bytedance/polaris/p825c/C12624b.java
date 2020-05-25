package com.bytedance.polaris.p825c;

import android.net.Uri;
import com.bytedance.polaris.p821a.C12556b;
import java.net.URLDecoder;

/* renamed from: com.bytedance.polaris.c.b */
public final class C12624b implements C12556b {

    /* renamed from: a */
    private final Uri f33172a;

    /* renamed from: a */
    public final String mo23597a() {
        if (this.f33172a != null) {
            return URLDecoder.decode(this.f33172a.getQueryParameter("fallback"));
        }
        return null;
    }

    public C12624b(Uri uri) {
        this.f33172a = uri;
    }
}
