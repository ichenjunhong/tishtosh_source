package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AbstractFeedTagLayout */
public abstract class AbstractFeedTagLayout extends LinearLayout {

    /* renamed from: a */
    protected TextView f62853a;

    /* renamed from: b */
    protected TextView f62854b;

    /* renamed from: c */
    protected Context f62855c;

    /* renamed from: d */
    protected Aweme f62856d;

    /* renamed from: e */
    protected int f62857e;

    /* renamed from: f */
    protected int f62858f;

    /* renamed from: g */
    protected String f62859g;

    /* renamed from: h */
    protected Activity f62860h;

    /* renamed from: i */
    protected JSONObject f62861i;

    /* renamed from: j */
    protected int f62862j;

    /* renamed from: k */
    public boolean f62863k;

    /* renamed from: l */
    protected boolean f62864l;

    /* renamed from: m */
    protected String f62865m = "list";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48921a();

    private C38484a getAnchorExtra() {
        return m57875b(this.f62856d);
    }

    public String getOpenPlatformIcon() {
        if (this.f62856d == null || this.f62856d.getAnchorInfo() == null || this.f62856d.getAnchorInfo().getType() == null || this.f62856d.getAnchorInfo().getType().intValue() != 15 || this.f62856d.getAnchorInfo().getExtra() == null || getAnchorExtra() == null || getAnchorExtra().getAnchorInfo() == null || getAnchorExtra().getAnchorInfo().getIcon() == null) {
            return null;
        }
        return getAnchorExtra().getAnchorInfo().getIcon();
    }

    public String getOpenPlatformName() {
        if (this.f62856d == null || this.f62856d.getAnchorInfo() == null || this.f62856d.getAnchorInfo().getType() == null || this.f62856d.getAnchorInfo().getType().intValue() != 15 || this.f62856d.getAnchorInfo().getExtra() == null || getAnchorExtra() == null || getAnchorExtra().getAnchorInfo() == null || getAnchorExtra().getAnchorInfo().getName() == null) {
            return null;
        }
        return getAnchorExtra().getAnchorInfo().getName();
    }

    public void setFollowPageType(String str) {
        this.f62865m = str;
    }

    public void setPageType(int i) {
        this.f62862j = i;
    }

    public void setPoiTagVisible(boolean z) {
        this.f62863k = z;
    }

    public void setRequestId(JSONObject jSONObject) {
        this.f62861i = jSONObject;
    }

    public AbstractFeedTagLayout(Context context) {
        super(context);
    }

    /* renamed from: b */
    private static C38484a m57875b(Aweme aweme) {
        try {
            return (C38484a) new C17971f().mo34884a(aweme.getAnchorInfo().getExtra(), C38484a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo48922a(Aweme aweme) {
        if (!(aweme == null || aweme.getAnchorInfo() == null || aweme.getAnchorInfo().getType() == null || aweme.getAnchorInfo().getType().intValue() != 15 || aweme.getAnchorInfo().getExtra() == null)) {
            C38484a b = m57875b(aweme);
            if (b == null || b.getAnchorInfo() == null || TextUtils.isEmpty(b.getAnchorInfo().getName())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AbstractFeedTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractFeedTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
