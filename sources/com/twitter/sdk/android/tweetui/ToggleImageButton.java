package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.ss.android.ugc.trill.R;

public class ToggleImageButton extends ImageButton {

    /* renamed from: e */
    private static final int[] f130121e = {R.attr.a3h};

    /* renamed from: a */
    public boolean f130122a;

    /* renamed from: b */
    String f130123b;

    /* renamed from: c */
    String f130124c;

    /* renamed from: d */
    final boolean f130125d;

    public boolean performClick() {
        if (this.f130125d) {
            setToggledOn(!this.f130122a);
        }
        return super.performClick();
    }

    public ToggleImageButton(Context context) {
        this(context, null);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f130122a) {
            mergeDrawableStates(onCreateDrawableState, f130121e);
        }
        return onCreateDrawableState;
    }

    public void setToggledOn(boolean z) {
        String str;
        this.f130122a = z;
        if (z) {
            str = this.f130123b;
        } else {
            str = this.f130124c;
        }
        setContentDescription(str);
        refreshDrawableState();
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ToggleImageButton(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            r0 = 0
            android.content.res.Resources$Theme r4 = r4.getTheme()     // Catch:{ all -> 0x0044 }
            r1 = 4
            int[] r1 = new int[r1]     // Catch:{ all -> 0x0044 }
            r1 = {2131362110, 2131362111, 2131362949, 2131363088} // fill-array     // Catch:{ all -> 0x0044 }
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r6, r2)     // Catch:{ all -> 0x0044 }
            r5 = 1
            java.lang.String r6 = r4.getString(r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x0024
            java.lang.CharSequence r6 = r3.getContentDescription()     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0042 }
        L_0x0024:
            r3.f130123b = r6     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x002f
            java.lang.CharSequence r6 = r3.getContentDescription()     // Catch:{ all -> 0x0042 }
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0042 }
        L_0x002f:
            r3.f130124c = r0     // Catch:{ all -> 0x0042 }
            r6 = 3
            boolean r5 = r4.getBoolean(r6, r5)     // Catch:{ all -> 0x0042 }
            r3.f130125d = r5     // Catch:{ all -> 0x0042 }
            r3.setToggledOn(r2)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0041
            r4.recycle()
            return
        L_0x0041:
            return
        L_0x0042:
            r5 = move-exception
            goto L_0x0046
        L_0x0044:
            r5 = move-exception
            r4 = r0
        L_0x0046:
            if (r4 == 0) goto L_0x004b
            r4.recycle()
        L_0x004b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetui.ToggleImageButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
