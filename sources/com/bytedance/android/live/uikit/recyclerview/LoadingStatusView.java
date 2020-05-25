package com.bytedance.android.live.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {

    /* renamed from: a */
    List<View> f11600a;

    /* renamed from: b */
    int f11601b;

    /* renamed from: c */
    private final String f11602c;

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a */
    public static class C4239a {

        /* renamed from: a */
        Context f11603a;

        /* renamed from: b */
        View f11604b;

        /* renamed from: c */
        View f11605c;

        /* renamed from: d */
        View f11606d;

        /* renamed from: a */
        private CircularProgressView m10481a() {
            return (CircularProgressView) LayoutInflater.from(this.f11603a).inflate(R.layout.a_d, null);
        }

        /* renamed from: a */
        public final C4239a mo9849a(View view) {
            this.f11604b = view;
            return this;
        }

        /* renamed from: b */
        public final C4239a mo9851b(View view) {
            this.f11605c = view;
            return this;
        }

        /* renamed from: c */
        public final C4239a mo9852c(View view) {
            this.f11606d = view;
            return this;
        }

        public C4239a(Context context) {
            if (context != null) {
                this.f11603a = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        /* renamed from: c */
        private C4239a m10482c(int i) {
            return mo9849a(m10483d(R.string.c0f));
        }

        /* renamed from: a */
        public static C4239a m10480a(Context context) {
            return new C4239a(context).mo9850b((int) R.string.c0d).m10482c((int) R.string.c0f).mo9848a(R.string.c0e, null);
        }

        /* renamed from: d */
        private View m10483d(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.f11603a).inflate(R.layout.a_5, null);
            textView.setText(i);
            return textView;
        }

        /* renamed from: b */
        public final C4239a mo9850b(int i) {
            TextView textView = (TextView) LayoutInflater.from(this.f11603a).inflate(R.layout.a_e, null);
            textView.setText(i);
            return mo9851b((View) textView);
        }

        /* renamed from: a */
        public final C4239a mo9847a(int i) {
            CircularProgressView a = m10481a();
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.height = i;
            layoutParams.width = i;
            layoutParams.gravity = 17;
            a.setLayoutParams(layoutParams);
            return mo9849a((View) a);
        }

        /* renamed from: a */
        public final C4239a mo9848a(int i, OnClickListener onClickListener) {
            View d = m10483d(i);
            d.setOnClickListener(onClickListener);
            return mo9852c(d);
        }
    }

    /* renamed from: b */
    public final void mo9843b() {
        setStatus(0);
    }

    /* renamed from: c */
    public final void mo9844c() {
        setStatus(1);
    }

    /* renamed from: d */
    public final void mo9845d() {
        setStatus(2);
    }

    /* renamed from: a */
    public final void mo9842a() {
        if (this.f11601b != -1) {
            ((View) this.f11600a.get(this.f11601b)).setVisibility(4);
            this.f11601b = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    private void setStatus(int i) {
        if (this.f11601b != i) {
            if (this.f11601b >= 0) {
                ((View) this.f11600a.get(this.f11601b)).setVisibility(4);
            }
            if (((View) this.f11600a.get(i)) != null) {
                ((View) this.f11600a.get(i)).setVisibility(0);
                this.f11601b = i;
            }
        }
    }

    public void setBuilder(C4239a aVar) {
        if (aVar == null) {
            aVar = C4239a.m10480a(getContext());
        }
        this.f11600a.clear();
        this.f11600a.add(aVar.f11604b);
        this.f11600a.add(aVar.f11605c);
        this.f11600a.add(aVar.f11606d);
        removeAllViews();
        for (int i = 0; i < this.f11600a.size(); i++) {
            View view = (View) this.f11600a.get(i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11602c = LoadingStatusView.class.getSimpleName();
        this.f11600a = new ArrayList(3);
        this.f11601b = -1;
        setBuilder(null);
    }
}
