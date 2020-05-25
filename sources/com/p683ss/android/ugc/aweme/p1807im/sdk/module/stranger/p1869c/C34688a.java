package com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.p1869c;

import android.app.Activity;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11198g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34624i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.C34679a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.stranger.StrangerListActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34007c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c.a */
public final class C34688a implements C26877c<C35456b> {

    /* renamed from: a */
    public final C34624i f89360a;

    /* renamed from: b */
    public DmtStatusView f89361b;

    /* renamed from: c */
    public Activity f89362c;

    /* renamed from: d */
    public C34007c f89363d = new C34007c() {
        /* renamed from: b */
        public final void mo20668b(final C11180b bVar) {
            if (C34688a.this.f89362c != null && !C34688a.this.f89362c.isFinishing()) {
                C34688a.this.f89362c.runOnUiThread(new Runnable() {
                    public final void run() {
                        C34688a.this.mo72747a(bVar.getConversationId());
                        C34688a.this.f89360a.notifyDataSetChanged();
                        if (C34688a.this.f89360a.mo50673a() == null || C34688a.this.f89360a.mo50673a().isEmpty()) {
                            C34688a.this.f89361b.mo19213g();
                        }
                    }
                });
            }
        }
    };

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<C35456b> list, boolean z) {
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        this.f89361b.mo19212f();
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f89360a.am_();
    }

    public final void aJ_() {
        if (this.f89360a.f70699x) {
            this.f89360a.mo54798c(false);
            this.f89360a.mo54785f();
            this.f89360a.an_();
        }
        if (this.f89360a.getItemCount() == 0) {
            mo72748b();
            this.f89361b.mo19213g();
        }
    }

    /* renamed from: b */
    public final void mo72748b() {
        if (!C35279p.m79763a() && (this.f89362c instanceof StrangerListActivity)) {
            DmtTextView rightTexView = ((StrangerListActivity) this.f89362c).f89336c.getRightTexView();
            if (rightTexView != null) {
                rightTexView.setTextColor(this.f89362c.getResources().getColor(R.color.sh));
                rightTexView.setEnabled(false);
                rightTexView.setClickable(false);
            }
            ((StrangerListActivity) this.f89362c).f89336c.getRightView().setEnabled(false);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f89360a.co_();
    }

    /* renamed from: a */
    public final void mo72747a(String str) {
        List a = this.f89360a.mo50673a();
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (str.equals(((C35456b) it.next()).bm_())) {
                    it.remove();
                    return;
                }
            }
        }
    }

    @C53771m
    public final void onEvent(C34679a aVar) {
        if (aVar.f89346a == 0) {
            mo72747a(aVar.f89347b);
            this.f89360a.notifyDataSetChanged();
            if (this.f89360a.mo50673a().isEmpty()) {
                this.f89361b.mo19213g();
                mo72748b();
                C34032k.m77795a().mo71982a("stranger_1");
            }
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (this.f89360a.f70699x) {
            this.f89360a.mo54798c(false);
            this.f89360a.notifyDataSetChanged();
        }
        if (this.f89360a.getItemCount() == 0) {
            mo72748b();
            this.f89361b.mo19214h();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<C35456b> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f89360a.an_();
        } else {
            this.f89360a.ao_();
        }
        this.f89360a.mo50304b(list);
    }

    /* renamed from: a */
    public final void mo47018a(List<C35456b> list, boolean z) {
        this.f89360a.mo54798c(C34004b.m77718b().needSessionListShowMore());
        if (!z) {
            this.f89360a.an_();
        } else {
            this.f89360a.ao_();
        }
        this.f89360a.mo50303a(list);
        if (list.isEmpty()) {
            mo72748b();
            this.f89361b.mo19213g();
            return;
        }
        this.f89361b.mo19209d();
    }

    public C34688a(Activity activity, C34624i iVar, DmtStatusView dmtStatusView) {
        this.f89362c = activity;
        this.f89360a = iVar;
        this.f89361b = dmtStatusView;
        this.f89361b.mo19212f();
        this.f89360a.mo54798c(true);
        if (!C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
        C11182d.m22641a().mo20663a((C11198g) this.f89363d);
    }
}
