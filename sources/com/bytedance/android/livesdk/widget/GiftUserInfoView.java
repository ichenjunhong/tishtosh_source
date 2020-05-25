package com.bytedance.android.livesdk.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.view.C1056u;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.video.p375b.C7446a;
import com.ss.android.ugc.trill.R;

public class GiftUserInfoView extends ConstraintLayout {

    /* renamed from: h */
    TextView f23007h;

    /* renamed from: i */
    ObjectAnimator f23008i;

    /* renamed from: j */
    private ImageView f23009j;

    /* renamed from: k */
    private ImageView f23010k;

    /* renamed from: l */
    private TextView f23011l;

    /* renamed from: m */
    private HSImageView f23012m;

    /* renamed from: n */
    private AnimatorSet f23013n;

    /* renamed from: o */
    private AnimatorSet f23014o;

    /* renamed from: p */
    private long f23015p;

    private int getLayoutResource() {
        return R.layout.apo;
    }

    public long getUserId() {
        return this.f23015p;
    }

    /* renamed from: c */
    public final void mo14714c() {
        if (C1056u.m3018B(this)) {
            setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo14713b() {
        if (C1056u.m3018B(this)) {
            if (this.f23013n == null) {
                this.f23013n = C7446a.m15381a(this);
            }
            if (!this.f23013n.isRunning()) {
                this.f23013n.start();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f23009j.setImageDrawable(null);
        this.f23010k.setImageDrawable(null);
        this.f23011l.setText(null);
        this.f23007h.setText(null);
        this.f23012m.setImageDrawable(null);
        if (this.f23008i != null) {
            this.f23008i.cancel();
        }
        if (this.f23013n != null) {
            this.f23013n.cancel();
        }
        if (this.f23014o != null) {
            this.f23014o.cancel();
        }
        super.onDetachedFromWindow();
    }

    public void setUserId(long j) {
        this.f23015p = j;
    }

    public GiftUserInfoView(Context context) {
        super(context);
        m16672a(context);
    }

    public void setDescriptionText(String str) {
        this.f23007h.setText(str);
    }

    public void setDescriptionTextColor(int i) {
        this.f23007h.setTextColor(i);
    }

    public void setSpannable(Spannable spannable) {
        this.f23007h.setText(spannable);
    }

    public void setUserNameText(String str) {
        this.f23011l.setText(str);
    }

    public void setUserNameTextColor(int i) {
        this.f23011l.setTextColor(i);
    }

    public void setAvatarImage(ImageModel imageModel) {
        if (imageModel != null) {
            C5213c.m11815a(this.f23009j, imageModel, 2131956352);
        }
    }

    public void setHonorImage(ImageModel imageModel) {
        if (imageModel != null) {
            C5213c.m11824b(this.f23010k, imageModel);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel == null) {
            this.f23012m.setVisibility(4);
            return;
        }
        this.f23012m.setVisibility(0);
        C5213c.m11814a((ImageView) this.f23012m, imageModel);
    }

    /* renamed from: a */
    public final void mo14712a(long j) {
        int i;
        boolean z = false;
        if (this.f23007h.getLayout() != null) {
            i = ((int) this.f23007h.getLayout().getLineWidth(0)) - ((this.f23007h.getWidth() - this.f23007h.getCompoundPaddingRight()) - this.f23007h.getCompoundPaddingLeft());
            if (i > 0) {
                z = true;
            }
        } else {
            i = 0;
        }
        if (z) {
            this.f23007h.postDelayed(new C8544e(this, i), j);
        }
    }

    /* renamed from: a */
    private void m16672a(Context context) {
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f23009j = (ImageView) findViewById(R.id.i0);
        this.f23010k = (ImageView) findViewById(R.id.apa);
        this.f23011l = (TextView) findViewById(R.id.dn7);
        this.f23007h = (TextView) findViewById(R.id.a4o);
        this.f23012m = (HSImageView) findViewById(R.id.ay3);
    }

    public GiftUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16672a(context);
    }

    public GiftUserInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16672a(context);
    }
}
