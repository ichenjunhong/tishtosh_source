package com.bytedance.ies.uikit.p697a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ies.uikit.a.b */
public final class C11066b {

    /* renamed from: a */
    public static String f29699a;

    /* renamed from: b */
    public final C11068a f29700b;

    /* renamed from: c */
    public boolean f29701c;

    /* renamed from: d */
    public boolean f29702d;

    /* renamed from: e */
    public boolean f29703e;

    /* renamed from: f */
    public boolean f29704f;

    /* renamed from: g */
    public View f29705g;

    /* renamed from: h */
    public View f29706h;

    /* renamed from: i */
    public int f29707i;

    /* renamed from: j */
    private View f29708j;

    /* renamed from: com.bytedance.ies.uikit.a.b$a */
    public static class C11068a {

        /* renamed from: a */
        public final int f29709a;

        /* renamed from: b */
        public final int f29710b;

        /* renamed from: c */
        public final boolean f29711c;

        /* renamed from: d */
        public final int f29712d;

        /* renamed from: e */
        public final int f29713e;

        /* renamed from: f */
        private final boolean f29714f;

        /* renamed from: g */
        private final boolean f29715g;

        /* renamed from: h */
        private final boolean f29716h;

        /* renamed from: i */
        private final float f29717i;

        /* renamed from: a */
        public final boolean mo20050a() {
            if (this.f29717i >= 600.0f || this.f29716h) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private static boolean m22397a(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier != 0) {
                boolean z = resources.getBoolean(identifier);
                if ("1".equals(C11066b.f29699a)) {
                    z = false;
                } else if ("0".equals(C11066b.f29699a)) {
                    z = true;
                }
                return z;
            } else if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        private static int m22396a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        private C11068a(Activity activity, boolean z, boolean z2) {
            boolean z3;
            int i;
            int i2;
            int i3;
            String str;
            Resources resources = activity.getResources();
            boolean z4 = true;
            if (resources.getConfiguration().orientation == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f29716h = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            this.f29717i = Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
            this.f29709a = m22396a(resources, "status_bar_height");
            if (VERSION.SDK_INT >= 14) {
                TypedValue typedValue = new TypedValue();
                activity.getTheme().resolveAttribute(16843499, typedValue, true);
                i = TypedValue.complexToDimensionPixelSize(typedValue.data, activity.getResources().getDisplayMetrics());
            } else {
                i = 0;
            }
            this.f29710b = i;
            Resources resources2 = activity.getResources();
            if (VERSION.SDK_INT < 14 || !m22397a(activity)) {
                i2 = 0;
            } else {
                if (this.f29716h) {
                    str = "navigation_bar_height";
                } else {
                    str = "navigation_bar_height_landscape";
                }
                i2 = m22396a(resources2, str);
            }
            this.f29712d = i2;
            Resources resources3 = activity.getResources();
            if (VERSION.SDK_INT < 14 || !m22397a(activity)) {
                i3 = 0;
            } else {
                i3 = m22396a(resources3, "navigation_bar_width");
            }
            this.f29713e = i3;
            if (this.f29712d <= 0) {
                z4 = false;
            }
            this.f29711c = z4;
            this.f29714f = z;
            this.f29715g = z2;
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                f29699a = (String) declaredMethod.invoke(null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
                f29699a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo20049a(int i) {
        if (this.f29701c) {
            this.f29705g.setBackgroundColor(i);
        }
    }

    /* JADX INFO: finally extract failed */
    public C11066b(Activity activity, View view, int i) {
        LayoutParams layoutParams;
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.f29708j = view;
        if (VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f29701c = obtainStyledAttributes.getBoolean(0, false);
                this.f29702d = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (!((attributes.flags & 67108864) == 0 && (attributes.flags & DynamicTabYellowPointVersion.DEFAULT) == 0) && (i & 1) == 0) {
                    this.f29701c = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.f29702d = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f29700b = new C11068a(activity, this.f29701c, this.f29702d);
        if (!this.f29700b.f29711c) {
            this.f29702d = false;
        }
        if (this.f29701c) {
            this.f29705g = new View(activity);
            LayoutParams layoutParams2 = new LayoutParams(-1, this.f29700b.f29709a);
            layoutParams2.gravity = 48;
            if (this.f29702d && !this.f29700b.mo20050a()) {
                layoutParams2.rightMargin = this.f29700b.f29713e;
            }
            if (view.getLayoutParams() instanceof LayoutParams) {
                ((LayoutParams) view.getLayoutParams()).topMargin = this.f29700b.f29709a;
            }
            this.f29705g.setLayoutParams(layoutParams2);
            this.f29705g.setBackgroundColor(-16777216);
            this.f29705g.setVisibility(8);
            viewGroup.addView(this.f29705g);
        }
        if (this.f29702d) {
            this.f29706h = new View(activity);
            if (this.f29700b.mo20050a()) {
                layoutParams = new LayoutParams(-1, this.f29700b.f29712d);
                layoutParams.gravity = 80;
                if (view.getLayoutParams() instanceof LayoutParams) {
                    ((LayoutParams) view.getLayoutParams()).bottomMargin = this.f29700b.f29712d;
                }
            } else {
                layoutParams = new LayoutParams(this.f29700b.f29713e, -1);
                layoutParams.gravity = 5;
            }
            this.f29706h.setLayoutParams(layoutParams);
            this.f29706h.setBackgroundColor(-16777216);
            this.f29706h.setVisibility(8);
            viewGroup.addView(this.f29706h);
        }
        this.f29707i = i;
    }
}
