package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.arch.lifecycle.C0199s;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImActiveStateEnhanceExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate.C34169a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35269i;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.p */
public final class C34665p extends C34667r {

    /* renamed from: h */
    private final AppCompatTextView f89288h;

    /* renamed from: i */
    private final ImageView f89289i;

    /* renamed from: j */
    private final DmtTextView f89290j;

    /* renamed from: k */
    private SessionListUserActiveViewModel f89291k;

    /* renamed from: l */
    private C0199s<Map<String, Long>> f89292l;

    /* renamed from: m */
    private C52847n<Boolean, String> f89293m;

    /* renamed from: n */
    private final DmtTextView f89294n;

    /* renamed from: o */
    private boolean f89295o;

    /* renamed from: p */
    private boolean f89296p = ImActiveStateEnhanceExperiment.m76317a();

    /* renamed from: q */
    private int f89297q = C23728o.m58241a(18.0d);

    /* renamed from: r */
    private int f89298r = C23728o.m58241a(3.0d);

    /* renamed from: s */
    private int f89299s = C23728o.m58241a(1.0d);

    /* renamed from: b */
    public final void mo72730b() {
        super.mo72730b();
        this.f89295o = false;
        this.f89291k.mo72624a().removeObserver(this.f89292l);
    }

    /* renamed from: e */
    private void m78643e() {
        if (this.f89296p) {
            LayoutParams layoutParams = this.f89289i.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.width = this.f89297q;
                marginLayoutParams.height = this.f89297q;
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(this.f89299s);
                }
                marginLayoutParams.rightMargin = this.f89299s;
                marginLayoutParams.bottomMargin = this.f89299s;
            }
            this.f89289i.setPadding(this.f89298r, this.f89298r, this.f89298r, this.f89298r);
            this.f89289i.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo72727a() {
        super.mo72727a();
        this.f89295o = true;
        m78644f();
        if (this.itemView.getContext() instanceof FragmentActivity) {
            this.f89291k.mo72624a().observe((FragmentActivity) this.itemView.getContext(), this.f89292l);
        }
    }

    /* renamed from: c */
    public final void mo72731c() {
        String a = C35269i.f90607a.mo73368a(C11182d.m22641a().mo20658a(this.f89306f.bm_()), true);
        if (!TextUtils.isEmpty(a)) {
            C35193ai.m79545a(this.f89306f.bm_(), String.valueOf(C11190e.m22685a(this.f89306f.bm_())), a);
        }
    }

    /* renamed from: f */
    private void m78644f() {
        if (this.f89295o && this.f89306f != null && this.f89306f.mo72634b() == 0 && this.f89293m != null && !TextUtils.isEmpty((CharSequence) this.f89293m.getSecond())) {
            C52847n nVar = (C52847n) this.f89291k.mo72627d().get(this.f89306f.bm_());
            if (nVar == null || this.f89293m.getFirst() != nVar.getFirst()) {
                C35193ai.m79546a("online_status_cell_show", ((Boolean) this.f89293m.getFirst()).booleanValue(), (String) this.f89293m.getSecond(), String.valueOf(C11190e.m22685a(this.f89306f.bm_())));
            }
            this.f89291k.mo72627d().put(this.f89306f.bm_(), this.f89293m);
        }
    }

    /* renamed from: d */
    private void m78642d() {
        C11207p pVar;
        int e = C33229c.f86227e.mo70572e();
        if (C34886b.m78989c()) {
            if (this.f89306f.mo72634b() != 0) {
                this.f89289i.setVisibility(8);
                m78641a(this.f89301a.getText(), this.f89302b.getText());
                return;
            }
            Map map = (Map) this.f89291k.mo72624a().getValue();
            Long valueOf = Long.valueOf(0);
            if (map != null) {
                valueOf = (Long) map.get(this.f89306f.bm_());
            }
            if (valueOf == null) {
                valueOf = Long.valueOf(0);
            }
            C52847n<Boolean, String> a = C34886b.m78988a(valueOf.longValue());
            if (e == 2) {
                C11180b a2 = C11182d.m22641a().mo20658a(this.f89306f.bm_());
                if (a2 == null || a2.getLastMessage() == null) {
                    pVar = null;
                } else {
                    pVar = a2.getLastMessage();
                }
                if (this.f89306f.f91119j > 0 || TextUtils.isEmpty((CharSequence) a.getSecond()) || (pVar != null && System.currentTimeMillis() - pVar.getCreatedAt() < 1800000)) {
                    m78641a(this.f89301a.getText(), this.f89302b.getText());
                } else {
                    m78641a((CharSequence) a.getSecond(), (CharSequence) null);
                }
            } else if (e == 3) {
                if (!TextUtils.isEmpty((CharSequence) a.getSecond())) {
                    this.f89288h.setText((CharSequence) a.getSecond());
                    this.f89288h.setVisibility(0);
                }
                m78641a((CharSequence) null, (CharSequence) null);
            }
            if (((Boolean) a.getFirst()).booleanValue()) {
                m78643e();
                this.f89289i.setVisibility(0);
                this.f89303c.setVisibility(8);
            } else {
                this.f89289i.setVisibility(8);
            }
            this.f89293m = a;
            m78644f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo72729a(Map map) {
        m78642d();
    }

    public C34665p(View view, C34647a aVar) {
        super(view, aVar);
        this.f89288h = (AppCompatTextView) view.findViewById(R.id.cxk);
        this.f89289i = (ImageView) view.findViewById(R.id.f74);
        this.f89290j = (DmtTextView) view.findViewById(R.id.f03);
        this.f89294n = (DmtTextView) view.findViewById(R.id.ers);
        this.f89291k = SessionListUserActiveViewModel.m78491a((FragmentActivity) view.getContext());
        this.f89292l = new C34666q(this);
    }

    /* renamed from: a */
    private void m78641a(CharSequence charSequence, CharSequence charSequence2) {
        int e = C33229c.f86227e.mo70572e();
        if (!C34886b.m78989c() || e != 2) {
            this.f89302b.setVisibility(0);
            this.f89290j.setVisibility(8);
            return;
        }
        this.f89302b.setWidth(C23728o.m58241a(34.0d));
        this.f89302b.setVisibility(4);
        if (!TextUtils.isEmpty(charSequence2)) {
            if (!TextUtils.isEmpty(charSequence)) {
                StringBuilder sb = new StringBuilder(" · ");
                sb.append(charSequence2);
                charSequence2 = sb.toString();
            }
            this.f89290j.setText(charSequence2);
            this.f89290j.setVisibility(0);
        } else {
            this.f89290j.setVisibility(8);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f89301a.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo72728a(C35456b bVar, int i) {
        super.mo72728a(bVar, i);
        this.f89293m = null;
        if (bVar.mo72634b() != 0 || this.f89304d.checkEnableExperiment(4)) {
            this.f89288h.setVisibility(8);
        } else {
            C34567a aVar = (C34567a) bVar;
            if (aVar.mo72635c() == null || aVar.mo72635c().getFollowStatus() != 2) {
                this.f89288h.setVisibility(8);
            } else {
                int a = C34169a.m77980a().mo72157a(String.valueOf(C11190e.m22685a(bVar.bm_())));
                if (a > 1) {
                    this.f89288h.setText(C11010c.m22280a().getString(R.string.bp5, new Object[]{C34169a.m77981a(a)}));
                    this.f89288h.setVisibility(0);
                } else if (a == 1) {
                    this.f89288h.setText(C11010c.m22280a().getString(R.string.bp6));
                    this.f89288h.setVisibility(0);
                } else {
                    this.f89288h.setVisibility(8);
                }
            }
        }
        if (bVar.mo72634b() == 0) {
            String a2 = C35269i.f90607a.mo73368a(C11182d.m22641a().mo20658a(bVar.bm_()), true);
            if (!TextUtils.isEmpty(a2)) {
                this.f89294n.setText(a2);
                this.f89294n.setVisibility(0);
            } else {
                this.f89294n.setVisibility(8);
            }
        } else {
            this.f89294n.setVisibility(8);
        }
        m78642d();
    }
}
