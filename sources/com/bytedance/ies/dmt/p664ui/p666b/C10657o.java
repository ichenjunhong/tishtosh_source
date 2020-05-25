package com.bytedance.ies.dmt.p664ui.p666b;

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
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.dmt.ui.b.o */
public final class C10657o implements Callback {

    /* renamed from: a */
    public C10658a f28312a;

    /* renamed from: b */
    public final Callback f28313b;

    /* renamed from: com.bytedance.ies.dmt.ui.b.o$a */
    public interface C10658a {
        /* renamed from: a */
        void mo18949a(boolean z);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f28313b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f28313b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f28313b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f28313b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f28313b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f28313b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f28313b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f28313b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f28313b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f28313b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f28313b.onCreatePanelMenu(i, menu);
    }

    public final View onCreatePanelView(int i) {
        return this.f28313b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f28313b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f28313b.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return this.f28313b.onMenuOpened(i, menu);
    }

    public final void onPanelClosed(int i, Menu menu) {
        this.f28313b.onPanelClosed(i, menu);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f28313b.onPreparePanel(i, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f28313b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f28313b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f28313b.onWindowAttributesChanged(layoutParams);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f28313b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f28313b.onWindowStartingActionMode(callback, i);
    }

    public C10657o(Callback callback) {
        C52711k.m112240b(callback, "callback");
        this.f28313b = callback;
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f28313b.onWindowFocusChanged(z);
        C10658a aVar = this.f28312a;
        if (aVar != null) {
            aVar.mo18949a(z);
        }
    }
}
