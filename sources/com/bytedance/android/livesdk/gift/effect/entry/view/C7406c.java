package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3909r.C3911b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.chatroom.p310f.C5235t;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.bytedance.android.livesdk.gift.effect.p358a.C7327a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14234d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.c */
public final class C7406c extends LinearLayout {

    /* renamed from: a */
    public ImageView f20284a = ((ImageView) findViewById(R.id.apa));

    /* renamed from: b */
    public C7327a f20285b;

    /* renamed from: c */
    private TextView f20286c = ((TextView) findViewById(R.id.dn7));

    /* renamed from: d */
    private TextView f20287d = ((TextView) findViewById(R.id.a4o));

    /* renamed from: e */
    private ImageView f20288e = ((ImageView) findViewById(R.id.cs1));

    /* renamed from: f */
    private View f20289f = findViewById(R.id.jg);

    private int getLayoutResource() {
        return R.layout.ap4;
    }

    public final void setDrawingCacheListener(C7327a aVar) {
        this.f20285b = aVar;
    }

    public C7406c(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
    }

    public final void setUI(C7394a aVar) {
        int i = aVar.f20193k;
        this.f20286c.setText(aVar.f20184b);
        if (i == 2) {
            this.f20287d.setText(R.string.e_n);
            this.f20286c.setTextColor(getResources().getColor(R.color.alj));
            this.f20287d.setTextColor(getResources().getColor(R.color.alj));
        } else {
            this.f20287d.setText(R.string.e_o);
            this.f20286c.setTextColor(getResources().getColor(R.color.alk));
            this.f20287d.setTextColor(getResources().getColor(R.color.alk));
        }
        if (i == 0) {
            this.f20289f.setBackgroundResource(R.drawable.bos);
            this.f20288e.setBackgroundResource(R.drawable.byx);
        } else if (i == 2) {
            this.f20289f.setBackgroundResource(R.drawable.boq);
            this.f20288e.setBackgroundResource(R.drawable.byw);
        } else {
            this.f20289f.setBackgroundResource(R.drawable.bor);
            this.f20288e.setBackgroundResource(R.drawable.byx);
        }
        if (i == 0) {
            this.f20284a.setBackgroundResource(R.drawable.c16);
        } else {
            C3899m.m9865a(aVar.f20191i, 0, 0, (C3911b) new C3911b() {
                /* renamed from: a */
                public final void mo9273a(Bitmap bitmap) {
                    if (bitmap != null) {
                        C7406c.this.f20284a.setImageBitmap(bitmap);
                        C7406c.this.invalidate();
                        if (C7406c.this.f20285b != null) {
                            C7406c.this.f20285b.updateDrawingCache(C7406c.this);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo13696a(CharSequence charSequence, ImageModel imageModel, ImageModel imageModel2) {
        if (this.f20289f != null && !TextUtils.isEmpty(charSequence) && imageModel2 != null) {
            this.f20287d.setVisibility(8);
            this.f20288e.setVisibility(8);
            this.f20286c.setText(charSequence);
            this.f20286c.setEllipsize(null);
            this.f20286c.setMaxWidth(this.f20289f.getWidth());
            C5235t.m11853a(imageModel2, this.f20289f, C4206c.m10426a(C3922z.m9915e()), new Runnable() {
                public final void run() {
                    if (C7406c.this.f20285b != null) {
                        C7406c.this.f20285b.updateDrawingCache(C7406c.this);
                    }
                }
            });
            C3899m.m9866a(C3899m.m9867a(imageModel, (C13952d) null, (C14234d) null, false), (C3911b) new C3911b() {
                /* renamed from: a */
                public final void mo9273a(Bitmap bitmap) {
                    if (bitmap != null && C7406c.this.f20284a != null && bitmap.getHeight() > 0 && bitmap.getWidth() > 0) {
                        LayoutParams layoutParams = C7406c.this.f20284a.getLayoutParams();
                        int height = C7406c.this.f20284a.getHeight();
                        layoutParams.height = height;
                        layoutParams.width = (bitmap.getWidth() * height) / bitmap.getHeight();
                        C7406c.this.f20284a.setLayoutParams(layoutParams);
                        C7406c.this.f20284a.setScaleType(ScaleType.FIT_XY);
                        C7406c.this.f20284a.setImageBitmap(bitmap);
                        C7406c.this.invalidate();
                        if (C7406c.this.f20285b != null) {
                            C7406c.this.f20285b.updateDrawingCache(C7406c.this);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo13695a(C7394a aVar, int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (aVar != null && this.f20289f != null) {
            LayoutParams layoutParams = this.f20289f.getLayoutParams();
            layoutParams.height = i;
            this.f20289f.setLayoutParams(layoutParams);
            if (i2 != -1) {
                this.f20289f.setBackgroundResource(i2);
            }
            this.f20288e.setVisibility(8);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f20287d.setText(charSequence);
            } else {
                this.f20287d.setText(R.string.e_o);
            }
            this.f20286c.setText(aVar.f20184b);
            if (i3 != -1) {
                this.f20286c.setTextColor(getResources().getColor(i3));
            }
            if (i4 != -1) {
                this.f20287d.setTextColor(getResources().getColor(i4));
            }
            C3899m.m9865a(aVar.f20191i, 0, 0, (C3911b) new C3911b() {
                /* renamed from: a */
                public final void mo9273a(Bitmap bitmap) {
                    if (bitmap != null) {
                        C7406c.this.f20284a.setImageBitmap(bitmap);
                        C7406c.this.invalidate();
                        if (C7406c.this.f20285b != null) {
                            C7406c.this.f20285b.updateDrawingCache(C7406c.this);
                        }
                    }
                }
            });
        }
    }
}
