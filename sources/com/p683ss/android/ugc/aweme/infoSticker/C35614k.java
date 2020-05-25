package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.utils.C47671al;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.k */
public final class C35614k extends C35620p {

    /* renamed from: a */
    protected int f91525a;

    /* renamed from: b */
    protected boolean f91526b;

    /* renamed from: p */
    private CategoryEffectModel f91527p;

    /* renamed from: q */
    private PanelInfoModel f91528q;

    /* renamed from: r */
    private String f91529r;

    /* renamed from: s */
    private int f91530s;

    /* renamed from: t */
    private String f91531t;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74022b() {
        m80430j();
    }

    /* renamed from: j */
    private void m80430j() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C35635v.m80462a(activity).mo73934a("emoji-android", "", 75, 0).observe(activity, new C35615l(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo74026e() {
        this.f91547l = mo74032h();
        this.f91547l.f91490n = "emoji";
        this.f91547l.mo74006a(this.f91546k, getActivity());
        this.f91547l.mo74003a();
        C35635v.m80463b(getActivity()).mo73990b().setValue(Boolean.valueOf(false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo74027f() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            InfoStickerViewModel a = C35635v.m80462a(activity);
            String str = this.f91529r;
            int i = this.f91525a;
            int i2 = this.f91530s;
            String str2 = this.f91531t;
            InfoStickerRepository infoStickerRepository = a.f91353a;
            C0198r rVar = new C0198r();
            rVar.setValue(C37721a.m84218a(C37722a.LOADING, null));
            infoStickerRepository.f91303a.mo59134a("emoji-android", str, true, 75, i, i2, str2, new C48701f(rVar) {

                /* renamed from: a */
                final /* synthetic */ C0198r f91322a;

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    this.f91322a.setValue(C37721a.m84218a(C37722a.SUCCESS, ((CategoryPageModel) obj).getCategoryEffects()));
                }

                /* renamed from: a */
                public final void mo59186a(C48649d dVar) {
                    this.f91322a.setValue(C37721a.m84218a(C37722a.ERROR, null));
                    StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                    sb.append(dVar.toString());
                    C39629l.m88232a().mo58567E().mo49428a("InfoStickerRepository", sb.toString());
                }

                {
                    this.f91322a = r2;
                }
            });
            rVar.observe(activity, new C35616m(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74020a() {
        mo74026e();
        this.f91542g = new GridLayoutManager(getContext(), 5, 1, false);
        this.f91539d.setItemViewCacheSize(5);
        this.f91539d.setLayoutManager(this.f91542g);
        if (this.f91539d.getAdapter() == null) {
            this.f91538c = new C35613j(getActivity(), this.f91541f);
            this.f91539d.setAdapter(this.f91538c);
        } else {
            this.f91538c = (C35610h) this.f91539d.getAdapter();
        }
        m80430j();
        this.f91538c.mo97992c(true);
        this.f91538c.f91375b = this.f91544i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo74024c() {
        if (!this.f91526b) {
            super.mo74024c();
        } else if (this.f91543h == C37722a.LOADING) {
            this.f91538c.mo97983d();
        } else if (this.f91543h == C37722a.ERROR) {
            this.f91538c.mo97984e();
        } else {
            if (this.f91543h == C37722a.SUCCESS) {
                if (this.f91527p == null || C9414h.m18630a(this.f91527p.getEffects())) {
                    this.f91538c.mo97985f();
                    return;
                }
                this.f91538c.mo97986g();
                int i = this.f91525a;
                this.f91525a = this.f91527p.getCursor();
                this.f91530s = this.f91527p.getSortingPosition();
                this.f91531t = this.f91527p.getVersion();
                ((C35613j) this.f91538c).mo74019a(this.f91527p);
                if (C47671al.m103181a()) {
                    this.f91538c.notifyDataSetChanged();
                    return;
                }
                this.f91538c.notifyItemRangeChanged(i, (this.f91525a - i) + 1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo74025d() {
        if (this.f91528q == null || this.f91528q.getCategoryEffectModel() == null) {
            this.f91540e.mo98097c();
            return;
        }
        this.f91540e.mo98093a();
        this.f91526b = true;
        this.f91527p = this.f91528q.getCategoryEffectModel();
        this.f91529r = this.f91527p.getCategoryKey();
        this.f91525a = this.f91527p.getCursor();
        this.f91530s = this.f91527p.getSortingPosition();
        this.f91531t = this.f91527p.getVersion();
        ((C35613j) this.f91538c).mo74019a(this.f91527p);
        if (C47671al.m103181a()) {
            this.f91538c.notifyDataSetChanged();
        } else {
            this.f91538c.notifyItemRangeChanged(0, this.f91525a);
        }
        this.f91538c.f125776r = new C35617n(this);
    }

    /* renamed from: a */
    public static C35614k m80429a(C35584av avVar) {
        C35614k kVar = new C35614k();
        kVar.f91550o = avVar;
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74021a(C37721a aVar) {
        if (aVar != null) {
            this.f91543h = aVar.f96126b;
            this.f91527p = (CategoryEffectModel) aVar.f96125a;
            mo74024c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74023b(C37721a aVar) {
        if (aVar != null) {
            this.f91543h = aVar.f96126b;
            this.f91528q = (PanelInfoModel) aVar.f96125a;
            mo74024c();
        }
    }
}
