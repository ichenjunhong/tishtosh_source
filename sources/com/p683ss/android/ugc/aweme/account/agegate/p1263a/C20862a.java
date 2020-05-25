package com.p683ss.android.ugc.aweme.account.agegate.p1263a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.agegate.api.Api;
import com.p683ss.android.ugc.aweme.account.agegate.model.SetEmailResponse;
import com.p683ss.android.ugc.aweme.account.agegate.p1264b.C20886a;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.regex.Pattern;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a */
public final class C20862a extends C23526a {

    /* renamed from: a */
    private HashMap f56805a;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a$a */
    static final class C20863a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20862a f56806a;

        /* renamed from: b */
        final /* synthetic */ AgeGateResponse f56807b;

        C20863a(C20862a aVar, AgeGateResponse ageGateResponse) {
            this.f56806a = aVar;
            this.f56807b = ageGateResponse;
        }

        public final void onClick(View view) {
            int i;
            ClickInstrumentation.onClick(view);
            AgeGateResponse ageGateResponse = this.f56807b;
            if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                String str = "export_video_finish_input";
                C20856a a = C20856a.m53173a().mo44776a("enter_method", "pop_up");
                String str2 = "pass_gate";
                AgeGateResponse ageGateResponse2 = this.f56807b;
                if (ageGateResponse2 == null || ageGateResponse2.getAgeGatePostAction() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                C26890h.m65011a(str, a.mo44774a(str2, i).f56798a);
            } else {
                C20886a.m53209b("submit_email");
            }
            C10643a a2 = new C10643a(this.f56806a.getActivity()).mo18885a((int) R.string.foy);
            C20862a aVar = this.f56806a;
            DmtEditText dmtEditText = (DmtEditText) this.f56806a.mo44786a(R.id.a_f);
            C52711k.m112236a((Object) dmtEditText, "emailInput");
            a2.mo18902b(aVar.getString(R.string.fox, String.valueOf(dmtEditText.getText()))).mo18900b((int) R.string.vj, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.dd3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C20863a f56808a;

                {
                    this.f56808a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    boolean z;
                    DmtEditText dmtEditText = (DmtEditText) this.f56808a.f56806a.mo44786a(R.id.a_f);
                    C52711k.m112236a((Object) dmtEditText, "emailInput");
                    CharSequence valueOf = String.valueOf(dmtEditText.getText());
                    int i2 = 0;
                    if (TextUtils.isEmpty(valueOf)) {
                        z = false;
                    } else {
                        z = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(valueOf).matches();
                    }
                    if (!z) {
                        C10691a.m21542b((Context) this.f56808a.f56806a.getActivity(), (int) R.string.b7c).mo19066a();
                        return;
                    }
                    AgeGateResponse ageGateResponse = this.f56808a.f56807b;
                    if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
                        String str = "export_video_address_confirm";
                        C20856a a = C20856a.m53173a().mo44776a("enter_method", "pop_up");
                        String str2 = "pass_gate";
                        AgeGateResponse ageGateResponse2 = this.f56808a.f56807b;
                        if (ageGateResponse2 != null && ageGateResponse2.getAgeGatePostAction() == 0) {
                            i2 = 1;
                        }
                        C26890h.m65011a(str, a.mo44774a(str2, i2).f56798a);
                    }
                    ((DmtStatusView) this.f56808a.f56806a.mo44786a(R.id.csl)).mo19212f();
                    DmtEditText dmtEditText2 = (DmtEditText) this.f56808a.f56806a.mo44786a(R.id.a_f);
                    C52711k.m112236a((Object) dmtEditText2, "emailInput");
                    Api.emailForExportVideo(String.valueOf(dmtEditText2.getText())).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<SetEmailResponse, Void>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C208641 f56809a;

                        {
                            this.f56809a = r1;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:20:0x00bd  */
                        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed  */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f7  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final /* synthetic */ java.lang.Object then(p001a.C0013i r5) {
                            /*
                                r4 = this;
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r0 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r0 = r0.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r0 = r0.f56806a
                                boolean r0 = r0.isViewValid()
                                r1 = 0
                                if (r0 == 0) goto L_0x00ff
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r0 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r0 = r0.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r0 = r0.f56806a
                                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                                if (r0 != 0) goto L_0x001b
                                goto L_0x00ff
                            L_0x001b:
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r0 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r0 = r0.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r0 = r0.f56806a
                                r2 = 2132022994(0x7f1416d2, float:1.9684423E38)
                                android.view.View r0 = r0.mo44786a(r2)
                                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r0
                                r3 = -1
                                r0.setStatus(r3)
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r0 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r0 = r0.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r0 = r0.f56806a
                                android.view.View r0 = r0.mo44786a(r2)
                                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r0
                                java.lang.String r2 = "statusView"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                                r2 = 8
                                r0.setVisibility(r2)
                                java.lang.String r0 = "task"
                                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                                boolean r0 = r5.mo31c()
                                if (r0 != 0) goto L_0x00fe
                                boolean r5 = r5.mo33d()
                                if (r5 != 0) goto L_0x00fe
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r5 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r5 = r5.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r5 = r5.f56806a
                                r0 = 2132018771(0x7f140653, float:1.9675858E38)
                                android.view.View r5 = r5.mo44786a(r0)
                                com.bytedance.ies.dmt.ui.widget.DmtEditText r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtEditText) r5
                                com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.m58184c(r5)
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r5 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r5 = r5.f56808a
                                com.ss.android.ugc.aweme.account.bean.AgeGateResponse r5 = r5.f56807b
                                if (r5 == 0) goto L_0x00c1
                                int r5 = r5.getAgeGatePostAction()
                                r0 = 2
                                if (r5 != r0) goto L_0x00c1
                                android.content.Intent r5 = new android.content.Intent
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r0 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r0 = r0.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r0 = r0.f56806a
                                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                                android.content.Context r0 = (android.content.Context) r0
                                java.lang.Class<com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity> r2 = com.p683ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity.class
                                r5.<init>(r0, r2)
                                java.lang.String r0 = "age_gate_response"
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r2 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r2 = r2.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r2 = r2.f56806a
                                android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                                if (r2 == 0) goto L_0x00a4
                                android.content.Intent r2 = r2.getIntent()
                                if (r2 == 0) goto L_0x00a4
                                java.lang.String r3 = "age_gate_response"
                                java.io.Serializable r2 = r2.getSerializableExtra(r3)
                                goto L_0x00a5
                            L_0x00a4:
                                r2 = r1
                            L_0x00a5:
                                r5.putExtra(r0, r2)
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r0 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r0 = r0.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r0 = r0.f56806a
                                r0.startActivity(r5)
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r5 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r5 = r5.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r5 = r5.f56806a
                                android.support.v4.app.FragmentActivity r5 = r5.getActivity()
                                if (r5 == 0) goto L_0x00fe
                                r5.finish()
                                goto L_0x00fe
                            L_0x00c1:
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r5 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r5 = r5.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r5 = r5.f56806a
                                android.support.v4.app.FragmentActivity r5 = r5.getActivity()
                                if (r5 == 0) goto L_0x00d8
                                android.support.v4.app.k r5 = r5.getSupportFragmentManager()
                                if (r5 == 0) goto L_0x00d8
                                android.support.v4.app.r r5 = r5.mo2225a()
                                goto L_0x00d9
                            L_0x00d8:
                                r5 = r1
                            L_0x00d9:
                                com.ss.android.ugc.aweme.account.agegate.a.b r0 = new com.ss.android.ugc.aweme.account.agegate.a.b
                                r0.<init>()
                                com.ss.android.ugc.aweme.account.agegate.a.a$a$1 r2 = r4.f56809a
                                com.ss.android.ugc.aweme.account.agegate.a.a$a r2 = r2.f56808a
                                com.ss.android.ugc.aweme.account.agegate.a.a r2 = r2.f56806a
                                android.os.Bundle r2 = r2.getArguments()
                                r0.setArguments(r2)
                                if (r5 == 0) goto L_0x00f5
                                r2 = 2132019228(0x7f14081c, float:1.9676785E38)
                                android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                                r5.mo2191b(r2, r0)
                            L_0x00f5:
                                if (r5 == 0) goto L_0x00fa
                                r5.mo2189b()
                            L_0x00fa:
                                r5 = 0
                                com.p683ss.android.ugc.aweme.account.util.C22282t.m55145c(r5)
                            L_0x00fe:
                                return r1
                            L_0x00ff:
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.agegate.p1263a.C20862a.C20863a.C208641.C208651.then(a.i):java.lang.Object");
                        }
                    }, C0013i.f25b);
                }
            }).mo18897a().mo18882b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a$b */
    static final class C20866b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20862a f56810a;

        C20866b(C20862a aVar) {
            this.f56810a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m58184c((DmtEditText) this.f56810a.mo44786a(R.id.a_f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a$c */
    static final class C20867c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20862a f56811a;

        C20867c(C20862a aVar) {
            this.f56811a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f56811a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public final View mo44786a(int i) {
        if (this.f56805a == null) {
            this.f56805a = new HashMap();
        }
        View view = (View) this.f56805a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f56805a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f56805a != null) {
            this.f56805a.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) serializable;
        DmtTextView dmtTextView = (DmtTextView) mo44786a(R.id.a4e);
        C52711k.m112236a((Object) dmtTextView, "desc");
        if (ageGateResponse != null && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.is_prompt()) {
            charSequence = getString(R.string.b7e);
        } else if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.fp0));
            sb.append("\n");
            sb.append(getString(R.string.fp1));
            charSequence = sb.toString();
        } else {
            charSequence = getString(R.string.b7f);
        }
        dmtTextView.setText(charSequence);
        DmtTextView dmtTextView2 = (DmtTextView) mo44786a(R.id.cl2);
        C52711k.m112236a((Object) dmtTextView2, "sendEmail");
        if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 2) {
            charSequence2 = getText(R.string.b7i);
        } else {
            charSequence2 = getString(R.string.fpc);
        }
        dmtTextView2.setText(charSequence2);
        ((DmtStatusView) mo44786a(R.id.csl)).setBuilder(C10719a.m21676a(getContext()));
        ((DmtTextView) mo44786a(R.id.cl2)).setOnClickListener(new C20863a(this, ageGateResponse));
        ((FrameLayout) mo44786a(R.id.cfd)).setOnClickListener(new C20866b(this));
        ((AutoRTLImageView) mo44786a(R.id.acy)).setOnClickListener(new C20867c(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ayv, viewGroup, false);
    }
}
