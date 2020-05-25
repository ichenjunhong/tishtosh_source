package com.twitter.sdk.android.tweetui.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class VideoControlView extends FrameLayout {

    /* renamed from: a */
    C52280a f130186a;

    /* renamed from: b */
    ImageButton f130187b;

    /* renamed from: c */
    TextView f130188c;

    /* renamed from: d */
    TextView f130189d;

    /* renamed from: e */
    SeekBar f130190e;

    /* renamed from: f */
    public final Handler f130191f = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what == 1001 && VideoControlView.this.f130186a != null) {
                VideoControlView videoControlView = VideoControlView.this;
                int duration = videoControlView.f130186a.getDuration();
                int currentPosition = videoControlView.f130186a.getCurrentPosition();
                int bufferPercentage = videoControlView.f130186a.getBufferPercentage();
                videoControlView.setDuration(duration);
                videoControlView.setCurrentTime(currentPosition);
                videoControlView.mo109060a(currentPosition, duration, bufferPercentage);
                VideoControlView videoControlView2 = VideoControlView.this;
                if (videoControlView2.f130186a.mo109074c()) {
                    videoControlView2.f130187b.setImageResource(R.drawable.c9d);
                    videoControlView2.f130187b.setContentDescription(videoControlView2.getContext().getString(R.string.f4s));
                } else if (videoControlView2.f130186a.getCurrentPosition() > Math.max(videoControlView2.f130186a.getDuration() - 500, 0)) {
                    videoControlView2.f130187b.setImageResource(R.drawable.c9f);
                    videoControlView2.f130187b.setContentDescription(videoControlView2.getContext().getString(R.string.f4x));
                } else {
                    videoControlView2.f130187b.setImageResource(R.drawable.c9e);
                    videoControlView2.f130187b.setContentDescription(videoControlView2.getContext().getString(R.string.f4t));
                }
                if (VideoControlView.this.mo109062c() && VideoControlView.this.f130186a.mo109074c()) {
                    sendMessageDelayed(obtainMessage(1001), 500);
                }
            }
        }
    };

    /* renamed from: com.twitter.sdk.android.tweetui.internal.VideoControlView$a */
    public interface C52280a {
        /* renamed from: a */
        void mo109071a();

        /* renamed from: a */
        void mo109072a(int i);

        /* renamed from: b */
        void mo109073b();

        /* renamed from: c */
        boolean mo109074c();

        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();
    }

    /* renamed from: c */
    public final boolean mo109062c() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109059a() {
        this.f130191f.removeMessages(1001);
        if (getVisibility() == 0) {
            clearAnimation();
            animate().alpha(0.0f).setDuration(150).setListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ View f130229a;

                {
                    this.f130229a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f130229a.setVisibility(4);
                    this.f130229a.setAlpha(1.0f);
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo109061b() {
        this.f130191f.sendEmptyMessage(1001);
        if (getVisibility() != 0) {
            setAlpha(0.0f);
            setVisibility(0);
        }
        clearAnimation();
        animate().alpha(1.0f).setDuration(150).setListener(null);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.asx, this);
        this.f130187b = (ImageButton) findViewById(R.id.djk);
        this.f130188c = (TextView) findViewById(R.id.djb);
        this.f130189d = (TextView) findViewById(R.id.djc);
        this.f130190e = (SeekBar) findViewById(R.id.dji);
        this.f130190e.setMax(1000);
        this.f130190e.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
                VideoControlView.this.f130191f.removeMessages(1001);
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                VideoControlView.this.f130191f.sendEmptyMessage(1001);
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    int duration = (int) (((long) (VideoControlView.this.f130186a.getDuration() * i)) / 1000);
                    VideoControlView.this.f130186a.mo109072a(duration);
                    VideoControlView.this.setCurrentTime(duration);
                }
            }
        });
        this.f130187b.setOnClickListener(new C52301i(this));
        setDuration(0);
        setCurrentTime(0);
        mo109060a(0, 0, 0);
    }

    public void setMediaPlayer(C52280a aVar) {
        this.f130186a = aVar;
    }

    public VideoControlView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentTime(int i) {
        this.f130188c.setText(C52292c.m111729a((long) i));
    }

    /* access modifiers changed from: 0000 */
    public void setDuration(int i) {
        this.f130189d.setText(C52292c.m111729a((long) i));
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109060a(int i, int i2, int i3) {
        long j;
        if (i2 > 0) {
            j = (((long) i) * 1000) / ((long) i2);
        } else {
            j = 0;
        }
        this.f130190e.setProgress((int) j);
        this.f130190e.setSecondaryProgress(i3 * 10);
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
