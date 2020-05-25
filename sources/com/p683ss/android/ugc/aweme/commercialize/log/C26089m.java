package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.m */
public final /* synthetic */ class C26089m implements Callable {

    /* renamed from: a */
    private final Context f68890a;

    /* renamed from: b */
    private final Aweme f68891b;

    public C26089m(Context context, Aweme aweme) {
        this.f68890a = context;
        this.f68891b = aweme;
    }

    public final Object call() {
        return C26088l.m63277a(this.f68890a, this.f68891b);
    }
}
