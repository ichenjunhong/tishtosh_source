package com.p683ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VECanvasFilterParam */
public class VECanvasFilterParam extends VEBaseFilterParam {
    public int color;
    public int height;
    public String imagePath;
    public int radius;
    public int sourceType;
    public int width;

    /* renamed from: com.ss.android.vesdk.filterparam.VECanvasFilterParam$a */
    public enum C50696a {
        COLOR,
        VIDEOFRAME,
        IMAGE
    }

    public VECanvasFilterParam() {
        this.filterName = "color_canvas";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.sourceType = C50696a.COLOR.ordinal();
        this.color = -16777216;
        this.radius = 0;
        this.imagePath = "";
        this.width = -1;
        this.height = -1;
    }
}
