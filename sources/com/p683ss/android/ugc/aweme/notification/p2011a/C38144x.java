package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.a.x */
public class C38144x extends C26840g<BaseNotice> implements C38131m {

    /* renamed from: a */
    public int f97142a;

    /* renamed from: b */
    protected Dialog f97143b;

    /* renamed from: c */
    public C38145a f97144c;

    /* renamed from: d */
    public List<BaseNotice> f97145d;

    /* renamed from: e */
    private Activity f97146e;

    /* renamed from: f */
    private int f97147f;

    /* renamed from: g */
    private String f97148g;

    /* renamed from: h */
    private Map<String, BaseNotice> f97149h = new HashMap(this.f97147f);

    /* renamed from: com.ss.android.ugc.aweme.notification.a.x$a */
    public interface C38145a {
        /* renamed from: a */
        void mo78119a(int i);
    }

    /* renamed from: g */
    public void mo78118g() {
        this.f97147f = 0;
    }

    /* renamed from: b */
    public final void mo78105b(int i) {
        mo78116c(i);
    }

    /* renamed from: b */
    public final void mo50304b(List<BaseNotice> list) {
        super.mo50304b(mo78117e(list));
    }

    /* renamed from: a */
    public final void mo50303a(List<BaseNotice> list) {
        this.f97145d = list;
        super.mo50303a(mo78117e(list));
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        this.f70682s = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        C1352v a_ = super.mo49730a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setText(R.string.dle);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo19207c().mo19231b((View) dmtTextView));
        return a_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo78116c(int i) {
        if (this.f97143b == null || !this.f97143b.isShowing()) {
            C26891a aVar = new C26891a(this.f97146e);
            aVar.mo54844a((CharSequence[]) new String[]{this.f97146e.getResources().getString(R.string.ao2)}, (OnClickListener) new C38146y(this, i));
            this.f97143b = aVar.mo54842a();
            this.f97143b.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<BaseNotice> mo78117e(List<BaseNotice> list) {
        if (this.f97143b != null && this.f97143b.isShowing()) {
            this.f97143b.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        for (BaseNotice baseNotice : list) {
            if (this.f97142a == 0) {
                if (baseNotice.getFollowNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 1) {
                if (baseNotice.getDiggNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 2) {
                if (baseNotice.getAtMe() != null || baseNotice.getDuetNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 4) {
                if (baseNotice.getAnnouncement() != null || baseNotice.getChallengeNotice() != null || baseNotice.getTextNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 62) {
                if (baseNotice.getTcmNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 5) {
                if (baseNotice.getTextNotice() != null || baseNotice.getAnnouncement() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 10) {
                if (baseNotice.getAnnouncement() != null || baseNotice.getChallengeNotice() != null || baseNotice.getTextNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 7) {
                if (baseNotice.getAdHelperNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f97142a == 11) {
                if (baseNotice.getFriendNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (baseNotice.getCommentNotice() != null || baseNotice.getVoteNotice() != null) {
                arrayList.add(baseNotice);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1352v mo48221a(ViewGroup viewGroup, int i) {
        C38114b bVar;
        if (this.f97142a == 0) {
            bVar = new C38125h(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2f, viewGroup, false), this.f97146e);
        } else if (this.f97142a == 1) {
            bVar = new C38132n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2h, viewGroup, false), this.f97146e);
        } else if (this.f97142a == 2) {
            bVar = new C38113a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2i, viewGroup, false), this.f97146e);
        } else if (this.f97142a == 11) {
            bVar = new C38127j(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2g, viewGroup, false), this.f97146e);
        } else if (this.f97142a == 4 || this.f97142a == 5 || this.f97142a == 7 || this.f97142a == 62 || this.f97142a == 10) {
            bVar = new C38120f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2d, viewGroup, false), this.f97146e, this.f97142a, false);
        } else {
            bVar = new C38119e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2c, viewGroup, false), this.f97146e);
        }
        if (bVar.mo78083a()) {
            bVar.f97003a = this;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo48222a(C1352v vVar, int i) {
        boolean z;
        if (i > this.f97147f - 1) {
            z = true;
        } else {
            z = false;
        }
        BaseNotice baseNotice = (BaseNotice) this.f70670n.get(i);
        if (!z && this.f97149h.get(baseNotice.getNid()) != null) {
            z = true;
        }
        if (this.f97142a == 0) {
            ((C38125h) vVar).mo78091a(this.f97149h, baseNotice, z, this.f97148g);
        } else if (this.f97142a == 1) {
            ((C38132n) vVar).mo78091a(this.f97149h, baseNotice, z, this.f97148g);
        } else if (this.f97142a == 2) {
            ((C38113a) vVar).mo78091a(this.f97149h, baseNotice, z, this.f97148g);
        } else if (this.f97142a == 11) {
            ((C38127j) vVar).mo78091a(this.f97149h, baseNotice, z, this.f97148g);
        } else if (this.f97142a == 4 || this.f97142a == 5 || this.f97142a == 7 || this.f97142a == 62 || this.f97142a == 10) {
            ((C38120f) vVar).mo78091a(this.f97149h, baseNotice, z, this.f97148g);
        } else {
            if (this.f97142a == 3) {
                ((C38119e) vVar).mo78091a(this.f97149h, baseNotice, z, this.f97148g);
            }
        }
    }

    public C38144x(int i, Activity activity, int i2, String str) {
        this.f97142a = i;
        this.f97146e = activity;
        this.f97147f = Math.max(0, i2);
        this.f97148g = str;
    }
}
