package net.openid.appauth;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: net.openid.appauth.s */
public final class C53492s {

    /* renamed from: a */
    public static final Set<String> f132342a = new HashSet(Arrays.asList(new String[]{"token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"}));

    /* renamed from: b */
    public final C53489r f132343b;

    /* renamed from: c */
    public final String f132344c;

    /* renamed from: d */
    public final String f132345d;

    /* renamed from: e */
    public final Long f132346e;

    /* renamed from: f */
    public final String f132347f;

    /* renamed from: g */
    public final String f132348g;

    /* renamed from: h */
    public final String f132349h;

    /* renamed from: i */
    public final Map<String, String> f132350i;

    /* renamed from: net.openid.appauth.s$a */
    public static final class C53493a {

        /* renamed from: a */
        C53489r f132351a;

        /* renamed from: b */
        String f132352b;

        /* renamed from: c */
        String f132353c;

        /* renamed from: d */
        Long f132354d;

        /* renamed from: e */
        String f132355e;

        /* renamed from: f */
        String f132356f;

        /* renamed from: g */
        String f132357g;

        /* renamed from: h */
        Map<String, String> f132358h = Collections.emptyMap();

        public C53493a(C53489r rVar) {
            this.f132351a = (C53489r) C53487p.m113585a(rVar, (Object) "request cannot be null");
        }
    }

    C53492s(C53489r rVar, String str, String str2, Long l, String str3, String str4, String str5, Map<String, String> map) {
        this.f132343b = rVar;
        this.f132344c = str;
        this.f132345d = str2;
        this.f132346e = l;
        this.f132347f = str3;
        this.f132348g = str4;
        this.f132349h = str5;
        this.f132350i = map;
    }
}
