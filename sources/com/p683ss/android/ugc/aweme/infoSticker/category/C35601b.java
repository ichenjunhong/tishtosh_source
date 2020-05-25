package com.p683ss.android.ugc.aweme.infoSticker.category;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.infoSticker.C35635v;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.tools.C46811b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.category.b */
public final /* synthetic */ class C35601b implements C0199s {

    /* renamed from: a */
    private final C35595a f91506a;

    public C35601b(C35595a aVar) {
        this.f91506a = aVar;
    }

    public final void onChanged(Object obj) {
        C35595a aVar = this.f91506a;
        List<EffectCategoryResponse> list = (List) obj;
        aVar.f91489m = list;
        if (list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                C44709f a = aVar.f91480d.mo90678a();
                InfoStickerTabItemView infoStickerTabItemView = new InfoStickerTabItemView(aVar.f91479c, i);
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(i);
                aVar.f91497u.mo73984a(infoStickerTabItemView, (Context) aVar.f91479c, effectCategoryResponse);
                infoStickerTabItemView.setImageUrl(effectCategoryResponse.getIcon_selected_url());
                infoStickerTabItemView.setParentBackground(null);
                a.mo90742a((View) infoStickerTabItemView);
                aVar.f91480d.mo90684a(a);
                aVar.f91480d.mo90695c(i).setOnClickListener(new OnClickListener(a) {

                    /* renamed from: a */
                    final /* synthetic */ C44709f f91504a;

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (C35595a.this.f91485i != this.f91504a.f113161e) {
                            C35595a.this.f91480d.mo90697c(this.f91504a, true);
                        }
                        C35595a.this.mo74008a(this.f91504a, this.f91504a.f113161e);
                        C35595a.this.f91488l.vibrate(6);
                        C35595a.this.f91487k = false;
                        C35635v.m80462a(C35595a.this.f91479c).mo73939d().setValue(Integer.valueOf(this.f91504a.f113161e));
                        C35595a aVar = C35595a.this;
                        int i = this.f91504a.f113161e;
                        if (aVar.f91485i != i && i >= 0 && aVar.f91489m != null && i < aVar.f91489m.size()) {
                            VideoPublishEditModel videoPublishEditModel = C35635v.m80462a(aVar.f91479c).f91355c;
                            String str = aVar.f91490n;
                            String id = ((EffectCategoryResponse) aVar.f91489m.get(i)).getId();
                            C52711k.m112240b(videoPublishEditModel, "model");
                            C52711k.m112240b(str, "categoryName");
                            C52711k.m112240b(id, "tabId");
                            C47702b.f120193a.mo94984a("click_infosticker_tab", C42438az.m93209a().mo86526a("shoot_way", videoPublishEditModel.mShootWay).mo86526a("creation_id", videoPublishEditModel.creationId).mo86526a("content_type", C43855fx.m96289b(videoPublishEditModel)).mo86526a("content_source", C43855fx.m96288a(videoPublishEditModel)).mo86526a("enter_from", "video_edit_page").mo86526a("category_name", str).mo86526a("tab_id", id).f107329a);
                        }
                        C35595a.this.mo74004a(this.f91504a.f113161e);
                    }

                    {
                        this.f91504a = r2;
                    }
                });
                aVar.f91480d.mo90695c(i).setOnTouchListener(new C35602c(aVar, infoStickerTabItemView));
                aVar.f91497u.mo73986a(aVar, list.size(), i);
                if (i == 0) {
                    aVar.mo74007a(infoStickerTabItemView);
                }
                aVar.f91484h.setText(((EffectCategoryResponse) list.get(0)).getName());
            }
            if (C46811b.m101654a(aVar.f91479c)) {
                aVar.f91480d.post(new C35603d(aVar));
            }
        }
    }
}
