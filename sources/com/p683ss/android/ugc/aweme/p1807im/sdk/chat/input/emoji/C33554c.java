package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29351i;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29292h;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29299b;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33243e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c */
public final class C33554c extends PagerAdapter {

    /* renamed from: a */
    public C33519b f86975a;

    /* renamed from: b */
    public C33243e f86976b;

    /* renamed from: c */
    private C29292h f86977c;

    /* renamed from: d */
    private SwipeControlledViewPager f86978d;

    /* renamed from: e */
    private C29351i f86979e = new C29351i();

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        return this.f86977c.mo59239f().mo59309e();
    }

    public final /* synthetic */ Object instantiateItem(final ViewGroup viewGroup, int i) {
        return this.f86979e.mo59295a(viewGroup, this.f86978d, i, this.f86977c, (C29361p) new C29361p() {
            /* renamed from: c */
            public final void mo59294c() {
            }

            /* renamed from: a */
            public final void mo59290a() {
                C33554c.this.f86975a.mo70576a(67);
            }

            /* renamed from: b */
            public final void mo59293b() {
                EmojiManagerActivity.m76897a(viewGroup.getContext());
            }

            /* renamed from: a */
            public final void mo59292a(String str) {
                C33554c.this.f86975a.mo70581a(str);
            }

            /* renamed from: a */
            public final void mo59291a(View view, C29285a aVar, int i) {
                C29299b.m69093a(aVar.f76668d);
                C33554c.this.f86976b.mo70577a(aVar);
            }
        });
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public C33554c(C33519b bVar, SwipeControlledViewPager swipeControlledViewPager, C29292h hVar) {
        this.f86978d = swipeControlledViewPager;
        this.f86975a = bVar;
        this.f86977c = hVar;
        this.f86976b = new C33243e(bVar, this.f86978d.getContext());
    }
}
