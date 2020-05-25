package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c;
import java.util.Comparator;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h */
public final class C31333h extends C31312f {

    /* renamed from: b */
    public static final C31334a f82093b = new C31334a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h$a */
    public static final class C31334a {
        private C31334a() {
        }

        public /* synthetic */ C31334a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h$b */
    public static final class C31335b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((C31315c) t2).f82071d), Long.valueOf(((C31315c) t).f82071d));
        }
    }

    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_publish";
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo64212c() {
        /*
            r10 = this;
            r0 = 4
            r1 = 2
            java.util.List r0 = r10.mo64213a(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h$b r1 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.h$b
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r0 = p2628d.p2629a.C52575l.m112122a(r0, r1)
            java.lang.String r1 = "$this$groupNearestByType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L_0x0025:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r4 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r4
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r5 = r4.f82073f
            if (r3 == 0) goto L_0x0043
            r6 = r3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = p2628d.p2629a.C52575l.m112140f(r6)
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r6 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r6
            if (r6 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r6 = r6.f82073f
            goto L_0x0044
        L_0x0043:
            r6 = r2
        L_0x0044:
            boolean r5 = com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31328e.m73054a(r5, r6)
            if (r5 == 0) goto L_0x0053
            if (r3 != 0) goto L_0x004f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004f:
            r3.add(r4)
            goto L_0x0025
        L_0x0053:
            if (r3 == 0) goto L_0x005d
            if (r3 != 0) goto L_0x005a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005a:
            r1.add(r3)
        L_0x005d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r4)
            goto L_0x0025
        L_0x0066:
            if (r3 == 0) goto L_0x0070
            if (r3 != 0) goto L_0x006d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x006d:
            r1.add(r3)
        L_0x0070:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r3 = p2628d.p2629a.C52575l.m112104a(r1, r2)
            r0.<init>(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r1 = r1.iterator()
        L_0x0085:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x019c
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object r6 = r3.get(r5)
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r6 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r6
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r6 = r6.f82073f
            boolean r6 = r6 instanceof com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b
            if (r6 == 0) goto L_0x0155
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = p2628d.p2629a.C52575l.m112104a(r4, r2)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r4 = r4.iterator()
        L_0x00b2:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0112
            java.lang.Object r7 = r4.next()
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r7 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r7
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r8 = r7.f82073f
            boolean r9 = r8 instanceof com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31319a
            if (r9 == 0) goto L_0x00e5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r9 = r7.f82073f
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$a r9 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31319a) r9
            java.lang.String r9 = r9.f82078c
            r8.append(r9)
            r9 = 58
            r8.append(r9)
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r7 = r7.f82073f
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$a r7 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31319a) r7
            java.lang.String r7 = r7.f82077b
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            goto L_0x010e
        L_0x00e5:
            boolean r9 = r8 instanceof com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31321c
            if (r9 == 0) goto L_0x0101
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r7 = r7.f82073f
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$c r7 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31321c) r7
            java.lang.String r7 = r7.f82080b
            r8.append(r7)
            java.lang.String r7 = ":丢失"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            goto L_0x010e
        L_0x0101:
            boolean r8 = r8 instanceof com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31320b
            if (r8 == 0) goto L_0x010c
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r7 = r7.f82073f
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$b r7 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c.C31316a.C31318b.C31320b) r7
            java.lang.String r7 = r7.f82079b
            goto L_0x010e
        L_0x010c:
            java.lang.String r7 = ""
        L_0x010e:
            r6.add(r7)
            goto L_0x00b2
        L_0x0112:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r4 = r6.iterator()
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x014b
            java.lang.Object r6 = r4.next()
        L_0x0124:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0147
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r6 = 59
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            goto L_0x0124
        L_0x0147:
            r4 = r6
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0155
        L_0x014b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0155:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r3.size()
            r6.append(r7)
            java.lang.Object r3 = r3.get(r5)
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r3 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r3
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a r3 = r3.f82073f
            java.lang.String r3 = r3.f82075a
            r6.append(r3)
            r3 = r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0178
            r5 = 1
        L_0x0178:
            if (r5 == 0) goto L_0x018e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "("
            r3.<init>(r5)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0190
        L_0x018e:
            java.lang.String r3 = ""
        L_0x0190:
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r0.add(r3)
            goto L_0x0085
        L_0x019c:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r1 = ""
            java.util.Iterator r0 = r0.iterator()
        L_0x01a6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01c7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 124(0x7c, float:1.74E-43)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            goto L_0x01a6
        L_0x01c7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31333h.mo64212c():java.lang.String");
    }
}
