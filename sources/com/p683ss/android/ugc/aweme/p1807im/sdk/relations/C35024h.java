package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35276n;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35437a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1903e.C35438b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashSet;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.h */
public final class C35024h extends C23526a implements C35437a {

    /* renamed from: a */
    C35028j f90105a;

    /* renamed from: b */
    public C23371a<Boolean> f90106b;

    /* renamed from: c */
    private View f90107c;

    /* renamed from: d */
    private C35023g f90108d;

    /* renamed from: e */
    private SharePackage f90109e;

    /* renamed from: j */
    private LinkedHashSet<IMContact> f90110j;

    /* renamed from: k */
    private boolean f90111k;

    /* renamed from: l */
    private BaseContent f90112l;

    /* renamed from: m */
    private boolean f90113m;

    /* renamed from: a */
    public final void mo72682a(C35438b bVar) {
    }

    /* renamed from: a */
    public final void mo72683a(String str) {
    }

    /* renamed from: a */
    public final void mo72684a(boolean z) {
    }

    /* renamed from: f */
    public final Fragment mo72686f() {
        return this;
    }

    /* renamed from: i */
    public final void mo72689i() {
    }

    /* renamed from: g */
    public final void mo72687g() {
        if (this.f90108d != null) {
            this.f90108d.mo73129a();
        }
    }

    /* renamed from: h */
    public final void mo72688h() {
        if (this.f90105a != null) {
            this.f90105a.mo73152l();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f90105a != null) {
            this.f90105a.mo73147g();
        }
        mo72687g();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f90108d != null) {
            C35023g gVar = this.f90108d;
            if (gVar.f90104b != null) {
                gVar.f90104b.mo72988c();
                gVar.f90104b.mo73114j();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments != null) {
            this.f90109e = (SharePackage) arguments.getParcelable("share_package");
            if (this.f90109e != null) {
                C35190af.m79442a().mo73320a(this.f90109e, (IMContact) null, true);
            }
            this.f90112l = (BaseContent) arguments.getSerializable("share_content");
            BaseContent.wrapForward(this.f90112l, arguments.getLong("forward_origin_msgid"));
            this.f90111k = arguments.getBoolean("extra_no_title");
            this.f90110j = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
        }
        if (this.f90113m) {
            this.f90105a = new C34850c(getContext(), this.f90107c, this.f90111k);
        } else {
            this.f90105a = new C35028j(getContext(), this.f90107c, this.f90111k);
        }
        this.f90105a.f90139s = this.f90106b;
        this.f90105a.mo73139a(this.f90109e);
        this.f90105a.f90128h = this.f90112l;
        this.f90105a.mo73143a(this.f90110j);
        C35028j jVar = this.f90105a;
        boolean z2 = this.f90113m;
        if (this.f90109e == null) {
            z = false;
        }
        this.f90108d = new C35023g(jVar, z2, z, C35276n.m79758a(this.f90109e));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f90113m = DefaultIMService.provideIMService_Monster().getAbInterface().mo70321b();
        if (this.f90113m) {
            this.f90107c = layoutInflater.inflate(R.layout.ri, viewGroup, false);
        } else {
            this.f90107c = layoutInflater.inflate(R.layout.rh, viewGroup, false);
        }
        return this.f90107c;
    }
}
