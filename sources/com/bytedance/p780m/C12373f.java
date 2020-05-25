package com.bytedance.p780m;

import android.text.TextUtils;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.m.f */
final class C12373f {

    /* renamed from: a */
    public final Type f32604a;

    /* renamed from: b */
    public final String f32605b;

    public final int hashCode() {
        int i;
        int hashCode = this.f32604a.hashCode();
        if (this.f32605b == null) {
            i = 0;
        } else {
            i = this.f32605b.hashCode();
        }
        return hashCode ^ i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo23385a() {
        if (TextUtils.isEmpty(this.f32605b)) {
            return this.f32604a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32604a.toString());
        sb.append("(");
        sb.append(this.f32605b);
        sb.append(")");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceKey{");
        sb.append(String.valueOf(this.f32604a));
        sb.append(" ");
        sb.append(this.f32605b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12373f)) {
            return false;
        }
        C12373f fVar = (C12373f) obj;
        if (!C12375h.m24918a(fVar.f32604a, this.f32604a) || !C12375h.m24918a(fVar.f32605b, this.f32605b)) {
            return false;
        }
        return true;
    }

    private C12373f(Type type, String str) {
        this.f32604a = type;
        this.f32605b = str;
    }

    /* renamed from: a */
    static C12373f m24914a(Type type, String str) {
        return new C12373f(type, str);
    }
}
