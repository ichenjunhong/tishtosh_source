package p2628d.p2650m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: d.m.q */
public class C52831q {

    /* renamed from: d.m.q$a */
    static final class C52832a extends C52712l implements C52671b<String, String> {

        /* renamed from: a */
        public static final C52832a f131084a = new C52832a();

        C52832a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "line");
            return str;
        }
    }

    /* renamed from: d.m.q$b */
    static final class C52833b extends C52712l implements C52671b<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f131085a;

        C52833b(String str) {
            this.f131085a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "line");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f131085a);
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: b */
    private static final C52671b<String, String> m112389b(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C52832a.f131084a;
        }
        return new C52833b<>(str);
    }

    /* renamed from: a */
    private static final int m112386a(String str) {
        CharSequence charSequence = str;
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C52804a.m112364a(charSequence.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    /* renamed from: a */
    public static final String m112387a(String str, String str2) {
        int i;
        String str3 = str;
        C52711k.m112240b(str3, "$this$replaceIndent");
        C52711k.m112240b(str2, "newIndent");
        List h = C52830p.m112463h(str3);
        Iterable iterable = h;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!C52830p.m112402a((String) next)) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
        for (String a : iterable2) {
            arrayList2.add(Integer.valueOf(m112386a(a)));
        }
        Integer num = (Integer) C52575l.m112147j((List) arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * h.size());
        C52671b b = m112389b(str2);
        int a2 = C52575l.m112093a(h);
        Collection arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C52575l.m112100b();
            }
            String str4 = (String) next2;
            if ((i2 == 0 || i2 == a2) && C52830p.m112402a(str4)) {
                str4 = null;
            } else {
                String c = C52830p.m112361c(str4, i);
                if (c != null) {
                    String str5 = (String) b.invoke(c);
                    if (str5 != null) {
                        str4 = str5;
                    }
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) C52575l.m112115a((List) arrayList3, new StringBuilder(length), "\n", "", "", -1, "...", null)).toString();
        C52711k.m112236a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: a */
    public static final String m112388a(String str, String str2, String str3) {
        int i;
        String str4 = str;
        String str5 = str3;
        C52711k.m112240b(str4, "$this$replaceIndentByMargin");
        C52711k.m112240b(str2, "newIndent");
        C52711k.m112240b(str5, "marginPrefix");
        if (!C52830p.m112402a(str5)) {
            List h = C52830p.m112463h(str4);
            int length = str.length() + (str2.length() * h.size());
            C52671b b = m112389b(str2);
            int a = C52575l.m112093a(h);
            Iterable iterable = h;
            Collection arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C52575l.m112100b();
                }
                String str6 = (String) next;
                String str7 = null;
                if ((i2 == 0 || i2 == a) && C52830p.m112402a(str6)) {
                    str6 = null;
                } else {
                    CharSequence charSequence = str6;
                    int length2 = charSequence.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C52804a.m112364a(charSequence.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C52830p.m112405a(str6, str3, i, false, 4, (Object) null)) {
                            int length3 = i5 + str3.length();
                            if (str6 != null) {
                                str7 = str6.substring(length3);
                                C52711k.m112236a((Object) str7, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    if (str7 != null) {
                        String str8 = (String) b.invoke(str7);
                        if (str8 != null) {
                            str6 = str8;
                        }
                    }
                }
                if (str6 != null) {
                    arrayList.add(str6);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C52575l.m112115a((List) arrayList, new StringBuilder(length), "\n", "", "", -1, "...", null)).toString();
            C52711k.m112236a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
