package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16654ei;
import com.google.android.gms.internal.measurement.C16657el;
import com.google.android.gms.internal.measurement.C16658em;
import com.google.android.gms.internal.measurement.C16659en;
import com.google.android.gms.internal.measurement.C16866x;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.ap */
final class C17178ap {

    /* renamed from: a */
    private static final C17169ah<C16654ei> f48575a = new C17169ah<>(C17196bg.f48618a, true);

    /* renamed from: b */
    private final C17222r f48576b;

    /* renamed from: c */
    private final Map<String, C17223s> f48577c;

    /* renamed from: d */
    private final Map<String, C17223s> f48578d;

    /* renamed from: e */
    private final Map<String, C17223s> f48579e;

    /* renamed from: f */
    private final C17199bj<C16658em, C17169ah<C16654ei>> f48580f;

    /* renamed from: g */
    private final C17199bj<String, C17182at> f48581g;

    /* renamed from: h */
    private final Set<C16659en> f48582h;

    /* renamed from: i */
    private final C17203c f48583i;

    /* renamed from: j */
    private final Map<String, C17183au> f48584j;

    /* renamed from: k */
    private volatile String f48585k;

    /* renamed from: l */
    private int f48586l;

    /* renamed from: a */
    public final synchronized void mo33437a(String str) {
        m42117b(str);
        C17214j a = this.f48576b.mo33485a(str).mo33484a();
        for (C16658em a2 : (Set) m42114a(this.f48582h, (Set<String>) new HashSet<String>(), (C17181as) new C17180ar(this), a.mo33472b()).f48564a) {
            m42113a(this.f48577c, a2, (Set<String>) new HashSet<String>(), a.mo33471a());
        }
        m42117b(null);
    }

    /* renamed from: b */
    private final synchronized void m42117b(String str) {
        this.f48585k = str;
    }

    /* renamed from: a */
    private final C17169ah<Set<C16658em>> m42114a(Set<C16659en> set, Set<String> set2, C17181as asVar, C17177ao aoVar) {
        boolean z;
        C17169ah ahVar;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (true) {
            boolean z2 = true;
            while (true) {
                if (it.hasNext()) {
                    C16659en enVar = (C16659en) it.next();
                    C17176an a = aoVar.mo33429a();
                    Iterator it2 = enVar.f46873b.iterator();
                    while (true) {
                        boolean z3 = true;
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator it3 = enVar.f46872a.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        C17196bg.m42132b((Object) Boolean.valueOf(true));
                                        ahVar = new C17169ah(Boolean.valueOf(true), z);
                                        break;
                                    }
                                    C17169ah a2 = m42111a((C16658em) it3.next(), set2, a.mo33424b());
                                    if (!((Boolean) a2.f48564a).booleanValue()) {
                                        C17196bg.m42132b((Object) Boolean.valueOf(false));
                                        ahVar = new C17169ah(Boolean.valueOf(false), a2.f48565b);
                                        break;
                                    }
                                    z = z && a2.f48565b;
                                }
                            } else {
                                C17169ah a3 = m42111a((C16658em) it2.next(), set2, a.mo33423a());
                                if (((Boolean) a3.f48564a).booleanValue()) {
                                    C17196bg.m42132b((Object) Boolean.valueOf(false));
                                    ahVar = new C17169ah(Boolean.valueOf(false), a3.f48565b);
                                    break;
                                } else if (!z || !a3.f48565b) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    if (((Boolean) ahVar.f48564a).booleanValue()) {
                        asVar.mo33438a(enVar, hashSet, hashSet2, a);
                    }
                    if (!z2 || !ahVar.f48565b) {
                        z2 = false;
                    }
                } else {
                    hashSet.removeAll(hashSet2);
                    return new C17169ah<>(hashSet, z2);
                }
            }
        }
    }

    /* renamed from: a */
    private final C17169ah<Boolean> m42111a(C16658em emVar, Set<String> set, C17173ak akVar) {
        C17169ah a = m42113a(this.f48578d, emVar, set, akVar);
        Boolean a2 = C17196bg.m42130a((C16654ei) a.f48564a);
        C17196bg.m42132b((Object) a2);
        return new C17169ah<>(a2, a.f48565b);
    }

    /* renamed from: a */
    private final String m42115a() {
        if (this.f48586l <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f48586l));
        for (int i = 2; i < this.f48586l; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* renamed from: a */
    private final C17169ah<C16654ei> m42112a(String str, Set<String> set, C17230z zVar) {
        C16658em emVar;
        C17169ah<C16654ei> ahVar;
        this.f48586l++;
        C17182at atVar = (C17182at) this.f48581g.mo33457a(str);
        if (atVar != null) {
            m42116a(atVar.f48592b, set);
            this.f48586l--;
            return atVar.f48591a;
        }
        C17183au auVar = (C17183au) this.f48584j.get(str);
        if (auVar == null) {
            String a = m42115a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 15 + String.valueOf(str).length());
            sb.append(a);
            sb.append("Invalid macro: ");
            sb.append(str);
            this.f48586l--;
            return f48575a;
        }
        Set<C16659en> set2 = auVar.f48593a;
        Map<C16659en, List<C16658em>> map = auVar.f48594b;
        Map<C16659en, List<String>> map2 = auVar.f48596d;
        Map<C16659en, List<C16658em>> map3 = auVar.f48595c;
        Map<C16659en, List<String>> map4 = auVar.f48597e;
        C17177ao b = zVar.mo33420b();
        C17179aq aqVar = new C17179aq(this, map, map2, map3, map4);
        C17169ah a2 = m42114a(set2, set, (C17181as) aqVar, b);
        if (((Set) a2.f48564a).isEmpty()) {
            emVar = auVar.f48598f;
        } else {
            if (((Set) a2.f48564a).size() > 1) {
                String a3 = m42115a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 37 + String.valueOf(str).length());
                sb2.append(a3);
                sb2.append("Multiple macros active for macroName ");
                sb2.append(str);
            }
            emVar = (C16658em) ((Set) a2.f48564a).iterator().next();
        }
        if (emVar == null) {
            this.f48586l--;
            return f48575a;
        }
        C17169ah<C16654ei> a4 = m42113a(this.f48579e, emVar, set, zVar.mo33419a());
        boolean z = a2.f48565b && a4.f48565b;
        if (a4 == f48575a) {
            ahVar = f48575a;
        } else {
            ahVar = new C17169ah<>((C16654ei) a4.f48564a, z);
        }
        C16654ei eiVar = emVar.f46870a;
        if (ahVar.f48565b) {
            new C17182at(ahVar, eiVar);
        }
        m42116a(eiVar, set);
        this.f48586l--;
        return ahVar;
    }

    /* renamed from: a */
    private final void m42116a(C16654ei eiVar, Set<String> set) {
        if (eiVar != null) {
            C17169ah<C16654ei> a = m42110a(eiVar, set, (C17197bh) new C17168ag());
            if (a != f48575a) {
                Object b = C17196bg.m42133b((C16654ei) a.f48564a);
                if (b instanceof Map) {
                    this.f48583i.mo33461a((Map) b);
                } else if (b instanceof List) {
                    for (Object next : (List) b) {
                        if (next instanceof Map) {
                            this.f48583i.mo33461a((Map) next);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final C17169ah<C16654ei> m42110a(C16654ei eiVar, Set<String> set, C17197bh bhVar) {
        if (!eiVar.f46867l) {
            return new C17169ah<>(eiVar, true);
        }
        int i = eiVar.f46856a;
        if (i != 7) {
            switch (i) {
                case 2:
                    C16654ei a = C16657el.m39803a(eiVar);
                    a.f46858c = new C16654ei[eiVar.f46858c.length];
                    for (int i2 = 0; i2 < eiVar.f46858c.length; i2++) {
                        C17169ah<C16654ei> a2 = m42110a(eiVar.f46858c[i2], set, bhVar.mo33430a(i2));
                        if (a2 == f48575a) {
                            return f48575a;
                        }
                        a.f46858c[i2] = (C16654ei) a2.f48564a;
                    }
                    return new C17169ah<>(a, false);
                case 3:
                    C16654ei a3 = C16657el.m39803a(eiVar);
                    if (eiVar.f46859d.length != eiVar.f46860e.length) {
                        String str = "Invalid serving value: ";
                        String valueOf = String.valueOf(eiVar.toString());
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            new String(str);
                        }
                        return f48575a;
                    }
                    a3.f46859d = new C16654ei[eiVar.f46859d.length];
                    a3.f46860e = new C16654ei[eiVar.f46859d.length];
                    for (int i3 = 0; i3 < eiVar.f46859d.length; i3++) {
                        C17169ah<C16654ei> a4 = m42110a(eiVar.f46859d[i3], set, bhVar.mo33432b(i3));
                        C17169ah<C16654ei> a5 = m42110a(eiVar.f46860e[i3], set, bhVar.mo33433c(i3));
                        if (a4 == f48575a || a5 == f48575a) {
                            return f48575a;
                        }
                        a3.f46859d[i3] = (C16654ei) a4.f48564a;
                        a3.f46860e[i3] = (C16654ei) a5.f48564a;
                    }
                    return new C17169ah<>(a3, false);
                case 4:
                    if (set.contains(eiVar.f46861f)) {
                        String str2 = eiVar.f46861f;
                        String obj = set.toString();
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79 + String.valueOf(obj).length());
                        sb.append("Macro cycle detected.  Current macro reference: ");
                        sb.append(str2);
                        sb.append(".  Previous macro references: ");
                        sb.append(obj);
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        return f48575a;
                    }
                    set.add(eiVar.f46861f);
                    C17169ah<C16654ei> a6 = C17198bi.m42143a(m42112a(eiVar.f46861f, set, bhVar.mo33431a()), eiVar.f46866k);
                    set.remove(eiVar.f46861f);
                    return a6;
                default:
                    int i4 = eiVar.f46856a;
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Unknown type: ");
                    sb2.append(i4);
                    return f48575a;
            }
        } else {
            C16654ei a7 = C16657el.m39803a(eiVar);
            a7.f46865j = new C16654ei[eiVar.f46865j.length];
            for (int i5 = 0; i5 < eiVar.f46865j.length; i5++) {
                C17169ah<C16654ei> a8 = m42110a(eiVar.f46865j[i5], set, bhVar.mo33434d(i5));
                if (a8 == f48575a) {
                    return f48575a;
                }
                a7.f46865j[i5] = (C16654ei) a8.f48564a;
            }
            return new C17169ah<>(a7, false);
        }
    }

    /* renamed from: a */
    private final C17169ah<C16654ei> m42113a(Map<String, C17223s> map, C16658em emVar, Set<String> set, C17173ak akVar) {
        C16654ei eiVar = (C16654ei) emVar.mo31971a().get(C16866x.FUNCTION.toString());
        if (eiVar == null) {
            return f48575a;
        }
        String str = eiVar.f46862g;
        C17223s sVar = (C17223s) map.get(str);
        if (sVar == null) {
            String.valueOf(str).concat(" has no backing implementation.");
            return f48575a;
        }
        C17169ah<C16654ei> ahVar = (C17169ah) this.f48580f.mo33457a(emVar);
        if (ahVar != null) {
            return ahVar;
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        boolean z2 = true;
        for (Entry entry : emVar.mo31971a().entrySet()) {
            C17169ah<C16654ei> a = m42110a((C16654ei) entry.getValue(), set, akVar.mo33421a((String) entry.getKey()).mo33422a((C16654ei) entry.getValue()));
            if (a == f48575a) {
                return f48575a;
            }
            if (a.f48565b) {
                emVar.mo31972a((String) entry.getKey(), (C16654ei) a.f48564a);
            } else {
                z2 = false;
            }
            hashMap.put((String) entry.getKey(), (C16654ei) a.f48564a);
        }
        if (!sVar.mo33488a(hashMap.keySet())) {
            String valueOf = String.valueOf(sVar.mo33489b());
            String valueOf2 = String.valueOf(hashMap.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("Incorrect keys for function ");
            sb.append(str);
            sb.append(" required ");
            sb.append(valueOf);
            sb.append(" had ");
            sb.append(valueOf2);
            return f48575a;
        }
        if (!z2 || !sVar.mo33487a()) {
            z = false;
        }
        return new C17169ah<>(sVar.mo33486a((Map<String, C16654ei>) hashMap), z);
    }
}
