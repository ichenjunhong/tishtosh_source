package com.p683ss.sys.ces.p2581b;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.p683ss.sys.ces.C51393c;

/* renamed from: com.ss.sys.ces.b.d */
public final class C51392d implements Callback {

    /* renamed from: a */
    public static boolean f128500a;

    /* renamed from: b */
    private Callback f128501b;

    public C51392d(Callback callback) {
        if (callback != null) {
            this.f128501b = callback;
            f128500a = true;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            if (C51393c.m110533a() != null) {
                C51393c.m110535a(5, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f128501b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            if (C51393c.m110533a() != null) {
                C51393c.m110535a(1, keyEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f128501b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        try {
            if (C51393c.m110533a() != null) {
                C51393c.m110535a(2, keyEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f128501b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f128501b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (C51393c.m110533a() != null) {
                C51393c.m110535a(3, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f128501b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        try {
            if (C51393c.m110533a() != null) {
                C51393c.m110535a(4, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f128501b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f128501b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f128501b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f128501b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f128501b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f128501b.onCreatePanelMenu(i, menu);
    }

    public final View onCreatePanelView(int i) {
        return this.f128501b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f128501b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f128501b.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return this.f128501b.onMenuOpened(i, menu);
    }

    public final void onPanelClosed(int i, Menu menu) {
        this.f128501b.onPanelClosed(i, menu);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f128501b.onPreparePanel(i, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f128501b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f128501b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f128501b.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f128501b.onWindowFocusChanged(z);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f128501b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f128501b.onWindowStartingActionMode(callback, i);
    }
}
