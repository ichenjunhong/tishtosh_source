package android.support.p030v4.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.view.f */
public final class C1040f {

    /* renamed from: a */
    private static boolean f3323a;

    /* renamed from: b */
    private static Method f3324b;

    /* renamed from: c */
    private static boolean f3325c;

    /* renamed from: d */
    private static Field f3326d;

    /* renamed from: android.support.v4.view.f$a */
    public interface C1041a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static OnKeyListener m2970a(Dialog dialog) {
        if (!f3325c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3326d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3325c = true;
        }
        if (f3326d != null) {
            try {
                return (OnKeyListener) f3326d.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m2975a(View view, KeyEvent keyEvent) {
        return C1056u.m3040a(view, keyEvent);
    }

    /* renamed from: a */
    private static boolean m2971a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3323a) {
            try {
                f3324b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f3323a = true;
        }
        if (f3324b != null) {
            try {
                return ((Boolean) f3324b.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m2972a(Activity activity, KeyEvent keyEvent) {
        DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2971a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1056u.m3047b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: a */
    private static boolean m2973a(Dialog dialog, KeyEvent keyEvent) {
        DispatcherState dispatcherState;
        OnKeyListener a = m2970a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1056u.m3047b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: a */
    public static boolean m2974a(C1041a aVar, View view, Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2972a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2973a((Dialog) callback, keyEvent);
        }
        if ((view == null || !C1056u.m3047b(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}
