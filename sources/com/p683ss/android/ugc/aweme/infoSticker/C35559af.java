package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.p683ss.android.ugc.aweme.infoSticker.category.C35595a;
import com.p683ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel.C35589a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47755ca;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect.StickerBean;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48698c;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.List;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53682y;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.af */
public final class C35559af extends C35549a<C35558ae> {

    /* renamed from: c */
    protected FragmentActivity f91396c;

    /* renamed from: b */
    public final int mo73953b(int i) {
        return 1;
    }

    C35559af(FragmentActivity fragmentActivity) {
        this.f91396c = fragmentActivity;
    }

    /* renamed from: b */
    public final C1352v mo73954b(ViewGroup viewGroup, int i) {
        C35564ai aiVar = new C35564ai(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fl, viewGroup, false));
        aiVar.f91410b = this.f91375b;
        return aiVar;
    }

    /* renamed from: a */
    public final C1352v mo64316a(ViewGroup viewGroup, int i) {
        if (C35589a.m80398a() || i != -2) {
            return super.mo64316a(viewGroup, i);
        }
        return new C35563ah(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fe, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo64317a(C1352v vVar, int i) {
        int i2;
        if (C35589a.m80398a() || mo64315a(i) != -2) {
            super.mo64317a(vVar, i);
            return;
        }
        C35563ah ahVar = (C35563ah) vVar;
        C0198r<Boolean> rVar = ((SearchInfoStickerViewModel) C0214z.m440a(this.f91396c).mo359a(SearchInfoStickerViewModel.class)).f91373a;
        TextView textView = ahVar.f91408a;
        if (rVar.getValue() == null || !((Boolean) rVar.getValue()).booleanValue()) {
            i2 = R.string.das;
        } else {
            i2 = R.string.dar;
        }
        textView.setText(i2);
    }

    /* renamed from: b */
    public final void mo73955b(C1352v vVar, int i) {
        C35564ai aiVar = (C35564ai) vVar;
        FragmentActivity fragmentActivity = this.f91396c;
        Object obj = null;
        if (i < mo64314a()) {
            int min = Math.min(i - 1, this.f125763k.size() - 1);
            if (this.f125763k.size() != 0) {
                List list = this.f125763k;
                if (min < 0) {
                    min = 0;
                }
                obj = list.get(min);
            }
        }
        C35558ae aeVar = (C35558ae) obj;
        aiVar.f91411c = fragmentActivity;
        if (aeVar != null && aeVar.f91393a != null) {
            aiVar.f91412d = aeVar;
            aiVar.f91409a.mo90445a(aeVar.f91394b, aeVar.f91395c);
            StickerBean sticker = aeVar.f91393a.getSticker();
            if (sticker != null && !C9431p.m18664a(sticker.getUrl())) {
                aiVar.f91409a.setIconImageViewScaleType(C13818b.f36063c);
                aiVar.f91409a.mo90449a(sticker.getUrl(), Config.ARGB_8888);
            }
            VideoPublishEditModel videoPublishEditModel = C35635v.m80462a(fragmentActivity).f91355c;
            C0198r<Boolean> rVar = ((SearchInfoStickerViewModel) C0214z.m440a(fragmentActivity).mo359a(SearchInfoStickerViewModel.class)).f91373a;
            View view = aiVar.itemView;
            C355651 r0 = new C47755ca(fragmentActivity, aeVar, videoPublishEditModel, i, rVar) {

                /* renamed from: a */
                final /* synthetic */ FragmentActivity f91413a;

                /* renamed from: b */
                final /* synthetic */ C35558ae f91414b;

                /* renamed from: c */
                final /* synthetic */ VideoPublishEditModel f91415c;

                /* renamed from: d */
                final /* synthetic */ int f91416d;

                /* renamed from: e */
                final /* synthetic */ C0198r f91417e;

                /* renamed from: a */
                public final void mo58980a(View view) {
                    String str;
                    String str2;
                    C35564ai aiVar = C35564ai.this;
                    FragmentActivity fragmentActivity = this.f91413a;
                    C35558ae aeVar = this.f91414b;
                    if (!(aeVar == null || aeVar.f91393a == null || aeVar.f91394b == 2 || aeVar.f91394b == 5)) {
                        if (aeVar.f91394b == 1 || C35558ae.m80354a(aeVar.f91393a)) {
                            C0198r c = C35635v.m80462a(fragmentActivity).mo73938c();
                            new C35605e();
                            c.setValue(C35605e.m80407a(aeVar.f91393a));
                        } else {
                            aeVar.f91394b = 2;
                            aiVar.f91409a.mo90451b();
                            InfoStickerViewModel a = C35635v.m80462a(fragmentActivity);
                            ProviderEffect providerEffect = aeVar.f91393a;
                            InfoStickerRepository infoStickerRepository = a.f91353a;
                            C0198r rVar = new C0198r();
                            rVar.setValue(C37721a.m84218a(C37722a.LOADING, null));
                            infoStickerRepository.f91303a.mo59124a(providerEffect, (C48697b) new C48698c(rVar) {

                                /* renamed from: a */
                                final /* synthetic */ C0198r f91312a;

                                /* renamed from: a */
                                public final /* synthetic */ void mo8638a(Object obj) {
                                    this.f91312a.setValue(C37721a.m84218a(C37722a.SUCCESS, (ProviderEffect) obj));
                                }

                                {
                                    this.f91312a = r2;
                                }

                                /* renamed from: a */
                                public final void mo73922a(ProviderEffect providerEffect, C48649d dVar) {
                                    StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                                    sb.append(dVar.toString());
                                    C39629l.m88232a().mo58567E().mo49428a("InfoStickerRepository", sb.toString());
                                    this.f91312a.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
                                }

                                /* renamed from: a */
                                public final void mo73921a(ProviderEffect providerEffect, int i, long j) {
                                    this.f91312a.setValue(C37721a.m84219a(C37722a.PROGRESS, providerEffect, i));
                                }
                            });
                            rVar.observe(fragmentActivity, aiVar);
                        }
                    }
                    C47702b bVar = C47702b.f120193a;
                    String str3 = "prop_click";
                    C42438az a2 = C42438az.m93209a().mo86523a("scene_id", (int) BaseNotice.CHECK_PROFILE).mo86526a("tab_name", "贴图").mo86526a("prop_id", this.f91414b.f91393a.getId()).mo86526a("enter_method", "click_main_panel").mo86526a("creation_id", this.f91415c.creationId).mo86526a("shoot_way", this.f91415c.mShootWay).mo86523a("draft_id", this.f91415c.draftId);
                    String str4 = "enter_from";
                    if (C35564ai.this.f91410b) {
                        str = "edit_post_page";
                    } else {
                        str = "video_edit_page";
                    }
                    C42438az a3 = a2.mo86526a(str4, str).mo86523a("impr_position", this.f91416d);
                    String str5 = "after_search";
                    if (this.f91417e.getValue() == null || !((Boolean) this.f91417e.getValue()).booleanValue()) {
                        str2 = "0";
                    } else {
                        str2 = "1";
                    }
                    bVar.mo94984a(str3, a3.mo86526a(str5, str2).mo86526a("category_name", "sticker").mo86526a("tab_id", "giphy").mo86523a("is_giphy", 1).f107329a);
                    if (this.f91414b.f91393a.getClickUrl() != null) {
                        C53682y a4 = new C53682y().mo111653b().mo111667a();
                        C53499a aVar = new C53499a();
                        aVar.mo111260a().mo111262a(this.f91414b.f91393a.getClickUrl());
                        a4.mo111325a(aVar.mo111272c()).mo111246a(new C53526f() {
                            public final void onFailure(C53524e eVar, IOException iOException) {
                                eVar.mo111248c();
                            }

                            public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                                eVar.mo111248c();
                            }
                        });
                    }
                }

                {
                    this.f91413a = r2;
                    this.f91414b = r3;
                    this.f91415c = r4;
                    this.f91416d = r5;
                    this.f91417e = r6;
                }
            };
            view.setOnClickListener(r0);
            if (C35589a.m80398a()) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) aiVar.itemView.getLayoutParams();
                marginLayoutParams.width = (int) C35595a.f91477a;
                marginLayoutParams.height = (int) C35595a.f91477a;
                int b = (int) C9432q.m18687b((Context) fragmentActivity, 3.0f);
                aiVar.itemView.setPadding(b, b, b, b);
                if (marginLayoutParams != null) {
                    aiVar.itemView.setLayoutParams(marginLayoutParams);
                }
                LayoutParams layoutParams = (LayoutParams) aiVar.f91409a.getLayoutParams();
                layoutParams.width = (int) C35595a.f91478b;
                layoutParams.height = (int) C35595a.f91478b;
                if (layoutParams != null) {
                    aiVar.f91409a.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
