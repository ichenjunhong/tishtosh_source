package com.p683ss.android.ugc.aweme.account.login.recover;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.account.login.C21053aa;
import com.p683ss.android.ugc.aweme.account.utils.C22301h;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.i */
public final class C21452i extends C1322a<C21456d> {

    /* renamed from: c */
    public static final C21453a f58168c = new C21453a(null);

    /* renamed from: a */
    public C21454b f58169a;

    /* renamed from: b */
    public final List<C21455c> f58170b;

    /* renamed from: d */
    private final C21053aa[] f58171d = C22301h.m55191a();

    /* renamed from: e */
    private final Context f58172e;

    /* renamed from: f */
    private final String f58173f;

    /* renamed from: g */
    private final String f58174g;

    /* renamed from: h */
    private final Boolean f58175h;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.i$a */
    public static final class C21453a {
        private C21453a() {
        }

        public /* synthetic */ C21453a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.i$b */
    public interface C21454b {
        /* renamed from: a */
        void mo45606a(int i, C21443e eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.i$c */
    public static final class C21455c implements Serializable {

        /* renamed from: a */
        private String f58176a;

        /* renamed from: b */
        private int f58177b;

        /* renamed from: c */
        private String f58178c;

        /* renamed from: d */
        private C21443e f58179d;

        public final C21443e getAuthType() {
            return this.f58179d;
        }

        public final String getMethodInfo() {
            return this.f58178c;
        }

        public final String getMethodName() {
            return this.f58176a;
        }

        public final int getMethodType() {
            return this.f58177b;
        }

        public final void setAuthType(C21443e eVar) {
            this.f58179d = eVar;
        }

        public final void setMethodInfo(String str) {
            this.f58178c = str;
        }

        public final void setMethodName(String str) {
            this.f58176a = str;
        }

        public final void setMethodType(int i) {
            this.f58177b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.i$d */
    public static final class C21456d extends C1352v {

        /* renamed from: a */
        public final DmtTextView f58180a;

        /* renamed from: b */
        public final DmtTextView f58181b;

        /* renamed from: c */
        public final AvatarImageView f58182c;

        /* renamed from: d */
        public final RelativeLayout f58183d;

        /* renamed from: e */
        public final DmtTextView f58184e;

        /* renamed from: f */
        public final DmtTextView f58185f;

        /* renamed from: g */
        public final RemoteImageView f58186g;

        /* renamed from: h */
        public final AutoRTLImageView f58187h;

        public C21456d(View view) {
            C52711k.m112240b(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.f1i);
            C52711k.m112236a((Object) findViewById, "v.findViewById(R.id.tv_avatar_name)");
            this.f58180a = (DmtTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.f56);
            C52711k.m112236a((Object) findViewById2, "v.findViewById(R.id.tv_verify_tip)");
            this.f58181b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ebm);
            C52711k.m112236a((Object) findViewById3, "v.findViewById(R.id.im_avatar)");
            this.f58182c = (AvatarImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.esx);
            C52711k.m112236a((Object) findViewById4, "v.findViewById(R.id.rl_method_bg)");
            this.f58183d = (RelativeLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.f3d);
            C52711k.m112236a((Object) findViewById5, "v.findViewById(R.id.tv_method_name)");
            this.f58184e = (DmtTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.f3c);
            C52711k.m112236a((Object) findViewById6, "v.findViewById(R.id.tv_method_detail_info)");
            this.f58185f = (DmtTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.ebp);
            C52711k.m112236a((Object) findViewById7, "v.findViewById(R.id.im_icon)");
            this.f58186g = (RemoteImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.ebl);
            C52711k.m112236a((Object) findViewById8, "v.findViewById(R.id.im_arrow)");
            this.f58187h = (AutoRTLImageView) findViewById8;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.i$e */
    static final class C21457e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21452i f58188a;

        /* renamed from: b */
        final /* synthetic */ int f58189b;

        C21457e(C21452i iVar, int i) {
            this.f58188a = iVar;
            this.f58189b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f58189b > 1) {
                C21454b bVar = this.f58188a.f58169a;
                if (bVar == null) {
                    C52711k.m112237a("onItemClick");
                }
                bVar.mo45606a(((C21455c) this.f58188a.f58170b.get(this.f58189b - 2)).getMethodType(), ((C21455c) this.f58188a.f58170b.get(this.f58189b - 2)).getAuthType());
            }
        }
    }

    public final int getItemCount() {
        return this.f58170b.size() + 2;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        View inflate = LayoutInflater.from(this.f58172e).inflate(R.layout.b1_, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C21456d(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        C21456d dVar = (C21456d) vVar;
        C52711k.m112240b(dVar, "p0");
        switch (i) {
            case 0:
                dVar.f58180a.setVisibility(8);
                dVar.f58181b.setVisibility(8);
                dVar.f58183d.setVisibility(8);
                dVar.f58182c.setVisibility(0);
                if (!TextUtils.isEmpty(this.f58174g)) {
                    C23515d.m57677a((RemoteImageView) dVar.f58182c, this.f58174g);
                    break;
                }
                break;
            case 1:
                dVar.f58183d.setVisibility(8);
                dVar.f58182c.setVisibility(8);
                dVar.f58180a.setVisibility(0);
                dVar.f58181b.setVisibility(0);
                if (!TextUtils.isEmpty(this.f58173f)) {
                    dVar.f58180a.setText(this.f58173f);
                    dVar.f58180a.setFontType(C10751d.f28908g);
                    dVar.f58181b.setFontType(C10751d.f28902a);
                    break;
                }
                break;
            default:
                int i2 = i - 2;
                if (i2 < this.f58170b.size() && i2 >= 0) {
                    C21455c cVar = (C21455c) this.f58170b.get(i2);
                    if (cVar != null) {
                        dVar.f58180a.setVisibility(8);
                        dVar.f58181b.setVisibility(8);
                        dVar.f58183d.setVisibility(0);
                        dVar.f58182c.setVisibility(8);
                        dVar.f58187h.setVisibility(0);
                        switch (cVar.getMethodType()) {
                            case 1:
                                C23515d.m57668a(dVar.f58186g, 2131951971);
                                dVar.f58185f.setText(cVar.getMethodInfo());
                                dVar.f58184e.setText(cVar.getMethodName());
                                break;
                            case 2:
                                C23515d.m57668a(dVar.f58186g, 2131951970);
                                dVar.f58185f.setText(cVar.getMethodInfo());
                                dVar.f58184e.setText(cVar.getMethodName());
                                break;
                            case 3:
                                dVar.f58187h.setVisibility(8);
                                C21443e authType = cVar.getAuthType();
                                if (authType != null) {
                                    switch (C21458j.f58190a[authType.ordinal()]) {
                                        case 1:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.cen);
                                            break;
                                        case 2:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.ces);
                                            break;
                                        case 3:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.ceo);
                                            break;
                                        case 4:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.cer);
                                            break;
                                        case 5:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.ceq);
                                            break;
                                        case 6:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.cep);
                                            break;
                                        case 7:
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.cet);
                                            break;
                                        case 8:
                                            dVar.f58187h.setVisibility(8);
                                            C23515d.m57668a(dVar.f58186g, (int) R.drawable.ch5);
                                            break;
                                    }
                                }
                                dVar.f58185f.setText(cVar.getMethodInfo());
                                dVar.f58184e.setText(cVar.getMethodName());
                                C21053aa[] aaVarArr = this.f58171d;
                                int length = aaVarArr.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                        String aaVar = aaVarArr[i3].toString();
                                        if (aaVar != null) {
                                            String lowerCase = aaVar.toLowerCase();
                                            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                                            String valueOf = String.valueOf(cVar.getAuthType());
                                            if (valueOf != null) {
                                                String lowerCase2 = valueOf.toLowerCase();
                                                C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                                                if (C52711k.m112239a((Object) lowerCase, (Object) lowerCase2)) {
                                                    z = true;
                                                } else {
                                                    i3++;
                                                }
                                            } else {
                                                throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                            }
                                        } else {
                                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    dVar.f58187h.setVisibility(0);
                                    break;
                                }
                                break;
                        }
                        dVar.f58184e.setFontType(C10751d.f28908g);
                        dVar.f58185f.setFontType(C10751d.f28902a);
                        break;
                    }
                } else {
                    return;
                }
                break;
        }
        dVar.itemView.setOnClickListener(new C21457e(this, i));
    }

    public C21452i(Context context, List<C21455c> list, String str, String str2, Boolean bool) {
        C52711k.m112240b(list, "list");
        this.f58172e = context;
        this.f58170b = list;
        this.f58173f = str;
        this.f58174g = str2;
        this.f58175h = bool;
    }
}
