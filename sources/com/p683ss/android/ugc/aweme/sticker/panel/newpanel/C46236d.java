package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.p1057b.p1060c.C17592aq;
import com.p683ss.android.ugc.aweme.filter.C31417ar;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46134a;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46137c;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b.C46142e;
import com.p683ss.android.ugc.aweme.sticker.panel.newpanel.model.EmptyStickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.p2509b.C50209b;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d */
public final class C46236d extends C50209b<StickerWrapper> {

    /* renamed from: f */
    public static final C46237a f116651f = new C46237a(null);

    /* renamed from: a */
    public int f116652a = 1;

    /* renamed from: b */
    public C46086b f116653b;

    /* renamed from: c */
    C17592aq<String, String> f116654c;

    /* renamed from: d */
    AVDmtPanelRecyleView f116655d;

    /* renamed from: e */
    public int f116656e;

    /* renamed from: g */
    private List<? extends StickerWrapper> f116657g;

    /* renamed from: h */
    private HashMap<String, Integer> f116658h;

    /* renamed from: i */
    private final C46241e f116659i;

    /* renamed from: j */
    private final C46354l f116660j;

    /* renamed from: u */
    private final C45814b f116661u;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d$a */
    public static final class C46237a {
        private C46237a() {
        }

        public /* synthetic */ C46237a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d$b */
    public static final class C46238b extends C1352v {

        /* renamed from: a */
        final AVDmtTextView f116662a;

        public C46238b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.d98);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_desc)");
            this.f116662a = (AVDmtTextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d$c */
    public static final class C46239c extends C1352v {

        /* renamed from: a */
        final AVStatusView f116663a;

        public C46239c(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.bqk);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.new_sticker_loading)");
            this.f116663a = (AVStatusView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d$d */
    public interface C46240d {
        /* renamed from: a */
        void mo92938a(int i, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d$e */
    public static final class C46241e implements C46240d {

        /* renamed from: a */
        final /* synthetic */ C46236d f116664a;

        C46241e(C46236d dVar) {
            this.f116664a = dVar;
        }

        /* renamed from: a */
        public final void mo92938a(int i, boolean z) {
            if (!z) {
                this.f116664a.f116656e = i;
            } else if (i == this.f116664a.f116656e) {
                C46236d dVar = this.f116664a;
                Application b = C39629l.m88233b();
                C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                Resources resources = b.getResources();
                C52711k.m112236a((Object) resources, "CameraClient.getApplication().resources");
                C46249k.f116686i = 200.0f / ((float) resources.getDisplayMetrics().densityDpi);
                AVDmtPanelRecyleView aVDmtPanelRecyleView = dVar.f116655d;
                if (aVDmtPanelRecyleView != null) {
                    aVDmtPanelRecyleView.mo4833d(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.d$f */
    public static final class C46242f extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C46236d f116665a;

        C46242f(C46236d dVar) {
            this.f116665a = dVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            this.f116665a.f116656e = DynamicTabYellowPointVersion.DEFAULT;
        }
    }

    /* renamed from: b */
    public final List<StickerWrapper> mo92825b() {
        return this.f116657g;
    }

    /* renamed from: a */
    public final void mo64318a(List<? extends StickerWrapper> list) {
        if (list != null) {
            this.f116657g = list;
            this.f116658h = C46057f.m100059c(list);
            C46057f.m100057a(this.f116654c, list);
            super.mo64318a(list);
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (!(recyclerView instanceof AVDmtPanelRecyleView)) {
            recyclerView = null;
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) recyclerView;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo4801a((C1340m) new C46242f(this));
        }
        this.f116655d = aVDmtPanelRecyleView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo64315a(int r3) {
        /*
            r2 = this;
            java.util.List r0 = r2.mo92825b()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.sticker.panel.newpanel.model.EmptyStickerWrapper
            if (r0 == 0) goto L_0x0016
            r3 = 1007(0x3ef, float:1.411E-42)
            return r3
        L_0x0016:
            java.util.List r0 = r2.mo92825b()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.sticker.panel.newpanel.model.LoadingStickerWrapper
            if (r0 == 0) goto L_0x002b
            r3 = 1006(0x3ee, float:1.41E-42)
            return r3
        L_0x002b:
            java.util.List r0 = r2.mo92825b()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            boolean r0 = com.p683ss.android.ugc.aweme.sticker.StickerWrapper.m99612a(r0)
            if (r0 == 0) goto L_0x0042
            r3 = 1005(0x3ed, float:1.408E-42)
            return r3
        L_0x0042:
            java.util.List r0 = r2.mo92825b()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r0 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f115779a
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            boolean r0 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100095s(r0)
            if (r0 == 0) goto L_0x005d
            r3 = 1003(0x3eb, float:1.406E-42)
            return r3
        L_0x005d:
            java.util.List r0 = r2.mo92825b()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r3 = r0.get(r3)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r3 = (com.p683ss.android.ugc.aweme.sticker.StickerWrapper) r3
            if (r3 == 0) goto L_0x006d
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r3.f115779a
        L_0x006d:
            boolean r3 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100087k(r1)
            if (r3 == 0) goto L_0x0076
            r3 = 1004(0x3ec, float:1.407E-42)
            return r3
        L_0x0076:
            r3 = 1001(0x3e9, float:1.403E-42)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46236d.mo64315a(int):int");
    }

    public C46236d(C46354l lVar, C45814b bVar) {
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(bVar, "selectedController");
        this.f116660j = lVar;
        this.f116661u = bVar;
        C31417ar c = C31417ar.m73204c();
        C52711k.m112236a((Object) c, "SpecializedMultimap.create()");
        this.f116654c = c;
        this.f116656e = DynamicTabYellowPointVersion.DEFAULT;
        this.f116659i = new C46241e(this);
    }

    /* renamed from: a */
    public final int mo92937a(String str, Effect effect) {
        Integer num;
        if (effect == null || str == null) {
            return -1;
        }
        HashMap<String, Integer> hashMap = this.f116658h;
        if (hashMap != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(effect.getEffectId());
            num = (Integer) hashMap.get(sb.toString());
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final C1352v mo64316a(ViewGroup viewGroup, int i) {
        Context context = null;
        switch (i) {
            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                return new C46134a(LayoutInflater.from(context).inflate(R.layout.xo, viewGroup, false), this.f116660j, this.f116661u, this.f116657g);
            case 1004:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.fg, viewGroup, false);
                C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…new_panel, parent, false)");
                C46354l lVar = this.f116660j;
                C45814b bVar = this.f116661u;
                List<? extends StickerWrapper> list = this.f116657g;
                if (list == null) {
                    list = C52575l.m112097a();
                }
                C46137c cVar = new C46137c(inflate, lVar, bVar, list);
                cVar.f116431a = this.f116653b;
                return cVar;
            case 1005:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.xr, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…r_divider, parent, false)");
                return new C46244f(inflate2);
            case 1006:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.fu, viewGroup, false);
                C52711k.m112236a((Object) inflate3, "LayoutInflater.from(pare…r_loading, parent, false)");
                return new C46239c(inflate3);
            case 1007:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate4 = LayoutInflater.from(context).inflate(R.layout.ft, viewGroup, false);
                C52711k.m112236a((Object) inflate4, "LayoutInflater.from(pare…ist_empty, parent, false)");
                return new C46238b(inflate4);
            default:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                C46142e eVar = new C46142e(LayoutInflater.from(context).inflate(R.layout.xo, viewGroup, false), this.f116660j, this.f116661u, this.f116657g);
                eVar.f116457j = this.f116659i;
                eVar.f116448a = this.f116653b;
                return eVar;
        }
    }

    /* renamed from: a */
    public final void mo64317a(C1352v vVar, int i) {
        StickerWrapper stickerWrapper = null;
        switch (getItemViewType(i)) {
            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                if (vVar != null) {
                    C46134a aVar = (C46134a) vVar;
                    List<? extends StickerWrapper> list = this.f116657g;
                    if (list != null) {
                        stickerWrapper = (StickerWrapper) list.get(i);
                    }
                    aVar.mo92832a(stickerWrapper, this.f116657g, i);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.defaultpanel.viewholder.EffectGameViewHolder");
            case 1004:
                if (vVar != null) {
                    C46137c cVar = (C46137c) vVar;
                    List<? extends StickerWrapper> list2 = this.f116657g;
                    if (list2 != null) {
                        stickerWrapper = (StickerWrapper) list2.get(i);
                    }
                    List<? extends StickerWrapper> list3 = this.f116657g;
                    if (list3 == null) {
                        list3 = C52575l.m112097a();
                    }
                    cVar.mo92834a(stickerWrapper, list3, this.f116652a, i);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.defaultpanel.viewholder.EffectLockStickerViewHolder");
            case 1005:
                if (vVar == null) {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.newpanel.NewStickerDividerViewHolder");
                }
                return;
            case 1006:
                if (vVar != null) {
                    C46239c cVar2 = (C46239c) vVar;
                    cVar2.f116663a.mo98093a();
                    cVar2.f116663a.mo98095b();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerAdapter.NewStickerLoadingViewHolder");
            case 1007:
                List<? extends StickerWrapper> list4 = this.f116657g;
                if (list4 != null) {
                    stickerWrapper = (StickerWrapper) list4.get(i);
                }
                if (stickerWrapper != null) {
                    String str = ((EmptyStickerWrapper) stickerWrapper).f116699h;
                    if (vVar != null) {
                        C46238b bVar = (C46238b) vVar;
                        C52711k.m112240b(str, "description");
                        bVar.f116662a.setText(str);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerAdapter.NewStickerEmptyViewHolder");
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.newpanel.model.EmptyStickerWrapper");
            default:
                if (vVar != null) {
                    C46142e eVar = (C46142e) vVar;
                    eVar.f116457j = this.f116659i;
                    List<? extends StickerWrapper> list5 = this.f116657g;
                    if (list5 != null) {
                        stickerWrapper = (StickerWrapper) list5.get(i);
                    }
                    eVar.mo92842a(stickerWrapper, this.f116657g, this.f116652a, i);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.defaultpanel.viewholder.EffectStickerViewHolder");
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (!C9376b.m18558a((Collection<T>) list)) {
            Object obj = list.get(0);
            if (obj != null) {
                StickerWrapper stickerWrapper = (StickerWrapper) obj;
                if (getItemViewType(i) == 1001) {
                    C46142e eVar = (C46142e) vVar;
                    eVar.f116457j = this.f116659i;
                    if (C45859b.m99701b(this.f116660j, stickerWrapper.f115779a)) {
                        eVar.mo92838a(true);
                    } else {
                        eVar.mo92838a(false);
                    }
                } else if (getItemViewType(i) == 1003) {
                    C46134a aVar = (C46134a) vVar;
                    if (C45859b.m99701b(this.f116660j, stickerWrapper.f115779a)) {
                        aVar.mo92838a(true);
                    } else {
                        aVar.mo92838a(false);
                    }
                } else {
                    if (getItemViewType(i) == 1004) {
                        C46137c cVar = (C46137c) vVar;
                        if (C45859b.m99701b(this.f116660j, stickerWrapper.f115779a)) {
                            cVar.f116433c.animate().alpha(1.0f).setDuration(150).start();
                        } else {
                            cVar.f116433c.animate().alpha(0.0f).setDuration(150).start();
                        }
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.StickerWrapper");
            }
        } else {
            super.onBindViewHolder(vVar, i, list);
        }
    }
}
