package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.arch.lifecycle.C0184k;
import android.support.p030v4.view.PagerAdapter;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29317a;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29322d;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29322d.C29324b;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29326e;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29326e.C29327a;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29334a;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29348g;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29359n;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29360o;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29297a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29299b;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33243e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.d */
public final class C33556d extends PagerAdapter {

    /* renamed from: a */
    public C33519b f86982a;

    /* renamed from: b */
    public C33243e f86983b;

    /* renamed from: c */
    private C29292h f86984c;

    /* renamed from: d */
    private SwipeControlledViewPager f86985d;

    /* renamed from: e */
    private HashMap<Integer, C29322d> f86986e = new LinkedHashMap();

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        C29359n g = this.f86984c.mo59240g();
        if (g.f76907b == null) {
            return 0;
        }
        return g.f76907b.size();
    }

    /* renamed from: a */
    private static <T extends C29360o> View m76950a(ViewGroup viewGroup, T t) {
        View a = t.mo59272a(viewGroup);
        if (viewGroup.indexOfChild(a) < 0) {
            viewGroup.addView(a);
        }
        return a;
    }

    public final /* synthetic */ Object instantiateItem(final ViewGroup viewGroup, int i) {
        C29291g gVar;
        View view;
        C29359n g = this.f86984c.mo59240g();
        if (i < 0 || g.f76907b == null || i >= g.f76907b.size()) {
            gVar = null;
        } else {
            gVar = (C29291g) g.f76907b.get(i);
        }
        if (gVar == null || !gVar.mo59222h() || C9376b.m18558a((Collection<T>) g.mo59349b(i).mo59226l())) {
            return m76950a(viewGroup, new C29348g());
        }
        if (gVar.mo59223i() == 3) {
            if (C29368b.m69241a().f76934b == 0) {
                return m76950a(viewGroup, new C29348g());
            }
            if (gVar.mo59224j() == 0) {
                return m76950a(viewGroup, new C29334a());
            }
        }
        if (gVar.mo59223i() == 4 && C29297a.m69081a().f76679a == 0) {
            return m76950a(viewGroup, new C29348g());
        }
        C335571 r10 = new C29361p() {
            /* renamed from: c */
            public final void mo59294c() {
            }

            /* renamed from: a */
            public final void mo59290a() {
                C33556d.this.f86982a.mo70576a(67);
            }

            /* renamed from: b */
            public final void mo59293b() {
                EmojiManagerActivity.m76897a(viewGroup.getContext());
            }

            /* renamed from: a */
            public final void mo59292a(String str) {
                C33556d.this.f86982a.mo70581a(str);
            }

            /* renamed from: a */
            public final void mo59291a(View view, C29285a aVar, int i) {
                C29299b.m69093a(aVar.f76668d);
                C33556d.this.f86983b.mo70577a(aVar);
            }
        };
        if (this.f86986e.get(Integer.valueOf(i)) != null) {
            view = ((C29322d) this.f86986e.get(Integer.valueOf(i))).mo59266a();
        } else {
            C29322d dVar = new C29322d((C0184k) viewGroup.getContext(), viewGroup, this.f86985d, gVar.mo59223i(), r10);
            List l = g.mo59349b(i).mo59226l();
            if (!(dVar.mo59267b() == null || l == null || !(!l.isEmpty()))) {
                C29317a b = dVar.mo59267b();
                if (b == null) {
                    C52711k.m112234a();
                }
                b.mo50303a(l);
            }
            if (dVar.f76740h == 2 || dVar.f76740h == 4 || dVar.f76740h == 3) {
                C29326e eVar = dVar.f76736d;
                RecyclerView recyclerView = dVar.f76734b;
                SwipeControlledViewPager swipeControlledViewPager = dVar.f76739g;
                if (l == null) {
                    C52711k.m112234a();
                }
                C52711k.m112240b(recyclerView, "viewGroup");
                C52711k.m112240b(swipeControlledViewPager, "viewPager");
                C52711k.m112240b(l, "emojis");
                C29327a aVar = new C29327a(eVar, new ArrayList(), recyclerView, l, swipeControlledViewPager);
                recyclerView.setOnTouchListener(aVar);
            }
            C29317a b2 = dVar.mo59267b();
            if (b2 != null) {
                b2.mo59262a(dVar.f76741i);
                dVar.f76734b.setAdapter(b2);
                b2.mo59260a(dVar.f76734b);
                if (dVar.f76740h == 1) {
                    dVar.f76735c.setVisibility(0);
                    dVar.f76735c.setOnClickListener(new C29324b(dVar));
                }
            }
            View a = dVar.mo59266a();
            this.f86986e.put(Integer.valueOf(i), dVar);
            view = a;
        }
        if (viewGroup.indexOfChild(view) < 0) {
            viewGroup.addView(view);
        }
        return view;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public C33556d(C33519b bVar, SwipeControlledViewPager swipeControlledViewPager, C29292h hVar) {
        this.f86985d = swipeControlledViewPager;
        this.f86982a = bVar;
        this.f86984c = hVar;
        this.f86983b = new C33243e(bVar, this.f86985d.getContext());
    }
}
