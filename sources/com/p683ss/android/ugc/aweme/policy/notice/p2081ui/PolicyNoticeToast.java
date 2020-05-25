package com.p683ss.android.ugc.aweme.policy.notice.p2081ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39506a;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39507b;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39503a;
import com.p683ss.android.ugc.aweme.policy.notice.p2080b.C39509a;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast */
public final class PolicyNoticeToast extends LinearLayout {

    /* renamed from: a */
    public C39506a f101079a;

    /* renamed from: b */
    public C39506a f101080b;

    /* renamed from: c */
    private DmtTextView f101081c;

    /* renamed from: d */
    private DmtTextView f101082d;

    /* renamed from: e */
    private DmtTextView f101083e;

    /* renamed from: f */
    private DmtTextView f101084f;

    /* renamed from: g */
    private boolean f101085g;

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast$a */
    static final class C39514a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f101086a;

        /* renamed from: b */
        final /* synthetic */ C39507b f101087b;

        C39514a(PolicyNoticeToast policyNoticeToast, C39507b bVar) {
            this.f101086a = policyNoticeToast;
            this.f101087b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String str = this.f101087b.f101067c;
            int hashCode = str.hashCode();
            if (hashCode != -1052618729) {
                if (hashCode != -172220347) {
                    if (hashCode == 3277 && str.equals("h5")) {
                        Intent intent = new Intent(this.f101086a.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse(this.f101087b.f101068d));
                        this.f101086a.getContext().startActivity(intent);
                    }
                } else if (str.equals("callback")) {
                    new C39509a().mo80541a(PolicyNoticeToast.m87843a(this.f101086a).f101058a, PolicyNoticeToast.m87843a(this.f101086a).f101059b, PolicyNoticeToast.m87843a(this.f101086a).f101060c, this.f101087b.f101069e, this.f101087b.f101071g);
                    if (this.f101086a.f101080b != null) {
                        C39506a aVar = this.f101086a.f101080b;
                        if (aVar == null) {
                            C52711k.m112234a();
                        }
                        C47718bf.m103288a(new C39503a(aVar));
                    } else {
                        C40869c.f104035d.mo83206g();
                    }
                    PolicyNoticeToast policyNoticeToast = this.f101086a;
                    policyNoticeToast.setVisibility(8);
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                    animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) policyNoticeToast.getHeight()));
                    animationSet.setDuration(300);
                    policyNoticeToast.startAnimation(animationSet);
                }
            } else if (str.equals("native")) {
                C41302w.m91042a().mo83861a(C41311y.m91065a(this.f101087b.f101068d).mo83871a());
            }
            PolicyNoticeToast policyNoticeToast2 = this.f101086a;
            C39507b bVar = this.f101087b;
            String str2 = "qa_tns_general_dialog_click";
            C23089d a = C23089d.m56640a();
            String str3 = "business";
            C39506a aVar2 = policyNoticeToast2.f101079a;
            if (aVar2 == null) {
                C52711k.m112237a("mPolicyNotice");
            }
            C26890h.m65011a(str2, a.mo47829a(str3, aVar2.f101058a).mo47829a("style", "float").mo47829a("button_info", bVar.f101065a).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast$b */
    static final class C39515b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f101088a;

        C39515b(PolicyNoticeToast policyNoticeToast) {
            this.f101088a = policyNoticeToast;
        }

        public final void run() {
            PolicyNoticeToast policyNoticeToast = this.f101088a;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f101088a.getHeight(), 0.0f));
            animationSet.setDuration(300);
            policyNoticeToast.startAnimation(animationSet);
            this.f101088a.setVisibility(0);
            C26890h.m65011a("tns_general_dialog_show", C23089d.m56640a().mo47829a("business", PolicyNoticeToast.m87843a(this.f101088a).f101058a).mo47829a("style", "float").f61491a);
        }
    }

    public PolicyNoticeToast(Context context) {
        this(context, null, 0, 6, null);
    }

    public PolicyNoticeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private final void m87844a() {
        if (!this.f101085g) {
            this.f101085g = true;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.afy, null);
            View findViewById = inflate.findViewById(R.id.d8j);
            C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.tv_content)");
            this.f101081c = (DmtTextView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.pr);
            C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.button1)");
            this.f101082d = (DmtTextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.ps);
            C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.button2)");
            this.f101083e = (DmtTextView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.db8);
            C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.tv_line)");
            this.f101084f = (DmtTextView) findViewById4;
            addView(inflate);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C39506a m87843a(PolicyNoticeToast policyNoticeToast) {
        C39506a aVar = policyNoticeToast.f101079a;
        if (aVar == null) {
            C52711k.m112237a("mPolicyNotice");
        }
        return aVar;
    }

    public final void setNext(C39506a aVar) {
        C52711k.m112240b(aVar, "privacyNotice");
        m87844a();
        this.f101080b = aVar;
    }

    private final void setContent(String str) {
        DmtTextView dmtTextView = this.f101081c;
        if (dmtTextView == null) {
            C52711k.m112237a("mContent");
        }
        dmtTextView.setFontType(C10751d.f28903b);
        DmtTextView dmtTextView2 = this.f101081c;
        if (dmtTextView2 == null) {
            C52711k.m112237a("mContent");
        }
        dmtTextView2.setText(str);
    }

    public final void setValues(C39506a aVar) {
        C52711k.m112240b(aVar, "policyNotice");
        m87844a();
        this.f101079a = aVar;
        C39506a aVar2 = this.f101079a;
        if (aVar2 == null) {
            C52711k.m112237a("mPolicyNotice");
        }
        setContent(aVar2.f101062e);
        DmtTextView dmtTextView = this.f101082d;
        if (dmtTextView == null) {
            C52711k.m112237a("mButton1");
        }
        C39506a aVar3 = this.f101079a;
        if (aVar3 == null) {
            C52711k.m112237a("mPolicyNotice");
        }
        m87845a(dmtTextView, (C39507b) aVar3.f101063f.get(0));
        C39506a aVar4 = this.f101079a;
        if (aVar4 == null) {
            C52711k.m112237a("mPolicyNotice");
        }
        if (aVar4.f101063f.size() > 1) {
            DmtTextView dmtTextView2 = this.f101084f;
            if (dmtTextView2 == null) {
                C52711k.m112237a("mLine");
            }
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = this.f101083e;
            if (dmtTextView3 == null) {
                C52711k.m112237a("mButton2");
            }
            dmtTextView3.setVisibility(0);
            DmtTextView dmtTextView4 = this.f101083e;
            if (dmtTextView4 == null) {
                C52711k.m112237a("mButton2");
            }
            C39506a aVar5 = this.f101079a;
            if (aVar5 == null) {
                C52711k.m112237a("mPolicyNotice");
            }
            m87845a(dmtTextView4, (C39507b) aVar5.f101063f.get(1));
        } else {
            DmtTextView dmtTextView5 = this.f101084f;
            if (dmtTextView5 == null) {
                C52711k.m112237a("mLine");
            }
            dmtTextView5.setVisibility(8);
            DmtTextView dmtTextView6 = this.f101083e;
            if (dmtTextView6 == null) {
                C52711k.m112237a("mButton2");
            }
            dmtTextView6.setVisibility(8);
        }
        setVisibility(4);
        post(new C39515b(this));
    }

    /* renamed from: a */
    private final void m87845a(DmtTextView dmtTextView, C39507b bVar) {
        if (dmtTextView != null) {
            dmtTextView.setText(bVar.f101065a);
        }
        if (bVar.f101066b) {
            if (dmtTextView != null) {
                dmtTextView.setFontType(C10751d.f28903b);
            }
            if (dmtTextView != null) {
                Context context = getContext();
                C52711k.m112236a((Object) context, "context");
                dmtTextView.setTextColor(context.getResources().getColor(R.color.a7x));
            }
        } else if (dmtTextView != null) {
            dmtTextView.setFontType(C10751d.f28902a);
        }
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(new C39514a(this, bVar));
        }
    }

    public PolicyNoticeToast(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ PolicyNoticeToast(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
