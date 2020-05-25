package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.account.login.fragment.C21328n;
import com.p683ss.android.ugc.aweme.account.util.C22285w;
import com.p683ss.android.ugc.aweme.account.util.C22285w.C22286a;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountDownView */
public class MusCountDownView extends RelativeLayout {

    /* renamed from: a */
    public static final boolean f58386a = false;

    /* renamed from: b */
    public TextView f58387b;

    /* renamed from: c */
    public TextView f58388c;

    /* renamed from: d */
    public View f58389d;

    /* renamed from: e */
    public boolean f58390e;

    /* renamed from: f */
    private C22285w f58391f;

    /* renamed from: g */
    private C21328n f58392g;

    /* renamed from: h */
    private C22286a f58393h = new C22286a() {

        /* renamed from: b */
        private boolean f58395b;

        /* renamed from: a */
        public final void mo45762a(long j) {
            if (j > 0) {
                MusCountDownView.this.f58387b.setVisibility(0);
                MusCountDownView.this.f58388c.setVisibility(8);
                MusCountDownView.this.f58387b.setText(MusCountDownView.this.getContext().getResources().getString(R.string.d83, new Object[]{Long.valueOf(j)}));
            } else {
                MusCountDownView.this.f58387b.setVisibility(8);
                MusCountDownView.this.f58388c.setVisibility(0);
                MusCountDownView.this.f58388c.setText(MusCountDownView.this.getContext().getString(R.string.cc6));
            }
            if (MusCountDownView.f58386a && j < 50 && !this.f58395b) {
                this.f58395b = true;
            }
            if (j < 50 && MusCountDownView.this.f58390e && MusCountDownView.this.f58389d != null && MusCountDownView.this.f58389d.getVisibility() != 0) {
                MusCountDownView.this.f58389d.setVisibility(0);
            }
        }
    };

    public TextView getResendCodeButton() {
        return this.f58388c;
    }

    public TextView getTimerText() {
        return this.f58387b;
    }

    public long getRemainTick() {
        if (this.f58391f == null) {
            return 0;
        }
        return this.f58391f.f60053c;
    }

    /* renamed from: c */
    private void m54204c() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b0_, this, true);
        this.f58387b = (TextView) inflate.findViewById(R.id.a13);
        this.f58388c = (TextView) inflate.findViewById(R.id.cbr);
        this.f58388c.setOnTouchListener(new C48221a(0.5f, 150, null));
    }

    /* renamed from: a */
    public final void mo45750a() {
        if (this.f58392g != null && this.f58391f != null) {
            if (this.f58391f.f60053c != 0) {
                mo45753b();
            } else {
                this.f58391f.mo46380a(System.currentTimeMillis(), 60, this.f58393h);
            }
        }
    }

    /* renamed from: b */
    public final void mo45753b() {
        if (this.f58392g != null && this.f58391f != null) {
            int parseInt = Integer.parseInt(String.valueOf(this.f58391f.f60053c));
            long currentTimeMillis = System.currentTimeMillis();
            if (parseInt != 0) {
                this.f58391f.mo46382b(currentTimeMillis, parseInt, this.f58393h);
            }
        }
    }

    public void setTargetView(View view) {
        this.f58389d = view;
    }

    public void setTickListener(C21328n nVar) {
        this.f58392g = nVar;
    }

    public void setVoiceCodeEnabled(boolean z) {
        this.f58390e = z;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f58388c.setOnClickListener(onClickListener);
    }

    public MusCountDownView(Context context) {
        super(context);
        m54204c();
    }

    /* renamed from: a */
    public final void mo45751a(int i) {
        if (this.f58392g != null) {
            this.f58391f = this.f58392g.mo45029b(i);
            if (Integer.parseInt(String.valueOf(this.f58391f.f60053c)) != 0) {
                mo45754b(i);
            } else {
                this.f58391f.mo46380a(System.currentTimeMillis(), 60, this.f58393h);
            }
        }
    }

    /* renamed from: b */
    public final void mo45754b(int i) {
        if (this.f58392g != null) {
            this.f58391f = this.f58392g.mo45029b(i);
            if (this.f58391f != null) {
                int parseInt = Integer.parseInt(String.valueOf(this.f58391f.f60053c));
                long currentTimeMillis = System.currentTimeMillis();
                if (parseInt != 0) {
                    this.f58391f.mo46382b(currentTimeMillis, parseInt, this.f58393h);
                }
            }
        }
    }

    public MusCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54204c();
    }

    /* renamed from: a */
    public final void mo45752a(int i, String str) {
        if (this.f58392g != null) {
            this.f58392g.mo45025a(i, str, System.currentTimeMillis(), 60, this.f58393h);
            this.f58391f = this.f58392g.mo45029b(i);
        }
    }

    public MusCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m54204c();
    }
}
