package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.support.p030v4.p038f.C0779b;
import android.view.View;
import com.google.android.gms.common.api.C15211a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C17142a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C15441d {

    /* renamed from: a */
    public final Account f39826a;

    /* renamed from: b */
    public final Set<Scope> f39827b;

    /* renamed from: c */
    public final Set<Scope> f39828c;

    /* renamed from: d */
    public final Map<C15211a<?>, C15443b> f39829d;

    /* renamed from: e */
    public final int f39830e;

    /* renamed from: f */
    public final View f39831f;

    /* renamed from: g */
    public final String f39832g;

    /* renamed from: h */
    public final String f39833h;

    /* renamed from: i */
    public final C17142a f39834i;

    /* renamed from: j */
    public Integer f39835j;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C15442a {

        /* renamed from: a */
        private Account f39836a;

        /* renamed from: b */
        private C0779b<Scope> f39837b;

        /* renamed from: c */
        private Map<C15211a<?>, C15443b> f39838c;

        /* renamed from: d */
        private int f39839d;

        /* renamed from: e */
        private View f39840e;

        /* renamed from: f */
        private String f39841f;

        /* renamed from: g */
        private String f39842g;

        /* renamed from: h */
        private C17142a f39843h = C17142a.f48516a;

        /* renamed from: a */
        public final C15442a mo28428a(Account account) {
            this.f39836a = account;
            return this;
        }

        /* renamed from: a */
        public final C15442a mo28430a(Collection<Scope> collection) {
            if (this.f39837b == null) {
                this.f39837b = new C0779b<>();
            }
            this.f39837b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C15442a mo28429a(String str) {
            this.f39841f = str;
            return this;
        }

        /* renamed from: b */
        public final C15442a mo28432b(String str) {
            this.f39842g = str;
            return this;
        }

        /* renamed from: a */
        public final C15441d mo28431a() {
            C15441d dVar = new C15441d(this.f39836a, this.f39837b, this.f39838c, this.f39839d, this.f39840e, this.f39841f, this.f39842g, this.f39843h);
            return dVar;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C15443b {

        /* renamed from: a */
        public final Set<Scope> f39844a;
    }

    public C15441d(Account account, Set<Scope> set, Map<C15211a<?>, C15443b> map, int i, View view, String str, String str2, C17142a aVar) {
        this.f39826a = account;
        this.f39827b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        this.f39829d = map;
        this.f39831f = view;
        this.f39830e = i;
        this.f39832g = str;
        this.f39833h = str2;
        this.f39834i = aVar;
        HashSet hashSet = new HashSet(this.f39827b);
        for (C15443b bVar : this.f39829d.values()) {
            hashSet.addAll(bVar.f39844a);
        }
        this.f39828c = Collections.unmodifiableSet(hashSet);
    }
}
