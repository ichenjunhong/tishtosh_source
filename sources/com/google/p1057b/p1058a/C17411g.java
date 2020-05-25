package com.google.p1057b.p1058a;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.b.a.g */
public class C17411g {

    /* renamed from: a */
    public final String f48947a;

    private C17411g(C17411g gVar) {
        this.f48947a = gVar.f48947a;
    }

    /* renamed from: a */
    public static C17411g m42629a(String str) {
        return new C17411g(str);
    }

    public C17411g(String str) {
        this.f48947a = (String) C17421k.m42653a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo33736a(Object obj) {
        C17421k.m42653a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: b */
    public C17411g mo33739b(final String str) {
        C17421k.m42653a(str);
        return new C17411g(this) {
            /* renamed from: b */
            public final C17411g mo33739b(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final CharSequence mo33736a(Object obj) {
                if (obj == null) {
                    return str;
                }
                return C17411g.this.mo33736a(obj);
            }
        };
    }

    /* renamed from: a */
    public final String mo33737a(Iterable<?> iterable) {
        return m42630a(new StringBuilder(), iterable.iterator()).toString();
    }

    /* renamed from: a */
    public final String mo33738a(Object[] objArr) {
        return mo33737a((Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    private StringBuilder m42630a(StringBuilder sb, Iterator<?> it) {
        try {
            C17421k.m42653a(sb);
            if (it.hasNext()) {
                sb.append(mo33736a(it.next()));
                while (it.hasNext()) {
                    sb.append(this.f48947a);
                    sb.append(mo33736a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
