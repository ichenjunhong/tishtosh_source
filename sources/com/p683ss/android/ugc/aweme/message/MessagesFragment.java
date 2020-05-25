package com.p683ss.android.ugc.aweme.message;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.experiment.EnableGroupChatExperiment;
import com.p683ss.android.ugc.aweme.experiment.IMNotificationTabSylteExperiment;
import com.p683ss.android.ugc.aweme.main.service.C36691l;
import com.p683ss.android.ugc.aweme.message.p1948a.C36777a;
import com.p683ss.android.ugc.aweme.message.widget.PagerIndicator;
import com.p683ss.android.ugc.aweme.message.widget.PagerIndicator.C36791b;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35437a;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.message.MessagesFragment */
public class MessagesFragment extends C23526a implements C36791b {

    /* renamed from: a */
    public C36777a f93972a;

    /* renamed from: b */
    C10660a f93973b;

    /* renamed from: c */
    private View f93974c;

    /* renamed from: d */
    private C1690c f93975d;

    /* renamed from: e */
    private int f93976e = 1;

    /* renamed from: j */
    private AnalysisStayTimeFragmentComponent f93977j;
    ImageView mAddFriendIv;
    View mStatusBarView;
    TextView mTvNoticeAdd;
    RtlViewPager mViewPager;
    PagerIndicator pagerIndicator;

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("message");
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f93973b != null) {
            this.f93973b.mo19001b();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f93973b != null) {
            this.f93973b.dismiss();
        }
    }

    public void addFriendViewClick() {
        String str;
        String str2;
        String str3 = "find_friends";
        C23089d a = C23089d.m56640a();
        String str4 = "enter_from";
        if (this.f93976e == 1) {
            str = "message_tab";
        } else {
            str = "contact_tab";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str).f61491a);
        if (getContext() != null) {
            Context context = getContext();
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            Context context2 = getContext();
            String str5 = "";
            if (this.f93976e == 1) {
                str2 = "message_tab";
            } else {
                str2 = "contact_tab";
            }
            context.startActivity(bridgeService_Monster.getAddFriendsActivityIntent(context2, -1, 4, str5, str2));
        }
    }

    public void noticeViewClick() {
        IIMService a = C33194e.m76277a(false);
        if (a != null) {
            new Bundle().putString("key_enter_method", "corner_entry");
            a.startRelationListActivity(getActivity(), "corner_entry");
            if (EnableGroupChatExperiment.m69587a()) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_method", "corner_entry");
                C26890h.m65011a("create_chat_click", (Map<String, String>) hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enter_from", "message");
            hashMap2.put("enter_method", "click_contact_button");
            C26890h.m65011a("enter_contact_list", (Map<String, String>) hashMap2);
            C26890h.onEvent(MobClick.obtain().setEventName("create_chat").setLabelName("message"));
        }
    }

    public void onCreate(Bundle bundle) {
        C33194e.m76279d();
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo75922a(int i) {
        if (i == 0) {
            C35437a aVar = (C35437a) this.f93972a.mo75926c(1);
            if (aVar != null && this.f93976e == 0) {
                aVar.mo72687g();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            ((C36691l) C20842a.m53148a(C36691l.class)).mo47885b("NOTICE");
            if (this.f93975d == null || this.f93975d.isDisposed()) {
                this.f93975d = C20854a.m53162b().canShowOneKeyBindHalfScreen("message_tab").mo6152a((C1710e<? super T>) new C36778b<Object>(this), C36785c.f94013a);
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            if (!(this.f93972a == null || this.f93972a.getCount() == 0 || this.pagerIndicator == null)) {
                Fragment c = this.f93972a.mo75926c(0);
                if (c instanceof C38044a) {
                    ((C38044a) c).mo77570d();
                }
                if (this.f93973b != null) {
                    this.f93973b.dismiss();
                }
            }
        } else if (!(this.f93972a == null || this.f93972a.getCount() == 0 || this.pagerIndicator == null)) {
            this.pagerIndicator.mo75964a(this.f93972a.getCount());
            Fragment c2 = this.f93972a.mo75926c(0);
            if (c2 instanceof C38044a) {
                ((C38044a) c2).mo77569c();
            }
        }
        if (this.f93977j != null) {
            this.f93977j.mo48652a(z);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        C38446k.m85764a(this.mTvNoticeAdd);
        if (!C33194e.m76264a() || !IMNotificationTabSylteExperiment.m69598a() || C33194e.m76277a(false) == null) {
            z = false;
        } else {
            z = true;
        }
        this.f93972a = new C36777a(getChildFragmentManager(), z);
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getContext().getResources().getString(R.string.bg4));
            this.pagerIndicator.setSelectCallBack(this);
            this.mAddFriendIv.setVisibility(0);
        } else {
            this.mAddFriendIv.setVisibility(8);
            this.mTvNoticeAdd.setText(R.string.bg4);
            IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
            if (provideIMService_Monster == null || !provideIMService_Monster.isImReduction()) {
                this.mTvNoticeAdd.setVisibility(0);
            } else {
                this.mTvNoticeAdd.setVisibility(8);
            }
        }
        if (C47915gg.m103651b()) {
            this.mTvNoticeAdd.setVisibility(8);
        }
        arrayList.add(C11010c.m22280a().getResources().getString(R.string.cj3));
        this.mViewPager.setAdapter(this.f93972a);
        this.pagerIndicator.setTabItems(arrayList);
        PagerIndicator pagerIndicator2 = this.pagerIndicator;
        RtlViewPager rtlViewPager = this.mViewPager;
        int count = this.f93972a.getCount() - 1;
        pagerIndicator2.f94020f = rtlViewPager;
        rtlViewPager.addOnPageChangeListener(pagerIndicator2.f94022h);
        rtlViewPager.setCurrentItem(count);
        this.f93977j = new AnalysisStayTimeFragmentComponent(this, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
        }
    }

    /* renamed from: a */
    public final void mo75923a(int i, boolean z) {
        String str;
        String str2;
        String str3;
        C23089d dVar;
        String str4;
        C35437a aVar = (C35437a) this.f93972a.mo75926c(1);
        this.f93976e = i;
        if (aVar != null) {
            if (i == 0) {
                str2 = "enter_contact_list";
                C23089d a = C23089d.m56640a();
                String str5 = "enter_method";
                if (z) {
                    str4 = "slide_right";
                } else {
                    str4 = "click_contact_tab";
                }
                dVar = a.mo47829a(str5, str4);
                str = "message";
                str3 = "enter_from";
            } else {
                aVar.mo72688h();
                str2 = "enter_message_tab";
                dVar = C23089d.m56640a();
                str3 = "enter_method";
                if (z) {
                    str = "slide_right";
                } else {
                    str = "click_message_tab";
                }
            }
            C26890h.m65011a(str2, dVar.mo47829a(str3, str).f61491a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f93974c = layoutInflater.inflate(R.layout.oe, viewGroup, false);
        return this.f93974c;
    }
}
