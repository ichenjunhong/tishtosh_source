package com.p683ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VERepeatFilterParam */
public class VERepeatFilterParam extends VEBaseFilterParam {
    public static final String REPEAT_ATTR_DURATION = "timeEffect repeating duration";
    public static final String REPEAT_ATTR_FILTERSEQIN = "timeEffect seqin";
    public static final String REPEAT_ATTR_FILTERSEQOUT = "timeEffect seqout";
    public static final String REPEAT_ATTR_MODE = "timeEffect repeating mode";
    public static final String REPEAT_ATTR_TIMES = "timeEffect repeating times";
    public static final String REPEAT_FILTER_NAME = "new repeat effect";
    public int repeatDuration;
    public int repeatTime;
    public int seqIn;
    public int seqOut;
    public int timeMode;

    public VERepeatFilterParam() {
        this.filterName = REPEAT_FILTER_NAME;
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VERepeatFilterParam seqIn=");
        sb.append(this.seqIn);
        sb.append(" repeatTime=");
        sb.append(this.repeatTime);
        sb.append(" repeatDuration=");
        sb.append(this.repeatDuration);
        sb.append(" timeMode=");
        sb.append(this.timeMode);
        return sb.toString();
    }
}
