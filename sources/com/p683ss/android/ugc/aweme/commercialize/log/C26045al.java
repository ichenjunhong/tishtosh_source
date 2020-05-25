package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.al */
final /* synthetic */ class C26045al implements Callable {

    /* renamed from: a */
    private final Context f68793a;

    /* renamed from: b */
    private final Aweme f68794b;

    /* renamed from: c */
    private final long f68795c;

    /* renamed from: d */
    private final int f68796d;

    /* renamed from: e */
    private final String f68797e;

    /* renamed from: f */
    private final Integer f68798f;

    C26045al(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        this.f68793a = context;
        this.f68794b = aweme;
        this.f68795c = j;
        this.f68796d = i;
        this.f68797e = str;
        this.f68798f = num;
    }

    public final Object call() {
        return C26088l.m63332c(this.f68793a, this.f68794b, this.f68795c, this.f68796d, this.f68797e, this.f68798f);
    }
}
