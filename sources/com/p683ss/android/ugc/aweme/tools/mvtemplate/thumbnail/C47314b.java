package com.p683ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.b */
public final class C47314b {

    /* renamed from: a */
    public static final C47314b f119423a = new C47314b();

    /* renamed from: b */
    private static int f119424b;

    private C47314b() {
    }

    /* renamed from: a */
    public static int m102688a(Context context) {
        C52711k.m112240b(context, "context");
        if (f119424b <= 0) {
            f119424b = (int) (context.getResources().getDimension(R.dimen.co) + 0.5f);
        }
        return f119424b;
    }
}
