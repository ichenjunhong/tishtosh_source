package com.p683ss.android.ugc.aweme.miniapp.appgroup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity;
import com.p683ss.android.ugc.aweme.miniapp.appgroup.C36856f.C36857a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c */
public final class C36846c extends C1322a<C1352v> {

    /* renamed from: c */
    public static final C36848b f94177c = new C36848b(null);

    /* renamed from: a */
    public ArrayList<C36856f> f94178a = new ArrayList<>();

    /* renamed from: b */
    public final Context f94179b;

    /* renamed from: d */
    private final C26876b<C36842a> f94180d;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$a */
    static final class C36847a extends C1352v {

        /* renamed from: a */
        public TextView f94181a;

        public C36847a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.dbx);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…icro_app_collection_hint)");
            this.f94181a = (TextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$b */
    static final class C36848b {
        private C36848b() {
        }

        public /* synthetic */ C36848b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$c */
    static final class C36849c extends C1352v {

        /* renamed from: a */
        public TextView f94182a;

        public C36849c(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.dbx);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…icro_app_collection_hint)");
            this.f94182a = (TextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$d */
    static final class C36850d extends C52712l implements C52671b<C36856f, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36846c f94183a;

        /* renamed from: b */
        final /* synthetic */ int f94184b;

        C36850d(C36846c cVar, int i) {
            this.f94183a = cVar;
            this.f94184b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            C36856f fVar = (C36856f) obj;
            C52711k.m112240b(fVar, "it");
            if (this.f94183a.f94178a.indexOf(fVar) > this.f94184b) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$e */
    public static final class C36851e extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C36846c f94185a;

        /* renamed from: b */
        final /* synthetic */ C1352v f94186b;

        /* renamed from: c */
        final /* synthetic */ IMiniAppService f94187c;

        /* renamed from: d */
        final /* synthetic */ C36966e f94188d;

        /* renamed from: a */
        public final void mo59929a(View view) {
            boolean z;
            C36961a c = new C36961a().mo76222b("setting_page").mo76223c("021001");
            Iterator it = this.f94185a.f94178a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C36856f) it.next()).f94201a == C36857a.m82923b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (((C36855e) this.f94186b).getAdapterPosition() < i) {
                c.mo76220a("recently");
            } else {
                c.mo76220a("collection");
            }
            this.f94187c.openMiniApp(this.f94185a.f94179b, this.f94188d, c.mo76221a());
        }

        C36851e(C36846c cVar, C1352v vVar, IMiniAppService iMiniAppService, C36966e eVar) {
            this.f94185a = cVar;
            this.f94186b = vVar;
            this.f94187c = iMiniAppService;
            this.f94188d = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.c$f */
    public static final class C36852f extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C36846c f94189a;

        C36852f(C36846c cVar) {
            this.f94189a = cVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            Context context = this.f94189a.f94179b;
            if (context != null) {
                context.startActivity(new Intent(context, RecentlyUsedMicroAppActivity.class));
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    activity.overridePendingTransition(R.anim.bn, R.anim.bw);
                }
                C26890h.m65011a("click_more_recently_mp_button", C23089d.m56640a().mo47829a("enter_from", "setting_page").f61491a);
            }
        }
    }

    public final int getItemCount() {
        return this.f94178a.size();
    }

    public final int getItemViewType(int i) {
        if (i < 0 || i >= this.f94178a.size()) {
            return 0;
        }
        return ((C36856f) this.f94178a.get(i)).f94201a;
    }

    public C36846c(Context context, C26876b<C36842a> bVar) {
        C52711k.m112240b(bVar, "mPresenter");
        this.f94179b = context;
        this.f94180d = bVar;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        String str = null;
        if (i == C36857a.m82922a()) {
            View inflate = LayoutInflater.from(this.f94179b).inflate(R.layout.aa6, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(mCon…item_view, parent, false)");
            C36847a aVar = new C36847a(inflate);
            TextView textView = aVar.f94181a;
            Context context = this.f94179b;
            if (context != null) {
                Resources resources = context.getResources();
                if (resources != null) {
                    str = resources.getString(R.string.c64);
                }
            }
            textView.setText(str);
            return aVar;
        } else if (i == C36857a.m82923b()) {
            View inflate2 = LayoutInflater.from(this.f94179b).inflate(R.layout.aa6, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "LayoutInflater.from(mCon…item_view, parent, false)");
            C36847a aVar2 = new C36847a(inflate2);
            TextView textView2 = aVar2.f94181a;
            Context context2 = this.f94179b;
            if (context2 != null) {
                Resources resources2 = context2.getResources();
                if (resources2 != null) {
                    str = resources2.getString(R.string.c62);
                }
            }
            textView2.setText(str);
            return aVar2;
        } else if (i == C36857a.m82925d()) {
            View inflate3 = LayoutInflater.from(this.f94179b).inflate(R.layout.aa5, viewGroup, false);
            C52711k.m112236a((Object) inflate3, "LayoutInflater.from(mCon…xt_layout, parent, false)");
            return new C36849c(inflate3);
        } else if (i == C36857a.m82924c() || i == C36857a.m82926e()) {
            View inflate4 = LayoutInflater.from(this.f94179b).inflate(R.layout.aa4, viewGroup, false);
            C52711k.m112236a((Object) inflate4, "LayoutInflater.from(mCon…em_layout, parent, false)");
            return new C36855e(inflate4);
        } else {
            throw new IllegalArgumentException("wrong type");
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        CharSequence charSequence;
        C52711k.m112240b(vVar, "holder");
        int i2 = vVar.mItemViewType;
        String str = null;
        if (i2 == C36857a.m82924c()) {
            C36855e eVar = (C36855e) vVar;
            eVar.f94193b.setVisibility(0);
            C36983a b = C36983a.m83185b();
            C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
            IMiniAppService a = b.mo76294a();
            C36966e eVar2 = ((C36856f) this.f94178a.get(i)).f94202b;
            if (eVar2 != null) {
                a.preloadMiniApp(eVar2.getAppId(), eVar2.getType());
            } else {
                eVar2 = null;
            }
            DmtTextView dmtTextView = eVar.f94193b;
            if (eVar2 != null) {
                charSequence = eVar2.getName();
            } else {
                charSequence = null;
            }
            dmtTextView.setText(charSequence);
            SimpleDraweeView simpleDraweeView = eVar.f94192a;
            if (eVar2 != null) {
                str = eVar2.getIcon();
            }
            simpleDraweeView.setImageURI(str);
            vVar.itemView.setOnClickListener(new C36851e(this, vVar, a, eVar2));
            if (i == C52575l.m112093a((List) this.f94178a)) {
                C26875a aVar = (C26875a) this.f94180d.mo54803n();
                C52711k.m112236a((Object) aVar, "mPresenter.model");
                if (!((C36842a) aVar).isHasMore()) {
                    View view = vVar.itemView;
                    C52711k.m112236a((Object) view, "holder.itemView");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
                        layoutParams2.setMargins(0, 0, 0, C23728o.m58241a(68.0d));
                        View view2 = vVar.itemView;
                        C52711k.m112236a((Object) view2, "holder.itemView");
                        view2.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
                }
            }
            View view3 = vVar.itemView;
            C52711k.m112236a((Object) view3, "holder.itemView");
            LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 != null) {
                GridLayoutManager.LayoutParams layoutParams4 = (GridLayoutManager.LayoutParams) layoutParams3;
                layoutParams4.setMargins(0, 0, 0, 0);
                View view4 = vVar.itemView;
                C52711k.m112236a((Object) view4, "holder.itemView");
                view4.setLayoutParams(layoutParams4);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
        } else if (i2 == C36857a.m82926e()) {
            C36855e eVar3 = (C36855e) vVar;
            DmtTextView dmtTextView2 = eVar3.f94193b;
            Context context = this.f94179b;
            if (context != null) {
                str = context.getString(R.string.c7g);
            }
            dmtTextView2.setText(str);
            eVar3.f94192a.setImageResource(R.drawable.a_6);
            vVar.itemView.setOnClickListener(new C36852f(this));
        } else {
            if (i2 == C36857a.m82925d()) {
                ((C36849c) vVar).f94182a.setText(((C36856f) this.f94178a.get(i)).f94203c);
            }
        }
    }
}
