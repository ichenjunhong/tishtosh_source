package com.p683ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0785g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feedback.n */
public final class C31285n extends C23526a implements C9382a, C31343t {

    /* renamed from: e */
    protected static long f82008e = 0;

    /* renamed from: j */
    private static final Long f82009j = Long.valueOf(500);

    /* renamed from: a */
    Context f82010a;

    /* renamed from: b */
    C9381g f82011b = new C9381g(this);

    /* renamed from: c */
    int f82012c;

    /* renamed from: d */
    boolean f82013d = false;

    /* renamed from: k */
    private List<C31274g> f82014k = new ArrayList();

    /* renamed from: l */
    private boolean f82015l = false;

    /* renamed from: m */
    private C31277h f82016m;

    /* renamed from: n */
    private ListView f82017n;

    /* renamed from: o */
    private ProgressBar f82018o;

    /* renamed from: p */
    private ViewGroup f82019p;

    public final void onResume() {
        super.onResume();
        if (this.f82013d) {
            if (this.f82015l) {
                this.f82013d = false;
                return;
            }
            this.f82012c++;
            this.f82015l = true;
            this.f82018o.setVisibility(8);
            long j = 0;
            if (this.f82014k != null && this.f82014k.size() > 0) {
                j = ((C31274g) this.f82014k.get(this.f82014k.size() - 1)).f81949b;
            }
            C31342s sVar = new C31342s(0, j, -1, (long) this.f82012c, 3);
            new FeedbackThread2((Handler) this.f82011b, this.f82010a, sVar).start();
        }
        this.f82013d = false;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f82010a = getActivity();
        this.f82016m = new C31277h(this.f82010a, this);
        mo20101a(this.f82016m);
        this.f82017n.setAdapter(this.f82016m);
        this.f82012c++;
        this.f82015l = true;
        C0013i.m12a(f82009j.longValue()).mo20a((C0011g<TResult, TContinuationResult>) new C31286o<TResult,TContinuationResult>(this), (Executor) C0013i.f24a);
    }

    public final void handleMsg(Message message) {
        int i;
        Message message2 = message;
        if (isViewValid() && (message2.obj instanceof C31342s)) {
            C31342s sVar = (C31342s) message2.obj;
            if (((long) this.f82012c) == sVar.f82099d) {
                if (message2.what == 11) {
                    if (!(message2.arg1 == 19 || message2.arg1 == 18) || this.f82014k.isEmpty()) {
                        C9432q.m18690b(this.f82010a, 2131952652, getString(C19547d.m47836a(message2.arg1)));
                    }
                    this.f82015l = false;
                    this.f82018o.setVisibility(8);
                    return;
                }
                if (sVar.f82100e == 3) {
                    List<C31274g> list = this.f82014k;
                    List<C31274g> list2 = sVar.f82102g;
                    ArrayList arrayList = new ArrayList();
                    if (list == null || list.size() <= 0) {
                        arrayList.addAll(list2);
                    } else if (list2 != null && list2.size() > 0) {
                        C0785g gVar = new C0785g();
                        for (C31274g gVar2 : list) {
                            gVar.mo2493b(gVar2.f81949b, gVar2);
                        }
                        for (C31274g gVar3 : list2) {
                            if (gVar.mo2488a(gVar3.f81949b, null) == null) {
                                arrayList.add(gVar3);
                            }
                        }
                    }
                    this.f82014k.addAll(arrayList);
                } else if (sVar.f82100e == 4 || sVar.f82100e == 5 || sVar.f82100e == 1) {
                    if (sVar.f82100e == 1) {
                        f82008e = System.currentTimeMillis();
                    }
                    this.f82014k.clear();
                    this.f82014k.addAll(sVar.f82102g);
                } else {
                    return;
                }
                C31277h hVar = this.f82016m;
                List<C31274g> list3 = this.f82014k;
                List<C31274g> list4 = sVar.f82103h;
                hVar.f81970a.clear();
                if (list3 != null && list3.size() > 0) {
                    hVar.f81970a.addAll(list3);
                }
                hVar.notifyDataSetChanged();
                this.f82017n.setSelection(this.f82016m.getCount());
                this.f82015l = false;
                this.f82018o.setVisibility(8);
                if (sVar.f82100e == 5) {
                    if (C31287p.m73013a(this.f82010a)) {
                        this.f82012c++;
                        this.f82015l = true;
                        if (System.currentTimeMillis() - f82008e > 864000000) {
                            i = 1;
                        } else {
                            i = 4;
                        }
                        C31342s sVar2 = new C31342s(0, 0, -1, (long) this.f82012c, i);
                        new FeedbackThread2((Handler) this.f82011b, this.f82010a, sVar2).start();
                        return;
                    }
                    C9432q.m18673a(this.f82010a, 2131952652, (int) R.string.dnd);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64171a(String str, String str2, Bitmap bitmap) {
        if (isViewValid()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof C31284m) {
                ((C31284m) activity).mo64140a(str, str2, bitmap);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b4k, viewGroup, false);
        this.f82017n = (ListView) inflate.findViewById(R.id.bc3);
        this.f82018o = (ProgressBar) inflate.findViewById(R.id.c6g);
        this.f82019p = (ViewGroup) inflate.findViewById(R.id.ze);
        return inflate;
    }
}
