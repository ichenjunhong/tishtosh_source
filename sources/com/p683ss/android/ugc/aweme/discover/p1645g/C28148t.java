package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27856bc;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28525az.C28526a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28604by;
import com.p683ss.android.ugc.aweme.location.C36265i;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.t */
public final class C28148t extends C28604by<SearchPoi> implements C26877c<SearchPoi> {

    /* renamed from: a */
    private double f73920a;

    /* renamed from: c */
    private double f73921c;

    /* renamed from: d */
    private HashMap f73922d;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return false;
    }

    /* renamed from: a */
    public final View mo56545a(int i) {
        if (this.f73922d == null) {
            this.f73922d = new HashMap();
        }
        View view = (View) this.f73922d.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73922d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo56547b_(boolean z) {
        return false;
    }

    /* renamed from: j */
    public final void mo56548j() {
        if (this.f73922d != null) {
            this.f73922d.clear();
        }
    }

    /* renamed from: l */
    public final String mo56549l() {
        return "poi";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo56548j();
    }

    /* renamed from: n */
    public final void mo56550n() {
        mo58298a((C28128i<?>) new C28152v<Object>());
        mo58297J().mo54800a((C26877c) this);
        mo58297J().f73866b = this;
    }

    /* renamed from: o */
    public final void mo56551o() {
        mo58239a((C26840g<D>) new C27856bc<D>(getContext(), new C27797ad(false), this.f74960l, this));
    }

    /* renamed from: m */
    public final void mo56568m() {
        if ((this.f74963o == 2 || this.f74963o == 5) && TextUtils.equals(this.f74960l, this.f74961m)) {
            mo58297J().mo56544b(C28526a.m67668a());
        } else {
            mo58297J().mo56544b(0);
        }
        mo58297J().mo44934a_(Integer.valueOf(4), mo58234G(), Integer.valueOf(1), Double.valueOf(this.f73920a), Double.valueOf(this.f73921c), Integer.valueOf(this.f74967s));
    }

    /* renamed from: a */
    public final void mo56546a(String str) {
        C52711k.m112240b(str, "keyword");
        if (mo58250x() != null) {
            C26840g x = mo58250x();
            if (x != null) {
                ((C27856bc) x).f73083f = str;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchPoiAdapter");
        }
    }

    /* renamed from: b */
    public final void mo56556b(int i) {
        mo58297J().mo44934a_(Integer.valueOf(1), this.f74960l, Integer.valueOf(i), Double.valueOf(this.f73920a), Double.valueOf(this.f73921c), Integer.valueOf(this.f74967s));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C39054d a = C36272l.m81897a(getContext()).mo75073a((C36265i) null);
        if (a != null) {
            this.f73920a = a.latitude;
            this.f73921c = a.longitude;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5 != false) goto L_0x001f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47026b(java.util.List<? extends com.p683ss.android.ugc.aweme.discover.model.SearchPoi> r4, boolean r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.discover.g.i r5 = r3.mo58297J()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.discover.g.v r5 = (com.p683ss.android.ugc.aweme.discover.p1645g.C28152v) r5
            com.ss.android.ugc.aweme.common.a r2 = r5.f70700f
            if (r2 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.common.a r5 = r5.f70700f
            com.ss.android.ugc.aweme.discover.g.u r5 = (com.p683ss.android.ugc.aweme.discover.p1645g.C28149u) r5
            boolean r5 = r5.isHasMore()
            if (r5 == 0) goto L_0x001a
            r5 = 1
            goto L_0x001b
        L_0x001a:
            r5 = 0
        L_0x001b:
            if (r5 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            super.mo47026b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1645g.C28148t.mo47026b(java.util.List, boolean):void");
    }
}
