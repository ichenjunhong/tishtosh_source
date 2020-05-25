package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44601b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2233a.C44582a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44627g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44633e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44633e.C44634a;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a */
public final class C44596a extends C23526a implements C26846a, C26877c<User> {

    /* renamed from: c */
    public static final C44597a f112810c = new C44597a(null);

    /* renamed from: a */
    public C44633e f112811a;

    /* renamed from: b */
    public C44627g f112812b;

    /* renamed from: d */
    private VoteStruct f112813d;

    /* renamed from: e */
    private int f112814e;

    /* renamed from: j */
    private View f112815j;

    /* renamed from: k */
    private RecyclerView f112816k;

    /* renamed from: l */
    private DmtStatusView f112817l;

    /* renamed from: m */
    private C44582a f112818m;

    /* renamed from: n */
    private HashMap f112819n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a$a */
    public static final class C44597a {
        private C44597a() {
        }

        public /* synthetic */ C44597a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C44596a m97558a(int i, VoteStruct voteStruct) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_state", i);
            if (voteStruct != null) {
                bundle.putSerializable("key_vote", voteStruct);
            }
            C44596a aVar = new C44596a();
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a$b */
    static final class C44598b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44596a f112820a;

        C44598b(C44596a aVar) {
            this.f112820a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112820a.mo90522h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a$c */
    static final class C44599c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44596a f112821a;

        /* renamed from: b */
        final /* synthetic */ C44601b f112822b;

        /* renamed from: c */
        final /* synthetic */ List f112823c;

        C44599c(C44596a aVar, C44601b bVar, List list) {
            this.f112821a = aVar;
            this.f112822b = bVar;
            this.f112823c = list;
        }

        public final void run() {
            C44633e eVar = this.f112821a.f112811a;
            if (eVar != null) {
                eVar.mo90587a(this.f112822b);
            }
            this.f112821a.mo47018a(this.f112823c, this.f112822b.f112829b);
        }
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            C44582a aVar = this.f112818m;
            if (aVar != null) {
                aVar.am_();
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C44633e eVar = this.f112811a;
        if (eVar != null) {
            eVar.f112912b.dispose();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f112819n != null) {
            this.f112819n.clear();
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f112817l;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(0);
            }
            DmtStatusView dmtStatusView2 = this.f112817l;
            if (dmtStatusView2 != null) {
                dmtStatusView2.mo19212f();
            }
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f112817l;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(0);
            }
            DmtStatusView dmtStatusView2 = this.f112817l;
            if (dmtStatusView2 != null) {
                dmtStatusView2.mo19213g();
            }
        }
    }

    public final void ar_() {
        long optionId;
        if (this.f112813d == null) {
            aJ_();
        }
        C44633e eVar = this.f112811a;
        if (eVar != null) {
            VoteStruct voteStruct = this.f112813d;
            if (voteStruct == null) {
                C52711k.m112234a();
            }
            long voteId = voteStruct.getVoteId();
            long j = 0;
            if (this.f112814e == 0) {
                VoteStruct voteStruct2 = this.f112813d;
                if (voteStruct2 == null) {
                    C52711k.m112234a();
                }
                List options = voteStruct2.getOptions();
                if (options != null) {
                    OptionsBean optionsBean = (OptionsBean) options.get(0);
                    if (optionsBean != null) {
                        optionId = optionsBean.getOptionId();
                    }
                }
                eVar.f112911a.getVoteDetail(voteId, j, eVar.f112913c.f112828a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C44634a<Object>(eVar));
            }
            VoteStruct voteStruct3 = this.f112813d;
            if (voteStruct3 == null) {
                C52711k.m112234a();
            }
            List options2 = voteStruct3.getOptions();
            if (options2 != null) {
                OptionsBean optionsBean2 = (OptionsBean) options2.get(1);
                if (optionsBean2 != null) {
                    optionId = optionsBean2.getOptionId();
                }
            }
            eVar.f112911a.getVoteDetail(voteId, j, eVar.f112913c.f112828a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C44634a<Object>(eVar));
            j = optionId;
            eVar.f112911a.getVoteDetail(voteId, j, eVar.f112913c.f112828a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C44634a<Object>(eVar));
        }
    }

    /* renamed from: h */
    public final void mo90522h() {
        C44633e eVar = this.f112811a;
        if (eVar != null) {
            VoteStruct voteStruct = this.f112813d;
            if (voteStruct == null) {
                C52711k.m112234a();
            }
            long voteId = voteStruct.getVoteId();
            long j = 0;
            if (this.f112814e == 0) {
                VoteStruct voteStruct2 = this.f112813d;
                if (voteStruct2 == null) {
                    C52711k.m112234a();
                }
                List options = voteStruct2.getOptions();
                if (options != null) {
                    OptionsBean optionsBean = (OptionsBean) options.get(0);
                    if (optionsBean != null) {
                        j = optionsBean.getOptionId();
                    }
                }
            } else {
                VoteStruct voteStruct3 = this.f112813d;
                if (voteStruct3 == null) {
                    C52711k.m112234a();
                }
                List options2 = voteStruct3.getOptions();
                if (options2 != null) {
                    OptionsBean optionsBean2 = (OptionsBean) options2.get(1);
                    if (optionsBean2 != null) {
                        j = optionsBean2.getOptionId();
                    }
                }
            }
            eVar.mo90586a(voteId, j);
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f112817l;
            if (dmtStatusView != null) {
                dmtStatusView.mo19214h();
            }
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            C44582a aVar = this.f112818m;
            if (aVar != null) {
                aVar.co_();
            }
        }
    }

    /* renamed from: a */
    private final DmtTextView m97548a(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context, "context!!");
        dmtTextView.setTextColor(context.getResources().getColor(R.color.iy));
        dmtTextView.setText(i);
        dmtTextView.setTextSize(13.0f);
        return dmtTextView;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("key_state");
        } else {
            i = 0;
        }
        this.f112814e = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_vote");
        } else {
            serializable = null;
        }
        this.f112813d = (VoteStruct) serializable;
        this.f112811a = new C44633e(this, this.f112812b, this.f112814e);
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        if (isViewValid()) {
            if (!z) {
                C44582a aVar = this.f112818m;
                if (aVar != null) {
                    aVar.an_();
                }
            } else {
                C44582a aVar2 = this.f112818m;
                if (aVar2 != null) {
                    aVar2.ao_();
                }
            }
            DmtStatusView dmtStatusView = this.f112817l;
            if (dmtStatusView != null) {
                dmtStatusView.mo19209d();
            }
            C44582a aVar3 = this.f112818m;
            if (aVar3 != null) {
                aVar3.mo50303a(list);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r4 == null) goto L_0x002a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47026b(java.util.List<com.p683ss.android.ugc.aweme.profile.model.User> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a r0 = r2.f112818m
            if (r0 == 0) goto L_0x000f
            r1 = 0
            r0.mo54798c(r1)
        L_0x000f:
            if (r4 != 0) goto L_0x0019
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a r4 = r2.f112818m
            if (r4 == 0) goto L_0x0020
            r4.an_()
            goto L_0x0020
        L_0x0019:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a r4 = r2.f112818m
            if (r4 == 0) goto L_0x0020
            r4.ao_()
        L_0x0020:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a r4 = r2.f112818m
            if (r4 == 0) goto L_0x002a
            java.util.List r4 = r4.mo50673a()
            if (r4 != 0) goto L_0x0031
        L_0x002a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
        L_0x0031:
            if (r3 == 0) goto L_0x0045
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.util.Collection r3 = (java.util.Collection) r3
            r4.addAll(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a r3 = r2.f112818m
            if (r3 == 0) goto L_0x0045
            r3.mo50304b(r4)
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a r3 = r2.f112818m
            if (r3 == 0) goto L_0x004e
            r4 = 1
            r3.mo54798c(r4)
            return
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d.C44596a.mo47026b(java.util.List, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (com.bytedance.common.utility.p522b.C9376b.m18558a((java.util.Collection<T>) r4) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r4 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r1 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (com.bytedance.common.utility.p522b.C9376b.m18558a((java.util.Collection<T>) r4) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r4 == null) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            super.onViewCreated(r4, r5)
            int r4 = r3.f112814e
            r5 = 1
            r0 = 0
            if (r4 != 0) goto L_0x0040
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r4 = r3.f112812b
            if (r4 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r4 = r4.mo90582b()
            if (r4 == 0) goto L_0x001c
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r4.f112830a
            if (r4 != 0) goto L_0x0023
        L_0x001c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r1 = r3.f112812b
            if (r1 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = r1.mo90582b()
            if (r1 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r1 = r1.f112831b
            if (r1 != 0) goto L_0x0036
        L_0x0031:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b
            r1.<init>(r0, r0)
        L_0x0036:
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 == 0) goto L_0x0076
            goto L_0x0088
        L_0x0040:
            int r4 = r3.f112814e
            if (r4 != r5) goto L_0x0088
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r4 = r3.f112812b
            if (r4 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r4 = r4.mo90582b()
            if (r4 == 0) goto L_0x0052
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r4.f112832c
            if (r4 != 0) goto L_0x0059
        L_0x0052:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
        L_0x0059:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r1 = r3.f112812b
            if (r1 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r1 = r1.mo90582b()
            if (r1 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r1 = r1.f112833d
            if (r1 != 0) goto L_0x006c
        L_0x0067:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b
            r1.<init>(r0, r0)
        L_0x006c:
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 == 0) goto L_0x0076
            goto L_0x0088
        L_0x0076:
            r3.mo47017R_()
            android.support.v7.widget.RecyclerView r0 = r3.f112816k
            if (r0 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a$c r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a$c
            r2.<init>(r3, r1, r4)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0.post(r2)
        L_0x0087:
            r0 = 1
        L_0x0088:
            if (r0 != 0) goto L_0x008d
            r3.mo90522h()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d.C44596a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DmtStatusView dmtStatusView;
        C52711k.m112240b(layoutInflater, "inflater");
        this.f112815j = layoutInflater.inflate(R.layout.awe, viewGroup, false);
        View view = this.f112815j;
        RecyclerView recyclerView = null;
        if (view != null) {
            dmtStatusView = (DmtStatusView) view.findViewById(R.id.csv);
        } else {
            dmtStatusView = null;
        }
        this.f112817l = dmtStatusView;
        if (view != null) {
            recyclerView = (RecyclerView) view.findViewById(R.id.cak);
        }
        this.f112816k = recyclerView;
        this.f112818m = new C44582a();
        C44582a aVar = this.f112818m;
        if (aVar != null) {
            aVar.mo54788a((C26846a) this);
        }
        RecyclerView recyclerView2 = this.f112816k;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f112818m);
        }
        RecyclerView recyclerView3 = this.f112816k;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        DmtStatusView dmtStatusView2 = this.f112817l;
        if (dmtStatusView2 != null) {
            C10719a a = C10719a.m21676a(dmtStatusView2.getContext());
            try {
                DmtTextView a2 = m97548a(R.string.c0e);
                DmtTextView a3 = m97548a(R.string.fd4);
                a2.setOnClickListener(new C44598b(this));
                a.mo19231b((View) a3).mo19234c((View) a2);
            } catch (Exception unused) {
            }
            dmtStatusView2.setBuilder(a);
        }
        return this.f112815j;
    }
}
