package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel.C35589a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p683ss.android.ugc.aweme.views.CircleDraweeView;
import com.p683ss.android.ugc.tools.view.p2509b.C50211c.C50213a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ag */
public final class C35560ag extends Fragment {

    /* renamed from: a */
    public boolean f91397a;

    /* renamed from: b */
    public C35562a f91398b;

    /* renamed from: c */
    public boolean f91399c;

    /* renamed from: d */
    public C50213a f91400d;

    /* renamed from: e */
    private C35549a<C35558ae> f91401e;

    /* renamed from: f */
    private List<C35558ae> f91402f;

    /* renamed from: g */
    private RecyclerView f91403g;

    /* renamed from: h */
    private GridLayoutManager f91404h;

    /* renamed from: i */
    private LinearLayout f91405i;

    /* renamed from: j */
    private TextView f91406j;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.ag$a */
    interface C35562a {
        /* renamed from: a */
        void mo73963a(int i);
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: a */
    public final void mo73960a(List<C35558ae> list) {
        if (!C9414h.m18630a(list)) {
            this.f91402f = list;
            if (this.f91401e != null) {
                this.f91401e.mo64318a(this.f91402f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo73959a(int i) {
        if (this.f91401e != null) {
            switch (i) {
                case -1:
                    this.f91401e.mo97986g();
                    return;
                case 0:
                    this.f91401e.mo97983d();
                    break;
                case 1:
                    this.f91401e.mo97985f();
                    return;
                case 2:
                    this.f91401e.mo97984e();
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void mo73962b(List<C35558ae> list) {
        if (!(C9414h.m18630a(list) || this.f91402f == null || this.f91401e == null)) {
            int itemCount = this.f91401e.getItemCount();
            this.f91402f.addAll(list);
            this.f91401e.f125763k = this.f91402f;
            this.f91401e.notifyItemRangeInserted(itemCount, list.size());
        }
    }

    /* renamed from: a */
    public final void mo73961a(boolean z) {
        int l = this.f91404h.mo4751l();
        for (int j = this.f91404h.mo4749j(); j <= l; j++) {
            C1352v f = this.f91403g.mo4847f(j);
            if (f instanceof C35564ai) {
                StickerImageView stickerImageView = ((C35564ai) f).f91409a;
                if (!stickerImageView.f112646b) {
                    CircleDraweeView circleDraweeView = stickerImageView.f112645a;
                    if (circleDraweeView == null) {
                        C52711k.m112237a("iconImageView");
                    }
                    circleDraweeView.mo95452a(z);
                }
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        int i;
        int i2;
        super.onActivityCreated(bundle);
        if (C35589a.m80398a()) {
            i = 4;
            this.f91405i.setVisibility(0);
            this.f91403g.setFadingEdgeLength((int) C9432q.m18687b((Context) getActivity(), 8.0f));
            this.f91403g.setVerticalFadingEdgeEnabled(true);
            int b = (int) C9432q.m18687b((Context) getActivity(), 0.0f);
            int b2 = (int) C9432q.m18687b((Context) getActivity(), 3.0f);
            this.f91403g.setPadding(b2, b, b2, b);
            if (getActivity() != null) {
                C0198r<Boolean> rVar = ((SearchInfoStickerViewModel) C0214z.m440a(getActivity()).mo359a(SearchInfoStickerViewModel.class)).f91373a;
                TextView textView = this.f91406j;
                if (rVar.getValue() == null || !((Boolean) rVar.getValue()).booleanValue()) {
                    i2 = R.string.das;
                } else {
                    i2 = R.string.dar;
                }
                textView.setText(i2);
            }
        } else {
            i = 3;
        }
        this.f91404h = new GridLayoutManager(getContext(), i, 1, false);
        this.f91403g.setItemViewCacheSize(i);
        this.f91403g.setLayoutManager(this.f91404h);
        if (this.f91403g.getAdapter() == null) {
            this.f91401e = new C35559af(getActivity());
            this.f91403g.setAdapter(this.f91401e);
        } else {
            this.f91401e = (C35559af) this.f91403g.getAdapter();
        }
        this.f91401e.mo97992c(true);
        this.f91401e.f91375b = this.f91397a;
        if (!C9414h.m18630a(this.f91402f)) {
            this.f91401e.mo64318a(this.f91402f);
        }
        this.f91401e.f125776r = this.f91400d;
        this.f91403g.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                boolean z;
                super.onScrollStateChanged(recyclerView, i);
                if (C35560ag.this.f91398b != null) {
                    C35560ag.this.f91398b.mo73963a(i);
                }
                C35560ag agVar = C35560ag.this;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                agVar.f91399c = z;
                C35560ag.this.mo73961a(C35560ag.this.f91399c);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                C35560ag.this.mo73961a(C35560ag.this.f91399c);
            }
        });
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vd, viewGroup, false);
        this.f91403g = (RecyclerView) inflate.findViewById(R.id.ct3);
        this.f91405i = (LinearLayout) inflate.findViewById(R.id.ec9);
        this.f91406j = (TextView) inflate.findViewById(R.id.ec8);
        return inflate;
    }
}
