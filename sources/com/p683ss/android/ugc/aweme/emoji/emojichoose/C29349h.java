package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1682c.C29301b;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.h */
public final class C29349h extends PagerAdapter {

    /* renamed from: a */
    public C29293i f76853a;

    /* renamed from: b */
    public C29292h f76854b;

    /* renamed from: c */
    private C29351i f76855c = new C29351i(1);

    /* renamed from: d */
    private SwipeControlledViewPager f76856d;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        return this.f76854b.mo59239f().mo59309e();
    }

    public final /* synthetic */ Object instantiateItem(final ViewGroup viewGroup, int i) {
        return this.f76855c.mo59295a(viewGroup, this.f76856d, i, this.f76854b, (C29361p) new C29361p() {
            /* renamed from: c */
            public final void mo59294c() {
                C29349h.this.f76853a.mo51883a();
            }

            /* renamed from: a */
            public final void mo59290a() {
                C29349h.this.f76853a.mo51884a(67);
            }

            /* renamed from: b */
            public final void mo59293b() {
                Context context = viewGroup.getContext();
                if (context != null) {
                    SmartRouter.buildRoute(context, "//emoji_manager").open();
                }
            }

            /* renamed from: a */
            public final void mo59292a(String str) {
                C29349h.this.f76853a.mo51887a(str, 1);
            }

            /* renamed from: a */
            public final void mo59291a(View view, C29285a aVar, int i) {
                if (i == 4) {
                    C29349h.this.f76853a.mo51885a(view, aVar, i, ((C29301b) C29349h.this.f76854b.mo59239f().f76886a).f76683b.indexOf(aVar.f76668d));
                    return;
                }
                C29349h.this.f76853a.mo51885a(view, aVar, i, -1);
            }
        });
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public C29349h(C29293i iVar, C29292h hVar, SwipeControlledViewPager swipeControlledViewPager) {
        this.f76853a = iVar;
        this.f76854b = hVar;
        this.f76856d = swipeControlledViewPager;
    }
}
