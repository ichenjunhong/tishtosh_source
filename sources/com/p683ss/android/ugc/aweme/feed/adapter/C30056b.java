package com.p683ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.p038f.C0793j;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.p683ss.android.ugc.aweme.feed.helper.C30360a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.b */
public abstract class C30056b extends C30028ap implements C30013ad {

    /* renamed from: o */
    public static int f78448o;

    /* renamed from: p */
    public static final C30058b f78449p = new C30058b(null);

    /* renamed from: a */
    private final C30084i f78450a = new C30084i();

    /* renamed from: b */
    private final C30722a f78451b = VideoViewHolder.m70202a(this.f78384s, this.f78462m);

    /* renamed from: c */
    private final C10721b f78452c = new C10721b(0.5f, 1.0f);

    /* renamed from: d */
    private final C30360a f78453d;

    /* renamed from: e */
    public boolean f78454e;

    /* renamed from: f */
    public boolean f78455f = true;

    /* renamed from: g */
    public long f78456g;

    /* renamed from: h */
    public final Context f78457h;

    /* renamed from: i */
    public final LayoutInflater f78458i;

    /* renamed from: j */
    public final C30313ae<C30332aw> f78459j;

    /* renamed from: k */
    public final Fragment f78460k;

    /* renamed from: l */
    public final OnTouchListener f78461l;

    /* renamed from: m */
    public final BaseFeedPageParams f78462m;

    /* renamed from: n */
    public final C30198m f78463n;

    /* renamed from: u */
    private final Map<Integer, C30102n> f78464u;

    /* renamed from: v */
    private int f78465v;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$a */
    public static final class C30057a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C30102n) t).f78594b), Integer.valueOf(((C30102n) t2).f78594b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$b */
    public static final class C30058b {
        private C30058b() {
        }

        public /* synthetic */ C30058b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public void mo60334b() {
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* renamed from: e */
    private final String m70475e() {
        return this.f78462m.eventType;
    }

    public int getCount() {
        return this.f78450a.mo60345a();
    }

    /* renamed from: a */
    public C30071bj mo55769a() {
        return C30079f.f78525a;
    }

    /* renamed from: d */
    public List<Aweme> mo60336d() {
        return this.f78450a.mo60348b();
    }

    /* renamed from: c */
    public final List<Aweme> mo60286c() {
        return this.f78450a.mo60348b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo60297a(int i) {
        return mo60300b(i);
    }

    /* renamed from: c */
    public final Aweme mo60285c(int i) {
        return this.f78450a.mo60346a(i);
    }

    /* renamed from: d */
    public Aweme mo60335d(int i) {
        return mo60285c(i);
    }

    /* renamed from: f */
    public final void mo60338f(int i) {
        mo60337e(i);
        notifyDataSetChanged();
    }

    /* renamed from: c */
    protected static C30016ag m70474c(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.aeh);
        } else {
            obj = null;
        }
        return (C30016ag) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo60301b(View view) {
        if (view != null && (view instanceof C30016ag)) {
            C30016ag c = m70474c(view);
            if (c == null) {
                C52711k.m112234a();
            }
            c.mo60250t();
        }
    }

    /* renamed from: d */
    public final void mo60302d(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.aeh);
        } else {
            obj = null;
        }
        if (obj != null) {
            ((C30016ag) obj).mo54001g();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo60337e(int i) {
        if (i >= 0 && i < getCount()) {
            mo60286c().remove(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo60298a(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.aei);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        StringBuilder sb = new StringBuilder("expect tag is type int,but no:");
        sb.append(obj);
        C32458a.m75143a((Exception) new RuntimeException(sb.toString()));
        return 0;
    }

    public int getItemPosition(Object obj) {
        C52711k.m112240b(obj, "any");
        C30016ag c = m70474c((View) obj);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme aweme = (Aweme) mo60286c().get(i);
            if (c != null) {
                String aid = aweme.getAid();
                Aweme e = c.mo53999e();
                C52711k.m112236a((Object) e, "holder.aweme");
                if (C9431p.m18665a(aid, e.getAid())) {
                    return i;
                }
            }
        }
        return -2;
    }

    /* renamed from: a */
    public void mo60331a(List<? extends Aweme> list) {
        this.f78450a.mo60347a(list);
        mo60334b();
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo60300b(int i) {
        Aweme c = mo60285c(i);
        if (c != null) {
            for (Entry entry : this.f78464u.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                C52671b<C30063bb, Boolean> bVar = ((C30102n) entry.getValue()).f78595c;
                Context context = this.f78457h;
                List c2 = mo60286c();
                String str = this.f78462m.eventType;
                C52711k.m112236a((Object) str, "baseFeedPageParams.eventType");
                C30063bb bbVar = new C30063bb(c, i, context, c2, str, this.f78462m.awemeFromPage, this.f78462m.isMyProfile, this.f78462m.pageType, this.f78462m.isFromPostList);
                if (((Boolean) bVar.invoke(bbVar)).booleanValue()) {
                    return intValue;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo60333a(String str) {
        C52711k.m112240b(str, "uid");
        boolean z = false;
        for (int size = mo60286c().size() - 1; size >= 0; size--) {
            if (TextUtils.equals(str, ((Aweme) mo60286c().get(size)).getAuthorUid())) {
                mo60337e(size);
                z = true;
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo60330a(Aweme aweme, int i) {
        if (aweme == null || i < 0 || i > getCount()) {
            throw new IllegalArgumentException("position out of range");
        }
        mo60286c().add(i, aweme);
    }

    /* renamed from: a */
    public final void mo60329a(int i, boolean z) {
        int i2 = i;
        if (i2 != this.f78465v) {
            this.f78465v = i2;
            Aweme c = mo60285c(i);
            if (c != null) {
                User author = c.getAuthor();
                if (author != null && author.isLive() && C46635b.m101190a()) {
                    if (TextUtils.equals(m70475e(), "homepage_hot")) {
                        C46641d.m101219b(this.f78384s, 0, author.getRequestId(), author.getUid(), author.roomId);
                    } else if (TextUtils.equals(m70475e(), "homepage_follow")) {
                        C46641d.m101205a(this.f78384s, 0, author.getUid(), author.roomId, C46641d.m101204a("homepage_follow", "video", author.getRequestId()));
                    } else {
                        C46641d.m101208a(this.f78384s, 0, m70475e(), author.getRequestId(), author.getUid(), author.roomId);
                    }
                    if (c.getAwemeType() != 101) {
                        C46641d.m101212a(author.getUid(), author.roomId, m70475e(), c.getRequestId(), -1, -1, c.getAid(), "video_head");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo60299a(int i, View view, ViewGroup viewGroup) {
        boolean z;
        C30016ag agVar;
        View view2 = view;
        ViewGroup viewGroup2 = viewGroup;
        C52711k.m112240b(viewGroup2, "parent");
        int b = mo60300b(i);
        if (view2 == null) {
            z = false;
        } else {
            z = C0793j.m2264a(view2.getTag(R.id.aei), Integer.valueOf(b));
        }
        if (!z) {
            C30102n nVar = (C30102n) this.f78464u.get(Integer.valueOf(b));
            if (nVar == null) {
                nVar = mo55769a();
            }
            C52671b<C30022am, View> bVar = nVar.f78596d;
            Context context = this.f78457h;
            LayoutInflater layoutInflater = this.f78458i;
            String str = this.f78462m.eventType;
            C52711k.m112236a((Object) str, "baseFeedPageParams.eventType");
            View view3 = (View) bVar.invoke(new C30022am(viewGroup2, context, layoutInflater, str));
            C52671b<C30069bh, C30016ag> bVar2 = nVar.f78597e;
            C52711k.m112240b(view3, "convertView");
            C30313ae<C30332aw> aeVar = this.f78459j;
            Fragment fragment = this.f78460k;
            OnTouchListener onTouchListener = this.f78461l;
            BaseFeedPageParams baseFeedPageParams = this.f78462m;
            C30198m mVar = this.f78463n;
            C30360a aVar = this.f78453d;
            OnTouchListener onTouchListener2 = this.f78452c;
            C30722a aVar2 = this.f78451b;
            C52711k.m112236a((Object) aVar2, "onLongPressAwemeListener");
            String e = m70475e();
            C52711k.m112236a((Object) e, "getEventType()");
            long j = this.f78456g;
            C30069bh bhVar = r5;
            C30069bh bhVar2 = new C30069bh(view3, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar, aVar, onTouchListener2, aVar2, e, j, null, 2048, null);
            agVar = (C30016ag) bVar2.invoke(bhVar);
            view3.setTag(R.id.aei, Integer.valueOf(b));
            view3.setTag(R.id.aeh, agVar);
            view2 = view3;
        } else {
            agVar = m70474c(view);
            if (agVar == null) {
                C52711k.m112234a();
            }
        }
        if (view2 != null) {
            int i2 = f78448o;
            f78448o = i2 + 1;
            view2.setTag(R.id.e8m, Integer.valueOf(i2));
        }
        agVar.mo60203a(mo60335d(i), i);
        if (view2 == null) {
            C52711k.m112234a();
        }
        return view2;
    }

    /* renamed from: a */
    public final void mo60332a(List<? extends Aweme> list, int i, int i2) {
        if (list != null && !list.isEmpty() && i >= 0 && i < list.size() && i <= getCount()) {
            for (int i3 = 0; i3 < i2; i3++) {
                Aweme aweme = (Aweme) list.get(i + i3);
                if (aweme != null) {
                    mo60286c().add(i, aweme);
                }
            }
            C30084i iVar = this.f78450a;
            Iterable c = mo60286c();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : c) {
                if (hashSet.add(((Aweme) next).getAid())) {
                    arrayList.add(next);
                }
            }
            iVar.mo60347a((List<? extends Aweme>) arrayList);
        }
    }

    public C30056b(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(aeVar, "listener");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(onTouchListener, "tapTouchListener");
        C52711k.m112240b(baseFeedPageParams, "baseFeedPageParams");
        C52711k.m112240b(mVar, "iHandlePlay");
        super(context, layoutInflater, 11);
        this.f78457h = context;
        this.f78458i = layoutInflater;
        this.f78459j = aeVar;
        this.f78460k = fragment;
        this.f78461l = onTouchListener;
        this.f78462m = baseFeedPageParams;
        this.f78463n = mVar;
        C30360a aVar = new C30360a();
        if (VERSION.SDK_INT >= 17) {
            C30360a.m71256a(this.f78384s);
        }
        this.f78453d = aVar;
        List e = C52575l.m112139e((Collection<? extends T>) C52575l.m112122a((Iterable<? extends T>) C52575l.m112101c(C30023an.f78375a, C30059ba.f78466a), (Comparator<? super T>) new C30057a<Object>()));
        e.add(mo55769a());
        Iterable<C30102n> iterable = e;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (C30102n nVar : iterable) {
            arrayList.add(C52856t.m112465a(Integer.valueOf(nVar.f78594b), nVar));
        }
        this.f78464u = C52550ab.m112048a((Iterable) (List) arrayList);
        this.f78465v = -1;
    }
}
