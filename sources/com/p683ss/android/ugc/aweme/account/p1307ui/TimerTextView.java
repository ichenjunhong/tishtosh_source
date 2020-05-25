package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.C21599a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.ui.TimerTextView */
public final class TimerTextView extends DmtTextView implements C21599a {

    /* renamed from: b */
    public static final C22199a f59912b = new C22199a(null);

    /* renamed from: c */
    private C21599a f59913c;

    /* renamed from: d */
    private C21598l f59914d;

    /* renamed from: e */
    private long f59915e;

    /* renamed from: f */
    private long f59916f;

    /* renamed from: g */
    private String f59917g;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.TimerTextView$a */
    public static final class C22199a {
        private C22199a() {
        }

        public /* synthetic */ C22199a(C52707g gVar) {
            this();
        }
    }

    public TimerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo1037a() {
        C21599a aVar = this.f59913c;
        if (aVar != null) {
            aVar.mo45694a();
        }
    }

    /* renamed from: b */
    public final void mo45695b() {
        C21599a aVar = this.f59913c;
        if (aVar != null) {
            aVar.mo45695b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C21598l lVar = this.f59914d;
        if (lVar != null) {
            lVar.mo45879a(null);
        }
        this.f59913c = null;
    }

    /* renamed from: c */
    public final C21598l mo46336c() {
        if (this.f59914d == null) {
            TimerTextView timerTextView = this;
            C21598l lVar = new C21598l(timerTextView.f59915e, timerTextView.f59916f, timerTextView);
            timerTextView.f59914d = lVar;
        }
        C21598l lVar2 = this.f59914d;
        if (lVar2 == null) {
            C52711k.m112234a();
        }
        lVar2.mo45880b();
        C21598l lVar3 = this.f59914d;
        if (lVar3 == null) {
            C52711k.m112234a();
        }
        return lVar3;
    }

    public final void setCallback(C21599a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f59913c = aVar;
    }

    /* renamed from: a */
    public final void mo45869a(long j) {
        String str = this.f59917g;
        if (str == null) {
            C52711k.m112234a();
        }
        m55032a(j, str);
        C21599a aVar = this.f59913c;
        if (aVar != null) {
            aVar.mo45869a(j);
        }
    }

    /* renamed from: a */
    public final void mo46335a(C21598l lVar) {
        C52711k.m112240b(lVar, "timer");
        this.f59914d = lVar;
        if (lVar.mo45883e()) {
            mo1037a();
            lVar.mo45879a(this);
            return;
        }
        lVar.mo45880b();
    }

    /* renamed from: a */
    private final void m55032a(long j, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(j / 1000));
        sb.append(str);
        setText(sb.toString());
    }

    public TimerTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k5, R.attr.a3z});
        this.f59915e = (long) obtainStyledAttributes.getInteger(0, 60000);
        String string = obtainStyledAttributes.getString(1);
        if (string == null) {
            string = "";
        }
        this.f59917g = string;
        obtainStyledAttributes.recycle();
        this.f59916f = 1000;
    }

    /* renamed from: a */
    public final void mo46334a(long j, long j2, String str) {
        C52711k.m112240b(str, "suffix");
        mo46333a(60000, 60000, 1000, str);
    }

    /* renamed from: a */
    public final void mo46333a(long j, long j2, long j3, String str) {
        C52711k.m112240b(str, "suffix");
        this.f59917g = str;
        this.f59915e = j2;
        this.f59916f = j3;
        m55032a(j, str);
    }

    public /* synthetic */ TimerTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 4) != 0) {
            i = 16842884;
        }
        this(context, attributeSet, i);
    }
}
