package com.p683ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.p1416g.C23534b;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.p */
public final class C23729p {

    /* renamed from: a */
    private static OnTouchListener f63260a = C23733r.f63265a;

    /* renamed from: a */
    public static OnTouchListener m58253a() {
        return C23732q.f63264a;
    }

    /* renamed from: a */
    public static void m58257a(View view, int i) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m58261a(boolean z, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* renamed from: a */
    public static boolean m58262a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    public static void m58260a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                }
            } else if (!textView.getText().equals(charSequence)) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    private static void m58258a(Window window) {
        if (window != null) {
            try {
                window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
                if (VERSION.SDK_INT < 19) {
                    window.getDecorView().setSystemUiVisibility(8);
                    return;
                }
                if (VERSION.SDK_INT >= 19) {
                    window.getDecorView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m58259a(TextView textView, int i) {
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            StringBuilder sb = new StringBuilder();
            sb.append(textView.getText().toString());
            sb.append("#");
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            C23534b bVar = new C23534b(textView.getContext(), R.drawable.cfg, 1);
            bVar.f62655a = (int) C9432q.m18687b(textView.getContext(), (float) (m58266b(textView.getContext()) ? -4 : 4));
            spannableStringBuilder.setSpan(bVar, sb2.length() - 1, sb2.length(), 18);
            textView.setText(spannableStringBuilder, BufferType.SPANNABLE);
        }
    }

    /* renamed from: a */
    public static Activity m58248a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: c */
    public static void m58269c(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
    }

    /* renamed from: d */
    public static Activity m58270d(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: b */
    public static void m58263b(Activity activity) {
        Window window = activity.getWindow();
        if (VERSION.SDK_INT < 21) {
            if (VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
            }
        } else if (window.getStatusBarColor() != 0) {
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: c */
    public static Rect m58268c(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: e */
    private static boolean m58271e(View view) {
        if (view == null || !C1056u.m3018B(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m58266b(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m58267b(View view) {
        Rect rect = new Rect();
        if (!m58271e(view) || !view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m58254a(Activity activity) {
        m58258a(activity.getWindow());
    }

    /* renamed from: a */
    public static void m58256a(Dialog dialog) {
        if (dialog != null) {
            m58258a(dialog.getWindow());
        }
    }

    /* renamed from: a */
    private static Drawable m58250a(int i, float[] fArr) {
        return m58251a(i, fArr, -1, 0);
    }

    /* renamed from: a */
    public static int m58247a(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public static void m58264b(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public static void m58265b(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            m58257a(view, i);
        }
    }

    /* renamed from: a */
    public static Drawable m58249a(int i, float f) {
        return m58250a(i, new float[]{f, f, f, f});
    }

    /* renamed from: a */
    public static void m58255a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C11065a.m22392a(activity, i);
        }
    }

    /* renamed from: a */
    public static GradientDrawable m58252a(Orientation orientation, int i, int i2) {
        return new GradientDrawable(orientation, new int[]{i, i2});
    }

    /* renamed from: a */
    private static Drawable m58251a(int i, float[] fArr, int i2, int i3) {
        float[] fArr2 = fArr != null ? new float[]{fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        C237301 r4 = new GradientDrawable() {
            public final int getOpacity() {
                return -3;
            }
        };
        r4.setColor(i);
        r4.setCornerRadii(fArr2);
        return r4;
    }
}
