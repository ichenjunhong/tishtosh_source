package com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar;

import android.content.Context;
import android.support.p043v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar */
public final class OnTouchDraftSeekBar extends AppCompatSeekBar implements OnSeekBarChangeListener {

    /* renamed from: a */
    public static final C31116a f81445a = new C31116a(null);

    /* renamed from: b */
    private OnSeekBarChangeListener f81446b;

    /* renamed from: c */
    private boolean f81447c;

    /* renamed from: d */
    private boolean f81448d;

    /* renamed from: e */
    private Float f81449e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.OnTouchDraftSeekBar$a */
    public static final class C31116a {
        private C31116a() {
        }

        public /* synthetic */ C31116a(C52707g gVar) {
            this();
        }
    }

    public final boolean getHasActionMove() {
        return this.f81447c;
    }

    public final Float getMDownEventRawX() {
        return this.f81449e;
    }

    public final boolean getMPauseStatus() {
        return this.f81448d;
    }

    public final void setHasActionMove(boolean z) {
        this.f81447c = z;
    }

    public final void setMDownEventRawX(Float f) {
        this.f81449e = f;
    }

    public final void setMPauseStatus(boolean z) {
        this.f81448d = z;
    }

    public final void setPauseStatus(boolean z) {
        this.f81448d = z;
    }

    public OnTouchDraftSeekBar(Context context) {
        this(context, null);
    }

    public final void setCustomOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        C52711k.m112240b(onSeekBarChangeListener, C47041l.f118793f);
        this.f81446b = onSeekBarChangeListener;
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.f81446b;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.f81446b;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f81447c = false;
            this.f81449e = Float.valueOf(motionEvent.getRawX());
            super.onTouchEvent(motionEvent);
        } else if (num != null && num.intValue() == 2) {
            Float f = this.f81449e;
            if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                this.f81447c = true;
                super.onTouchEvent(motionEvent);
            }
        } else if (num != null && num.intValue() == 1) {
            if (this.f81447c || this.f81448d) {
                super.onTouchEvent(motionEvent);
            } else {
                SeekBar seekBar = this;
                onStartTrackingTouch(seekBar);
                onStopTrackingTouch(seekBar);
            }
            this.f81447c = false;
        } else if (num != null && num.intValue() == 3) {
            super.onTouchEvent(motionEvent);
            this.f81447c = false;
        }
        return true;
    }

    public OnTouchDraftSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        OnSeekBarChangeListener onSeekBarChangeListener = this.f81446b;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    public OnTouchDraftSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnSeekBarChangeListener(this);
    }
}
