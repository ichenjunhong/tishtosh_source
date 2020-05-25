package com.facebook.login.p989a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.login.a.b */
public final class C14513b {

    /* renamed from: a */
    public final WeakReference<View> f37712a;

    /* renamed from: b */
    public C14517a f37713b;

    /* renamed from: c */
    public PopupWindow f37714c;

    /* renamed from: d */
    public C14518b f37715d = C14518b.BLUE;

    /* renamed from: e */
    public long f37716e = 6000;

    /* renamed from: f */
    private final String f37717f;

    /* renamed from: g */
    private final Context f37718g;

    /* renamed from: h */
    private final OnScrollChangedListener f37719h = new OnScrollChangedListener() {
        public final void onScrollChanged() {
            if (!(C14513b.this.f37712a.get() == null || C14513b.this.f37714c == null || !C14513b.this.f37714c.isShowing())) {
                if (C14513b.this.f37714c.isAboveAnchor()) {
                    C14513b.this.f37713b.mo26770b();
                    return;
                }
                C14513b.this.f37713b.mo26769a();
            }
        }
    };

    /* renamed from: com.facebook.login.a.b$a */
    class C14517a extends FrameLayout {

        /* renamed from: a */
        public ImageView f37723a = ((ImageView) findViewById(R.id.wi));

        /* renamed from: b */
        public ImageView f37724b = ((ImageView) findViewById(R.id.wg));

        /* renamed from: c */
        public View f37725c = findViewById(R.id.w_);

        /* renamed from: d */
        public ImageView f37726d = ((ImageView) findViewById(R.id.wa));

        /* renamed from: a */
        public final void mo26769a() {
            this.f37723a.setVisibility(0);
            this.f37724b.setVisibility(4);
        }

        /* renamed from: b */
        public final void mo26770b() {
            this.f37723a.setVisibility(4);
            this.f37724b.setVisibility(0);
        }

        public C14517a(Context context) {
            super(context);
            LayoutInflater.from(getContext()).inflate(R.layout.id, this);
        }
    }

    /* renamed from: com.facebook.login.a.b$b */
    public enum C14518b {
        BLUE,
        BLACK
    }

    public final void dismiss() {
        m29734d();
        if (this.f37714c != null) {
            this.f37714c.dismiss();
        }
    }

    /* renamed from: b */
    private void m29732b() {
        if (this.f37714c != null && this.f37714c.isShowing()) {
            if (this.f37714c.isAboveAnchor()) {
                this.f37713b.mo26770b();
                return;
            }
            this.f37713b.mo26769a();
        }
    }

    /* renamed from: c */
    private void m29733c() {
        m29734d();
        if (this.f37712a.get() != null) {
            ((View) this.f37712a.get()).getViewTreeObserver().addOnScrollChangedListener(this.f37719h);
        }
    }

    /* renamed from: d */
    private void m29734d() {
        if (this.f37712a.get() != null) {
            ((View) this.f37712a.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f37719h);
        }
    }

    /* renamed from: a */
    public final void mo26764a() {
        if (this.f37712a.get() != null) {
            this.f37713b = new C14517a(this.f37718g);
            ((TextView) this.f37713b.findViewById(R.id.wh)).setText(this.f37717f);
            if (this.f37715d == C14518b.BLUE) {
                this.f37713b.f37725c.setBackgroundResource(2131952672);
                this.f37713b.f37724b.setImageResource(2131952673);
                this.f37713b.f37723a.setImageResource(2131952674);
                this.f37713b.f37726d.setImageResource(2131952675);
            } else {
                this.f37713b.f37725c.setBackgroundResource(2131952668);
                this.f37713b.f37724b.setImageResource(2131952669);
                this.f37713b.f37723a.setImageResource(2131952670);
                this.f37713b.f37726d.setImageResource(2131952671);
            }
            View decorView = ((Activity) this.f37718g).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            m29733c();
            this.f37713b.measure(MeasureSpec.makeMeasureSpec(width, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(height, DynamicTabYellowPointVersion.DEFAULT));
            this.f37714c = new PopupWindow(this.f37713b, this.f37713b.getMeasuredWidth(), this.f37713b.getMeasuredHeight());
            this.f37714c.showAsDropDown((View) this.f37712a.get());
            m29732b();
            if (this.f37716e > 0) {
                this.f37713b.postDelayed(new Runnable() {
                    public final void run() {
                        C14513b.this.dismiss();
                    }
                }, this.f37716e);
            }
            this.f37714c.setTouchable(true);
            this.f37713b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C14513b.this.dismiss();
                }
            });
        }
    }

    public C14513b(String str, View view) {
        this.f37717f = str;
        this.f37712a = new WeakReference<>(view);
        this.f37718g = view.getContext();
    }
}
