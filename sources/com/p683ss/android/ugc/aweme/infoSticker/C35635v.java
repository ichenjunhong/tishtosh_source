package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.infoSticker.C35606f.C35607a;
import com.p683ss.android.ugc.aweme.infoSticker.C35608g.C35609a;
import com.p683ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.v */
public final class C35635v implements C35606f {

    /* renamed from: a */
    protected FragmentActivity f91584a;

    /* renamed from: b */
    protected FrameLayout f91585b;

    /* renamed from: c */
    protected VideoPublishEditModel f91586c;

    /* renamed from: d */
    protected C35608g f91587d;

    /* renamed from: e */
    protected C35607a f91588e;

    /* renamed from: f */
    protected C50207b f91589f;

    /* renamed from: g */
    public C50206a f91590g = new C35637w(this);

    /* renamed from: h */
    public boolean f91591h;

    /* renamed from: i */
    private C35584av f91592i;

    /* renamed from: c */
    public final void mo74047c() {
        C35557ad.m80351a(this.f91584a.getApplication());
        C35557ad.f91391a = null;
    }

    /* renamed from: b */
    public final void mo74046b() {
        if (this.f91587d != null) {
            this.f91587d.mo73926b();
        }
    }

    /* renamed from: a */
    public final void mo74043a() {
        String str;
        if (this.f91587d == null) {
            m80462a(this.f91584a).f91355c = this.f91586c;
            InfoStickerViewImpl infoStickerViewImpl = new InfoStickerViewImpl(this.f91584a, this.f91585b, this.f91586c, this.f91592i, new C35609a() {
                /* renamed from: a */
                public final void mo74015a() {
                    if (C35635v.this.f91588e != null) {
                        C35635v.this.f91588e.mo74012a();
                    }
                    if (C35635v.this.f91589f != null) {
                        C35635v.this.f91589f.mo94977a(C35635v.this.f91590g);
                    }
                }

                /* renamed from: b */
                public final void mo74017b() {
                    if (C35635v.this.f91588e != null) {
                        C35635v.this.f91588e.cq_();
                    }
                    if (C35635v.this.f91589f != null) {
                        C35635v.this.f91589f.mo94978b(C35635v.this.f91590g);
                    }
                }

                /* renamed from: a */
                public final void mo74016a(Effect effect, String str) {
                    IFoundationAVService iFoundationAVService;
                    Object a = C27991b.m66756a(IFoundationAVService.class);
                    if (a != null) {
                        iFoundationAVService = (IFoundationAVService) a;
                    } else {
                        iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                    }
                    iFoundationAVService.setLastStickerId(C35635v.this.f91584a, effect.getEffectId(), 5);
                    if (C35635v.this.f91588e != null) {
                        C35635v.this.f91588e.mo74013a(effect, str);
                    }
                    if (!C35556ac.m80347a(effect) && !C35556ac.m80350d(effect)) {
                        C35635v.this.mo74046b();
                    }
                }
            });
            this.f91587d = infoStickerViewImpl;
            ((InfoStickerViewImpl) this.f91587d).f91334e = this.f91591h;
        }
        C47702b bVar = C47702b.f120193a;
        String str2 = "click_prop_entrance";
        C42438az a = C42438az.m93209a().mo86523a("scene_id", (int) BaseNotice.CHECK_PROFILE).mo86526a("creation_id", this.f91586c.creationId).mo86526a("shoot_way", this.f91586c.mShootWay).mo86523a("draft_id", this.f91586c.draftId);
        String str3 = "enter_from";
        if (this.f91591h) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        bVar.mo94984a(str2, a.mo86526a(str3, str).mo86526a("content_type", this.f91586c.getAvetParameter().getContentType()).mo86526a("content_source", this.f91586c.getAvetParameter().getContentSource()).f107329a);
        this.f91587d.mo73924a();
    }

    /* renamed from: a */
    public final void mo74044a(C35607a aVar) {
        this.f91588e = aVar;
    }

    /* renamed from: b */
    public static InfoStickerCategoryViewModel m80463b(FragmentActivity fragmentActivity) {
        return (InfoStickerCategoryViewModel) C0214z.m440a(fragmentActivity).mo359a(InfoStickerCategoryViewModel.class);
    }

    /* renamed from: a */
    public static InfoStickerViewModel m80462a(FragmentActivity fragmentActivity) {
        return (InfoStickerViewModel) C0214z.m441a(fragmentActivity, (C0212b) C35557ad.m80351a(fragmentActivity.getApplication())).mo359a(InfoStickerViewModel.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo74045a(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        mo74046b();
        return true;
    }

    public C35635v(FragmentActivity fragmentActivity, C50207b bVar, C35584av avVar, FrameLayout frameLayout, VideoPublishEditModel videoPublishEditModel) {
        this.f91584a = fragmentActivity;
        this.f91589f = bVar;
        this.f91585b = frameLayout;
        this.f91592i = avVar;
        this.f91586c = videoPublishEditModel;
        m80462a(this.f91584a).f91355c = this.f91586c;
        m80462a(fragmentActivity).mo73932a("infostickerv2");
    }
}
