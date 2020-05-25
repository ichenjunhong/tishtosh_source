package android.support.p030v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0765c;
import android.support.p030v4.p037e.C0765c.C0766a;
import android.support.p030v4.p037e.C0765c.C0766a.C0767a;
import android.support.p030v4.p038f.C0799m;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.o */
public final class C1115o {

    /* renamed from: a */
    private static Field f3551a;

    /* renamed from: b */
    private static boolean f3552b;

    /* renamed from: c */
    private static Field f3553c;

    /* renamed from: d */
    private static boolean f3554d;

    /* renamed from: android.support.v4.widget.o$a */
    static class C1116a implements Callback {

        /* renamed from: a */
        private final Callback f3555a;

        /* renamed from: b */
        private final TextView f3556b;

        /* renamed from: c */
        private Class f3557c;

        /* renamed from: d */
        private Method f3558d;

        /* renamed from: e */
        private boolean f3559e;

        /* renamed from: f */
        private boolean f3560f;

        /* renamed from: a */
        private static Intent m3266a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f3555a.onDestroyActionMode(actionMode);
        }

        C1116a(Callback callback, TextView textView) {
            this.f3555a = callback;
            this.f3556b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3555a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3555a.onCreateActionMode(actionMode, menu);
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Method method;
            boolean z;
            boolean z2;
            Context context = this.f3556b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3560f) {
                this.f3560f = true;
                try {
                    this.f3557c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3558d = this.f3557c.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f3559e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3557c = null;
                    this.f3558d = null;
                    this.f3559e = false;
                }
            }
            try {
                if (!this.f3559e || !this.f3557c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f3558d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m3266a(), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName) && (!resolveInfo.activityInfo.exported || !(resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                    MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                    TextView textView = this.f3556b;
                    Intent a = m3266a();
                    String str = "android.intent.extra.PROCESS_TEXT_READONLY";
                    if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    add.setIntent(a.putExtra(str, !z).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f3555a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    private static Field m3255a(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static Drawable[] m3261b(TextView textView) {
        if (VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: a */
    public static int m3252a(TextView textView) {
        if (VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f3554d) {
            f3553c = m3255a("mMaxMode");
            f3554d = true;
        }
        if (f3553c != null && m3253a(f3553c, textView) == 1) {
            if (!f3552b) {
                f3551a = m3255a("mMaximum");
                f3552b = true;
            }
            if (f3551a != null) {
                return m3253a(f3551a, textView);
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static C0766a m3262c(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (VERSION.SDK_INT >= 28) {
            return new C0766a(textView.getTextMetricsParams());
        }
        C0767a aVar = new C0767a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.f2650c = textView.getBreakStrategy();
            aVar.f2651d = textView.getHyphenationFrequency();
        }
        if (VERSION.SDK_INT >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else {
                boolean z = false;
                if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
                    if (textView.getLayoutDirection() == 1) {
                        z = true;
                    }
                    switch (textView.getTextDirection()) {
                        case 2:
                            textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            break;
                        case 3:
                            textDirectionHeuristic = TextDirectionHeuristics.LTR;
                            break;
                        case 4:
                            textDirectionHeuristic = TextDirectionHeuristics.RTL;
                            break;
                        case 5:
                            textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            break;
                        case 6:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        case 7:
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        default:
                            if (!z) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                break;
                            } else {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                                break;
                            }
                    }
                } else {
                    byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                    if (directionality == 1 || directionality == 2) {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    }
                }
            }
            aVar.f2649b = textDirectionHeuristic;
        }
        return new C0766a(aVar.f2648a, aVar.f2649b, aVar.f2650c, aVar.f2651d);
    }

    /* renamed from: a */
    private static int m3253a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static Callback m3254a(TextView textView, Callback callback) {
        if (VERSION.SDK_INT < 26 || VERSION.SDK_INT > 27 || (callback instanceof C1116a)) {
            return callback;
        }
        return new C1116a(callback, textView);
    }

    /* renamed from: b */
    public static void m3260b(TextView textView, int i) {
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (textView instanceof C1095b) {
            ((C1095b) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: e */
    public static void m3265e(TextView textView, int i) {
        C0799m.m2266a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    public static void m3256a(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: c */
    public static void m3263c(TextView textView, int i) {
        int i2;
        C0799m.m2266a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: d */
    public static void m3264d(TextView textView, int i) {
        int i2;
        C0799m.m2266a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: a */
    public static void m3259a(TextView textView, C0765c cVar) {
        PrecomputedText precomputedText;
        if (VERSION.SDK_INT >= 28) {
            if (cVar.f2640a instanceof PrecomputedText) {
                precomputedText = (PrecomputedText) cVar.f2640a;
            } else {
                precomputedText = null;
            }
            textView.setText(precomputedText);
        } else if (m3262c(textView).equals(cVar.f2641b)) {
            textView.setText(cVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: a */
    public static void m3257a(TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 2);
            return;
        }
        if (textView instanceof C1095b) {
            ((C1095b) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 2);
        }
    }

    /* renamed from: a */
    public static void m3258a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5;
        if (VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                drawable5 = drawable3;
            } else {
                drawable5 = drawable;
            }
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }
}
