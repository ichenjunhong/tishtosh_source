package com.p683ss.android.vesdk.clipparam;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipParam */
public class VEClipParam {
    public int clipIndex;
    public int clipRotate;
    public int clipType;
    public String path;
    public int seqIn;
    public int seqOut;
    public double speed;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder sb = new StringBuilder("VEClipParam: clipType=");
        sb.append(this.clipType);
        sb.append("path=");
        sb.append(this.path);
        sb.append(" trimIn=");
        sb.append(this.trimIn);
        sb.append(" trimOut:=");
        sb.append(this.trimOut);
        sb.append(" speed=");
        sb.append(this.speed);
        sb.append(" clipRotate=");
        sb.append(this.clipRotate);
        return sb.toString();
    }
}
