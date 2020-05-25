package androidx.work;

import com.C2240a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.work.e */
public final class C1538e {

    /* renamed from: a */
    public static final C1538e f5534a = new C1539a().mo5924a();

    /* renamed from: b */
    public Map<String, Object> f5535b;

    /* renamed from: androidx.work.e$a */
    public static final class C1539a {

        /* renamed from: a */
        private Map<String, Object> f5536a = new HashMap();

        /* renamed from: a */
        public final C1538e mo5924a() {
            return new C1538e(this.f5536a);
        }

        /* renamed from: a */
        public final C1539a mo5923a(Map<String, Object> map) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f5536a.put(str, null);
                } else {
                    Class<double[]> cls = value.getClass();
                    if (cls == Boolean.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f5536a.put(str, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.f5536a;
                            boolean[] zArr = (boolean[]) value;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == int[].class) {
                            Map<String, Object> map3 = this.f5536a;
                            int[] iArr = (int[]) value;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            map3.put(str, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map4 = this.f5536a;
                            long[] jArr = (long[]) value;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            map4.put(str, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map5 = this.f5536a;
                            float[] fArr = (float[]) value;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            map5.put(str, fArr2);
                        } else if (cls == double[].class) {
                            Map<String, Object> map6 = this.f5536a;
                            double[] dArr = (double[]) value;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            map6.put(str, dArr2);
                        } else {
                            throw new IllegalArgumentException(C2240a.m6772a("Key %s has invalid type %s", new Object[]{str, cls}));
                        }
                    }
                }
            }
            return this;
        }
    }

    C1538e() {
    }

    /* renamed from: a */
    public final Map<String, Object> mo5920a() {
        return Collections.unmodifiableMap(this.f5535b);
    }

    public final int hashCode() {
        return this.f5535b.hashCode() * 31;
    }

    C1538e(Map<String, ?> map) {
        this.f5535b = new HashMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5535b.equals(((C1538e) obj).f5535b);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1538e m5493a(byte[] r5) throws java.lang.IllegalStateException {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0046:
            androidx.work.e r5 = new androidx.work.e
            r5.<init>(r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1538e.m5493a(byte[]):androidx.work.e");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(0)|21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(3:1|2|(5:3|4|(2:7|5)|8|9))|10|11|29|(2:31|32)(2:33|34)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c A[SYNTHETIC, Splitter:B:19:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[SYNTHETIC, Splitter:B:27:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5494a(androidx.work.C1538e r4) throws java.lang.IllegalStateException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0053, all -> 0x0048 }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f5535b     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f5535b     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
        L_0x001e:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x0046, all -> 0x0044 }
            goto L_0x001e
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0059
        L_0x0042:
            goto L_0x0059
        L_0x0044:
            r4 = move-exception
            goto L_0x004a
        L_0x0046:
            r1 = r2
            goto L_0x0053
        L_0x0048:
            r4 = move-exception
            r2 = r1
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r0.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r4
        L_0x0053:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x003e
        L_0x0059:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x0066
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0066:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1538e.m5494a(androidx.work.e):byte[]");
    }
}
