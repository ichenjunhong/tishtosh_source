package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.util.C15512c;
import com.google.android.gms.common.util.C15522m;
import com.google.android.gms.common.util.C15523n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Creator<SafeParcelResponse> CREATOR = new C15496e();

    /* renamed from: a */
    private final int f39923a;

    /* renamed from: b */
    private final Parcel f39924b;

    /* renamed from: c */
    private final int f39925c = 2;

    /* renamed from: d */
    private final zak f39926d;

    /* renamed from: e */
    private final String f39927e;

    /* renamed from: f */
    private int f39928f;

    /* renamed from: g */
    private int f39929g;

    SafeParcelResponse(int i, Parcel parcel, zak zak) {
        this.f39923a = i;
        this.f39924b = (Parcel) C15464q.m32123a(parcel);
        this.f39926d = zak;
        if (this.f39926d == null) {
            this.f39927e = null;
        } else {
            this.f39927e = this.f39926d.f39930a;
        }
        this.f39928f = 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zak zak;
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39923a);
        Parcel b = m32232b();
        if (b != null) {
            int a2 = C15469b.m32175a(parcel, 2);
            parcel.appendFrom(b, 0, b.dataSize());
            C15469b.m32194b(parcel, a2);
        }
        switch (this.f39925c) {
            case 0:
                zak = null;
                break;
            case 1:
                zak = this.f39926d;
                break;
            case 2:
                zak = this.f39926d;
                break;
            default:
                int i2 = this.f39925c;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid creation type: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        C15469b.m32183a(parcel, 3, (Parcelable) zak, i, false);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: b */
    private final Parcel m32232b() {
        switch (this.f39928f) {
            case 0:
                this.f39929g = C15469b.m32174a(this.f39924b);
                break;
            case 1:
                break;
        }
        C15469b.m32197c(this.f39924b, this.f39929g);
        this.f39928f = 2;
        return this.f39924b;
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo27875a() {
        if (this.f39926d == null) {
            return null;
        }
        return this.f39926d.mo28504a(this.f39927e);
    }

    /* renamed from: a */
    public final Object mo28484a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: b */
    public final boolean mo28485b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public String toString() {
        C15464q.m32124a(this.f39926d, (Object) "Cannot convert to JSON on client side.");
        Parcel b = m32232b();
        b.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m32231a(sb, this.f39926d.mo28504a(this.f39927e), b);
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [int[]] */
    /* JADX WARNING: type inference failed for: r6v6, types: [int[]] */
    /* JADX WARNING: type inference failed for: r6v7, types: [long[]] */
    /* JADX WARNING: type inference failed for: r6v8, types: [long[]] */
    /* JADX WARNING: type inference failed for: r6v9, types: [float[]] */
    /* JADX WARNING: type inference failed for: r6v10, types: [float[]] */
    /* JADX WARNING: type inference failed for: r6v11, types: [double[]] */
    /* JADX WARNING: type inference failed for: r6v12, types: [double[]] */
    /* JADX WARNING: type inference failed for: r6v13, types: [boolean[]] */
    /* JADX WARNING: type inference failed for: r6v14, types: [boolean[]] */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v4
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], long[], int[], float[], double[], boolean[]]
      uses: [int[], long[], float[], double[], boolean[]]
      mth insns count: 256
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32231a(java.lang.StringBuilder r10, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> r11, android.os.Parcel r12) {
        /*
            r9 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x000d:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.f39917f
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0025:
            r11 = 123(0x7b, float:1.72E-43)
            r10.append(r11)
            int r11 = com.google.android.gms.common.internal.safeparcel.C15467a.m32148b(r12)
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0031:
            int r4 = r12.dataPosition()
            if (r4 >= r11) goto L_0x0312
            int r4 = com.google.android.gms.common.internal.safeparcel.C15467a.m32143a(r12)
            int r5 = com.google.android.gms.common.internal.safeparcel.C15467a.m32142a(r4)
            java.lang.Object r5 = r0.get(r5)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 == 0) goto L_0x0031
            if (r3 == 0) goto L_0x004e
            java.lang.String r3 = ","
            r10.append(r3)
        L_0x004e:
            java.lang.Object r3 = r5.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r5.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            java.lang.String r6 = "\""
            r10.append(r6)
            r10.append(r3)
            java.lang.String r3 = "\":"
            r10.append(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$a<I, O> r3 = r5.f39920i
            if (r3 == 0) goto L_0x006d
            r3 = 1
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            if (r3 == 0) goto L_0x014f
            int r3 = r5.f39914c
            switch(r3) {
                case 0: goto L_0x013e;
                case 1: goto L_0x0131;
                case 2: goto L_0x0120;
                case 3: goto L_0x010f;
                case 4: goto L_0x00fe;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00d3;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00c6;
                case 10: goto L_0x0098;
                case 11: goto L_0x0090;
                default: goto L_0x0075;
            }
        L_0x0075:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            int r11 = r5.f39914c
            r12 = 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "Unknown field out type = "
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L_0x0090:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Method does not accept concrete type."
            r10.<init>(r11)
            throw r10
        L_0x0098:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32165p(r12, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r6 = r3.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00a9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r3.getString(r7)
            r4.put(r7, r8)
            goto L_0x00a9
        L_0x00bd:
            java.lang.Object r3 = m32214a(r5, r4)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x00c6:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32166q(r12, r4)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x00d3:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32163n(r12, r4)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x00e0:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32152c(r12, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x00f1:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32162m(r12, r4)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x00fe:
            double r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32161l(r12, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x010f:
            float r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32159j(r12, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x0120:
            long r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32156g(r12, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x0131:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32158i(r12, r4)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x013e:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32154e(r12, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = m32214a(r5, r3)
            m32230a(r10, r5, r3)
            goto L_0x030f
        L_0x014f:
            boolean r3 = r5.f39915d
            if (r3 == 0) goto L_0x0221
            java.lang.String r3 = "["
            r10.append(r3)
            int r3 = r5.f39914c
            r6 = 0
            switch(r3) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01fc;
                case 2: goto L_0x01e5;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01b7;
                case 5: goto L_0x01af;
                case 6: goto L_0x0197;
                case 7: goto L_0x018e;
                case 8: goto L_0x0186;
                case 9: goto L_0x0186;
                case 10: goto L_0x0186;
                case 11: goto L_0x0166;
                default: goto L_0x015e;
            }
        L_0x015e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unknown field type out."
            r10.<init>(r11)
            throw r10
        L_0x0166:
            android.os.Parcel[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32172w(r12, r4)
            int r4 = r3.length
            r6 = 0
        L_0x016c:
            if (r6 >= r4) goto L_0x021a
            if (r6 <= 0) goto L_0x0175
            java.lang.String r7 = ","
            r10.append(r7)
        L_0x0175:
            r7 = r3[r6]
            r7.setDataPosition(r2)
            java.util.Map r7 = r5.mo28487a()
            r8 = r3[r6]
            r9.m32231a(r10, r7, r8)
            int r6 = r6 + 1
            goto L_0x016c
        L_0x0186:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r11 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r10.<init>(r11)
            throw r10
        L_0x018e:
            java.lang.String[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32169t(r12, r4)
            com.google.android.gms.common.util.C15511b.m32263a(r10, r3)
            goto L_0x021a
        L_0x0197:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32144a(r12, r4)
            int r4 = r12.dataPosition()
            if (r3 != 0) goto L_0x01a2
            goto L_0x01aa
        L_0x01a2:
            boolean[] r6 = r12.createBooleanArray()
            int r4 = r4 + r3
            r12.setDataPosition(r4)
        L_0x01aa:
            com.google.android.gms.common.util.C15511b.m32264a(r10, r6)
            goto L_0x021a
        L_0x01af:
            java.math.BigDecimal[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32168s(r12, r4)
            com.google.android.gms.common.util.C15511b.m32262a(r10, (T[]) r3)
            goto L_0x021a
        L_0x01b7:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32144a(r12, r4)
            int r4 = r12.dataPosition()
            if (r3 != 0) goto L_0x01c2
            goto L_0x01ca
        L_0x01c2:
            double[] r6 = r12.createDoubleArray()
            int r4 = r4 + r3
            r12.setDataPosition(r4)
        L_0x01ca:
            com.google.android.gms.common.util.C15511b.m32258a(r10, r6)
            goto L_0x021a
        L_0x01ce:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32144a(r12, r4)
            int r4 = r12.dataPosition()
            if (r3 != 0) goto L_0x01d9
            goto L_0x01e1
        L_0x01d9:
            float[] r6 = r12.createFloatArray()
            int r4 = r4 + r3
            r12.setDataPosition(r4)
        L_0x01e1:
            com.google.android.gms.common.util.C15511b.m32259a(r10, r6)
            goto L_0x021a
        L_0x01e5:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32144a(r12, r4)
            int r4 = r12.dataPosition()
            if (r3 != 0) goto L_0x01f0
            goto L_0x01f8
        L_0x01f0:
            long[] r6 = r12.createLongArray()
            int r4 = r4 + r3
            r12.setDataPosition(r4)
        L_0x01f8:
            com.google.android.gms.common.util.C15511b.m32261a(r10, r6)
            goto L_0x021a
        L_0x01fc:
            java.math.BigInteger[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32167r(r12, r4)
            com.google.android.gms.common.util.C15511b.m32262a(r10, (T[]) r3)
            goto L_0x021a
        L_0x0204:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32144a(r12, r4)
            int r4 = r12.dataPosition()
            if (r3 != 0) goto L_0x020f
            goto L_0x0217
        L_0x020f:
            int[] r6 = r12.createIntArray()
            int r4 = r4 + r3
            r12.setDataPosition(r4)
        L_0x0217:
            com.google.android.gms.common.util.C15511b.m32260a(r10, r6)
        L_0x021a:
            java.lang.String r3 = "]"
            r10.append(r3)
            goto L_0x030f
        L_0x0221:
            int r3 = r5.f39914c
            switch(r3) {
                case 0: goto L_0x0308;
                case 1: goto L_0x0300;
                case 2: goto L_0x02f8;
                case 3: goto L_0x02f0;
                case 4: goto L_0x02e8;
                case 5: goto L_0x02e0;
                case 6: goto L_0x02d8;
                case 7: goto L_0x02c2;
                case 8: goto L_0x02ac;
                case 9: goto L_0x0296;
                case 10: goto L_0x023e;
                case 11: goto L_0x022e;
                default: goto L_0x0226;
            }
        L_0x0226:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unknown field type out"
            r10.<init>(r11)
            throw r10
        L_0x022e:
            android.os.Parcel r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32171v(r12, r4)
            r3.setDataPosition(r2)
            java.util.Map r4 = r5.mo28487a()
            r9.m32231a(r10, r4, r3)
            goto L_0x030f
        L_0x023e:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32165p(r12, r4)
            java.util.Set r4 = r3.keySet()
            r4.size()
            java.lang.String r5 = "{"
            r10.append(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 1
        L_0x0253:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x028f
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r5 != 0) goto L_0x0266
            java.lang.String r5 = ","
            r10.append(r5)
        L_0x0266:
            java.lang.String r5 = "\""
            r10.append(r5)
            r10.append(r6)
            java.lang.String r5 = "\""
            r10.append(r5)
            java.lang.String r5 = ":"
            r10.append(r5)
            java.lang.String r5 = "\""
            r10.append(r5)
            java.lang.String r5 = r3.getString(r6)
            java.lang.String r5 = com.google.android.gms.common.util.C15522m.m32291a(r5)
            r10.append(r5)
            java.lang.String r5 = "\""
            r10.append(r5)
            r5 = 0
            goto L_0x0253
        L_0x028f:
            java.lang.String r3 = "}"
            r10.append(r3)
            goto L_0x030f
        L_0x0296:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32166q(r12, r4)
            java.lang.String r4 = "\""
            r10.append(r4)
            java.lang.String r3 = com.google.android.gms.common.util.C15512c.m32269b(r3)
            r10.append(r3)
            java.lang.String r3 = "\""
            r10.append(r3)
            goto L_0x030f
        L_0x02ac:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32166q(r12, r4)
            java.lang.String r4 = "\""
            r10.append(r4)
            java.lang.String r3 = com.google.android.gms.common.util.C15512c.m32268a(r3)
            r10.append(r3)
            java.lang.String r3 = "\""
            r10.append(r3)
            goto L_0x030f
        L_0x02c2:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32163n(r12, r4)
            java.lang.String r4 = "\""
            r10.append(r4)
            java.lang.String r3 = com.google.android.gms.common.util.C15522m.m32291a(r3)
            r10.append(r3)
            java.lang.String r3 = "\""
            r10.append(r3)
            goto L_0x030f
        L_0x02d8:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32152c(r12, r4)
            r10.append(r3)
            goto L_0x030f
        L_0x02e0:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32162m(r12, r4)
            r10.append(r3)
            goto L_0x030f
        L_0x02e8:
            double r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32161l(r12, r4)
            r10.append(r3)
            goto L_0x030f
        L_0x02f0:
            float r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32159j(r12, r4)
            r10.append(r3)
            goto L_0x030f
        L_0x02f8:
            long r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32156g(r12, r4)
            r10.append(r3)
            goto L_0x030f
        L_0x0300:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32158i(r12, r4)
            r10.append(r3)
            goto L_0x030f
        L_0x0308:
            int r3 = com.google.android.gms.common.internal.safeparcel.C15467a.m32154e(r12, r4)
            r10.append(r3)
        L_0x030f:
            r3 = 1
            goto L_0x0031
        L_0x0312:
            int r0 = r12.dataPosition()
            if (r0 != r11) goto L_0x031e
            r11 = 125(0x7d, float:1.75E-43)
            r10.append(r11)
            return
        L_0x031e:
            com.google.android.gms.common.internal.safeparcel.a$a r10 = new com.google.android.gms.common.internal.safeparcel.a$a
            r0 = 37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Overread allowed size end="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.<init>(r11, r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.m32231a(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    /* renamed from: a */
    private static void m32230a(StringBuilder sb, Field<?, ?> field, Object obj) {
        if (field.f39913b) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m32229a(sb, field.f39912a, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m32229a(sb, field.f39912a, obj);
    }

    /* renamed from: a */
    private static void m32229a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(C15522m.m32291a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C15512c.m32268a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C15512c.m32269b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C15523n.m32292a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
