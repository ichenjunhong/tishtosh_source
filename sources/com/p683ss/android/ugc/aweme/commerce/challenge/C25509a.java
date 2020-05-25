package com.p683ss.android.ugc.aweme.commerce.challenge;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.bullet.p653ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p653ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p683ss.android.ugc.aweme.commercialize.profile.C26176a;
import com.p683ss.android.ugc.aweme.commercialize.profile.C26179b;
import com.p683ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.detail.C27336g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40270br;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a */
public final class C25509a extends C23526a implements C27336g, C40270br {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f67468a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25509a.class), "bulletActivityWrapper", "getBulletActivityWrapper()Lcom/bytedance/ies/bullet/ui/common/IBulletActivityWrapper;"))};

    /* renamed from: b */
    public final boolean f67469b = true;

    /* renamed from: c */
    public String f67470c;

    /* renamed from: d */
    public String f67471d;

    /* renamed from: e */
    private final Rect f67472e = new Rect();

    /* renamed from: j */
    private boolean f67473j = true;

    /* renamed from: k */
    private String f67474k;

    /* renamed from: l */
    private C26176a f67475l;

    /* renamed from: m */
    private C26179b f67476m;

    /* renamed from: n */
    private final C52668f f67477n = C52732g.m112286a(C52757k.NONE, new C25511b(this));

    /* renamed from: o */
    private HashMap f67478o;

    /* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a$a */
    public static final class C25510a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25509a f67479a;

        public C25510a(C25509a aVar) {
            this.f67479a = aVar;
        }

        public final void run() {
            this.f67479a.mo52132f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a$b */
    static final class C25511b extends C52712l implements C52670a<BulletActivityWrapper> {

        /* renamed from: a */
        final /* synthetic */ C25509a f67480a;

        C25511b(C25509a aVar) {
            this.f67480a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f67480a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity, "activity!!");
            return new BulletActivityWrapper(activity);
        }
    }

    /* renamed from: a */
    private View m62044a(int i) {
        if (this.f67478o == null) {
            this.f67478o = new HashMap();
        }
        View view = (View) this.f67478o.get(Integer.valueOf(R.id.caf));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.caf);
            this.f67478o.put(Integer.valueOf(R.id.caf), view);
        }
        return view;
    }

    /* renamed from: h */
    private final C10577d m62045h() {
        return (C10577d) this.f67477n.getValue();
    }

    /* renamed from: a_ */
    public final void mo50464a_(boolean z) {
    }

    /* renamed from: m */
    public final void mo50472m() {
    }

    /* renamed from: o */
    public final boolean mo50474o() {
        return this.f67473j;
    }

    /* renamed from: g */
    public final String mo52133g() {
        String str = this.f67470c;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public final CrossPlatformWebView mo52130a() {
        C26176a aVar = this.f67475l;
        if (aVar != null) {
            return aVar.f69129a;
        }
        return null;
    }

    /* renamed from: e */
    public final CommonBizWebView mo52131e() {
        C26179b bVar = this.f67476m;
        if (bVar != null) {
            return bVar.f69136a;
        }
        return null;
    }

    /* renamed from: k */
    public final void mo50470k() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        if (enterpriseRecyclerView != null) {
            C1332i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo4741e(0);
            }
        }
    }

    /* renamed from: l */
    public final View mo50471l() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        C52711k.m112236a((Object) enterpriseRecyclerView, "recycler_view");
        return enterpriseRecyclerView;
    }

    public final void onPause() {
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        if (enterpriseRecyclerView != null) {
            C1332i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (!(layoutManager == null || layoutManager.mo4736c(0) == null || !this.f67469b)) {
                C10577d h = m62045h();
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) activity, "activity!!");
                h.mo18672b(activity);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        if (enterpriseRecyclerView != null) {
            C1332i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (!(layoutManager == null || layoutManager.mo4736c(0) == null || !this.f67469b)) {
                C10577d h = m62045h();
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) activity, "activity!!");
                h.mo18671a(activity);
            }
        }
    }

    /* renamed from: f */
    public final void mo52132f() {
        String str;
        if (this.f67469b) {
            CommonBizWebView e = mo52131e();
            if (e != null && e.getGlobalVisibleRect(this.f67472e)) {
                CommonBizWebView e2 = mo52131e();
                if (e2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("height", C23728o.m58244b((double) this.f67472e.height()));
                    e2.mo50080a("brand_room_show", jSONObject);
                }
            }
        } else {
            CrossPlatformWebView a = mo52130a();
            if (a != null && a.getGlobalVisibleRect(this.f67472e)) {
                CrossPlatformWebView a2 = mo52130a();
                if (a2 != null) {
                    String str2 = "brand_room_show";
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", C23728o.m58244b((double) this.f67472e.height()));
                    CrossPlatformWebView a3 = mo52130a();
                    if (a3 != null) {
                        str = a3.getReactId();
                    } else {
                        str = null;
                    }
                    a2.mo55678a(str2, jSONObject2, str);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo50473n() {
        this.f67473j = false;
        String str = this.f67471d;
        if (str != null) {
            C37383a a = C37382g.m83707a(str);
            String str2 = "challenge_id";
            String str3 = this.f67474k;
            if (str3 == null) {
                str3 = "";
            }
            String uri = a.mo76659a(str2, str3).mo76658a().toString();
            C52711k.m112236a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
            if (this.f67469b) {
                C26179b bVar = this.f67476m;
                if (bVar != null) {
                    C52711k.m112240b(uri, "url");
                    bVar.f69137b = uri;
                }
                C26179b bVar2 = this.f67476m;
                if (bVar2 != null) {
                    bVar2.notifyDataSetChanged();
                }
            } else {
                C26176a aVar = this.f67475l;
                if (aVar != null) {
                    aVar.mo53806a(uri);
                }
                C26176a aVar2 = this.f67475l;
                if (aVar2 != null) {
                    aVar2.notifyDataSetChanged();
                }
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        if (enterpriseRecyclerView != null) {
            C1332i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = layoutManager.mo4736c(0);
                if (c != null) {
                    if (this.f67469b) {
                        C10577d h = m62045h();
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112236a((Object) activity, "activity!!");
                        h.mo18722f(activity);
                        if (c != null) {
                            ((BulletContainerView) c).mo18295a();
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView");
                        }
                    } else if (c != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c;
                        FragmentActivity activity2 = getActivity();
                        if (activity2 == null) {
                            C52711k.m112234a();
                        }
                        crossPlatformWebView.mo55690g(activity2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                    }
                }
            }
        }
        C47718bf.m103291d(this);
        if (this.f67478o != null) {
            this.f67478o.clear();
        }
    }

    /* renamed from: a */
    public final void mo50460a(String str) {
        this.f67474k = str;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onJsBroadcast(C29906l lVar) {
        Object obj;
        Object obj2;
        C52711k.m112240b(lVar, "broadCastEvent");
        boolean z = false;
        String str = null;
        if (this.f67469b) {
            String string = lVar.f78045b.getString("eventName");
            if (string != null) {
                if (C52711k.m112239a((Object) string, (Object) "brand_room_loaded")) {
                    CommonBizWebView e = mo52131e();
                    if (e != null) {
                        obj2 = e.getReactId();
                    } else {
                        obj2 = null;
                    }
                    if (C52711k.m112239a(obj2, (Object) lVar.f78045b.getString("reactId"))) {
                        CommonBizWebView e2 = mo52131e();
                        if (e2 != null && e2.getGlobalVisibleRect(this.f67472e)) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    string = null;
                }
                if (string != null) {
                    CommonBizWebView e3 = mo52131e();
                    if (e3 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("height", C23728o.m58244b((double) this.f67472e.height()));
                        e3.mo50080a("brand_room_show", jSONObject);
                    }
                }
            }
            return;
        }
        String string2 = lVar.f78045b.getString("eventName");
        if (string2 != null) {
            if (C52711k.m112239a((Object) string2, (Object) "brand_room_loaded")) {
                CrossPlatformWebView a = mo52130a();
                if (a != null) {
                    obj = a.getReactId();
                } else {
                    obj = null;
                }
                if (C52711k.m112239a(obj, (Object) lVar.f78045b.getString("reactId"))) {
                    CrossPlatformWebView a2 = mo52130a();
                    if (a2 != null && a2.getGlobalVisibleRect(this.f67472e)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                string2 = null;
            }
            if (string2 != null) {
                CrossPlatformWebView a3 = mo52130a();
                if (a3 != null) {
                    String str2 = "brand_room_show";
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", C23728o.m58244b((double) this.f67472e.height()));
                    CrossPlatformWebView a4 = mo52130a();
                    if (a4 != null) {
                        str = a4.getReactId();
                    }
                    a3.mo55678a(str2, jSONObject2, str);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ea A[RETURN] */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void top(com.p683ss.android.ugc.aweme.p1706fe.method.C29906l r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.google.gson.q r0 = new com.google.gson.q
            r0.<init>()
            org.json.JSONObject r6 = r6.f78045b
            java.lang.String r6 = r6.toString()
            com.google.gson.l r6 = r0.mo35029a(r6)
            java.lang.String r0 = "JsonParser().parse(event.params.toString())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.google.gson.o r6 = r6.mo35009m()
            java.lang.String r0 = "data"
            com.google.gson.l r0 = r6.mo35022b(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0071
            boolean r3 = r0.mo35008l()
            if (r3 == 0) goto L_0x002e
            goto L_0x0071
        L_0x002e:
            com.google.gson.o r0 = r0.mo35009m()
            java.lang.String r3 = "reactId"
            com.google.gson.l r0 = r0.mo35022b(r3)
            if (r0 == 0) goto L_0x0071
            boolean r3 = r0.mo35008l()
            if (r3 == 0) goto L_0x0041
            goto L_0x0071
        L_0x0041:
            boolean r3 = r5.f67469b
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = r0.mo34905c()
            com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView r3 = r5.mo52131e()
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = r3.getReactId()
            goto L_0x0055
        L_0x0054:
            r3 = r1
        L_0x0055:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            goto L_0x0072
        L_0x005a:
            java.lang.String r0 = r0.mo34905c()
            com.ss.android.ugc.aweme.commercialize.profile.a r3 = r5.f67475l
            if (r3 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r3.f69129a
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = r3.getReactId()
            goto L_0x006c
        L_0x006b:
            r3 = r1
        L_0x006c:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r0.booleanValue()
            if (r3 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            if (r0 == 0) goto L_0x00ea
            r0.booleanValue()
            java.lang.String r0 = "eventName"
            com.google.gson.l r6 = r6.mo35022b(r0)
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = r6.mo34905c()
            if (r6 == 0) goto L_0x00e9
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            r3 = 1
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "mp_tab_top_left"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r0 = 0
            goto L_0x00a6
        L_0x00a5:
            r0 = 1
        L_0x00a6:
            if (r0 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = r1
        L_0x00aa:
            if (r6 == 0) goto L_0x00e9
            int r0 = r6.hashCode()
            r1 = -917484739(0xffffffffc9504b3d, float:-853171.8)
            r4 = 2132022173(0x7f14139d, float:1.9682758E38)
            if (r0 == r1) goto L_0x00d3
            r1 = -853202121(0xffffffffcd252b37, float:-1.73192048E8)
            if (r0 == r1) goto L_0x00be
            goto L_0x00e8
        L_0x00be:
            java.lang.String r0 = "mp_tab_top_left"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00e8
            android.view.View r6 = r5.m62044a(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p683ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.d r6 = r6.getEnterTabManager()
            r6.f69149a = r2
            goto L_0x00e8
        L_0x00d3:
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00e8
            android.view.View r6 = r5.m62044a(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p683ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.d r6 = r6.getEnterTabManager()
            r6.f69149a = r3
            goto L_0x00e9
        L_0x00e8:
            return
        L_0x00e9:
            return
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.challenge.C25509a.top(com.ss.android.ugc.aweme.fe.method.l):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        C52711k.m112236a((Object) enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new CommerceChallengeFragment$onViewCreated$1(this, getActivity(), 0, false));
        if (this.f67469b) {
            this.f67476m = new C26179b(this, null, false, m62045h());
            EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
            C52711k.m112236a((Object) enterpriseRecyclerView2, "recycler_view");
            enterpriseRecyclerView2.setAdapter(this.f67476m);
            return;
        }
        this.f67475l = new C26176a(this, null, false, false);
        EnterpriseRecyclerView enterpriseRecyclerView3 = (EnterpriseRecyclerView) m62044a((int) R.id.caf);
        C52711k.m112236a((Object) enterpriseRecyclerView3, "recycler_view");
        enterpriseRecyclerView3.setAdapter(this.f67475l);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C47718bf.m103290c(this);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        return LayoutInflater.from(activity).inflate(R.layout.nh, null);
    }
}
