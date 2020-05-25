package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.jedi.arch.C11939z;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment;
import com.p683ss.android.ugc.aweme.feed.C30134ak;
import com.p683ss.android.ugc.aweme.feed.C30136al;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40484b;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40504k;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40505l;
import com.p683ss.android.ugc.aweme.profile.unlogin.C40514n;
import com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileApi;
import com.p683ss.android.ugc.aweme.profile.util.C40535ai;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dx */
public final class C40357dx {

    /* renamed from: a */
    private C10641a f103017a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dx$a */
    static final class C40358a<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C40242a f103018a;

        /* renamed from: b */
        final /* synthetic */ boolean f103019b;

        C40358a(C40242a aVar, boolean z) {
            this.f103018a = aVar;
            this.f103019b = z;
        }

        public final /* synthetic */ Object then(final C0013i iVar) {
            FragmentActivity activity = this.f103018a.getActivity();
            if (activity == null) {
                return null;
            }
            activity.runOnUiThread(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C40358a f103020a;

                {
                    this.f103020a = r1;
                }

                public final void run() {
                    C0013i iVar = iVar;
                    C52711k.m112236a((Object) iVar, "it");
                    if (!iVar.mo33d()) {
                        C30134ak.m70713c();
                        C0013i iVar2 = iVar;
                        C52711k.m112236a((Object) iVar2, "it");
                        C26890h.m65011a("sync_success", C23089d.m56640a().mo47826a("unlogin_item_sync_cnt", ((C40484b) iVar2.mo34e()).f103346a).f61491a);
                        C40266bq bqVar = this.f103020a.f103018a.f102155am;
                        if (bqVar != null) {
                            bqVar.mo82510w();
                        }
                        if (this.f103020a.f103019b) {
                            C10691a.m21548c((Context) this.f103020a.f103018a.getActivity(), (int) R.string.h66).mo19066a();
                        }
                    } else {
                        C30134ak.m70711a(2);
                        if (this.f103020a.f103019b) {
                            C10691a.m21548c((Context) this.f103020a.f103018a.getActivity(), (int) R.string.h65).mo19066a();
                        }
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dx$b */
    static final class C40360b<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C40357dx f103022a;

        /* renamed from: b */
        final /* synthetic */ C40242a f103023b;

        /* renamed from: c */
        final /* synthetic */ List f103024c;

        C40360b(C40357dx dxVar, C40242a aVar, List list) {
            this.f103022a = dxVar;
            this.f103023b = aVar;
            this.f103024c = list;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            int i;
            C52711k.m112236a((Object) iVar, "it");
            if (!iVar.mo33d()) {
                if (!((C40484b) iVar.mo34e()).f103347b) {
                    i = 1;
                } else {
                    i = 3;
                }
                C30134ak.m70711a(i);
                FragmentActivity activity = this.f103023b.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C40360b f103025a;

                        {
                            this.f103025a = r1;
                        }

                        public final void run() {
                            this.f103025a.f103022a.mo82602a(this.f103025a.f103023b, this.f103025a.f103024c);
                        }
                    });
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dx$c */
    static final class C40362c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40357dx f103026a;

        /* renamed from: b */
        final /* synthetic */ C40242a f103027b;

        /* renamed from: c */
        final /* synthetic */ List f103028c;

        C40362c(C40357dx dxVar, C40242a aVar, List list) {
            this.f103026a = dxVar;
            this.f103027b = aVar;
            this.f103028c = list;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C52711k.m112240b(dialogInterface, "dialog");
            C40357dx.m89725a(this.f103027b, this.f103028c, true);
            C26890h.m65011a("sync_confirm", C23089d.m56640a().f61491a);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dx$d */
    static final class C40363d implements OnClickListener {

        /* renamed from: a */
        public static final C40363d f103029a = new C40363d();

        C40363d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C52711k.m112240b(dialogInterface, "dialog");
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo82601a(C40242a aVar) {
        boolean z;
        C52711k.m112240b(aVar, "fragment");
        if (UnloginDiggShowInProfileExperiment.INSTANCE.mo59615a() && !C40535ai.m103651b() && C30134ak.m70715d() != 3) {
            String[] b = C30134ak.m70712b();
            if (b.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C30136al alVar = C30136al.f78658a;
                C52711k.m112240b(b, "set");
                ArrayList arrayList = new ArrayList();
                for (String a : b) {
                    C11939z a2 = C30136al.m70721a(a);
                    if (a2 != null) {
                        arrayList.add(new C40514n((String) a2.f31624a, String.valueOf(((Number) a2.f31625b).longValue()), ((Number) a2.f31626c).intValue()));
                    }
                    if (arrayList.size() >= C30134ak.f78654c.mo60383a()) {
                        break;
                    }
                }
                List list = arrayList;
                if (C30134ak.m70715d() == 2) {
                    m89725a(aVar, list, false);
                }
                mo82602a(aVar, list);
                if (C30134ak.m70715d() == 0) {
                    int b2 = UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b();
                    C52711k.m112240b(list, "likeList");
                    UnloginProfileApi unloginProfileApi = C40504k.f103376a;
                    String a3 = C47760cd.m103385a(list);
                    C52711k.m112236a((Object) a3, "GsonUtil.toJson(likeList)");
                    unloginProfileApi.syncUnloginDigg(a3, b2, 1).mo19a((C0011g<TResult, TContinuationResult>) new C40360b<TResult,TContinuationResult>(this, aVar, list));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo82602a(C40242a aVar, List<C40514n> list) {
        if (C30134ak.m70715d() == 1 && aVar.f102158ap && aVar.f102775ar) {
            C30134ak.m70711a(3);
            if (!C30134ak.m70716e()) {
                C10641a aVar2 = this.f103017a;
                if (aVar2 != null && aVar2.mo18881a()) {
                    aVar2.dismiss();
                }
                this.f103017a = new C10643a(aVar.getContext()).mo18899b((int) R.string.h61).mo18886a((int) R.string.h5z, (OnClickListener) new C40362c(this, aVar, list)).mo18900b((int) R.string.h60, (OnClickListener) C40363d.f103029a).mo18905b(false).mo18897a();
                C40505l.m89919a();
                C10641a aVar3 = this.f103017a;
                if (aVar3 != null) {
                    aVar3.mo18883c();
                }
            } else {
                m89725a(aVar, list, false);
            }
        }
    }

    /* renamed from: a */
    public static void m89725a(C40242a aVar, List<C40514n> list, boolean z) {
        C30134ak.m70711a(2);
        C40504k.m89918a(list, UnloginDiggShowInProfileExperiment.INSTANCE.mo59616b()).mo19a((C0011g<TResult, TContinuationResult>) new C40358a<TResult,TContinuationResult>(aVar, z));
    }
}
