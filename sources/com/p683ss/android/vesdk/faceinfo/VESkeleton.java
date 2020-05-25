package com.p683ss.android.vesdk.faceinfo;

import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.ss.android.vesdk.faceinfo.VESkeleton */
public class VESkeleton {

    /* renamed from: ID */
    private int f127185ID;
    private PointF[] points;
    private RectF rect;

    public int getID() {
        return this.f127185ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i) {
        this.f127185ID = i;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}
