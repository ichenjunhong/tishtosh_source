package com.p683ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VESlowMotionFilterParam */
public class VESlowMotionFilterParam extends VEBaseFilterParam {
    public static final String SLOW_ATTR_DURATION = "timeEffect slow motion duration";
    public static final String SLOW_ATTR_FILTERSEQIN = "timeEffect seqin";
    public static final String SLOW_ATTR_FILTERSEQOUT = "timeEffect seqout";
    public static final String SLOW_ATTR_MODE = "timeEffect slow motion mode";
    public static final String SLOW_ATTR_SPEED = "timeEffect slow motion speed";
    public static final String SLOW_FILTER_NAME = "new slow effect";
    public int seqIn;
    public int seqOut;
    public int slowMotionDuration;
    public float slowMotionSpeed;
    public int timeMode;

    public VESlowMotionFilterParam() {
        this.filterName = SLOW_FILTER_NAME;
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
        this.slowMotionSpeed = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VESlowMotionFilterParam seqIn=");
        sb.append(this.seqIn);
        sb.append(" slowMotionDuration=");
        sb.append(this.slowMotionDuration);
        sb.append(" slowMotionSpeed=");
        sb.append(this.slowMotionSpeed);
        sb.append(" timeMode=");
        sb.append(this.timeMode);
        return sb.toString();
    }
}
