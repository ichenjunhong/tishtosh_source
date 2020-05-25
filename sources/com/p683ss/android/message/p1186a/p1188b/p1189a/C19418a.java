package com.p683ss.android.message.p1186a.p1188b.p1189a;

/* renamed from: com.ss.android.message.a.b.a.a */
public final class C19418a {
    /* renamed from: a */
    public static void m47531a(int i, int i2, int i3) {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            StringBuilder sb = new StringBuilder("length=");
            sb.append(i);
            sb.append("; regionStart=");
            sb.append(i2);
            sb.append("; regionLength=");
            sb.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }
}
