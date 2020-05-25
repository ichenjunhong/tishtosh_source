package com.google.p997a.p998a.p1020g.p1021a;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.google.a.a.g.a.a */
public final class C14786a {

    /* renamed from: a */
    public static final C14787b f38298a = new C14788c("-_.!~*'()@:$&,;=", false);

    /* renamed from: b */
    private static final C14787b f38299b = new C14788c("-_.*", true);

    /* renamed from: c */
    private static final C14787b f38300c = new C14788c("-_.!~*'()@:$&,;=+/?", false);

    /* renamed from: d */
    private static final C14787b f38301d = new C14788c("-_.!~*'():$&,;=", false);

    /* renamed from: e */
    private static final C14787b f38302e = new C14788c("-_.!~*'()@:$,;/?:", false);

    /* renamed from: b */
    public static String m30243b(String str) {
        return f38301d.mo27108a(str);
    }

    /* renamed from: c */
    public static String m30244c(String str) {
        return f38302e.mo27108a(str);
    }

    /* renamed from: a */
    public static String m30242a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
