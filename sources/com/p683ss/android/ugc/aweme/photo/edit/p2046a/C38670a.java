package com.p683ss.android.ugc.aweme.photo.edit.p2046a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.medialib.image.C19340b;
import com.p683ss.android.medialib.image.ImageRenderView.C19338a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photo.PhotoView;
import com.p683ss.android.ugc.aweme.photo.edit.p2047b.C38674a;
import com.p683ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43650k;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43650k.C43653a;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.edit.a.a */
public final class C38670a implements C19338a, C43653a {

    /* renamed from: a */
    public C38674a f98357a;

    /* renamed from: b */
    public PhotoContext f98358b;

    /* renamed from: c */
    public C43650k f98359c;

    /* renamed from: d */
    public boolean f98360d;

    /* renamed from: e */
    public C31405ah f98361e;

    /* renamed from: f */
    public C31406ai f98362f;

    /* renamed from: g */
    private Boolean f98363g = Boolean.valueOf(C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust));

    /* renamed from: h */
    private C31459g f98364h;

    /* renamed from: a */
    public JSONObject mo78602a() {
        String str = "upload";
        if (this.f98358b.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new C26898j().mo54849a("is_photo", "1").mo54849a("shoot_way", str).mo54849a("position", "mid_page").mo54850a();
    }

    public C38670a(C38674a aVar) {
        this.f98357a = aVar;
    }

    /* renamed from: a */
    public final void mo78603a(C31459g gVar) {
        String str;
        this.f98360d = false;
        this.f98358b.mFilterName = gVar.f82326c;
        this.f98358b.mFilterId = gVar.f82324a;
        this.f98358b.mFilterIndex = C31487c.m73323a(C39618d.m88215d(), gVar);
        if (this.f98363g.booleanValue()) {
            this.f98358b.mFilterRate = C31460h.m73279a(gVar, this.f98361e, this.f98362f);
        }
        this.f98357a.mo78592d().mo78581a(this.f98358b);
        C26890h.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("slide").setJsonObject(mo78602a()));
        EffectCategoryResponse b = C31487c.m73327b(C39618d.m88215d(), gVar);
        if (b == null) {
            str = "";
        } else {
            str = b.getName();
        }
        C26890h.m65011a("select_filter", C23089d.m56640a().mo47829a("creation_id", this.f98358b.creationId).mo47829a("shoot_way", this.f98358b.mShootWay).mo47826a("draft_id", this.f98358b.draftId).mo47829a("enter_method", "slide").mo47829a("enter_from", "video_shoot_page").mo47829a("filter_name", gVar.f82326c).mo47826a("filter_id", gVar.f82324a).mo47829a("tab_name", str).f61491a);
        if (this.f98364h != null) {
            C26890h.m65011a("adjust_filter_complete", C23089d.m56640a().mo47829a("enter_from", "video_edit_page").mo47829a("creation_id", this.f98358b.creationId).mo47829a("shoot_way", this.f98358b.mShootWay).mo47826a("draft_id", this.f98358b.draftId).mo47826a("filter_id", this.f98364h.f82324a).mo47829a("filter_name", this.f98364h.f82325b).mo47828a("value", (Object) Float.valueOf(C31460h.m73279a(this.f98364h, this.f98361e, this.f98362f))).f61491a);
        }
        this.f98364h = gVar;
    }

    /* renamed from: a */
    public final void mo39872a(boolean z) {
        C18842a.m45934b(new C38673c(this));
        C46806g.m101653a(C44309n.m97060b(this.f98358b), C44309n.m97055a(this.f98358b), C46804e.EDIT, C46804e.PUBLISH);
        if (z) {
            C44403a.m97196a().mo48298a((Activity) this.f98357a, this.f98358b, 1);
        } else {
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    if (C38670a.this.f98357a != null) {
                        C10691a.m21543b((Context) (Activity) C38670a.this.f98357a, (int) R.string.bqk, 0).mo19066a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo78605a(PhotoContext photoContext, int i) {
        this.f98358b = photoContext;
        C31459g b = C39618d.f101144H.mo58584o().mo64333c().mo64346b(this.f98358b.mFilterIndex);
        this.f98359c.mo88991a(b, false);
        this.f98358b.mFilterId = b.f82324a;
        this.f98358b.mFilterName = b.f82326c;
        this.f98358b.defaultSelectStickerPoi = photoContext.defaultSelectStickerPoi;
        if (this.f98360d && i == EffectPhotoSetFilterActivity.f98456a) {
            this.f98360d = false;
        }
        if (!this.f98360d) {
            this.f98357a.mo78592d().mo78581a(photoContext);
        }
    }

    /* renamed from: a */
    public final void mo78604a(C31459g gVar, C31459g gVar2, float f) {
        if (this.f98363g.booleanValue()) {
            PhotoView d = this.f98357a.mo78592d();
            String a = C31460h.m73281a(gVar);
            String a2 = C31460h.m73281a(gVar2);
            float a3 = C31460h.m73279a(gVar, this.f98361e, this.f98362f);
            float a4 = C31460h.m73279a(gVar2, this.f98361e, this.f98362f);
            if (a3 < 0.0f) {
                a3 = -1.0f;
            }
            if (a4 < 0.0f) {
                a4 = -1.0f;
            }
            if (a3 > 1.0f) {
                a3 = 1.0f;
            }
            if (a4 > 1.0f) {
                a4 = 1.0f;
            }
            C19340b bVar = d.f53431l;
            if (bVar.f53447a.mo39577a() && !TextUtils.isEmpty(a) && !TextUtils.isEmpty(a2)) {
                bVar.f53447a.mo39576a(a, a2, f, a3, a4);
            }
            bVar.f53451e.f53463a = a;
            bVar.f53451e.f53466d = a2;
            bVar.f53451e.f53464b = a3;
            bVar.f53451e.f53465c = a4;
            bVar.f53451e.f53467e = f;
            bVar.f53451e.f53468f = true;
            d.mo39815a();
            return;
        }
        PhotoView d2 = this.f98357a.mo78592d();
        String a5 = C31460h.m73281a(gVar);
        String a6 = C31460h.m73281a(gVar2);
        C19340b bVar2 = d2.f53431l;
        if (bVar2.f53447a.mo39577a()) {
            bVar2.f53447a.mo39575a(a5, a6, f, bVar2.f53451e.f53464b);
        }
        bVar2.f53451e.f53463a = a5;
        bVar2.f53451e.f53466d = a6;
        bVar2.f53451e.f53464b = -1.0f;
        bVar2.f53451e.f53465c = -1.0f;
        bVar2.f53451e.f53467e = f;
        bVar2.f53451e.f53468f = false;
        d2.mo39815a();
    }
}
