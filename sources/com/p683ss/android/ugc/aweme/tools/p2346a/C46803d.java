package com.p683ss.android.ugc.aweme.tools.p2346a;

/* renamed from: com.ss.android.ugc.aweme.tools.a.d */
public final class C46803d implements C46802c {

    /* renamed from: a */
    final C46802c f118262a;

    public C46803d(C46802c cVar) {
        this.f118262a = cVar;
    }

    /* renamed from: a */
    public final String mo94029a(String str, C46804e eVar, C46804e eVar2) {
        if (str == null || str.length() <= 5000) {
            return this.f118262a.mo94029a(str, eVar, eVar2);
        }
        StringBuilder sb = new StringBuilder("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is ");
        sb.append(str.length());
        sb.append("!");
        throw new IllegalArgumentException(sb.toString());
    }
}
