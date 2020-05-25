package com.bytedance.jedi.p725a.p743m;

import java.util.Comparator;

/* renamed from: com.bytedance.jedi.a.m.a */
final class C11739a {

    /* renamed from: a */
    public static final Comparator<C11739a> f31195a = new Comparator<C11739a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) Math.abs(((C11739a) obj).f31199e - ((C11739a) obj2).f31199e);
        }
    };

    /* renamed from: b */
    public static final Comparator<C11739a> f31196b = new Comparator<C11739a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return (int) Math.abs(((C11739a) obj).f31200f - ((C11739a) obj2).f31200f);
        }
    };

    /* renamed from: c */
    public static final Comparator<C11739a> f31197c = new Comparator<C11739a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C11739a) obj).f31198d.getCanonicalName().compareTo(((C11739a) obj2).f31198d.getCanonicalName());
        }
    };

    /* renamed from: d */
    public final Class<?> f31198d;

    /* renamed from: e */
    public long f31199e;

    /* renamed from: f */
    public long f31200f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassHistogramElement[class=");
        sb.append(this.f31198d.getCanonicalName());
        sb.append(", instances=");
        sb.append(this.f31199e);
        sb.append(", bytes=");
        sb.append(this.f31200f);
        sb.append("]");
        return sb.toString();
    }

    public C11739a(Class<?> cls) {
        this.f31198d = cls;
    }

    /* renamed from: a */
    public final void mo22491a(long j) {
        this.f31199e++;
        this.f31200f += j;
    }
}
