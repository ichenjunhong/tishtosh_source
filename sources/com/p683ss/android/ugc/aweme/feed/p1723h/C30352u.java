package com.p683ss.android.ugc.aweme.feed.p1723h;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.h.u */
public final class C30352u {

    /* renamed from: a */
    public C30353a f79263a;

    /* renamed from: b */
    public String f79264b;

    /* renamed from: c */
    public long f79265c;

    /* renamed from: d */
    public Context f79266d;

    /* renamed from: e */
    public Aweme f79267e;

    /* renamed from: com.ss.android.ugc.aweme.feed.h.u$a */
    public enum C30353a {
        PUT_VIDEO_POSITION,
        TRY_SHOW_TOAST
    }

    public C30352u(C30353a aVar, Context context, Aweme aweme) {
        this.f79263a = aVar;
        this.f79266d = context;
        this.f79267e = aweme;
    }

    public C30352u(C30353a aVar, String str, long j) {
        this.f79263a = aVar;
        this.f79264b = str;
        this.f79265c = j;
    }
}
