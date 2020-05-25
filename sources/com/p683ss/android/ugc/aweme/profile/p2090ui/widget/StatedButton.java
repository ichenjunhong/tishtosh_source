package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.StatedButton */
public class StatedButton extends AutoRTLImageView {

    /* renamed from: a */
    public int f103196a;

    /* renamed from: b */
    public boolean f103197b;

    /* renamed from: c */
    private int f103198c;

    /* renamed from: c */
    public final void mo82723c() {
        this.f103197b = false;
    }

    /* renamed from: a */
    public final void mo82721a() {
        setImageResource(this.f103198c);
        mo82722b();
    }

    /* renamed from: b */
    public final void mo82722b() {
        this.f103197b = true;
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                if (StatedButton.this.f103197b) {
                    StatedButton.this.mo82722b();
                    return;
                }
                StatedButton.this.animate().cancel();
                StatedButton.this.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
                StatedButton.this.setImageResource(StatedButton.this.f103196a);
            }
        }).start();
    }

    public void setLoadingBackground(int i) {
        this.f103198c = i;
    }

    public StatedButton(Context context) {
        this(context, null);
    }

    public void setLoginBackgroundRes(int i) {
        this.f103196a = i;
        setImageResource(this.f103196a);
    }

    public StatedButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatedButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f103196a = R.drawable.dga;
        this.f103198c = R.drawable.dgb;
        setImageResource(this.f103196a);
    }
}
