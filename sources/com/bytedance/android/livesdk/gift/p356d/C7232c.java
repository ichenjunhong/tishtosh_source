package com.bytedance.android.livesdk.gift.p356d;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.p377g.C7454d;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.d.c */
public abstract class C7232c<T extends C7491b> extends C1352v {

    /* renamed from: e */
    protected final Context f19630e;

    /* renamed from: f */
    TextView f19631f;

    /* renamed from: g */
    HSImageView f19632g;

    /* renamed from: h */
    View f19633h;

    /* renamed from: i */
    TextView f19634i;

    /* renamed from: j */
    ImageView f19635j;

    /* renamed from: k */
    ImageView f19636k;

    /* renamed from: l */
    public C7235a f19637l;

    /* renamed from: m */
    public final float f19638m = C9432q.m18687b(this.f19630e, 13.0f);

    /* renamed from: com.bytedance.android.livesdk.gift.d.c$a */
    public interface C7235a {
        /* renamed from: a */
        void mo13467a(C7232c cVar, C7491b bVar);
    }

    /* renamed from: a */
    public abstract ComboTarget mo13462a();

    public C7232c(View view) {
        super(view);
        this.f19630e = view.getContext();
        this.f19633h = view;
        this.f19631f = (TextView) view.findViewById(R.id.bpp);
        this.f19632g = (HSImageView) view.findViewById(R.id.a22);
        this.f19634i = (TextView) view.findViewById(R.id.a5f);
        this.f19635j = (ImageView) view.findViewById(R.id.a5g);
        this.f19636k = (ImageView) view.findViewById(R.id.ba3);
    }

    /* renamed from: a */
    public void mo13464a(final T t) {
        this.f19635j.setVisibility(8);
        if (t.mo13914k() == -1) {
            this.f19631f.setTextColor(this.f19630e.getResources().getColor(C7454d.m15401a().mo13862c()));
        } else if (t.mo13914k() != 0) {
            this.f19631f.setTextColor(t.mo13914k());
        } else {
            this.f19631f.setTextColor(this.f19630e.getResources().getColor(R.color.ab9));
        }
        this.f19631f.setText(t.mo13913j());
        if (t.mo13916m() == -1711276033) {
            this.f19634i.setTextColor(this.f19630e.getResources().getColor(C7454d.m15401a().mo13863d()));
        } else if (t.mo13916m() != 0) {
            this.f19634i.setTextColor(t.mo13916m());
        } else {
            this.f19634i.setTextColor(this.f19630e.getResources().getColor(R.color.ags));
        }
        if (t != null && !TextUtils.isEmpty(t.mo13915l())) {
            this.f19634i.setText(t.mo13915l());
        }
        if (t.mo13917n() == null || TextUtils.isEmpty(t.mo13917n().getUri())) {
            this.f19636k.setVisibility(8);
        } else {
            this.f19636k.setVisibility(0);
            C5213c.m11819a(this.f19636k, t.mo13917n(), (C3910a) new C3910a() {
                /* renamed from: a */
                public final void mo9270a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo9272a(ImageModel imageModel, Exception exc) {
                }

                /* renamed from: a */
                public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                    if (i != 0 && i2 != 0) {
                        LayoutParams layoutParams = C7232c.this.f19636k.getLayoutParams();
                        layoutParams.width = (int) (((float) i) * (C7232c.this.f19638m / ((float) i2)));
                        C7232c.this.f19636k.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        C3899m.m9858a(this.f19632g, t.mo13918o(), (C3910a) new C3910a() {
            /* renamed from: a */
            public final void mo9270a(ImageModel imageModel) {
            }

            /* renamed from: a */
            public final void mo9272a(ImageModel imageModel, Exception exc) {
                if (t.f20513a == 1) {
                    C7647s.m15651a(t.mo13919p(), imageModel.getUri(), exc.getMessage());
                }
            }

            /* renamed from: a */
            public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                if (t.f20513a == 1) {
                    C7647s.m15650a(t.mo13919p(), imageModel.getUri());
                }
            }
        });
        if (t.f20515c) {
            this.f19633h.setAlpha(0.32f);
        } else {
            this.f19633h.setAlpha(1.0f);
        }
        this.f19633h.setOnClickListener(new C7236d(this, t));
    }

    /* renamed from: a */
    public void mo13466a(T t, List<Object> list) {
        mo13464a(t);
    }
}
