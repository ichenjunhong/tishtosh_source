package android.support.design.p027e;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.p030v4.graphics.C0803a;
import android.util.StateSet;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.design.e.a */
public final class C0424a {

    /* renamed from: a */
    public static final boolean f1373a;

    /* renamed from: b */
    private static final int[] f1374b = {16842919};

    /* renamed from: c */
    private static final int[] f1375c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f1376d = {16842908};

    /* renamed from: e */
    private static final int[] f1377e = {16843623};

    /* renamed from: f */
    private static final int[] f1378f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f1379g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f1380h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f1381i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f1382j = {16842913};

    static {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f1373a = z;
    }

    /* renamed from: a */
    private static int m1034a(int i) {
        return C0803a.m2298b(i, Math.min(Color.alpha(i) * 2, NormalGiftView.ALPHA_255));
    }

    /* renamed from: a */
    public static ColorStateList m1036a(ColorStateList colorStateList) {
        if (f1373a) {
            return new ColorStateList(new int[][]{f1382j, StateSet.NOTHING}, new int[]{m1035a(colorStateList, f1378f), m1035a(colorStateList, f1374b)});
        }
        return new ColorStateList(new int[][]{f1378f, f1379g, f1380h, f1381i, f1382j, f1374b, f1375c, f1376d, f1377e, StateSet.NOTHING}, new int[]{m1035a(colorStateList, f1378f), m1035a(colorStateList, f1379g), m1035a(colorStateList, f1380h), m1035a(colorStateList, f1381i), 0, m1035a(colorStateList, f1374b), m1035a(colorStateList, f1375c), m1035a(colorStateList, f1376d), m1035a(colorStateList, f1377e), 0});
    }

    /* renamed from: a */
    private static int m1035a(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f1373a) {
            return m1034a(i);
        }
        return i;
    }
}
