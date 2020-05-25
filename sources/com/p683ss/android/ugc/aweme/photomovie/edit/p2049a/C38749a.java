package com.p683ss.android.ugc.aweme.photomovie.edit.p2049a;

import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31407aj;
import com.p683ss.android.ugc.aweme.filter.C31408ak;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.FilterViewImpl.C31381a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.photomovie.edit.player.C38794a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43650k;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43900c;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43905g;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.a.a */
public final class C38749a implements C38751b {

    /* renamed from: a */
    public C38794a f98575a;

    /* renamed from: b */
    public C31459g f98576b;

    /* renamed from: c */
    public View f98577c;

    /* renamed from: d */
    public C43650k f98578d;

    /* renamed from: e */
    private AppCompatActivity f98579e;

    /* renamed from: f */
    private JSONObject f98580f;

    /* renamed from: g */
    private FrameLayout f98581g;

    /* renamed from: h */
    private C31408ak f98582h;

    /* renamed from: a */
    public final boolean mo78655a() {
        if (this.f98582h == null || this.f98577c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C31459g mo78705c() {
        if (this.f98576b == null) {
            return C39618d.f101144H.mo58584o().mo64333c().mo64346b(0);
        }
        return this.f98576b;
    }

    /* renamed from: b */
    public final void mo78704b() {
        if (this.f98582h == null) {
            this.f98582h = new C31381a(this.f98579e, this.f98581g).mo64283a((C43905g) new C43905g() {
                /* renamed from: a */
                public final void mo64274a(C31459g gVar) {
                }

                /* renamed from: a */
                public final void mo64275a(C31459g gVar, int i) {
                }

                /* renamed from: c */
                public final void mo64278c(C31459g gVar) {
                }

                /* renamed from: b */
                public final void mo64277b(C31459g gVar) {
                    C38749a.this.f98577c.setVisibility(0);
                }

                /* renamed from: a */
                public final void mo64276a(C31459g gVar, String str) {
                    String str2;
                    C38749a.this.f98576b = gVar;
                    C38749a.this.f98575a.mo78758a(gVar.f82331h);
                    if (C38749a.this.f98578d != null) {
                        C43650k kVar = C38749a.this.f98578d;
                        kVar.f110557c = gVar;
                        kVar.f110559e.mo88999a(gVar);
                    }
                    EffectCategoryResponse b = C31487c.m73327b(C39618d.m88215d(), C38749a.this.f98576b);
                    if (b == null) {
                        str2 = "";
                    } else {
                        str2 = b.getName();
                    }
                    C26890h.m65011a("select_filter", C42438az.m93209a().mo86526a("creation_id", C38749a.this.f98575a.mo78753a().creationId).mo86526a("shoot_way", C38749a.this.f98575a.mo78753a().mShootWay).mo86523a("draft_id", C38749a.this.f98575a.mo78753a().draftId).mo86526a("enter_method", "click").mo86526a("filter_name", C38749a.this.f98576b.f82326c).mo86523a("filter_id", C38749a.this.f98576b.f82324a).mo86526a("tab_name", str2).mo86526a("content_source", C38749a.this.f98575a.mo78753a().getAvetParameter().getContentSource()).mo86526a("content_type", C38749a.this.f98575a.mo78753a().getAvetParameter().getContentType()).mo86526a("enter_from", "video_edit_page").f107329a);
                }
            }).mo64282a((C31407aj) new C43900c(C39618d.f101144H.mo58584o().mo64335e())).mo64284a(this.f98575a.mo78753a().getAvetParameter()).mo64285a();
            if (this.f98576b != null) {
                this.f98582h.mo64270a(this.f98576b);
            }
        }
        this.f98582h.mo64269a();
        this.f98577c.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo78702a(C43650k kVar) {
        this.f98578d = kVar;
    }

    /* renamed from: a */
    public final void mo78703a(JSONObject jSONObject) {
        this.f98580f = jSONObject;
    }

    /* renamed from: a */
    public final void mo78701a(C31459g gVar) {
        this.f98576b = gVar;
        if (this.f98582h != null) {
            this.f98582h.mo64270a(this.f98576b);
        }
    }

    public C38749a(AppCompatActivity appCompatActivity, C38794a aVar, View view, FrameLayout frameLayout) {
        this.f98579e = appCompatActivity;
        this.f98575a = aVar;
        this.f98577c = view;
        this.f98581g = frameLayout;
        C39618d.f101144H.mo58584o().mo64333c().mo64345a();
    }
}
