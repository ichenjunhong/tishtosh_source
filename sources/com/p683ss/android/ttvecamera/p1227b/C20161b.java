package com.p683ss.android.ttvecamera.p1227b;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.os.Build;
import com.p683ss.android.ttvecamera.C20285m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.b.b */
public final class C20161b {

    /* renamed from: e */
    public static final List<String> f55426e;

    /* renamed from: a */
    protected final int f55427a = 90;

    /* renamed from: b */
    protected final float f55428b = 1.0f;

    /* renamed from: c */
    protected final float f55429c = 2.0f;

    /* renamed from: d */
    public int f55430d;

    /* renamed from: f */
    private int f55431f = 1;

    /* renamed from: g */
    private List<Area> f55432g = new ArrayList();

    /* renamed from: h */
    private List<Area> f55433h = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f55426e = arrayList;
        arrayList.add("multilaser");
        f55426e.add("ms40");
    }

    /* renamed from: a */
    private static boolean m49744a(Parameters parameters) {
        if (parameters == null || f55426e.contains(Build.BRAND.toLowerCase()) || parameters.getMaxNumFocusAreas() <= 0) {
            return false;
        }
        return true;
    }

    public C20161b(int i) {
    }

    /* renamed from: a */
    public static boolean m49743a(int i, Parameters parameters) {
        if (parameters == null || parameters.getMaxNumMeteringAreas() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo42703a(Parameters parameters, String str) {
        if (!m49744a(parameters)) {
            return false;
        }
        return parameters.getSupportedFocusModes().contains(str);
    }

    /* renamed from: a */
    public final List<Area> mo42702a(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = m49742a(i, i2, f, 90.0f, i3, i4, i5);
        if (this.f55432g.size() > 0) {
            this.f55432g.clear();
        }
        this.f55432g.add(new Area(a, 1000));
        return this.f55432g;
    }

    /* renamed from: b */
    public final List<Area> mo42704b(int i, int i2, float f, int i3, int i4, int i5) {
        Rect a = m49742a(i, i2, f, 180.0f, i3, i4, i5);
        if (this.f55433h.size() > 0) {
            this.f55433h.clear();
        }
        this.f55433h.add(new Area(a, 1000));
        return this.f55433h;
    }

    /* renamed from: a */
    private Rect m49742a(int i, int i2, float f, float f2, int i3, int i4, int i5) {
        int intValue = Float.valueOf((f * f2) + 0.5f).intValue();
        int i6 = ((int) ((((float) (i3 * 2000)) * 1.0f) / ((float) i))) - 1000;
        int i7 = ((int) ((((float) (i4 * 2000)) * 1.0f) / ((float) i2))) - 1000;
        if (this.f55430d == 1) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int a = C20285m.m50043a(i6 - i8, -1000, 1000);
        int a2 = C20285m.m50043a(i7 - i8, -1000, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) C20285m.m50042a(a + intValue), (float) C20285m.m50042a(a2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        C20285m.m50050a(i5, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = C20285m.m50042a(rect2.left);
        rect2.right = C20285m.m50042a(rect2.right);
        rect2.top = C20285m.m50042a(rect2.top);
        rect2.bottom = C20285m.m50042a(rect2.bottom);
        return rect2;
    }
}
