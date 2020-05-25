package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.effectplatform.C29260n;
import com.p683ss.android.ugc.aweme.infoSticker.category.C35595a;
import com.p683ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel.C35589a;
import com.p683ss.android.ugc.aweme.infoSticker.p1910a.C35552a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39642b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39644d;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47755ca;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.u */
public final class C35628u extends C1352v {

    /* renamed from: a */
    public FragmentActivity f91559a;

    /* renamed from: b */
    public StickerImageView f91560b;

    /* renamed from: c */
    public boolean f91561c;

    /* renamed from: d */
    public StickerWrapper f91562d;

    /* renamed from: e */
    public C35610h f91563e;

    /* renamed from: f */
    public int f91564f;

    /* renamed from: g */
    public String f91565g;

    /* renamed from: h */
    public String f91566h;

    /* renamed from: i */
    public FragmentActivity f91567i;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.u$6 */
    static /* synthetic */ class C356346 {

        /* renamed from: a */
        static final /* synthetic */ int[] f91583a = new int[C37722a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.ss.android.ugc.aweme.mvp.b.a$a[] r0 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f91583a = r0
                int[] r0 = f91583a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f91583a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f91583a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f91583a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.PROGRESS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.infoSticker.C35628u.C356346.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static boolean m80454a(StickerWrapper stickerWrapper) {
        if (stickerWrapper.f115781c == 2 || stickerWrapper.f115781c == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74037a(FragmentActivity fragmentActivity, StickerWrapper stickerWrapper) {
        InfoStickerRepository infoStickerRepository = C35635v.m80462a(fragmentActivity).f91353a;
        Effect effect = stickerWrapper.f115779a;
        C0198r rVar = new C0198r();
        if (infoStickerRepository.f91303a.mo59142a(effect)) {
            rVar.setValue(C37721a.m84218a(C37722a.SUCCESS, effect));
        } else {
            C29252f fVar = infoStickerRepository.f91303a;
            String str = "info_sticker_download_error_rate";
            C355281 r4 = new C48699d(rVar) {

                /* renamed from: a */
                final /* synthetic */ C0198r f91308a;

                /* renamed from: a */
                public final void mo8643a(Effect effect) {
                    this.f91308a.setValue(C37721a.m84218a(C37722a.LOADING, effect));
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    this.f91308a.setValue(C37721a.m84218a(C37722a.SUCCESS, (Effect) obj));
                }

                {
                    this.f91308a = r2;
                }

                /* renamed from: a */
                public final void mo8644a(Effect effect, C48649d dVar) {
                    this.f91308a.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
                }

                /* renamed from: a */
                public final void mo59191a(Effect effect, int i, long j) {
                    this.f91308a.setValue(C37721a.m84219a(C37722a.PROGRESS, effect, i));
                }
            };
            C52711k.m112240b(str, "serviceName");
            C52711k.m112240b(r4, "listener");
            C29260n nVar = new C29260n("info_effect", r4, false, 4, null);
            fVar.mo59123a(effect, (C48705j) new C35552a(str, nVar, null));
        }
        rVar.observe(fragmentActivity, new C0199s<C37721a<Effect>>() {
            public final /* synthetic */ void onChanged(Object obj) {
                C35628u uVar;
                C37721a aVar = (C37721a) obj;
                if (aVar.f96125a != null) {
                    uVar = (C35628u) C35628u.this.f91563e.f91515g.get(((Effect) aVar.f96125a).getEffectId());
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    switch (C356346.f91583a[aVar.f96126b.ordinal()]) {
                        case 1:
                            uVar.f91562d.f115781c = 1;
                            uVar.mo74038a(C35628u.this.f91567i, uVar.f91562d, C35628u.this.f91565g);
                            C35635v.m80462a(C35628u.this.f91559a).mo73938c().setValue(aVar.f96125a);
                            return;
                        case 2:
                            uVar.f91562d.f115781c = 3;
                            uVar.mo74038a(C35628u.this.f91567i, uVar.f91562d, C35628u.this.f91565g);
                            C50275d.m108538b((Context) C35628u.this.f91559a, (int) R.string.azb).mo98174a();
                            return;
                        case 3:
                            uVar.f91562d.f115781c = 2;
                            uVar.mo74038a(C35628u.this.f91567i, uVar.f91562d, C35628u.this.f91565g);
                            return;
                        case 4:
                            if (((Effect) aVar.f96125a).getEffectId().equals(uVar.f91562d.f115779a.getEffectId())) {
                                uVar.f91562d.f115781c = 5;
                                uVar.f91560b.mo90445a(5, aVar.f96127c);
                                break;
                            }
                            break;
                    }
                }
            }
        });
    }

    public C35628u(View view, FragmentActivity fragmentActivity, C35610h hVar) {
        super(view);
        this.f91559a = fragmentActivity;
        this.f91560b = (StickerImageView) view.findViewById(R.id.ct2);
        this.f91563e = hVar;
    }

    /* renamed from: a */
    public final void mo74038a(FragmentActivity fragmentActivity, StickerWrapper stickerWrapper, String str) {
        if (stickerWrapper != null) {
            this.f91565g = str;
            this.f91562d = stickerWrapper;
            this.f91567i = fragmentActivity;
            this.f91560b.mo90445a(stickerWrapper.f115781c, stickerWrapper.f115783e);
            if (stickerWrapper.f115779a.getIconUrl() != null && !C9414h.m18630a(stickerWrapper.f115779a.getIconUrl().getUrlList())) {
                this.f91560b.mo90448a((String) stickerWrapper.f115779a.getIconUrl().getUrlList().get(0));
            }
            final VideoPublishEditModel videoPublishEditModel = C35635v.m80462a(fragmentActivity).f91355c;
            View view = this.itemView;
            final StickerWrapper stickerWrapper2 = stickerWrapper;
            final FragmentActivity fragmentActivity2 = fragmentActivity;
            final String str2 = str;
            C356291 r1 = new C47755ca() {
                /* renamed from: a */
                public final void mo58980a(View view) {
                    String str;
                    if (stickerWrapper2.f115779a.getTags().contains("weather")) {
                        C35628u uVar = C35628u.this;
                        C39629l.m88232a().mo58590u().mo74219a((Context) uVar.f91559a, (C39644d) new C39644d(fragmentActivity2, stickerWrapper2) {

                            /* renamed from: a */
                            final /* synthetic */ FragmentActivity f91573a;

                            /* renamed from: b */
                            final /* synthetic */ StickerWrapper f91574b;

                            /* renamed from: b */
                            public final void mo74040b() {
                                C50275d.m108538b((Context) C35628u.this.f91559a, (int) R.string.oj).mo98174a();
                            }

                            /* renamed from: a */
                            public final void mo74039a() {
                                C35628u uVar = C35628u.this;
                                C39629l.m88232a().mo58590u().mo74218a((Context) uVar.f91559a, (C39642b) new C39642b(this.f91573a, this.f91574b) {

                                    /* renamed from: a */
                                    final /* synthetic */ FragmentActivity f91576a;

                                    /* renamed from: b */
                                    final /* synthetic */ StickerWrapper f91577b;

                                    /* renamed from: a */
                                    public final void mo74041a() {
                                        C50275d.m108538b((Context) C35628u.this.f91559a, (int) R.string.oj).mo98174a();
                                    }

                                    /* renamed from: a */
                                    public final void mo74042a(double d, double d2) {
                                        C35628u uVar = C35628u.this;
                                        FragmentActivity fragmentActivity = this.f91576a;
                                        StickerWrapper stickerWrapper = this.f91577b;
                                        if (!C35628u.m80454a(stickerWrapper)) {
                                            stickerWrapper.f115781c = 2;
                                            uVar.f91560b.mo90451b();
                                            InfoStickerRepository infoStickerRepository = C35635v.m80462a(fragmentActivity).f91353a;
                                            C0198r rVar = new C0198r();
                                            C17825i.m43740a(infoStickerRepository.f91304b.getTemperature(d2, d), new C17824h<C35585aw>(rVar) {

                                                /* renamed from: a */
                                                final /* synthetic */ C0198r f91316a;

                                                public final void onFailure(Throwable th) {
                                                    this.f91316a.setValue(C37721a.m84220a(C37722a.ERROR, th));
                                                }

                                                public final /* synthetic */ void onSuccess(Object obj) {
                                                    this.f91316a.setValue(C37721a.m84218a(C37722a.SUCCESS, (C35585aw) obj));
                                                }

                                                {
                                                    this.f91316a = r2;
                                                }
                                            }, C0013i.f25b);
                                            rVar.observe(fragmentActivity, new C0199s<C37721a<C35585aw>>(fragmentActivity, stickerWrapper) {

                                                /* renamed from: a */
                                                final /* synthetic */ FragmentActivity f91579a;

                                                /* renamed from: b */
                                                final /* synthetic */ StickerWrapper f91580b;

                                                public final /* synthetic */ void onChanged(Object obj) {
                                                    C37721a aVar = (C37721a) obj;
                                                    switch (C356346.f91583a[aVar.f96126b.ordinal()]) {
                                                        case 1:
                                                            C35635v.m80462a(this.f91579a).f91354b = ((C35585aw) aVar.f96125a).f91457a;
                                                            C35628u.this.mo74037a(this.f91579a, this.f91580b);
                                                            return;
                                                        case 2:
                                                            this.f91580b.f115781c = 3;
                                                            C35628u.this.f91560b.mo90452c();
                                                            C50275d.m108538b((Context) C35628u.this.f91559a, (int) R.string.ok).mo98174a();
                                                            break;
                                                    }
                                                }

                                                {
                                                    this.f91579a = r2;
                                                    this.f91580b = r3;
                                                }
                                            });
                                        }
                                    }

                                    {
                                        this.f91576a = r2;
                                        this.f91577b = r3;
                                    }
                                });
                            }

                            {
                                this.f91573a = r2;
                                this.f91574b = r3;
                            }
                        });
                    } else if (!C35628u.m80454a(stickerWrapper2)) {
                        C35628u.this.mo74037a(fragmentActivity2, stickerWrapper2);
                    } else {
                        return;
                    }
                    String effectId = stickerWrapper2.f115779a.getEffectId();
                    String str2 = "";
                    if (videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(effectId)) {
                        str2 = (String) videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap().get(effectId);
                    }
                    C47702b bVar = C47702b.f120193a;
                    String str3 = "prop_click";
                    C42438az a = C42438az.m93209a().mo86523a("scene_id", (int) BaseNotice.CHECK_PROFILE).mo86526a("tab_name", str2).mo86526a("prop_id", effectId).mo86526a("prop_index", stickerWrapper2.f115779a.getGradeKey()).mo86526a("enter_method", "click_main_panel").mo86526a("creation_id", videoPublishEditModel.creationId).mo86526a("shoot_way", videoPublishEditModel.mShootWay).mo86523a("draft_id", videoPublishEditModel.draftId);
                    String str4 = "enter_from";
                    if (C35628u.this.f91561c) {
                        str = "edit_post_page";
                    } else {
                        str = "video_edit_page";
                    }
                    bVar.mo94984a(str3, a.mo86526a(str4, str).mo86526a("category_name", C35628u.this.f91566h).mo86526a("tab_id", str2).mo86523a("is_giphy", 0).f107329a);
                }
            };
            view.setOnClickListener(r1);
            if (C35589a.m80398a() && !(this.f91563e instanceof C35613j)) {
                LayoutParams layoutParams = this.itemView.getLayoutParams();
                layoutParams.width = (int) C35595a.f91477a;
                layoutParams.height = (int) C35595a.f91477a;
                int b = (int) C9432q.m18687b((Context) fragmentActivity, 3.0f);
                this.itemView.setPadding(b, b, b, b);
                if (layoutParams != null) {
                    this.itemView.setLayoutParams(layoutParams);
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f91560b.getLayoutParams();
                layoutParams2.width = (int) C35595a.f91478b;
                layoutParams2.height = (int) C35595a.f91478b;
                if (layoutParams2 != null) {
                    this.f91560b.setLayoutParams(layoutParams2);
                }
            }
        }
    }
}
