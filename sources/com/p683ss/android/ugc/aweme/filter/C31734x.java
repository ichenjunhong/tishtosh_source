package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44713i;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.p683ss.android.ugc.aweme.tools.p2354c.C46936c;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p064c.p065a.p066a.p068b.C1667a;

/* renamed from: com.ss.android.ugc.aweme.filter.x */
final /* synthetic */ class C31734x implements C0199s {

    /* renamed from: a */
    private final FilterScrollerModule f82889a;

    C31734x(FilterScrollerModule filterScrollerModule) {
        this.f82889a = filterScrollerModule;
    }

    public final void onChanged(Object obj) {
        FilterScrollerModule filterScrollerModule = this.f82889a;
        Map c = C31483a.m73321c((List) obj);
        Set<Entry> entrySet = c.entrySet();
        if (filterScrollerModule.f82147a.getTabCount() - (filterScrollerModule.f82154h == null ? 0 : 1) != entrySet.size()) {
            int size = filterScrollerModule.f82154h == null ? entrySet.size() : entrySet.size() + 1;
            ArrayList arrayList = new ArrayList();
            for (Entry key : entrySet) {
                arrayList.add(((EffectCategoryResponse) key.getKey()).getName());
            }
            filterScrollerModule.f82147a.mo93995a(size, arrayList);
            filterScrollerModule.f82147a.mo90692b();
            filterScrollerModule.f82152f.clear();
            int i = 0;
            for (Entry entry : entrySet) {
                filterScrollerModule.f82152f.add(entry.getKey());
                AppCompatActivity appCompatActivity = filterScrollerModule.f82149c;
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) entry.getKey();
                C31407aj ajVar = filterScrollerModule.f82159m;
                AVDmtTabItemView a = C46784a.m101614a(appCompatActivity);
                a.mo93985a();
                if (TextUtils.isEmpty(effectCategoryResponse.getIcon_normal_url())) {
                    a.setText(effectCategoryResponse.getName());
                } else {
                    a.mo93987a(effectCategoryResponse.getIcon_normal_url(), 0);
                }
                if (!(ajVar == null || i == 0)) {
                    ajVar.mo64308a(effectCategoryResponse.getId(), effectCategoryResponse.getTags(), effectCategoryResponse.getTagsUpdateTime(), new C48710o(a) {

                        /* renamed from: a */
                        final /* synthetic */ AVDmtTabItemView f82320a;

                        /* renamed from: a */
                        public final void mo8641a() {
                            this.f82320a.mo93989b(true);
                        }

                        /* renamed from: b */
                        public final void mo8642b() {
                            this.f82320a.mo93989b(false);
                        }

                        {
                            this.f82320a = r1;
                        }
                    });
                }
                C44709f a2 = filterScrollerModule.f82147a.mo90678a().mo90742a((View) a);
                C44713i iVar = a2.f113164h;
                if (iVar != null) {
                    iVar.setBackgroundColor(C0726c.m2098c(filterScrollerModule.f82149c, R.color.b2k));
                }
                filterScrollerModule.f82147a.mo90685a(a2, false);
                a.setOnClickListener(new OnClickListener(i, a2) {

                    /* renamed from: a */
                    final /* synthetic */ int f82168a;

                    /* renamed from: b */
                    final /* synthetic */ C44709f f82169b;

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        int i = 0;
                        FilterScrollerModule.this.mo64260a(false);
                        if (FilterScrollerModule.this.f82150d != null) {
                            C31376c cVar = new C31376c(FilterScrollerModule.this.f82148b.getContext());
                            C31420b bVar = FilterScrollerModule.this.f82151e;
                            int i2 = this.f82168a;
                            if (bVar != null) {
                                List b = bVar.mo92825b();
                                int i3 = 0;
                                int i4 = 0;
                                while (true) {
                                    if (i3 >= b.size()) {
                                        break;
                                    } else if (i2 == i4) {
                                        i = i3;
                                        break;
                                    } else {
                                        if (((C31459g) b.get(i3)).f82325b.equals("LINE")) {
                                            i4++;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            cVar.f4778g = i;
                            FilterScrollerModule.this.f82150d.mo5022a((C1346r) cVar);
                        }
                        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) FilterScrollerModule.this.f82152f.get(this.f82169b.f113161e);
                        if (!(FilterScrollerModule.this.f82153g == null || effectCategoryResponse == null)) {
                            C47702b.f120193a.mo94984a("click_filter_tab", C42438az.m93209a().mo86526a("creation_id", FilterScrollerModule.this.f82153g.getCreationId()).mo86526a("shoot_way", FilterScrollerModule.this.f82153g.getShootWay()).mo86526a("tab_name", effectCategoryResponse.getName()).mo86526a("content_source", FilterScrollerModule.this.f82153g.getContentSource()).mo86526a("content_type", FilterScrollerModule.this.f82153g.getContentType()).mo86526a("enter_from", "video_shoot_page").mo86526a("scene_id", "1002").f107329a);
                        }
                        this.f82169b.mo90744a();
                    }

                    {
                        this.f82168a = r2;
                        this.f82169b = r3;
                    }
                });
                i++;
            }
            if (filterScrollerModule.f82154h != null) {
                new EffectCategoryResponse().setName(filterScrollerModule.f82154h.f82346j.mo64368a());
                View a3 = filterScrollerModule.f82154h.f82346j.mo64367a(filterScrollerModule.f82149c);
                C44709f a4 = filterScrollerModule.f82147a.mo90678a().mo90742a(a3);
                ((View) a3.getParent()).setOnClickListener(new C31733w(filterScrollerModule));
                filterScrollerModule.f82147a.mo90684a(a4);
            }
            if (!entrySet.isEmpty()) {
                C44709f a5 = filterScrollerModule.f82147a.mo90679a(0);
                if (a5 != null) {
                    filterScrollerModule.f82147a.post(new C31603u(filterScrollerModule, a5));
                }
            }
            filterScrollerModule.f82147a.setOnTabClickListener(C31604v.f82609a);
        }
        List b = filterScrollerModule.f82151e.mo92825b();
        List a6 = C31456e.m73268a(c);
        filterScrollerModule.f82151e.mo64318a(a6);
        if (!C9376b.m18558a((Collection<T>) a6) && filterScrollerModule.f82157k == null) {
            filterScrollerModule.f82157k = filterScrollerModule.f82160n.mo64414d().mo6514a(C1667a.m5940a()).mo6505a(filterScrollerModule.f82158l, C46936c.m101974a());
        }
        C1208c.m3655a(new C31455d(b, a6), true).mo3931a((C1322a) filterScrollerModule.f82151e);
        ((C1440au) filterScrollerModule.f82148b.getItemAnimator()).f5184m = false;
        if (filterScrollerModule.f82155i != null) {
            filterScrollerModule.f82151e.mo64320a(filterScrollerModule.f82155i);
            filterScrollerModule.mo64259a(filterScrollerModule.f82155i);
            filterScrollerModule.f82155i = null;
        }
    }
}
