package com.p683ss.android.ugc.aweme.friends.invite;

import android.content.Context;
import android.graphics.Paint;
import android.support.p030v4.widget.C1115o;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10686c;
import com.bytedance.ies.dmt.p664ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn */
public final class I18nFollowAndInviteUserBtn extends FollowUserBtn {

    /* renamed from: f */
    public static final C32582a f84808f = new C32582a(null);

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn$a */
    public static final class C32582a {
        private C32582a() {
        }

        public /* synthetic */ C32582a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo65913b() {
        setVisibility(0);
        this.f84041a.setTextColor(getResources().getColor(R.color.a17));
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setText(getResources().getString(R.string.btd));
        NiceWidthTextView niceWidthTextView2 = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.bg_followed));
        this.f84042b = 1001;
    }

    /* renamed from: a */
    public final void mo65912a() {
        setVisibility(0);
        this.f84041a.setTextColor(getResources().getColor(R.color.pn));
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setText(getResources().getString(R.string.bt5));
        NiceWidthTextView niceWidthTextView2 = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.cxy));
        this.f84042b = 1000;
    }

    public I18nFollowAndInviteUserBtn(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m75375a(int i) {
        if (this.f84041a != null) {
            C1115o.m3256a((TextView) this.f84041a, i);
            this.f84041a.setPadding(8, 0, 8, 0);
            this.f84041a.setFontType(C10751d.f28908g);
        }
    }

    /* renamed from: a */
    public final int mo19031a(TextView textView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.b55));
        arrayList.add(Integer.valueOf(R.string.as8));
        arrayList.add(Integer.valueOf(R.string.b4y));
        arrayList.add(Integer.valueOf(R.string.as_));
        arrayList.add(Integer.valueOf(R.string.gfm));
        int a = C10686c.m21513a(textView, arrayList, (int) C9432q.m18687b(getContext(), 64.0f), (int) C9432q.m18687b(getContext(), 120.0f));
        if (a > this.f84045e) {
            return a;
        }
        return this.f84045e;
    }

    public final void setFollowButtonTextAndIcon(int i) {
        boolean z = true;
        if (i != 1 || !FollowToFollowBackExperiment.m69596a()) {
            super.setFollowButtonTextAndIcon(i);
            m75375a((int) R.style.un);
        } else {
            NiceWidthTextView niceWidthTextView = this.f84041a;
            C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
            niceWidthTextView.setText(getResources().getText(R.string.gfm));
            Paint paint = new Paint();
            paint.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
            if (paint.measureText(getContext().getString(R.string.gfm)) < 110.0f) {
                z = false;
            }
            if (z) {
                m75375a((int) R.style.uh);
            }
        }
    }

    public I18nFollowAndInviteUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo65360a(int i, int i2) {
        m75375a((int) R.style.un);
        super.mo65360a(i, i2);
    }

    public I18nFollowAndInviteUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
