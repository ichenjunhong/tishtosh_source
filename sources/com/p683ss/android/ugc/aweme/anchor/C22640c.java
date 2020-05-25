package com.p683ss.android.ugc.aweme.anchor;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.anchor.C22583a.C22584a;
import com.p683ss.android.ugc.aweme.anchor.api.AnchorApi;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22592a;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22589e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.c */
public final class C22640c extends C22583a {

    /* renamed from: d */
    public boolean f60812d;

    /* renamed from: e */
    public C53037e f60813e;

    /* renamed from: f */
    private List<AnchorCell> f60814f = new ArrayList();

    /* renamed from: g */
    private HashMap f60815g;

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$a */
    static final class C22641a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22640c f60816a;

        C22641a(C22640c cVar) {
            this.f60816a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f60816a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$b */
    static final class C22642b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22640c f60817a;

        C22642b(C22640c cVar) {
            this.f60817a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f60817a.mo47007a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$c */
    static final class C22643c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22640c f60818a;

        /* renamed from: b */
        final /* synthetic */ C22678i f60819b;

        /* renamed from: com.ss.android.ugc.aweme.anchor.c$c$a */
        static final class C22644a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C22643c f60820a;

            C22644a(C22643c cVar) {
                this.f60820a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AnchorApi.m55788a(C22584a.m55780a().getTYPE(), "", true).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C22592a, Object>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22644a f60821a;

                    {
                        this.f60821a = r1;
                    }

                    public final /* synthetic */ Object then(C0013i iVar) {
                        C52711k.m112236a((Object) iVar, "task");
                        if (((C22592a) iVar.mo34e()).status_code == 0) {
                            C53037e eVar = this.f60821a.f60820a.f60818a.f60813e;
                            if (eVar != null) {
                                List<?> list = eVar.f131517a;
                                if (list != null) {
                                    list.clear();
                                }
                            }
                            C53037e eVar2 = this.f60821a.f60820a.f60818a.f60813e;
                            if (eVar2 != null) {
                                eVar2.notifyDataSetChanged();
                            }
                            C22678i iVar2 = this.f60821a.f60820a.f60819b;
                            if (iVar2 != null) {
                                iVar2.mo46969d();
                            }
                            this.f60821a.f60820a.f60818a.mo47007a(false);
                            FragmentActivity activity = this.f60821a.f60820a.f60818a.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                        }
                        return C52860x.f131107a;
                    }
                }, C0013i.f25b);
            }
        }

        C22643c(C22640c cVar, C22678i iVar) {
            this.f60818a = cVar;
            this.f60819b = iVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickInstrumentation.onClick(view);
            C10643a aVar = new C10643a(this.f60818a.getContext());
            Context context = this.f60818a.getContext();
            if (context != null) {
                str = context.getString(R.string.fwc);
            } else {
                str = null;
            }
            aVar.mo18902b(str);
            aVar.f28263H = 17;
            Context context2 = this.f60818a.getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.fwb);
            } else {
                str2 = null;
            }
            aVar.mo18893a(str2, (DialogInterface.OnClickListener) new C22644a(this));
            Context context3 = this.f60818a.getContext();
            if (context3 != null) {
                str3 = context3.getString(R.string.fwa);
            } else {
                str3 = null;
            }
            aVar.mo18903b(str3, (DialogInterface.OnClickListener) null);
            aVar.mo18897a().mo18883c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$d */
    static final class C22646d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22640c f60822a;

        C22646d(C22640c cVar) {
            this.f60822a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f60822a.mo47007a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.c$e */
    static final class C22647e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22640c f60823a;

        C22647e(C22640c cVar) {
            this.f60823a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f60823a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    public final View mo46973a(int i) {
        if (this.f60815g == null) {
            this.f60815g = new HashMap();
        }
        View view = (View) this.f60815g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f60815g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public final void mo46974b() {
        if (this.f60815g != null) {
            this.f60815g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46974b();
    }

    /* renamed from: a */
    public final void mo47007a(boolean z) {
        this.f60812d = z;
        ViewSwitcher viewSwitcher = (ViewSwitcher) mo46973a((int) R.id.f5q);
        C52711k.m112236a((Object) viewSwitcher, "txt_view_switcher");
        viewSwitcher.setDisplayedChild(z ? 1 : 0);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) mo46973a((int) R.id.ec2);
        C52711k.m112236a((Object) viewSwitcher2, "img_view_switcher");
        viewSwitcher2.setDisplayedChild(z);
        for (AnchorCell anchorCell : this.f60814f) {
            anchorCell.f60744g = z;
        }
        C53037e eVar = this.f60813e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        CharSequence charSequence;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        C53037e eVar = null;
        if (arguments != null) {
            list = arguments.getParcelableArrayList("recently_add");
        } else {
            list = null;
        }
        this.f60814f.clear();
        List<AnchorCell> list2 = this.f60814f;
        List list3 = list;
        if (list3 == null) {
            list3 = C52575l.m112097a();
        }
        list2.addAll(list3);
        for (AnchorCell anchorCell : this.f60814f) {
            anchorCell.f60744g = false;
        }
        ((ImageView) mo46973a((int) R.id.aru)).setOnClickListener(new C22641a(this));
        DmtTextView dmtTextView = (DmtTextView) mo46973a((int) R.id.dl0);
        C52711k.m112236a((Object) dmtTextView, "txt_title");
        Context context = getContext();
        if (context != null) {
            charSequence = context.getString(C22584a.m55780a().anchorInfo().mo47014a());
        } else {
            charSequence = null;
        }
        dmtTextView.setText(charSequence);
        C22678i iVar = (C22678i) getActivity();
        if (getActivity() != null) {
            C22589e adapterFactory = C22584a.m55780a().adapterFactory(iVar);
            if (adapterFactory != null) {
                eVar = new C53037e();
                adapterFactory.mo46975a(eVar, adapterFactory.f60729a, "recently_Add");
            }
            this.f60813e = eVar;
            C53037e eVar2 = this.f60813e;
            if (eVar2 != null) {
                List<AnchorCell> list4 = this.f60814f;
                if (list4 == null) {
                    list4 = new ArrayList<>();
                }
                eVar2.mo10432a(list4);
            }
        }
        RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView, "recycler_view");
        recyclerView.setAdapter(this.f60813e);
        RecyclerView recyclerView2 = (RecyclerView) mo46973a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        ViewSwitcher viewSwitcher = (ViewSwitcher) mo46973a((int) R.id.f5q);
        C52711k.m112236a((Object) viewSwitcher, "txt_view_switcher");
        viewSwitcher.setDisplayedChild(0);
        ((DmtTextView) mo46973a((int) R.id.f5b)).setOnClickListener(new C22642b(this));
        ((DmtTextView) mo46973a((int) R.id.f5a)).setOnClickListener(new C22643c(this, iVar));
        ((ImageView) mo46973a((int) R.id.aru)).setOnClickListener(new C22646d(this));
        ((ImageView) mo46973a((int) R.id.ebx)).setOnClickListener(new C22647e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bag, viewGroup, false);
    }
}
