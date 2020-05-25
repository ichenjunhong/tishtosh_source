package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.analytics.g */
public final class C15093g implements C15104o {

    /* renamed from: a */
    private static final Uri f38955a;

    /* renamed from: b */
    private final LogPrinter f38956b = new LogPrinter(4, "GA/LogCatTransport");

    /* renamed from: a */
    public final Uri mo27832a() {
        return f38955a;
    }

    /* renamed from: a */
    public final void mo27833a(C15095i iVar) {
        ArrayList arrayList = new ArrayList(iVar.f38962f.values());
        Collections.sort(arrayList, new C15094h(this));
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String obj2 = ((C15096j) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
            }
        }
        this.f38956b.println(sb.toString());
    }

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        f38955a = builder.build();
    }
}
