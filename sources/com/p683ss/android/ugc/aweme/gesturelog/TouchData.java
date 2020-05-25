package com.p683ss.android.ugc.aweme.gesturelog;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.gesturelog.TouchData */
public class TouchData {
    @C17952c(mo34828a = "action")
    public int action;
    @C17952c(mo34828a = "phone_orientation")
    public int phoneOrientation;
    @C17952c(mo34828a = "pressure")
    public float pressure;
    @C17952c(mo34828a = "time")
    public long time;
    @C17952c(mo34828a = "size")
    public float touchAreaSize;
    @C17952c(mo34828a = "touch_orientation")
    public float touchOrientation;
    @C17952c(mo34828a = "x")

    /* renamed from: x */
    public float f85406x;
    @C17952c(mo34828a = "x_velocity")
    public float xVelocity;
    @C17952c(mo34828a = "y")

    /* renamed from: y */
    public float f85407y;
    @C17952c(mo34828a = "y_velocity")
    public float yVelocity;

    public TouchData(long j, int i, float f, int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.time = j;
        this.action = i;
        this.touchOrientation = f;
        this.phoneOrientation = i2;
        this.f85406x = f2;
        this.f85407y = f3;
        this.pressure = f4;
        this.touchAreaSize = f5;
        this.xVelocity = f6;
        this.yVelocity = f7;
    }
}
