package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.FixedEditText */
public class FixedEditText extends MentionEditText {

    /* renamed from: c */
    private OnKeyListener f87479c;

    public static String getManufacturer() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    public FixedEditText(Context context) {
        super(context);
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        this.f87479c = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public ActionMode startActionMode(Callback callback) {
        return super.startActionMode(callback);
    }

    public boolean onTextContextMenuItem(int i) {
        if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (onTextContextMenuItem && getText().length() <= 1024) {
            C29408b.m69342a((TextView) this);
        }
        return onTextContextMenuItem;
    }

    public FixedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.f87479c != null) {
            return this.f87479c.onKey(this, i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public ActionMode startActionMode(Callback callback, int i) {
        return super.startActionMode(callback, i);
    }

    public FixedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
