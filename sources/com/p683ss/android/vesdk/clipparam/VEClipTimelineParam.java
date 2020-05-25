package com.p683ss.android.vesdk.clipparam;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipTimelineParam */
public class VEClipTimelineParam {
    public float[] curveSpeedPointX;
    public float[] curveSpeedPointY;
    public boolean isReverseCurveSpeed;
    public double speed = 1.0d;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder sb = new StringBuilder("trimIn: ");
        sb.append(this.trimIn);
        sb.append(" trimOut: ");
        sb.append(this.trimOut);
        sb.append(" speed: ");
        sb.append(this.speed);
        return sb.toString();
    }
}
