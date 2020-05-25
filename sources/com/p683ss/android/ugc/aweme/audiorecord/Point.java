package com.p683ss.android.ugc.aweme.audiorecord;

import com.facebook.internal.C14338p;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.audiorecord.Point */
public final class Point implements Serializable {
    @C17952c(mo34828a = "time")

    /* renamed from: t */
    private long f62289t;
    @C17952c(mo34828a = "x")

    /* renamed from: x */
    private int f62290x;
    @C17952c(mo34828a = "y")

    /* renamed from: y */
    private int f62291y;

    public final long getT() {
        return this.f62289t;
    }

    public final int getX() {
        return this.f62290x;
    }

    public final int getY() {
        return this.f62291y;
    }

    public final void setT(long j) {
        this.f62289t = j;
    }

    public final void setX(int i) {
        this.f62290x = i;
    }

    public final void setY(int i) {
        this.f62291y = i;
    }

    public final boolean isEqual(Point point) {
        C52711k.m112240b(point, C14338p.f37308a);
        if (this.f62290x == point.f62290x && this.f62291y == point.f62291y && this.f62289t == point.f62289t) {
            return true;
        }
        return false;
    }

    public Point(int i, int i2, long j) {
        this.f62290x = i;
        this.f62291y = i2;
        this.f62289t = j;
    }
}
