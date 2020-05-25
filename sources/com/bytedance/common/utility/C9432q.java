package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.common.utility.q */
public final class C9432q {

    /* renamed from: a */
    public static final boolean f25675a;

    /* renamed from: b */
    public static C9434a f25676b = new C9434a();

    /* renamed from: c */
    private static C9435b f25677c;

    /* renamed from: d */
    private static String f25678d = "";

    /* renamed from: e */
    private static int f25679e = -1;

    /* renamed from: com.bytedance.common.utility.q$a */
    public static class C9434a {
    }

    /* renamed from: com.bytedance.common.utility.q$b */
    public interface C9435b {
        /* renamed from: a */
        boolean mo17069a(Context context, int i, CharSequence charSequence, long j, int i2);
    }

    /* renamed from: a */
    public static void m18672a(Context context, int i) {
        C9436r.m18697a(context, i);
    }

    /* renamed from: a */
    private static boolean m18685a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: a */
    public static boolean m18684a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static void m18679a(View view, int i, int i2) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != i || layoutParams.height != i2)) {
                if (i != -3) {
                    layoutParams.width = i;
                }
                if (i2 != -3) {
                    layoutParams.height = i2;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m18680a(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof MarginLayoutParams)) {
                m18681a(view, (MarginLayoutParams) layoutParams, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    private static void m18681a(View view, MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null && (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4)) {
            if (i != -3) {
                marginLayoutParams.leftMargin = i;
            }
            if (i2 != -3) {
                marginLayoutParams.topMargin = i2;
            }
            if (i3 != -3) {
                marginLayoutParams.rightMargin = i3;
            }
            if (i4 != -3) {
                marginLayoutParams.bottomMargin = i4;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public static void m18682a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public static boolean m18686a(View view) {
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        view.clearAnimation();
        return true;
    }

    /* renamed from: a */
    public static void m18683a(boolean z, View view, OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
            view.setClickable(true);
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f25675a = z;
    }

    /* renamed from: d */
    public static int m18694d(Context context) {
        if (f25679e == -1 && context != null) {
            f25679e = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return f25679e;
    }

    /* renamed from: e */
    public static final int m18695e(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* renamed from: a */
    public static final int m18670a(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m18688b(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static String m18693c(Context context) {
        if (C9431p.m18664a(f25678d) && context != null) {
            int a = m18670a(context);
            int b = m18688b(context);
            if (a > 0 && b > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("*");
                sb.append(b);
                f25678d = sb.toString();
            }
        }
        return f25678d;
    }

    /* renamed from: a */
    public static float m18669a(Context context, float f) {
        if (context != null) {
            return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m18687b(Context context, float f) {
        if (context != null) {
            return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static int m18692c(Context context, float f) {
        if (context != null) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m18671a(Activity activity, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            activity.setRequestedOrientation(z ^ true ? 1 : 0);
            if (z) {
                activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                activity.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    /* renamed from: b */
    public static final void m18691b(View view, int i) {
        if (view != null && view.getVisibility() != i && m18685a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m18676a(Context context, String str) {
        m18690b(context, 0, str);
    }

    /* renamed from: a */
    public static void m18677a(View view, float f) {
        if (view != null) {
            m18680a(view, -3, (int) TypedValue.applyDimension(1, f, view.getContext().getResources().getDisplayMetrics()), -3, -3);
        }
    }

    /* renamed from: a */
    public static void m18678a(View view, int i) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundResource(i);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* renamed from: a */
    public static void m18673a(Context context, int i, int i2) {
        m18690b(context, i, context.getString(i2));
    }

    /* renamed from: b */
    public static void m18690b(Context context, int i, String str) {
        m18675a(context, i, str, 0, 17);
    }

    /* renamed from: a */
    public static void m18674a(Context context, int i, String str) {
        m18690b(context, (int) R.drawable.b6s, str);
    }

    /* renamed from: b */
    public static void m18689b(Context context, int i, int i2) {
        m18675a(context, 0, context.getString(i), 0, i2);
    }

    /* renamed from: a */
    public static void m18675a(Context context, int i, String str, int i2, int i3) {
        if (context != null && !C9431p.m18664a(str)) {
            if (!m18684a()) {
                Handler handler = new Handler(Looper.getMainLooper());
                final Context context2 = context;
                final int i4 = i;
                final String str2 = str;
                final int i5 = i2;
                final int i6 = i3;
                C94331 r2 = new Runnable() {
                    public final void run() {
                        C9432q.m18675a(context2, i4, str2, i5, i6);
                    }
                };
                handler.post(r2);
                return;
            }
            if (f25677c != null) {
                if (f25677c.mo17069a(context, i, str, (long) i2, i3)) {
                    return;
                }
            }
            if (!(context instanceof C9406f)) {
                try {
                    Toast makeText = Toast.makeText(context, str, i2);
                    if (makeText != null) {
                        makeText.setGravity(i3, 0, 0);
                        C9436r.m18698a(makeText);
                    }
                } catch (Exception e) {
                    C9415i.m18634a((Throwable) e);
                }
            } else if (i2 == 1) {
                ((C9406f) context).showCustomLongToast(i, str);
            } else {
                C9406f fVar = (C9406f) context;
                if (i2 == 0) {
                    i2 = 2000;
                }
                fVar.showCustomToast(i, str, i2, i3);
            }
        }
    }
}
