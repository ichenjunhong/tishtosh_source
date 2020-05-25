package android.support.constraint.p020a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.h */
public final class C0357h {

    /* renamed from: a */
    static int f1128a = 1;

    /* renamed from: l */
    private static int f1129l = 1;

    /* renamed from: m */
    private static int f1130m = 1;

    /* renamed from: n */
    private static int f1131n = 1;

    /* renamed from: o */
    private static int f1132o = 1;

    /* renamed from: b */
    public String f1133b;

    /* renamed from: c */
    public int f1134c = -1;

    /* renamed from: d */
    int f1135d = -1;

    /* renamed from: e */
    public int f1136e;

    /* renamed from: f */
    public float f1137f;

    /* renamed from: g */
    float[] f1138g = new float[7];

    /* renamed from: h */
    C0358a f1139h;

    /* renamed from: i */
    C0348b[] f1140i = new C0348b[8];

    /* renamed from: j */
    int f1141j;

    /* renamed from: k */
    public int f1142k;

    /* renamed from: android.support.constraint.a.h$a */
    public enum C0358a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: a */
    public final void mo806a() {
        this.f1133b = null;
        this.f1139h = C0358a.UNKNOWN;
        this.f1136e = 0;
        this.f1134c = -1;
        this.f1135d = -1;
        this.f1137f = 0.0f;
        this.f1141j = 0;
        this.f1142k = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f1133b);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo810c(C0348b bVar) {
        int i = this.f1141j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1140i[i2].f1073d.mo693a(this.f1140i[i2], bVar, false);
        }
        this.f1141j = 0;
    }

    /* renamed from: a */
    public final void mo807a(C0348b bVar) {
        int i = 0;
        while (i < this.f1141j) {
            if (this.f1140i[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
        if (this.f1141j >= this.f1140i.length) {
            this.f1140i = (C0348b[]) Arrays.copyOf(this.f1140i, this.f1140i.length * 2);
        }
        this.f1140i[this.f1141j] = bVar;
        this.f1141j++;
    }

    /* renamed from: b */
    public final void mo809b(C0348b bVar) {
        int i = this.f1141j;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1140i[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f1140i[i4] = this.f1140i[i4 + 1];
                }
                this.f1141j--;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo808a(C0358a aVar, String str) {
        this.f1139h = aVar;
    }

    public C0357h(C0358a aVar, String str) {
        this.f1139h = aVar;
    }
}
