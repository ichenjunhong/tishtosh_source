package com.p683ss.android.ugc.aweme.sticker.p2301k;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1337j;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a.C46124a;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.k.c */
public final class C46053c extends C1340m implements C0199s<EffectCategoryModel>, C1337j, OnAttachStateChangeListener {

    /* renamed from: a */
    public RecyclerView f116193a;

    /* renamed from: b */
    private String f116194b;

    /* renamed from: c */
    private Fragment f116195c;

    /* renamed from: d */
    private GridLayoutManager f116196d;

    /* renamed from: e */
    private C46124a f116197e;

    /* renamed from: f */
    private String f116198f;

    /* renamed from: g */
    private Map<String, Boolean> f116199g = new HashMap();

    /* renamed from: h */
    private List<String> f116200h = new ArrayList();

    /* renamed from: i */
    private C46054d f116201i;

    /* renamed from: b */
    public final void mo5077b(View view) {
    }

    /* renamed from: b */
    private void m100047b() {
        for (String put : this.f116199g.keySet()) {
            this.f116199g.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    private void m100045a() {
        int j = this.f116196d.mo4749j();
        int l = this.f116196d.mo4751l();
        this.f116200h.clear();
        int i = j + 1;
        while (true) {
            boolean z = false;
            if (i >= l + 1) {
                break;
            }
            StickerWrapper stickerWrapper = (StickerWrapper) this.f116197e.mo92831c(i);
            if (m100046a(stickerWrapper)) {
                String effectId = stickerWrapper.f115779a.getEffectId();
                Boolean bool = (Boolean) this.f116199g.get(effectId);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (!z && this.f116201i != null) {
                    this.f116201i.mo92602b(stickerWrapper.f115779a);
                }
                this.f116199g.put(effectId, Boolean.valueOf(true));
                this.f116200h.add(effectId);
            }
            i++;
        }
        for (String str : this.f116199g.keySet()) {
            if (!this.f116200h.contains(str)) {
                this.f116199g.put(str, Boolean.valueOf(false));
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        m100047b();
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.f116195c.getUserVisibleHint()) {
            m100045a();
        }
    }

    /* renamed from: a */
    private static boolean m100046a(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || stickerWrapper.f115779a == null || TextUtils.isEmpty(stickerWrapper.f115779a.getAdRawData())) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) obj;
        if (effectCategoryModel != null) {
            String key = effectCategoryModel.getKey();
            if (!TextUtils.equals(this.f116198f, key)) {
                if (TextUtils.equals(key, this.f116194b)) {
                    m100045a();
                } else {
                    m100047b();
                }
                this.f116198f = key;
            }
        }
    }

    /* renamed from: a */
    public final void mo5076a(View view) {
        if (this.f116195c.getUserVisibleHint()) {
            StickerWrapper stickerWrapper = (StickerWrapper) this.f116197e.mo92831c(RecyclerView.m4275f(view) + 1);
            if (m100046a(stickerWrapper)) {
                String effectId = stickerWrapper.f115779a.getEffectId();
                boolean z = false;
                Boolean bool = (Boolean) this.f116199g.get(effectId);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (!z && this.f116201i != null) {
                    this.f116201i.mo92602b(stickerWrapper.f115779a);
                }
                this.f116199g.put(effectId, Boolean.valueOf(true));
            }
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.f116193a.mo4816b((C1337j) this);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            m100045a();
        }
    }

    public C46053c(String str, String str2, Fragment fragment, RecyclerView recyclerView, GridLayoutManager gridLayoutManager, C46124a aVar, C46054d dVar) {
        this.f116194b = str2;
        this.f116195c = fragment;
        this.f116193a = recyclerView;
        this.f116196d = gridLayoutManager;
        this.f116197e = aVar;
        this.f116201i = dVar;
        ((TabSelectViewModel) C0214z.m440a(fragment.getActivity()).mo359a(TabSelectViewModel.class)).mo93418a(str).observe(fragment, this);
    }
}
