package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.support.p043v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.filter.C31407aj;
import com.p683ss.android.ugc.aweme.filter.C31408ak;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.FilterViewImpl.C31381a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43655l.C43656a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43655l.C43657b;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43900c;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43905g;
import com.p683ss.android.ugc.aweme.utils.C47675ap;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.i */
public final class C43478i implements C43655l {

    /* renamed from: a */
    protected C31459g f109890a;

    /* renamed from: b */
    protected VideoPublishEditModel f109891b;

    /* renamed from: c */
    protected AppCompatActivity f109892c;

    /* renamed from: d */
    protected FrameLayout f109893d;

    /* renamed from: e */
    protected C31408ak f109894e;

    /* renamed from: f */
    public C43657b f109895f;

    /* renamed from: g */
    public boolean f109896g;

    /* renamed from: h */
    protected C23441t f109897h;

    /* renamed from: i */
    protected C50207b f109898i;

    /* renamed from: j */
    public C43656a f109899j;

    public C43478i() {
    }

    /* renamed from: a */
    public final void mo88432a() {
        if (this.f109894e != null) {
            this.f109894e.mo64272c();
        }
    }

    /* renamed from: b */
    public final void mo88435b() {
        C434802 r1;
        if (this.f109894e == null) {
            C31381a aVar = new C31381a(this.f109892c, this.f109893d);
            aVar.f82203a.f82373d = this.f109898i;
            C31381a a = aVar.mo64283a((C43905g) new C43905g() {
                /* renamed from: a */
                public final void mo64274a(C31459g gVar) {
                }

                /* renamed from: c */
                public final void mo64278c(C31459g gVar) {
                }

                /* renamed from: b */
                public final void mo64277b(C31459g gVar) {
                    if (C43478i.this.f109895f != null) {
                        C43478i.this.f109895f.mo89003a();
                    }
                }

                /* renamed from: a */
                public final void mo64275a(C31459g gVar, int i) {
                    if (C43478i.this.f109895f != null) {
                        C43478i.this.f109895f.mo89005a(gVar, i);
                    }
                }

                /* renamed from: a */
                public final void mo64276a(C31459g gVar, String str) {
                    String str2;
                    String str3;
                    C43478i.this.f109890a = gVar;
                    if (C43478i.this.f109895f != null) {
                        C43478i.this.f109895f.mo89004a(gVar);
                    }
                    EffectCategoryResponse b = C31487c.m73327b(C39629l.m88232a().mo58584o().mo64334d().mo64415e(), gVar);
                    if (b == null) {
                        str2 = "";
                    } else {
                        str2 = b.getName();
                    }
                    C47702b bVar = C47702b.f120193a;
                    String str4 = "select_filter";
                    C23089d a = C23089d.m56640a().mo47829a("creation_id", C43478i.this.f109891b.creationId).mo47829a("shoot_way", C43478i.this.f109891b.mShootWay).mo47826a("draft_id", C43478i.this.f109891b.draftId).mo47829a("enter_method", "click");
                    String str5 = "enter_from";
                    if (C43478i.this.f109896g) {
                        str3 = "edit_post_page";
                    } else {
                        str3 = "video_edit_page";
                    }
                    bVar.mo94984a(str4, a.mo47829a(str5, str3).mo47829a("filter_name", gVar.f82326c).mo47826a("filter_id", gVar.f82324a).mo47829a("tab_name", str2).f61491a);
                }
            }).mo64282a((C31407aj) new C43900c(C39629l.m88232a().mo58584o().mo64335e())).mo64284a(this.f109891b.getAvetParameter());
            if (this.f109899j != null) {
                r1 = new C31631c() {
                    /* renamed from: a */
                    public final int mo64537a(C31459g gVar) {
                        return C43478i.this.f109899j.mo89000a(gVar);
                    }

                    /* renamed from: b */
                    public final int mo64538b(C31459g gVar) {
                        return C43478i.this.f109899j.mo89001b(gVar);
                    }

                    /* renamed from: c */
                    public final float mo64539c(C31459g gVar) {
                        return C43478i.this.f109899j.mo89002c(gVar);
                    }
                };
            } else {
                r1 = null;
            }
            if (r1 != null) {
                a.f82203a.f82378i = true;
                a.f82203a.f82379j = r1;
            }
            this.f109894e = a.mo64285a();
            if (this.f109890a != null) {
                this.f109894e.mo64270a(this.f109890a);
            }
        }
        this.f109894e.mo64269a();
    }

    /* renamed from: a */
    public final void mo88434a(C43657b bVar) {
        this.f109895f = bVar;
    }

    /* renamed from: a */
    public final void mo88433a(C31459g gVar) {
        this.f109890a = gVar;
        if (this.f109894e != null) {
            this.f109894e.mo64270a(gVar);
        }
    }

    public C43478i(AppCompatActivity appCompatActivity, C23441t tVar, FrameLayout frameLayout, C31459g gVar, VideoPublishEditModel videoPublishEditModel) {
        this.f109892c = appCompatActivity;
        this.f109897h = tVar;
        this.f109898i = C47675ap.m103188a(this.f109897h);
        this.f109890a = gVar;
        this.f109893d = frameLayout;
        this.f109891b = videoPublishEditModel;
    }
}
