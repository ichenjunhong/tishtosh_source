package com.p683ss.android.ugc.aweme.feed.unread;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.AbstractUnReadSunRoofView;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofView */
public final class UnReadSunRoofView extends AbstractUnReadSunRoofView {

    /* renamed from: a */
    public static final C31158a f81562a = new C31158a(null);

    /* renamed from: b */
    private final UnReadSunRoofRecyclerView f81563b;

    /* renamed from: c */
    private final C31167a f81564c;

    /* renamed from: d */
    private final View f81565d;

    /* renamed from: e */
    private long f81566e;

    /* renamed from: com.ss.android.ugc.aweme.feed.unread.UnReadSunRoofView$a */
    public static final class C31158a {
        private C31158a() {
        }

        public /* synthetic */ C31158a(C52707g gVar) {
            this();
        }
    }

    public UnReadSunRoofView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UnReadSunRoofView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo63278a() {
        if (getVisibility() != 8) {
            C26890h.m65011a("unread_window", C23089d.m56640a().mo47829a("enter_from", "homepage_hot_window").mo47829a("event_type", "close").mo47827a("duration", System.currentTimeMillis() - this.f81566e).f61491a);
            setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo63281b() {
        if (getVisibility() != 0) {
            C26890h.m65011a("unread_window", C23089d.m56640a().mo47829a("enter_from", "homepage_hot_window").mo47829a("event_type", "impression").f61491a);
            this.f81566e = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    public final void setData(List<? extends User> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f81564c.mo50303a(list);
            this.f81564c.notifyDataSetChanged();
            C1332i layoutManager = this.f81563b.getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).mo4721a(0, 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: a */
    public final void mo63279a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List a = this.f81564c.mo50673a();
            if (a != null) {
                int i = 0;
                for (Object next : a) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    User user = (User) next;
                    C52711k.m112236a((Object) user, "user");
                    if (TextUtils.equals(charSequence, user.getUid())) {
                        C1332i layoutManager = this.f81563b.getLayoutManager();
                        if (layoutManager != null) {
                            ((LinearLayoutManager) layoutManager).mo4721a(i, 0);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    }
                    i = i2;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63280a(String str, C52670a<C52860x> aVar) {
        boolean z;
        CharSequence charSequence = str;
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int i2 = -1;
            List a = this.f81564c.mo50673a();
            if (a != null) {
                int i3 = 0;
                int i4 = -1;
                for (Object next : a) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        C52575l.m112100b();
                    }
                    User user = (User) next;
                    C52711k.m112236a((Object) user, "user");
                    if (TextUtils.equals(charSequence, user.getUid())) {
                        i4 = i3;
                    }
                    i3 = i5;
                }
                i2 = i4;
            }
            if (i2 >= 0) {
                this.f81564c.mo50673a().remove(i2);
                this.f81564c.notifyItemRemoved(i2);
                List a2 = this.f81564c.mo50673a();
                if (a2 != null) {
                    i = a2.size();
                }
                if (i <= 0) {
                    mo63278a();
                    aVar.invoke();
                }
            }
        }
    }

    public UnReadSunRoofView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f81564c = new C31167a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.b_k, this, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…,\n            false\n    )");
        this.f81565d = inflate;
        addView(this.f81565d, new MarginLayoutParams(-2, -2));
        setPadding(0, C9432q.m18695e(context) + ((int) C9432q.m18687b(context, 48.0f)), 0, (int) C9432q.m18687b(context, 6.0f));
        View findViewById = this.f81565d.findViewById(R.id.etp);
        C52711k.m112236a((Object) findViewById, "sunRoofView.findViewById(R.id.rv_uread_sun_roof)");
        this.f81563b = (UnReadSunRoofRecyclerView) findViewById;
        this.f81563b.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.f81563b.mo4798a((C1331h) new C31170d((int) C9432q.m18687b(context, 12.0f)));
        this.f81563b.setAdapter(this.f81564c);
        setVisibility(8);
    }

    public /* synthetic */ UnReadSunRoofView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
