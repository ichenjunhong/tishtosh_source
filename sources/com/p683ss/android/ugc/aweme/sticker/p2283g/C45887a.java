package com.p683ss.android.ugc.aweme.sticker.p2283g;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.shortvideo.C42423an;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.search.SearchStickerViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.g.a */
public final class C45887a implements C45889c {

    /* renamed from: a */
    private final AppCompatActivity f115904a;

    /* renamed from: b */
    private final ShortVideoContext f115905b;

    /* renamed from: a */
    public final void mo92486a(String str, String str2) {
        C52711k.m112240b(str, "enterMethod");
        C52711k.m112240b(str2, "keyword");
        C45890d.m99781a("search_prop", (Map<String, String>) C45890d.m99780a(this.f115905b, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("enter_method", str), C52856t.m112465a("search_keyword", str2)}));
    }

    /* renamed from: a */
    public final void mo92479a() {
        C45890d.m99781a("click_prop_search", (Map<String, String>) C45890d.m99780a(this.f115905b, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("group_id", C42423an.m93185a())}));
    }

    /* renamed from: b */
    public final void mo92487b() {
        C45890d.m99781a("enter_prop_search", (Map<String, String>) C45890d.m99780a(this.f115905b, (C52847n<String, String>[]) new C52847n[0]));
    }

    /* renamed from: c */
    private final boolean m99749c() {
        return C52711k.m112239a((Object) (Boolean) ((SearchStickerViewModel) C0214z.m440a((FragmentActivity) this.f115904a).mo359a(SearchStickerViewModel.class)).f116711b.getValue(), (Object) Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo92484a(String str) {
        String str2 = "click_prop_tab";
        ShortVideoContext shortVideoContext = this.f115905b;
        C52847n[] nVarArr = new C52847n[1];
        String str3 = "tab_name";
        if (str == null) {
            str = "";
        }
        nVarArr[0] = C52856t.m112465a(str3, str);
        C45890d.m99781a(str2, (Map<String, String>) C45890d.m99780a(shortVideoContext, (C52847n<String, String>[]) nVarArr));
    }

    public C45887a(AppCompatActivity appCompatActivity, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        this.f115904a = appCompatActivity;
        this.f115905b = shortVideoContext;
    }

    /* renamed from: a */
    private final HashMap<String, String> m99748a(Effect effect, String str) {
        ShortVideoContext shortVideoContext = this.f115905b;
        C52847n[] nVarArr = new C52847n[4];
        nVarArr[0] = C52856t.m112465a("enter_method", str);
        nVarArr[1] = C52856t.m112465a("prop_id", effect.getEffectId());
        String str2 = "parent_pop_id";
        String parentId = effect.getParentId();
        if (parentId == null) {
            parentId = "";
        }
        nVarArr[2] = C52856t.m112465a(str2, parentId);
        nVarArr[3] = C52856t.m112465a("prop_index", effect.getGradeKey());
        return C45890d.m99780a(shortVideoContext, (C52847n<String, String>[]) nVarArr);
    }

    /* renamed from: b */
    public final void mo92488b(String str, String str2) {
        C52711k.m112240b(str, "enterMethod");
        C52711k.m112240b(str2, "keyword");
        C45890d.m99781a("search_prop_empty", (Map<String, String>) C45890d.m99780a(this.f115905b, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("enter_method", str), C52856t.m112465a("search_keyword", str2)}));
    }

    /* renamed from: a */
    public final void mo92480a(long j, int i) {
        C45890d.m99781a("tool_performance_enter_prop_tab", (Map<String, String>) C45890d.m99780a(this.f115905b, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("duration", String.valueOf(j)), C52856t.m112465a("status", String.valueOf(i))}));
    }

    /* renamed from: a */
    public final void mo92485a(String str, long j) {
        C52711k.m112240b(str, "effectId");
        C45890d.m99781a("tool_performance_effect_use_info", (Map<String, String>) C45890d.m99780a(this.f115905b, (C52847n<String, String>[]) new C52847n[]{C52856t.m112465a("duration", String.valueOf(j)), C52856t.m112465a("effect_id", str)}));
    }

    /* renamed from: a */
    public final void mo92482a(Effect effect, boolean z, String str) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str, "enterMethod");
        HashMap a = m99748a(effect, str);
        if (z) {
            Map map = a;
            String str2 = "parent_pop_id";
            String parentId = effect.getParentId();
            if (parentId == null) {
                parentId = "";
            }
            map.put(str2, parentId);
        }
        C45890d.m99781a("prop_save", (Map<String, String>) a);
    }

    /* renamed from: a */
    public final void mo92481a(Effect effect, String str, String str2, int i) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str2, "enterMethod");
        HashMap a = m99748a(effect, str2);
        String str3 = "tab_name";
        if (str == null) {
            str = "";
        }
        a.put(str3, str);
        if (m99749c()) {
            Map map = a;
            map.put("after_search", "1");
            map.put("impr_position", String.valueOf(i));
        }
        C45890d.m99781a("prop_show", (Map<String, String>) a);
    }

    /* renamed from: a */
    public final void mo92483a(Effect effect, boolean z, String str, String str2, int i) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(str2, "enterMethod");
        HashMap a = m99748a(effect, str2);
        String str3 = "tab_name";
        if (str == null) {
            str = "";
        }
        a.put(str3, str);
        if (!z) {
            a.remove("parent_pop_id");
        }
        if (m99749c()) {
            a.put("after_search", "1");
        }
        if (C46059g.m100095s(effect)) {
            a.put("order", String.valueOf(i - 1));
        }
        Map map = a;
        map.put("impr_position", String.valueOf(i));
        C45890d.m99781a("prop_click", map);
    }
}
