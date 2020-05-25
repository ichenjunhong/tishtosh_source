package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.arch.lifecycle.C0176h.C0178b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.h */
public final class C37888h extends C31817a<C37881a, FollowFeed> {

    /* renamed from: k */
    public static final int f96448k = ((int) C9432q.m18687b(C11010c.m22280a(), 16.0f));

    /* renamed from: l */
    public static final int f96449l = ((int) C9432q.m18687b(C11010c.m22280a(), 16.0f));

    /* renamed from: m */
    public static final int f96450m = ((int) C9432q.m18687b(C11010c.m22280a(), 0.5f));

    /* renamed from: n */
    RelativeLayout f96451n;

    /* renamed from: o */
    protected String f96452o;

    /* renamed from: p */
    protected String f96453p;

    /* renamed from: q */
    public boolean f96454q;

    /* renamed from: r */
    public boolean f96455r;

    /* renamed from: s */
    private C10719a f96456s;

    /* renamed from: t */
    private C37887g f96457t;

    /* renamed from: u */
    private boolean f96458u;

    /* renamed from: d */
    public final C31755b mo64888d() {
        return new C31755b() {
            /* renamed from: d */
            public final String mo64657d() {
                return "key_container_dynamic";
            }

            /* renamed from: a */
            public final boolean mo64654a() {
                if (C37888h.this.f83141h == null || !C37888h.this.f83141h.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo64656c() {
                if (C37888h.this.f83141h != null) {
                    return C37888h.this.f83141h.getActivity();
                }
                return C37888h.this.f83135b.getContext();
            }

            /* renamed from: b */
            public final boolean mo64655b() {
                if (C37888h.this.f83141h == null || !C37888h.this.f83141h.getLifecycle().mo323a().equals(C0178b.RESUMED) || !C37888h.this.f83141h.getUserVisibleHint()) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: c */
    public final /* synthetic */ C31749e mo64886c() {
        return new C37881a(this.f83135b, this.f96458u);
    }

    /* renamed from: j */
    public final void mo77331j() {
        this.f83136c.setVisibility(4);
        this.f96451n.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo64889e() {
        if (this.f96457t != null) {
            this.f96457t.mo44934a_(Integer.valueOf(1), this.f96452o, this.f96453p);
        }
    }

    /* renamed from: k */
    public final void mo77332k() {
        if (isViewValid()) {
            this.f96451n.setVisibility(4);
            this.f83136c.setVisibility(0);
            this.f83136c.mo19213g();
        }
    }

    public final void ar_() {
        if (isViewValid() && !this.f96457t.mo54803n().isDataEmpty() && this.f96457t != null) {
            this.f96457t.mo44934a_(Integer.valueOf(4), this.f96452o, this.f96453p);
        }
    }

    /* renamed from: b */
    public final void mo64880b() {
        int i;
        if (this.f96456s == null) {
            this.f96456s = C10719a.m21676a(getContext());
            DmtTextView c = m84648c(R.string.c0e);
            if (this.f96458u) {
                i = R.string.ay8;
            } else {
                i = R.string.axy;
            }
            DmtTextView c2 = m84648c(i);
            c.setOnClickListener(new C37891i(this));
            this.f96456s.mo19231b((View) c2).mo19234c((View) c);
        }
        this.f83136c.setBuilder(this.f96456s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo77328b(View view) {
        if (this.f96457t != null) {
            mo64889e();
        }
    }

    /* renamed from: a */
    public final void mo64862a(View view) {
        super.mo64862a(view);
        this.f96451n = (RelativeLayout) view.findViewById(R.id.c51);
    }

    /* renamed from: c */
    private DmtTextView m84648c(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
        if (this.f83141h != null) {
            dmtTextView.setTextColor(this.f83141h.getResources().getColor(R.color.a19));
            dmtTextView.setText(i);
        }
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo64861a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 2:
                    if (!(this.f83139f == null || ((C37881a) this.f83139f).getItemCount() != 0 || this.f83136c == null)) {
                        this.f96451n.setVisibility(8);
                        this.f83136c.setVisibility(0);
                        this.f83136c.mo19212f();
                        if (!this.f96458u) {
                            C2667b.m7663a("profile", "dongtai", 0);
                            return;
                        }
                    }
                    break;
                case 3:
                    mo64882b(null);
                    if (this.f83136c != null) {
                        this.f83136c.setVisibility(0);
                        this.f83136c.mo19213g();
                    }
                    if (this.f83139f != null) {
                        ((C37881a) this.f83139f).an_();
                        return;
                    }
                    break;
                default:
                    super.mo64861a(i);
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo77329b(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 0) {
            FollowFeed followFeed = new FollowFeed(aweme);
            C20902b.m53242a().updateCurDongtaiCount(1);
            if (this.f83136c.getVisibility() == 0) {
                this.f83136c.setVisibility(8);
            }
            ((C37881a) this.f83139f).mo51186a(followFeed, 0);
        }
    }

    /* renamed from: b */
    public final void mo64881b(String str) {
        int d = ((C37881a) this.f83139f).mo64641d(str);
        if (d >= 0) {
            C47718bf.m103288a(new C30332aw(32));
            ((C37881a) this.f83139f).mo64638c(d);
            if (((C37881a) this.f83139f).mo50673a().isEmpty()) {
                mo77332k();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo64879a(List<FollowFeed> list) {
        List a = ((C37881a) this.f83139f).mo50673a();
        if (C9376b.m18558a((Collection<T>) a) || C9376b.m18558a((Collection<T>) list) || a.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < a.size(); i++) {
            Aweme aweme = ((FollowFeed) list.get(i)).getAweme();
            Aweme aweme2 = ((FollowFeed) a.get(i)).getAweme();
            if (aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo77330b(String str, String str2) {
        this.f96452o = str;
        this.f96453p = str2;
    }

    /* renamed from: a */
    public final void mo64873a(String str, ForwardDetail forwardDetail) {
        C47718bf.m103288a(new C30332aw(31));
        if (this.f83136c.getVisibility() == 0) {
            this.f83136c.setVisibility(8);
        }
        ((C37881a) this.f83139f).mo64630a(str, forwardDetail.getAweme(), 0);
        ((C37881a) this.f83139f).mo64629a(str, forwardDetail.getComment());
    }

    C37888h(String str, String str2, boolean z) {
        this.f96452o = str;
        this.f96453p = str2;
        this.f96458u = z;
    }

    /* renamed from: a */
    public final void mo77327a(C37896n nVar, View view, C37887g gVar, C31754a aVar) {
        this.f96457t = gVar;
        super.mo64864a(nVar, view, gVar, aVar, nVar.f96471e, nVar.f96472j, nVar.f102925H, "");
        if (TimeLockRuler.isTeenModeON()) {
            ((TextView) this.f96451n.findViewById(R.id.title)).setText(R.string.dww);
            ((TextView) this.f96451n.findViewById(R.id.ze)).setText(R.string.dwl);
        }
        this.f83135b.mo4798a((C1331h) new C1331h() {

            /* renamed from: b */
            private Drawable f96461b = C0726c.m2091a(C37888h.this.getContext(), (int) R.color.a0s);

            public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    this.f96461b.setBounds(childAt.getLeft() + C37888h.f96448k, bottom, childAt.getRight() - C37888h.f96449l, C37888h.f96450m + bottom);
                    this.f96461b.draw(canvas);
                }
            }

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                rect.bottom = C37888h.f96450m;
            }
        });
        this.f83135b.setOverScrollMode(2);
        this.f96451n.setVisibility(4);
    }
}
