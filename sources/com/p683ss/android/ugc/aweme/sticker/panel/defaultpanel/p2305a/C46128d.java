package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46134a;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46142e;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46353k;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.d */
public final class C46128d extends C46130e<StickerWrapper> {

    /* renamed from: a */
    public int f116409a = -1;

    /* renamed from: b */
    private HashMap<String, Integer> f116410b;

    /* renamed from: d */
    private List<? extends StickerWrapper> f116411d = new ArrayList();

    /* renamed from: e */
    private final HashSet<String> f116412e = new HashSet<>();

    /* renamed from: f */
    private final AppCompatActivity f116413f;

    /* renamed from: g */
    private final C46354l f116414g;

    /* renamed from: h */
    private final C45814b f116415h;

    /* renamed from: i */
    private final C45889c f116416i;

    /* renamed from: a */
    public final int mo92830a(Effect effect) {
        if (effect == null) {
            return -1;
        }
        HashMap<String, Integer> hashMap = this.f116410b;
        if (hashMap != null) {
            Integer num = (Integer) hashMap.get(effect.getEffectId());
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo92823b(int i) {
        Effect effect;
        StickerWrapper stickerWrapper = (StickerWrapper) mo92831c(i);
        if (stickerWrapper != null) {
            effect = stickerWrapper.f115779a;
        } else {
            effect = null;
        }
        if (C46059g.m100095s(effect)) {
            return BaseNotice.COMMENT_REPLY_WITH_VIDEO;
        }
        return 1001;
    }

    /* renamed from: a */
    public final void mo64318a(List<? extends StickerWrapper> list) {
        C52711k.m112240b(list, "data");
        this.f116411d = list;
        this.f116410b = C46057f.m100058b(this.f116411d);
        this.f116409a = -1;
        super.mo64318a(this.f116411d);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            StickerWrapper stickerWrapper = (StickerWrapper) next;
            HashSet<String> hashSet = this.f116412e;
            Effect effect = stickerWrapper.f115779a;
            C52711k.m112236a((Object) effect, "stickerWrapper.effect");
            if (!hashSet.contains(effect.getEffectId())) {
                HashSet<String> hashSet2 = this.f116412e;
                Effect effect2 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect2, "stickerWrapper.effect");
                hashSet2.add(effect2.getEffectId());
                C45889c cVar = this.f116416i;
                Effect effect3 = stickerWrapper.f115779a;
                C52711k.m112236a((Object) effect3, "stickerWrapper.effect");
                cVar.mo92481a(effect3, "", "", i2);
            }
            i = i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92826b(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (getItemViewType(i) != 1003) {
            ((C46142e) vVar).mo92842a((StickerWrapper) mo92831c(i), this.f116411d, -1, i);
        } else {
            ((C46134a) vVar).mo92832a((StickerWrapper) mo92831c(i), this.f116411d, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C1352v mo92824b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i != 1003) {
            return new C46142e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.to, viewGroup, false), this.f116414g, this.f116415h, this.f116411d);
        }
        return new C46134a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.to, viewGroup, false), this.f116414g, this.f116415h, this.f116411d);
    }

    public C46128d(AppCompatActivity appCompatActivity, C46354l lVar, C45814b bVar, C45889c cVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "selectedController");
        C52711k.m112240b(cVar, "stickerMobHelper");
        this.f116413f = appCompatActivity;
        this.f116414g = lVar;
        this.f116415h = bVar;
        this.f116416i = cVar;
        this.f116414g.mo92989g().mo93018d().observe(this.f116413f, new C0199s<C46353k>(this) {

            /* renamed from: a */
            final /* synthetic */ C46128d f116417a;

            {
                this.f116417a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C46353k kVar = (C46353k) obj;
                if (kVar != null) {
                    Effect effect = kVar.f116947a;
                    Effect effect2 = kVar.f116948b;
                    int a = this.f116417a.mo92830a(effect);
                    int a2 = this.f116417a.mo92830a(effect2);
                    if (a >= 0) {
                        this.f116417a.notifyItemChanged(a + 1, effect);
                    }
                    if (a2 >= 0) {
                        this.f116417a.f116409a = a2;
                        this.f116417a.notifyItemChanged(a2 + 1, effect2);
                    } else {
                        this.f116417a.f116409a = -1;
                    }
                }
            }
        });
    }
}
