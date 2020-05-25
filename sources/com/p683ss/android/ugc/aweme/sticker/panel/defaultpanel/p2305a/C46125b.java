package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a;

import android.app.Activity;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.widget.RecyclerView.C1341n;
import android.view.View;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.C46156i;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a.b */
public final class C46125b extends C0678q {

    /* renamed from: a */
    ViewPager f116399a;

    /* renamed from: b */
    private C1341n f116400b;

    /* renamed from: c */
    private Activity f116401c;

    /* renamed from: d */
    private C46156i f116402d;

    /* renamed from: e */
    private C12361b f116403e;

    /* renamed from: f */
    private List<EffectCategoryModel> f116404f = new ArrayList();

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final int getCount() {
        return this.f116404f.size();
    }

    /* renamed from: a */
    public final void mo92829a(List<EffectCategoryModel> list) {
        this.f116404f.clear();
        if (!list.isEmpty()) {
            this.f116404f.addAll(list);
        }
    }

    /* renamed from: a */
    public final View mo92828a(int i) {
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f116404f.get(i);
        final AVDmtTabItemView aVDmtTabItemView = (AVDmtTabItemView) this.f116402d.mo92850a(effectCategoryModel.getKey()).mo92848a(this.f116401c, effectCategoryModel, new C46127c(this, i));
        ((C46354l) this.f116403e.mo23372a(C46354l.class)).mo92980a(effectCategoryModel.getId(), effectCategoryModel.getTags(), effectCategoryModel.getTagsUpdateTime(), (C48710o) new C48710o() {
            /* renamed from: b */
            public final void mo8642b() {
            }

            /* renamed from: a */
            public final void mo8641a() {
                aVDmtTabItemView.mo93989b(true);
            }
        });
        return aVDmtTabItemView;
    }

    public final Fragment getItem(int i) {
        return (Fragment) this.f116402d.mo92850a(((EffectCategoryModel) this.f116404f.get(i)).getKey()).mo92847a(i, (C46354l) this.f116403e.mo23372a(C46354l.class), (C45814b) this.f116403e.mo23372a(C45814b.class), this.f116400b);
    }

    public C46125b(C0654k kVar, Activity activity, ViewPager viewPager, C12361b bVar) {
        super(kVar);
        this.f116399a = viewPager;
        this.f116400b = new C1341n();
        this.f116402d = new C46156i(bVar);
        this.f116403e = bVar;
        this.f116401c = activity;
    }
}
