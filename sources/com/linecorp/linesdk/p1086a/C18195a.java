package com.linecorp.linesdk.p1086a;

import android.content.Context;
import com.linecorp.p1083a.p1084a.p1085a.C18188b;

/* renamed from: com.linecorp.linesdk.a.a */
public final class C18195a {

    /* renamed from: a */
    public final Context f50240a;

    /* renamed from: b */
    public final String f50241b;

    /* renamed from: c */
    private final C18188b f50242c;

    /* renamed from: a */
    public String mo36277a(long j) {
        return this.f50242c.mo36242a(this.f50240a, String.valueOf(j));
    }

    /* renamed from: a */
    public String mo36278a(String str) {
        return this.f50242c.mo36242a(this.f50240a, str);
    }

    public C18195a(Context context, String str) {
        this(context.getApplicationContext(), str, C18212c.f50268a);
    }

    private C18195a(Context context, String str, C18188b bVar) {
        this.f50240a = context;
        this.f50241b = "com.linecorp.linesdk.accesstoken.".concat(String.valueOf(str));
        this.f50242c = bVar;
    }
}
