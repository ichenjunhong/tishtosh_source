package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kg */
final class C16829kg extends IllegalArgumentException {
    C16829kg(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
