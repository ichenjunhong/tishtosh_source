package com.p683ss.ugc.live.p2595a.p2596a.p2599c;

import com.p683ss.ugc.live.p2595a.p2596a.C51568c;

/* renamed from: com.ss.ugc.live.a.a.c.b */
public final class C51570b extends C51569a {

    /* renamed from: a */
    private String f128825a;

    public final String getMessage() {
        StringBuilder sb = new StringBuilder("md5:");
        sb.append(this.f128825a);
        sb.append("\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C51570b(C51568c cVar, String str) {
        super(cVar);
        this.f128825a = str;
    }

    public C51570b(String str, C51568c cVar, String str2) {
        super(str, cVar);
        this.f128825a = str2;
    }

    public C51570b(String str, Throwable th, C51568c cVar, String str2) {
        super(str, th, cVar);
        this.f128825a = str2;
    }
}
