package android.support.p030v4.app;

import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.view.C1056u;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.s */
final class C0680s {

    /* renamed from: a */
    private static final int[] f2423a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0692v f2424b;

    /* renamed from: c */
    private static final C0692v f2425c = m1951a();

    /* renamed from: android.support.v4.app.s$a */
    static class C0685a {

        /* renamed from: a */
        public Fragment f2454a;

        /* renamed from: b */
        public boolean f2455b;

        /* renamed from: c */
        public C0645d f2456c;

        /* renamed from: d */
        public Fragment f2457d;

        /* renamed from: e */
        public boolean f2458e;

        /* renamed from: f */
        public C0645d f2459f;

        C0685a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0376 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0180 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1964a(android.support.p030v4.app.C0658m r54, java.util.ArrayList<android.support.p030v4.app.C0645d> r55, java.util.ArrayList<java.lang.Boolean> r56, int r57, int r58, boolean r59) {
        /*
            r0 = r54
            r1 = r55
            r2 = r56
            r3 = r58
            r4 = r59
            int r5 = r0.f2369l
            if (r5 > 0) goto L_0x000f
            return
        L_0x000f:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r6 = r57
        L_0x0016:
            if (r6 >= r3) goto L_0x0034
            java.lang.Object r7 = r1.get(r6)
            android.support.v4.app.d r7 = (android.support.p030v4.app.C0645d) r7
            java.lang.Object r8 = r2.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x002e
            m1972b(r7, r5, r4)
            goto L_0x0031
        L_0x002e:
            m1963a(r7, r5, r4)
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0034:
            int r6 = r5.size()
            if (r6 == 0) goto L_0x0388
            android.view.View r6 = new android.view.View
            android.support.v4.app.j r7 = r0.f2370m
            android.content.Context r7 = r7.f2344c
            r6.<init>(r7)
            int r15 = r5.size()
            r13 = 0
        L_0x0048:
            if (r13 >= r15) goto L_0x0388
            int r7 = r5.keyAt(r13)
            r12 = r57
            android.support.v4.f.a r11 = m1953a(r7, r1, r2, r12, r3)
            java.lang.Object r8 = r5.valueAt(r13)
            r10 = r8
            android.support.v4.app.s$a r10 = (android.support.p030v4.app.C0680s.C0685a) r10
            r20 = 0
            if (r4 == 0) goto L_0x01de
            android.support.v4.app.h r9 = r0.f2371n
            boolean r9 = r9.mo1969a()
            if (r9 == 0) goto L_0x0070
            android.support.v4.app.h r9 = r0.f2371n
            android.view.View r7 = r9.mo1968a(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0072
        L_0x0070:
            r7 = r20
        L_0x0072:
            if (r7 == 0) goto L_0x01d5
            android.support.v4.app.Fragment r9 = r10.f2454a
            android.support.v4.app.Fragment r8 = r10.f2457d
            android.support.v4.app.v r14 = m1952a(r8, r9)
            if (r14 == 0) goto L_0x01d5
            boolean r1 = r10.f2455b
            boolean r2 = r10.f2458e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r35 = r5
            java.lang.Object r5 = m1957a(r14, r9, r1)
            java.lang.Object r2 = m1971b(r14, r8, r2)
            android.support.v4.app.Fragment r12 = r10.f2454a
            r36 = r13
            android.support.v4.app.Fragment r13 = r10.f2457d
            if (r12 == 0) goto L_0x00a9
            r37 = r15
            android.view.View r15 = r12.getView()
            r0 = 0
            r15.setVisibility(r0)
            goto L_0x00ab
        L_0x00a9:
            r37 = r15
        L_0x00ab:
            if (r12 == 0) goto L_0x014f
            if (r13 != 0) goto L_0x00b1
            goto L_0x014f
        L_0x00b1:
            boolean r0 = r10.f2455b
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x00be
            r38 = r1
            r15 = r20
            goto L_0x00c4
        L_0x00be:
            java.lang.Object r15 = m1956a(r14, r12, r13, r0)
            r38 = r1
        L_0x00c4:
            android.support.v4.f.a r1 = m1970b(r14, r11, r15, r10)
            r39 = r9
            android.support.v4.f.a r9 = m1954a(r14, r11, r15, r10)
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x00e1
            if (r1 == 0) goto L_0x00d9
            r1.clear()
        L_0x00d9:
            if (r9 == 0) goto L_0x00de
            r9.clear()
        L_0x00de:
            r15 = r20
            goto L_0x00f3
        L_0x00e1:
            r40 = r15
            java.util.Set r15 = r11.keySet()
            m1968a(r4, r1, r15)
            java.util.Collection r15 = r11.values()
            m1968a(r3, r9, r15)
            r15 = r40
        L_0x00f3:
            if (r5 != 0) goto L_0x00fe
            if (r2 != 0) goto L_0x00fe
            if (r15 != 0) goto L_0x00fe
            r42 = r3
        L_0x00fb:
            r41 = r11
            goto L_0x0156
        L_0x00fe:
            r41 = r11
            r11 = 1
            m1961a(r12, r13, r0, r1, r11)
            if (r15 == 0) goto L_0x0134
            r3.add(r6)
            r14.mo566a(r15, r6, r4)
            boolean r11 = r10.f2458e
            r42 = r3
            android.support.v4.app.d r3 = r10.f2459f
            r21 = r14
            r22 = r15
            r23 = r2
            r24 = r1
            r25 = r11
            r26 = r3
            m1965a(r21, r22, r23, r24, r25, r26)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r20 = m1955a(r9, r10, r5, r0)
            if (r20 == 0) goto L_0x012f
            r14.mo564a(r5, r1)
        L_0x012f:
            r34 = r1
            r32 = r20
            goto L_0x013a
        L_0x0134:
            r42 = r3
            r32 = r20
            r34 = r32
        L_0x013a:
            android.support.v4.app.s$3 r1 = new android.support.v4.app.s$3
            r27 = r1
            r28 = r12
            r29 = r13
            r30 = r0
            r31 = r9
            r33 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            android.support.p030v4.app.C0627ae.m1706a(r7, r1)
            goto L_0x0158
        L_0x014f:
            r38 = r1
            r42 = r3
            r39 = r9
            goto L_0x00fb
        L_0x0156:
            r15 = r20
        L_0x0158:
            if (r5 != 0) goto L_0x015e
            if (r15 != 0) goto L_0x015e
            if (r2 == 0) goto L_0x01db
        L_0x015e:
            java.util.ArrayList r0 = m1960a(r14, r2, r8, r4, r6)
            r1 = r39
            r3 = r42
            java.util.ArrayList r9 = m1960a(r14, r5, r1, r3, r6)
            r10 = 4
            m1967a(r9, r10)
            r21 = r14
            r22 = r5
            r23 = r2
            r24 = r15
            r25 = r1
            r26 = r38
            java.lang.Object r1 = m1958a(r21, r22, r23, r24, r25, r26)
            if (r1 == 0) goto L_0x01db
            if (r8 == 0) goto L_0x01a5
            if (r2 == 0) goto L_0x01a5
            boolean r10 = r8.mAdded
            if (r10 == 0) goto L_0x01a5
            boolean r10 = r8.mHidden
            if (r10 == 0) goto L_0x01a5
            boolean r10 = r8.mHiddenChanged
            if (r10 == 0) goto L_0x01a5
            r10 = 1
            r8.setHideReplaced(r10)
            android.view.View r10 = r8.getView()
            r14.mo574b(r2, r10, r0)
            android.view.ViewGroup r8 = r8.mContainer
            android.support.v4.app.s$1 r10 = new android.support.v4.app.s$1
            r10.<init>(r0)
            android.support.p030v4.app.C0627ae.m1706a(r8, r10)
        L_0x01a5:
            java.util.ArrayList r20 = android.support.p030v4.app.C0692v.m1991a(r3)
            r27 = r14
            r28 = r1
            r29 = r5
            r30 = r9
            r31 = r2
            r32 = r0
            r33 = r15
            r34 = r3
            r27.mo567a(r28, r29, r30, r31, r32, r33, r34)
            r14.mo563a(r7, r1)
            r16 = r14
            r17 = r7
            r18 = r4
            r19 = r3
            r21 = r41
            r16.mo2336a(r17, r18, r19, r20, r21)
            r0 = 0
            m1967a(r9, r0)
            r14.mo569a(r15, r4, r3)
            goto L_0x0370
        L_0x01d5:
            r35 = r5
            r36 = r13
            r37 = r15
        L_0x01db:
            r0 = 0
            goto L_0x0370
        L_0x01de:
            r1 = r0
            r35 = r5
            r41 = r11
            r36 = r13
            r37 = r15
            r0 = 0
            android.support.v4.app.h r2 = r1.f2371n
            boolean r2 = r2.mo1969a()
            if (r2 == 0) goto L_0x01f9
            android.support.v4.app.h r2 = r1.f2371n
            android.view.View r2 = r2.mo1968a(r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x01fb
        L_0x01f9:
            r2 = r20
        L_0x01fb:
            if (r2 == 0) goto L_0x0370
            android.support.v4.app.Fragment r3 = r10.f2454a
            android.support.v4.app.Fragment r4 = r10.f2457d
            android.support.v4.app.v r5 = m1952a(r4, r3)
            if (r5 == 0) goto L_0x0370
            boolean r7 = r10.f2455b
            boolean r8 = r10.f2458e
            java.lang.Object r9 = m1957a(r5, r3, r7)
            java.lang.Object r8 = m1971b(r5, r4, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            android.support.v4.app.Fragment r14 = r10.f2454a
            android.support.v4.app.Fragment r13 = r10.f2457d
            if (r14 == 0) goto L_0x02ee
            if (r13 != 0) goto L_0x0227
            goto L_0x02ee
        L_0x0227:
            boolean r12 = r10.f2455b
            boolean r11 = r41.isEmpty()
            if (r11 == 0) goto L_0x0234
            r0 = r20
        L_0x0231:
            r11 = r41
            goto L_0x023a
        L_0x0234:
            java.lang.Object r11 = m1956a(r5, r14, r13, r12)
            r0 = r11
            goto L_0x0231
        L_0x023a:
            android.support.v4.f.a r1 = m1970b(r5, r11, r0, r10)
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x0247
            r0 = r20
            goto L_0x0252
        L_0x0247:
            r43 = r0
            java.util.Collection r0 = r1.values()
            r7.addAll(r0)
            r0 = r43
        L_0x0252:
            if (r9 != 0) goto L_0x026e
            if (r8 != 0) goto L_0x026e
            if (r0 != 0) goto L_0x026e
            r46 = r3
            r52 = r7
            r0 = r8
            r1 = r9
            r49 = r10
            r51 = r11
            r53 = r15
            r17 = r20
            r22 = r36
            r21 = r37
            r23 = 0
            goto L_0x0305
        L_0x026e:
            r44 = r11
            r11 = 1
            m1961a(r14, r13, r12, r1, r11)
            if (r0 == 0) goto L_0x02a3
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r5.mo566a(r0, r6, r7)
            r45 = r7
            boolean r7 = r10.f2458e
            r46 = r3
            android.support.v4.app.d r3 = r10.f2459f
            r47 = r10
            r10 = r11
            r17 = r44
            r11 = r5
            r18 = r12
            r12 = r0
            r19 = r13
            r13 = r8
            r21 = r14
            r14 = r1
            r1 = r15
            r15 = r7
            r16 = r3
            m1965a(r11, r12, r13, r14, r15, r16)
            if (r9 == 0) goto L_0x02a1
            r5.mo564a(r9, r10)
        L_0x02a1:
            r3 = r10
            goto L_0x02b4
        L_0x02a3:
            r46 = r3
            r45 = r7
            r47 = r10
            r18 = r12
            r19 = r13
            r21 = r14
            r1 = r15
            r17 = r44
            r3 = r20
        L_0x02b4:
            android.support.v4.app.s$4 r15 = new android.support.v4.app.s$4
            r14 = r45
            r7 = r15
            r13 = r8
            r8 = r5
            r12 = r9
            r9 = r17
            r11 = r47
            r10 = r0
            r48 = r0
            r49 = r11
            r0 = r17
            r50 = r12
            r12 = r1
            r51 = r0
            r0 = r13
            r22 = r36
            r13 = r6
            r52 = r14
            r23 = 0
            r14 = r21
            r53 = r1
            r1 = r15
            r21 = r37
            r15 = r19
            r16 = r18
            r17 = r52
            r18 = r50
            r19 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            android.support.p030v4.app.C0627ae.m1706a(r2, r1)
            r17 = r48
            goto L_0x0303
        L_0x02ee:
            r46 = r3
            r52 = r7
            r0 = r8
            r50 = r9
            r49 = r10
            r53 = r15
            r22 = r36
            r21 = r37
            r51 = r41
            r23 = 0
            r17 = r20
        L_0x0303:
            r1 = r50
        L_0x0305:
            if (r1 != 0) goto L_0x030b
            if (r17 != 0) goto L_0x030b
            if (r0 == 0) goto L_0x0376
        L_0x030b:
            r3 = r52
            java.util.ArrayList r3 = m1960a(r5, r0, r4, r3, r6)
            if (r3 == 0) goto L_0x0319
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x031b
        L_0x0319:
            r0 = r20
        L_0x031b:
            r5.mo573b(r1, r6)
            r8 = r49
            boolean r4 = r8.f2455b
            r11 = r5
            r12 = r1
            r13 = r0
            r14 = r17
            r15 = r46
            r16 = r4
            java.lang.Object r4 = m1958a(r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0376
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r11 = r5
            r12 = r4
            r13 = r1
            r14 = r19
            r15 = r0
            r16 = r3
            r18 = r53
            r11.mo567a(r12, r13, r14, r15, r16, r17, r18)
            android.support.v4.app.s$2 r15 = new android.support.v4.app.s$2
            r7 = r15
            r8 = r1
            r9 = r5
            r10 = r6
            r11 = r46
            r12 = r53
            r13 = r19
            r14 = r3
            r1 = r15
            r15 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            android.support.p030v4.app.C0627ae.m1706a(r2, r1)
            android.support.v4.app.v$2 r0 = new android.support.v4.app.v$2
            r1 = r51
            r3 = r53
            r0.<init>(r3, r1)
            android.support.p030v4.app.C0627ae.m1706a(r2, r0)
            r5.mo563a(r2, r4)
            android.support.v4.app.v$3 r0 = new android.support.v4.app.v$3
            r0.<init>(r3, r1)
            android.support.p030v4.app.C0627ae.m1706a(r2, r0)
            goto L_0x0376
        L_0x0370:
            r22 = r36
            r21 = r37
            r23 = 0
        L_0x0376:
            int r13 = r22 + 1
            r15 = r21
            r5 = r35
            r0 = r54
            r1 = r55
            r2 = r56
            r3 = r58
            r4 = r59
            goto L_0x0048
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0680s.m1964a(android.support.v4.app.m, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    /* renamed from: a */
    private static boolean m1969a(C0692v vVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vVar.mo570a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m1968a(ArrayList<View> arrayList, C0777a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo2577c(size);
            if (collection.contains(C1056u.m3070p(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static String m1959a(C0777a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo2577c(i))) {
                return (String) aVar.mo2576b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m1965a(C0692v vVar, Object obj, Object obj2, C0777a<String, View> aVar, boolean z, C0645d dVar) {
        String str;
        if (dVar.f2327r != null && !dVar.f2327r.isEmpty()) {
            if (z) {
                str = (String) dVar.f2328s.get(0);
            } else {
                str = (String) dVar.f2327r.get(0);
            }
            View view = (View) aVar.get(str);
            vVar.mo565a(obj, view);
            if (obj2 != null) {
                vVar.mo565a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m1966a(C0777a<String, String> aVar, C0777a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo2577c(size))) {
                aVar.mo2581d(size);
            }
        }
    }

    /* renamed from: a */
    static void m1961a(Fragment fragment, Fragment fragment2, boolean z, C0777a<String, View> aVar, boolean z2) {
        C0631ah ahVar;
        int i;
        if (z) {
            ahVar = fragment2.getEnterTransitionCallback();
        } else {
            ahVar = fragment.getEnterTransitionCallback();
        }
        if (ahVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo2576b(i2));
                arrayList.add(aVar.mo2577c(i2));
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m1960a(C0692v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            vVar.mo2337a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        vVar.mo568a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m1967a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m1958a(C0692v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (z2) {
            return vVar.mo562a(obj2, obj, obj3);
        }
        return vVar.mo572b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static void m1963a(C0645d dVar, SparseArray<C0685a> sparseArray, boolean z) {
        int size = dVar.f2311b.size();
        for (int i = 0; i < size; i++) {
            m1962a(dVar, (C0646a) dVar.f2311b.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r6.mAdded != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0064, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0066, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0071, code lost:
        r8 = r12;
        r12 = true;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0080, code lost:
        if (r6.mHidden == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0082, code lost:
        r12 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1962a(android.support.p030v4.app.C0645d r11, android.support.p030v4.app.C0645d.C0646a r12, android.util.SparseArray<android.support.p030v4.app.C0680s.C0685a> r13, boolean r14, boolean r15) {
        /*
            android.support.v4.app.Fragment r6 = r12.f2332b
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            int r7 = r6.mContainerId
            if (r7 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r14 == 0) goto L_0x0013
            int[] r0 = f2423a
            int r12 = r12.f2331a
            r12 = r0[r12]
            goto L_0x0015
        L_0x0013:
            int r12 = r12.f2331a
        L_0x0015:
            r0 = 0
            r1 = 1
            if (r12 == r1) goto L_0x0075
            switch(r12) {
                case 3: goto L_0x004b;
                case 4: goto L_0x0033;
                case 5: goto L_0x0021;
                case 6: goto L_0x004b;
                case 7: goto L_0x0075;
                default: goto L_0x001c;
            }
        L_0x001c:
            r12 = 0
            r1 = 0
        L_0x001e:
            r8 = 0
            goto L_0x0088
        L_0x0021:
            if (r15 == 0) goto L_0x0030
            boolean r12 = r6.mHiddenChanged
            if (r12 == 0) goto L_0x0084
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0084
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0084
            goto L_0x0082
        L_0x0030:
            boolean r12 = r6.mHidden
            goto L_0x0085
        L_0x0033:
            if (r15 == 0) goto L_0x0042
            boolean r12 = r6.mHiddenChanged
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mHidden
            if (r12 == 0) goto L_0x0066
        L_0x0041:
            goto L_0x0064
        L_0x0042:
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0066
            goto L_0x0041
        L_0x004b:
            if (r15 == 0) goto L_0x0068
            boolean r12 = r6.mAdded
            if (r12 != 0) goto L_0x0066
            android.view.View r12 = r6.mView
            if (r12 == 0) goto L_0x0066
            android.view.View r12 = r6.mView
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x0066
            float r12 = r6.mPostponedAlpha
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x0066
        L_0x0064:
            r12 = 1
            goto L_0x0071
        L_0x0066:
            r12 = 0
            goto L_0x0071
        L_0x0068:
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0066
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0066
            goto L_0x0064
        L_0x0071:
            r8 = r12
            r12 = 1
            r1 = 0
            goto L_0x0088
        L_0x0075:
            if (r15 == 0) goto L_0x007a
            boolean r12 = r6.mIsNewlyAdded
            goto L_0x0085
        L_0x007a:
            boolean r12 = r6.mAdded
            if (r12 != 0) goto L_0x0084
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0084
        L_0x0082:
            r12 = 1
            goto L_0x0085
        L_0x0084:
            r12 = 0
        L_0x0085:
            r0 = r12
            r12 = 0
            goto L_0x001e
        L_0x0088:
            java.lang.Object r2 = r13.get(r7)
            android.support.v4.app.s$a r2 = (android.support.p030v4.app.C0680s.C0685a) r2
            if (r0 == 0) goto L_0x009a
            android.support.v4.app.s$a r2 = m1950a(r2, r13, r7)
            r2.f2454a = r6
            r2.f2455b = r14
            r2.f2456c = r11
        L_0x009a:
            r9 = r2
            r10 = 0
            if (r15 != 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            if (r9 == 0) goto L_0x00a8
            android.support.v4.app.Fragment r0 = r9.f2457d
            if (r0 != r6) goto L_0x00a8
            r9.f2457d = r10
        L_0x00a8:
            android.support.v4.app.m r0 = r11.f2310a
            int r1 = r6.mState
            if (r1 > 0) goto L_0x00c1
            int r1 = r0.f2369l
            if (r1 <= 0) goto L_0x00c1
            boolean r1 = r11.f2329t
            if (r1 != 0) goto L_0x00c1
            r0.mo2274d(r6)
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            android.support.p030v4.app.C0686t.m1973a(r0, r1, r2, r3, r4, r5)
        L_0x00c1:
            if (r8 == 0) goto L_0x00d3
            if (r9 == 0) goto L_0x00c9
            android.support.v4.app.Fragment r0 = r9.f2457d
            if (r0 != 0) goto L_0x00d3
        L_0x00c9:
            android.support.v4.app.s$a r9 = m1950a(r9, r13, r7)
            r9.f2457d = r6
            r9.f2458e = r14
            r9.f2459f = r11
        L_0x00d3:
            if (r15 != 0) goto L_0x00df
            if (r12 == 0) goto L_0x00df
            if (r9 == 0) goto L_0x00df
            android.support.v4.app.Fragment r11 = r9.f2454a
            if (r11 != r6) goto L_0x00df
            r9.f2454a = r10
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0680s.m1962a(android.support.v4.app.d, android.support.v4.app.d$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0692v m1951a() {
        try {
            return (C0692v) Class.forName("android.support.b.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        C0687u uVar;
        if (VERSION.SDK_INT >= 21) {
            uVar = new C0687u();
        } else {
            uVar = null;
        }
        f2424b = uVar;
    }

    /* renamed from: a */
    private static C0692v m1952a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f2424b != null && m1969a(f2424b, (List<Object>) arrayList)) {
            return f2424b;
        }
        if (f2425c != null && m1969a(f2425c, (List<Object>) arrayList)) {
            return f2425c;
        }
        if (f2424b == null && f2425c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0685a m1950a(C0685a aVar, SparseArray<C0685a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0685a aVar2 = new C0685a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    private static Object m1971b(C0692v vVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return vVar.mo571b(obj);
    }

    /* renamed from: b */
    private static void m1972b(C0645d dVar, SparseArray<C0685a> sparseArray, boolean z) {
        if (dVar.f2310a.f2371n.mo1969a()) {
            for (int size = dVar.f2311b.size() - 1; size >= 0; size--) {
                m1962a(dVar, (C0646a) dVar.f2311b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static Object m1957a(C0692v vVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return vVar.mo571b(obj);
    }

    /* renamed from: a */
    static View m1955a(C0777a<String, View> aVar, C0685a aVar2, Object obj, boolean z) {
        String str;
        C0645d dVar = aVar2.f2456c;
        if (obj == null || aVar == null || dVar.f2327r == null || dVar.f2327r.isEmpty()) {
            return null;
        }
        if (z) {
            str = (String) dVar.f2327r.get(0);
        } else {
            str = (String) dVar.f2328s.get(0);
        }
        return (View) aVar.get(str);
    }

    /* renamed from: b */
    private static C0777a<String, View> m1970b(C0692v vVar, C0777a<String, String> aVar, Object obj, C0685a aVar2) {
        C0631ah ahVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f2457d;
        C0777a<String, View> aVar3 = new C0777a<>();
        vVar.mo2338a((Map<String, View>) aVar3, fragment.getView());
        C0645d dVar = aVar2.f2459f;
        if (aVar2.f2458e) {
            ahVar = fragment.getEnterTransitionCallback();
            arrayList = dVar.f2328s;
        } else {
            ahVar = fragment.getExitTransitionCallback();
            arrayList = dVar.f2327r;
        }
        aVar3.mo2449a(arrayList);
        if (ahVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C1056u.m3070p(view))) {
                    aVar.put(C1056u.m3070p(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo2449a(aVar3.keySet());
        }
        return aVar3;
    }

    /* renamed from: a */
    static C0777a<String, View> m1954a(C0692v vVar, C0777a<String, String> aVar, Object obj, C0685a aVar2) {
        C0631ah ahVar;
        ArrayList<String> arrayList;
        Fragment fragment = aVar2.f2454a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C0777a<String, View> aVar3 = new C0777a<>();
        vVar.mo2338a((Map<String, View>) aVar3, view);
        C0645d dVar = aVar2.f2456c;
        if (aVar2.f2455b) {
            ahVar = fragment.getExitTransitionCallback();
            arrayList = dVar.f2327r;
        } else {
            ahVar = fragment.getEnterTransitionCallback();
            arrayList = dVar.f2328s;
        }
        if (arrayList != null) {
            aVar3.mo2449a(arrayList);
            aVar3.mo2449a(aVar.values());
        }
        if (ahVar != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) aVar3.get(str);
                if (view2 == null) {
                    String a = m1959a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(C1056u.m3070p(view2))) {
                    String a2 = m1959a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, C1056u.m3070p(view2));
                    }
                }
            }
        } else {
            m1966a(aVar, aVar3);
        }
        return aVar3;
    }

    /* renamed from: a */
    private static Object m1956a(C0692v vVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return vVar.mo576c(vVar.mo571b(obj));
    }

    /* renamed from: a */
    private static C0777a<String, String> m1953a(int i, ArrayList<C0645d> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C0777a<String, String> aVar = new C0777a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0645d dVar = (C0645d) arrayList.get(i4);
            if (dVar.mo2194b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (dVar.f2327r != null) {
                    int size = dVar.f2327r.size();
                    if (booleanValue) {
                        arrayList3 = dVar.f2327r;
                        arrayList4 = dVar.f2328s;
                    } else {
                        ArrayList arrayList5 = dVar.f2327r;
                        arrayList3 = dVar.f2328s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }
}
