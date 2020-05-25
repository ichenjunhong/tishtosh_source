package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.model.NearbySearchHistoryManager;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.au */
public final class C28512au extends C28615cd {

    /* renamed from: v */
    private HashMap f74937v;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.au$a */
    static final class C28513a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f74938a;

        /* renamed from: b */
        final /* synthetic */ int f74939b;

        C28513a(FrameLayout frameLayout, int i) {
            this.f74938a = frameLayout;
            this.f74939b = i;
        }

        public final void run() {
            LayoutParams layoutParams = this.f74938a.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof MarginLayoutParams)) {
                ((MarginLayoutParams) layoutParams).leftMargin = this.f74939b;
                this.f74938a.setLayoutParams(layoutParams);
            }
            View findViewById = this.f74938a.findViewById(R.id.ac_);
            C52711k.m112236a((Object) findViewById, "etTextView");
            LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (layoutParams2 instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin += this.f74939b;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: d */
    public final View mo58174d(int i) {
        if (this.f74937v == null) {
            this.f74937v = new HashMap();
        }
        View view = (View) this.f74937v.get(Integer.valueOf(R.id.esv));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.esv);
            this.f74937v.put(Integer.valueOf(R.id.esv), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo58175h() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo58177j() {
        super.mo58177j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo58178o() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58181s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo58179q() {
        return false;
    }

    /* renamed from: s */
    public final void mo58181s() {
        if (this.f74937v != null) {
            this.f74937v.clear();
        }
    }

    /* renamed from: r */
    public final SearchHistoryManager mo58180r() {
        return NearbySearchHistoryManager.INSTANCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo58176i() {
        FrameLayout frameLayout;
        super.mo58176i();
        View view = getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.dyj);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            frameLayout = (FrameLayout) view2.findViewById(R.id.ah7);
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            View findViewById2 = frameLayout.findViewById(R.id.b3y);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        }
        if (frameLayout != null) {
            DmtTextView dmtTextView = new DmtTextView(getActivity());
            dmtTextView.setTextSize(1, 15.0f);
            dmtTextView.setGravity(16);
            dmtTextView.setTextColor(Color.parseColor("#80FFFFFF"));
            dmtTextView.setText("同城");
            View view3 = dmtTextView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            View view4 = getView();
            if (view4 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) view4, "view!!");
            layoutParams.leftMargin = (int) C9432q.m18687b(view4.getContext(), 10.0f);
            frameLayout.addView(view3, layoutParams);
        }
        View view5 = getView();
        if (view5 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) view5, "view!!");
        int b = (int) C9432q.m18687b(view5.getContext(), 16.0f);
        if (frameLayout != null) {
            frameLayout.post(new C28513a(frameLayout, b));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58172a(boolean z) {
        return C41440e.FROM_NEARBY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C28541bb mo58173c(C41440e eVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_param", eVar);
        C28511at atVar = new C28511at();
        atVar.setArguments(bundle);
        C52711k.m112236a((Object) atVar, "SearchContainerFragment.…wInstanceForNearby(param)");
        return atVar;
    }
}
