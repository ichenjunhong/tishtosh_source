package com.bytedance.android.livesdk.gift.p353a;

import com.p683ss.ugc.live.p2595a.p2596a.C51568c;
import com.p683ss.ugc.live.p2595a.p2596a.p2598b.C51561a;
import com.p683ss.ugc.live.p2595a.p2596a.p2599c.C51569a;

/* renamed from: com.bytedance.android.livesdk.gift.a.c */
public final class C7197c extends C51569a {

    /* renamed from: a */
    private int f19559a;

    /* renamed from: b */
    private C51561a f19560b;

    public final int getErrorCode() {
        return this.f19559a;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19560b.toString());
        sb.append("\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public C7197c(String str, Throwable th, C51568c cVar, int i, C51561a aVar) {
        super(str, th, cVar);
        this.f19559a = i;
        this.f19560b = aVar;
    }
}
