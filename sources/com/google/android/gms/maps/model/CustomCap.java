package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {

    /* renamed from: a */
    public final C16952a f47743a;

    /* renamed from: b */
    public final float f47744b;

    public final String toString() {
        String valueOf = String.valueOf(this.f47743a);
        float f = this.f47744b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
