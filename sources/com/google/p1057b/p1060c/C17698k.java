package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;

/* renamed from: com.google.b.c.k */
final class C17698k {
    /* renamed from: a */
    static void m43479a(boolean z) {
        C17421k.m42668b(z, (Object) "no calls to next() since the last call to remove()");
    }

    /* renamed from: a */
    static int m43477a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    static void m43480b(int i, String str) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must be positive but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    static void m43478a(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            StringBuilder sb2 = new StringBuilder("null value in entry: ");
            sb2.append(obj);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }
}
