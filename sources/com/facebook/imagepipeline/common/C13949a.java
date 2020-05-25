package com.facebook.imagepipeline.common;

import com.C2240a;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p927k.C13726b;
import java.util.regex.Pattern;

/* renamed from: com.facebook.imagepipeline.common.a */
public final class C13949a {

    /* renamed from: c */
    private static Pattern f36382c;

    /* renamed from: a */
    public final int f36383a;

    /* renamed from: b */
    public final int f36384b;

    public final int hashCode() {
        return C13726b.m27772a(this.f36383a, this.f36384b);
    }

    public final String toString() {
        return C2240a.m6773a(null, "%s-%s", new Object[]{m28425a(this.f36383a), m28425a(this.f36384b)});
    }

    /* renamed from: a */
    public static String m28425a(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13949a)) {
            return false;
        }
        C13949a aVar = (C13949a) obj;
        if (this.f36383a == aVar.f36383a && this.f36384b == aVar.f36384b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C13949a m28424a(String str) throws IllegalArgumentException {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f36382c == null) {
            f36382c = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f36382c.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            C13689i.m27655a(z);
            C13689i.m27655a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            C13689i.m27655a(z2);
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            C13689i.m27655a(z3);
            if (parseInt2 < parseInt3 - 1) {
                return new C13949a(parseInt, parseInt2);
            }
            return new C13949a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(C2240a.m6773a(null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e);
        }
    }

    public C13949a(int i, int i2) {
        this.f36383a = i;
        this.f36384b = i2;
    }
}
