package com.p683ss.ugc.live.p2595a.p2596a.p2599c;

import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51561a;

/* renamed from: com.ss.ugc.live.a.a.c.c */
public final class C51571c extends C51569a {

    /* renamed from: a */
    private int f128826a;

    /* renamed from: b */
    private C51561a f128827b;

    public final int getErrorCode() {
        return this.f128826a;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f128827b.toString());
        sb.append("\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C51571c(C51568c cVar, int i, C51561a aVar) {
        super(cVar);
        this.f128826a = i;
        this.f128827b = aVar;
    }

    public C51571c(String str, C51568c cVar, int i, C51561a aVar) {
        super(str, cVar);
        this.f128826a = i;
        this.f128827b = aVar;
    }

    public C51571c(String str, Throwable th, C51568c cVar, int i, C51561a aVar) {
        super(str, th, cVar);
        this.f128826a = i;
        this.f128827b = aVar;
    }
}
