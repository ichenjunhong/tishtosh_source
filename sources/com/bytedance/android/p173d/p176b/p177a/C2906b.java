package com.bytedance.android.p173d.p176b.p177a;

import com.bytedance.android.p173d.p176b.C2911c;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2899a;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2900b;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2901c;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2902d;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2903e;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2904f;
import com.bytedance.android.p173d.p176b.p177a.p178a.C2905g;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.d.b.a.b */
public final class C2906b {

    /* renamed from: a */
    public String f8567a;

    /* renamed from: b */
    public int f8568b;

    /* renamed from: c */
    public boolean f8569c;

    /* renamed from: d */
    public int f8570d;

    /* renamed from: e */
    public long f8571e;

    /* renamed from: f */
    public float f8572f;

    /* renamed from: g */
    public double f8573g;

    /* renamed from: h */
    public String f8574h;

    /* renamed from: i */
    public byte[] f8575i;

    /* renamed from: j */
    public List<String> f8576j = new ArrayList();

    /* renamed from: k */
    private transient int f8577k;

    /* renamed from: com.bytedance.android.d.b.a.b$a */
    public static final class C2907a {
        /* renamed from: a */
        public static String m8271a(C2911c cVar) throws IOException {
            int b;
            C2908c cVar2 = new C2908c(cVar);
            cVar2.mo7536a();
            do {
                b = cVar2.mo7537b();
                if (b == -1) {
                    throw new IllegalArgumentException("No key found in proto");
                }
            } while (b != 1);
            return cVar2.mo7538c();
        }

        /* renamed from: a */
        public static int m8269a(C2906b bVar) {
            if (bVar.f8568b == 0) {
                return C2905g.m8262a(1, bVar.f8567a);
            }
            int a = C2903e.m8258a(2, bVar.f8568b) + C2905g.m8262a(1, bVar.f8567a);
            switch (bVar.f8568b) {
                case 2:
                    return a + C2903e.m8258a(2, bVar.f8568b);
                case 3:
                    return a + C2899a.m8250a(3);
                case 4:
                    return a + C2903e.m8258a(4, bVar.f8570d);
                case 5:
                    return a + C2904f.m8260a(5, bVar.f8571e);
                case 6:
                    return a + C2902d.m8256a(6);
                case 7:
                    return a + C2901c.m8254a(7);
                case 8:
                    return a + C2905g.m8262a(8, bVar.f8574h);
                case 9:
                    return a + C2900b.m8252a(9, bVar.f8575i);
                case 10:
                    return a + C2905g.m8263a(10, bVar.f8576j);
                default:
                    throw new IllegalArgumentException("Unknown type!");
            }
        }

        /* renamed from: a */
        public static void m8272a(C2898a aVar, C2906b bVar) {
            C2905g.m8264a(aVar, 1, bVar.f8567a);
            if (bVar.f8568b != 0) {
                C2903e.m8259a(aVar, 2, bVar.f8568b);
                switch (bVar.f8568b) {
                    case 3:
                        C2899a.m8251a(aVar, 3, bVar.f8569c);
                        return;
                    case 4:
                        C2903e.m8259a(aVar, 4, bVar.f8570d);
                        return;
                    case 5:
                        C2904f.m8261a(aVar, 5, bVar.f8571e);
                        return;
                    case 6:
                        C2902d.m8257a(aVar, 6, bVar.f8572f);
                        return;
                    case 7:
                        C2901c.m8255a(aVar, 7, bVar.f8573g);
                        return;
                    case 8:
                        C2905g.m8264a(aVar, 8, bVar.f8574h);
                        return;
                    case 9:
                        C2900b.m8253a(aVar, 9, bVar.f8575i);
                        return;
                    case 10:
                        C2905g.m8265a(aVar, 10, bVar.f8576j);
                        return;
                    default:
                        throw new IllegalArgumentException("Unknown type!");
                }
            }
        }

        /* renamed from: a */
        public static C2906b m8270a(C2908c cVar, C2906b bVar) throws IOException {
            cVar.mo7536a();
            bVar.f8576j.clear();
            while (true) {
                int b = cVar.mo7537b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            bVar.f8567a = cVar.mo7538c();
                            break;
                        case 2:
                            bVar.f8568b = cVar.mo7539d();
                            if (bVar.f8568b != 0) {
                                break;
                            } else {
                                return bVar;
                            }
                        case 3:
                            boolean z = true;
                            if (cVar.mo7539d() != 1) {
                                z = false;
                            }
                            bVar.f8569c = z;
                            return bVar;
                        case 4:
                            bVar.f8570d = cVar.mo7539d();
                            return bVar;
                        case 5:
                            bVar.f8571e = cVar.mo7540e();
                            return bVar;
                        case 6:
                            bVar.f8572f = Float.intBitsToFloat(cVar.mo7541f());
                            return bVar;
                        case 7:
                            bVar.f8573g = Double.longBitsToDouble(cVar.mo7542g());
                            return bVar;
                        case 8:
                            bVar.f8574h = cVar.mo7538c();
                            return bVar;
                        case 9:
                            bVar.f8575i = cVar.f8578a.mo7548a(cVar.mo7543h());
                            return bVar;
                        case 10:
                            bVar.f8576j.add(cVar.mo7538c());
                            break;
                        default:
                            StringBuilder sb = new StringBuilder("Unexpected tag: ");
                            sb.append(b);
                            throw new IllegalStateException(sb.toString());
                    }
                } else if (bVar.f8568b == 10) {
                    return bVar;
                } else {
                    StringBuilder sb2 = new StringBuilder("Wrong type! Expected: StringList, Found: ");
                    sb2.append(C2906b.m8266a(Integer.valueOf(bVar.f8568b)));
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo7532a() {
        this.f8569c = false;
        this.f8570d = 0;
        this.f8571e = 0;
        this.f8572f = 0.0f;
        this.f8573g = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        this.f8574h = null;
        this.f8575i = null;
        this.f8576j.clear();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.f8577k;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((this.f8567a.hashCode() * 37) + this.f8568b) * 37;
        if (this.f8569c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int floatToIntBits = ((((((hashCode + i) * 37) + this.f8570d) * 37) + ((int) (this.f8571e ^ (this.f8571e >>> 32)))) * 37) + Float.floatToIntBits(this.f8572f);
        long doubleToLongBits = Double.doubleToLongBits(this.f8573g);
        int i4 = ((floatToIntBits * 37) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 37;
        int i5 = 0;
        if (this.f8574h != null) {
            i2 = this.f8574h.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 37;
        if (this.f8575i != null) {
            i5 = Arrays.hashCode(this.f8575i);
        }
        int hashCode2 = ((i6 + i5) * 37) + this.f8576j.hashCode();
        this.f8577k = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("key=");
        sb.append(this.f8567a);
        sb.append(", type=");
        sb.append(this.f8568b);
        sb.append(", booleanValue=");
        sb.append(this.f8569c);
        sb.append(", intValue=");
        sb.append(this.f8570d);
        sb.append(", longValue=");
        sb.append(this.f8571e);
        sb.append(", floatValue=");
        sb.append(this.f8572f);
        sb.append(", doubleValue=");
        sb.append(this.f8573g);
        sb.append(", stringValue=");
        sb.append(this.f8574h);
        sb.append(", bytesValue=");
        sb.append(this.f8575i);
        sb.append(", stringListValue=");
        sb.append(this.f8576j);
        StringBuilder replace = sb.replace(0, 2, "DataProto{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: a */
    public static String m8266a(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 2:
                return "TYPE";
            case 3:
                return "Boolean";
            case 4:
                return "Integer";
            case 5:
                return "Long";
            case 6:
                return "Float";
            case 7:
                return "Double";
            case 8:
                return "String";
            case 9:
                return "Bytes";
            case 10:
                return "StringList";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2906b)) {
            return false;
        }
        C2906b bVar = (C2906b) obj;
        if (!m8267a(this.f8567a, bVar.f8567a) || !m8267a(Integer.valueOf(this.f8568b), Integer.valueOf(bVar.f8568b)) || !m8267a(Boolean.valueOf(this.f8569c), Boolean.valueOf(bVar.f8569c)) || !m8267a(Integer.valueOf(this.f8570d), Integer.valueOf(bVar.f8570d)) || !m8267a(Long.valueOf(this.f8571e), Long.valueOf(bVar.f8571e)) || !m8267a(Float.valueOf(this.f8572f), Float.valueOf(bVar.f8572f)) || !m8267a(Double.valueOf(this.f8573g), Double.valueOf(bVar.f8573g)) || !m8267a(this.f8574h, bVar.f8574h) || !Arrays.equals(this.f8575i, bVar.f8575i) || !this.f8576j.equals(bVar.f8576j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m8267a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
