package com.p683ss.android.ugc.aweme.p2345t;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.infoSticker.C35584av;
import com.p683ss.android.ugc.aweme.infoSticker.category.C35595a;
import com.p683ss.android.ugc.aweme.infoSticker.category.InfoStickerTabItemView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.t.h */
public final class C46779h implements C52670a<C35584av> {

    /* renamed from: a */
    public static final C46779h f118135a = new C46779h();

    /* renamed from: com.ss.android.ugc.aweme.t.h$a */
    public static final class C46780a implements C35584av {
        C46780a() {
        }

        /* renamed from: a */
        public final int mo73982a(int i) {
            return i == 0 ? R.string.drb : R.string.bgu;
        }

        /* renamed from: b */
        public final void mo73987b(InfoStickerTabItemView infoStickerTabItemView, Context context) {
            C52711k.m112240b(infoStickerTabItemView, "$this$unselected");
            C52711k.m112240b(context, "context");
            infoStickerTabItemView.setParentBackground(null);
        }

        /* renamed from: a */
        public final void mo73983a(InfoStickerTabItemView infoStickerTabItemView, Context context) {
            C52711k.m112240b(infoStickerTabItemView, "$this$selected");
            C52711k.m112240b(context, "context");
            infoStickerTabItemView.setParentBackground(context.getResources().getDrawable(R.drawable.cna));
        }

        /* renamed from: a */
        public final void mo73984a(InfoStickerTabItemView infoStickerTabItemView, Context context, EffectCategoryResponse effectCategoryResponse) {
            C52711k.m112240b(infoStickerTabItemView, "$this$initialize");
            C52711k.m112240b(context, "context");
            C52711k.m112240b(effectCategoryResponse, "data");
            C52711k.m112240b(infoStickerTabItemView, "$this$updateParentLayoutParams");
            LayoutParams layoutParams = infoStickerTabItemView.getParentLayout().getLayoutParams();
            layoutParams.width = (int) C9432q.m18687b(infoStickerTabItemView.getContext(), 32.0f);
            layoutParams.height = (int) C9432q.m18687b(infoStickerTabItemView.getContext(), 32.0f);
            infoStickerTabItemView.getParentLayout().setLayoutParams(layoutParams);
            infoStickerTabItemView.setTextVisibility(8);
        }

        /* renamed from: a */
        public final void mo73985a(InfoStickerTabItemView infoStickerTabItemView, View view, MotionEvent motionEvent) {
            C52711k.m112240b(infoStickerTabItemView, "$this$onTouch");
            C52711k.m112240b(view, "v");
            C52711k.m112240b(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                SimpleDraweeView iconImgView = infoStickerTabItemView.getIconImgView();
                AnimationSet animationSet = new AnimationSet(true);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(100);
                animationSet.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                iconImgView.startAnimation(animationSet);
            }
            if (motionEvent.getAction() == 1) {
                infoStickerTabItemView.getIconImgView().startAnimation(C46779h.m101584b());
            }
            if (motionEvent.getAction() == 2) {
                infoStickerTabItemView.getIconImgView().startAnimation(C46779h.m101584b());
            }
        }

        /* renamed from: a */
        public final void mo73986a(C35595a aVar, int i, int i2) {
            double d;
            C52711k.m112240b(aVar, "$this$setMarginStrategy");
            if (((float) aVar.f91491o) > aVar.f91492p && i <= aVar.f91493q) {
                TabLayout tabLayout = aVar.f91480d;
                C52711k.m112236a((Object) tabLayout, "bottomTabLayout");
                tabLayout.setTabMode(1);
            }
            float f = -1.0f;
            if (i2 == 0) {
                d = (double) aVar.f91494r;
            } else if (((float) aVar.f91491o) <= aVar.f91492p) {
                double d2 = (double) (((float) aVar.f91491o) - aVar.f91494r);
                double d3 = (double) aVar.f91496t;
                Double.isNaN(d3);
                double d4 = d3 * 6.5d;
                Double.isNaN(d2);
                d = (d2 - d4) / 6.0d;
            } else if (i > 8) {
                double d5 = (double) (((float) aVar.f91491o) - aVar.f91494r);
                double d6 = (double) aVar.f91496t;
                Double.isNaN(d6);
                double d7 = d6 * 8.5d;
                Double.isNaN(d5);
                d = (d5 - d7) / 8.0d;
            } else {
                double d8 = (double) ((((float) aVar.f91491o) - (aVar.f91494r * 2.0f)) - (((float) i) * aVar.f91496t));
                double d9 = (double) (i - 1);
                Double.isNaN(d8);
                Double.isNaN(d9);
                d = d8 / d9;
            }
            if (i2 == i - 1) {
                f = aVar.f91494r;
            }
            C35595a.m80399a(aVar.f91480d.mo90695c(i2), (int) aVar.f91496t, -1, (int) d, (int) f);
        }
    }

    private C46779h() {
    }

    /* renamed from: a */
    public static C35584av m101583a() {
        return new C46780a();
    }

    public final /* synthetic */ Object invoke() {
        return m101583a();
    }

    /* renamed from: b */
    public static AnimationSet m101584b() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }
}
