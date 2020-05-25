package com.p683ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.commercialize.link.C25957e.C25958a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.commercialize.model.C26130k;
import com.p683ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p683ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PublishSettingItem;
import com.ss.android.ugc.trill.R;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.f */
public final class C25959f extends PublishSettingItem implements C25958a {

    /* renamed from: a */
    public boolean f68540a;

    /* renamed from: b */
    private String f68541b = "";

    /* renamed from: k */
    private boolean f68542k;

    /* renamed from: l */
    private boolean f68543l;

    /* renamed from: m */
    private C26130k f68544m;

    public final C26130k getCommerceDataContainer() {
        return this.f68544m;
    }

    public final boolean getHasGoods() {
        return this.f68543l;
    }

    public final boolean getHasMicroApp() {
        return this.f68542k;
    }

    public final String getLinkData() {
        return this.f68541b;
    }

    /* renamed from: a */
    private final void m62956a() {
        boolean z;
        if (this.f68542k || this.f68543l) {
            z = false;
        } else {
            z = true;
        }
        setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C25957e.m62954a((C25958a) this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C52711k.m112239a((Object) C25957e.f68538a, (Object) this)) {
            C25957e.m62954a((C25958a) null);
        }
    }

    public final void setHasGoods(boolean z) {
        this.f68543l = z;
        m62956a();
    }

    public final void setHasMicroApp(boolean z) {
        this.f68542k = z;
        m62956a();
    }

    public final void setCommerceDataContainer(C26130k kVar) {
        boolean z;
        this.f68544m = kVar;
        if (kVar != null) {
            z = kVar.mo53336b();
        } else {
            z = false;
        }
        setHasMicroApp(z);
    }

    public final void setEnabled(boolean z) {
        boolean z2;
        float f;
        setEnable(z);
        if (!this.f68540a || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        setAuthEnabled(z2);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
    }

    public final void setAuthEnabled(boolean z) {
        boolean z2;
        int i;
        this.f68540a = z;
        if (!this.f68540a || !isEnabled()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i = R.string.bwv;
        } else {
            i = R.string.bwu;
        }
        setSubtitle(i);
        C26130k commerceDataContainer = getCommerceDataContainer();
        if (commerceDataContainer != null) {
            C26109ad a = C26109ad.m63393a(commerceDataContainer.mo53334a());
            C52711k.m112236a((Object) a, "model");
            a.f68919a = z;
            commerceDataContainer.mo53335a(C26109ad.m63394a(a));
        }
    }

    public C25959f(Context context) {
        super(context);
        setDrawableLeft((int) R.drawable.d23);
        setTitle((int) R.string.d0w);
        setAuthEnabled(C25953d.m62948a());
        if (C25953d.m62948a()) {
            String b = new C17971f().mo34889b(C52550ab.m112042a(C52856t.m112465a("commerce_ad_link", Boolean.valueOf(true))));
            C52711k.m112236a((Object) b, "Gson().toJson(\n         …          )\n            )");
            setLinkData(b);
        }
    }

    public final void setLinkData(String str) {
        C52711k.m112240b(str, "value");
        this.f68541b = str;
        switch (C25957e.m62953a(str)) {
            case 1:
                setAuthEnabled(false);
                setVisibility(8);
                IAccountUserService a = C20902b.m53242a();
                if (a != null) {
                    User curUser = a.getCurUser();
                    if (curUser != null) {
                        CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
                        if (commerceUserInfo != null) {
                            LinkUserInfoStruct linkUserInfo = commerceUserInfo.getLinkUserInfo();
                            if (linkUserInfo != null) {
                                linkUserInfo.authStatus = 1;
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                setAuthEnabled(false);
                break;
            case 3:
                setAuthEnabled(true);
                break;
        }
        C26130k commerceDataContainer = getCommerceDataContainer();
        if (commerceDataContainer != null) {
            C26109ad a2 = C26109ad.m63393a(commerceDataContainer.mo53334a());
            C52711k.m112236a((Object) a2, "model");
            a2.f68920b = C25957e.m62955b(str);
            commerceDataContainer.mo53335a(C26109ad.m63394a(a2));
        }
    }
}
