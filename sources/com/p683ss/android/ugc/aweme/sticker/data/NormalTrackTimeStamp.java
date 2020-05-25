package com.p683ss.android.ugc.aweme.sticker.data;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp */
public class NormalTrackTimeStamp extends BaseTrackTimeStamp {
    @C17952c(mo34828a = "end_time")
    private float endTime = -1.0f;
    @C17952c(mo34828a = "h")
    private float height;
    @C17952c(mo34828a = "r")
    private float rotation;
    private Float scale;
    @C17952c(mo34828a = "s")
    private Float scaleForIos;
    @C17952c(mo34828a = "start_time")
    private float startTime = -1.0f;
    @C17952c(mo34828a = "w")
    private float width;

    /* renamed from: x */
    private float f115889x;

    /* renamed from: y */
    private float f115890y;

    public float getEndTime() {
        return this.endTime;
    }

    public float getHeight() {
        return this.height;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Float getScaleForIos() {
        return this.scaleForIos;
    }

    public float getStartTime() {
        return this.startTime;
    }

    public float getWidth() {
        return this.width;
    }

    public float getX() {
        return this.f115889x;
    }

    public float getY() {
        return this.f115890y;
    }

    public NormalTrackTimeStamp() {
    }

    public boolean isWholeDuration() {
        if (!timeIsValid()) {
            return true;
        }
        return false;
    }

    public Float getScale() {
        if (this.scale != null) {
            return this.scale;
        }
        if (this.scaleForIos != null) {
            return this.scaleForIos;
        }
        return Float.valueOf(1.0f);
    }

    public boolean timeIsValid() {
        if (this.startTime < 0.0f || this.endTime <= 0.0f || this.startTime > this.endTime) {
            return false;
        }
        return true;
    }

    public void setEndTime(float f) {
        this.endTime = f;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setScale(Float f) {
        this.scaleForIos = f;
    }

    public void setScaleForIos(Float f) {
        this.scaleForIos = f;
    }

    public void setStartTime(float f) {
        this.startTime = f;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public void setX(float f) {
        this.f115889x = f;
    }

    public void setY(float f) {
        this.f115890y = f;
    }

    public NormalTrackTimeStamp(int i) {
        super(i);
    }
}
