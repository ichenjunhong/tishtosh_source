package com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.setting.Divider;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.C33205o;
import com.p683ss.android.ugc.aweme.p1807im.IMInnerNotificationExperiment;
import com.p683ss.android.ugc.aweme.setting.p2132ab.InAppPushLiveExperiment;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41629b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import com.p683ss.android.ugc.aweme.setting.services.C41712a;
import com.p683ss.android.ugc.aweme.setting.services.C41714c;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47819dn;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion */
public class PushSettingManagerFragmentSecondVersion extends C23526a implements C41692a, C41693b {

    /* renamed from: a */
    C41700e f105543a;

    /* renamed from: b */
    PackageManager f105544b;
    ImageView backBtn;

    /* renamed from: c */
    JSONObject f105545c;

    /* renamed from: d */
    private List<CommonItemView> f105546d = new ArrayList();

    /* renamed from: e */
    private C2180b f105547e;
    Divider interactionDivider;
    Divider interactionDividerWithoutLine;
    CommonItemView itemInnerPushIm;
    CommonItemView itemInnerPushLive;
    CommonItemView itemOther;
    CommonItemView itemOuterPushIm;
    CommonItemView itemPushComment;
    CommonItemView itemPushDig;
    CommonItemView itemPushFollow;
    CommonItemView itemPushFollowNewVideo;
    CommonItemView itemPushLive;
    CommonItemView itemPushMain;
    CommonItemView itemPushMention;
    CommonItemView itemPushRecommendVideo;

    /* renamed from: j */
    private List<String> f105548j;

    /* renamed from: k */
    private NotificationManager f105549k;

    /* renamed from: l */
    private Keva f105550l = null;
    Divider liveDivider;
    LinearLayout mPushItemParent;
    TextView mTitle;
    Divider messageDivider;
    Divider otherDivider;
    Divider pushDivider;

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion$a */
    public static class C41707a {

        /* renamed from: a */
        public String f105554a;

        /* renamed from: b */
        public boolean f105555b;

        /* renamed from: c */
        public boolean f105556c;

        /* renamed from: a */
        public final boolean mo85547a() {
            if (!this.f105555b || !this.f105556c) {
                return false;
            }
            return true;
        }

        public C41707a(String str) {
            this.f105554a = str;
        }
    }

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    /* renamed from: g */
    public final void mo55287g() {
    }

    /* renamed from: a */
    public final Keva mo85541a() {
        if (this.f105550l == null) {
            this.f105550l = Keva.getRepo("need_sync");
        }
        return this.f105550l;
    }

    /* renamed from: l */
    public final void mo55288l() {
        C10691a.m21542b(C11010c.m22280a(), (int) R.string.cfw).mo19066a();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f105543a.mo46991S_();
    }

    /* renamed from: e */
    public final C2180b mo85543e() {
        if (this.f105547e == null) {
            this.f105547e = C2180b.m6534l();
            this.f105547e.mo6534c(400, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C41711b<Object>(this));
        }
        return this.f105547e;
    }

    /* renamed from: f */
    private void m91578f() {
        boolean z;
        String string = mo85541a().getString("need_sync_channel_name", "");
        StringBuilder sb = new StringBuilder("1: ");
        sb.append(string);
        sb.append(" v ");
        if (this.f105545c != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.f105545c != null && !TextUtils.isEmpty(string) && mo85542a(string)) {
            CommonItemView b = m91577b(string);
            if (b != null) {
                C41707a aVar = (C41707a) b.getTag();
                if (aVar != null && !aVar.f105555b) {
                    b.setChecked(true);
                    aVar.f105555b = true;
                    try {
                        this.f105545c.put(aVar.f105554a, aVar.f105555b ? 1 : 0);
                    } catch (JSONException unused) {
                    }
                    mo85543e().onNext(b);
                }
            }
            mo85541a().storeString("need_sync_channel_name", "");
        }
    }

    /* renamed from: h */
    private void m91579h() {
        String str;
        boolean a = C47818dm.m103457a(getContext());
        if (a) {
            str = getString(R.string.dh4);
        } else {
            str = getString(R.string.dh3);
        }
        if (a) {
            this.itemPushMain.setVisibility(8);
            this.interactionDivider.setVisibility(8);
            this.interactionDividerWithoutLine.setVisibility(0);
        } else {
            m91576a(a);
            this.itemPushMain.setVisibility(0);
            this.interactionDivider.setVisibility(0);
            this.interactionDividerWithoutLine.setVisibility(8);
        }
        this.itemPushMain.setRightText(str);
    }

    public void onResume() {
        float f;
        super.onResume();
        m91579h();
        if (C47818dm.m103457a(getContext())) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        m91573a(this.itemPushDig, f);
        m91573a(this.itemPushComment, f);
        m91573a(this.itemPushFollow, f);
        m91573a(this.itemPushMention, f);
        m91573a(this.itemPushFollowNewVideo, f);
        m91573a(this.itemPushRecommendVideo, f);
        m91573a(this.itemPushLive, f);
        m91573a(this.itemOuterPushIm, f);
        m91573a(this.itemOther, f);
        if (this.f105545c != null) {
            for (CommonItemView commonItemView : this.f105546d) {
                try {
                    m91574a(commonItemView, this.f105545c.getInt(((C41707a) commonItemView.getTag()).f105554a));
                } catch (JSONException unused) {
                }
            }
        }
        m91578f();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ik && getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: b */
    private CommonItemView m91577b(String str) {
        for (CommonItemView commonItemView : this.f105546d) {
            C41707a aVar = (C41707a) commonItemView.getTag();
            if (aVar != null && TextUtils.equals(str, aVar.f105554a)) {
                return commonItemView;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m91576a(boolean z) {
        String str;
        String str2 = "notifications_show";
        C23089d a = C23089d.m56640a();
        String str3 = "status";
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        try {
            this.f105545c = new JSONObject(C47760cd.m103385a(cVar));
        } catch (JSONException unused) {
        }
        m91574a(this.itemPushDig, cVar.f105484a);
        m91574a(this.itemPushComment, cVar.f105486b);
        m91574a(this.itemPushFollow, cVar.f105487c);
        m91574a(this.itemPushMention, cVar.f105488d);
        m91574a(this.itemPushFollowNewVideo, cVar.f105491g);
        m91574a(this.itemPushRecommendVideo, cVar.f105492h);
        m91574a(this.itemPushLive, cVar.f105493i);
        m91574a(this.itemOuterPushIm, cVar.f105496l);
        m91574a(this.itemOther, cVar.f105497m);
        m91574a(this.itemInnerPushLive, cVar.f105495k);
        C23794bh.m58385K().setLiveInnerPushOpen(Integer.valueOf(cVar.f105495k));
        if (C10181b.m20511a().mo18168a(IMInnerNotificationExperiment.class, true, "im_inner_push_strategy", 31744, 0) != 0) {
            m91574a(this.itemInnerPushIm, cVar.f105498n);
            C23794bh.m58385K().setImInnerPushOpen(Integer.valueOf(cVar.f105498n));
        }
        C41714c.f105571a.updateCurrentSetting(cVar);
        m91578f();
    }

    /* renamed from: a */
    public final boolean mo85542a(String str) {
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = this.f105549k.getNotificationChannel(str);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m91573a(CommonItemView commonItemView, float f) {
        View findViewById = commonItemView.findViewById(R.id.cct);
        if (findViewById != null) {
            findViewById.setAlpha(f);
        }
        if (commonItemView != null) {
            commonItemView.setAlpha(f);
        }
    }

    /* renamed from: a */
    private void m91574a(CommonItemView commonItemView, int i) {
        C41707a aVar = (C41707a) commonItemView.getTag();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        aVar.f105555b = z;
        aVar.f105556c = mo85542a(aVar.f105554a);
        commonItemView.setChecked(aVar.mo85547a());
    }

    /* renamed from: a */
    private void m91575a(final CommonItemView commonItemView, String str) {
        commonItemView.setTag(new C41707a(str));
        commonItemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                boolean z;
                String str2;
                String str3;
                ClickInstrumentation.onClick(view);
                if (PushSettingManagerFragmentSecondVersion.this.isViewValid() && PushSettingManagerFragmentSecondVersion.this.getContext() != null) {
                    C41707a aVar = (C41707a) commonItemView.getTag();
                    String str4 = aVar.f105554a;
                    if (TextUtils.equals(str4, "live_inner_push")) {
                        if (commonItemView.mo19040c()) {
                            str3 = "off";
                        } else {
                            str3 = "on";
                        }
                        C33205o.m76301d(str3);
                        C23794bh.m58385K().setLiveInnerPushOpen(Integer.valueOf(commonItemView.mo19040c() ^ true ? 1 : 0));
                    } else if (TextUtils.equals(str4, "im_inner_push")) {
                        if (commonItemView.mo19040c()) {
                            str2 = "off";
                        } else {
                            str2 = "on";
                        }
                        C33205o.m76300c(str2);
                        C23794bh.m58385K().setImInnerPushOpen(Integer.valueOf(commonItemView.mo19040c() ^ true ? 1 : 0));
                    } else {
                        PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = PushSettingManagerFragmentSecondVersion.this;
                        if (C47818dm.m103457a(pushSettingManagerFragmentSecondVersion.getContext())) {
                            z = true;
                        } else {
                            C47819dn.m103465a(pushSettingManagerFragmentSecondVersion.getContext(), true, true);
                            z = false;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    if (VERSION.SDK_INT < 26 || PushSettingManagerFragmentSecondVersion.this.mo85542a(str4)) {
                        boolean z2 = !commonItemView.mo19040c();
                        commonItemView.setChecked(z2);
                        aVar.f105555b = z2;
                        PushSettingManagerFragmentSecondVersion.this.mo85543e().onNext(commonItemView);
                        if (z2) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        C26890h.m65011a("notification_switch", C23089d.m56640a().mo47829a("label", str4).mo47829a("to_status", str).f61491a);
                        return;
                    }
                    if (!aVar.f105555b && !aVar.f105556c) {
                        PushSettingManagerFragmentSecondVersion.this.mo85541a().storeString("need_sync_channel_name", str4);
                    }
                    PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion2 = PushSettingManagerFragmentSecondVersion.this;
                    if (VERSION.SDK_INT >= 26) {
                        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent.setFlags(268435456);
                        intent.putExtra("android.provider.extra.APP_PACKAGE", C11010c.m22280a().getPackageName());
                        intent.putExtra("android.provider.extra.CHANNEL_ID", str4);
                        if (pushSettingManagerFragmentSecondVersion2.f105544b == null) {
                            pushSettingManagerFragmentSecondVersion2.f105544b = C11010c.m22280a().getPackageManager();
                        }
                        if (pushSettingManagerFragmentSecondVersion2.f105544b.resolveActivity(intent, 65536) != null) {
                            pushSettingManagerFragmentSecondVersion2.startActivity(intent);
                        }
                    }
                }
            }
        });
        this.f105546d.add(commonItemView);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f105549k = (NotificationManager) C11010c.m22280a().getSystemService("notification");
        this.mTitle.setText(R.string.df6);
        this.itemPushMain.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                try {
                    C47818dm.m103459b(PushSettingManagerFragmentSecondVersion.this.getContext());
                } catch (Exception unused) {
                    PushSettingManagerFragmentSecondVersion.this.getContext().startActivity(new Intent("android.settings.SETTINGS"));
                }
                String str2 = "notifications_click";
                C23089d a = C23089d.m56640a();
                String str3 = "status";
                if (C47818dm.m103457a(PushSettingManagerFragmentSecondVersion.this.getContext())) {
                    str = "on";
                } else {
                    str = "off";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
            }
        });
        m91579h();
        m91575a(this.itemPushDig, "digg_push");
        m91575a(this.itemPushComment, "comment_push");
        m91575a(this.itemPushFollow, "follow_push");
        m91575a(this.itemPushMention, "mention_push");
        m91575a(this.itemPushFollowNewVideo, "follow_new_video_push");
        m91575a(this.itemPushRecommendVideo, "recommend_video_push");
        m91575a(this.itemPushLive, "live_push");
        m91575a(this.itemOuterPushIm, "im_push");
        m91575a(this.itemOther, "other_channel");
        m91575a(this.itemInnerPushLive, "live_inner_push");
        if (C10181b.m20511a().mo18168a(IMInnerNotificationExperiment.class, true, "im_inner_push_strategy", 31744, 0) == 0) {
            this.itemOuterPushIm.setLeftText(C11010c.m22280a().getResources().getString(R.string.d1o));
            this.itemPushLive.setLeftText(C11010c.m22280a().getResources().getString(R.string.d1w));
            this.itemInnerPushIm.setVisibility(8);
        } else {
            this.itemOuterPushIm.setLeftText(C11010c.m22280a().getResources().getString(R.string.a1s));
            this.itemPushLive.setLeftText(C11010c.m22280a().getResources().getString(R.string.a1t));
            m91575a(this.itemInnerPushIm, "im_inner_push");
            this.itemInnerPushIm.setVisibility(0);
        }
        this.itemInnerPushIm.setVisibility(8);
        if (InAppPushLiveExperiment.m91346a()) {
            this.itemInnerPushLive.setVisibility(0);
        } else {
            this.itemInnerPushLive.setVisibility(8);
        }
        if (this.f105548j == null) {
            this.f105548j = C41712a.f105567a.itemListForPushSetting();
        }
        if (this.f105548j != null) {
            C41629b.m91504a(this.mPushItemParent, this.f105548j);
            this.messageDivider.setVisibility(8);
            this.pushDivider.setVisibility(8);
            this.liveDivider.setVisibility(8);
        }
        this.f105543a = new C41700e();
        this.f105543a.mo54800a(this);
        this.f105543a.mo44934a_(new Object[0]);
        this.mTitle.setText(R.string.dgt);
        this.itemPushMain.setLeftText(getContext().getString(R.string.dgt));
        this.interactionDivider.getTxtLeft().setText(R.string.dgx);
        this.interactionDivider.setVisibility(8);
        this.interactionDividerWithoutLine.getTxtLeft().setText(R.string.dgx);
        this.interactionDividerWithoutLine.setVisibility(0);
        this.itemPushDig.setLeftText(getContext().getString(R.string.dgy));
        this.itemPushComment.setLeftText(getContext().getString(R.string.dgu));
        this.itemPushFollow.setLeftText(getContext().getString(R.string.dgw));
        this.itemPushMention.setLeftText(getContext().getString(R.string.dh1));
        this.messageDivider.getTxtLeft().setText(R.string.dh2);
        this.itemOuterPushIm.setLeftText(getContext().getString(R.string.dgv));
        this.pushDivider.getTxtLeft().setText(R.string.dh9);
        this.itemPushFollowNewVideo.setLeftText(getContext().getString(R.string.dh_));
        this.itemPushRecommendVideo.setLeftText(getContext().getString(R.string.dha));
        this.liveDivider.getTxtLeft().setText(R.string.dgz);
        this.itemPushLive.setLeftText(getContext().getString(R.string.dh0));
        this.itemInnerPushLive.setLeftText(getContext().getString(R.string.fm3));
        this.otherDivider.getTxtLeft().setText(R.string.hik);
        if (!C10181b.m20511a().mo18172a(OtherPushSettingsExperiment.class, true, "enable_other_push_settings", 31744, false)) {
            this.otherDivider.setVisibility(8);
            this.itemOther.setVisibility(8);
            return;
        }
        this.otherDivider.setVisibility(0);
        this.itemOther.setVisibility(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bu7, viewGroup, false);
    }
}
