package com.p683ss.android.ugc.aweme.p1308ad.p1314e;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.ad.e.b */
public final class C22398b implements Serializable {

    /* renamed from: a */
    private String f60322a;

    /* renamed from: b */
    private String f60323b;

    /* renamed from: c */
    private String f60324c;

    /* renamed from: d */
    private String f60325d;

    /* renamed from: e */
    private int f60326e;

    /* renamed from: f */
    private float f60327f;

    /* renamed from: g */
    private boolean f60328g;

    /* renamed from: h */
    private boolean f60329h;

    public final String getAdMoreTextual() {
        return this.f60325d;
    }

    public final String getBgColor() {
        return this.f60323b;
    }

    public final String getLabelName() {
        return this.f60322a;
    }

    public final int getLabelType() {
        return this.f60326e;
    }

    public final float getShowSeconds() {
        return this.f60327f;
    }

    public final String getTextColor() {
        return this.f60324c;
    }

    public final boolean isAd() {
        return this.f60328g;
    }

    public final boolean isRightStyle() {
        return this.f60329h;
    }

    public final boolean isAdHollowText() {
        if (TextUtils.isEmpty(this.f60324c) || !this.f60324c.endsWith("00000000")) {
            return false;
        }
        return true;
    }

    public final void setAd(boolean z) {
        this.f60328g = z;
    }

    public final void setAdMoreTextual(String str) {
        this.f60325d = str;
    }

    public final void setBgColor(String str) {
        this.f60323b = str;
    }

    public final void setLabelName(String str) {
        this.f60322a = str;
    }

    public final void setLabelType(int i) {
        this.f60326e = i;
    }

    public final void setRightStyle(boolean z) {
        this.f60329h = z;
    }

    public final void setShowSeconds(float f) {
        this.f60327f = f;
    }

    public final void setTextColor(String str) {
        this.f60324c = str;
    }
}
