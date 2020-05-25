package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView */
public class KeyboardShadowView extends View {

    /* renamed from: a */
    private Activity f15512a;

    /* renamed from: b */
    private boolean f15513b;

    /* renamed from: c */
    private boolean f15514c;

    /* renamed from: d */
    private int f15515d;

    /* renamed from: e */
    private C5912a f15516e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.KeyboardShadowView$a */
    public interface C5912a {
    }

    public KeyboardShadowView(Context context) {
        super(context);
    }

    public void setCallback(C5912a aVar) {
        this.f15516e = aVar;
    }

    public void setShowStatusBar(boolean z) {
        this.f15514c = z;
    }

    /* access modifiers changed from: 0000 */
    public void setActivity(Activity activity) {
        this.f15512a = activity;
        this.f15513b = C3894h.m9842a(activity);
        this.f15515d = C9432q.m18695e(activity);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f15512a == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f15514c || this.f15513b) {
            motionEvent.offsetLocation(0.0f, (float) this.f15515d);
        }
        Fragment a = ((FragmentActivity) this.f15512a).getSupportFragmentManager().mo2224a("AbsInteractionFragment");
        boolean z = false;
        if (a == null) {
            z = this.f15512a.dispatchTouchEvent(motionEvent);
        } else if (a instanceof C0649f) {
            Dialog dialog = ((C0649f) a).getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    z = window.superDispatchTouchEvent(motionEvent);
                }
            }
        }
        return z;
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
