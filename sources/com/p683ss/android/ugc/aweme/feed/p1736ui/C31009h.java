package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.h */
public abstract class C31009h {

    /* renamed from: l */
    public Aweme f81192l;

    /* renamed from: m */
    protected String f81193m;

    /* renamed from: n */
    protected JSONObject f81194n;

    /* renamed from: o */
    protected boolean f81195o;

    /* renamed from: p */
    protected int f81196p;

    /* renamed from: q */
    protected DataCenter f81197q;

    /* renamed from: r */
    public final Context f81198r;

    /* renamed from: s */
    public final View f81199s;

    /* renamed from: t */
    protected String f81200t = "click";

    /* renamed from: u */
    protected Fragment f81201u;

    /* renamed from: v */
    protected int f81202v;

    /* renamed from: a */
    public abstract void mo49781a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49783a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49784a(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo63420b() {
    }

    /* renamed from: h */
    public void mo63316h() {
    }

    /* renamed from: i */
    public void mo63327i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo63786g() {
        if (this.f81192l == null || !this.f81192l.isImage()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo63785c() {
        if (!mo63524f()) {
            return false;
        }
        C10691a.m21542b(this.f81198r, (int) R.string.dm).mo19066a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo63524f() {
        boolean z;
        boolean a = C26503d.m64057a(this.f81192l);
        if (this.f81192l == null || !this.f81192l.isAd()) {
            z = false;
        } else {
            z = true;
        }
        if (z || !a) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo60581b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f81197q = dataCenter;
            mo49784a(dataCenter);
        }
    }

    public C31009h(View view) {
        this.f81198r = view.getContext();
        this.f81199s = view;
        mo49783a(view);
    }

    /* renamed from: a */
    public void mo58323a(VideoItemParams videoItemParams) {
        mo63521b(videoItemParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo63521b(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f81192l = videoItemParams.mAweme;
            this.f81196p = videoItemParams.mPageType;
            this.f81193m = videoItemParams.mEventType;
            this.f81194n = videoItemParams.mRequestId;
            this.f81195o = videoItemParams.isMyProfile;
            this.f81200t = videoItemParams.mEnterMethodValue;
            this.f81201u = videoItemParams.fragment;
            this.f81202v = videoItemParams.mAwemeFromPage;
        }
    }
}
