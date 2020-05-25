package com.bytedance.android.livesdk.gift.p356d;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.C2240a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.common.utility.C9414h;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.gift.d.b */
public abstract class C7230b<T extends C7490a> extends C7232c<T> {

    /* renamed from: a */
    protected HSImageView f19622a;

    /* renamed from: b */
    protected ImageView f19623b;

    /* renamed from: c */
    protected View f19624c;

    /* renamed from: d */
    protected View f19625d;

    /* renamed from: n */
    private View f19626n;

    /* renamed from: o */
    private SpecialCombView f19627o;

    /* renamed from: p */
    private ComboTarget f19628p;

    /* renamed from: a */
    public ComboTarget mo13462a() {
        return this.f19628p;
    }

    /* renamed from: a */
    public void mo13465a(boolean z) {
        int i;
        if (this.f19625d != null) {
            View view = this.f19625d;
            if (z) {
                i = R.drawable.bhv;
            } else {
                i = 0;
            }
            view.setBackgroundResource(i);
        }
    }

    public C7230b(View view) {
        super(view);
        this.f19624c = view.findViewById(R.id.cke);
        this.f19625d = view.findViewById(R.id.al4);
        this.f19623b = (ImageView) view.findViewById(R.id.a5g);
        this.f19622a = (HSImageView) view.findViewById(R.id.a5h);
        this.f19626n = view.findViewById(R.id.ji);
        this.f19627o = (SpecialCombView) view.findViewById(R.id.clh);
    }

    /* renamed from: a */
    public void mo13464a(T t) {
        boolean z;
        super.mo13464a(t);
        if (!(t.f20516d instanceof C7505d) || ((C7505d) t.f20516d).f20544e != 9) {
            String string = this.f19630e.getString(R.string.e8s);
            if (string.contains("%d")) {
                String replace = string.replace("%d", "%s");
                this.f19634i.setText(C2240a.m6773a(Locale.getDefault(), replace, new Object[]{String.valueOf(t.mo13904a())}));
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f19634i.setText(this.f19630e.getString(R.string.e8s, new Object[]{Integer.valueOf(t.mo13904a())}));
            }
        } else {
            this.f19634i.setVisibility(8);
        }
        this.f19635j.setVisibility(8);
        this.f19622a.setVisibility(8);
        if (t.mo13920q() != null && C9414h.m18631b(t.mo13920q().getUrls())) {
            this.f19622a.setVisibility(0);
            C3899m.m9858a(this.f19622a, t.mo13920q(), (C3910a) new C3910a() {
                /* renamed from: a */
                public final void mo9270a(ImageModel imageModel) {
                }

                /* renamed from: a */
                public final void mo9272a(ImageModel imageModel, Exception exc) {
                    C7230b.this.f19622a.setVisibility(8);
                }

                /* renamed from: a */
                public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                    LayoutParams layoutParams = C7230b.this.f19622a.getLayoutParams();
                    layoutParams.width = (int) (((float) layoutParams.height) * (((float) i) / ((float) i2)));
                    C7230b.this.f19622a.setLayoutParams(layoutParams);
                    C7230b.this.f19622a.setVisibility(0);
                }
            });
        }
        if (t.mo13905b() && (t.mo13917n() == null || TextUtils.isEmpty(t.mo13917n().getUri()))) {
            ((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo9431a()).intValue();
        }
        this.f19624c.setVisibility(8);
        mo13465a(t.f20514b);
        if (!t.f20515c || t.mo13906c() || !((C8794c) C4116c.m10249a(C8794c.class)).mo15493a(t.mo13918o())) {
            this.f19633h.setAlpha(1.0f);
        } else {
            this.f19633h.setAlpha(0.32f);
        }
        if (this.f19628p == null) {
            this.f19628p = new ComboTarget(this.f19627o, this.f19626n);
        }
        this.f19628p.hideAll();
    }
}
