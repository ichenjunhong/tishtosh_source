package com.p683ss.android.ugc.aweme.story.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.story.widget.StoryFilterIndicator */
public class StoryFilterIndicator extends RelativeLayout {

    /* renamed from: a */
    public static final String f118110a = "StoryFilterIndicator";

    /* renamed from: b */
    TextView f118111b;

    /* renamed from: c */
    TextView f118112c;

    /* renamed from: d */
    public float f118113d;

    /* renamed from: e */
    public Runnable f118114e;

    /* renamed from: f */
    private C46766a f118115f;

    /* renamed from: com.ss.android.ugc.aweme.story.widget.StoryFilterIndicator$a */
    class C46766a implements Runnable {

        /* renamed from: a */
        CharSequence f118118a;

        /* renamed from: b */
        CharSequence f118119b;

        /* renamed from: c */
        boolean f118120c;

        public final void run() {
            float f;
            TextView textView;
            TextView textView2;
            float f2;
            if (StoryFilterIndicator.this.f118111b != null && StoryFilterIndicator.this.f118112c != null) {
                StoryFilterIndicator.this.animate().cancel();
                StoryFilterIndicator.this.f118111b.animate().cancel();
                StoryFilterIndicator.this.f118112c.animate().cancel();
                StoryFilterIndicator.this.removeCallbacks(StoryFilterIndicator.this.f118114e);
                StoryFilterIndicator.this.setAlpha(1.0f);
                StoryFilterIndicator.this.setVisibility(0);
                if (this.f118120c) {
                    f = StoryFilterIndicator.this.f118113d;
                } else {
                    f = 0.0f;
                }
                if (this.f118120c) {
                    textView = StoryFilterIndicator.this.f118111b;
                } else {
                    textView = StoryFilterIndicator.this.f118112c;
                }
                if (this.f118120c) {
                    textView2 = StoryFilterIndicator.this.f118112c;
                } else {
                    textView2 = StoryFilterIndicator.this.f118111b;
                }
                if (this.f118120c) {
                    f2 = 0.0f;
                } else {
                    f2 = StoryFilterIndicator.this.f118113d;
                }
                textView.setTranslationX(f2);
                textView2.setTranslationX(f2);
                textView.setAlpha(1.0f);
                textView2.setAlpha(0.0f);
                textView.setText(this.f118118a);
                textView2.setText(this.f118119b);
                textView.animate().translationX(f).alpha(0.0f).withEndAction(new Runnable() {
                    public final void run() {
                        StoryFilterIndicator.this.postDelayed(StoryFilterIndicator.this.f118114e, 600);
                    }
                }).setDuration(300).start();
                textView2.animate().translationX(f).alpha(1.0f).setDuration(300).start();
            }
        }

        public C46766a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.f118118a = charSequence;
            this.f118119b = charSequence2;
            this.f118120c = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public StoryFilterIndicator(Context context) {
        this(context, null);
    }

    public StoryFilterIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo93946a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean z2;
        C46766a aVar = new C46766a(charSequence, charSequence2, z);
        if (this.f118113d != 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            aVar.run();
        } else {
            this.f118115f = aVar;
        }
    }

    public StoryFilterIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118114e = new Runnable() {
            public final void run() {
                StoryFilterIndicator.this.animate().alpha(0.0f).withEndAction(new Runnable() {
                    public final void run() {
                        StoryFilterIndicator.this.setVisibility(8);
                    }
                }).setDuration(300).start();
            }
        };
        inflate(getContext(), R.layout.a8e, this);
        this.f118111b = (TextView) findViewById(R.id.ag7);
        this.f118112c = (TextView) findViewById(R.id.ck2);
        this.f118111b.setAlpha(1.0f);
        this.f118112c.setAlpha(1.0f);
        this.f118112c.setVisibility(0);
        this.f118111b.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!(this.f118111b == null || this.f118112c == null)) {
            this.f118113d = this.f118111b.getX() - this.f118112c.getX();
        }
        if (this.f118115f != null) {
            this.f118115f.run();
            this.f118115f = null;
        }
    }
}
