package com.p683ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.OcrLocation;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c.C45884a;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.a */
public final class C30360a {

    /* renamed from: a */
    protected static int f79278a;

    /* renamed from: b */
    protected static int f79279b;

    /* renamed from: c */
    public static int f79280c;

    /* renamed from: f */
    private static int f79281f;

    /* renamed from: g */
    private static int f79282g;

    /* renamed from: d */
    public int f79283d = -1;

    /* renamed from: e */
    public int f79284e = -1;

    /* renamed from: a */
    public static int m71255a() {
        return f79281f;
    }

    /* renamed from: a */
    public final void mo60786a(Context context, Aweme aweme, View view, View view2) {
        if (aweme == null) {
            C32458a.m75143a((Exception) new NullPointerException("aweme is null"));
        } else if (aweme.isVr()) {
            m71266b(view, -1, -1);
            m71266b(view2, -1, -1);
        } else if (aweme.getVideo() != null) {
            mo60787a(context, aweme.getVideo(), view, view2, aweme.getOcrLocation());
        }
    }

    /* renamed from: a */
    public final void mo60787a(Context context, Video video, View view, View view2, OcrLocation ocrLocation) {
        if (video != null) {
            if (C22453b.m55510c()) {
                m71258a(context, view, video.getWidth(), video.getHeight(), true, ocrLocation);
                m71258a(context, view2, video.getWidth(), video.getHeight(), true, ocrLocation);
                return;
            }
            m71257a(context, view, video.getWidth(), video.getHeight(), true);
            m71257a(context, view2, video.getWidth(), video.getHeight(), true);
        }
    }

    /* renamed from: a */
    public final void mo60788a(Context context, Video video, View view, OcrLocation ocrLocation) {
        if (video != null) {
            if (C22453b.m55510c()) {
                m71258a(context, view, video.getWidth(), video.getHeight(), true, ocrLocation);
                return;
            }
            m71257a(context, view, video.getWidth(), video.getHeight(), true);
        }
    }

    /* renamed from: a */
    public void mo60785a(Context context, View view, int i, int i2, boolean z, C45884a aVar, OcrLocation ocrLocation) {
        if (VERSION.SDK_INT >= 17) {
            if (f79279b == 0 || f79278a == 0) {
                m71265b(context);
            }
            int i3 = C22453b.m55505a().f60470f;
            double d = (double) f79278a;
            double d2 = (double) f79279b;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d / d2 <= 0.5d) {
                m71267b(view, i, i2, z, i3, f79278a, aVar);
                return;
            }
            double d3 = (double) f79278a;
            double d4 = (double) f79279b;
            Double.isNaN(d3);
            Double.isNaN(d4);
            if (d3 / d4 >= 0.6666666666666666d) {
                m71260a(view, i, i2, f79278a, f79279b, aVar);
                return;
            }
            m71262a(view, i, i2, z, i3, f79278a, aVar);
        }
    }

    /* renamed from: c */
    private int m71268c() {
        return m71269d() - C22453b.m55505a().f60467c;
    }

    /* renamed from: b */
    private int m71264b() {
        return (m71269d() - C22453b.m55505a().mo46745b()) - C22453b.m55505a().f60469e;
    }

    /* renamed from: d */
    private static int m71269d() {
        if (VERSION.SDK_INT < 28 || !C22453b.m55505a().f60474l) {
            return f79282g;
        }
        return f79279b;
    }

    /* renamed from: a */
    public static void m71256a(Context context) {
        try {
            f79281f = C9432q.m18695e(context);
            f79280c = C23724k.m58227d();
            m71265b(context);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m71265b(Context context) {
        if (VERSION.SDK_INT >= 17) {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f79282g = displayMetrics.heightPixels;
            f79279b = displayMetrics.heightPixels + f79281f;
            f79278a = displayMetrics.widthPixels;
            return;
        }
        int b = C9432q.m18688b(context);
        f79282g = b;
        f79279b = b;
        f79278a = C9432q.m18670a(context);
    }

    /* renamed from: a */
    private static void m71259a(View view, int i, int i2) {
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width != i2 || marginLayoutParams.height != i || VERSION.SDK_INT < 19) {
                marginLayoutParams.width = i2;
                marginLayoutParams.height = i;
                view.setLayoutParams(marginLayoutParams);
                view.setRotation(0.0f);
            }
        }
    }

    /* renamed from: b */
    private static void m71266b(View view, int i, int i2) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new LayoutParams(0, 0));
        }
        if (view.getLayoutParams().width != -1 || view.getLayoutParams().height != -1) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public static boolean m71263a(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i3;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        try {
            double parseDouble = Double.parseDouble(C2240a.m6772a("%.2f", new Object[]{Double.valueOf(d3)}));
            double parseDouble2 = Double.parseDouble(C2240a.m6772a("%.2f", new Object[]{Double.valueOf(d6)}));
            if (d3 <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || parseDouble2 <= ProfileUiInitOptimizeEnterThreshold.DEFAULT || parseDouble == parseDouble2) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m71261a(View view, int i, int i2, boolean z, int i3) {
        m71259a(view, i, i2);
    }

    /* renamed from: a */
    private void m71257a(Context context, View view, int i, int i2, boolean z) {
        mo60784a(context, view, i, i2, true, (C45884a) null);
    }

    /* renamed from: a */
    private void m71258a(Context context, View view, int i, int i2, boolean z, OcrLocation ocrLocation) {
        mo60785a(context, view, i, i2, true, (C45884a) null, ocrLocation);
    }

    /* renamed from: a */
    private void m71260a(View view, int i, int i2, int i3, int i4, C45884a aVar) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (d / d2 > 1.0d) {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i2 * i3) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i3 = i4;
        } else {
            i3 = (i * i4) / i2;
        }
        if (aVar != null) {
            aVar.f115899a = i3;
            aVar.f115900b = i4;
        }
        m71259a(view, i4, i3);
    }

    /* renamed from: a */
    public final void mo60784a(Context context, View view, int i, int i2, boolean z, C45884a aVar) {
        int i3;
        if (VERSION.SDK_INT >= 17) {
            if (f79279b == 0 || f79278a == 0) {
                m71265b(context);
            }
            double d = (double) f79278a;
            double d2 = (double) f79279b;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            int i4 = 0;
            if (d3 <= 0.5d) {
                if (C22453b.m55505a().f60468d != 0) {
                    i3 = C22453b.m55505a().f60470f;
                    if (i3 == 0) {
                        i3 = m71269d() - C22453b.m55505a().f60467c;
                    } else {
                        i4 = 1;
                    }
                } else if (C22453b.m55505a().f60473k) {
                    i3 = m71264b();
                } else {
                    i3 = m71268c();
                }
                if (i4 == 0 && !C22453b.m55505a().f60471g) {
                    i3 -= C22453b.m55505a().f60468d;
                }
                m71267b(view, i, i2, z, i3, f79278a, aVar);
            } else if (d3 >= 0.6666666666666666d) {
                m71260a(view, i, i2, f79278a, f79279b, aVar);
            } else {
                int i5 = f79282g;
                if (C22453b.m55505a().f60473k) {
                    i4 = C22453b.m55505a().mo46745b();
                }
                m71262a(view, i, i2, z, (i5 - i4) - C22453b.m55505a().f60467c, f79278a, aVar);
            }
        }
    }

    /* renamed from: b */
    private void m71267b(View view, int i, int i2, boolean z, int i3, int i4, C45884a aVar) {
        int i5;
        int i6;
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.625d || d6 > 0.625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i6 = i4;
            } else {
                i6 = (i2 * i4) / i;
            }
            i5 = i6;
        } else {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i * i3) / i2;
            }
            i5 = i3;
        }
        int i7 = i4;
        if (aVar != null) {
            aVar.f115899a = i7;
            aVar.f115900b = i5;
        }
        this.f79283d = i5;
        this.f79284e = i7;
        if (view != null) {
            m71261a(view, i5, i7, z, i3);
        }
    }

    /* renamed from: a */
    private void m71262a(View view, int i, int i2, boolean z, int i3, int i4, C45884a aVar) {
        int i5;
        int i6;
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.5625d || d6 > 0.5625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i6 = i4;
            } else {
                i6 = (i2 * i4) / i;
            }
            i5 = i6;
        } else {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i * i3) / i2;
            }
            i5 = i3;
        }
        int i7 = i4;
        if (aVar != null) {
            aVar.f115899a = i7;
            aVar.f115900b = i5;
        }
        this.f79284e = i7;
        this.f79283d = i5;
        if (view != null) {
            m71261a(view, i5, i7, z, i3);
        }
    }
}
