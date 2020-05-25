package com.zhihu.matisse.internal.p2254ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Item;

/* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid */
public class MediaGrid extends SquareFrameLayout implements OnClickListener {

    /* renamed from: a */
    public SimpleDraweeView f130828a;

    /* renamed from: b */
    public CheckView f130829b;

    /* renamed from: c */
    public ImageView f130830c;

    /* renamed from: d */
    public TextView f130831d;

    /* renamed from: e */
    public Item f130832e;

    /* renamed from: f */
    public C52538b f130833f;

    /* renamed from: g */
    private C52537a f130834g;

    /* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid$a */
    public interface C52537a {
        /* renamed from: a */
        void mo110059a(ImageView imageView, Item item, C1352v vVar);

        /* renamed from: a */
        void mo110060a(CheckView checkView, Item item, C1352v vVar);
    }

    /* renamed from: com.zhihu.matisse.internal.ui.widget.MediaGrid$b */
    public static class C52538b {

        /* renamed from: a */
        public int f130835a;

        /* renamed from: b */
        Drawable f130836b;

        /* renamed from: c */
        public boolean f130837c;

        /* renamed from: d */
        C1352v f130838d;

        public C52538b(int i, Drawable drawable, boolean z, C1352v vVar) {
            this.f130835a = i;
            this.f130836b = drawable;
            this.f130837c = z;
            this.f130838d = vVar;
        }
    }

    public Item getMedia() {
        return this.f130832e;
    }

    public void setOnMediaGridClickListener(C52537a aVar) {
        this.f130834g = aVar;
    }

    public MediaGrid(Context context) {
        super(context);
        m112025a(context);
    }

    public void setCheckEnabled(boolean z) {
        this.f130829b.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.f130829b.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.f130829b.setCheckedNum(i);
    }

    public void onClick(View view) {
        if (this.f130834g != null) {
            if (view == this.f130828a) {
                this.f130834g.mo110059a((ImageView) this.f130828a, this.f130832e, this.f130833f.f130838d);
            } else if (view == this.f130829b) {
                this.f130834g.mo110060a(this.f130829b, this.f130832e, this.f130833f.f130838d);
            }
        }
    }

    /* renamed from: a */
    private void m112025a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.a_s, this, true);
        this.f130828a = (SimpleDraweeView) findViewById(R.id.bkw);
        this.f130829b = (CheckView) findViewById(R.id.sw);
        this.f130830c = (ImageView) findViewById(R.id.akk);
        this.f130831d = (TextView) findViewById(R.id.dp6);
        this.f130828a.setOnClickListener(this);
        this.f130829b.setOnClickListener(this);
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m112025a(context);
    }
}
