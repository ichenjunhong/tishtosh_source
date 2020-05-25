package com.p683ss.android.anywheredoor_api;

import java.util.NoSuchElementException;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.anywheredoor_api.AnyWhereDoorScheme */
public final class AnyWhereDoorScheme {
    private String path = "";
    private AnyWhereDoorQuery queries;

    public final String getPath() {
        return this.path;
    }

    public final AnyWhereDoorQuery getQueries() {
        return this.queries;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("path: ");
        sb.append(this.path);
        return sb.toString();
    }

    public final String getOptimizedPath() {
        int i;
        boolean z;
        String str = this.path;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        if (i > 0) {
            String str2 = this.path;
            if (str2 != null) {
                CharSequence charSequence = str2;
                C52711k.m112240b(charSequence, "$this$last");
                if (charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    throw new NoSuchElementException("Char sequence is empty.");
                } else if (charSequence.charAt(C52830p.m112461f(charSequence)) == '/') {
                    String str3 = this.path;
                    if (str3 == null) {
                        return null;
                    }
                    int i2 = i - 1;
                    if (str3 != null) {
                        String substring = str3.substring(0, i2);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        return substring;
                    }
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        return this.path;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setQueries(AnyWhereDoorQuery anyWhereDoorQuery) {
        this.queries = anyWhereDoorQuery;
    }
}
