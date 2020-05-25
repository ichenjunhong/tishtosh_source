package com.p683ss.android.ugc.asve.recorder.reaction.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.b */
public final class C20545b extends C20547d {
    public final int convertDpToHeight(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertDpToWidth(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertHeightToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public final int convertWidthToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public C20545b(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        String str2 = str;
        C52711k.m112240b(str, "mImagePath");
        super(str2, true, i, i2, i3, i4, i5, i6);
    }
}
