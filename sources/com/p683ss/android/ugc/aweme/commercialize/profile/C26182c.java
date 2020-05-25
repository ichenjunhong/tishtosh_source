package com.p683ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.p1714a.C29979a;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22396a;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.c */
public final class C26182c extends C40321dd {

    /* renamed from: a */
    public User f69143a;

    /* renamed from: b */
    public boolean f69144b;

    /* renamed from: c */
    private C26176a f69145c;

    /* renamed from: d */
    private String f69146d;

    /* renamed from: e */
    private Aweme f69147e;

    /* renamed from: j */
    private HashMap f69148j;

    /* renamed from: a */
    private View m63482a(int i) {
        if (this.f69148j == null) {
            this.f69148j = new HashMap();
        }
        View view = (View) this.f69148j.get(Integer.valueOf(R.id.caf));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.caf);
            this.f69148j.put(Integer.valueOf(R.id.caf), view);
        }
        return view;
    }

    public final boolean aT_() {
        return true;
    }

    /* renamed from: l */
    public final View mo50471l() {
        return (EnterpriseRecyclerView) m63482a(R.id.caf);
    }

    public final void aX_() {
        AwemeRawAd awemeRawAd;
        if (getUserVisibleHint() && getActivity() != null && C26503d.m64064g(this.f69147e)) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            Context context = activity;
            String str = "homepage_ad";
            String str2 = "businesstab_show";
            JSONObject a = C29979a.m70135a((Context) getActivity(), this.f69147e, "");
            Aweme aweme = this.f69147e;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C29979a.m70145a(context, str, str2, a, awemeRawAd);
        }
    }

    public final void aV_() {
        User user = this.f69143a;
        String str = (String) SharePrefCache.inst().getMpTab().mo47782d();
        C52711k.m112236a((Object) str, "EnterpriseUtils.getEnterpriseTabUrl(user)");
        C37383a a = C37382g.m83707a(str);
        String c = C47865ew.m103536a().mo95083c(this.f69146d);
        String str2 = "mp_user_id";
        String str3 = this.f69146d;
        if (str3 == null) {
            str3 = "";
        }
        a.mo76659a(str2, str3);
        if (!TextUtils.isEmpty(c)) {
            String str4 = "mp_sec_uid";
            if (c == null) {
                C52711k.m112234a();
            }
            a.mo76659a(str4, c);
        }
        String uri = a.mo76658a().toString();
        C52711k.m112236a((Object) uri, "urlBuilder.build().toString()");
        C26176a aVar = this.f69145c;
        if (aVar != null) {
            aVar.mo53806a(uri);
        }
        C26176a aVar2 = this.f69145c;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m63482a(R.id.caf);
        if (enterpriseRecyclerView != null) {
            C1332i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = layoutManager.mo4736c(0);
                if (c != null) {
                    if (c != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        crossPlatformWebView.mo55690g(activity);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                    }
                }
            }
        }
        C47718bf.m103291d(this);
        if (this.f69148j != null) {
            this.f69148j.clear();
        }
    }

    /* renamed from: e */
    public final Bundle mo53811e() {
        boolean z;
        Bundle bundle = new Bundle();
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        long j = 0;
        if (createIAdServicebyMonsterPlugin != null) {
            C22396a latestRecommendFeedAdInfo = createIAdServicebyMonsterPlugin.getLatestRecommendFeedAdInfo();
            if (latestRecommendFeedAdInfo != null) {
                String str = "ad_id";
                Long l = latestRecommendFeedAdInfo.f60319a;
                if (l != null) {
                    j = l.longValue();
                }
                bundle.putLong(str, j);
                bundle.putString("bundle_download_app_log_extra", latestRecommendFeedAdInfo.f60320b);
                return bundle;
            }
        }
        Aweme aweme = this.f69147e;
        if (aweme != null) {
            z = aweme.isAd();
        } else {
            z = false;
        }
        if (!z) {
            return bundle;
        }
        Aweme aweme2 = this.f69147e;
        if (aweme2 == null) {
            C52711k.m112234a();
        }
        AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
        if (awemeRawAd == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) awemeRawAd, "aweme!!.awemeRawAd!!");
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null || creativeId.longValue() != 0) {
            Long creativeId2 = awemeRawAd.getCreativeId();
            C52711k.m112236a((Object) creativeId2, "awemeRawAd.creativeId");
            bundle.putLong("ad_id", creativeId2.longValue());
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("aweme_creative_id", String.valueOf(awemeRawAd.getCreativeId().longValue()));
            bundle.putString("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
        }
        if (!TextUtils.isEmpty(awemeRawAd.getDownloadUrl())) {
            bundle.putString("bundle_download_url", awemeRawAd.getDownloadUrl());
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1 A[RETURN] */
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
            if (r0 == 0) goto L_0x0058
            boolean r3 = r0.mo35008l()
            if (r3 == 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            com.google.gson.o r0 = r0.mo35009m()
            java.lang.String r3 = "reactId"
            com.google.gson.l r0 = r0.mo35022b(r3)
            if (r0 == 0) goto L_0x0058
            boolean r3 = r0.mo35008l()
            if (r3 == 0) goto L_0x0041
            goto L_0x0058
        L_0x0041:
            java.lang.String r0 = r0.mo34905c()
            com.ss.android.ugc.aweme.commercialize.profile.a r3 = r5.f69145c
            if (r3 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r3.f69129a
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r3.getReactId()
            goto L_0x0053
        L_0x0052:
            r3 = r1
        L_0x0053:
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r0.booleanValue()
            if (r3 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            if (r0 == 0) goto L_0x00d1
            r0.booleanValue()
            java.lang.String r0 = "eventName"
            com.google.gson.l r6 = r6.mo35022b(r0)
            if (r6 == 0) goto L_0x00d0
            java.lang.String r6 = r6.mo34905c()
            if (r6 == 0) goto L_0x00d0
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            r3 = 1
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "mp_tab_top_left"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r0)
            if (r0 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r0 = 0
            goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r6 = r1
        L_0x0091:
            if (r6 == 0) goto L_0x00d0
            int r0 = r6.hashCode()
            r1 = -917484739(0xffffffffc9504b3d, float:-853171.8)
            r4 = 2132022173(0x7f14139d, float:1.9682758E38)
            if (r0 == r1) goto L_0x00ba
            r1 = -853202121(0xffffffffcd252b37, float:-1.73192048E8)
            if (r0 == r1) goto L_0x00a5
            goto L_0x00cf
        L_0x00a5:
            java.lang.String r0 = "mp_tab_top_left"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m63482a(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p683ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.d r6 = r6.getEnterTabManager()
            r6.f69149a = r2
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m63482a(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p683ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.d r6 = r6.getEnterTabManager()
            r6.f69149a = r3
            goto L_0x00d0
        L_0x00cf:
            return
        L_0x00d0:
            return
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.profile.C26182c.top(com.ss.android.ugc.aweme.fe.method.l):void");
    }

    /* renamed from: a */
    public final void mo53807a(String str, String str2) {
        super.mo53807a(str, str2);
        this.f69146d = str;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m63482a(R.id.caf);
        C52711k.m112236a((Object) enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new EnterpriseTabFragment$onViewCreated$1(this, getActivity(), 0, false));
        this.f69145c = new C26176a(this, null, this.f69144b, true);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) m63482a(R.id.caf);
        C52711k.m112236a((Object) enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.f69145c);
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
