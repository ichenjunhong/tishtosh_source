package com.p683ss.android.common.p1144c.p1145a;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.common.c.a.a */
public final class C18884a {

    /* renamed from: a */
    public Set<C18887c> f52090a = new HashSet();

    /* renamed from: com.ss.android.common.c.a.a$a */
    public class C18885a implements C18887c {

        /* renamed from: a */
        String f52091a;

        /* renamed from: b */
        byte[] f52092b;

        /* renamed from: c */
        public String f52093c;

        /* renamed from: a */
        public final String mo38694a() {
            return this.f52091a;
        }

        /* renamed from: b */
        public final Object mo38695b() {
            return this.f52092b;
        }

        public C18885a(String str, byte[] bArr, String str2) {
            this.f52091a = str;
            this.f52092b = bArr;
            this.f52093c = str2;
        }
    }

    /* renamed from: com.ss.android.common.c.a.a$b */
    public class C18886b implements C18887c {

        /* renamed from: a */
        String f52095a;

        /* renamed from: b */
        File f52096b;

        /* renamed from: a */
        public final String mo38694a() {
            return this.f52095a;
        }

        /* renamed from: b */
        public final Object mo38695b() {
            return this.f52096b;
        }

        public C18886b(String str, File file) {
            this.f52095a = str;
            this.f52096b = file;
        }
    }

    /* renamed from: com.ss.android.common.c.a.a$c */
    public interface C18887c {
        /* renamed from: a */
        String mo38694a();

        /* renamed from: b */
        Object mo38695b();
    }

    /* renamed from: com.ss.android.common.c.a.a$d */
    public class C18888d implements C18887c {

        /* renamed from: a */
        String f52098a;

        /* renamed from: b */
        String f52099b;

        /* renamed from: a */
        public final String mo38694a() {
            return this.f52098a;
        }

        /* renamed from: b */
        public final Object mo38695b() {
            return this.f52099b;
        }

        public C18888d(String str, String str2) {
            this.f52098a = str;
            this.f52099b = str2;
        }
    }

    /* renamed from: a */
    public final void mo38692a(String str, File file) {
        this.f52090a.add(new C18886b(str, file));
    }

    /* renamed from: a */
    public final void mo38693a(String str, String str2) {
        this.f52090a.add(new C18888d(str, str2));
    }
}
