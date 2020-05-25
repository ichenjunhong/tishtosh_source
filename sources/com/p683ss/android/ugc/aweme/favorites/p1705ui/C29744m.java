package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.C10747b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10737c;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29678h;
import com.p683ss.android.ugc.aweme.favorites.api.notice.C29682a;
import com.p683ss.android.ugc.aweme.favorites.api.notice.C29682a.C29684a;
import com.p683ss.android.ugc.aweme.favorites.api.notice.CollectionNotice;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.m */
public final class C29744m extends C23526a implements C0997e {

    /* renamed from: a */
    protected TextTitleBar f77685a;

    /* renamed from: b */
    DmtTabLayout f77686b;

    /* renamed from: c */
    protected ViewPager f77687c;

    /* renamed from: d */
    boolean f77688d;

    /* renamed from: e */
    public String[] f77689e;

    /* renamed from: j */
    public boolean f77690j;

    /* renamed from: k */
    public int f77691k;

    /* renamed from: l */
    protected C29678h f77692l;

    /* renamed from: m */
    protected int f77693m;

    /* renamed from: n */
    public boolean f77694n = true;

    /* renamed from: o */
    private String f77695o = "personal_homepage";

    /* renamed from: p */
    private String f77696p;

    /* renamed from: q */
    private String f77697q;

    /* renamed from: r */
    private C29682a f77698r;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60003a() {
        if (this.f77686b != null) {
            C10747b.m21781a(this.f77686b);
        }
        if (this.f77687c != null) {
            this.f77687c.setCurrentItem(this.f77693m);
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.f77688d && this.f77692l != null) {
            C29678h hVar = this.f77692l;
            int i = this.f77693m;
            hVar.mo59935c(i);
            if (hVar.f77573a != null && i >= 0 && i < hVar.f77573a.size() && (hVar.f77573a.get(i) instanceof C40321dd)) {
                C40321dd ddVar = (C40321dd) hVar.f77573a.get(i);
                if (ddVar != null) {
                    ddVar.mo82582g(true);
                }
            }
        }
        this.f77688d = false;
        if (C23794bh.m58395i().mo76335b()) {
            if (this.f77698r == null) {
                this.f77698r = new C29682a();
            }
            this.f77698r.mo59954a(new C29684a() {
                /* renamed from: a */
                public final void mo59957a(CollectionNotice collectionNotice) {
                    Integer num;
                    if (collectionNotice != null && collectionNotice.getMixStatus() && C29744m.this.f77692l != null && C29744m.this.f77687c != null && C29744m.this.f77686b != null) {
                        C29678h hVar = C29744m.this.f77692l;
                        if (hVar.f77574b != null) {
                            int i = 0;
                            while (true) {
                                if (i >= hVar.f77574b.size()) {
                                    break;
                                } else if (((Integer) hVar.f77574b.get(i)).intValue() == 21) {
                                    num = Integer.valueOf(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        num = null;
                        if (num != null && C29744m.this.f77687c.getCurrentItem() != num.intValue()) {
                            C10742f b = C29744m.this.f77686b.mo19357b(num.intValue());
                            if (b != null) {
                                b.f28863h.findViewById(R.id.bb_).setVisibility(0);
                            }
                        }
                    }
                }
            });
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f77689e = new String[]{"video", "challenge", "music", "prop"};
    }

    public final void onPageSelected(int i) {
        if (this.f77692l != null && i >= 0 && i < this.f77692l.getCount()) {
            this.f77693m = i;
            C29678h hVar = this.f77692l;
            hVar.mo59935c(i);
            if (hVar.f77573a != null && i >= 0 && i < hVar.f77573a.size() && (hVar.f77573a.get(i) instanceof C40321dd)) {
                C40321dd ddVar = (C40321dd) hVar.f77573a.get(i);
                if (ddVar != null && ddVar.aT_()) {
                    ddVar.aV_();
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f77685a = (TextTitleBar) view.findViewById(R.id.d10);
        this.f77686b = (DmtTabLayout) view.findViewById(R.id.cwz);
        this.f77687c = (ViewPager) view.findViewById(R.id.ds2);
        if (getActivity() == null || getActivity().getIntent() == null) {
            this.f77695o = "personal_homepage";
        } else if (getActivity().getIntent().hasExtra("enter_from")) {
            this.f77695o = getActivity().getIntent().getStringExtra("enter_from");
        } else {
            this.f77695o = "h5";
        }
        Intent intent = getActivity().getIntent();
        ArrayList arrayList = null;
        if (intent != null) {
            if (intent.hasExtra("tab_name")) {
                this.f77697q = intent.getStringExtra("tab_name");
            }
            if (intent.hasExtra("push_ids")) {
                String stringExtra = intent.getStringExtra("push_ids");
                if ("compilation".equals(this.f77697q)) {
                    arrayList = new ArrayList(Arrays.asList(stringExtra.split(",")));
                }
            }
        }
        this.f77692l = new C29678h(getChildFragmentManager(), getActivity(), this.f77695o, arrayList);
        this.f77687c.setAdapter(this.f77692l);
        if (intent != null) {
            if (intent.hasExtra("tab_name")) {
                this.f77697q = intent.getStringExtra("tab_name");
                int i = 0;
                while (true) {
                    if (i >= this.f77689e.length) {
                        break;
                    } else if (TextUtils.equals(this.f77697q, this.f77689e[i])) {
                        this.f77691k = i;
                        break;
                    } else {
                        i++;
                    }
                }
                if (this.f77691k > 0 && this.f77691k < this.f77692l.getCount()) {
                    this.f77693m = this.f77691k;
                    this.f77690j = true;
                }
            } else if (intent.hasExtra("index")) {
                this.f77691k = Integer.valueOf(intent.getStringExtra("index")).intValue();
                if (C23794bh.m58395i().mo76335b() && this.f77691k > 0) {
                    this.f77691k++;
                }
                if (this.f77691k > 0 && this.f77691k < this.f77692l.getCount()) {
                    this.f77693m = this.f77691k;
                    this.f77690j = true;
                }
            }
            if (intent.hasExtra("enter_method")) {
                this.f77696p = intent.getStringExtra("enter_method");
            } else {
                this.f77696p = "click_h5";
            }
            if (intent.hasExtra("tab_name")) {
                this.f77697q = intent.getStringExtra("tab_name");
            }
            C23089d a = C23089d.m56640a();
            if (!TextUtils.isEmpty(this.f77695o)) {
                a.mo47829a("enter_from", this.f77695o);
            }
            if (!TextUtils.isEmpty(this.f77696p)) {
                a.mo47829a("enter_method", this.f77696p);
            }
            if (intent.hasExtra("scene_id")) {
                a.mo47826a("scene_id", intent.getIntExtra("scene_id", 0));
            }
            if (!TextUtils.isEmpty(this.f77696p)) {
                a.mo47829a("enter_method", this.f77696p);
            }
            if (!TextUtils.isEmpty(this.f77697q)) {
                a.mo47829a("tab_name", this.f77697q);
            }
            C26890h.m65011a("enter_personal_favourite", a.f61491a);
        }
        this.f77686b.setCustomTabViewResId(R.layout.bud);
        this.f77686b.setupWithViewPager(this.f77687c);
        this.f77686b.setOnTabClickListener(new C29749o(this));
        this.f77686b.mo19349a((C10737c) new C10737c() {
            /* renamed from: a */
            public final void mo19400a(C10742f fVar) {
                String str;
                int i = fVar.f28860e;
                if (C29744m.this.f77694n) {
                    str = "click";
                } else {
                    str = "slide";
                }
                if (C29744m.this.f77690j) {
                    if (i == C29744m.this.f77691k) {
                        C29692a.m69737a(str, C29744m.this.f77689e[i]);
                    }
                    C29744m.this.f77690j = false;
                } else {
                    C29692a.m69737a(str, C29744m.this.f77689e[i]);
                }
                C29744m.this.f77694n = false;
                fVar.f28863h.findViewById(R.id.bb_).setVisibility(8);
            }
        });
        this.f77686b.setTabMode(0);
        this.f77686b.setAutoFillWhenScrollable(true);
        this.f77686b.mo19347a(C23728o.m58241a(16.0d), 0, C23728o.m58241a(16.0d), 0);
        this.f77687c.addOnPageChangeListener(this);
        this.f77687c.setOffscreenPageLimit(5);
        this.f77685a.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                C29744m mVar = C29744m.this;
                if (mVar.getActivity() != null && (mVar.getActivity() instanceof UserFavoritesActivity)) {
                    mVar.getActivity().finish();
                }
            }
        });
        C29692a.f77600a = this.f77695o;
        this.f77686b.post(new C29748n(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getArguments();
        return layoutInflater.inflate(R.layout.bu8, viewGroup, false);
    }
}
