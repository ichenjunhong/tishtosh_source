package com.p683ss.android.ugc.aweme.infoSticker;

import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.infoSticker.category.InfoStickerCategoryViewModel.C35589a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.h */
public class C35610h extends C35549a<EffectCategoryResponse> {

    /* renamed from: c */
    protected FragmentActivity f91511c;

    /* renamed from: d */
    protected String f91512d;

    /* renamed from: e */
    protected SparseBooleanArray f91513e = new SparseBooleanArray();

    /* renamed from: f */
    public SparseArray<StickerWrapper> f91514f = new SparseArray<>();

    /* renamed from: g */
    public HashMap<String, C35628u> f91515g = new HashMap<>();

    /* renamed from: h */
    public ArrayList<Integer> f91516h;

    /* renamed from: i */
    public boolean f91517i = true;

    /* renamed from: j */
    public C35618o f91518j;

    /* renamed from: u */
    private HashMap<String, Integer> f91519u;

    /* renamed from: a */
    public int mo64314a() {
        if (this.f91374a) {
            return 1;
        }
        return this.f91513e.size() + 2;
    }

    /* renamed from: b */
    public int mo73953b(int i) {
        if (C35589a.m80398a()) {
            if (this.f91513e.get(i - 1)) {
                return 4;
            }
            return 1;
        } else if (this.f91513e.get(i - 1)) {
            return 3;
        } else {
            return 1;
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4526g = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    if (C35610h.this.mo64315a(i) == -2 || C35610h.this.mo64315a(i) == -5 || C35610h.this.mo64315a(i) == -4 || C35610h.this.mo64315a(i) == 3 || C35610h.this.mo64315a(i) == 4 || C35610h.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4521b;
                    }
                    return 1;
                }
            };
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74018a(EffectChannelResponse effectChannelResponse) {
        if (C9414h.m18630a(effectChannelResponse.getCategoryResponseList())) {
            int i = 0;
            for (int i2 = 0; i2 < effectChannelResponse.getAllCategoryEffects().size(); i2++) {
                StickerWrapper a = StickerWrapper.m99609a((Effect) effectChannelResponse.getAllCategoryEffects().get(i2), this.f91512d);
                if ((this.f91518j == null || !this.f91518j.mo74028a(a.f115779a)) && (this.f91517i || !C35556ac.m80349c(a.f115779a))) {
                    this.f91513e.put(i, false);
                    int i3 = i + 1;
                    this.f91514f.put(i, a);
                    i = i3;
                }
            }
            notifyDataSetChanged();
            return;
        }
        mo64318a(effectChannelResponse.getCategoryResponseList());
    }

    /* renamed from: a */
    public final void mo64318a(List<EffectCategoryResponse> list) {
        super.mo64318a(list);
        if (!C9414h.m18630a(list)) {
            VideoPublishEditModel videoPublishEditModel = C35635v.m80462a(this.f91511c).f91355c;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(i2);
                if (effectCategoryResponse != null && !C9414h.m18630a(effectCategoryResponse.getTotalEffects())) {
                    if (C35589a.m80398a()) {
                        if (this.f91516h != null) {
                            this.f91516h.add(Integer.valueOf(i + 1));
                        }
                        if (this.f91519u != null) {
                            this.f91519u.put(effectCategoryResponse.getName(), Integer.valueOf(i2));
                        }
                    }
                    int i3 = i;
                    for (int i4 = 0; i4 < effectCategoryResponse.getTotalEffects().size(); i4++) {
                        StickerWrapper a = StickerWrapper.m99609a((Effect) effectCategoryResponse.getTotalEffects().get(i4), effectCategoryResponse.getName());
                        if (this.f91518j == null || !this.f91518j.mo74028a(a.f115779a)) {
                            if (this.f91517i || !C35556ac.m80349c(a.f115779a)) {
                                this.f91513e.put(i3, false);
                                int i5 = i3 + 1;
                                this.f91514f.put(i3, a);
                                i3 = i5;
                            }
                            if (!(videoPublishEditModel == null || videoPublishEditModel.infoStickerCategoryParams == null || videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap() == null)) {
                                videoPublishEditModel.infoStickerCategoryParams.getInfoStickerCategoryMap().put(a.f115779a.getEffectId(), effectCategoryResponse.getId());
                            }
                        }
                    }
                    if (i2 != size - 1) {
                        int i6 = i3 + 1;
                        this.f91513e.put(i3, true);
                        i = i6;
                    } else {
                        i = i3;
                    }
                }
            }
        }
    }

    C35610h(FragmentActivity fragmentActivity, String str) {
        this.f91511c = fragmentActivity;
        this.f91512d = str;
        if (C35589a.m80398a()) {
            this.f91516h = new ArrayList<>();
            this.f91519u = new HashMap<>();
        }
    }

    /* renamed from: a */
    public final C1352v mo64316a(ViewGroup viewGroup, int i) {
        if (i == 3) {
            return new C35612i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rp, viewGroup, false));
        }
        if (i == 4) {
            return new C35555ab(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bh6, viewGroup, false));
        }
        return super.mo64316a(viewGroup, i);
    }

    /* renamed from: b */
    public C1352v mo73954b(ViewGroup viewGroup, int i) {
        C35628u uVar = new C35628u(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fl, viewGroup, false), this.f91511c, this);
        uVar.f91566h = "sticker";
        uVar.f91561c = this.f91375b;
        return uVar;
    }

    /* renamed from: b */
    public void mo73955b(C1352v vVar, int i) {
        Bundle bundle = new Bundle();
        if (i == 1) {
            bundle.putString("bundle_pre_subtitle", ((StickerWrapper) this.f91514f.get(i)).f115780b);
        }
        Integer num = null;
        if (mo73953b(i) == 1) {
            C35628u uVar = (C35628u) vVar;
            int i2 = i - 1;
            uVar.mo74038a(this.f91511c, (StickerWrapper) this.f91514f.get(i2), this.f91512d);
            uVar.f91564f = i;
            this.f91515g.put(((StickerWrapper) this.f91514f.get(i2)).f115779a.getEffectId(), uVar);
            bundle.putString("bundle_subtitle", ((StickerWrapper) this.f91514f.get(i2)).f115780b);
            bundle.putInt("bundle_view_type", 1);
            if (C35589a.m80398a()) {
                if (this.f91519u != null) {
                    num = (Integer) this.f91519u.get(((StickerWrapper) this.f91514f.get(i2)).f115780b);
                }
                if (num != null) {
                    bundle.putInt("bundle_subtitle_position", num.intValue());
                }
            }
        } else if (mo73953b(i) == 4 && C35589a.m80398a()) {
            C35555ab abVar = (C35555ab) vVar;
            String str = ((StickerWrapper) this.f91514f.get(i)).f115780b;
            C52711k.m112240b(str, "category");
            abVar.f91390a.setText(str);
            bundle.putString("bundle_subtitle", ((StickerWrapper) this.f91514f.get(i)).f115780b);
            bundle.putString("bundle_pre_subtitle", ((StickerWrapper) this.f91514f.get(i - 2)).f115780b);
            bundle.putInt("bundle_view_type", 4);
            if (this.f91519u != null) {
                num = (Integer) this.f91519u.get(((StickerWrapper) this.f91514f.get(i)).f115780b);
            }
            if (num != null) {
                bundle.putInt("bundle_subtitle_position", num.intValue());
            }
        }
        vVar.itemView.setTag(bundle);
    }
}
