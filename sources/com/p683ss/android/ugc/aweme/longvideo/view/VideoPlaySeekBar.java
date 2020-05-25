package com.p683ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36360e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar */
public final class VideoPlaySeekBar extends LinearLayout {

    /* renamed from: c */
    public static final C36393a f93185c = new C36393a(null);

    /* renamed from: a */
    public TextView f93186a;

    /* renamed from: b */
    public int f93187b;

    /* renamed from: d */
    private TextView f93188d;

    /* renamed from: e */
    private SeekBar f93189e;

    /* renamed from: f */
    private Float f93190f;

    /* renamed from: g */
    private OnSeekBarChangeListener f93191g;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar$a */
    public static final class C36393a {
        private C36393a() {
        }

        public /* synthetic */ C36393a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar$b */
    public static final class C36394b implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VideoPlaySeekBar f93192a;

        C36394b(VideoPlaySeekBar videoPlaySeekBar) {
            this.f93192a = videoPlaySeekBar;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            OnSeekBarChangeListener mOnSeekBarChangeListener = this.f93192a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            OnSeekBarChangeListener mOnSeekBarChangeListener = this.f93192a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
            C47718bf.m103288a(new C36349a());
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView = this.f93192a.f93186a;
            if (textView != null) {
                textView.setText(C36360e.f93074a.mo75273a(((float) i) / 100.0f, this.f93192a.f93187b));
            }
            OnSeekBarChangeListener mOnSeekBarChangeListener = this.f93192a.getMOnSeekBarChangeListener();
            if (mOnSeekBarChangeListener != null) {
                mOnSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        }
    }

    public final OnSeekBarChangeListener getMOnSeekBarChangeListener() {
        return this.f93191g;
    }

    public final Float getMProgress() {
        return this.f93190f;
    }

    public final void setMOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f93191g = onSeekBarChangeListener;
    }

    public final void setMProgress(Float f) {
        this.f93190f = f;
    }

    public VideoPlaySeekBar(Context context) {
        this(context, null);
    }

    public final void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        C52711k.m112240b(onSeekBarChangeListener, "listener");
        this.f93191g = onSeekBarChangeListener;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSecondaryProgress(int i) {
        SeekBar seekBar = this.f93189e;
        if (seekBar != null) {
            seekBar.setSecondaryProgress(i);
        }
    }

    public final void setTotalTime(int i) {
        this.f93187b = i;
        TextView textView = this.f93188d;
        if (textView != null) {
            textView.setText(C36360e.f93074a.mo75274a(i));
        }
    }

    public final void setProgress(float f) {
        this.f93190f = Float.valueOf(f);
        if (VERSION.SDK_INT >= 24) {
            SeekBar seekBar = this.f93189e;
            if (seekBar != null) {
                seekBar.setProgress((int) (100.0f * f), false);
            }
        } else {
            SeekBar seekBar2 = this.f93189e;
            if (seekBar2 != null) {
                seekBar2.setProgress((int) (100.0f * f));
            }
        }
        TextView textView = this.f93186a;
        if (textView != null) {
            textView.setText(C36360e.f93074a.mo75273a(f, this.f93187b));
        }
    }

    public final void setSeekBarThumb(int i) {
        if (1 == i) {
            SeekBar seekBar = this.f93189e;
            if (seekBar != null) {
                Context context = getContext();
                C52711k.m112236a((Object) context, "context");
                seekBar.setThumb(context.getResources().getDrawable(R.drawable.cqm));
            }
            return;
        }
        SeekBar seekBar2 = this.f93189e;
        if (seekBar2 != null) {
            Context context2 = getContext();
            C52711k.m112236a((Object) context2, "context");
            seekBar2.setThumb(context2.getResources().getDrawable(R.drawable.cql));
        }
    }

    public VideoPlaySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoPlaySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.b4y, this, true);
        this.f93186a = (TextView) inflate.findViewById(R.id.de2);
        this.f93188d = (TextView) inflate.findViewById(R.id.dhx);
        this.f93189e = (SeekBar) inflate.findViewById(R.id.ck8);
        SeekBar seekBar = this.f93189e;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new C36394b(this));
        }
        TextView textView = this.f93186a;
        if (textView != null) {
            textView.setText(C36360e.f93074a.mo75274a(0));
        }
        TextView textView2 = this.f93188d;
        if (textView2 != null) {
            textView2.setText(C36360e.f93074a.mo75274a(0));
        }
    }
}
