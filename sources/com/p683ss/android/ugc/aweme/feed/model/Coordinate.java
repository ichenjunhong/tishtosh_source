package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Coordinate */
public final class Coordinate implements Serializable {
    @C17952c(mo34828a = "centerX")
    private final Float centerX;
    @C17952c(mo34828a = "centerY")
    private final Float centerY;

    public Coordinate() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = coordinate.centerX;
        }
        if ((i & 2) != 0) {
            f2 = coordinate.centerY;
        }
        return coordinate.copy(f, f2);
    }

    public final Float component1() {
        return this.centerX;
    }

    public final Float component2() {
        return this.centerY;
    }

    public final Coordinate copy(Float f, Float f2) {
        return new Coordinate(f, f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.centerY, (java.lang.Object) r3.centerY) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.model.Coordinate
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feed.model.Coordinate r3 = (com.p683ss.android.ugc.aweme.feed.model.Coordinate) r3
            java.lang.Float r0 = r2.centerX
            java.lang.Float r1 = r3.centerX
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Float r0 = r2.centerY
            java.lang.Float r3 = r3.centerY
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.Coordinate.equals(java.lang.Object):boolean");
    }

    public final Float getCenterX() {
        return this.centerX;
    }

    public final Float getCenterY() {
        return this.centerY;
    }

    public final int hashCode() {
        Float f = this.centerX;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.centerY;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Coordinate(centerX=");
        sb.append(this.centerX);
        sb.append(", centerY=");
        sb.append(this.centerY);
        sb.append(")");
        return sb.toString();
    }

    public Coordinate(Float f, Float f2) {
        this.centerX = f;
        this.centerY = f2;
    }

    public /* synthetic */ Coordinate(Float f, Float f2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            f = Float.valueOf(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Float.valueOf(0.0f);
        }
        this(f, f2);
    }
}
