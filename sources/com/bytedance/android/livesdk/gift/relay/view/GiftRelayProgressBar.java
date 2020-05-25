package com.bytedance.android.livesdk.gift.relay.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;

public class GiftRelayProgressBar extends FrameLayout implements C8619a {

    /* renamed from: a */
    SimpleDraweeView f21059a;

    /* renamed from: b */
    Handler f21060b;

    /* renamed from: c */
    public C7646a f21061c;

    /* renamed from: d */
    public int f21062d;

    /* renamed from: e */
    private ProgressBar f21063e;

    /* renamed from: f */
    private SimpleDraweeView f21064f;

    /* renamed from: g */
    private TextView f21065g;

    /* renamed from: com.bytedance.android.livesdk.gift.relay.view.GiftRelayProgressBar$a */
    public interface C7646a {
        /* renamed from: a */
        void mo12380a();

        /* renamed from: c */
        void mo12381c();

        /* renamed from: d */
        void mo12382d();
    }

    public void setmProgressBarListener(C7646a aVar) {
        this.f21061c = aVar;
    }

    public GiftRelayProgressBar(Context context) {
        this(context, null);
    }

    public void setProgressBarDrawable(Drawable drawable) {
        this.f21063e.setProgressDrawable(drawable);
    }

    public void setmProgressBarRank(String str) {
        this.f21065g.setText(str);
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (message != null && message.what == 4) {
            this.f21059a.setVisibility(8);
            setProgress(0);
            mo14004a(this.f21062d, 0);
            this.f21061c.mo12381c();
        }
    }

    public void setProgress(int i) {
        if (i <= this.f21063e.getMax()) {
            this.f21063e.setProgress(i);
            int width = (this.f21063e.getWidth() - this.f21063e.getPaddingLeft()) - this.f21063e.getPaddingRight();
            int progress = width - ((int) (((float) width) * (1.0f - ((((float) this.f21063e.getProgress()) * 1.0f) / ((float) this.f21063e.getMax())))));
            LayoutParams layoutParams = (LayoutParams) this.f21064f.getLayoutParams();
            int left = ((this.f21063e.getLeft() + this.f21063e.getPaddingLeft()) + progress) - this.f21064f.getWidth();
            layoutParams.setMargins(left + 8, ((getHeight() - this.f21063e.getHeight()) / 2) - 2, ((getWidth() - left) - this.f21064f.getWidth()) - 8, ((getHeight() - this.f21063e.getHeight()) / 2) - 2);
            this.f21064f.setLayoutParams(layoutParams);
            if (i < 3) {
                this.f21064f.setVisibility(4);
            } else {
                this.f21064f.setVisibility(0);
            }
        }
    }

    public GiftRelayProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo14004a(int i, int i2) {
        final int i3;
        final int progress = this.f21063e.getProgress();
        if (i2 != 0) {
            i3 = this.f21063e.getMax();
        } else {
            i3 = i;
        }
        long j = (long) (((float) (i3 - progress)) * 3.0f);
        if (j < 0) {
            j = 0;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{0, 100}).setDuration(j);
        final int i4 = i2;
        final int i5 = i;
        C76451 r1 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue < 100) {
                    GiftRelayProgressBar.this.setProgress((int) (((float) progress) + (((float) (i3 - progress)) * (((float) intValue) / 100.0f))));
                } else if (i4 == 1) {
                    GiftRelayProgressBar.this.f21062d = i5;
                    GiftRelayProgressBar giftRelayProgressBar = GiftRelayProgressBar.this;
                    giftRelayProgressBar.f21059a.setVisibility(0);
                    giftRelayProgressBar.f21059a.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_sweep.webp").mo25762c(true)).mo25763d());
                    giftRelayProgressBar.f21060b.sendEmptyMessageDelayed(4, 500);
                    GiftRelayProgressBar.this.f21061c.mo12380a();
                } else if (i4 == 2) {
                    GiftRelayProgressBar.this.f21061c.mo12381c();
                    GiftRelayProgressBar.this.setProgress(0);
                    GiftRelayProgressBar.this.mo14004a(i5, 0);
                } else {
                    GiftRelayProgressBar.this.f21061c.mo12382d();
                }
            }
        };
        duration.addUpdateListener(r1);
        duration.start();
    }

    public GiftRelayProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21062d = 1;
        LayoutInflater.from(getContext()).inflate(R.layout.al1, this);
        this.f21063e = (ProgressBar) findViewById(R.id.aln);
        this.f21063e.setMax(1000);
        this.f21064f = (SimpleDraweeView) findViewById(R.id.c6h);
        this.f21059a = (SimpleDraweeView) findViewById(R.id.c6j);
        this.f21065g = (TextView) findViewById(R.id.alo);
        this.f21060b = new C8618a(Looper.getMainLooper(), this);
        this.f21064f.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_loading.webp").mo25762c(true)).mo25763d());
    }
}
