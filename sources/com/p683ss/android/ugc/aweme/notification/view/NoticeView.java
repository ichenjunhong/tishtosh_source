package com.p683ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NoticeView */
public final class NoticeView extends LinearLayout implements OnClickListener, C10682e {

    /* renamed from: a */
    RemoteImageView f97862a;

    /* renamed from: b */
    ImageView f97863b;

    /* renamed from: c */
    TextView f97864c;

    /* renamed from: d */
    View f97865d;

    /* renamed from: e */
    View f97866e;

    /* renamed from: f */
    private C38458a f97867f;

    /* renamed from: g */
    private int f97868g;

    /* renamed from: com.ss.android.ugc.aweme.notification.view.NoticeView$a */
    public interface C38458a {
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f97864c;
    }

    public final void setOnInternalClickListener(C38458a aVar) {
        this.f97867f = aVar;
    }

    public NoticeView(Context context) {
        this(context, null);
    }

    public final void setCloseImage(int i) {
        this.f97863b.setImageResource(i);
    }

    public final void setIconImage(int i) {
        this.f97862a.setImageResource(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f97864c.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.f97864c.setTextColor(i);
    }

    private void setColorMode(int i) {
        if (this.f97868g != i) {
            this.f97868g = i;
            mo19029a(this.f97868g);
        }
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f97863b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f97862a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f97864c.setText(str);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!(this.f97867f == null || view.getId() == R.id.az9)) {
            view.getId();
        }
    }

    public final void setIconImage(UrlModel urlModel) {
        C23515d.m57669a(this.f97862a, urlModel);
    }

    public final void setTitleText(int i) {
        this.f97864c.setText(getContext().getResources().getText(i));
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f97868g = -1;
        inflate(context, R.layout.b2m, this);
        this.f97862a = (RemoteImageView) findViewById(R.id.b1k);
        this.f97863b = (ImageView) findViewById(R.id.az9);
        this.f97864c = (TextView) findViewById(R.id.dhb);
        this.f97865d = findViewById(R.id.d17);
        this.f97866e = findViewById(R.id.brq);
        this.f97863b.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f97865d.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f97863b.setOnClickListener(this);
        this.f97865d.setOnClickListener(this);
        setColorMode(C10675b.m21494a().f28434a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ff, R.attr.np, R.attr.ur, R.attr.a72, R.attr.a74});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f97862a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f97863b.setImageDrawable(drawable2);
        }
        this.f97864c.setText(obtainStyledAttributes.getString(3));
        this.f97864c.setTextColor(obtainStyledAttributes.getColor(4, getResources().getColor(R.color.pn)));
        this.f97866e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.a0_)));
        obtainStyledAttributes.recycle();
    }
}
