package com.p683ss.android.ugc.aweme.flowfeed.p1757f;

import android.support.p030v4.p038f.C0794k;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.p1270c.C20940a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31762b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.f.f */
public final class C31777f extends C20940a<C30508z, C31835c> implements C31754a {

    /* renamed from: a */
    public String f82987a;

    /* renamed from: b */
    protected String f82988b;

    /* renamed from: c */
    protected Aweme f82989c;

    /* renamed from: d */
    private int f82990d;

    /* renamed from: e */
    private Map<String, Aweme> f82991e;

    /* renamed from: f */
    public final void mo64733f() {
        C47718bf.m103290c(this);
    }

    /* renamed from: g */
    public final void mo64734g() {
        C47718bf.m103291d(this);
    }

    /* renamed from: e */
    public final int mo64732e() {
        if (this.f70700f == null) {
            return 0;
        }
        return ((C30508z) this.f70700f).f79722a;
    }

    /* renamed from: b */
    public final void mo44838b() {
        C0794k kVar;
        if (this.f70701g != null && ((C31835c) this.f70701g).isViewValid()) {
            if (this.f70700f == null) {
                kVar = null;
            } else {
                kVar = (C0794k) ((C30508z) this.f70700f).getData();
            }
            if (kVar != null) {
                if (this.f82991e.containsKey(kVar.f2711a)) {
                    Aweme aweme = (Aweme) this.f82991e.get(kVar.f2711a);
                    if (!(aweme == null || aweme.getForwardItem() == null)) {
                        m73884a(aweme.getForwardItem().getAid(), ((Integer) kVar.f2712b).intValue());
                        this.f82991e.remove(kVar.f2711a);
                    }
                }
                m73884a((String) kVar.f2711a, ((Integer) kVar.f2712b).intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo54800a(C31835c cVar) {
        super.mo54800a(cVar);
        cVar.mo64869a(this);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null && ((C31835c) this.f70701g).isViewValid()) {
            ((C31835c) this.f70701g).mo64870a(exc, this.f82989c);
        }
    }

    @C53771m
    public final void onFollowFeedDetailEvent(C31762b bVar) {
        if (this.f70701g != null && ((C31835c) this.f70701g).isViewValid() && bVar.f82957a == 0) {
            ((C31835c) this.f70701g).mo64865a(bVar.f82958b);
        }
    }

    public C31777f(String str, int i) {
        this(str, null, i);
    }

    /* renamed from: a */
    private void m73884a(String str, int i) {
        C23324d.m57378a().updateUserDigg(str, i);
        C30332aw awVar = new C30332aw(13, str);
        awVar.f79231d = this.f82987a;
        awVar.f79232e = this.f82987a;
        C47718bf.m103288a(awVar);
    }

    public C31777f(String str, String str2, int i) {
        this.f82987a = str;
        this.f82988b = str2;
        this.f82990d = i;
        this.f82991e = new HashMap();
    }

    /* renamed from: a */
    public final void mo64652a(Aweme aweme, int i, String str, long j) {
        if (this.f70701g != null && ((C31835c) this.f70701g).isViewValid()) {
            if (!C23718g.m58207b().mo49153d()) {
                if (((C31835c) this.f70701g).getContext() != null) {
                    C10691a.m21542b(((C31835c) this.f70701g).getContext(), (int) R.string.cg1).mo19066a();
                }
                return;
            }
            this.f82989c = aweme;
            JSONObject requestIdAndOrderJsonObject = C23325e.m57379a().getRequestIdAndOrderJsonObject(this.f82989c, this.f82990d);
            if (i == 1) {
                C23794bh.m58392f().mo64992a(this.f82989c, this.f82987a, this.f82988b, this.f82990d, str, j);
            } else {
                C26890h.m65006a(C11010c.m22280a(), "like_cancel", this.f82987a, this.f82989c.getAid(), 0, requestIdAndOrderJsonObject);
                C23794bh.m58392f().mo64990a(this.f82989c, this.f82987a, this.f82990d);
            }
            mo44934a_(this.f82989c.getAid(), Integer.valueOf(i), this.f82987a);
        }
    }

    /* renamed from: b */
    public final void mo64653b(Aweme aweme, int i, String str, long j) {
        if (this.f70701g != null && ((C31835c) this.f70701g).isViewValid()) {
            if (!C23718g.m58207b().mo49153d()) {
                if (((C31835c) this.f70701g).getContext() != null) {
                    C10691a.m21542b(((C31835c) this.f70701g).getContext(), (int) R.string.cg1).mo19066a();
                }
            } else if (aweme.getForwardItem() != null) {
                this.f82989c = aweme;
                C23794bh.m58392f().mo64992a(this.f82989c, this.f82987a, this.f82988b, this.f82990d, str, j);
                mo44934a_(this.f82989c.getAid(), this.f82989c.getForwardItem().getAid(), Integer.valueOf(1), this.f82987a);
                this.f82991e.put(this.f82989c.getAid(), this.f82989c);
            }
        }
    }
}
