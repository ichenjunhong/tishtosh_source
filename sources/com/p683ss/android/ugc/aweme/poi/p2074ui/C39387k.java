package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39065f.C39066a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.C39067g.C39068a;
import com.p683ss.android.ugc.aweme.poi.adapter.C38971c;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j.C39386a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.k */
public class C39387k extends C31817a<C38973e, C37859b> {

    /* renamed from: k */
    protected String f100744k;

    /* renamed from: l */
    protected String f100745l;

    /* renamed from: m */
    public C39067g f100746m;

    /* renamed from: n */
    protected C39384j f100747n;

    /* renamed from: o */
    public boolean f100748o;

    /* renamed from: p */
    protected long f100749p = 9999;

    /* renamed from: q */
    protected String f100750q = "";

    /* renamed from: r */
    protected String f100751r = "";

    /* renamed from: s */
    public C38999a f100752s;

    /* renamed from: t */
    protected C39386a f100753t;

    /* renamed from: u */
    public int f100754u;

    /* renamed from: v */
    protected String f100755v;

    /* renamed from: b */
    public final void mo64880b() {
    }

    /* renamed from: e */
    public void mo64889e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C38971c mo80102j() {
        return null;
    }

    /* renamed from: d */
    public final C31755b mo64888d() {
        return new C31755b() {
            /* renamed from: d */
            public final String mo64657d() {
                return "key_container_poi";
            }

            /* renamed from: a */
            public final boolean mo64654a() {
                if (C39387k.this.f83141h == null || !C39387k.this.f83141h.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo64656c() {
                if (C39387k.this.f83141h != null) {
                    return C39387k.this.f83141h.getActivity();
                }
                return C39387k.this.f83135b.getContext();
            }

            /* renamed from: b */
            public final boolean mo64655b() {
                if (C39387k.this.f83141h == null || !C39387k.this.f83141h.getLifecycle().mo323a().equals(C0178b.RESUMED) || !C39387k.this.f83141h.getUserVisibleHint()) {
                    return false;
                }
                return true;
            }
        };
    }

    public void ar_() {
        if (isViewValid() && this.f100747n.mo54803n() != null && ((!(this.f100747n.mo54803n() instanceof C26875a) || !((C26875a) this.f100747n.mo54803n()).isDataEmpty()) && ((C39140x) this.f100747n.mo54803n()).isHasMore() && this.f100747n != null)) {
            C39384j jVar = this.f100747n;
            C39066a a = new C39066a().mo79228b(3).mo79225a(this.f100744k);
            a.f99641k = this.f100749p;
            jVar.mo44934a_(Integer.valueOf(4), a.mo79229b(this.f100750q).mo79230c(this.f100751r).mo79231d(this.f100745l).mo79227a());
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C31749e mo64886c() {
        this.f83139f = new C38973e(this.f83135b, this.f100753t.mo80012D());
        ((C38973e) this.f83139f).mo54792d(R.string.dle);
        ((C38973e) this.f83139f).f99260G = this.f83141h;
        ((C38973e) this.f83139f).f99263J = this.f100752s;
        ((C38973e) this.f83139f).f99259F = this.f100746m;
        ((C38973e) this.f83139f).f99265L = this.f100754u;
        ((C38973e) this.f83139f).f82942m = this.f100755v;
        ((C38973e) this.f83139f).f99261H = mo80102j();
        ((C38973e) this.f83139f).f99264K = this.f100753t.mo80011C();
        ((C38973e) this.f83139f).f70682s = getContext().getResources().getColor(R.color.a02);
        return (C38973e) this.f83139f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80354a(Runnable runnable) {
        this.f83135b.postDelayed(runnable, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80353a(PoiDetail poiDetail) {
        long defaultPoiClassCode = poiDetail.getDefaultPoiClassCode();
        if (defaultPoiClassCode > 0) {
            this.f100749p = defaultPoiClassCode;
        }
    }

    /* renamed from: a */
    public final C39067g mo80352a(C39128l lVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (lVar != null) {
            str = lVar.poiId;
        } else {
            str = "";
        }
        this.f100744k = str;
        if (lVar != null) {
            str2 = lVar.awemeid;
        } else {
            str2 = "";
        }
        this.f100745l = str2;
        C39068a aVar = new C39068a();
        if (lVar != null) {
            str3 = lVar.poiId;
        } else {
            str3 = "";
        }
        C39068a a = aVar.mo79255a(str3);
        if (lVar != null) {
            str4 = lVar.poiType;
        } else {
            str4 = "";
        }
        C39068a c = a.mo79257b(str4).mo79258c(C23198ae.m56852b());
        if (lVar != null) {
            str5 = lVar.from;
        } else {
            str5 = "";
        }
        C39068a f = c.mo79261f(str5);
        if (lVar != null) {
            str6 = lVar.awemeid;
        } else {
            str6 = "";
        }
        C39068a e = f.mo79260e(str6);
        if (lVar != null) {
            str7 = lVar.activityId;
        } else {
            str7 = "";
        }
        C39068a d = e.mo79259d(str7);
        if (lVar != null) {
            str8 = lVar.backendType;
        } else {
            str8 = "";
        }
        C39068a g = d.mo79262g(str8);
        if (lVar != null) {
            str9 = lVar.cityCode;
        } else {
            str9 = "";
        }
        this.f100746m = g.mo79263h(str9).mo79256a();
        return this.f100746m;
    }

    /* renamed from: a */
    public void mo64861a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 1:
                    mo64882b(null);
                    if (this.f83136c != null) {
                        if (!this.f100748o) {
                            this.f83136c.mo19214h();
                        } else {
                            this.f83136c.mo19209d();
                        }
                    }
                    if (this.f83139f != null) {
                        ((C38973e) this.f83139f).an_();
                        return;
                    }
                    break;
                case 2:
                    if (!this.f100748o && this.f83136c != null) {
                        this.f83136c.mo19212f();
                        return;
                    }
                case 3:
                    if (this.f83136c != null) {
                        if (!this.f100748o) {
                            this.f83136c.mo19213g();
                        } else {
                            this.f83136c.mo19209d();
                        }
                    }
                    mo64882b(null);
                    if (this.f83139f != null) {
                        ((C38973e) this.f83139f).an_();
                        return;
                    }
                    break;
                case 4:
                    if (this.f83136c != null) {
                        this.f83136c.mo19209d();
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public void mo64876a(List<C37859b> list, boolean z) {
        if (isViewValid()) {
            if (this.f83136c != null) {
                this.f83136c.mo19209d();
            }
            if (!this.f100748o) {
                this.f100748o = !C9414h.m18630a(list);
            }
            if (this.f83139f != null) {
                ((C38973e) this.f83139f).mo50303a(list);
            }
            mo64884b(z);
        }
    }

    /* renamed from: a */
    public final void mo64878a(boolean z, Aweme aweme) {
        super.mo64878a(z, aweme);
        this.f100753t.mo80039p();
    }

    /* renamed from: a */
    public void mo80098a(C39386a aVar, View view, C39384j jVar, C31754a aVar2) {
        this.f100747n = jVar;
        this.f100753t = aVar;
        super.mo64863a(aVar.mo80031j(), view, jVar, aVar2, aVar.mo80351v(), aVar.mo63442w(), aVar.mo63443x());
    }

    /* renamed from: a */
    public void mo80099a(boolean z, String str, String str2, boolean z2) {
        String str3;
        if (this.f100747n != null) {
            if (TextUtils.isEmpty(C30228f.m70979c())) {
                str3 = C30228f.m70982f();
            } else {
                str3 = C30228f.m70979c();
            }
            long j = 0;
            try {
                if (!TextUtils.isEmpty(str3)) {
                    j = Long.parseLong(str3);
                }
            } catch (Exception unused) {
            }
            C39384j jVar = this.f100747n;
            C39066a d = new C39066a().mo79228b(3).mo79225a(this.f100744k).mo79229b(str).mo79230c(str2).mo79223a(z ? 1 : 0).mo79224a(j).mo79231d(this.f100745l);
            d.f99642l = z2;
            jVar.mo44934a_(Integer.valueOf(1), d.mo79226a(this.f100753t.mo80027f()).mo79232e(this.f100753t.mo80028g()).mo79227a());
        }
    }
}
