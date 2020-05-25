package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commerce.C25507c;
import com.p683ss.android.ugc.aweme.commerce.C25513e;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25591a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1714a.C29979a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b.C36961a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22396a;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout */
public class EnterpriseTransformLayout extends LinearLayout {

    /* renamed from: j */
    private static final int f102087j = ((int) C9432q.m18687b(C11010c.m22280a(), 4.0f));

    /* renamed from: k */
    private static final int f102088k = ((int) C9432q.m18687b(C11010c.m22280a(), 16.0f));

    /* renamed from: l */
    private static final int f102089l = ((int) C9432q.m18687b(C11010c.m22280a(), 20.0f));

    /* renamed from: a */
    DmtTextView f102090a;

    /* renamed from: b */
    DmtTextView f102091b;

    /* renamed from: c */
    DmtTextView f102092c;

    /* renamed from: d */
    View f102093d;

    /* renamed from: e */
    List<String> f102094e;

    /* renamed from: f */
    List<String> f102095f;

    /* renamed from: g */
    SparseBooleanArray f102096g;

    /* renamed from: h */
    User f102097h;

    /* renamed from: i */
    Activity f102098i;

    /* renamed from: m */
    private Aweme f102099m;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout$a */
    interface C40066a {
        /* renamed from: a */
        boolean mo82127a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo82126b() {
        if (this.f102097h == null) {
            return false;
        }
        return TextUtils.equals(C20854a.m53167g().getCurUserId(), this.f102097h.getUid());
    }

    /* renamed from: a */
    public final void mo82121a() {
        if (this.f102093d != null && this.f102090a != null && this.f102091b != null && this.f102092c != null) {
            if (this.f102090a.getVisibility() == 0 && this.f102091b.getVisibility() == 0) {
                m89045a((View) this.f102091b, 0);
                this.f102093d.setVisibility(0);
            }
            this.f102090a.setFontType(C10751d.f28903b);
            this.f102091b.setFontType(C10751d.f28903b);
            this.f102092c.setFontType(C10751d.f28903b);
        }
    }

    public EnterpriseTransformLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    static JSONObject m89044a(String str) {
        C26898j jVar = new C26898j();
        jVar.mo54849a("link_type", str);
        return jVar.mo54850a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo82122a(int i) {
        String str;
        if (C26503d.m64064g(this.f102099m)) {
            switch (i) {
                case 2:
                    str = "down_click";
                    break;
                case 3:
                    str = "phone_click";
                    break;
                default:
                    return;
            }
            C29979a.m70145a((Context) this.f102098i, "homepage_ad", str, C29979a.m70135a((Context) this.f102098i, this.f102099m, ""), this.f102099m.getAwemeRawAd());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo82125b(String str) {
        String str2;
        C22396a aVar;
        String str3;
        String str4;
        if (this.f102097h != null) {
            if (this.f102099m != null && C26503d.m64064g(this.f102099m)) {
                C25945k.m62911b().mo53155s(getContext(), this.f102099m);
            }
            Context context = getContext();
            String str5 = "click_link";
            if (mo82126b()) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            C26890h.m65008a(context, str5, str2, this.f102097h.getUid(), "0", m89044a(str));
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin != null) {
                aVar = createIAdServicebyMonsterPlugin.getLatestRecommendFeedAdInfo();
            } else {
                aVar = null;
            }
            String str6 = "";
            long j = 0;
            if (aVar != null) {
                if (aVar.f60319a != null) {
                    j = aVar.f60319a.longValue();
                }
                str6 = aVar.f60320b;
            }
            String str7 = "click_link";
            C23089d a = C23089d.m56640a().mo47829a("author_id", this.f102097h.getUid());
            String str8 = "enter_from";
            if (mo82126b()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            C23089d a2 = a.mo47829a(str8, str3).mo47829a("link_type", str);
            String str9 = "group_id";
            if (this.f102099m != null) {
                str4 = this.f102099m.getAid();
            } else {
                str4 = "";
            }
            C26890h.m65011a(str7, a2.mo47829a(str9, str4).mo47827a("cid", j).mo47829a("log_extra", str6).f61491a);
            if (C26503d.m64061d(this.f102099m)) {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -718695931) {
                    if (hashCode != 31634769) {
                        if (hashCode == 106642798 && str.equals("phone")) {
                            c = 0;
                        }
                    } else if (str.equals("download_link")) {
                        c = 1;
                    }
                } else if (str.equals("web_link")) {
                    c = 2;
                }
                switch (c) {
                    case 0:
                        C25945k.m62911b().mo53156t(getContext(), this.f102099m);
                        return;
                    case 1:
                        C25945k.m62911b().mo53157u(getContext(), this.f102099m);
                        return;
                    case 2:
                        C25945k.m62911b().mo53158v(getContext(), this.f102099m);
                        break;
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static void m89045a(View view, int i) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(i);
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo82123a(User user, Aweme aweme) {
        List list;
        DmtTextView dmtTextView;
        this.f102097h = user;
        setVisibility(8);
        this.f102090a.setVisibility(8);
        this.f102091b.setVisibility(8);
        this.f102092c.setVisibility(8);
        if (user != null) {
            this.f102097h = user;
            this.f102099m = null;
            C25507c commerceInfo = user.getCommerceInfo();
            if (commerceInfo != null) {
                if (commerceInfo.getOfflineInfoList() != null) {
                    list = new ArrayList(commerceInfo.getOfflineInfoList());
                } else {
                    list = null;
                }
                if (!C9376b.m18558a((Collection<T>) list)) {
                    boolean z = false;
                    setVisibility(0);
                    if (list.size() > 0) {
                        m89046a(this.f102090a, (C25513e) list.get(0), 0, null);
                        new Paint().setTextSize(this.f102090a.getTextSize());
                        if (list.size() > 1) {
                            DmtTextView dmtTextView2 = this.f102091b;
                            C25513e eVar = (C25513e) list.get(1);
                            if (!(dmtTextView2 == null || eVar == null)) {
                                String text = eVar.getText();
                                if (!TextUtils.isEmpty(text)) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(dmtTextView2.getTextSize());
                                    if (paint.measureText(text) > C9432q.m18687b(getContext(), 250.0f)) {
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                dmtTextView = this.f102092c;
                            } else {
                                dmtTextView = this.f102091b;
                            }
                            m89046a(dmtTextView, (C25513e) list.get(1), 1, null);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo82124a(String str, String str2) {
        String str3;
        String str4;
        if (!TextUtils.isEmpty(str)) {
            String queryParameter = Uri.parse(str).getQueryParameter("app_id");
            if (mo82126b()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            C26890h.m65011a("mp_click", C23089d.m56640a().mo47829a("mp_id", queryParameter).mo47829a("author_id", this.f102097h.getUid()).mo47829a("enter_from", str3).mo47829a("position", "in_video_tag").mo47829a("_param_for_special", str2).f61491a);
            C36961a aVar = new C36961a();
            if (mo82126b()) {
                str4 = "personal_homepage";
            } else {
                str4 = "others_homepage";
            }
            C36983a.m83185b().mo76294a().openMiniApp(getContext(), str, aVar.mo76222b(str4).mo76220a("elite").mo76223c("023003").mo76221a());
            if (C26503d.m64064g(this.f102099m)) {
                C25945k.m62911b().mo53134b((Context) this.f102098i, this.f102099m, "homepage_ad");
            }
        }
    }

    public EnterpriseTransformLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f102094e = new ArrayList();
        this.f102095f = new ArrayList();
        this.f102096g = new SparseBooleanArray(2);
        LayoutInflater.from(context).inflate(R.layout.bpb, this);
        setOrientation(1);
        this.f102090a = (DmtTextView) findViewById(R.id.d41);
        this.f102091b = (DmtTextView) findViewById(R.id.d44);
        this.f102092c = (DmtTextView) findViewById(R.id.d45);
        this.f102093d = findViewById(R.id.e51);
        this.f102094e.clear();
        this.f102095f.clear();
    }

    /* renamed from: a */
    private void m89046a(DmtTextView dmtTextView, C25513e eVar, int i, C40066a aVar) {
        Object obj;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        C25591a aVar2;
        DmtTextView dmtTextView2 = dmtTextView;
        int i3 = i;
        if (eVar == null) {
            dmtTextView2.setText("");
            return;
        }
        dmtTextView2.setTextColor(getResources().getColor(R.color.a3c));
        dmtTextView2.setTextSize(14.0f);
        dmtTextView2.setFontType(C10751d.f28908g);
        dmtTextView2.setVisibility(0);
        this.f102098i = C11016e.m22312g();
        if (this.f102098i != null) {
            String str5 = "[label] ";
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(eVar.getText());
            SpannableString spannableString = new SpannableString(sb.toString());
            String action = eVar.getAction();
            if (!TextUtils.isEmpty(action)) {
                int offlineInfoType = eVar.getOfflineInfoType();
                if (offlineInfoType != -137) {
                    switch (offlineInfoType) {
                        case 1:
                            if (eVar.getOfflineSubtype() == 1) {
                                str3 = "group_buying";
                            } else {
                                str3 = "web_link";
                            }
                            str4 = str3;
                            aVar2 = new C25591a(dmtTextView.getContext(), R.drawable.dqf);
                            C40208ab abVar = new C40208ab(this, null, action, eVar, str4);
                            dmtTextView2.setOnClickListener(abVar);
                            break;
                        case 2:
                            str4 = "download_link";
                            aVar2 = new C25591a(dmtTextView.getContext(), R.drawable.dq6);
                            C40207aa aaVar = new C40207aa(this, null, action, str4, offlineInfoType);
                            dmtTextView2.setOnClickListener(aaVar);
                            break;
                        case 3:
                            String str6 = "phone";
                            C25591a aVar3 = new C25591a(dmtTextView.getContext(), R.drawable.dra);
                            C40476y yVar = r0;
                            C40476y yVar2 = new C40476y(this, null, action, str6, offlineInfoType);
                            dmtTextView2.setOnClickListener(yVar);
                            str = str6;
                            obj = aVar3;
                            break;
                        case 4:
                            str = "address";
                            obj = new C25591a(dmtTextView.getContext(), R.drawable.dqh);
                            dmtTextView2.setOnClickListener(new C40477z(this, null, action, str));
                            break;
                        case 5:
                            str = "micro_app";
                            obj = new C25591a(dmtTextView.getContext(), R.drawable.dqj);
                            dmtTextView2.setOnClickListener(new C40209ac(this, null, action, str));
                            break;
                        case 6:
                            str = "micro_game";
                            obj = new C25591a(dmtTextView.getContext(), R.drawable.dql);
                            dmtTextView2.setOnClickListener(new C40210ad(this, null, action, str));
                            break;
                        default:
                            str = "";
                            obj = null;
                            break;
                    }
                    str = str4;
                    obj = aVar2;
                } else {
                    str = "contact_information";
                    obj = new C25591a(dmtTextView.getContext(), R.drawable.dq8);
                    dmtTextView2.setOnClickListener(new C40475x(this, null, str));
                    dmtTextView2.setTextColor(getResources().getColor(R.color.ga));
                }
                if (this.f102097h != null && !TextUtils.isEmpty(this.f102097h.getUid()) && !this.f102096g.get(i3)) {
                    this.f102094e.add(str);
                    this.f102095f.add(action);
                    this.f102096g.put(i3, true);
                    if (mo82126b()) {
                        str2 = "personal_homepage";
                    } else {
                        str2 = "others_homepage";
                    }
                    C26890h.m65008a(getContext(), "show_link", str2, this.f102097h.getUid(), "0", m89044a(str));
                    C26890h.m65011a("show_link", C23089d.m56640a().mo47829a("author_id", this.f102097h.getUid()).mo47829a("enter_from", str2).mo47829a("link_type", str).f61491a);
                    if (TextUtils.equals(str, "micro_app") || TextUtils.equals(str, "micro_game")) {
                        String queryParameter = Uri.parse(action).getQueryParameter("app_id");
                        IMiniAppService a = C36983a.m83185b().mo76294a();
                        if (TextUtils.equals(str, "micro_app")) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        a.preloadMiniApp(queryParameter, i2);
                        C26890h.m65011a("mp_show", C23089d.m56640a().mo47829a("mp_id", queryParameter).mo47829a("author_id", this.f102097h.getUid()).mo47829a("enter_from", str2).mo47829a("position", "in_video_tag").mo47829a("_param_for_special", str).f61491a);
                    }
                }
                if (obj != null) {
                    spannableString.setSpan(obj, 0, str5.length() - 1, 17);
                    dmtTextView2.setText(spannableString);
                    if (dmtTextView2 == this.f102091b) {
                        m89045a((View) dmtTextView2, f102088k);
                    }
                    if (dmtTextView.getLayoutParams().height != -2) {
                        dmtTextView.getLayoutParams().height = -2;
                        dmtTextView2.setLayoutParams(dmtTextView.getLayoutParams());
                    }
                    C47795d.m103429a(dmtTextView);
                }
            }
        }
    }
}
