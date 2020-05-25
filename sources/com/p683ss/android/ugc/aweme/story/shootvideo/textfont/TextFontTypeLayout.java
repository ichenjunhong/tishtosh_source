package com.p683ss.android.ugc.aweme.story.shootvideo.textfont;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.MaskBlurLightTextView;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextFontTypeLayout */
public class TextFontTypeLayout extends FrameLayout implements C46677a {

    /* renamed from: a */
    private MaskBlurLightTextView f117725a;

    /* renamed from: b */
    private View f117726b;

    /* renamed from: c */
    private ImageView f117727c;

    /* renamed from: d */
    private ObjectAnimator f117728d;

    /* renamed from: e */
    private C46678b f117729e;

    /* renamed from: f */
    private C46677a f117730f;

    /* renamed from: g */
    private Drawable f117731g;

    /* renamed from: h */
    private Drawable f117732h;

    public C46678b getFontData() {
        return this.f117729e;
    }

    public void setBackground(Drawable drawable) {
    }

    /* renamed from: a */
    public final boolean mo93598a() {
        if (this.f117729e == null || !this.f117729e.mo93620b()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m101272f() {
        if (this.f117728d != null) {
            this.f117728d.cancel();
        }
        this.f117728d = null;
        this.f117727c.setRotation(0.0f);
        this.f117727c.setImageDrawable(C0726c.m2091a(getContext(), (int) R.drawable.d3q));
    }

    /* renamed from: b */
    public final void mo93599b() {
        if (this.f117729e != null) {
            switch (this.f117729e.f117750h) {
                case 1:
                    this.f117727c.setVisibility(4);
                    return;
                case 2:
                    this.f117727c.setVisibility(0);
                    m101272f();
                    break;
                case 3:
                    this.f117727c.setVisibility(0);
                    m101271e();
                    return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo93601d() {
        if (this.f117729e != null) {
            Typeface c = C46679c.m101291a().mo93632c(this.f117729e.f117747e);
            if (c != null) {
                this.f117725a.setTypeface(c);
            }
            if (this.f117729e.mo93619a()) {
                this.f117725a.setMaskBlurColor(-6400);
            }
        }
    }

    /* renamed from: e */
    private void m101271e() {
        this.f117727c.setImageDrawable(C0726c.m2091a(getContext(), (int) R.drawable.aur));
        this.f117728d = ObjectAnimator.ofFloat(this.f117727c, "rotation", new float[]{0.0f, 360.0f});
        this.f117728d.setDuration(800);
        this.f117728d.setRepeatMode(1);
        this.f117728d.setRepeatCount(-1);
        this.f117728d.start();
    }

    /* renamed from: c */
    public final boolean mo93600c() {
        if (this.f117729e == null) {
            return false;
        }
        boolean z = true;
        if (this.f117729e.mo93620b()) {
            return true;
        }
        if (this.f117729e.f117750h != 3) {
            z = false;
        }
        if (z) {
            mo93599b();
            return false;
        } else if (!C46686g.m101320a(getContext())) {
            C10691a.m21542b(getContext(), (int) R.string.g1t).mo19066a();
            return false;
        } else {
            C46679c a = C46679c.m101291a();
            Context context = getContext();
            C46678b bVar = this.f117729e;
            if (context != null) {
                if (a.f117757e == null) {
                    a.f117757e = C29242c.m68869a(context, C46685f.f117766a);
                }
                a.f117757e.mo59123a(bVar.f117751i, (C48705j) new C48705j(this) {

                    /* renamed from: a */
                    final /* synthetic */ C46677a f117761a;

                    /* renamed from: a */
                    public final void mo8643a(Effect effect) {
                    }

                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo8638a(Object obj) {
                        C46678b a = C46679c.this.mo93621a((Effect) obj);
                        if (this.f117761a != null) {
                            if (a != null) {
                                this.f117761a.mo93596a(a, true, true);
                                return;
                            }
                            this.f117761a.mo93597a(true);
                        }
                    }

                    {
                        this.f117761a = r2;
                    }

                    /* renamed from: a */
                    public final void mo8644a(Effect effect, C48649d dVar) {
                        try {
                            C46678b bVar = (C46678b) C39629l.m88232a().mo58566D().mo34884a(effect.getExtra(), C46678b.class);
                            if (C46679c.this.f117754b.get(bVar.f117747e) != null) {
                                ((C46678b) C46679c.this.f117754b.get(bVar.f117747e)).f117750h = 2;
                            }
                            C46679c.m101292a(bVar, false, dVar.f122281c);
                        } catch (Exception unused) {
                        }
                        if (this.f117761a != null) {
                            this.f117761a.mo93597a(true);
                        }
                        StringBuilder sb = new StringBuilder("textFontDownload err: ");
                        sb.append(dVar.f122280b);
                        C45407ay.m98971b(sb.toString());
                    }
                });
            }
            this.f117729e.f117750h = 3;
            mo93599b();
            return false;
        }
    }

    public void setDownloadCallback(C46677a aVar) {
        this.f117730f = aVar;
    }

    public TextFontTypeLayout(Context context) {
        this(context, null);
    }

    public void setBackground(int i) {
        Drawable drawable;
        if (i != 1) {
            drawable = this.f117732h;
        } else {
            drawable = this.f117731g;
        }
        this.f117726b.setBackground(drawable);
    }

    /* access modifiers changed from: 0000 */
    public void setFontData(C46678b bVar) {
        if (bVar != null) {
            this.f117729e = bVar;
            if (!TextUtils.isEmpty(this.f117729e.f117744b)) {
                this.f117725a.setText(this.f117729e.f117744b);
            }
        }
    }

    /* renamed from: a */
    public final void mo93597a(boolean z) {
        if (this.f117729e != null) {
            this.f117729e.f117750h = 2;
            mo93599b();
        }
        if (this.f117730f != null) {
            this.f117730f.mo93597a(z);
        }
        if (z) {
            C10691a.m21537a(getContext(), getContext().getResources().getString(R.string.b5m)).mo19066a();
        }
    }

    public TextFontTypeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.a8q, this);
        this.f117725a = (MaskBlurLightTextView) inflate.findViewById(R.id.d1m);
        this.f117727c = (ImageView) inflate.findViewById(R.id.csr);
        this.f117726b = inflate.findViewById(R.id.dk8);
        int b = (int) C9432q.m18687b(getContext(), 4.0f);
        this.f117731g = C42430at.m93196a(-1, 16777215, (int) C9432q.m18687b(getContext(), 2.0f), b);
        this.f117732h = C42430at.m93196a(889192447, 16777215, 1, b);
    }

    /* renamed from: a */
    public final void mo93596a(C46678b bVar, boolean z, boolean z2) {
        mo93599b();
        if (!this.f117729e.mo93620b()) {
            if (z2) {
                C10691a.m21537a(getContext(), getContext().getResources().getString(R.string.b5m)).mo19066a();
            }
            return;
        }
        if (this.f117730f != null) {
            this.f117730f.mo93596a(this.f117729e, this.f117729e.mo93620b(), z2);
        }
        mo93601d();
    }
}
