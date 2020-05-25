package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.helper.C30388l;
import com.p683ss.android.ugc.aweme.feed.helper.C30390n;
import com.ss.android.ugc.trill.R;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.RatingBar */
public class RatingBar extends LinearLayout implements C30388l {

    /* renamed from: a */
    LinearLayout f80466a;

    /* renamed from: b */
    boolean f80467b;

    /* renamed from: c */
    float f80468c;

    /* renamed from: d */
    Drawable f80469d;

    /* renamed from: e */
    C30725c f80470e;

    /* renamed from: f */
    private Context f80471f;

    /* renamed from: g */
    private int f80472g;

    /* renamed from: h */
    private C30723a f80473h;

    /* renamed from: i */
    private C30724b f80474i;

    /* renamed from: j */
    private float f80475j;

    /* renamed from: k */
    private float f80476k;

    /* renamed from: l */
    private Drawable f80477l;

    /* renamed from: m */
    private Drawable f80478m;

    /* renamed from: n */
    private DmtTextView f80479n;

    /* renamed from: o */
    private C30390n f80480o;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.RatingBar$a */
    public interface C30723a {
        /* renamed from: a */
        void mo60797a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.RatingBar$b */
    public interface C30724b {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.RatingBar$c */
    public enum C30725c {
        Half(0),
        Full(1);
        

        /* renamed from: a */
        int f80482a;

        public static C30725c fromStep(int i) {
            C30725c[] values;
            for (C30725c cVar : values()) {
                if (cVar.f80482a == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException();
        }

        private C30725c(int i) {
            this.f80482a = i;
        }
    }

    public C30390n getOptionClickListener() {
        return this.f80480o;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo63355a();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LayoutParams layoutParams = new LayoutParams(Math.round(this.f80475j), Math.round(this.f80475j));
        layoutParams.setMargins(0, 0, Math.round(this.f80476k), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.f80477l);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        return imageView;
    }

    /* renamed from: a */
    public final void mo63355a() {
        if (this.f80471f != null) {
            setOrientation(1);
            this.f80466a = new LinearLayout(this.f80471f);
            this.f80466a.setGravity(17);
            for (int i = 0; i < this.f80472g; i++) {
                ImageView starImageView = getStarImageView();
                starImageView.setImageDrawable(this.f80477l);
                starImageView.setOnClickListener(new C30835cb(this, starImageView));
                this.f80466a.addView(starImageView);
            }
            setStar(this.f80468c);
            addView(this.f80466a, new LayoutParams(-1, -2));
            if (this.f80471f != null) {
                this.f80479n = new DmtTextView(this.f80471f);
                this.f80479n.setTextColor(this.f80471f.getResources().getColor(R.color.avv));
                this.f80479n.setTextSize(13.0f);
                this.f80479n.setGravity(17);
                this.f80479n.setPadding(0, (int) C9432q.m18687b(this.f80471f, 4.0f), 0, 0);
                addView(this.f80479n, new LayoutParams(-1, -2));
            }
        }
    }

    public void setClickable(boolean z) {
        this.f80467b = z;
    }

    public void setOnRatingChangeListener(C30723a aVar) {
        this.f80473h = aVar;
    }

    public void setOptionListener(C30390n nVar) {
        this.f80480o = nVar;
    }

    public void setStarCount(int i) {
        this.f80472g = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f80477l = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f80478m = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f80469d = drawable;
    }

    public void setStarImageSize(float f) {
        this.f80475j = f;
    }

    public void setStarPadding(float f) {
        this.f80476k = f;
    }

    public void setStarStep(float f) {
        this.f80468c = f;
    }

    public void setUnClickableClickListener(C30724b bVar) {
        this.f80474i = bVar;
    }

    public RatingBar(Context context) {
        this(context, null);
        this.f80471f = context;
    }

    public void setStepSize(int i) {
        this.f80470e = C30725c.fromStep(i);
    }

    public void setOption(String str) {
        if (this.f80479n != null) {
            this.f80479n.setText(str);
        }
    }

    public void setStar(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > ((float) this.f80472g)) {
            f = (float) this.f80472g;
        }
        if (this.f80473h != null) {
            this.f80473h.mo60797a(f);
        }
        this.f80468c = f;
        int i = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
        for (int i2 = 0; i2 < i; i2++) {
            ((ImageView) this.f80466a.getChildAt(i2)).setImageDrawable(this.f80478m);
        }
        for (int i3 = i; i3 < this.f80472g; i3++) {
            ((ImageView) this.f80466a.getChildAt(i3)).setImageDrawable(this.f80477l);
        }
        if (floatValue > 0.0f) {
            ((ImageView) this.f80466a.getChildAt(i)).setImageDrawable(this.f80469d);
        }
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80471f = context;
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.f6, R.attr.a2y, R.attr.a2z, R.attr.a30, R.attr.a31, R.attr.a32, R.attr.a33, R.attr.a34, R.attr.a3k});
            this.f80475j = obtainStyledAttributes.getDimension(5, 20.0f);
            this.f80476k = obtainStyledAttributes.getDimension(6, 10.0f);
            this.f80468c = obtainStyledAttributes.getFloat(7, 1.0f);
            this.f80470e = C30725c.fromStep(obtainStyledAttributes.getInt(8, 1));
            this.f80472g = obtainStyledAttributes.getInteger(1, 5);
            this.f80477l = obtainStyledAttributes.getDrawable(2);
            this.f80478m = obtainStyledAttributes.getDrawable(3);
            this.f80469d = obtainStyledAttributes.getDrawable(4);
            this.f80467b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
