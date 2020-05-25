package com.p683ss.android.ugc.aweme.sticker.types.multi;

import android.arch.lifecycle.C0183j;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9414h;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46036g;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46190j;
import com.p683ss.android.ugc.aweme.sticker.panel.C46191k.C46193b;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.types.multi.p2331a.C46593a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.MultiStickerPresenter */
public class MultiStickerPresenter implements C0183j, C46190j, C46193b {

    /* renamed from: a */
    private C46598c f117551a;

    /* renamed from: b */
    private Effect f117552b;

    /* renamed from: c */
    private boolean f117553c = true;

    /* renamed from: d */
    private boolean f117554d;

    /* renamed from: e */
    private C46354l f117555e;

    /* renamed from: f */
    private C45889c f117556f;

    /* renamed from: a */
    public final void mo92763a(FaceStickerBean faceStickerBean, String str) {
    }

    /* renamed from: b */
    public final boolean mo92899b() {
        return this.f117554d;
    }

    /* renamed from: c */
    public final void mo92900c() {
        this.f117554d = true;
        this.f117551a.mo93166a();
    }

    /* renamed from: d */
    public final void mo92901d() {
        this.f117554d = false;
        this.f117551a.mo93167b();
    }

    /* renamed from: a */
    public final void mo91209a(C46318d dVar) {
        Effect effect = dVar.f116858a;
        this.f117551a.mo93168c();
        this.f117552b = null;
        this.f117551a.mo93167b();
    }

    /* renamed from: a */
    private int m101134a(List<Effect> list) {
        if (C9414h.m18630a(list) || this.f117555e.mo92986d() == null) {
            return 0;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(((Effect) list.get(i)).getId(), this.f117555e.mo92986d().getId())) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo91208a(C46315a aVar) {
        boolean z;
        List list;
        Effect effect = aVar.f116852a;
        this.f117551a.mo93168c();
        if (this.f117552b == null || this.f117552b.getChildren() == null) {
            z = false;
        } else {
            z = this.f117552b.getChildren().contains(effect.getEffectId());
        }
        if (!z) {
            List list2 = null;
            if (!C46059g.m100100x(effect)) {
                this.f117552b = null;
                this.f117554d = false;
                this.f117551a.mo93167b();
                return;
            }
            if (effect != null) {
                List<String> children = effect.getChildren();
                if (children == null) {
                    list = null;
                } else {
                    Map b = this.f117555e.mo92973a().mo92537i().mo92541b();
                    list = new ArrayList();
                    for (String str : children) {
                        Effect effect2 = (Effect) b.get(str);
                        if (effect2 != null) {
                            list.add(effect2);
                        }
                    }
                }
                C46598c cVar = this.f117551a;
                cVar.f117569b = list;
                C46593a aVar2 = cVar.f117568a;
                aVar2.f117557a = C46036g.m100020a(list, null);
                aVar2.notifyDataSetChanged();
                aVar2.f117559c = false;
                list2 = list;
            }
            if (this.f117553c) {
                this.f117551a.mo93388a(effect, m101134a(list2));
                this.f117553c = false;
            } else {
                this.f117551a.mo93388a(effect, 0);
            }
            this.f117554d = true;
            this.f117551a.mo93166a();
            this.f117556f.mo92481a(effect, FaceStickerBean.sCurPropSource, "click_banner", -1);
            this.f117552b = effect;
        }
    }

    /* renamed from: b */
    public final void mo92764b(FaceStickerBean faceStickerBean, String str) {
        if (C46059g.m100100x(this.f117552b) && !mo92899b()) {
            mo92900c();
        }
    }

    public MultiStickerPresenter(AppCompatActivity appCompatActivity, View view, C12361b bVar, C46354l lVar, C45814b bVar2, C45889c cVar) {
        C46600e eVar = C46597b.f117567a;
        this.f117556f = cVar;
        this.f117555e = lVar;
        C46598c cVar2 = new C46598c(appCompatActivity, view, lVar, bVar2, ((C46255p) bVar.mo23372a(C46255p.class)).f116706g, eVar);
        this.f117551a = cVar2;
        appCompatActivity.getLifecycle().mo324a(this);
    }
}
