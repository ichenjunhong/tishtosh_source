package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.p */
public final class C15462p {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static final class C15463a {

        /* renamed from: a */
        private final List<String> f39870a;

        /* renamed from: b */
        private final Object f39871b;

        private C15463a(Object obj) {
            this.f39871b = C15464q.m32123a(obj);
            this.f39870a = new ArrayList();
        }

        /* renamed from: a */
        public final C15463a mo28449a(String str, Object obj) {
            List<String> list = this.f39870a;
            String str2 = (String) C15464q.m32123a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f39871b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f39870a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f39870a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m32120a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m32118a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C15463a m32119a(Object obj) {
        return new C15463a(obj);
    }
}
