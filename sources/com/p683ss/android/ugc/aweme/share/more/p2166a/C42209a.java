package com.p683ss.android.ugc.aweme.share.more.p2166a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0497a;
import android.support.design.widget.C0540c;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.content.C0726c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.p1057b.p1060c.C17538ad;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.more.p2167b.C42214a;
import com.p683ss.android.ugc.aweme.share.more.p2167b.C42214a.C42215a;
import com.p683ss.android.ugc.aweme.share.more.p2167b.C42214a.C42216b;
import com.p683ss.android.ugc.aweme.share.more.p2168ui.ShareActionVerticalList;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42341c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareActionBar;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.more.a.a */
public final class C42209a extends C0540c implements C42341c {

    /* renamed from: a */
    public static final C42210a f106724a = new C42210a(null);

    /* renamed from: b */
    private final C42348d f106725b;

    /* renamed from: c */
    private HashMap f106726c;

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$a */
    public static final class C42210a {
        private C42210a() {
        }

        public /* synthetic */ C42210a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$b */
    static final class C42211b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f106727a;

        C42211b(View view) {
            this.f106727a = view;
        }

        public final void run() {
            ViewParent parent = this.f106727a.getParent();
            if (parent != null) {
                LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    Behavior behavior = ((C0505d) layoutParams).f1693a;
                    if (behavior != null) {
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                        double b = (double) C9432q.m18688b(this.f106727a.getContext());
                        Double.isNaN(b);
                        bottomSheetBehavior.mo1296a((int) (b * 0.7d));
                        bottomSheetBehavior.f1646q = new C0497a() {

                            /* renamed from: a */
                            private int f106728a = -1;

                            /* renamed from: a */
                            public final void mo1315a(View view, float f) {
                                C52711k.m112240b(view, "bottomSheet");
                            }

                            /* renamed from: a */
                            public final void mo1316a(View view, int i) {
                                C52711k.m112240b(view, "bottomSheet");
                                if (i == 3 && this.f106728a == 2) {
                                    C26890h.m65011a("slide_up_full_screen_show", (Map<String, String>) C17538ad.m43098of("action_on", "more_board"));
                                }
                                this.f106728a = i;
                            }
                        };
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.support.design.widget.BottomSheetBehavior<android.view.View!>");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.a.a$c */
    static final class C42213c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42209a f106729a;

        C42213c(C42209a aVar) {
            this.f106729a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106729a.dismiss();
        }
    }

    /* renamed from: a */
    private View m92646a(int i) {
        if (this.f106726c == null) {
            this.f106726c = new HashMap();
        }
        View view = (View) this.f106726c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f106726c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f106726c != null) {
            this.f106726c.clear();
        }
    }

    public final void onPause() {
        if (isVisible()) {
            dismissAllowingStateLoss();
        }
        super.onPause();
    }

    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.post(new C42211b(view));
        }
        View findViewById = getDialog().findViewById(R.id.a4q);
        C52711k.m112236a((Object) findViewById, "bottomSheet");
        findViewById.getLayoutParams().height = -1;
    }

    public C42209a(C42348d dVar) {
        C52711k.m112240b(dVar, "config");
        this.f106725b = dVar;
    }

    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof View)) {
            viewParent = null;
        }
        View view2 = (View) viewParent;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo86165a(C42357g gVar) {
        C52711k.m112240b(gVar, "action");
        Context context = getContext();
        if (context != null) {
            C52711k.m112236a((Object) context, "context ?: return");
            if (!this.f106725b.f106953i.mo86154a(gVar, context)) {
                Context requireContext = requireContext();
                C52711k.m112236a((Object) requireContext, "requireContext()");
                gVar.mo49950a(requireContext, this.f106725b.f106953i);
            }
            C42354e eVar = this.f106725b.f106956l;
            if (eVar != null) {
                SharePackage sharePackage = this.f106725b.f106953i;
                Context requireContext2 = requireContext();
                C52711k.m112236a((Object) requireContext2, "requireContext()");
                eVar.mo49961a(gVar, sharePackage, requireContext2);
            }
            if (gVar.mo49957f()) {
                dismiss();
                return;
            }
            if (gVar.mo49956e()) {
                dismiss();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C42214a aVar;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        DmtTextView dmtTextView = (DmtTextView) m92646a((int) R.id.elk);
        Context context = dmtTextView.getContext();
        C52711k.m112236a((Object) context, "context");
        dmtTextView.setText(context.getResources().getText(R.string.c7g));
        dmtTextView.setTextColor(C0726c.m2098c(dmtTextView.getContext(), this.f106725b.f106950f));
        dmtTextView.setAlpha(this.f106725b.f106951g);
        dmtTextView.setVisibility(0);
        if (C41922a.m91868a().enhanceVideoShareAction()) {
            aVar = C42216b.f106732a;
        } else {
            aVar = C42215a.f106730a;
        }
        List a = aVar.mo86168a(this.f106725b.f106946b);
        if (!(!a.isEmpty())) {
            a = null;
        }
        if (a != null) {
            View a2 = m92646a((int) R.id.elo);
            C52711k.m112236a((Object) a2, "more_dialog_middle_divider");
            a2.setVisibility(0);
            ShareActionBar shareActionBar = (ShareActionBar) m92646a((int) R.id.elq);
            C52711k.m112236a((Object) shareActionBar, "more_panel_action_bar");
            shareActionBar.setVisibility(0);
            ((ShareActionBar) m92646a((int) R.id.elq)).mo86248a(a);
            ((ShareActionBar) m92646a((int) R.id.elq)).mo86247a((C42341c) this);
        }
        ShareActionVerticalList shareActionVerticalList = (ShareActionVerticalList) m92646a((int) R.id.elt);
        List<? extends C42357g> b = aVar.mo86169b(this.f106725b.f106946b);
        C52711k.m112240b(b, "actions");
        shareActionVerticalList.f106735a = b;
        shareActionVerticalList.f106737c.mo86172a(b);
        ShareActionVerticalList shareActionVerticalList2 = (ShareActionVerticalList) m92646a((int) R.id.elt);
        C42341c cVar = this;
        C52711k.m112240b(cVar, "listener");
        shareActionVerticalList2.f106736b = cVar;
        ((ImageView) m92646a((int) R.id.elm)).setOnClickListener(new C42213c(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return View.inflate(getContext(), R.layout.bul, viewGroup);
    }
}
