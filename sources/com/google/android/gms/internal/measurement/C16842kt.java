package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.kt */
public final class C16842kt extends IOException {
    C16842kt(int i, int i2) {
        StringBuilder sb = new StringBuilder(108);
        sb.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb.append(i);
        sb.append(" limit ");
        sb.append(i2);
        sb.append(").");
        super(sb.toString());
    }
}
