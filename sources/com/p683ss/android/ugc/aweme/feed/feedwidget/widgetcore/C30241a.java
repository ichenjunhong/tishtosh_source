package com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a */
public abstract class C30241a implements C30254n<C23274a, C23274a> {

    /* renamed from: a */
    public boolean f79008a;

    /* renamed from: b */
    public GenericWidget f79009b;

    /* renamed from: c */
    protected boolean f79010c;

    /* renamed from: d */
    public Aweme f79011d;

    /* renamed from: e */
    public String f79012e;

    /* renamed from: f */
    protected JSONObject f79013f;

    /* renamed from: g */
    protected boolean f79014g;

    /* renamed from: h */
    public int f79015h;

    /* renamed from: i */
    public DataCenter f79016i;

    /* renamed from: j */
    public final Context f79017j;

    /* renamed from: k */
    protected final View f79018k;

    /* renamed from: l */
    protected View f79019l;

    /* renamed from: m */
    protected String f79020m = "click";

    /* renamed from: n */
    protected Fragment f79021n;

    /* renamed from: o */
    protected int f79022o;

    /* renamed from: a */
    public void mo60584a(int i, C23274a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60585a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60586a(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60588a(Map<String, Object> map) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo60589a(C23274a aVar) {
        return false;
    }

    /* renamed from: c */
    public int mo60595c(C23274a aVar) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo60596c() {
    }

    /* renamed from: e */
    public abstract void mo60599e();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo60600e(C23274a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo60597d() {
        this.f79009b.mo94947e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo60604h() {
        mo60585a(this.f79018k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60583a() {
        if (this.f79008a) {
            C30255o.f79039a.mo60617a(new C30256p(this.f79008a, new C30246f(this)));
        } else {
            mo60596c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo60591b() {
        if (this.f79008a) {
            C30255o.f79039a.mo60617a(new C30256p(this.f79008a, new C30247g(this)));
        } else {
            mo60597d();
        }
    }

    /* renamed from: f */
    public final boolean mo60602f() {
        if (!mo60603g()) {
            return false;
        }
        C10691a.m21542b(this.f79017j, (int) R.string.dm).mo19066a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo60603g() {
        boolean z;
        boolean a = C26503d.m64057a(this.f79011d);
        if (this.f79011d == null || !this.f79011d.isAd()) {
            z = false;
        } else {
            z = true;
        }
        if (z || !a) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo60605i() {
        VideoItemParams videoItemParams = (VideoItemParams) this.f79016i.mo48229a("video_params");
        if (videoItemParams != null) {
            onChanged(new C23274a("video_params", videoItemParams));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo60592b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f79016i = dataCenter;
            mo60586a(dataCenter);
        }
    }

    /* renamed from: c */
    private void mo63584c(Map<String, Object> map) {
        if (map != null) {
            if (this.f79008a) {
                C30255o.f79039a.mo60617a(new C30256p(true, new C30250j(this, map)));
            } else {
                this.f79020m = (String) map.get("enterMethod");
                this.f79013f = (JSONObject) map.get("reqId");
            }
        }
    }

    /* renamed from: a */
    public void mo60587a(VideoItemParams videoItemParams) {
        mo60593b(videoItemParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo60593b(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f79011d = videoItemParams.mWidgetAweme;
            this.f79015h = videoItemParams.mPageType;
            this.f79012e = videoItemParams.mEventType;
            this.f79013f = videoItemParams.mRequestId;
            this.f79014g = videoItemParams.isMyProfile;
            this.f79020m = videoItemParams.mEnterMethodValue;
            this.f79021n = videoItemParams.fragment;
            this.f79022o = videoItemParams.mAwemeFromPage;
        }
    }

    /* renamed from: b */
    public C23274a mo60590b(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode != -98766390) {
                    if (hashCode == 986395595 && str.equals("async_widget_unsafe_data")) {
                        c = 2;
                    }
                } else if (str.equals("video_params")) {
                    c = 0;
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo60587a((VideoItemParams) aVar.mo48246a());
                    break;
                case 2:
                    mo63584c((Map) aVar.mo48246a());
                    break;
            }
        }
        return aVar;
    }

    /* renamed from: d */
    public final void onChanged(C23274a aVar) {
        if (this.f79008a) {
            if (!mo60589a(aVar)) {
                C30255o.f79039a.mo60617a(new C30256p(this.f79008a, new C30251k(this, aVar)));
            }
        } else if (aVar == null || aVar.f62242a.equals("video_params")) {
            C23274a b = mo60590b(aVar);
            mo60584a(mo60595c(b), b);
        } else {
            String str = aVar.f62242a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == 986395595 && str.equals("async_widget_unsafe_data")) {
                    c = 1;
                }
            } else if (str.equals("on_viewpager_page_selected")) {
                c = 0;
            }
            switch (c) {
                case 1:
                    mo63584c((Map) aVar.mo48246a());
                    break;
            }
            mo60600e(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1.equals("on_viewpager_page_selected") != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo60601f(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0045
            java.lang.String r1 = r6.f62242a
            java.lang.String r2 = "video_params"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x000e
            goto L_0x0045
        L_0x000e:
            java.lang.String r1 = r6.f62242a
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -1180796502(0xffffffffb99e79aa, float:-3.0226755E-4)
            if (r3 == r4) goto L_0x002a
            r0 = 986395595(0x3acb33cb, float:0.0015503106)
            if (r3 == r0) goto L_0x0020
            goto L_0x0033
        L_0x0020:
            java.lang.String r0 = "async_widget_unsafe_data"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x002a:
            java.lang.String r3 = "on_viewpager_page_selected"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0041
        L_0x0038:
            java.lang.Object r0 = r6.mo48246a()
            java.util.Map r0 = (java.util.Map) r0
            r5.mo63584c(r0)
        L_0x0041:
            r5.mo60600e(r6)
            return
        L_0x0045:
            com.ss.android.ugc.aweme.arch.widgets.base.a r6 = r5.mo60590b(r6)
            int r1 = r5.mo60595c(r6)
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r2 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r3 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.d r4 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.d
            r4.<init>(r5, r1, r6)
            r3.<init>(r0, r4)
            r2.mo60617a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a.mo60601f(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo60594b(Map map) {
        this.f79020m = (String) map.get("enterMethod");
        this.f79013f = (JSONObject) map.get("reqId");
    }

    public C30241a(View view, boolean z) {
        this.f79017j = view.getContext();
        this.f79018k = view;
        this.f79008a = z;
        if (!z) {
            mo60585a(view);
        } else {
            C30255o.f79039a.mo60617a(new C30256p(z, new C30252l(this)));
        }
    }
}
