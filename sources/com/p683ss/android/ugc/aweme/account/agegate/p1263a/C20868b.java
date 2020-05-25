package com.p683ss.android.ugc.aweme.account.agegate.p1263a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21091a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36688i;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.a.b */
public final class C20868b extends C23526a implements C21091a {

    /* renamed from: a */
    public static final C20869a f56812a = new C20869a(null);

    /* renamed from: b */
    private HashMap f56813b;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.b$a */
    public static final class C20869a {
        private C20869a() {
        }

        public /* synthetic */ C20869a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.b$b */
    static final class C20870b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20868b f56814a;

        /* renamed from: b */
        final /* synthetic */ AgeGateResponse f56815b;

        C20870b(C20868b bVar, AgeGateResponse ageGateResponse) {
            this.f56814a = bVar;
            this.f56815b = ageGateResponse;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String str = "age_gate_complete_click";
            int i = 1;
            C20856a a = C20856a.m53173a().mo44776a("enter_method", "pop_up").mo44774a("pass_export", 1);
            String str2 = "pass_gate";
            AgeGateResponse ageGateResponse = this.f56815b;
            if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 0) {
                i = 0;
            }
            C26890h.m65011a(str, a.mo44774a(str2, i).f56798a);
            FragmentActivity activity = this.f56814a.getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            AgeGateResponse ageGateResponse2 = this.f56815b;
            if (ageGateResponse2 == null || ageGateResponse2.getAgeGatePostAction() != 0) {
                Intent a2 = ((C36688i) C23826bi.m58450a(C36688i.class)).mo47882a();
                a2.setFlags(268468224);
                this.f56814a.startActivity(a2);
            } else {
                C23826bi.m58465f().notifyFinish();
            }
            FragmentActivity activity2 = this.f56814a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.b$c */
    public static final class C20871c extends C22313c {

        /* renamed from: a */
        final /* synthetic */ C20868b f56816a;

        /* renamed from: b */
        final /* synthetic */ int f56817b;

        /* renamed from: c */
        final /* synthetic */ int f56818c;

        public final void onClick(View view) {
            C52711k.m112240b(view, "view");
            if (this.f56816a.getContext() != null) {
                C36703x xVar = (C36703x) C23826bi.m58450a(C36703x.class);
                Context context = this.f56816a.getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "context!!");
                xVar.mo47870a(context, "https://www.tiktok.com/en/privacy-policy-for-younger-users", true);
            }
        }

        C20871c(C20868b bVar, int i, int i2, int i3, int i4) {
            this.f56816a = bVar;
            this.f56817b = i;
            this.f56818c = i2;
            super(i3, i4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.b$d */
    public static final class C20872d extends C22313c {

        /* renamed from: a */
        final /* synthetic */ C20868b f56819a;

        /* renamed from: b */
        final /* synthetic */ int f56820b;

        /* renamed from: c */
        final /* synthetic */ int f56821c;

        public final void onClick(View view) {
            C52711k.m112240b(view, "view");
            if (this.f56819a.getContext() != null) {
                C36703x xVar = (C36703x) C23826bi.m58450a(C36703x.class);
                Context context = this.f56819a.getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "context!!");
                xVar.mo47870a(context, "https://www.tiktok.com/en/terms-of-use", true);
            }
        }

        C20872d(C20868b bVar, int i, int i2, int i3, int i4) {
            this.f56819a = bVar;
            this.f56820b = i;
            this.f56821c = i2;
            super(i3, i4);
        }
    }

    /* renamed from: a */
    private View m53190a(int i) {
        if (this.f56813b == null) {
            this.f56813b = new HashMap();
        }
        View view = (View) this.f56813b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f56813b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean aj_() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f56813b != null) {
            this.f56813b.clear();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        int i;
        View view2 = view;
        C52711k.m112240b(view2, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) serializable;
        if (ageGateResponse != null && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.is_prompt()) {
            ((DmtTextView) m53190a(R.id.a4e)).setText(R.string.b7j);
        } else if (ageGateResponse != null && ageGateResponse.getAgeGatePostAction() == 1) {
            String string = getString(R.string.b7l);
            C52711k.m112236a((Object) string, "getString(R.string.ftc_set_emai_done_desc_1_1)");
            Spannable newSpannable = Factory.getInstance().newSpannable(getString(R.string.b7k, string));
            newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a7x)), newSpannable.length() - string.length(), newSpannable.length(), 17);
            DmtTextView dmtTextView = (DmtTextView) m53190a(R.id.a4e);
            C52711k.m112236a((Object) dmtTextView, "desc");
            dmtTextView.setText(newSpannable);
            ImageView imageView = (ImageView) m53190a(R.id.bje);
            C52711k.m112236a((Object) imageView, "logoImage");
            imageView.getLayoutParams().width = (C9432q.m18670a(getContext()) * 160) / 375;
            ImageView imageView2 = (ImageView) m53190a(R.id.bje);
            C52711k.m112236a((Object) imageView2, "logoImage");
            LayoutParams layoutParams = imageView2.getLayoutParams();
            ImageView imageView3 = (ImageView) m53190a(R.id.bje);
            C52711k.m112236a((Object) imageView3, "logoImage");
            layoutParams.height = imageView3.getLayoutParams().width;
            Spannable newSpannable2 = Factory.getInstance().newSpannable(getString(R.string.b7m));
            String string2 = getString(R.string.b7n);
            C52711k.m112236a((Object) string2, "getString(R.string.ftc_s…mail_done_privacy_policy)");
            String string3 = getString(R.string.b7o);
            C52711k.m112236a((Object) string3, "getString(R.string.ftc_s…email_done_terms_service)");
            String string4 = getString(R.string.b7m);
            C52711k.m112236a((Object) string4, "getString(R.string.ftc_s…l_done_privacy_and_terms)");
            int a = C52830p.m112419a((CharSequence) string4, string2, 0, false, 6, (Object) null);
            String string5 = getString(R.string.b7m);
            C52711k.m112236a((Object) string5, "getString(R.string.ftc_s…l_done_privacy_and_terms)");
            int a2 = C52830p.m112419a((CharSequence) string5, string3, 0, false, 6, (Object) null);
            if (a < 0 || a2 < 0) {
                JSONObject b = C23088c.m56631a().mo47824a("enter_from", "ftc_complete").mo47825b();
                C52711k.m112236a((Object) b, "EventJsonBuilder.newBuil…, \"ftc_complete\").build()");
                C22089b.m54869a("text_highlight_not_match", "", b);
            }
            int color = getResources().getColor(R.color.j6);
            int color2 = getResources().getColor(R.color.up);
            C20871c cVar = r0;
            int i2 = color;
            int i3 = a;
            int i4 = color2;
            String str = string3;
            int i5 = color;
            String str2 = string2;
            C20871c cVar2 = new C20871c(this, i2, i4, i5, color2);
            C20872d dVar = r0;
            C20872d dVar2 = new C20872d(this, i2, i4, i5, color2);
            newSpannable2.setSpan(cVar, i3, i3 + str2.length(), 17);
            newSpannable2.setSpan(dVar, a2, str.length() + a2, 17);
            TextView textView = (TextView) view2.findViewById(R.id.c4x);
            C52711k.m112236a((Object) textView, "this");
            textView.setText(newSpannable2);
            i = 0;
            textView.setVisibility(0);
            textView.setMovementMethod(C22311a.m55214a());
            ((DmtTextView) m53190a(R.id.yj)).setOnClickListener(new C20870b(this, ageGateResponse));
            String str3 = "age_gate_complete";
            C20856a a3 = C20856a.m53173a().mo44776a("enter_method", "pop_up");
            String str4 = "pass_gate";
            if (ageGateResponse != null && ageGateResponse.getAgeGatePostAction() == 0) {
                i = 1;
            }
            C26890h.m65011a(str3, a3.mo44774a(str4, i).mo44774a("pass_export", 1).f56798a);
        }
        i = 0;
        ((DmtTextView) m53190a(R.id.yj)).setOnClickListener(new C20870b(this, ageGateResponse));
        String str32 = "age_gate_complete";
        C20856a a32 = C20856a.m53173a().mo44776a("enter_method", "pop_up");
        String str42 = "pass_gate";
        i = 1;
        C26890h.m65011a(str32, a32.mo44774a(str42, i).mo44774a("pass_export", 1).f56798a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.az0, viewGroup, false);
    }
}
