package android.support.constraint.p020a.p021a;

import android.support.constraint.p020a.C0351e;
import android.support.constraint.p020a.p021a.C0333e.C0335a;

/* renamed from: android.support.constraint.a.a.i */
public final class C0340i {

    /* renamed from: a */
    static boolean[] f1042a = new boolean[3];

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m799a(android.support.constraint.p020a.p021a.C0333e r4, int r5) {
        /*
            android.support.constraint.a.a.e$a[] r0 = r4.f952F
            r0 = r0[r5]
            android.support.constraint.a.a.e$a r1 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            float r0 = r4.f956J
            r1 = 0
            r3 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            android.support.constraint.a.a.e$a[] r4 = r4.f952F
            if (r5 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r4 = r4[r3]
            android.support.constraint.a.a.e$a r5 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x001f
            return r2
        L_0x001f:
            return r2
        L_0x0020:
            if (r5 != 0) goto L_0x0030
            int r5 = r4.f993g
            if (r5 == 0) goto L_0x0027
            return r2
        L_0x0027:
            int r5 = r4.f996j
            if (r5 != 0) goto L_0x002f
            int r4 = r4.f997k
            if (r4 == 0) goto L_0x003e
        L_0x002f:
            return r2
        L_0x0030:
            int r5 = r4.f994h
            if (r5 == 0) goto L_0x0035
            return r2
        L_0x0035:
            int r5 = r4.f999m
            if (r5 != 0) goto L_0x003f
            int r4 = r4.f1000n
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r3
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.p021a.C0340i.m799a(android.support.constraint.a.a.e, int):boolean");
    }

    /* renamed from: a */
    static void m797a(int i, C0333e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C0333e eVar2 = eVar;
        eVar.mo727g();
        C0342k kVar = eVar2.f1008v.f932a;
        C0342k kVar2 = eVar2.f1009w.f932a;
        C0342k kVar3 = eVar2.f1010x.f932a;
        C0342k kVar4 = eVar2.f1011y.f932a;
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (eVar2.f952F[0] != C0335a.MATCH_CONSTRAINT || !m799a(eVar2, 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(kVar.f1049g == 4 || kVar3.f1049g == 4)) {
            if (eVar2.f952F[0] == C0335a.FIXED || (z2 && eVar2.f975ad == 8)) {
                if (eVar2.f1008v.f935d == null && eVar2.f1010x.f935d == null) {
                    kVar.f1049g = 1;
                    kVar3.f1049g = 1;
                    if (z) {
                        kVar3.mo758a(kVar, 1, eVar.mo728h());
                    } else {
                        kVar3.mo757a(kVar, eVar.mo730j());
                    }
                } else if (eVar2.f1008v.f935d != null && eVar2.f1010x.f935d == null) {
                    kVar.f1049g = 1;
                    kVar3.f1049g = 1;
                    if (z) {
                        kVar3.mo758a(kVar, 1, eVar.mo728h());
                    } else {
                        kVar3.mo757a(kVar, eVar.mo730j());
                    }
                } else if (eVar2.f1008v.f935d == null && eVar2.f1010x.f935d != null) {
                    kVar.f1049g = 1;
                    kVar3.f1049g = 1;
                    kVar.mo757a(kVar3, -eVar.mo730j());
                    if (z) {
                        kVar.mo758a(kVar3, -1, eVar.mo728h());
                    } else {
                        kVar.mo757a(kVar3, -eVar.mo730j());
                    }
                } else if (!(eVar2.f1008v.f935d == null || eVar2.f1010x.f935d == null)) {
                    kVar.f1049g = 2;
                    kVar3.f1049g = 2;
                    if (z) {
                        eVar.mo728h().mo766a(kVar);
                        eVar.mo728h().mo766a(kVar3);
                        kVar.mo762b(kVar3, -1, eVar.mo728h());
                        kVar3.mo762b(kVar, 1, eVar.mo728h());
                    } else {
                        kVar.mo761b(kVar3, (float) (-eVar.mo730j()));
                        kVar3.mo761b(kVar, (float) eVar.mo730j());
                    }
                }
            } else if (z2) {
                int j = eVar.mo730j();
                kVar.f1049g = 1;
                kVar3.f1049g = 1;
                if (eVar2.f1008v.f935d == null && eVar2.f1010x.f935d == null) {
                    if (z) {
                        kVar3.mo758a(kVar, 1, eVar.mo728h());
                    } else {
                        kVar3.mo757a(kVar, j);
                    }
                } else if (eVar2.f1008v.f935d == null || eVar2.f1010x.f935d != null) {
                    if (eVar2.f1008v.f935d != null || eVar2.f1010x.f935d == null) {
                        if (!(eVar2.f1008v.f935d == null || eVar2.f1010x.f935d == null)) {
                            if (z) {
                                eVar.mo728h().mo766a(kVar);
                                eVar.mo728h().mo766a(kVar3);
                            }
                            if (eVar2.f956J == 0.0f) {
                                kVar.f1049g = 3;
                                kVar3.f1049g = 3;
                                kVar.mo761b(kVar3, 0.0f);
                                kVar3.mo761b(kVar, 0.0f);
                            } else {
                                kVar.f1049g = 2;
                                kVar3.f1049g = 2;
                                kVar.mo761b(kVar3, (float) (-j));
                                kVar3.mo761b(kVar, (float) j);
                                eVar2.mo717b(j);
                            }
                        }
                    } else if (z) {
                        kVar.mo758a(kVar3, -1, eVar.mo728h());
                    } else {
                        kVar.mo757a(kVar3, -j);
                    }
                } else if (z) {
                    kVar3.mo758a(kVar, 1, eVar.mo728h());
                } else {
                    kVar3.mo757a(kVar, j);
                }
            }
        }
        if (eVar2.f952F[1] != C0335a.MATCH_CONSTRAINT || !m799a(eVar2, 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(kVar2.f1049g == 4 || kVar4.f1049g == 4)) {
            if (eVar2.f952F[1] == C0335a.FIXED || (z3 && eVar2.f975ad == 8)) {
                if (eVar2.f1009w.f935d == null && eVar2.f1011y.f935d == null) {
                    kVar2.f1049g = 1;
                    kVar4.f1049g = 1;
                    if (z) {
                        kVar4.mo758a(kVar2, 1, eVar.mo729i());
                    } else {
                        kVar4.mo757a(kVar2, eVar.mo731k());
                    }
                    if (eVar2.f1012z.f935d != null) {
                        eVar2.f1012z.f932a.f1049g = 1;
                        kVar2.mo755a(1, eVar2.f1012z.f932a, -eVar2.f966T);
                    }
                } else if (eVar2.f1009w.f935d != null && eVar2.f1011y.f935d == null) {
                    kVar2.f1049g = 1;
                    kVar4.f1049g = 1;
                    if (z) {
                        kVar4.mo758a(kVar2, 1, eVar.mo729i());
                    } else {
                        kVar4.mo757a(kVar2, eVar.mo731k());
                    }
                    if (eVar2.f966T > 0) {
                        eVar2.f1012z.f932a.mo755a(1, kVar2, eVar2.f966T);
                    }
                } else if (eVar2.f1009w.f935d == null && eVar2.f1011y.f935d != null) {
                    kVar2.f1049g = 1;
                    kVar4.f1049g = 1;
                    if (z) {
                        kVar2.mo758a(kVar4, -1, eVar.mo729i());
                    } else {
                        kVar2.mo757a(kVar4, -eVar.mo731k());
                    }
                    if (eVar2.f966T > 0) {
                        eVar2.f1012z.f932a.mo755a(1, kVar2, eVar2.f966T);
                    }
                } else if (!(eVar2.f1009w.f935d == null || eVar2.f1011y.f935d == null)) {
                    kVar2.f1049g = 2;
                    kVar4.f1049g = 2;
                    if (z) {
                        kVar2.mo762b(kVar4, -1, eVar.mo729i());
                        kVar4.mo762b(kVar2, 1, eVar.mo729i());
                        eVar.mo729i().mo766a(kVar2);
                        eVar.mo728h().mo766a(kVar4);
                    } else {
                        kVar2.mo761b(kVar4, (float) (-eVar.mo731k()));
                        kVar4.mo761b(kVar2, (float) eVar.mo731k());
                    }
                    if (eVar2.f966T > 0) {
                        eVar2.f1012z.f932a.mo755a(1, kVar2, eVar2.f966T);
                    }
                }
            } else if (z3) {
                int k = eVar.mo731k();
                kVar2.f1049g = 1;
                kVar4.f1049g = 1;
                if (eVar2.f1009w.f935d == null && eVar2.f1011y.f935d == null) {
                    if (z) {
                        kVar4.mo758a(kVar2, 1, eVar.mo729i());
                    } else {
                        kVar4.mo757a(kVar2, k);
                    }
                } else if (eVar2.f1009w.f935d == null || eVar2.f1011y.f935d != null) {
                    if (eVar2.f1009w.f935d != null || eVar2.f1011y.f935d == null) {
                        if (!(eVar2.f1009w.f935d == null || eVar2.f1011y.f935d == null)) {
                            if (z) {
                                eVar.mo729i().mo766a(kVar2);
                                eVar.mo728h().mo766a(kVar4);
                            }
                            if (eVar2.f956J == 0.0f) {
                                kVar2.f1049g = 3;
                                kVar4.f1049g = 3;
                                kVar2.mo761b(kVar4, 0.0f);
                                kVar4.mo761b(kVar2, 0.0f);
                                return;
                            }
                            kVar2.f1049g = 2;
                            kVar4.f1049g = 2;
                            kVar2.mo761b(kVar4, (float) (-k));
                            kVar4.mo761b(kVar2, (float) k);
                            eVar2.mo720c(k);
                            if (eVar2.f966T > 0) {
                                eVar2.f1012z.f932a.mo755a(1, kVar2, eVar2.f966T);
                            }
                        }
                    } else if (z) {
                        kVar2.mo758a(kVar4, -1, eVar.mo729i());
                    } else {
                        kVar2.mo757a(kVar4, -k);
                    }
                } else if (z) {
                    kVar4.mo758a(kVar2, 1, eVar.mo729i());
                } else {
                    kVar4.mo757a(kVar2, k);
                }
            }
        }
    }

    /* renamed from: a */
    static void m798a(C0336f fVar, C0351e eVar, C0333e eVar2) {
        if (fVar.f952F[0] != C0335a.WRAP_CONTENT && eVar2.f952F[0] == C0335a.MATCH_PARENT) {
            int i = eVar2.f1008v.f936e;
            int j = fVar.mo730j() - eVar2.f1010x.f936e;
            eVar2.f1008v.f941j = eVar.mo788a((Object) eVar2.f1008v);
            eVar2.f1010x.f941j = eVar.mo788a((Object) eVar2.f1010x);
            eVar.mo792a(eVar2.f1008v.f941j, i);
            eVar.mo792a(eVar2.f1010x.f941j, j);
            eVar2.f989c = 2;
            eVar2.f958L = i;
            eVar2.f954H = j - i;
            if (eVar2.f954H < eVar2.f967U) {
                eVar2.f954H = eVar2.f967U;
            }
        }
        if (fVar.f952F[1] != C0335a.WRAP_CONTENT && eVar2.f952F[1] == C0335a.MATCH_PARENT) {
            int i2 = eVar2.f1009w.f936e;
            int k = fVar.mo731k() - eVar2.f1011y.f936e;
            eVar2.f1009w.f941j = eVar.mo788a((Object) eVar2.f1009w);
            eVar2.f1011y.f941j = eVar.mo788a((Object) eVar2.f1011y);
            eVar.mo792a(eVar2.f1009w.f941j, i2);
            eVar.mo792a(eVar2.f1011y.f941j, k);
            if (eVar2.f966T > 0 || eVar2.f975ad == 8) {
                eVar2.f1012z.f941j = eVar.mo788a((Object) eVar2.f1012z);
                eVar.mo792a(eVar2.f1012z.f941j, eVar2.f966T + i2);
            }
            eVar2.f990d = 2;
            eVar2.f959M = i2;
            eVar2.f955I = k - i2;
            if (eVar2.f955I < eVar2.f968V) {
                eVar2.f955I = eVar2.f968V;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r6.f980ai == 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r6.f981aj == 2) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m800a(android.support.constraint.p020a.p021a.C0336f r20, android.support.constraint.p020a.C0351e r21, int r22, int r23, android.support.constraint.p020a.p021a.C0327c r24) {
        /*
            r0 = r21
            r1 = r24
            android.support.constraint.a.a.e r2 = r1.f915a
            android.support.constraint.a.a.e r3 = r1.f917c
            android.support.constraint.a.a.e r4 = r1.f916b
            android.support.constraint.a.a.e r5 = r1.f918d
            android.support.constraint.a.a.e r6 = r1.f919e
            float r1 = r1.f925k
            r7 = 2
            r9 = 1
            if (r22 != 0) goto L_0x002a
            int r10 = r6.f980ai
            if (r10 != 0) goto L_0x001a
            r10 = 1
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            int r11 = r6.f980ai
            if (r11 != r9) goto L_0x0021
            r11 = 1
            goto L_0x0022
        L_0x0021:
            r11 = 0
        L_0x0022:
            int r6 = r6.f980ai
            if (r6 != r7) goto L_0x0028
        L_0x0026:
            r6 = 1
            goto L_0x003d
        L_0x0028:
            r6 = 0
            goto L_0x003d
        L_0x002a:
            int r10 = r6.f981aj
            if (r10 != 0) goto L_0x0030
            r10 = 1
            goto L_0x0031
        L_0x0030:
            r10 = 0
        L_0x0031:
            int r11 = r6.f981aj
            if (r11 != r9) goto L_0x0037
            r11 = 1
            goto L_0x0038
        L_0x0037:
            r11 = 0
        L_0x0038:
            int r6 = r6.f981aj
            if (r6 != r7) goto L_0x0028
            goto L_0x0026
        L_0x003d:
            r13 = r2
            r7 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0043:
            if (r12 != 0) goto L_0x00de
            int r8 = r13.f975ad
            r16 = r12
            r12 = 8
            if (r8 == r12) goto L_0x0080
            int r7 = r7 + 1
            if (r22 != 0) goto L_0x0058
            int r8 = r13.mo730j()
            float r8 = (float) r8
            float r14 = r14 + r8
            goto L_0x005e
        L_0x0058:
            int r8 = r13.mo731k()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x005e:
            if (r13 == r4) goto L_0x006a
            android.support.constraint.a.a.d[] r8 = r13.f950D
            r8 = r8[r23]
            int r8 = r8.mo705a()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x006a:
            android.support.constraint.a.a.d[] r8 = r13.f950D
            r8 = r8[r23]
            int r8 = r8.mo705a()
            float r8 = (float) r8
            float r15 = r15 + r8
            android.support.constraint.a.a.d[] r8 = r13.f950D
            int r17 = r23 + 1
            r8 = r8[r17]
            int r8 = r8.mo705a()
            float r8 = (float) r8
            float r15 = r15 + r8
        L_0x0080:
            int r8 = r13.f975ad
            if (r8 == r12) goto L_0x00af
            android.support.constraint.a.a.e$a[] r8 = r13.f952F
            r8 = r8[r22]
            android.support.constraint.a.a.e$a r12 = android.support.constraint.p020a.p021a.C0333e.C0335a.MATCH_CONSTRAINT
            if (r8 != r12) goto L_0x00af
            int r9 = r9 + 1
            if (r22 != 0) goto L_0x00a0
            int r8 = r13.f993g
            if (r8 == 0) goto L_0x0096
            r8 = 0
            return r8
        L_0x0096:
            r8 = 0
            int r12 = r13.f996j
            if (r12 != 0) goto L_0x009f
            int r12 = r13.f997k
            if (r12 == 0) goto L_0x00af
        L_0x009f:
            return r8
        L_0x00a0:
            r8 = 0
            int r12 = r13.f994h
            if (r12 == 0) goto L_0x00a6
            return r8
        L_0x00a6:
            int r12 = r13.f999m
            if (r12 != 0) goto L_0x00ae
            int r12 = r13.f1000n
            if (r12 == 0) goto L_0x00af
        L_0x00ae:
            return r8
        L_0x00af:
            android.support.constraint.a.a.d[] r8 = r13.f950D
            int r12 = r23 + 1
            r8 = r8[r12]
            android.support.constraint.a.a.d r8 = r8.f935d
            if (r8 == 0) goto L_0x00d1
            android.support.constraint.a.a.e r8 = r8.f933b
            android.support.constraint.a.a.d[] r12 = r8.f950D
            r12 = r12[r23]
            android.support.constraint.a.a.d r12 = r12.f935d
            if (r12 == 0) goto L_0x00d1
            android.support.constraint.a.a.d[] r12 = r8.f950D
            r12 = r12[r23]
            android.support.constraint.a.a.d r12 = r12.f935d
            android.support.constraint.a.a.e r12 = r12.f933b
            if (r12 == r13) goto L_0x00ce
            goto L_0x00d1
        L_0x00ce:
            r18 = r8
            goto L_0x00d3
        L_0x00d1:
            r18 = 0
        L_0x00d3:
            if (r18 == 0) goto L_0x00db
            r12 = r16
            r13 = r18
            goto L_0x0043
        L_0x00db:
            r12 = 1
            goto L_0x0043
        L_0x00de:
            android.support.constraint.a.a.d[] r8 = r2.f950D
            r8 = r8[r23]
            android.support.constraint.a.a.k r8 = r8.f932a
            android.support.constraint.a.a.d[] r3 = r3.f950D
            int r12 = r23 + 1
            r3 = r3[r12]
            android.support.constraint.a.a.k r3 = r3.f932a
            r19 = r2
            android.support.constraint.a.a.k r2 = r8.f1045c
            if (r2 == 0) goto L_0x031d
            android.support.constraint.a.a.k r2 = r3.f1045c
            if (r2 != 0) goto L_0x00f8
            goto L_0x031d
        L_0x00f8:
            android.support.constraint.a.a.k r2 = r8.f1045c
            int r2 = r2.f1058i
            r0 = 1
            if (r2 == r0) goto L_0x0107
            android.support.constraint.a.a.k r2 = r3.f1045c
            int r2 = r2.f1058i
            if (r2 == r0) goto L_0x0107
            r0 = 0
            return r0
        L_0x0107:
            r0 = 0
            if (r9 <= 0) goto L_0x010d
            if (r9 == r7) goto L_0x010d
            return r0
        L_0x010d:
            if (r6 != 0) goto L_0x0116
            if (r10 != 0) goto L_0x0116
            if (r11 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r0 = 0
            goto L_0x012f
        L_0x0116:
            if (r4 == 0) goto L_0x0122
            android.support.constraint.a.a.d[] r0 = r4.f950D
            r0 = r0[r23]
            int r0 = r0.mo705a()
            float r0 = (float) r0
            goto L_0x0123
        L_0x0122:
            r0 = 0
        L_0x0123:
            if (r5 == 0) goto L_0x012f
            android.support.constraint.a.a.d[] r2 = r5.f950D
            r2 = r2[r12]
            int r2 = r2.mo705a()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x012f:
            android.support.constraint.a.a.k r2 = r8.f1045c
            float r2 = r2.f1048f
            android.support.constraint.a.a.k r3 = r3.f1045c
            float r3 = r3.f1048f
            int r16 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x013e
            float r3 = r3 - r2
            float r3 = r3 - r14
            goto L_0x0141
        L_0x013e:
            float r3 = r2 - r3
            float r3 = r3 - r14
        L_0x0141:
            r16 = 1
            if (r9 <= 0) goto L_0x01f6
            if (r9 != r7) goto L_0x01f6
            android.support.constraint.a.a.e r6 = r13.f953G
            if (r6 == 0) goto L_0x0157
            android.support.constraint.a.a.e r6 = r13.f953G
            android.support.constraint.a.a.e$a[] r6 = r6.f952F
            r6 = r6[r22]
            android.support.constraint.a.a.e$a r7 = android.support.constraint.p020a.p021a.C0333e.C0335a.WRAP_CONTENT
            if (r6 != r7) goto L_0x0157
            r6 = 0
            return r6
        L_0x0157:
            float r3 = r3 + r14
            float r3 = r3 - r15
            if (r10 == 0) goto L_0x015d
            float r15 = r15 - r0
            float r3 = r3 - r15
        L_0x015d:
            if (r10 == 0) goto L_0x0179
            android.support.constraint.a.a.d[] r0 = r4.f950D
            r0 = r0[r12]
            int r0 = r0.mo705a()
            float r0 = (float) r0
            float r2 = r2 + r0
            android.support.constraint.a.a.e[] r0 = r4.f986ao
            r0 = r0[r22]
            if (r0 == 0) goto L_0x0179
            android.support.constraint.a.a.d[] r0 = r0.f950D
            r0 = r0[r23]
            int r0 = r0.mo705a()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x0179:
            if (r4 == 0) goto L_0x01f4
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            if (r0 == 0) goto L_0x0197
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r0.f1097B
            long r6 = r6 - r16
            r0.f1097B = r6
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r0.f1118s
            long r6 = r6 + r16
            r0.f1118s = r6
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r0.f1124y
            long r6 = r6 + r16
            r0.f1124y = r6
        L_0x0197:
            android.support.constraint.a.a.e[] r0 = r4.f986ao
            r0 = r0[r22]
            if (r0 != 0) goto L_0x01a4
            if (r4 != r5) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            r7 = 0
            r13 = r21
            goto L_0x01f2
        L_0x01a4:
            float r6 = (float) r9
            float r6 = r3 / r6
            r7 = 0
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x01b3
            float[] r6 = r4.f984am
            r6 = r6[r22]
            float r6 = r6 * r3
            float r6 = r6 / r1
        L_0x01b3:
            android.support.constraint.a.a.d[] r10 = r4.f950D
            r10 = r10[r23]
            int r10 = r10.mo705a()
            float r10 = (float) r10
            float r2 = r2 + r10
            android.support.constraint.a.a.d[] r10 = r4.f950D
            r10 = r10[r23]
            android.support.constraint.a.a.k r10 = r10.f932a
            android.support.constraint.a.a.k r11 = r8.f1047e
            r10.mo756a(r11, r2)
            android.support.constraint.a.a.d[] r10 = r4.f950D
            r10 = r10[r12]
            android.support.constraint.a.a.k r10 = r10.f932a
            android.support.constraint.a.a.k r11 = r8.f1047e
            float r2 = r2 + r6
            r10.mo756a(r11, r2)
            android.support.constraint.a.a.d[] r6 = r4.f950D
            r6 = r6[r23]
            android.support.constraint.a.a.k r6 = r6.f932a
            r13 = r21
            r6.mo759a(r13)
            android.support.constraint.a.a.d[] r6 = r4.f950D
            r6 = r6[r12]
            android.support.constraint.a.a.k r6 = r6.f932a
            r6.mo759a(r13)
            android.support.constraint.a.a.d[] r4 = r4.f950D
            r4 = r4[r12]
            int r4 = r4.mo705a()
            float r4 = (float) r4
            float r2 = r2 + r4
        L_0x01f2:
            r4 = r0
            goto L_0x0179
        L_0x01f4:
            r0 = 1
            return r0
        L_0x01f6:
            r13 = r21
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x01fe
            r1 = 0
            return r1
        L_0x01fe:
            if (r6 == 0) goto L_0x027d
            float r3 = r3 - r0
            r0 = r19
            float r0 = r0.f971Z
            float r3 = r3 * r0
            float r2 = r2 + r3
        L_0x0208:
            if (r4 == 0) goto L_0x027a
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            if (r0 == 0) goto L_0x0226
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r0.f1097B
            long r6 = r6 - r16
            r0.f1097B = r6
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r0.f1118s
            long r6 = r6 + r16
            r0.f1118s = r6
            android.support.constraint.a.f r0 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r0.f1124y
            long r6 = r6 + r16
            r0.f1124y = r6
        L_0x0226:
            android.support.constraint.a.a.e[] r0 = r4.f986ao
            r0 = r0[r22]
            if (r0 != 0) goto L_0x022e
            if (r4 != r5) goto L_0x0278
        L_0x022e:
            if (r22 != 0) goto L_0x0236
            int r1 = r4.mo730j()
            float r1 = (float) r1
            goto L_0x023b
        L_0x0236:
            int r1 = r4.mo731k()
            float r1 = (float) r1
        L_0x023b:
            android.support.constraint.a.a.d[] r3 = r4.f950D
            r3 = r3[r23]
            int r3 = r3.mo705a()
            float r3 = (float) r3
            float r2 = r2 + r3
            android.support.constraint.a.a.d[] r3 = r4.f950D
            r3 = r3[r23]
            android.support.constraint.a.a.k r3 = r3.f932a
            android.support.constraint.a.a.k r6 = r8.f1047e
            r3.mo756a(r6, r2)
            android.support.constraint.a.a.d[] r3 = r4.f950D
            r3 = r3[r12]
            android.support.constraint.a.a.k r3 = r3.f932a
            android.support.constraint.a.a.k r6 = r8.f1047e
            float r2 = r2 + r1
            r3.mo756a(r6, r2)
            android.support.constraint.a.a.d[] r1 = r4.f950D
            r1 = r1[r23]
            android.support.constraint.a.a.k r1 = r1.f932a
            r1.mo759a(r13)
            android.support.constraint.a.a.d[] r1 = r4.f950D
            r1 = r1[r12]
            android.support.constraint.a.a.k r1 = r1.f932a
            r1.mo759a(r13)
            android.support.constraint.a.a.d[] r1 = r4.f950D
            r1 = r1[r12]
            int r1 = r1.mo705a()
            float r1 = (float) r1
            float r2 = r2 + r1
        L_0x0278:
            r4 = r0
            goto L_0x0208
        L_0x027a:
            r0 = 1
            goto L_0x031c
        L_0x027d:
            if (r10 != 0) goto L_0x0281
            if (r11 == 0) goto L_0x027a
        L_0x0281:
            if (r10 == 0) goto L_0x0285
            float r3 = r3 - r0
            goto L_0x0288
        L_0x0285:
            if (r11 == 0) goto L_0x0288
            float r3 = r3 - r0
        L_0x0288:
            int r0 = r7 + 1
            float r0 = (float) r0
            float r0 = r3 / r0
            if (r11 == 0) goto L_0x029c
            r1 = 1
            if (r7 <= r1) goto L_0x0298
            int r0 = r7 + -1
            float r0 = (float) r0
            float r0 = r3 / r0
            goto L_0x029c
        L_0x0298:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r3 / r0
        L_0x029c:
            float r1 = r2 + r0
            if (r11 == 0) goto L_0x02ad
            r3 = 1
            if (r7 <= r3) goto L_0x02ad
            android.support.constraint.a.a.d[] r1 = r4.f950D
            r1 = r1[r23]
            int r1 = r1.mo705a()
            float r1 = (float) r1
            float r1 = r1 + r2
        L_0x02ad:
            if (r10 == 0) goto L_0x02bb
            if (r4 == 0) goto L_0x02bb
            android.support.constraint.a.a.d[] r2 = r4.f950D
            r2 = r2[r23]
            int r2 = r2.mo705a()
            float r2 = (float) r2
            float r1 = r1 + r2
        L_0x02bb:
            if (r4 == 0) goto L_0x027a
            android.support.constraint.a.f r2 = android.support.constraint.p020a.C0351e.f1078h
            if (r2 == 0) goto L_0x02d9
            android.support.constraint.a.f r2 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r2.f1097B
            long r6 = r6 - r16
            r2.f1097B = r6
            android.support.constraint.a.f r2 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r2.f1118s
            long r6 = r6 + r16
            r2.f1118s = r6
            android.support.constraint.a.f r2 = android.support.constraint.p020a.C0351e.f1078h
            long r6 = r2.f1124y
            long r6 = r6 + r16
            r2.f1124y = r6
        L_0x02d9:
            android.support.constraint.a.a.e[] r2 = r4.f986ao
            r2 = r2[r22]
            if (r2 != 0) goto L_0x02e1
            if (r4 != r5) goto L_0x031a
        L_0x02e1:
            if (r22 != 0) goto L_0x02e9
            int r3 = r4.mo730j()
            float r3 = (float) r3
            goto L_0x02ee
        L_0x02e9:
            int r3 = r4.mo731k()
            float r3 = (float) r3
        L_0x02ee:
            android.support.constraint.a.a.d[] r6 = r4.f950D
            r6 = r6[r23]
            android.support.constraint.a.a.k r6 = r6.f932a
            android.support.constraint.a.a.k r7 = r8.f1047e
            r6.mo756a(r7, r1)
            android.support.constraint.a.a.d[] r6 = r4.f950D
            r6 = r6[r12]
            android.support.constraint.a.a.k r6 = r6.f932a
            android.support.constraint.a.a.k r7 = r8.f1047e
            float r9 = r1 + r3
            r6.mo756a(r7, r9)
            android.support.constraint.a.a.d[] r6 = r4.f950D
            r6 = r6[r23]
            android.support.constraint.a.a.k r6 = r6.f932a
            r6.mo759a(r13)
            android.support.constraint.a.a.d[] r4 = r4.f950D
            r4 = r4[r12]
            android.support.constraint.a.a.k r4 = r4.f932a
            r4.mo759a(r13)
            float r3 = r3 + r0
            float r1 = r1 + r3
        L_0x031a:
            r4 = r2
            goto L_0x02bb
        L_0x031c:
            return r0
        L_0x031d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p020a.p021a.C0340i.m800a(android.support.constraint.a.a.f, android.support.constraint.a.e, int, int, android.support.constraint.a.a.c):boolean");
    }
}
