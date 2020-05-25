package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AbsAdProfileWidget */
public abstract class AbsAdProfileWidget extends Widget implements C0199s<C23274a> {

    /* renamed from: a */
    public Aweme f70586a;

    /* renamed from: h */
    public Fragment f70587h;

    /* renamed from: i */
    public String f70588i;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo54697c(boolean z) {
    }

    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            dataCenter.mo48225a((C0199s<C23274a>) this);
        }
    }

    public void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            dataCenter.mo48226a("AD_PROFILE_PARAMS", (C0199s<C23274a>) this);
        }
        DataCenter dataCenter2 = this.f62238e;
        if (dataCenter2 != null) {
            dataCenter2.mo48226a("AD_PROFILE_VISIBILITY_CHANGED", (C0199s<C23274a>) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo54695a(int i) {
        View view = this.f62237d;
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    /* renamed from: a */
    public void mo48241a(View view) {
        super.mo48241a(view);
        DataCenter dataCenter = this.f62238e;
        if (dataCenter != null) {
            C26818c cVar = (C26818c) dataCenter.mo48229a("AD_PROFILE_PARAMS");
            if (cVar != null) {
                mo54696a(cVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54696a(C26818c cVar) {
        C52711k.m112240b(cVar, "params");
        this.f70586a = cVar.f70649a;
        this.f70587h = cVar.f70650b;
        this.f70588i = cVar.f70651c;
    }

    public /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1433406312) {
                if (hashCode == -322064775 && str.equals("AD_PROFILE_VISIBILITY_CHANGED")) {
                    Boolean bool = (Boolean) aVar.mo48246a();
                    if (bool != null) {
                        mo54697c(bool.booleanValue());
                    }
                }
            } else if (str.equals("AD_PROFILE_PARAMS")) {
                C26818c cVar = (C26818c) aVar.mo48246a();
                if (cVar != null) {
                    mo54696a(cVar);
                }
            }
        }
    }
}
