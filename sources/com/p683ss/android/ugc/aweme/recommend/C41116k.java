package com.p683ss.android.ugc.aweme.recommend;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26892b;
import com.p683ss.android.ugc.aweme.friends.experiment.RecommendUserDialogItemViewStyle;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p683ss.android.ugc.aweme.friends.model.RecommendUserHint;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39801e;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.recommend.C41128p.C41129a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.recommend.k */
public class C41116k extends C26892b implements OnClickListener, C23452y<User>, C39981o {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f104491a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41116k.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/recommend/RecommendUserDialogAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41116k.class), "mEnterFrom", "getMEnterFrom()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41116k.class), "mPreviousPage", "getMPreviousPage()Ljava/lang/String;"))};

    /* renamed from: e */
    public static final C41117a f104492e = new C41117a(null);

    /* renamed from: b */
    C39993z f104493b;

    /* renamed from: c */
    public boolean f104494c;

    /* renamed from: d */
    public final C41113i f104495d = new C41113i();

    /* renamed from: f */
    private final C52668f f104496f = C52732g.m112286a(C52757k.NONE, new C41119c(this));

    /* renamed from: g */
    private final C52668f f104497g = C52732g.m112286a(C52757k.NONE, new C41121d(this));

    /* renamed from: h */
    private final C52668f f104498h = C52732g.m112286a(C52757k.NONE, new C41122e(this));

    /* renamed from: i */
    private boolean f104499i;

    /* renamed from: j */
    private HashMap f104500j;

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$a */
    public static final class C41117a {
        private C41117a() {
        }

        public /* synthetic */ C41117a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo83630a(C0654k kVar, RecommendUserDialogList recommendUserDialogList, String str, String str2) {
            C52711k.m112240b(kVar, "fragmentManager");
            C52711k.m112240b(recommendUserDialogList, "data");
            Fragment a = kVar.mo2224a("RecommendUserDialogFragment");
            if (!(a instanceof C41116k)) {
                a = null;
            }
            C41116k kVar2 = (C41116k) a;
            if (kVar2 == null) {
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                kVar2 = new C41116k();
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", recommendUserDialogList);
                bundle.putSerializable("enter_from", str);
                bundle.putSerializable("previous_page", str2);
                kVar2.setArguments(bundle);
            }
            if (!kVar2.isAdded()) {
                kVar.mo2225a().mo2178a((Fragment) kVar2, "RecommendUserDialogFragment").mo2195c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$b */
    public static final class C41118b extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C41116k f104501a;

        C41118b(C41116k kVar) {
            this.f104501a = kVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (!this.f104501a.f104495d.f104482b && i == 1) {
                this.f104501a.f104495d.f104482b = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$c */
    static final class C41119c extends C52712l implements C52670a<C41114j> {

        /* renamed from: a */
        final /* synthetic */ C41116k f104502a;

        /* renamed from: com.ss.android.ugc.aweme.recommend.k$c$a */
        static final class C41120a implements C26846a {

            /* renamed from: a */
            final /* synthetic */ C41119c f104503a;

            C41120a(C41119c cVar) {
                this.f104503a = cVar;
            }

            public final void ar_() {
                C41116k kVar = this.f104503a.f104502a;
                kVar.mo83627a().am_();
                C39993z zVar = kVar.f104493b;
                if (zVar != null) {
                    zVar.mo81915a(30);
                }
            }
        }

        C41119c(C41116k kVar) {
            this.f104502a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41114j jVar = new C41114j(this.f104502a, this.f104502a.mo83628b());
            jVar.mo54788a((C26846a) new C41120a(this));
            return jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$d */
    static final class C41121d extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C41116k f104504a;

        C41121d(C41116k kVar) {
            this.f104504a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f104504a.getArguments();
            if (arguments != null) {
                return arguments.getString("enter_from");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$e */
    static final class C41122e extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ C41116k f104505a;

        C41122e(C41116k kVar) {
            this.f104505a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.f104505a.getArguments();
            if (arguments != null) {
                return arguments.getString("previous_page");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$f */
    static final class C41123f implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C41116k f104506a;

        C41123f(C41116k kVar) {
            this.f104506a = kVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            C41116k kVar = this.f104506a;
            if (RecommendUserDialogPauseWhenShowing.m90740a()) {
                if (!C48121w.m104087I()) {
                    C48021h M = C48121w.m104249M();
                    C52711k.m112236a((Object) M, "PlayerManager.inst()");
                    if (M.mo95257o()) {
                        C48121w.m104249M().mo95293z();
                        kVar.f104494c = true;
                    }
                }
                C50130a a = C50130a.m108170a();
                C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
                if (a.mo97926b()) {
                    C50130a.m108170a().mo60215af();
                    kVar.f104494c = true;
                }
            }
            C26890h.m65011a("show_suggested_accounts_pop_up", new C23089d().mo47829a("enter_from", this.f104506a.mo83628b()).f61491a);
            C41113i iVar = this.f104506a.f104495d;
            if (!iVar.f104483c) {
                iVar.f104483c = true;
                iVar.f104481a = 0;
                iVar.f104484d = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: a */
    private View m90803a(int i) {
        if (this.f104500j == null) {
            this.f104500j = new HashMap();
        }
        View view = (View) this.f104500j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f104500j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C41114j mo83627a() {
        return (C41114j) this.f104496f.getValue();
    }

    /* renamed from: b */
    public final String mo83628b() {
        return (String) this.f104497g.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f104500j != null) {
            this.f104500j.clear();
        }
    }

    public void onResume() {
        super.onResume();
        C41113i iVar = this.f104495d;
        if (!iVar.f104483c) {
            iVar.f104484d = System.currentTimeMillis();
        }
    }

    public void onPause() {
        super.onPause();
        C41113i iVar = this.f104495d;
        if (iVar.f104483c) {
            iVar.f104483c = false;
            iVar.f104481a += System.currentTimeMillis() - iVar.f104484d;
        }
    }

    public void dismiss() {
        String str;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        if (this.f104494c) {
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95291x();
            } else {
                C50130a.m108170a().mo60214ae();
            }
            this.f104494c = false;
        }
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        C41129a.m90819a().f104518a.storeLong("dialog_last_shown_timestamp", instance.getTimeInMillis());
        C41113i iVar = this.f104495d;
        if (iVar.f104483c) {
            iVar.f104483c = false;
            iVar.f104481a += System.currentTimeMillis() - iVar.f104484d;
            if (iVar.f104482b || iVar.f104481a > 4000) {
                C41129a.m90819a().f104518a.storeInt("dialog_close_without_action_in_times", 0);
            } else {
                C41128p a = C41129a.m90819a();
                int i = a.f104518a.getInt("dialog_close_without_action_in_times", 0) + 1;
                a.f104518a.storeInt("dialog_close_without_action_in_times", i);
                if (i >= 2) {
                    Calendar instance2 = Calendar.getInstance();
                    C52711k.m112236a((Object) instance2, "it");
                    instance2.setTimeInMillis(System.currentTimeMillis());
                    instance2.set(11, 0);
                    instance2.set(12, 0);
                    instance2.set(13, 0);
                    instance2.add(6, 30);
                    a.f104518a.storeLong("dialog_close_without_action_in_times_maximum_timestamp", instance2.getTimeInMillis());
                }
            }
        }
        String str2 = "close_suggested_accounts_pop_up";
        C23089d a2 = new C23089d().mo47829a("enter_from", mo83628b());
        String str3 = "click_method";
        if (this.f104499i) {
            str = "button";
        } else {
            str = "blank";
        }
        C26890h.m65011a(str2, a2.mo47829a(str3, str).f61491a);
        if (TextUtils.equals(mo83628b(), "personal_collection") || TextUtils.equals(mo83628b(), "personal_homepage")) {
            C47718bf.m103288a(new C39801e());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a5a);
    }

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
        int i;
        if (mo54846j() && recommendList != null && (recommendList instanceof RecommendUserDialogList)) {
            List recommendUsers = ((RecommendUserDialogList) recommendList).getRecommendUsers();
            C39993z zVar = this.f104493b;
            if (zVar != null) {
                i = zVar.mo81926f();
            } else {
                i = 0;
            }
            if (i != 0) {
                mo83627a().mo50304b(recommendUsers);
                if (recommendList.hasMore()) {
                    mo83627a().ao_();
                    return;
                }
            }
            mo83627a().an_();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCancelable(true);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            window.addFlags(67108864);
            window.setAttributes(attributes);
        }
        onCreateDialog.setOnShowListener(new C41123f(this));
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo60634a(RecommendList recommendList) {
        boolean z;
        if (mo54846j() && recommendList != null && (recommendList instanceof RecommendUserDialogList)) {
            RecommendUserDialogList recommendUserDialogList = (RecommendUserDialogList) recommendList;
            Collection recommendUsers = recommendUserDialogList.getRecommendUsers();
            if (recommendUsers == null || recommendUsers.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo83627a().mo54785f();
                mo83627a().mo54798c(false);
                return;
            }
            mo83627a().mo54798c(true);
            mo83627a().mo50303a(recommendUserDialogList.getRecommendUsers());
            if (recommendList.hasMore()) {
                mo83627a().ao_();
                return;
            }
            mo83627a().an_();
        }
    }

    public void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.atp) {
            if (mo54846j()) {
                this.f104495d.f104482b = true;
                C41114j a = mo83627a();
                RecyclerView recyclerView = (RecyclerView) m90803a((int) R.id.ca3);
                C52711k.m112236a((Object) recyclerView, "recyclerView");
                C1332i layoutManager = recyclerView.getLayoutManager();
                if (a.f70670n != null) {
                    List list = a.f70670n;
                    C52711k.m112236a((Object) list, "mItems");
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (((User) it.next()) instanceof RecommendUserHint) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        User user = a.f104486a;
                        if (a.f70670n != null) {
                            a.f70670n.add(0, user);
                            a.notifyItemInserted(0);
                        }
                        if (layoutManager != null) {
                            layoutManager.mo4741e(0);
                        }
                    } else if (i == 0 && i >= 0 && i < a.f70670n.size()) {
                        a.f70670n.remove(i);
                        a.notifyItemRemoved(i);
                    }
                }
            }
        } else if (num != null && num.intValue() == R.id.ue) {
            this.f104499i = true;
            dismiss();
        } else if (num != null && num.intValue() == R.id.ei5) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        boolean z;
        if (mo54846j()) {
            Collection a = mo83627a().mo50673a();
            if (a == null || a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mo83627a().mo54798c(true);
                mo83627a().mo54793i();
                return;
            }
            mo83627a().mo54798c(false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        int a = (int) (((float) C9432q.m18670a(getContext())) * 0.8f);
        int b = (int) (((float) C9432q.m18688b(getContext())) * 0.8f);
        View findViewById = view.findViewById(R.id.b7b);
        C52711k.m112236a((Object) findViewById, "contentLayout");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = C52753d.m112322d(a, C23728o.m58241a(360.0d));
        layoutParams.height = C52753d.m112322d(b, C23728o.m58241a(480.0d));
        findViewById.requestLayout();
        RecyclerView recyclerView = (RecyclerView) m90803a((int) R.id.ca3);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(mo83627a());
            recyclerView.mo4801a((C1340m) new C41118b(this));
            if (RecommendUserDialogItemViewStyle.m75373a()) {
                C23697k kVar = new C23697k(1, 2, C0726c.m2098c(recyclerView.getContext(), R.color.j5));
                kVar.mo49122a(C23728o.m58241a(12.0d), C23728o.m58241a(12.0d));
                recyclerView.mo4798a((C1331h) kVar);
            }
        }
        ImageView imageView = (ImageView) m90803a((int) R.id.atp);
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = (ImageView) m90803a((int) R.id.ue);
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        FrameLayout frameLayout = (FrameLayout) m90803a((int) R.id.ei5);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) m90803a((int) R.id.b7b);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        if (this.f104493b == null) {
            RecommendCommonUserModel recommendCommonUserModel = new RecommendCommonUserModel();
            Bundle arguments = getArguments();
            RecommendList recommendList = null;
            if (arguments != null) {
                serializable = arguments.getSerializable("data");
            } else {
                serializable = null;
            }
            if (serializable != null) {
                recommendCommonUserModel.setRecommendList((RecommendUserDialogList) serializable);
                this.f104493b = new C39993z(recommendCommonUserModel, this);
                C39993z zVar = this.f104493b;
                if (zVar != null) {
                    recommendList = zVar.mo81924d();
                }
                mo60634a(recommendList);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b9e, viewGroup, false);
    }

    /* renamed from: a */
    private final void m90804a(String str, User user, int i) {
        C26890h.m65011a(str, new C23089d().mo47829a("enter_from", "suggest_account_pop_up").mo47829a("previous_page", mo83628b()).mo47829a("rec_type", user.getRecType()).mo47829a("rec_uid", user.getUid()).mo47826a("impr_order", i).f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        if (r1 == null) goto L_0x0070;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo48614a(int r4, java.lang.Object r5, int r6, android.view.View r7, java.lang.String r8) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p683ss.android.ugc.aweme.profile.model.User) r5
            if (r5 == 0) goto L_0x00fa
            r7 = 1
            switch(r4) {
                case 100: goto L_0x00b5;
                case 101: goto L_0x0010;
                case 102: goto L_0x0008;
                case 103: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x00fa
        L_0x000a:
            java.lang.String r4 = "show_recommend_user_cell"
            r3.m90804a(r4, r5, r6)
            return
        L_0x0010:
            com.ss.android.ugc.aweme.recommend.i r4 = r3.f104495d
            r4.f104482b = r7
            com.ss.android.ugc.aweme.router.w r4 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            android.support.v4.app.FragmentActivity r8 = r3.getActivity()
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://user/profile/"
            r0.<init>(r1)
            java.lang.String r1 = r5.getUid()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.router.y r0 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r0)
            java.lang.String r1 = "sec_user_id"
            java.lang.String r2 = r5.getSecUid()
            com.ss.android.ugc.aweme.router.y r0 = r0.mo83870a(r1, r2)
            java.lang.String r1 = "from_recommend_card"
            com.ss.android.ugc.aweme.router.y r7 = r0.mo83868a(r1, r7)
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "suggest_account_pop_up"
            com.ss.android.ugc.aweme.router.y r7 = r7.mo83870a(r0, r1)
            java.lang.String r0 = "extra_previous_page_position"
            java.lang.String r1 = r3.mo83628b()
            com.ss.android.ugc.aweme.router.y r7 = r7.mo83870a(r0, r1)
            java.lang.String r0 = "recommend_from_type"
            java.lang.String r1 = "list"
            com.ss.android.ugc.aweme.router.y r7 = r7.mo83870a(r0, r1)
            java.lang.String r0 = "enter_from_request_id"
            com.ss.android.ugc.aweme.profile.presenter.z r1 = r3.f104493b
            if (r1 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.friends.model.RecommendList r1 = r1.mo81924d()
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = r1.getRid()
            if (r1 != 0) goto L_0x0072
        L_0x0070:
            java.lang.String r1 = ""
        L_0x0072:
            com.ss.android.ugc.aweme.router.y r7 = r7.mo83870a(r0, r1)
            java.lang.String r7 = r7.mo83871a()
            r4.mo83858a(r8, r7)
            java.lang.String r4 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.f.d r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "enter_from"
            java.lang.String r0 = "suggest_account_pop_up"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r0)
            java.lang.String r8 = "previous_page"
            java.lang.String r0 = r3.mo83628b()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r0)
            java.lang.String r8 = "to_user_id"
            java.lang.String r0 = r5.getUid()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r0)
            java.lang.String r8 = "rec_type"
            java.lang.String r5 = r5.getRecType()
            com.ss.android.ugc.aweme.app.f.d r5 = r7.mo47829a(r8, r5)
            java.lang.String r7 = "impr_order"
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47826a(r7, r6)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r5)
            return
        L_0x00b5:
            com.ss.android.ugc.aweme.recommend.i r4 = r3.f104495d
            r4.f104482b = r7
            boolean r4 = r3.mo54846j()
            if (r4 == 0) goto L_0x00fa
            android.content.Context r4 = r3.getContext()
            boolean r4 = com.p683ss.android.ugc.aweme.recommend.C41124l.m90812a(r4)
            if (r4 != 0) goto L_0x00d8
            android.content.Context r4 = r3.getContext()
            r5 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r4, r5)
            r4.mo19066a()
            return
        L_0x00d8:
            int r4 = r5.getFollowStatus()
            if (r4 == 0) goto L_0x00e0
            r4 = 1
            goto L_0x00e1
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            r4 = r4 ^ r7
            com.ss.android.ugc.aweme.recommend.j r8 = r3.mo83627a()
            int r0 = r5.getFollowStatus()
            r8.mo83626a(r5, r0)
            if (r4 != r7) goto L_0x00f5
            java.lang.String r4 = "follow"
            r3.m90804a(r4, r5, r6)
            return
        L_0x00f5:
            java.lang.String r4 = "follow_cancel"
            r3.m90804a(r4, r5, r6)
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.C41116k.mo48614a(int, java.lang.Object, int, android.view.View, java.lang.String):void");
    }
}
