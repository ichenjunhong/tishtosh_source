package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46134a;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46137c;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46142e;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.a */
public final class C46124a extends C46130e<StickerWrapper> {

    /* renamed from: a */
    public int f116391a;

    /* renamed from: b */
    public List<StickerWrapper> f116392b;

    /* renamed from: d */
    private HashMap<String, Integer> f116393d;

    /* renamed from: e */
    private HashMap<String, Integer> f116394e;

    /* renamed from: f */
    private C46354l f116395f;

    /* renamed from: g */
    private C45814b f116396g;

    /* renamed from: h */
    private C46086b f116397h;

    /* renamed from: i */
    private C12361b f116398i;

    /* renamed from: b */
    public final List<StickerWrapper> mo92825b() {
        return this.f116392b;
    }

    /* renamed from: a */
    public final void mo64318a(List<StickerWrapper> list) {
        this.f116392b = list;
        mo92827b(list);
        super.mo64318a(this.f116392b);
    }

    /* renamed from: a */
    public final int mo92822a(Effect effect) {
        if (effect == null) {
            return -1;
        }
        Integer num = (Integer) this.f116393d.get(effect.getEffectId());
        if (num == null) {
            if (TextUtils.isEmpty(effect.getResourceId())) {
                return -1;
            }
            num = (Integer) this.f116394e.get(effect.getResourceId());
            if (num == null) {
                return -1;
            }
        }
        return num.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo92823b(int i) {
        if (C46059g.m100095s(((StickerWrapper) mo92831c(i)).f115779a)) {
            return BaseNotice.COMMENT_REPLY_WITH_VIDEO;
        }
        if (!((C46255p) this.f116398i.mo23372a(C46255p.class)).f116708i || !C46059g.m100087k(((StickerWrapper) mo92831c(i)).f115779a)) {
            return 1001;
        }
        return 1004;
    }

    /* renamed from: b */
    public void mo92827b(List<StickerWrapper> list) {
        this.f116393d = new HashMap<>();
        this.f116394e = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                StickerWrapper stickerWrapper = (StickerWrapper) list.get(i);
                if (!(stickerWrapper == null || stickerWrapper.f115779a == null)) {
                    if (!TextUtils.isEmpty(stickerWrapper.f115779a.getEffectId())) {
                        this.f116393d.put(stickerWrapper.f115779a.getEffectId(), Integer.valueOf(i));
                    }
                    if (!TextUtils.isEmpty(stickerWrapper.f115779a.getResourceId())) {
                        this.f116394e.put(stickerWrapper.f115779a.getResourceId(), Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1352v mo92824b(ViewGroup viewGroup, int i) {
        switch (i) {
            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                return new C46134a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.to, viewGroup, false), this.f116395f, this.f116396g, this.f116392b);
            case 1004:
                C46137c cVar = new C46137c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tn, viewGroup, false), this.f116395f, this.f116396g, this.f116392b);
                cVar.f116431a = this.f116397h;
                return cVar;
            default:
                C46142e eVar = new C46142e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.to, viewGroup, false), this.f116395f, this.f116396g, this.f116392b);
                eVar.f116448a = this.f116397h;
                return eVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo92826b(C1352v vVar, int i) {
        switch (getItemViewType(i)) {
            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                ((C46134a) vVar).mo92832a((StickerWrapper) mo92831c(i), this.f116392b, i);
                return;
            case 1004:
                ((C46137c) vVar).mo92834a((StickerWrapper) mo92831c(i), this.f116392b, this.f116391a, i);
                return;
            default:
                ((C46142e) vVar).mo92842a((StickerWrapper) mo92831c(i), this.f116392b, this.f116391a, i);
                return;
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            StickerWrapper stickerWrapper = (StickerWrapper) list.get(0);
            StickerWrapper stickerWrapper2 = (StickerWrapper) mo92831c(i);
            if (!(stickerWrapper == null || stickerWrapper2 == null)) {
                stickerWrapper2.f115781c = stickerWrapper.f115781c;
            }
            if (getItemViewType(i) == 1001) {
                ((C46142e) vVar).mo92839b(stickerWrapper);
            } else if (getItemViewType(i) == 1003) {
                ((C46134a) vVar).mo92839b(stickerWrapper);
            } else {
                if (getItemViewType(i) == 1004) {
                    C46137c cVar = (C46137c) vVar;
                    if (C45859b.m99701b(this.f116395f, stickerWrapper.f115779a)) {
                        cVar.f116433c.animate().alpha(1.0f).setDuration(150).start();
                    } else {
                        cVar.f116433c.animate().alpha(0.0f).setDuration(150).start();
                    }
                }
            }
        } else {
            super.onBindViewHolder(vVar, i, list);
        }
    }

    public C46124a(C12361b bVar, C46354l lVar, C45814b bVar2, C46086b bVar3) {
        this.f116398i = bVar;
        this.f116395f = lVar;
        this.f116396g = bVar2;
        this.f116397h = bVar3;
        mo92827b(null);
    }
}
