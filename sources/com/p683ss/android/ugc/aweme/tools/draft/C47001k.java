package com.p683ss.android.ugc.aweme.tools.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter;
import com.p683ss.android.ugc.aweme.tools.C46797a;
import com.p683ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.C46951a;
import com.p683ss.android.ugc.aweme.tools.draft.p2355a.C46960b;
import com.p683ss.android.ugc.aweme.tools.draft.p2355a.C46960b.C46961a;
import com.p683ss.android.ugc.aweme.tools.draft.p2355a.C46971d;
import com.p683ss.android.ugc.aweme.tools.draft.p2356b.C46979c;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.utils.C47808df;
import com.p683ss.android.ugc.aweme.views.C48189f;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import p2628d.C52847n;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52634f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.k */
public final class C47001k extends C23526a implements C46951a {

    /* renamed from: A */
    private boolean f118711A;

    /* renamed from: a */
    View f118712a;

    /* renamed from: b */
    ButtonTitleBar f118713b;

    /* renamed from: c */
    DmtStatusView f118714c;

    /* renamed from: d */
    RecyclerView f118715d;

    /* renamed from: e */
    TextView f118716e;

    /* renamed from: j */
    public TextView f118717j;

    /* renamed from: k */
    FrameLayout f118718k;

    /* renamed from: l */
    public boolean f118719l;

    /* renamed from: m */
    public C46953a f118720m;

    /* renamed from: n */
    public Set<C29059c> f118721n = new HashSet();

    /* renamed from: o */
    boolean f118722o;

    /* renamed from: p */
    boolean f118723p;

    /* renamed from: q */
    ObjectAnimator f118724q;

    /* renamed from: r */
    public C46960b f118725r;

    /* renamed from: s */
    long f118726s;

    /* renamed from: t */
    public Map<C29059c, List<? extends Effect>> f118727t = new LinkedHashMap();

    /* renamed from: u */
    public C0198r<Boolean> f118728u = new C0198r<>();

    /* renamed from: v */
    public Map<C29059c, Boolean> f118729v = new HashMap();

    /* renamed from: w */
    private Map<ImageView, C13715a<C14042c>> f118730w = new WeakHashMap();

    /* renamed from: x */
    private ObjectAnimator f118731x;

    /* renamed from: y */
    private DraftListener f118732y = new DraftListenerAdapter() {
        public final void onDraftDelete(C29059c cVar) {
            if (cVar != null) {
                C46953a aVar = C47001k.this.f118720m;
                String ak = cVar.mo58774ak();
                if (aVar.f70670n != null) {
                    for (C29059c cVar2 : aVar.f70670n) {
                        if (TextUtils.equals(ak, cVar2.mo58774ak())) {
                            aVar.mo94260a(cVar2);
                            return;
                        }
                    }
                }
            }
        }

        public final void onDraftUpdate(C29059c cVar) {
            if (C47001k.this.isViewValid()) {
                C46953a aVar = C47001k.this.f118720m;
                if (aVar.getItemCount() != 0 && cVar != null) {
                    int size = aVar.f70670n.size();
                    for (int i = 0; i < size; i++) {
                        C29059c cVar2 = (C29059c) aVar.f70670n.get(i);
                        if (cVar2 != null && C9431p.m18665a(cVar.mo58774ak(), cVar2.mo58774ak())) {
                            aVar.f70670n.set(i, cVar);
                            aVar.notifyItemChanged(i);
                        }
                    }
                }
            }
        }

        public final void onDraftCheckedChanged(C29059c cVar, boolean z) {
            if (z) {
                C47001k.this.f118721n.add(cVar);
            } else {
                C47001k.this.f118721n.remove(cVar);
            }
            C47001k.this.f118716e.setText(C2240a.m6772a(C47001k.this.getString(R.string.nr), new Object[]{Integer.valueOf(C47001k.this.f118721n.size())}));
            if (C47001k.this.f118719l) {
                TextView textView = C47001k.this.f118717j;
                String string = C47001k.this.getString(R.string.dg7);
                Object[] objArr = new Object[1];
                long j = 0;
                for (C29059c cVar2 : C47001k.this.f118721n) {
                    j += cVar2.f76123A;
                }
                objArr[0] = C46979c.m102028a(j, false);
                textView.setText(C2240a.m6772a(string, objArr));
            }
            if (C47001k.this.f118721n.size() <= 0) {
                C47001k.this.mo94293j();
                return;
            }
            if (C47001k.this.f118718k.getVisibility() != 0) {
                C47001k kVar = C47001k.this;
                if (kVar.f118718k.getVisibility() != 0) {
                    kVar.f118724q = ObjectAnimator.ofFloat(kVar.f118718k, "translationY", new float[]{(float) kVar.f118718k.getMeasuredHeight(), 0.0f}).setDuration(200);
                    kVar.f118724q.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            C47001k.this.f118718k.setVisibility(0);
                        }
                    });
                    kVar.f118724q.start();
                }
            }
        }
    };

    /* renamed from: z */
    private Map<C29059c, List<StickerItemModel>> f118733z;

    /* renamed from: a */
    public final void mo94252a(View view, C29059c cVar) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo94288e() {
        this.f118711A = false;
        this.f118714c.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo94290g() {
        if (this.f118719l) {
            return "storage_management";
        }
        return "personal_homepage";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo94294k() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: f */
    public final void mo94289f() {
        if (this.f118711A) {
            mo94288e();
            C10691a.m21543b(getContext(), (int) R.string.g00, 0).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo94285a() {
        if (this.f118733z == null || this.f118733z.isEmpty()) {
            C47808df.m103446a(this.f118728u, Boolean.valueOf(true));
        } else {
            this.f118725r.mo94266a(this.f118733z, new C46971d<Map<C29059c, ? extends List<? extends Effect>>>() {
                public final C52628e getContext() {
                    return C52634f.INSTANCE;
                }

                /* renamed from: a */
                public final void mo94268a(Throwable th) {
                    C47808df.m103446a(C47001k.this.f118728u, Boolean.valueOf(false));
                    StringBuilder sb = new StringBuilder("DraftBoxFragment : refreshDraftList , updateEffect --- resumeWithException : ");
                    sb.append(C50203g.m108360b(th));
                    C50203g.m108361b(sb.toString());
                }

                /* renamed from: a */
                public final /* synthetic */ void mo94267a(Object obj) {
                    for (Entry entry : ((Map) obj).entrySet()) {
                        final C29059c cVar = (C29059c) entry.getKey();
                        List list = (List) entry.getValue();
                        C46960b bVar = C47001k.this.f118725r;
                        C52711k.m112240b(list, "effects");
                        List arrayList = new ArrayList();
                        Iterable iterable = list;
                        Collection arrayList2 = new ArrayList();
                        for (Object next : iterable) {
                            if (!C46960b.m102008a((Effect) next)) {
                                arrayList2.add(next);
                            }
                        }
                        arrayList.addAll((List) arrayList2);
                        C47001k.m102067a(cVar, list);
                        C47001k.this.f118727t.put(cVar, arrayList);
                        if (arrayList.isEmpty()) {
                            C47001k.this.f118729v.put(cVar, Boolean.valueOf(true));
                        } else {
                            C47001k.this.f118725r.mo94265a(new C52847n(cVar, arrayList), false, new C46971d<C52847n<? extends C29059c, Boolean>>() {
                                public final C52628e getContext() {
                                    return C52634f.INSTANCE;
                                }

                                /* renamed from: a */
                                public final /* synthetic */ void mo94267a(Object obj) {
                                    C52847n nVar = (C52847n) obj;
                                    C47001k.this.f118729v.put(nVar.getFirst(), nVar.getSecond());
                                }

                                /* renamed from: a */
                                public final void mo94268a(Throwable th) {
                                    StringBuilder sb = new StringBuilder("DraftBoxFragment : refreshDraftList , downloadEffect --- resumeWithException : ");
                                    sb.append(C50203g.m108360b(th));
                                    C50203g.m108361b(sb.toString());
                                    C47001k.this.f118729v.put(cVar, Boolean.valueOf(false));
                                }
                            });
                        }
                    }
                    C47808df.m103446a(C47001k.this.f118728u, Boolean.valueOf(true));
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo94291h() {
        new C10643a(getContext()).mo18899b((int) R.string.aoc).mo18900b((int) R.string.vj, (OnClickListener) null).mo18886a((int) R.string.ao2, (OnClickListener) new C47015q(this)).mo18897a().mo18882b();
    }

    /* renamed from: j */
    public final void mo94293j() {
        this.f118721n.clear();
        if (this.f118718k.getVisibility() != 8) {
            this.f118731x = ObjectAnimator.ofFloat(this.f118718k, "translationY", new float[]{(float) this.f118718k.getMeasuredHeight()}).setDuration(200);
            this.f118731x.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C47001k.this.f118718k.setVisibility(8);
                }
            });
            this.f118731x.start();
        }
    }

    public final void onDestroy() {
        for (C13715a close : this.f118730w.values()) {
            close.close();
        }
        this.f118730w.clear();
        super.onDestroy();
    }

    public final void onDestroyView() {
        C46994b.m102064a().unregisterDraftListener(this.f118732y);
        if (this.f118731x != null) {
            this.f118731x.removeAllListeners();
            this.f118731x.cancel();
        }
        if (this.f118724q != null) {
            this.f118724q.removeAllListeners();
            this.f118724q.cancel();
        }
        super.onDestroyView();
    }

    public final void onStart() {
        super.onStart();
        mo94293j();
        if (C46994b.m102064a().getPublishFormDraftCancel()) {
            C46994b.m102064a().setPublishFormDraftCancel(false);
            return;
        }
        if (this.f118720m != null) {
            this.f118720m.mo54785f();
        }
        this.f118714c.mo19212f();
        C46797a.m101642a().execute(new C47012n(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo94292i() {
        if (this.f118722o) {
            this.f118713b.getEndBtn().setText(getText(R.string.np));
            this.f118713b.getStartBtn().setVisibility(8);
            this.f118713b.getTitleView().setVisibility(8);
        } else {
            this.f118713b.getEndBtn().setText(getText(R.string.nq));
            this.f118713b.getStartBtn().setVisibility(0);
            this.f118713b.getTitleView().setVisibility(0);
            mo94293j();
        }
        this.f118720m.mo94261a(this.f118722o);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0011 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94287a(java.util.List<com.p683ss.android.ugc.aweme.draft.model.C29059c> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "awemeDrafts"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = r13
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0087
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.draft.model.c r2 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r2
            com.ss.android.ugc.aweme.draft.model.b r5 = r2.f76142T
            boolean r5 = r5.f76062aB
            r6 = 0
            if (r5 == 0) goto L_0x0028
            r5 = r2
            goto L_0x0029
        L_0x0028:
            r5 = r6
        L_0x0029:
            if (r5 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r5 = r5.mo58735L()
            if (r5 == 0) goto L_0x006f
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r5 = r5.stickers
            if (r5 == 0) goto L_0x006f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r5 = r5.iterator()
        L_0x0042:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x006b
            java.lang.Object r8 = r5.next()
            r9 = r8
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r9 = (com.p683ss.android.ugc.aweme.infosticker.StickerItemModel) r9
            int r10 = r9.type
            r11 = 3
            if (r10 == r11) goto L_0x0058
            int r10 = r9.type
            if (r10 != 0) goto L_0x0064
        L_0x0058:
            java.lang.String r9 = r9.stickerId
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0064
            r9 = 1
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            if (r9 == 0) goto L_0x0042
            r7.add(r8)
            goto L_0x0042
        L_0x006b:
            r5 = r7
            java.util.List r5 = (java.util.List) r5
            goto L_0x0070
        L_0x006f:
            r5 = r6
        L_0x0070:
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x007b
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x007c
        L_0x007b:
            r3 = 1
        L_0x007c:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = r6
        L_0x0081:
            if (r5 == 0) goto L_0x0011
            r0.put(r2, r5)
            goto L_0x0011
        L_0x0087:
            java.util.Map r0 = (java.util.Map) r0
            r12.f118733z = r0
            java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel>> r0 = r12.f118733z
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b7
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.draft.model.c r1 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r1
            java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> r2 = r12.f118729v
            java.lang.Object r2 = r2.get(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0095
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0095
            java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel>> r2 = r12.f118733z
            r2.remove(r1)
            goto L_0x0095
        L_0x00b7:
            java.util.Iterator r13 = r13.iterator()
        L_0x00bb:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r13.next()
            com.ss.android.ugc.aweme.draft.model.c r0 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r0
            java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel>> r1 = r12.f118733z
            java.util.Set r1 = r1.keySet()
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x00dd
            java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> r1 = r12.f118729v
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.put(r0, r2)
            goto L_0x00bb
        L_0x00dd:
            java.util.Map<com.ss.android.ugc.aweme.draft.model.c, java.lang.Boolean> r1 = r12.f118729v
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r1.put(r0, r2)
            goto L_0x00bb
        L_0x00e7:
            r12.mo94285a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C47001k.mo94287a(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo94286a(C29059c cVar, long j) {
        if (this.f118711A) {
            mo94288e();
            C47019u.m102111a(getContext(), cVar, 0, j);
        }
    }

    /* renamed from: a */
    public static void m102067a(C29059c cVar, List<? extends Effect> list) {
        InfoStickerModel L = cVar.mo58735L();
        if (L != null) {
            List<StickerItemModel> list2 = L.stickers;
            if (list2 != null && !list2.isEmpty()) {
                for (StickerItemModel stickerItemModel : list2) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Effect effect = (Effect) it.next();
                        if (stickerItemModel.stickerId.equals(effect.getEffectId()) && !stickerItemModel.path.equals(effect.getUnzipPath())) {
                            stickerItemModel.path = effect.getUnzipPath();
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo94251a(int i, final C29059c cVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (!cVar.f76142T.f76062aB || !C46961a.m102012a()) {
            C47019u.m102111a(getContext(), cVar, 0, currentTimeMillis);
            return;
        }
        Boolean bool = (Boolean) this.f118729v.get(cVar);
        if (bool != null && bool.booleanValue()) {
            C47019u.m102111a(getContext(), cVar, 0, currentTimeMillis);
        } else if (!C47016r.m102089a(getContext())) {
            C10691a.m21543b(getContext(), (int) R.string.g01, 0).mo19066a();
        } else {
            this.f118711A = true;
            this.f118714c.mo19212f();
            this.f118728u.observe(this, new C0199s<Boolean>() {
                public final /* synthetic */ void onChanged(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        C47001k.this.f118728u.removeObserver(this);
                        if (bool.booleanValue()) {
                            Boolean bool2 = (Boolean) C47001k.this.f118729v.get(cVar);
                            if (bool2 == null || !bool2.booleanValue()) {
                                List list = (List) C47001k.this.f118727t.get(cVar);
                                if (list == null || list.isEmpty()) {
                                    C47001k.this.mo94286a(cVar, currentTimeMillis);
                                    return;
                                }
                                C47001k.this.f118725r.mo94265a(new C52847n(cVar, list), true, new C46971d<C52847n<? extends C29059c, Boolean>>() {
                                    public final C52628e getContext() {
                                        return C52634f.INSTANCE;
                                    }

                                    /* renamed from: a */
                                    public final void mo94268a(Throwable th) {
                                        StringBuilder sb = new StringBuilder("DraftBoxFragment : onEdit , downloadEffect --- resumeWithException : ");
                                        sb.append(C50203g.m108360b(th));
                                        C50203g.m108361b(sb.toString());
                                        C47001k.this.mo94289f();
                                    }

                                    /* renamed from: a */
                                    public final /* synthetic */ void mo94267a(Object obj) {
                                        C52847n nVar = (C52847n) obj;
                                        if (((Boolean) nVar.getSecond()).booleanValue()) {
                                            C47001k.this.f118729v.put(nVar.getFirst(), nVar.getSecond());
                                            C47001k.this.mo94286a(cVar, currentTimeMillis);
                                            return;
                                        }
                                        C47001k.this.mo94289f();
                                    }
                                });
                                return;
                            }
                            C47001k.this.mo94286a(cVar, currentTimeMillis);
                            return;
                        }
                        C47001k.this.mo94285a();
                        C47001k.this.mo94289f();
                    }
                }
            });
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 19) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f118712a.getLayoutParams().height = C11065a.m22390a((Context) activity);
            }
        }
        this.f118713b.setTitle(getText(R.string.atv));
        this.f118713b.getStartBtn().setVisibility(0);
        this.f118713b.getEndBtn().setVisibility(0);
        this.f118713b.getEndBtn().setText(getText(R.string.nq));
        this.f118713b.getEndBtn().setBackgroundColor(0);
        this.f118715d.setOverScrollMode(2);
        this.f118715d.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
        RecyclerView recyclerView = this.f118715d;
        C48189f fVar = new C48189f(getResources().getColor(R.color.arz), (int) C9432q.m18687b((Context) getActivity(), 0.0f), 1, C9432q.m18687b((Context) getActivity(), 0.0f), C9432q.m18687b((Context) getActivity(), 0.0f), false);
        recyclerView.mo4798a((C1331h) fVar);
        this.f118720m = new C46953a(this.f118730w, this);
        this.f118720m.f118640b = this.f118719l;
        this.f118720m.mo54798c(false);
        this.f118720m.f118641c = new C47014p(this);
        this.f118715d.setAdapter(this.f118720m);
        this.f118714c.setBuilder(C10719a.m21676a(getContext()));
        ButtonTitleBar buttonTitleBar = this.f118713b;
        C52711k.m112240b(this, "$this$adjustNewDraftUIInternal");
        C52711k.m112240b(buttonTitleBar, "mTitleBar");
        this.f118713b.getEndBtn().setTypeface(Typeface.create(this.f118713b.getEndBtn().getTypeface(), 0), 0);
        this.f118713b.getEndBtn().setFontType(C10751d.f28902a);
        this.f118713b.getEndBtn().setTextSize(1, 17.0f);
        this.f118713b.getTitleView().setTextSize(1, 17.0f);
        C46994b.m102064a().registerDraftListener(this.f118732y);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f118726s = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f118719l = arguments.getBoolean("is_disk_manage_mode", false);
        }
        this.f118725r = new C46960b(this);
        View inflate = layoutInflater.inflate(R.layout.ne, viewGroup, false);
        this.f118713b = (ButtonTitleBar) C1056u.m3051d(inflate, R.id.d10);
        this.f118712a = C1056u.m3051d(inflate, R.id.csm);
        this.f118714c = (DmtStatusView) C1056u.m3051d(inflate, R.id.a8g);
        this.f118715d = (RecyclerView) C1056u.m3051d(inflate, R.id.caf);
        this.f118716e = (TextView) C1056u.m3051d(inflate, R.id.d94);
        if (this.f118719l) {
            if (this.f118717j == null) {
                this.f118717j = (TextView) C1056u.m3051d(inflate, R.id.f2c);
                this.f118717j.setVisibility(0);
            }
            this.f118717j.setVisibility(0);
        }
        this.f118718k = (FrameLayout) C1056u.m3051d(inflate, R.id.b7c);
        if (this.f118719l) {
            this.f118718k.setOnClickListener(new C47010l(this));
        }
        if (this.f118719l) {
            LayoutParams layoutParams = (LayoutParams) this.f118718k.getLayoutParams();
            layoutParams.height = Math.round(C9432q.m18687b(getContext(), 60.0f));
            this.f118718k.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f118716e.getLayoutParams();
            layoutParams2.gravity = 17;
            layoutParams2.topMargin = 0;
            this.f118716e.setLayoutParams(layoutParams2);
        }
        this.f118713b.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                C47001k.this.mo94294k();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                C47001k kVar = C47001k.this;
                kVar.f118722o = !kVar.f118722o;
                kVar.mo94292i();
            }
        });
        this.f118716e.setOnClickListener(new C47011m(this));
        return inflate;
    }
}
