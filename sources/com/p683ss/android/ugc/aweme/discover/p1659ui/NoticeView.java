package com.p683ss.android.ugc.aweme.discover.p1659ui;

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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.NoticeView */
public final class NoticeView extends LinearLayout implements OnClickListener, C10682e {

    /* renamed from: a */
    RemoteImageView f74799a;

    /* renamed from: b */
    ImageView f74800b;

    /* renamed from: c */
    TextView f74801c;

    /* renamed from: d */
    View f74802d;

    /* renamed from: e */
    View f74803e;

    /* renamed from: f */
    private C28448a f74804f;

    /* renamed from: g */
    private int f74805g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.NoticeView$a */
    public interface C28448a {
        /* renamed from: a */
        void mo51945a();

        /* renamed from: b */
        void mo51946b();
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
    }

    public final TextView getTitleTextView() {
        return this.f74801c;
    }

    public final void setOnInternalClickListener(C28448a aVar) {
        this.f74804f = aVar;
    }

    public NoticeView(Context context) {
        this(context, null);
    }

    public final void setCloseImage(int i) {
        this.f74800b.setImageResource(i);
    }

    public final void setIconImage(int i) {
        this.f74799a.setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        this.f74803e.setBackgroundColor(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f74801c.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        this.f74801c.setTextColor(i);
    }

    private void setColorMode(int i) {
        if (this.f74805g != i) {
            this.f74805g = i;
            mo19029a(this.f74805g);
        }
    }

    public final void setCloseImage(Bitmap bitmap) {
        this.f74800b.setImageBitmap(bitmap);
    }

    public final void setIconImage(Bitmap bitmap) {
        this.f74799a.setImageBitmap(bitmap);
    }

    public final void setTitleText(String str) {
        this.f74801c.setText(str);
    }

    public final void setIconImage(UrlModel urlModel) {
        C23515d.m57669a(this.f74799a, urlModel);
    }

    public final void setTitleText(int i) {
        this.f74801c.setText(getContext().getResources().getText(i));
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f74804f != null) {
            if (view.getId() == R.id.az9) {
                this.f74804f.mo51946b();
                return;
            }
            if (view.getId() == R.id.d17) {
                this.f74804f.mo51945a();
            }
        }
    }

    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74805g = -1;
        inflate(context, R.layout.bl1, this);
        this.f74799a = (RemoteImageView) findViewById(R.id.b1k);
        this.f74800b = (ImageView) findViewById(R.id.az9);
        this.f74801c = (TextView) findViewById(R.id.dhb);
        this.f74802d = findViewById(R.id.d17);
        this.f74803e = findViewById(R.id.brq);
        this.f74800b.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f74802d.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f74800b.setOnClickListener(this);
        this.f74802d.setOnClickListener(this);
        setColorMode(C10675b.m21494a().f28434a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ff, R.attr.np, R.attr.ur, R.attr.a72, R.attr.a74});
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            this.f74799a.setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            this.f74800b.setImageDrawable(drawable2);
        }
        this.f74801c.setText(obtainStyledAttributes.getString(3));
        this.f74801c.setTextColor(obtainStyledAttributes.getColor(4, getResources().getColor(R.color.pn)));
        this.f74803e.setBackgroundColor(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.a0_)));
        obtainStyledAttributes.recycle();
    }
}
