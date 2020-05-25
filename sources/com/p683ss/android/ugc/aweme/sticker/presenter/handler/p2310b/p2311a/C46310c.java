package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.p2311a;

import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45890d;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46313c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.b.a.c */
public final class C46310c implements C46313c {

    /* renamed from: a */
    private final ShortVideoContext f116845a;

    public C46310c(ShortVideoContext shortVideoContext) {
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f116845a = shortVideoContext;
    }

    /* renamed from: c */
    public final void mo93045c(Effect effect, String str, String str2) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterMethod");
        C45890d.m99781a("create_moji_prop", (Map<String, String>) C45890d.m99780a(this.f116845a, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("prop_id", effect.getEffectId()), C52856t.m112465a("enter_method", str2), C52856t.m112465a("tab_name", str)}));
    }

    /* renamed from: d */
    public final void mo93046d(Effect effect, String str, String str2) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterMethod");
        C45890d.m99781a("create_moji_prop", (Map<String, String>) C45890d.m99780a(this.f116845a, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("prop_id", effect.getEffectId()), C52856t.m112465a("enter_method", str2), C52856t.m112465a("tab_name", str)}));
    }

    /* renamed from: a */
    public final void mo93042a(Effect effect, String str, String str2) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterMethod");
        C45890d.m99781a("prop_show", (Map<String, String>) C45890d.m99780a(this.f116845a, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("enter_method", str2), C52856t.m112465a("tab_name", str), C52856t.m112465a("parent_pop_id", effect.getEffectId()), C52856t.m112465a("prop_id", ""), C52856t.m112465a("prop_index", effect.getGradeKey())}));
    }

    /* renamed from: b */
    public final void mo93044b(Effect effect, String str, String str2) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterMethod");
        C45890d.m99781a("prop_click", (Map<String, String>) C45890d.m99780a(this.f116845a, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("enter_method", str2), C52856t.m112465a("tab_name", str), C52856t.m112465a("parent_pop_id", effect.getEffectId()), C52856t.m112465a("prop_id", ""), C52856t.m112465a("prop_index", effect.getGradeKey())}));
    }

    /* renamed from: a */
    public final void mo93043a(Effect effect, String str, String str2, int i, String str3) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterMethod");
        C52711k.m112240b(str3, "idMap");
        C45890d.m99781a("create_moji_prop_complete", (Map<String, String>) C45890d.m99780a(this.f116845a, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("enter_method", str2), C52856t.m112465a("tab_name", str), C52856t.m112465a("prop_id", effect.getEffectId()), C52856t.m112465a("ttl_count", String.valueOf(i)), C52856t.m112465a("id_map", str3)}));
    }
}
