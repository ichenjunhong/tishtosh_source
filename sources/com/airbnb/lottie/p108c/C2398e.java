package com.airbnb.lottie.p108c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.e */
public final class C2398e {

    /* renamed from: a */
    public C2399f f7502a;

    /* renamed from: b */
    private final List<String> f7503b;

    /* renamed from: a */
    private boolean m7044a() {
        return ((String) this.f7503b.get(this.f7503b.size() - 1)).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f7503b);
        sb.append(",resolved=");
        if (this.f7502a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m7045b(String str) {
        return str.equals("__container");
    }

    /* renamed from: a */
    public final C2398e mo6759a(C2399f fVar) {
        C2398e eVar = new C2398e(this);
        eVar.f7502a = fVar;
        return eVar;
    }

    public C2398e(String... strArr) {
        this.f7503b = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final C2398e mo6760a(String str) {
        C2398e eVar = new C2398e(this);
        eVar.f7503b.add(str);
        return eVar;
    }

    private C2398e(C2398e eVar) {
        this.f7503b = new ArrayList(eVar.f7503b);
        this.f7502a = eVar.f7502a;
    }

    /* renamed from: b */
    public final int mo6762b(String str, int i) {
        if (m7045b(str)) {
            return 0;
        }
        if (!((String) this.f7503b.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.f7503b.size() - 1 && ((String) this.f7503b.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo6764d(String str, int i) {
        if (!str.equals("__container") && i >= this.f7503b.size() - 1 && !((String) this.f7503b.get(i)).equals("**")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo6761a(String str, int i) {
        if (m7045b(str)) {
            return true;
        }
        if (i >= this.f7503b.size()) {
            return false;
        }
        if (((String) this.f7503b.get(i)).equals(str) || ((String) this.f7503b.get(i)).equals("**") || ((String) this.f7503b.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo6763c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f7503b.size()) {
            return false;
        }
        if (i == this.f7503b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (String) this.f7503b.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f7503b.size() - 2 && m7044a())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !((String) this.f7503b.get(i + 1)).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f7503b.size() - 2 || (i == this.f7503b.size() - 3 && m7044a())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f7503b.size() - 1) {
                return false;
            }
            return ((String) this.f7503b.get(i2)).equals(str);
        }
    }
}
