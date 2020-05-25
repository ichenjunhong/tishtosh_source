package android.support.constraint.p020a;

import android.support.constraint.p020a.C0357h.C0358a;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a */
public final class C0324a {

    /* renamed from: a */
    int f901a;

    /* renamed from: b */
    final C0348b f902b;

    /* renamed from: c */
    final C0349c f903c;

    /* renamed from: d */
    int[] f904d = new int[this.f908h];

    /* renamed from: e */
    int[] f905e = new int[this.f908h];

    /* renamed from: f */
    float[] f906f = new float[this.f908h];

    /* renamed from: g */
    int f907g = -1;

    /* renamed from: h */
    private int f908h = 8;

    /* renamed from: i */
    private C0357h f909i;

    /* renamed from: j */
    private int f910j = -1;

    /* renamed from: k */
    private boolean f911k;

    /* renamed from: a */
    public final void mo695a(C0357h hVar, float f) {
        if (f == 0.0f) {
            mo688a(hVar, true);
        } else if (this.f907g == -1) {
            this.f907g = 0;
            this.f906f[this.f907g] = f;
            this.f904d[this.f907g] = hVar.f1134c;
            this.f905e[this.f907g] = -1;
            hVar.f1142k++;
            hVar.mo807a(this.f902b);
            this.f901a++;
            if (!this.f911k) {
                this.f910j++;
                if (this.f910j >= this.f904d.length) {
                    this.f911k = true;
                    this.f910j = this.f904d.length - 1;
                }
            }
        } else {
            int i = this.f907g;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f901a) {
                if (this.f904d[i] == hVar.f1134c) {
                    this.f906f[i] = f;
                    return;
                }
                if (this.f904d[i] < hVar.f1134c) {
                    i3 = i;
                }
                i = this.f905e[i];
                i2++;
            }
            int i4 = this.f910j + 1;
            if (this.f911k) {
                if (this.f904d[this.f910j] == -1) {
                    i4 = this.f910j;
                } else {
                    i4 = this.f904d.length;
                }
            }
            if (i4 >= this.f904d.length && this.f901a < this.f904d.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f904d.length) {
                        break;
                    } else if (this.f904d[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f904d.length) {
                i4 = this.f904d.length;
                this.f908h *= 2;
                this.f911k = false;
                this.f910j = i4 - 1;
                this.f906f = Arrays.copyOf(this.f906f, this.f908h);
                this.f904d = Arrays.copyOf(this.f904d, this.f908h);
                this.f905e = Arrays.copyOf(this.f905e, this.f908h);
            }
            this.f904d[i4] = hVar.f1134c;
            this.f906f[i4] = f;
            if (i3 != -1) {
                int[] iArr = this.f905e;
                iArr[i4] = iArr[i3];
                this.f905e[i3] = i4;
            } else {
                this.f905e[i4] = this.f907g;
                this.f907g = i4;
            }
            hVar.f1142k++;
            hVar.mo807a(this.f902b);
            this.f901a++;
            if (!this.f911k) {
                this.f910j++;
            }
            if (this.f901a >= this.f904d.length) {
                this.f911k = true;
            }
            if (this.f910j >= this.f904d.length) {
                this.f911k = true;
                this.f910j = this.f904d.length - 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo696a(C0357h hVar, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f907g == -1) {
                this.f907g = 0;
                this.f906f[this.f907g] = f;
                this.f904d[this.f907g] = hVar.f1134c;
                this.f905e[this.f907g] = -1;
                hVar.f1142k++;
                hVar.mo807a(this.f902b);
                this.f901a++;
                if (!this.f911k) {
                    this.f910j++;
                    if (this.f910j >= this.f904d.length) {
                        this.f911k = true;
                        this.f910j = this.f904d.length - 1;
                    }
                }
                return;
            }
            int i = this.f907g;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f901a) {
                if (this.f904d[i] == hVar.f1134c) {
                    float[] fArr = this.f906f;
                    fArr[i] = fArr[i] + f;
                    if (this.f906f[i] == 0.0f) {
                        if (i == this.f907g) {
                            this.f907g = this.f905e[i];
                        } else {
                            int[] iArr = this.f905e;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            hVar.mo809b(this.f902b);
                        }
                        if (this.f911k) {
                            this.f910j = i;
                        }
                        hVar.f1142k--;
                        this.f901a--;
                    }
                    return;
                }
                if (this.f904d[i] < hVar.f1134c) {
                    i3 = i;
                }
                i = this.f905e[i];
                i2++;
            }
            int i4 = this.f910j + 1;
            if (this.f911k) {
                if (this.f904d[this.f910j] == -1) {
                    i4 = this.f910j;
                } else {
                    i4 = this.f904d.length;
                }
            }
            if (i4 >= this.f904d.length && this.f901a < this.f904d.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f904d.length) {
                        break;
                    } else if (this.f904d[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f904d.length) {
                i4 = this.f904d.length;
                this.f908h *= 2;
                this.f911k = false;
                this.f910j = i4 - 1;
                this.f906f = Arrays.copyOf(this.f906f, this.f908h);
                this.f904d = Arrays.copyOf(this.f904d, this.f908h);
                this.f905e = Arrays.copyOf(this.f905e, this.f908h);
            }
            this.f904d[i4] = hVar.f1134c;
            this.f906f[i4] = f;
            if (i3 != -1) {
                int[] iArr2 = this.f905e;
                iArr2[i4] = iArr2[i3];
                this.f905e[i3] = i4;
            } else {
                this.f905e[i4] = this.f907g;
                this.f907g = i4;
            }
            hVar.f1142k++;
            hVar.mo807a(this.f902b);
            this.f901a++;
            if (!this.f911k) {
                this.f910j++;
            }
            if (this.f910j >= this.f904d.length) {
                this.f911k = true;
                this.f910j = this.f904d.length - 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo694a(C0348b bVar, C0348b[] bVarArr) {
        int i = this.f907g;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f901a) {
                C0357h hVar = this.f903c.f1077c[this.f904d[i]];
                if (hVar.f1135d != -1) {
                    float f = this.f906f[i];
                    mo688a(hVar, true);
                    C0348b bVar2 = bVarArr[hVar.f1135d];
                    if (!bVar2.f1074e) {
                        C0324a aVar = bVar2.f1073d;
                        int i3 = aVar.f907g;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f901a) {
                            mo696a(this.f903c.f1077c[aVar.f904d[i3]], aVar.f906f[i3] * f, true);
                            i3 = aVar.f905e[i3];
                            i4++;
                        }
                    }
                    bVar.f1071b += bVar2.f1071b * f;
                    bVar2.f1070a.mo809b(bVar);
                    i = this.f907g;
                } else {
                    i = this.f905e[i];
                    i2++;
                }
            }
            return;
        }
    }

    public final String toString() {
        String str = "";
        int i = this.f907g;
        int i2 = 0;
        while (i != -1 && i2 < this.f901a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f906f[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f903c.f1077c[this.f904d[i]]);
            str = sb5.toString();
            i = this.f905e[i];
            i2++;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo691a() {
        int i = this.f907g;
        int i2 = 0;
        while (i != -1 && i2 < this.f901a) {
            C0357h hVar = this.f903c.f1077c[this.f904d[i]];
            if (hVar != null) {
                hVar.mo809b(this.f902b);
            }
            i = this.f905e[i];
            i2++;
        }
        this.f907g = -1;
        this.f910j = -1;
        this.f911k = false;
        this.f901a = 0;
    }

    /* renamed from: a */
    public final float mo687a(C0357h hVar) {
        int i = this.f907g;
        int i2 = 0;
        while (i != -1 && i2 < this.f901a) {
            if (this.f904d[i] == hVar.f1134c) {
                return this.f906f[i];
            }
            i = this.f905e[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo697b(int i) {
        int i2 = this.f907g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f901a) {
            if (i3 == i) {
                return this.f906f[i2];
            }
            i2 = this.f905e[i2];
            i3++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0357h mo689a(int i) {
        int i2 = this.f907g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f901a) {
            if (i3 == i) {
                return this.f903c.f1077c[this.f904d[i2]];
            }
            i2 = this.f905e[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo692a(float f) {
        int i = this.f907g;
        int i2 = 0;
        while (i != -1 && i2 < this.f901a) {
            float[] fArr = this.f906f;
            fArr[i] = fArr[i] / f;
            i = this.f905e[i];
            i2++;
        }
    }

    /* renamed from: a */
    static boolean m712a(C0357h hVar, C0351e eVar) {
        if (hVar.f1142k <= 1) {
            return true;
        }
        return false;
    }

    C0324a(C0348b bVar, C0349c cVar) {
        this.f902b = bVar;
        this.f903c = cVar;
    }

    /* renamed from: a */
    public final float mo688a(C0357h hVar, boolean z) {
        if (this.f909i == hVar) {
            this.f909i = null;
        }
        if (this.f907g == -1) {
            return 0.0f;
        }
        int i = this.f907g;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f901a) {
            if (this.f904d[i] == hVar.f1134c) {
                if (i == this.f907g) {
                    this.f907g = this.f905e[i];
                } else {
                    int[] iArr = this.f905e;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.mo809b(this.f902b);
                }
                hVar.f1142k--;
                this.f901a--;
                this.f904d[i] = -1;
                if (this.f911k) {
                    this.f910j = i;
                }
                return this.f906f[i];
            }
            i2++;
            i3 = i;
            i = this.f905e[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0357h mo690a(boolean[] zArr, C0357h hVar) {
        int i = this.f907g;
        int i2 = 0;
        C0357h hVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f901a) {
            if (this.f906f[i] < 0.0f) {
                C0357h hVar3 = this.f903c.f1077c[this.f904d[i]];
                if ((zArr == null || !zArr[hVar3.f1134c]) && hVar3 != hVar && (hVar3.f1139h == C0358a.SLACK || hVar3.f1139h == C0358a.ERROR)) {
                    float f2 = this.f906f[i];
                    if (f2 < f) {
                        hVar2 = hVar3;
                        f = f2;
                    }
                }
            }
            i = this.f905e[i];
            i2++;
        }
        return hVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo693a(C0348b bVar, C0348b bVar2, boolean z) {
        int i = this.f907g;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f901a) {
                if (this.f904d[i] == bVar2.f1070a.f1134c) {
                    float f = this.f906f[i];
                    mo688a(bVar2.f1070a, false);
                    C0324a aVar = bVar2.f1073d;
                    int i3 = aVar.f907g;
                    int i4 = 0;
                    while (i3 != -1 && i4 < aVar.f901a) {
                        mo696a(this.f903c.f1077c[aVar.f904d[i3]], aVar.f906f[i3] * f, false);
                        i3 = aVar.f905e[i3];
                        i4++;
                    }
                    bVar.f1071b += bVar2.f1071b * f;
                    i = this.f907g;
                } else {
                    i = this.f905e[i];
                    i2++;
                }
            }
            return;
        }
    }
}
