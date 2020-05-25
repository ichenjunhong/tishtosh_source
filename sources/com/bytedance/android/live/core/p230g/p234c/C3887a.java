package com.bytedance.android.live.core.p230g.p234c;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.live.core.g.c.a */
public final class C3887a {
    /* renamed from: a */
    public static void m9823a(Window window) {
        if (window != null && VERSION.SDK_INT >= 19 && !m9826b(window, true) && !m9824a(window, true) && VERSION.SDK_INT >= 23) {
            m9827c(window, true);
        }
    }

    /* renamed from: c */
    public static boolean m9828c(Window window) {
        if (window == null) {
            return false;
        }
        LayoutParams attributes = window.getAttributes();
        if ((window.getDecorView().getSystemUiVisibility() & PreloadTask.BYTE_UNIT_NUMBER) == 0 && (attributes.flags & 67108864) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m9825b(Window window) {
        char c;
        if (window != null) {
            if (C3888b.f10897a == null) {
                String str = "";
                if (C3888b.f10897a == null) {
                    if (!TextUtils.isEmpty(C3888b.m9830a("ro.miui.ui.version.name"))) {
                        C3888b.f10898b = C3888b.m9830a("ro.miui.ui.version.name");
                        C3888b.f10897a = "MIUI";
                    } else if (!TextUtils.isEmpty(C3888b.m9830a("ro.build.version.emui"))) {
                        C3888b.f10898b = C3888b.m9830a("ro.build.version.emui");
                        C3888b.f10897a = "EMUI";
                    } else if (!TextUtils.isEmpty(C3888b.m9830a("ro.build.version.opporom"))) {
                        C3888b.f10898b = C3888b.m9830a("ro.build.version.opporom");
                        C3888b.f10897a = "OPPO";
                    } else if (!TextUtils.isEmpty(C3888b.m9830a("ro.vivo.os.version"))) {
                        C3888b.f10898b = C3888b.m9830a("ro.vivo.os.version");
                        C3888b.f10897a = "VIVO";
                    } else if (!TextUtils.isEmpty(C3888b.m9830a("ro.smartisan.version"))) {
                        C3888b.f10898b = C3888b.m9830a("ro.smartisan.version");
                        C3888b.f10897a = "SMARTISAN";
                    } else {
                        String str2 = Build.DISPLAY;
                        C3888b.f10898b = str2;
                        if (str2.toUpperCase().contains("FLYME")) {
                            C3888b.f10897a = "FLYME";
                        } else {
                            C3888b.f10898b = "unknown";
                            C3888b.f10897a = Build.MANUFACTURER.toUpperCase();
                        }
                    }
                }
                C3888b.f10897a.equals(str);
            }
            String str3 = C3888b.f10897a;
            if ("MIUI".equals(str3)) {
                c = 1;
            } else if ("FLYME".equals(str3)) {
                c = 2;
            } else {
                c = 3;
            }
            if (window != null) {
                if (c == 1) {
                    m9826b(window, false);
                } else if (c == 2) {
                    m9824a(window, false);
                } else if (c == 3) {
                    m9827c(window, false);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m9827c(Window window, boolean z) {
        int i;
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    private static boolean m9824a(Window window, boolean z) {
        int i;
        if (window != null) {
            try {
                LayoutParams attributes = window.getAttributes();
                Field declaredField = LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i2 = declaredField.getInt(null);
                int i3 = declaredField2.getInt(attributes);
                if (z) {
                    i = i3 | i2;
                } else {
                    i = (i2 ^ -1) & i3;
                }
                declaredField2.setInt(attributes, i);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m9826b(Window window, boolean z) {
        if (window != null) {
            Class cls = window.getClass();
            try {
                Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
                if (z) {
                    method.invoke(window, new Object[]{Integer.valueOf(i), Integer.valueOf(i)});
                } else {
                    method.invoke(window, new Object[]{Integer.valueOf(0), Integer.valueOf(i)});
                }
                if (VERSION.SDK_INT < 23) {
                    return true;
                }
                if (z) {
                    window.getDecorView().setSystemUiVisibility(VideoCacheReadBuffersizeExperiment.DEFAULT);
                    return true;
                }
                window.getDecorView().setSystemUiVisibility(0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
