package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0521c;
import android.support.design.widget.TabLayout.C0526f;
import android.support.p030v4.app.C0654k;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.C44619d;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2233a.C44583b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44627g;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.views.ChallengeViewPager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i */
public final class C44666i extends C44619d {

    /* renamed from: f */
    public static final C44667a f112988f = new C44667a(null);

    /* renamed from: a */
    TabLayout f112989a;

    /* renamed from: b */
    public ChallengeViewPager f112990b;

    /* renamed from: c */
    VoteStruct f112991c;

    /* renamed from: d */
    public C44668b f112992d;

    /* renamed from: e */
    public C44627g f112993e;

    /* renamed from: g */
    private View f112994g;

    /* renamed from: h */
    private C44583b f112995h;

    /* renamed from: i */
    private DmtTextView f112996i;

    /* renamed from: j */
    private ImageView f112997j;

    /* renamed from: k */
    private HashMap f112998k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$a */
    public static final class C44667a {
        private C44667a() {
        }

        public /* synthetic */ C44667a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C44666i m97708a(VoteStruct voteStruct) {
            int i;
            if (voteStruct != null) {
                List options = voteStruct.getOptions();
                if (options != null) {
                    i = options.size();
                } else {
                    i = 0;
                }
                if (i >= 2) {
                    C44666i iVar = new C44666i();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_vote", voteStruct);
                    iVar.setArguments(bundle);
                    return iVar;
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$b */
    public interface C44668b {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$c */
    static final class C44669c implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C44666i f112999a;

        C44669c(C44666i iVar) {
            this.f112999a = iVar;
        }

        /* JADX WARNING: type inference failed for: r5v3, types: [android.support.v4.view.ViewPager] */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r0v2 */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r0v5 */
        /* JADX WARNING: type inference failed for: r0v6 */
        /* JADX WARNING: type inference failed for: r0v7, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: type inference failed for: r0v9 */
        /* JADX WARNING: type inference failed for: r0v10 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5
          assigns: []
          uses: []
          mth insns count: 27
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onShow(android.content.DialogInterface r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r5 = r4.f112999a
                com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = r5.f112990b
                android.support.v4.view.ViewPager r5 = (android.support.p030v4.view.ViewPager) r5
                r0 = r5
            L_0x0007:
                r1 = 0
                if (r0 == 0) goto L_0x002b
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                boolean r3 = r2 instanceof android.support.design.widget.CoordinatorLayout.C0505d
                if (r3 == 0) goto L_0x001b
                android.support.design.widget.CoordinatorLayout$d r2 = (android.support.design.widget.CoordinatorLayout.C0505d) r2
                android.support.design.widget.CoordinatorLayout$Behavior r2 = r2.f1693a
                boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior
                if (r2 == 0) goto L_0x001b
                goto L_0x002c
            L_0x001b:
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0029
                boolean r2 = r0 instanceof android.view.View
                if (r2 != 0) goto L_0x0026
                goto L_0x0029
            L_0x0026:
                android.view.View r0 = (android.view.View) r0
                goto L_0x0007
            L_0x0029:
                r0 = r1
                goto L_0x0007
            L_0x002b:
                r0 = r1
            L_0x002c:
                if (r0 == 0) goto L_0x0036
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a$a r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a$a
                r2.<init>(r5, r0)
                r5.addOnPageChangeListener(r2)
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44666i.C44669c.onShow(android.content.DialogInterface):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$d */
    static final class C44670d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44666i f113000a;

        C44670d(C44666i iVar) {
            this.f113000a = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
            if (r5 == null) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ef, code lost:
            if (r5 == null) goto L_0x00f1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0135  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r0 = r11.f113000a
                android.content.Context r1 = r0.getContext()
                if (r1 == 0) goto L_0x0145
                android.support.design.widget.TabLayout r1 = r0.f112989a
                if (r1 == 0) goto L_0x0013
                com.ss.android.ugc.aweme.views.ChallengeViewPager r2 = r0.f112990b
                android.support.v4.view.ViewPager r2 = (android.support.p030v4.view.ViewPager) r2
                r1.setupWithViewPager(r2)
            L_0x0013:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l
                android.content.Context r2 = r0.getContext()
                r3 = 1
                r1.<init>(r2, r3)
                android.widget.TableLayout$LayoutParams r2 = new android.widget.TableLayout$LayoutParams
                r4 = -1
                r2.<init>(r4, r4)
                android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
                r1.setLayoutParams(r2)
                r2 = 0
                r1.setPadding(r2, r2, r2, r2)
                android.support.design.widget.TabLayout r5 = r0.f112989a
                if (r5 != 0) goto L_0x0033
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0033:
                android.support.design.widget.TabLayout$f r5 = r5.getTabAt(r2)
                if (r5 == 0) goto L_0x003e
                android.view.View r1 = (android.view.View) r1
                r5.mo1593a(r1)
            L_0x003e:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l
                android.content.Context r5 = r0.getContext()
                r1.<init>(r5, r2)
                android.widget.TableLayout$LayoutParams r5 = new android.widget.TableLayout$LayoutParams
                r5.<init>(r4, r4)
                android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
                r1.setLayoutParams(r5)
                r1.setPadding(r2, r2, r2, r2)
                android.support.design.widget.TabLayout r4 = r0.f112989a
                if (r4 != 0) goto L_0x005b
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x005b:
                android.support.design.widget.TabLayout$f r4 = r4.getTabAt(r3)
                if (r4 == 0) goto L_0x0066
                android.view.View r1 = (android.view.View) r1
                r4.mo1593a(r1)
            L_0x0066:
                android.support.design.widget.TabLayout r1 = r0.f112989a
                if (r1 != 0) goto L_0x006d
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x006d:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$f r4 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$f
                r4.<init>()
                android.support.design.widget.TabLayout$b r4 = (android.support.design.widget.TabLayout.C0520b) r4
                r1.addOnTabSelectedListener(r4)
                android.support.design.widget.TabLayout r1 = r0.f112989a
                if (r1 != 0) goto L_0x007e
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x007e:
                android.support.design.widget.TabLayout$f r1 = r1.getTabAt(r2)
                r4 = 0
                if (r1 == 0) goto L_0x0088
                android.view.View r1 = r1.f1805f
                goto L_0x0089
            L_0x0088:
                r1 = r4
            L_0x0089:
                if (r1 == 0) goto L_0x013d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l r1 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44687l) r1
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r0.f112991c
                if (r5 == 0) goto L_0x00a5
                java.util.List r5 = r5.getOptions()
                if (r5 == 0) goto L_0x00a5
                java.lang.Object r5 = r5.get(r2)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
                if (r5 == 0) goto L_0x00a5
                java.lang.String r5 = r5.getOptionText()
                if (r5 != 0) goto L_0x00a7
            L_0x00a5:
                java.lang.String r5 = ""
            L_0x00a7:
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r0.f112991c
                r7 = 0
                if (r6 == 0) goto L_0x00c0
                java.util.List r6 = r6.getOptions()
                if (r6 == 0) goto L_0x00c0
                java.lang.Object r6 = r6.get(r2)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r6 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r6
                if (r6 == 0) goto L_0x00c0
                long r9 = r6.getVoteCount()
                goto L_0x00c1
            L_0x00c0:
                r9 = r7
            L_0x00c1:
                r1.mo90661a(r5, r9)
                android.support.design.widget.TabLayout r1 = r0.f112989a
                if (r1 != 0) goto L_0x00cb
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00cb:
                android.support.design.widget.TabLayout$f r1 = r1.getTabAt(r3)
                if (r1 == 0) goto L_0x00d4
                android.view.View r1 = r1.f1805f
                goto L_0x00d5
            L_0x00d4:
                r1 = r4
            L_0x00d5:
                if (r1 == 0) goto L_0x0135
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l r1 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44687l) r1
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r0.f112991c
                if (r5 == 0) goto L_0x00f1
                java.util.List r5 = r5.getOptions()
                if (r5 == 0) goto L_0x00f1
                java.lang.Object r5 = r5.get(r3)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
                if (r5 == 0) goto L_0x00f1
                java.lang.String r5 = r5.getOptionText()
                if (r5 != 0) goto L_0x00f3
            L_0x00f1:
                java.lang.String r5 = ""
            L_0x00f3:
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r0.f112991c
                if (r6 == 0) goto L_0x0109
                java.util.List r6 = r6.getOptions()
                if (r6 == 0) goto L_0x0109
                java.lang.Object r6 = r6.get(r3)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r6 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r6
                if (r6 == 0) goto L_0x0109
                long r7 = r6.getVoteCount()
            L_0x0109:
                r1.mo90661a(r5, r7)
                android.support.design.widget.TabLayout r1 = r0.f112989a
                if (r1 != 0) goto L_0x0113
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0113:
                android.support.design.widget.TabLayout$f r1 = r1.getTabAt(r3)
                if (r1 == 0) goto L_0x011b
                android.view.View r4 = r1.f1805f
            L_0x011b:
                if (r4 == 0) goto L_0x012d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.l r4 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44687l) r4
                r4.setSelect(r2)
                android.support.design.widget.TabLayout r0 = r0.f112989a
                if (r0 != 0) goto L_0x0129
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0129:
                r0.setSelectedTabIndicatorHeight(r2)
                goto L_0x0145
            L_0x012d:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
                r0.<init>(r1)
                throw r0
            L_0x0135:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
                r0.<init>(r1)
                throw r0
            L_0x013d:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
                r0.<init>(r1)
                throw r0
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44666i.C44670d.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$e */
    static final class C44671e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44666i f113001a;

        C44671e(C44666i iVar) {
            this.f113001a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113001a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$f */
    public static final class C44672f implements C0521c {
        C44672f() {
        }

        /* renamed from: a */
        public final void mo1577a(C0526f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1805f;
            } else {
                view = null;
            }
            C44687l lVar = (C44687l) view;
            if (lVar != null) {
                lVar.setSelect(true);
            }
        }

        /* renamed from: b */
        public final void mo1578b(C0526f fVar) {
            View view;
            if (fVar != null) {
                view = fVar.f1805f;
            } else {
                view = null;
            }
            C44687l lVar = (C44687l) view;
            if (lVar != null) {
                lVar.setSelect(false);
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f112998k != null) {
            this.f112998k.clear();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setStyle(0, R.style.gt);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_vote");
        } else {
            serializable = null;
        }
        this.f112991c = (VoteStruct) serializable;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnShowListener(new C44669c(this));
        return onCreateDialog;
    }

    public final void show(C0654k kVar, String str) {
        C52711k.m112240b(kVar, "manager");
        C52711k.m112240b(str, "tag");
        try {
            super.show(kVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r7 = "inflater"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            r7 = 0
            r0 = 2132216543(0x7f170adf, float:2.0076987E38)
            android.view.View r5 = r5.inflate(r0, r6, r7)
            java.lang.String r6 = "inflater.inflate(R.layou…dialog, container, false)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r4.f112994g = r5
            android.view.View r5 = r4.f112994g
            if (r5 != 0) goto L_0x001d
            java.lang.String r6 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x001d:
            r6 = 2132023234(0x7f1417c2, float:1.968491E38)
            android.view.View r5 = r5.findViewById(r6)
            android.support.design.widget.TabLayout r5 = (android.support.design.widget.TabLayout) r5
            r4.f112989a = r5
            android.view.View r5 = r4.f112994g
            if (r5 != 0) goto L_0x0031
            java.lang.String r6 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0031:
            r6 = 2132024610(0x7f141d22, float:1.96877E38)
            android.view.View r5 = r5.findViewById(r6)
            com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = (com.p683ss.android.ugc.aweme.views.ChallengeViewPager) r5
            r4.f112990b = r5
            android.view.View r5 = r4.f112994g
            if (r5 != 0) goto L_0x0045
            java.lang.String r6 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0045:
            r6 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r5 = r5.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            r4.f112996i = r5
            android.view.View r5 = r4.f112994g
            if (r5 != 0) goto L_0x0059
            java.lang.String r6 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0059:
            r6 = 2132019975(0x7f140b07, float:1.96783E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f112997j = r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b r5 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b
            android.support.v4.app.k r6 = r4.getChildFragmentManager()
            java.lang.String r0 = "childFragmentManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r5.<init>(r6)
            r4.f112995h = r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b r5 = r4.f112995h
            if (r5 != 0) goto L_0x007b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007b:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f112797a
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r4.f112991c
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a r6 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d.C44596a.C44597a.m97558a(r7, r6)
            r5.add(r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b r5 = r4.f112995h
            if (r5 != 0) goto L_0x008d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x008d:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f112797a
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r4.f112991c
            r0 = 1
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a r6 = com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d.C44596a.C44597a.m97558a(r0, r6)
            r5.add(r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b r5 = r4.f112995h
            if (r5 != 0) goto L_0x00a0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a0:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f112797a
            java.lang.Object r5 = r5.get(r7)
            if (r5 == 0) goto L_0x0163
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a r5 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d.C44596a) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r6 = r4.f112993e
            r5.f112812b = r6
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b r5 = r4.f112995h
            if (r5 != 0) goto L_0x00b5
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b5:
            java.util.List<android.support.v4.app.Fragment> r5 = r5.f112797a
            java.lang.Object r5 = r5.get(r0)
            if (r5 == 0) goto L_0x015b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.a r5 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2236d.C44596a) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r6 = r4.f112993e
            r5.f112812b = r6
            com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = r4.f112990b
            if (r5 == 0) goto L_0x00ca
            r5.setPagingEnable(r7)
        L_0x00ca:
            com.ss.android.ugc.aweme.views.ChallengeViewPager r5 = r4.f112990b
            if (r5 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b r6 = r4.f112995h
            android.support.v4.view.PagerAdapter r6 = (android.support.p030v4.view.PagerAdapter) r6
            r5.setAdapter(r6)
        L_0x00d5:
            android.support.design.widget.TabLayout r5 = r4.f112989a
            if (r5 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$d r6 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$d
            r6.<init>(r4)
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.post(r6)
        L_0x00e3:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r4.f112991c
            r1 = 0
            if (r5 == 0) goto L_0x00fc
            java.util.List r5 = r5.getOptions()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r5.get(r7)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
            if (r5 == 0) goto L_0x00fc
            long r5 = r5.getVoteCount()
            goto L_0x00fd
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r4.f112991c
            if (r3 == 0) goto L_0x0113
            java.util.List r3 = r3.getOptions()
            if (r3 == 0) goto L_0x0113
            java.lang.Object r3 = r3.get(r0)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
            if (r3 == 0) goto L_0x0113
            long r1 = r3.getVoteCount()
        L_0x0113:
            r3 = 0
            long r5 = r5 + r1
            java.lang.String r5 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r4.f112996i
            if (r6 == 0) goto L_0x0143
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2132551928(0x7f1c28f8, float:2.0757229E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "resources.getString(R.string.vote_total)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r7] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r5 = com.C2240a.m6772a(r1, r5)
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
        L_0x0143:
            android.widget.ImageView r5 = r4.f112997j
            if (r5 == 0) goto L_0x0151
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$e r6 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i$e
            r6.<init>(r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
        L_0x0151:
            android.view.View r5 = r4.f112994g
            if (r5 != 0) goto L_0x015a
            java.lang.String r6 = "rootView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x015a:
            return r5
        L_0x015b:
            d.u r5 = new d.u
            java.lang.String r6 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment"
            r5.<init>(r6)
            throw r5
        L_0x0163:
            d.u r5 = new d.u
            java.lang.String r6 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44666i.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
