package android.support.p030v4.widget;

import android.os.Build.VERSION;

/* renamed from: android.support.v4.widget.b */
public interface C1095b {

    /* renamed from: a */
    public static final boolean f3483a;

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i);

    static {
        boolean z;
        if (VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        f3483a = z;
    }
}
