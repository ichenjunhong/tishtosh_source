package com.p683ss.android.ugc.aweme.commerce.service.p1543i;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.i.b */
public final class C25551b {

    /* renamed from: a */
    public static final C25552a f67526a = new C25552a(null);

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.i.b$a */
    public static final class C25552a {
        private C25552a() {
        }

        public /* synthetic */ C25552a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static int m62085a(Context context, int i) {
            C52711k.m112240b(context, "context");
            return C0726c.m2098c(context, i);
        }

        /* renamed from: a */
        public static String m62086a(Context context, int i, Object... objArr) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(objArr, "formattedArgs");
            String string = context.getString(i, Arrays.copyOf(objArr, 1));
            C52711k.m112236a((Object) string, "context.getString(resId, *formattedArgs)");
            return string;
        }
    }
}
