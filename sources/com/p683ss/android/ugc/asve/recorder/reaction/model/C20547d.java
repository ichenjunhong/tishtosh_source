package com.p683ss.android.ugc.asve.recorder.reaction.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.d */
public abstract class C20547d implements C20544a, Serializable {
    @C17952c(mo34828a = "react_window_resource_path")

    /* renamed from: a */
    private final String f56308a;
    @C17952c(mo34828a = "react_is_circle_shape")

    /* renamed from: b */
    private boolean f56309b;

    /* renamed from: c */
    private final int f56310c;

    /* renamed from: d */
    private final int f56311d;

    /* renamed from: e */
    private final int f56312e;

    /* renamed from: f */
    private final int f56313f;
    public final int outputVideoHeight;
    public final int outputVideoWidth;

    public final String getMImagePath() {
        return this.f56308a;
    }

    public final boolean getMIsCircle() {
        return this.f56309b;
    }

    public final int getDefaultHeight() {
        return convertDpToHeight(this.f56311d);
    }

    public final int getDefaultWidth() {
        return convertDpToWidth(this.f56310c);
    }

    public final int getMinHeight() {
        return convertDpToWidth(this.f56313f);
    }

    public final int getMinWidth() {
        return convertDpToWidth(this.f56312e);
    }

    public float getWidthHeightRatio() {
        return ((float) this.f56310c) / ((float) this.f56311d);
    }

    public final void setMIsCircle(boolean z) {
        this.f56309b = z;
    }

    public C20547d(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C52711k.m112240b(str, "mImagePath");
        this.f56308a = str;
        this.f56309b = z;
        this.outputVideoWidth = i;
        this.outputVideoHeight = i2;
        this.f56310c = i3;
        this.f56311d = i4;
        this.f56312e = i5;
        this.f56313f = i6;
    }
}
