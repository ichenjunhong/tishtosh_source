package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22015m;
import com.p683ss.android.ugc.aweme.account.utils.C22300g;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b */
public abstract class C21868b extends C21829b implements C22015m {

    /* renamed from: a */
    private AccountKeyBoardHelper f59205a;

    /* renamed from: b */
    private HashMap f59206b;

    /* renamed from: n */
    public C21861a f59207n;

    /* renamed from: o */
    public boolean f59208o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b$a */
    public static final class C21869a implements C10713a {

        /* renamed from: a */
        final /* synthetic */ C21868b f59209a;

        C21869a(C21868b bVar) {
            this.f59209a = bVar;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f59209a.mo45999t();
        }

        /* renamed from: b */
        public final void mo19167b(View view) {
            String str;
            C21861a aVar = this.f59209a.f59207n;
            if (aVar != null) {
                str = aVar.f59185g;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C22300g.m55188a(this.f59209a.getActivity(), str, this.f59209a.mo45967m());
                return;
            }
            throw new IllegalStateException("请传pageName".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b$b */
    static final class C21870b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f59210a;

        C21870b(View view) {
            this.f59210a = view;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m58184c(this.f59210a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.b$c */
    static final class C21871c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21868b f59211a;

        /* renamed from: b */
        final /* synthetic */ View f59212b;

        /* renamed from: c */
        final /* synthetic */ OnClickListener f59213c;

        C21871c(C21868b bVar, View view, OnClickListener onClickListener) {
            this.f59211a = bVar;
            this.f59212b = view;
            this.f59213c = onClickListener;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(this.f59212b) && this.f59211a.mo45998s()) {
                if (C11016e.m22312g() == null) {
                    C11016e.m22301a((Activity) this.f59211a.getActivity());
                }
                this.f59213c.onClick(view);
            }
        }
    }

    /* renamed from: U_ */
    public abstract C21861a mo44860U_();

    /* renamed from: W_ */
    public void mo45995W_() {
    }

    /* renamed from: X_ */
    public void mo45996X_() {
    }

    /* renamed from: a */
    public View mo44862a(int i) {
        if (this.f59206b == null) {
            this.f59206b = new HashMap();
        }
        View view = (View) this.f59206b.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59206b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public abstract void ad_();

    /* renamed from: e */
    public abstract void mo45584e();

    /* renamed from: f */
    public boolean mo44865f() {
        return false;
    }

    /* renamed from: g */
    public void mo44866g() {
        if (this.f59206b != null) {
            this.f59206b.clear();
        }
    }

    /* renamed from: i */
    public abstract int mo45585i();

    public void onDestroyView() {
        mo45584e();
        super.onDestroyView();
        mo44866g();
    }

    public void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f59205a;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f59147b = null;
        }
    }

    public void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f59205a;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f59147b = this;
        }
    }

    /* renamed from: t */
    public void mo45999t() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: s */
    public final boolean mo45998s() {
        if (C21872c.m54572a(getContext())) {
            return true;
        }
        String string = getString(R.string.cg1);
        C52711k.m112236a((Object) string, "getString(R.string.network_unavailable)");
        mo45582a(0, string);
        return false;
    }

    /* renamed from: b */
    public final void mo45963b(int i) {
        if (i != 0) {
            if (i == 1) {
                if (isViewValid()) {
                    ad_();
                    return;
                }
                this.f59208o = true;
            }
        } else if (isViewValid()) {
            mo45584e();
        } else {
            if (this.f59208o) {
                this.f59208o = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo45997a(View view, OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "onClickListener");
        if (view != null) {
            view.setOnClickListener(new C21871c(this, view, onClickListener));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e2, code lost:
        if (android.text.TextUtils.isEmpty(r9) == false) goto L_0x01e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            super.onViewCreated(r8, r9)
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.mo44860U_()
            r7.f59207n = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r0 = 0
            r1 = 2132017595(0x7f1401bb, float:1.9673473E38)
            r2 = 19
            if (r9 < r2) goto L_0x0038
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            java.lang.String r2 = "baseI18nTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            android.widget.ImageView r9 = r9.getEndBtn()
            java.lang.String r2 = "baseI18nTitleBar.endBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            android.graphics.drawable.Drawable r9 = r9.getDrawable()
            java.lang.String r2 = "baseI18nTitleBar.endBtn.drawable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            r9.setAutoMirrored(r0)
        L_0x0038:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            r2 = 2132017593(0x7f1401b9, float:1.9673469E38)
            r3 = 2132017594(0x7f1401ba, float:1.967347E38)
            r4 = 8
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            java.lang.String r5 = "baseI18nTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
            r9.setVisibility(r4)
            android.view.View r9 = r7.mo44862a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            java.lang.String r3 = "baseI18nContentTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r3)
            r9.setVisibility(r4)
            android.view.View r9 = r7.mo44862a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            java.lang.String r2 = "baseI18nContentDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            r9.setVisibility(r4)
            goto L_0x01ba
        L_0x0070:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 != 0) goto L_0x0077
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0077:
            java.lang.String r9 = r9.f59179a
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0091
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            java.lang.String r5 = "baseI18nTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
            r9.setVisibility(r4)
            goto L_0x013f
        L_0x0091:
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            com.ss.android.ugc.aweme.account.login.v2.ui.a r5 = r7.f59207n
            if (r5 != 0) goto L_0x009e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x009e:
            java.lang.String r5 = r5.f59179a
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r9.setTitle(r5)
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 != 0) goto L_0x00ac
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ac:
            java.lang.String r9 = r9.f59180b
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x00de
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            com.ss.android.ugc.aweme.account.login.v2.ui.a r5 = r7.f59207n
            if (r5 != 0) goto L_0x00c3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c3:
            java.lang.String r5 = r5.f59180b
            r9.setStartText(r5)
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            android.content.res.Resources r5 = r7.getResources()
            r6 = 2131886226(0x7f120092, float:1.9407025E38)
            int r5 = r5.getDimensionPixelSize(r6)
            float r5 = (float) r5
            r9.setStartTextSize(r5)
            goto L_0x010d
        L_0x00de:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 != 0) goto L_0x00e5
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00e5:
            boolean r9 = r9.f59181c
            if (r9 == 0) goto L_0x00f6
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            r5 = 2131951975(0x7f130167, float:1.954038E38)
            r9.setStartBtnIcon(r5)
            goto L_0x010d
        L_0x00f6:
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            java.lang.String r5 = "baseI18nTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
            android.widget.ImageView r9 = r9.getStartBtn()
            java.lang.String r5 = "baseI18nTitleBar.startBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
            r9.setVisibility(r4)
        L_0x010d:
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            com.ss.android.ugc.aweme.account.login.v2.ui.a.b$a r5 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.b$a
            r5.<init>(r7)
            com.bytedance.ies.dmt.ui.titlebar.a.a r5 = (com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a) r5
            r9.setOnTitleBarClickListener(r5)
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 != 0) goto L_0x0124
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0124:
            boolean r9 = r9.f59186h
            if (r9 != 0) goto L_0x013f
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            java.lang.String r5 = "baseI18nTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
            android.widget.ImageView r9 = r9.getEndBtn()
            java.lang.String r5 = "baseI18nTitleBar.endBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r5)
            r9.setVisibility(r4)
        L_0x013f:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 != 0) goto L_0x0146
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0146:
            java.lang.String r9 = r9.f59182d
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x015f
            android.view.View r9 = r7.mo44862a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            java.lang.String r3 = "baseI18nContentTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r3)
            r9.setVisibility(r4)
            goto L_0x0178
        L_0x015f:
            android.view.View r9 = r7.mo44862a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            java.lang.String r3 = "baseI18nContentTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r3)
            com.ss.android.ugc.aweme.account.login.v2.ui.a r3 = r7.f59207n
            if (r3 != 0) goto L_0x0171
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0171:
            java.lang.String r3 = r3.f59182d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r9.setText(r3)
        L_0x0178:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 != 0) goto L_0x017f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x017f:
            java.lang.String r9 = r9.f59183e
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x0198
            android.view.View r9 = r7.mo44862a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            java.lang.String r2 = "baseI18nContentDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            r9.setVisibility(r4)
            goto L_0x01b1
        L_0x0198:
            android.view.View r9 = r7.mo44862a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r9
            java.lang.String r2 = "baseI18nContentDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r2)
            com.ss.android.ugc.aweme.account.login.v2.ui.a r2 = r7.f59207n
            if (r2 != 0) goto L_0x01aa
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01aa:
            java.lang.String r2 = r2.f59183e
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9.setText(r2)
        L_0x01b1:
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            r9.mo19128a(r0)
        L_0x01ba:
            android.view.View r9 = r7.mo44862a(r1)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r9 = (com.bytedance.ies.dmt.p664ui.titlebar.NormalTitleBar) r9
            java.lang.String r1 = "baseI18nTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            int r9 = r9.getVisibility()
            r1 = 1
            if (r9 == r4) goto L_0x01e4
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 == 0) goto L_0x01e4
            boolean r9 = r9.f59186h
            if (r9 != r1) goto L_0x01e4
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 == 0) goto L_0x01db
            java.lang.String r9 = r9.f59185g
            goto L_0x01dc
        L_0x01db:
            r9 = 0
        L_0x01dc:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x01e5
        L_0x01e4:
            r0 = 1
        L_0x01e5:
            if (r0 == 0) goto L_0x0223
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 == 0) goto L_0x0209
            boolean r9 = r9.f59184f
            if (r9 != r1) goto L_0x0209
            com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper r9 = new com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper
            r0 = 2132020942(0x7f140ece, float:1.9680261E38)
            android.view.View r0 = r7.mo44862a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r2 = "login_root_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.view.View r0 = (android.view.View) r0
            r2 = r7
            android.support.v4.app.Fragment r2 = (android.support.p030v4.app.Fragment) r2
            r9.<init>(r0, r2)
            r7.f59205a = r9
        L_0x0209:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r9 = r7.f59207n
            if (r9 == 0) goto L_0x0222
            boolean r9 = r9.f59187i
            if (r9 != r1) goto L_0x0221
            boolean r9 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a.m54534a()
            if (r9 != 0) goto L_0x0221
            com.ss.android.ugc.aweme.account.login.v2.ui.a.b$b r9 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.b$b
            r9.<init>(r8)
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r8.setOnClickListener(r9)
        L_0x0221:
            return
        L_0x0222:
            return
        L_0x0223:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "请传pageName"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21868b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.b0o, viewGroup, false);
        if (inflate != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            linearLayout.addView(layoutInflater.inflate(mo45585i(), linearLayout, false));
            return linearLayout;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
