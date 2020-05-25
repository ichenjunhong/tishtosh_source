package leakcanary;

import leakcanary.internal.InternalLeakCanary;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: leakcanary.f */
public final class C53369f {

    /* renamed from: a */
    public static final C53369f f132001a = new C53369f();

    /* renamed from: b */
    private static volatile C53370a f132002b;

    /* renamed from: leakcanary.f$a */
    public static final class C53370a {

        /* renamed from: a */
        public final boolean f132003a;

        /* renamed from: b */
        public final boolean f132004b;

        /* renamed from: c */
        public final int f132005c;

        /* renamed from: d */
        public final boolean f132006d;

        /* renamed from: e */
        public final int f132007e;

        /* renamed from: f */
        public final boolean f132008f;

        /* renamed from: g */
        public final boolean f132009g;

        public C53370a() {
            this(false, false, 0, false, 0, false, false, 127, null);
        }

        /* renamed from: a */
        public static /* synthetic */ C53370a m113443a(C53370a aVar, boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = aVar.f132003a;
            }
            if ((i3 & 2) != 0) {
                z2 = aVar.f132004b;
            }
            boolean z6 = z2;
            if ((i3 & 4) != 0) {
                i = aVar.f132005c;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                z3 = aVar.f132006d;
            }
            boolean z7 = z3;
            if ((i3 & 16) != 0) {
                i2 = aVar.f132007e;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                z4 = aVar.f132008f;
            }
            boolean z8 = z4;
            if ((i3 & 64) != 0) {
                z5 = aVar.f132009g;
            }
            return m113444a(z, z6, i4, z7, i5, z8, z5);
        }

        /* renamed from: a */
        private static C53370a m113444a(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5) {
            C53370a aVar = new C53370a(z, z2, i, z3, i2, z4, z5);
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C53370a) {
                    C53370a aVar = (C53370a) obj;
                    if (this.f132003a == aVar.f132003a) {
                        if (this.f132004b == aVar.f132004b) {
                            if (this.f132005c == aVar.f132005c) {
                                if (this.f132006d == aVar.f132006d) {
                                    if (this.f132007e == aVar.f132007e) {
                                        if (this.f132008f == aVar.f132008f) {
                                            if (this.f132009g == aVar.f132009g) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f132003a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = (z ? 1 : 0) * true;
            boolean z2 = this.f132004b;
            if (z2) {
                z2 = true;
            }
            int i3 = (((i2 + (z2 ? 1 : 0)) * 31) + this.f132005c) * 31;
            boolean z3 = this.f132006d;
            if (z3) {
                z3 = true;
            }
            int i4 = (((i3 + (z3 ? 1 : 0)) * 31) + this.f132007e) * 31;
            boolean z4 = this.f132008f;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f132009g;
            if (!z5) {
                i = z5;
            }
            return i5 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(dumpHeap=");
            sb.append(this.f132003a);
            sb.append(", dumpHeapWhenDebugging=");
            sb.append(this.f132004b);
            sb.append(", retainedVisibleThreshold=");
            sb.append(this.f132005c);
            sb.append(", computeRetainedHeapSize=");
            sb.append(this.f132006d);
            sb.append(", maxStoredHeapDumps=");
            sb.append(this.f132007e);
            sb.append(", requestWriteExternalStoragePermission=");
            sb.append(this.f132008f);
            sb.append(", useExperimentalLeakFinders=");
            sb.append(this.f132009g);
            sb.append(")");
            return sb.toString();
        }

        private C53370a(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5) {
            this.f132003a = z;
            this.f132004b = z2;
            this.f132005c = i;
            this.f132006d = z3;
            this.f132007e = i2;
            this.f132008f = z4;
            this.f132009g = z5;
        }

        public /* synthetic */ C53370a(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, int i3, C52707g gVar) {
            boolean z6;
            int i4;
            int i5;
            boolean z7 = true;
            if ((i3 & 1) != 0) {
                z6 = true;
            } else {
                z6 = z;
            }
            if ((i3 & 4) != 0) {
                i4 = 5;
            } else {
                i4 = i;
            }
            if ((i3 & 8) == 0) {
                z7 = z3;
            }
            if ((i3 & 16) != 0) {
                i5 = 7;
            } else {
                i5 = i2;
            }
            this(z6, false, i4, z7, i5, false, false);
        }
    }

    private C53369f() {
    }

    /* renamed from: a */
    public static C53370a m113441a() {
        return f132002b;
    }

    static {
        C53370a aVar;
        if (C53362a.m113432c()) {
            aVar = new C53370a(false, false, 0, false, 0, false, false, 127, null);
        } else {
            aVar = InternalLeakCanary.INSTANCE.getNoInstallConfig();
        }
        f132002b = aVar;
    }

    /* renamed from: a */
    public static void m113442a(C53370a aVar) {
        C52711k.m112240b(aVar, "value");
        f132002b = aVar;
    }
}
