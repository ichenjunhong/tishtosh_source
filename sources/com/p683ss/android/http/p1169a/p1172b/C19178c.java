package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.C19175b;
import com.p683ss.android.http.p1169a.C19186d;
import com.p683ss.android.http.p1169a.p1173c.C19185a;
import com.p683ss.android.http.p1169a.p1174d.C19188b;
import java.util.ArrayList;

/* renamed from: com.ss.android.http.a.b.c */
public final class C19178c implements C19182g {

    /* renamed from: a */
    public static final C19178c f52873a = new C19178c();

    /* renamed from: b */
    private static final char[] f52874b = {';', ','};

    /* renamed from: a */
    private static C19186d m46755a(String str, String str2) {
        return new C19180e(str, str2);
    }

    /* renamed from: c */
    private C19186d m46758c(C19188b bVar, C19183h hVar) {
        return m46754a(bVar, hVar, f52874b);
    }

    /* renamed from: a */
    private static boolean m46756a(char c, char[] cArr) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private C19186d[] m46757b(C19188b bVar, C19183h hVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            int i = hVar.f52881c;
            int i2 = hVar.f52880b;
            while (i < i2 && C19185a.m46769a(bVar.mo39152b(i))) {
                i++;
            }
            hVar.mo39141a(i);
            if (hVar.mo39142a()) {
                return new C19186d[0];
            }
            ArrayList arrayList = new ArrayList();
            while (!hVar.mo39142a()) {
                arrayList.add(m46758c(bVar, hVar));
                if (bVar.mo39152b(hVar.f52881c - 1) == ',') {
                    break;
                }
            }
            return (C19186d[]) arrayList.toArray(new C19186d[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* renamed from: a */
    public final C19175b[] mo39129a(C19188b bVar, C19183h hVar) {
        ArrayList arrayList = new ArrayList();
        while (!hVar.mo39142a()) {
            if (bVar == null) {
                throw new IllegalArgumentException("Char array buffer may not be null");
            } else if (hVar != null) {
                C19186d c = m46758c(bVar, hVar);
                C19186d[] dVarArr = null;
                if (!hVar.mo39142a() && bVar.mo39152b(hVar.f52881c - 1) != ',') {
                    dVarArr = m46757b(bVar, hVar);
                }
                C19177b bVar2 = new C19177b(c.mo39131a(), c.mo39132b(), dVarArr);
                if (bVar2.mo39120a().length() != 0 || bVar2.mo39121b() != null) {
                    arrayList.add(bVar2);
                }
            } else {
                throw new IllegalArgumentException("Parser cursor may not be null");
            }
        }
        return (C19175b[]) arrayList.toArray(new C19175b[arrayList.size()]);
    }

    /* renamed from: a */
    private C19186d m46754a(C19188b bVar, C19183h hVar, char[] cArr) {
        boolean z;
        boolean z2;
        String str;
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (hVar != null) {
            int i = hVar.f52881c;
            int i2 = hVar.f52881c;
            int i3 = hVar.f52880b;
            while (true) {
                z = true;
                if (i >= i3) {
                    break;
                }
                char b = bVar.mo39152b(i);
                if (b == '=') {
                    break;
                } else if (m46756a(b, cArr)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            z2 = false;
            if (i == i3) {
                str = bVar.mo39153b(i2, i3);
                z2 = true;
            } else {
                str = bVar.mo39153b(i2, i);
                i++;
            }
            if (z2) {
                hVar.mo39141a(i);
                return m46755a(str, (String) null);
            }
            int i4 = i;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i4 >= i3) {
                    z = z2;
                    break;
                }
                char b2 = bVar.mo39152b(i4);
                if (b2 == '\"' && !z3) {
                    z4 = !z4;
                }
                if (!z4 && !z3 && m46756a(b2, cArr)) {
                    break;
                }
                if (z3 || !z4 || b2 != '\\') {
                    z3 = false;
                } else {
                    z3 = true;
                }
                i4++;
            }
            while (i < i4 && C19185a.m46769a(bVar.mo39152b(i))) {
                i++;
            }
            int i5 = i4;
            while (i5 > i && C19185a.m46769a(bVar.mo39152b(i5 - 1))) {
                i5--;
            }
            if (i5 - i >= 2 && bVar.mo39152b(i) == '\"' && bVar.mo39152b(i5 - 1) == '\"') {
                i++;
                i5--;
            }
            String a = bVar.mo39148a(i, i5);
            if (z) {
                i4++;
            }
            hVar.mo39141a(i4);
            return m46755a(str, a);
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
