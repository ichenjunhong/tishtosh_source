package com.p683ss.android.ugc.aweme.shortvideo.publish;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.setting.C41538an;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45386aj.C45387a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h */
public final class C44378h {

    /* renamed from: h */
    public static final C44379a f112285h = new C44379a(null);

    /* renamed from: a */
    public boolean f112286a = true;

    /* renamed from: b */
    public boolean f112287b;

    /* renamed from: c */
    public boolean f112288c;

    /* renamed from: d */
    public CommonItemView f112289d;

    /* renamed from: e */
    public final boolean f112290e;

    /* renamed from: f */
    public final Fragment f112291f;

    /* renamed from: g */
    public final int f112292g = 5;

    /* renamed from: i */
    private boolean f112293i;

    /* renamed from: j */
    private View f112294j;

    /* renamed from: k */
    private final boolean f112295k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h$a */
    public static final class C44379a {
        private C44379a() {
        }

        /* renamed from: a */
        public static boolean m97189a() {
            Boolean bool;
            if (!C40797m.m90260o()) {
                return false;
            }
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                bool = b.getSilentShareConfigurable();
                C52711k.m112236a((Object) bool, "SettingsReader.get().silentShareConfigurable");
            } catch (C10174a unused) {
                bool = Boolean.valueOf(true);
            }
            return bool.booleanValue();
        }

        public /* synthetic */ C44379a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h$b */
    static final class C44380b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44378h f112296a;

        /* renamed from: b */
        final /* synthetic */ LinearLayout f112297b;

        C44380b(C44378h hVar, LinearLayout linearLayout) {
            this.f112296a = hVar;
            this.f112297b = linearLayout;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C44378h.m97178b()) {
                C10691a.m21538a(this.f112297b.getContext(), this.f112297b.getContext().getString(R.string.d_k), 0).mo19066a();
                return;
            }
            CommonItemView commonItemView = this.f112296a.f112289d;
            if (commonItemView != null) {
                commonItemView.setChecked(!commonItemView.mo19040c());
                C39618d.f101174o.mo74241c().mo74246a(Boolean.valueOf(commonItemView.mo19040c()));
                if (commonItemView.mo19040c()) {
                    C23763a.m58315a().mo49224a(commonItemView.getContext(), "CheckDownload");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h$c */
    static final class C44381c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44378h f112298a;

        /* renamed from: b */
        final /* synthetic */ boolean f112299b;

        /* renamed from: c */
        final /* synthetic */ String f112300c;

        /* renamed from: d */
        final /* synthetic */ HashMap f112301d;

        C44381c(C44378h hVar, boolean z, String str, HashMap hashMap) {
            this.f112298a = hVar;
            this.f112299b = z;
            this.f112300c = str;
            this.f112301d = hashMap;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Fragment fragment = this.f112298a.f112291f;
            Intent intent = new Intent(this.f112298a.f112291f.getContext(), PublishPrivacySettingActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("comment_item_checked", this.f112298a.f112286a);
            bundle.putBoolean("react_duet_item_checked", this.f112298a.f112287b);
            bundle.putBoolean("download_item_checked", this.f112298a.f112288c);
            bundle.putBoolean("can_react_duet", this.f112299b);
            bundle.putString("creation_id", this.f112300c);
            bundle.putSerializable("mob_data", this.f112301d);
            intent.putExtras(bundle);
            fragment.startActivityForResult(intent, this.f112298a.f112292g);
            C26890h.m65011a("click_advanced_settings", C23089d.m56640a().mo47829a("creation_id", this.f112300c).mo47829a("enter_from", "video_post_page").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h$d */
    static final class C44382d<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C44382d f112302a = new C44382d();

        C44382d() {
        }

        public final /* synthetic */ Object call() {
            C39527aa aaVar = C39618d.f101183x;
            return aaVar.mo74275a(aaVar.mo74283c(), C39618d.f101183x.mo74284d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h$e */
    static final class C44383e<TTaskResult, TContinuationResult> implements C0011g<C22055c, Object> {

        /* renamed from: a */
        final /* synthetic */ C44378h f112303a;

        C44383e(C44378h hVar) {
            this.f112303a = hVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            C22055c cVar = (C22055c) iVar.mo34e();
            if (cVar != null) {
                if (this.f112303a.f112288c && (!cVar.mo46167k() || !cVar.mo46168l())) {
                    this.f112303a.f112288c = false;
                }
                C44387k.f112321a = cVar.mo46167k();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.h$f */
    static final class C44384f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f112304a;

        /* renamed from: b */
        final /* synthetic */ String f112305b;

        /* renamed from: c */
        final /* synthetic */ HashMap f112306c;

        C44384f(CommonItemView commonItemView, String str, HashMap hashMap) {
            this.f112304a = commonItemView;
            this.f112305b = str;
            this.f112306c = hashMap;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            C39618d.f101151O.mo83116a(C40796a.ReactDuetSettingChanged, true);
            if (this.f112304a.mo19040c()) {
                C39618d.f101151O.mo83113a(C40796a.ReactDuetSettingCurrent, C41538an.f105227e);
            } else {
                C39618d.f101151O.mo83113a(C40796a.ReactDuetSettingCurrent, C41538an.f105228f);
            }
            this.f112304a.setChecked(!this.f112304a.mo19040c());
            String str3 = "click_react_duet_control";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f112305b).mo47829a("enter_from", "video_post_page");
            String str4 = "to_status";
            if (this.f112304a.mo19040c()) {
                str = "on";
            } else {
                str = "off";
            }
            C23089d a2 = a.mo47829a(str4, str);
            String str5 = "shoot_way";
            HashMap hashMap = this.f112306c;
            if (hashMap != null) {
                str2 = (String) hashMap.get("shoot_way");
            } else {
                str2 = null;
            }
            C26890h.m65011a(str3, a2.mo47829a(str5, str2).f61491a);
        }
    }

    /* renamed from: e */
    public static final boolean m97179e() {
        return C44379a.m97189a();
    }

    /* renamed from: a */
    public final boolean mo90243a() {
        CommonItemView commonItemView = this.f112289d;
        if (commonItemView != null) {
            return commonItemView.mo19040c();
        }
        return false;
    }

    /* renamed from: c */
    public final int mo90245c() {
        return C45387a.m98944a(this.f112288c);
    }

    /* renamed from: b */
    public static boolean m97178b() {
        C42482c b = C43214dh.m94817a().mo50201b();
        if (b == null || !b.isPreventDownload()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo90246d() {
        if (C44387k.f112322b.mo90252b()) {
            C22055c e = C39618d.f101183x.mo74285e();
            if (e != null) {
                if (!e.mo46168l()) {
                    this.f112288c = false;
                } else if (!this.f112293i) {
                    this.f112288c = e.mo46167k();
                } else if (this.f112288c && !e.mo46167k()) {
                    this.f112288c = false;
                    C10691a.m21542b(this.f112291f.getContext(), (int) R.string.ath).mo19066a();
                }
            }
        }
    }

    /* renamed from: a */
    private final int m97174a(float f) {
        return (int) C9432q.m18687b(this.f112291f.getContext(), f);
    }

    /* renamed from: b */
    public final int mo90244b(CommonItemView commonItemView) {
        C52711k.m112240b(commonItemView, "reactDuetSettingItem");
        if (C44387k.m97190a()) {
            switch (C39618d.f101152P.mo83104b(C40790a.EnablePublishPrivacySetting)) {
                case 1:
                case 2:
                    if (this.f112287b) {
                        return 0;
                    }
                    return 1;
                default:
                    if (commonItemView.mo19040c()) {
                        return 0;
                    }
                    return 1;
            }
        } else if (commonItemView.mo19040c()) {
            return 0;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    public final int mo90238a(CommonItemView commonItemView) {
        C52711k.m112240b(commonItemView, "commentSettingItem");
        if (!C44387k.m97190a()) {
            return C45387a.m98943a(commonItemView);
        }
        switch (C39618d.f101152P.mo83104b(C40790a.EnablePublishPrivacySetting)) {
            case 1:
            case 2:
                if (this.f112286a) {
                    return 0;
                }
                return 3;
            default:
                if (commonItemView.mo19040c()) {
                    return 0;
                }
                return 3;
        }
    }

    /* renamed from: a */
    public final void mo90240a(LinearLayout linearLayout) {
        C52711k.m112240b(linearLayout, "parent");
        if (this.f112290e) {
            boolean z = false;
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.a2s, linearLayout, false);
            if (inflate != null) {
                this.f112289d = (CommonItemView) inflate;
                CommonItemView commonItemView = this.f112289d;
                if (commonItemView != null) {
                    if (!m97178b()) {
                        Object a = C39618d.f101174o.mo74241c().mo74245a();
                        C52711k.m112236a(a, "AVEnv.SP_SERIVCE.autoSaveVideo().get()");
                        if (((Boolean) a).booleanValue()) {
                            z = true;
                        }
                    }
                    commonItemView.setChecked(z);
                }
                linearLayout.addView(this.f112289d, new LayoutParams(-1, m97174a(52.0f)));
                CommonItemView commonItemView2 = this.f112289d;
                if (commonItemView2 != null) {
                    commonItemView2.setOnClickListener(new C44380b(this, linearLayout));
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
        }
    }

    /* renamed from: a */
    public final void mo90242a(BaseShortVideoContext baseShortVideoContext) {
        C52711k.m112240b(baseShortVideoContext, "model");
        if (C44387k.f112322b.mo90252b()) {
            baseShortVideoContext.allowDownloadSetting = mo90245c();
        }
    }

    /* renamed from: a */
    private static void m97176a(CommonItemView commonItemView, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap) {
        boolean z;
        C39591bc bcVar = C39618d.f101179t;
        if (baseShortVideoContext.commentSetting == 0) {
            z = true;
        } else {
            z = false;
        }
        bcVar.mo74307a(commonItemView, z, hashMap);
    }

    public C44378h(Fragment fragment, boolean z, int i) {
        boolean z2;
        C52711k.m112240b(fragment, "fragment");
        this.f112291f = fragment;
        this.f112295k = z;
        if (C39618d.f101151O.mo83118b(C40796a.ReactDuetSettingCurrent) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f112287b = z2;
        this.f112288c = true;
        this.f112290e = C44379a.m97189a();
    }

    /* renamed from: a */
    public final void mo90239a(int i, int i2, Intent intent) {
        if (i == this.f112292g && i2 == -1 && intent != null) {
            this.f112286a = intent.getBooleanExtra("comment_item_checked", true);
            this.f112287b = intent.getBooleanExtra("react_duet_item_checked", true);
            this.f112288c = intent.getBooleanExtra("download_item_checked", false);
            this.f112293i = true;
        }
    }

    /* renamed from: a */
    private static void m97177a(CommonItemView commonItemView, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap, String str) {
        if (C41538an.m91369a(baseShortVideoContext)) {
            boolean z = false;
            commonItemView.setVisibility(0);
            if (C39618d.f101151O.mo83118b(C40796a.ReactDuetSettingCurrent) == 0) {
                z = true;
            }
            commonItemView.setChecked(z);
            commonItemView.setOnClickListener(new C44384f(commonItemView, str, hashMap));
            return;
        }
        commonItemView.setVisibility(8);
    }

    /* renamed from: a */
    private final void m97175a(LinearLayout linearLayout, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap, boolean z, String str) {
        boolean z2;
        this.f112294j = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.a6n, linearLayout, false);
        linearLayout.addView(this.f112294j, new LayoutParams(-1, m97174a(56.0f)));
        View view = this.f112294j;
        if (view != null) {
            view.setOnClickListener(new C44381c(this, z, str, hashMap));
        }
        boolean z3 = true;
        if (baseShortVideoContext.commentSetting == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f112286a = z2;
        if (C44387k.f112322b.mo90252b()) {
            if (!C39618d.f101183x.mo74282b()) {
                this.f112288c = true;
                return;
            }
            if (this.f112295k) {
                if (baseShortVideoContext.allowDownloadSetting != 0) {
                    z3 = false;
                }
                this.f112288c = z3;
            }
            C0013i.m16a((Callable<TResult>) C44382d.f112302a).mo20a((C0011g<TResult, TContinuationResult>) new C44383e<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo90241a(LinearLayout linearLayout, BaseShortVideoContext baseShortVideoContext, HashMap<String, String> hashMap, String str, CommonItemView commonItemView, CommonItemView commonItemView2) {
        C52711k.m112240b(linearLayout, "viewContainer");
        C52711k.m112240b(baseShortVideoContext, "model");
        C52711k.m112240b(commonItemView, "reactDuetSettingItem");
        C52711k.m112240b(commonItemView2, "commentSettingItem");
        if (!C39618d.f101183x.mo74280a()) {
            int b = C39618d.f101152P.mo83104b(C40790a.EnablePublishPrivacySetting);
            if (!C44387k.m97190a() || !(b == 2 || b == 1)) {
                m97177a(commonItemView, baseShortVideoContext, hashMap, str);
                m97176a(commonItemView2, baseShortVideoContext, hashMap);
                return;
            }
            m97175a(linearLayout, baseShortVideoContext, hashMap, C41538an.m91369a(baseShortVideoContext), str);
            C23729p.m58261a(false, commonItemView, commonItemView2);
        }
    }
}
