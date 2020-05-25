package android.support.p043v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.view.i */
public class C1230i implements Callback {

    /* renamed from: b */
    final Callback f4088b;

    public void onAttachedToWindow() {
        this.f4088b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f4088b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f4088b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f4088b.onSearchRequested();
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4088b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4088b.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f4088b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4088b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4088b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4088b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f4088b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f4088b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i) {
        return this.f4088b.onCreatePanelView(i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f4088b.onPointerCaptureChanged(z);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f4088b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f4088b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f4088b.onWindowStartingActionMode(callback);
    }

    public C1230i(Callback callback) {
        if (callback != null) {
            this.f4088b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4088b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f4088b.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4088b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f4088b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f4088b.onPanelClosed(i, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f4088b.onWindowStartingActionMode(callback, i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f4088b.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f4088b.onProvideKeyboardShortcuts(list, menu, i);
    }
}
