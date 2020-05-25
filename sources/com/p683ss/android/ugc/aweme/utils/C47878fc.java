package com.p683ss.android.ugc.aweme.utils;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2647j.C52753d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.utils.fc */
public final class C47878fc {

    /* renamed from: a */
    static final C52671b<String, String> f120470a = C47880b.f120472a;

    /* renamed from: com.ss.android.ugc.aweme.utils.fc$a */
    static final class C47879a extends C52712l implements C52671b<String, String> {

        /* renamed from: a */
        public static final C47879a f120471a = new C47879a();

        C47879a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            String obj2 = C52830p.m112447b(str).toString();
            if (C52830p.m112411b(obj2, ",", false, 2, null)) {
                if (obj2 != null) {
                    String substring = obj2.substring(1);
                    C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    if (substring != null) {
                        obj2 = C52830p.m112447b(substring).toString();
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) C47878fc.f120470a.invoke(obj2));
            sb.append("\n");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fc$b */
    static final class C47880b extends C52712l implements C52671b<String, String> {

        /* renamed from: a */
        public static final C47880b f120472a = new C47880b();

        C47880b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            CharSequence charSequence = str;
            int length = C52830p.m112447b(charSequence).toString().length();
            StringBuilder sb = new StringBuilder("| ");
            sb.append(C52830p.m112447b(charSequence).toString());
            sb.append(C52830p.m112397a(" ", Math.max(0, 197 - length)));
            sb.append('|');
            return sb.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m103574a(Object[] objArr, boolean z) {
        Object[] objArr2;
        boolean z2;
        boolean z3;
        List list;
        C52711k.m112240b(objArr, "args");
        if (objArr.length > 1) {
            C52711k.m112240b(objArr, "$this$drop");
            int c = C52753d.m112321c(objArr.length - 1, 0);
            C52711k.m112240b(objArr, "$this$takeLast");
            if (c >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (c == 0) {
                    list = C52575l.m112097a();
                } else {
                    int length = objArr.length;
                    if (c >= length) {
                        list = C52568f.m112084e(objArr);
                    } else if (c == 1) {
                        list = C52575l.m112092a(objArr[length - 1]);
                    } else {
                        ArrayList arrayList = new ArrayList(c);
                        for (int i = length - c; i < length; i++) {
                            arrayList.add(objArr[i]);
                        }
                        list = arrayList;
                    }
                }
                Object[] array = list.toArray(new Object[0]);
                if (array != null) {
                    String.valueOf(objArr[0]);
                    objArr2 = array;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                StringBuilder sb = new StringBuilder("Requested element count ");
                sb.append(c);
                sb.append(" is less than zero.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            objArr2 = objArr;
        }
        StringBuilder sb2 = new StringBuilder("|");
        sb2.append(C52830p.m112397a("-", 198));
        sb2.append("|\n");
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder(" \n");
        sb4.append(sb3);
        String a = C52568f.m112075a(objArr2, ", ", null, null, 0, null, null, 62, null);
        if (a != null) {
            sb4.append(C52575l.m112120a(C52830p.m112452b(C52830p.m112447b(a).toString(), new String[]{"\n"}, false, 0, 6, (Object) null), "", null, null, 0, null, C47879a.f120471a, 30, null));
            sb4.append(sb3);
            if (z) {
                String stackTraceString = Log.getStackTraceString(new Throwable());
                C52711k.m112236a((Object) stackTraceString, "trace");
                Iterable a2 = C52830p.m112437a((CharSequence) stackTraceString, new char[]{10}, false, 0, 6, (Object) null);
                Collection arrayList2 = new ArrayList();
                for (Object next : a2) {
                    CharSequence charSequence = (String) next;
                    if (!C52830p.m112456b(charSequence, (CharSequence) "com.ss.", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "smartLog", false, 2, (Object) null)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        arrayList2.add(next);
                    }
                }
                sb4.append(C52575l.m112120a((List) arrayList2, "\n", null, null, 0, null, f120470a, 30, null));
                sb4.append(10);
                sb4.append(sb3);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
