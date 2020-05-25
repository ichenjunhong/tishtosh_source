package com.p683ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import com.p683ss.android.sdk.activity.SSActivity;

/* renamed from: com.ss.android.ugc.aweme.base.activity.c */
public final class C23424c {

    /* renamed from: a */
    public static final int bk = 2131034269;

    /* renamed from: b */
    public static final int by = 2131034281;

    /* renamed from: c */
    public static final int bm = 2131034271;

    /* renamed from: d */
    public static final int bv = 2131034278;

    /* renamed from: e */
    public static final int bl = 2131034270;

    /* renamed from: f */
    public static final int bz = 2131034282;

    /* renamed from: g */
    public static final int bo = 2131034273;

    /* renamed from: h */
    public static final int bx = 2131034280;

    /* renamed from: i */
    public static final int q = 2131034154;

    /* renamed from: j */
    public static final int r = 2131034155;

    /* renamed from: a */
    public static void m57556a(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = bm;
                i2 = bv;
                break;
            case 1:
                break;
            case 2:
                i3 = bo;
                i2 = bx;
                break;
            case 3:
                i3 = q;
                break;
            case 4:
                i3 = bk;
                i2 = by;
                break;
            default:
                i3 = bm;
                i2 = bv;
                break;
        }
        i2 = 0;
        if (activity instanceof SSActivity) {
            ((SSActivity) activity).mo41130a(i3, i2);
        } else {
            activity.overridePendingTransition(i3, i2);
        }
    }

    /* renamed from: b */
    public static void m57557b(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = bk;
                i2 = by;
                break;
            case 1:
                i2 = 0;
                break;
            case 2:
                i3 = bl;
                i2 = bz;
                break;
            case 3:
                i2 = r;
                break;
            case 4:
                i3 = bm;
                i2 = bv;
                break;
            default:
                i3 = bk;
                i2 = by;
                break;
        }
        if (activity instanceof SSActivity) {
            ((SSActivity) activity).mo41130a(i3, i2);
        } else {
            activity.overridePendingTransition(i3, i2);
        }
    }
}
