package net.openid.appauth;

import android.text.TextUtils;
import java.util.LinkedHashSet;

/* renamed from: net.openid.appauth.c */
public final class C53454c {
    /* renamed from: a */
    public static String m113509a(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : iterable) {
            C53487p.m113587a(!TextUtils.isEmpty(str), (Object) "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }
}
