package com.p683ss.android.ugc.aweme.infoSticker.category;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.infoSticker.C35584av;
import com.p683ss.android.ugc.aweme.infoSticker.C35635v;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.category.a */
public final class C35595a {

    /* renamed from: a */
    public static final float f91477a = C9432q.m18687b((Context) C39629l.m88233b(), 86.0f);

    /* renamed from: b */
    public static final float f91478b = C9432q.m18687b((Context) C39629l.m88233b(), 80.0f);

    /* renamed from: c */
    public FragmentActivity f91479c;

    /* renamed from: d */
    public TabLayout f91480d;

    /* renamed from: e */
    public LinearLayout f91481e;

    /* renamed from: f */
    public LinearLayout f91482f;

    /* renamed from: g */
    public AVDmtTextView f91483g;

    /* renamed from: h */
    public AVDmtTextView f91484h;

    /* renamed from: i */
    public int f91485i;

    /* renamed from: j */
    public View f91486j;

    /* renamed from: k */
    public boolean f91487k;

    /* renamed from: l */
    public Vibrator f91488l;

    /* renamed from: m */
    List<EffectCategoryResponse> f91489m;

    /* renamed from: n */
    public String f91490n;

    /* renamed from: o */
    public int f91491o;

    /* renamed from: p */
    public float f91492p;

    /* renamed from: q */
    public int f91493q = 8;

    /* renamed from: r */
    public float f91494r;

    /* renamed from: s */
    public float f91495s;

    /* renamed from: t */
    public float f91496t;

    /* renamed from: u */
    C35584av f91497u;

    /* renamed from: v */
    private float f91498v = 8.5f;

    /* renamed from: w */
    private float f91499w = 6.5f;

    /* renamed from: a */
    public final void mo74003a() {
        C35635v.m80463b(this.f91479c).mo73990b().observe(this.f91479c, new C0199s<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        C35595a.this.f91481e.setVisibility(0);
                        C35595a.this.f91480d.setVisibility(0);
                        return;
                    }
                    C35595a.this.f91481e.setVisibility(8);
                    C35595a.this.f91480d.setVisibility(8);
                }
            }
        });
    }

    /* renamed from: b */
    private void m80400b(InfoStickerTabItemView infoStickerTabItemView) {
        this.f91497u.mo73987b(infoStickerTabItemView, this.f91479c);
    }

    /* renamed from: a */
    public final void mo74004a(int i) {
        if (this.f91485i != i) {
            this.f91485i = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74007a(InfoStickerTabItemView infoStickerTabItemView) {
        this.f91497u.mo73983a(infoStickerTabItemView, this.f91479c);
    }

    public C35595a(C35584av avVar) {
        this.f91497u = avVar;
    }

    /* renamed from: a */
    public final void mo74005a(Bundle bundle, View view) {
        this.f91484h.setText(bundle.getString("bundle_subtitle"));
        this.f91482f.setTranslationY(0.0f);
        this.f91481e.setVisibility(8);
        view.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo74006a(View view, FragmentActivity fragmentActivity) {
        this.f91481e = (LinearLayout) view.findViewById(R.id.eca);
        this.f91482f = (LinearLayout) view.findViewById(R.id.ec9);
        this.f91483g = (AVDmtTextView) view.findViewById(R.id.ec_);
        this.f91484h = (AVDmtTextView) view.findViewById(R.id.ec8);
        this.f91480d = (TabLayout) view.findViewById(R.id.dzu);
        this.f91479c = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo74008a(C44709f fVar, int i) {
        C44709f a = this.f91480d.mo90679a(this.f91485i);
        if (this.f91485i != i) {
            if (a != null && (a.f113162f instanceof InfoStickerTabItemView)) {
                m80400b((InfoStickerTabItemView) a.f113162f);
            }
            if (fVar != null && (fVar.f113162f instanceof InfoStickerTabItemView)) {
                mo74007a((InfoStickerTabItemView) fVar.f113162f);
            }
        }
    }

    /* renamed from: a */
    public static void m80399a(View view, int i, int i2, int i3, int i4) {
        if (i != -1 || i3 != -1 || i4 != -1) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            if (i != -1) {
                marginLayoutParams.width = i;
            }
            if (i3 != -1) {
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginStart(i3);
                } else {
                    marginLayoutParams.leftMargin = i3;
                }
            }
            if (i4 != -1) {
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(i4);
                } else {
                    marginLayoutParams.rightMargin = i4;
                }
            }
            view.setLayoutParams(marginLayoutParams);
            view.invalidate();
        }
    }
}
