package com.bytedance.jirafast.p751d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.bytedance.jirafast.d.o */
public final class C12048o {
    /* renamed from: a */
    public static Activity m24505a() {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object next : ((Map) declaredField.get(invoke)).values()) {
                Class cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(next);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static int m24504a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return context.getResources().getDisplayMetrics().heightPixels;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            return point.y;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static int m24506b(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return context.getResources().getDisplayMetrics().widthPixels;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static float m24503a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
