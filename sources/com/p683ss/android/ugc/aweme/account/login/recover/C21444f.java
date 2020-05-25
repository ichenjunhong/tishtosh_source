package com.p683ss.android.ugc.aweme.account.login.recover;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.C21053aa;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21868b;
import com.p683ss.android.ugc.aweme.account.login.recover.C21452i.C21454b;
import com.p683ss.android.ugc.aweme.account.login.recover.C21452i.C21455c;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.utils.C22300g;
import com.p683ss.android.ugc.aweme.account.utils.C22301h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1256aa.C20846a;
import com.p683ss.android.ugc.aweme.p1256aa.C20847b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.f */
public final class C21444f extends C21868b implements C9382a, C21454b {

    /* renamed from: b */
    public static final C21445a f58151b = new C21445a(null);

    /* renamed from: a */
    public C21446b f58152a;

    /* renamed from: c */
    private C9381g f58153c;

    /* renamed from: d */
    private final C21053aa[] f58154d = C22301h.m55191a();

    /* renamed from: e */
    private C21452i f58155e;

    /* renamed from: j */
    private HashMap f58156j;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$a */
    public static final class C21445a {
        private C21445a() {
        }

        public /* synthetic */ C21445a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$b */
    public static final class C21446b implements Serializable {

        /* renamed from: a */
        private final String f58157a;

        /* renamed from: b */
        private final String f58158b;

        /* renamed from: c */
        private final String f58159c;

        /* renamed from: d */
        private final String f58160d;

        /* renamed from: e */
        private final List<String> f58161e;

        /* renamed from: f */
        private final String f58162f;

        /* renamed from: g */
        private final boolean f58163g;

        /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r10v0, types: [java.util.List] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b copy$default(com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.List<java.lang.String> r10, java.lang.String r11, boolean r12, int r13, java.lang.Object r14) {
            /*
                r14 = r13 & 1
                if (r14 == 0) goto L_0x0006
                java.lang.String r6 = r5.f58157a
            L_0x0006:
                r14 = r13 & 2
                if (r14 == 0) goto L_0x000c
                java.lang.String r7 = r5.f58158b
            L_0x000c:
                r14 = r7
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0013
                java.lang.String r8 = r5.f58159c
            L_0x0013:
                r0 = r8
                r7 = r13 & 8
                if (r7 == 0) goto L_0x001a
                java.lang.String r9 = r5.f58160d
            L_0x001a:
                r1 = r9
                r7 = r13 & 16
                if (r7 == 0) goto L_0x0021
                java.util.List<java.lang.String> r10 = r5.f58161e
            L_0x0021:
                r2 = r10
                r7 = r13 & 32
                if (r7 == 0) goto L_0x0028
                java.lang.String r11 = r5.f58162f
            L_0x0028:
                r3 = r11
                r7 = r13 & 64
                if (r7 == 0) goto L_0x002f
                boolean r12 = r5.f58163g
            L_0x002f:
                r4 = r12
                r7 = r5
                r8 = r6
                r9 = r14
                r10 = r0
                r11 = r1
                r12 = r2
                r13 = r3
                r14 = r4
                com.ss.android.ugc.aweme.account.login.recover.f$b r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b.copy$default(com.ss.android.ugc.aweme.account.login.recover.f$b, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, int, java.lang.Object):com.ss.android.ugc.aweme.account.login.recover.f$b");
        }

        public final String component1() {
            return this.f58157a;
        }

        public final String component2() {
            return this.f58158b;
        }

        public final String component3() {
            return this.f58159c;
        }

        public final String component4() {
            return this.f58160d;
        }

        public final List<String> component5() {
            return this.f58161e;
        }

        public final String component6() {
            return this.f58162f;
        }

        public final boolean component7() {
            return this.f58163g;
        }

        public final C21446b copy(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z) {
            C21446b bVar = new C21446b(str, str2, str3, str4, list, str5, z);
            return bVar;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C21446b) {
                    C21446b bVar = (C21446b) obj;
                    if (C52711k.m112239a((Object) this.f58157a, (Object) bVar.f58157a) && C52711k.m112239a((Object) this.f58158b, (Object) bVar.f58158b) && C52711k.m112239a((Object) this.f58159c, (Object) bVar.f58159c) && C52711k.m112239a((Object) this.f58160d, (Object) bVar.f58160d) && C52711k.m112239a((Object) this.f58161e, (Object) bVar.f58161e) && C52711k.m112239a((Object) this.f58162f, (Object) bVar.f58162f)) {
                        if (this.f58163g == bVar.f58163g) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String getAvatar_url() {
            return this.f58157a;
        }

        public final String getEmail() {
            return this.f58159c;
        }

        public final String getMobile() {
            return this.f58160d;
        }

        public final String getNickname() {
            return this.f58158b;
        }

        public final List<String> getOauth_platform() {
            return this.f58161e;
        }

        public final boolean getSafe() {
            return this.f58163g;
        }

        public final String getTicket() {
            return this.f58162f;
        }

        public final int hashCode() {
            String str = this.f58157a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f58158b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f58159c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f58160d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<String> list = this.f58161e;
            int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
            String str5 = this.f58162f;
            if (str5 != null) {
                i = str5.hashCode();
            }
            int i2 = (hashCode5 + i) * 31;
            boolean z = this.f58163g;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecoverAccountModel(avatar_url=");
            sb.append(this.f58157a);
            sb.append(", nickname=");
            sb.append(this.f58158b);
            sb.append(", email=");
            sb.append(this.f58159c);
            sb.append(", mobile=");
            sb.append(this.f58160d);
            sb.append(", oauth_platform=");
            sb.append(this.f58161e);
            sb.append(", ticket=");
            sb.append(this.f58162f);
            sb.append(", safe=");
            sb.append(this.f58163g);
            sb.append(")");
            return sb.toString();
        }

        public C21446b(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z) {
            this.f58157a = str;
            this.f58158b = str2;
            this.f58159c = str3;
            this.f58160d = str4;
            this.f58161e = list;
            this.f58162f = str5;
            this.f58163g = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$c */
    static final class C21447c implements C20840g {

        /* renamed from: a */
        final /* synthetic */ C21444f f58164a;

        C21447c(C21444f fVar) {
            this.f58164a = fVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                C20975a.m53337a(13);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.f$d */
    static final class C21448d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21444f f58165a;

        C21448d(C21444f fVar) {
            this.f58165a = fVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickInstrumentation.onClick(view);
            if (this.f58165a.f58152a != null) {
                C21446b bVar = this.f58165a.f58152a;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                boolean z = !TextUtils.isEmpty(bVar.getMobile());
                C21446b bVar2 = this.f58165a.f58152a;
                if (bVar2 == null) {
                    C52711k.m112234a();
                }
                boolean z2 = !TextUtils.isEmpty(bVar2.getEmail());
                Bundle arguments = this.f58165a.getArguments();
                String str4 = null;
                if (arguments != null) {
                    str = arguments.getString("feedback_param");
                } else {
                    str = null;
                }
                Context context = this.f58165a.getContext();
                this.f58165a.mo45966l();
                this.f58165a.mo45967m();
                C21446b bVar3 = this.f58165a.f58152a;
                if (bVar3 != null) {
                    str2 = bVar3.getNickname();
                } else {
                    str2 = null;
                }
                if (context != null) {
                    try {
                        str4 = C32816h.m75716b().getFeConfigCollection().getRecoverAccountVerificationFormUrl().getSchema();
                    } catch (C10174a unused) {
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Faccount_recover%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fmodule_name%3Dpage_account_recover%26channel%3Dtiktok_rn_account_recover%26bundle%3Dindex.js";
                    }
                    C41302w a = C41302w.m91042a();
                    Uri parse = Uri.parse(str4);
                    Builder builder = new Builder();
                    builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                    for (String str5 : parse.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(z);
                        String sb2 = sb.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(z2);
                        String sb4 = sb3.toString();
                        if (TextUtils.equals("url", str5) || TextUtils.equals("rn_schema", str5)) {
                            str3 = C22300g.m55187a(str5, parse, str2, sb2, sb4, str);
                        } else {
                            str3 = parse.getQueryParameter(str5);
                        }
                        builder.appendQueryParameter(str5, str3);
                    }
                    a.mo83861a(builder.build().toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f58156j == null) {
            this.f58156j = new HashMap();
        }
        View view = (View) this.f58156j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58156j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
    }

    public final void ad_() {
    }

    /* renamed from: e */
    public final void mo45584e() {
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f58156j != null) {
            this.f58156j.clear();
        }
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0g;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(getString(R.string.h99), null, false, null, null, true, null, false, false, 326, null);
        return aVar;
    }

    /* renamed from: j */
    private final String m54072j() {
        ArrayList arrayList = new ArrayList();
        if (this.f58152a != null) {
            C21446b bVar = this.f58152a;
            if (bVar == null) {
                C52711k.m112234a();
            }
            if (!TextUtils.isEmpty(bVar.getMobile())) {
                arrayList.add("mobile");
            }
            C21446b bVar2 = this.f58152a;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            if (!TextUtils.isEmpty(bVar2.getEmail())) {
                arrayList.add("email");
            }
            C21446b bVar3 = this.f58152a;
            if (bVar3 == null) {
                C52711k.m112234a();
            }
            if (bVar3.getOauth_platform() != null) {
                C21446b bVar4 = this.f58152a;
                if (bVar4 == null) {
                    C52711k.m112234a();
                }
                List oauth_platform = bVar4.getOauth_platform();
                if (oauth_platform == null) {
                    C52711k.m112234a();
                }
                arrayList.addAll(oauth_platform);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(',');
            sb.append(sb2.toString());
        }
        if (!TextUtils.isEmpty(sb)) {
            sb.setLength(sb.length() - 1);
        }
        String sb3 = sb.toString();
        C52711k.m112236a((Object) sb3, "string.toString()");
        return sb3;
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        super.onCreate(bundle);
        this.f58153c = new C9381g(this);
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("verify_account_data");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f58152a = (C21446b) serializable;
            Context context = getContext();
            List a = m54071a(this.f58152a);
            C21446b bVar = this.f58152a;
            if (bVar != null) {
                str = bVar.getNickname();
            } else {
                str = null;
            }
            C21446b bVar2 = this.f58152a;
            if (bVar2 != null) {
                str2 = bVar2.getAvatar_url();
            } else {
                str2 = null;
            }
            C21446b bVar3 = this.f58152a;
            if (bVar3 != null) {
                bool = Boolean.valueOf(bVar3.getSafe());
            }
            C21452i iVar = new C21452i(context, a, str, str2, bool);
            this.f58155e = iVar;
            C21452i iVar2 = this.f58155e;
            if (iVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            C21454b bVar4 = this;
            C52711k.m112240b(bVar4, "listener");
            iVar2.f58169a = bVar4;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.recover.RecoverVerifyAccountFragment.RecoverAccountModel");
    }

    /* renamed from: a */
    private final List<C21455c> m54071a(C21446b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List<C21455c> arrayList = new ArrayList<>();
        if (bVar != null) {
            if (bVar.getMobile() != null && !TextUtils.isEmpty(bVar.getMobile())) {
                C21455c cVar = new C21455c();
                cVar.setMethodType(1);
                Context context = getContext();
                if (context != null) {
                    str4 = context.getString(R.string.cbj);
                } else {
                    str4 = null;
                }
                cVar.setMethodName(str4);
                if (bVar.getSafe()) {
                    str5 = bVar.getMobile();
                } else {
                    Context context2 = getContext();
                    if (context2 != null) {
                        str5 = context2.getString(R.string.h8t);
                    } else {
                        str5 = null;
                    }
                }
                cVar.setMethodInfo(str5);
                arrayList.add(cVar);
            }
            if (bVar.getEmail() != null && !TextUtils.isEmpty(bVar.getEmail())) {
                C21455c cVar2 = new C21455c();
                cVar2.setMethodType(2);
                Context context3 = getContext();
                if (context3 != null) {
                    str2 = context3.getString(R.string.c9u);
                } else {
                    str2 = null;
                }
                cVar2.setMethodName(str2);
                if (bVar.getSafe()) {
                    str3 = bVar.getEmail();
                } else {
                    Context context4 = getContext();
                    if (context4 != null) {
                        str3 = context4.getString(R.string.h8t);
                    } else {
                        str3 = null;
                    }
                }
                cVar2.setMethodInfo(str3);
                arrayList.add(cVar2);
            }
            if (bVar.getOauth_platform() != null) {
                for (String str6 : bVar.getOauth_platform()) {
                    C21455c cVar3 = new C21455c();
                    cVar3.setMethodType(3);
                    cVar3.setAuthType(C21443e.valueOf(str6));
                    Context context5 = getContext();
                    if (context5 != null) {
                        str = context5.getString(R.string.h8t);
                    } else {
                        str = null;
                    }
                    cVar3.setMethodInfo(str);
                    cVar3.setMethodName(str6);
                    arrayList.add(cVar3);
                }
            }
        }
        return arrayList;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ekw);
        C52711k.m112236a((Object) recyclerView, "lv_verify_method");
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo44862a((int) R.id.ekw);
        C52711k.m112236a((Object) recyclerView2, "lv_verify_method");
        C21452i iVar = this.f58155e;
        if (iVar == null) {
            C52711k.m112237a("mAdapter");
        }
        recyclerView2.setAdapter(iVar);
        ((DmtTextView) mo44862a((int) R.id.f4p)).setOnClickListener(new C21448d(this));
        ((DmtTextView) mo44862a((int) R.id.f3n)).setFontType(C10751d.f28902a);
        ((DmtTextView) mo44862a((int) R.id.f4p)).setFontType(C10751d.f28902a);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.ss.android.ugc.aweme.IAccountService$c] */
    /* JADX WARNING: type inference failed for: r1v17, types: [com.ss.android.ugc.aweme.IAccountService$c] */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.IAccountService$c, java.lang.Boolean]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.Boolean, com.ss.android.ugc.aweme.IAccountService$c]
      mth insns count: 236
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45606a(int r9, com.p683ss.android.ugc.aweme.account.login.recover.C21443e r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r9) {
                case 1: goto L_0x018a;
                case 2: goto L_0x0107;
                case 3: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0274
        L_0x000a:
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            android.content.Context r9 = (android.content.Context) r9
            boolean r9 = com.p683ss.android.ugc.aweme.account.login.recover.C21449g.m54080a(r9)
            if (r9 != 0) goto L_0x0027
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            android.content.Context r9 = (android.content.Context) r9
            r10 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r9, r10)
            r9.mo19066a()
            return
        L_0x0027:
            com.ss.android.ugc.aweme.account.login.aa[] r9 = r8.f58154d
            int r0 = r9.length
            r4 = 0
        L_0x002b:
            if (r4 >= r0) goto L_0x0067
            r5 = r9[r4]
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r6 = java.lang.String.valueOf(r10)
            if (r6 == 0) goto L_0x0057
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 == 0) goto L_0x0054
            goto L_0x0068
        L_0x0054:
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0057:
            d.u r9 = new d.u
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r10)
            throw r9
        L_0x005f:
            d.u r9 = new d.u
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r10)
            throw r9
        L_0x0067:
            r2 = 0
        L_0x0068:
            if (r2 != 0) goto L_0x006b
            return
        L_0x006b:
            com.ss.android.ugc.aweme.account.login.recover.e r9 = com.p683ss.android.ugc.aweme.account.login.recover.C21443e.apple
            if (r10 != r9) goto L_0x0070
            return
        L_0x0070:
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.Class<com.ss.android.ugc.aweme.main.service.l> r0 = com.p683ss.android.ugc.aweme.main.service.C36691l.class
            java.lang.Object r0 = com.p683ss.android.ugc.aweme.C23826bi.m58450a(r0)
            com.ss.android.ugc.aweme.main.service.l r0 = (com.p683ss.android.ugc.aweme.main.service.C36691l) r0
            if (r0 == 0) goto L_0x0094
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Mob.Event.LOGIN_SUBMIT_"
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r0.mo47884a(r2)
            java.lang.String r2 = "LOGIN"
            r0.mo47885b(r2)
        L_0x0094:
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x00b4
            com.ss.android.ugc.aweme.IAccountService$d r1 = new com.ss.android.ugc.aweme.IAccountService$d
            r1.<init>()
            android.app.Activity r0 = (android.app.Activity) r0
            com.ss.android.ugc.aweme.IAccountService$d r0 = r1.mo44381a(r0)
            com.ss.android.ugc.aweme.account.login.recover.f$c r1 = new com.ss.android.ugc.aweme.account.login.recover.f$c
            r1.<init>(r8)
            com.ss.android.ugc.aweme.IAccountService$g r1 = (com.p683ss.android.ugc.aweme.IAccountService.C20840g) r1
            com.ss.android.ugc.aweme.IAccountService$d r0 = r0.mo44384a(r1)
            com.ss.android.ugc.aweme.IAccountService$c r1 = r0.mo44380a()
        L_0x00b4:
            android.content.Intent r0 = new android.content.Intent
            android.support.v4.app.FragmentActivity r2 = r8.getActivity()
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity> r3 = com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity.class
            r0.<init>(r2, r3)
            if (r1 == 0) goto L_0x00c8
            android.os.Bundle r1 = r1.f56772d
            r0.putExtras(r1)
        L_0x00c8:
            java.lang.String r1 = "platform"
            android.content.Intent r9 = r0.putExtra(r1, r9)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "find_account"
            android.content.Intent r9 = r9.putExtra(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "find_account"
            android.content.Intent r9 = r9.putExtra(r1, r2)
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r8.mo45968n()
            android.content.Intent r9 = r9.putExtra(r1, r2)
            java.lang.String r1 = "previous_uid"
            com.ss.android.ugc.aweme.AccountUserService r2 = new com.ss.android.ugc.aweme.AccountUserService
            r2.<init>()
            java.lang.String r2 = r2.getCurUserId()
            r9.putExtra(r1, r2)
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            if (r9 == 0) goto L_0x0101
            r1 = 1001(0x3e9, float:1.403E-42)
            r9.startActivityForResult(r0, r1)
        L_0x0101:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            goto L_0x0274
        L_0x0107:
            com.ss.android.ugc.aweme.account.login.recover.f$b r9 = r8.f58152a
            if (r9 == 0) goto L_0x0112
            boolean r9 = r9.getSafe()
            java.lang.Boolean.valueOf(r9)
        L_0x0112:
            java.lang.Class<com.ss.android.ugc.aweme.main.service.l> r9 = com.p683ss.android.ugc.aweme.main.service.C36691l.class
            java.lang.Object r9 = com.p683ss.android.ugc.aweme.C23826bi.m58450a(r9)
            com.ss.android.ugc.aweme.main.service.l r9 = (com.p683ss.android.ugc.aweme.main.service.C36691l) r9
            if (r9 == 0) goto L_0x0126
            java.lang.String r10 = "click_login"
            r9.mo47884a(r10)
            java.lang.String r10 = "LOGIN"
            r9.mo47885b(r10)
        L_0x0126:
            android.os.Bundle r9 = r8.getArguments()
            if (r9 != 0) goto L_0x0131
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x0131:
            java.lang.String r10 = "next_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_EMAIL_LOGIN
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "child_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.INPUT_EMAIL_LOGIN
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "current_scene"
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = r8.mo45970p()
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "previous_uid"
            com.ss.android.ugc.aweme.AccountUserService r0 = new com.ss.android.ugc.aweme.AccountUserService
            r0.<init>()
            java.lang.String r0 = r0.getCurUserId()
            r9.putString(r10, r0)
            java.lang.String r10 = "enter_from"
            java.lang.String r0 = "find_account"
            r9.putString(r10, r0)
            java.lang.String r10 = "enter_method"
            java.lang.String r0 = "find_account"
            r9.putString(r10, r0)
            java.lang.String r10 = "email_should_add_email"
            r9.putBoolean(r10, r2)
            java.lang.String r10 = "recover_account_data"
            com.ss.android.ugc.aweme.account.login.recover.f$b r0 = r8.f58152a
            java.io.Serializable r0 = (java.io.Serializable) r0
            r9.putSerializable(r10, r0)
            java.lang.String r10 = "(arguments ?: Bundle()).…ccountResponse)\n        }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.mo45961a(r9)
            java.lang.String r0 = "email"
            goto L_0x0274
        L_0x018a:
            com.ss.android.ugc.aweme.account.login.recover.f$b r9 = r8.f58152a
            if (r9 == 0) goto L_0x0196
            boolean r9 = r9.getSafe()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
        L_0x0196:
            if (r1 == 0) goto L_0x019d
            boolean r9 = r1.booleanValue()
            goto L_0x019e
        L_0x019d:
            r9 = 0
        L_0x019e:
            java.lang.Class<com.ss.android.ugc.aweme.main.service.l> r10 = com.p683ss.android.ugc.aweme.main.service.C36691l.class
            java.lang.Object r10 = com.p683ss.android.ugc.aweme.C23826bi.m58450a(r10)
            com.ss.android.ugc.aweme.main.service.l r10 = (com.p683ss.android.ugc.aweme.main.service.C36691l) r10
            if (r10 == 0) goto L_0x01b2
            java.lang.String r0 = "click_login"
            r10.mo47884a(r0)
            java.lang.String r0 = "LOGIN"
            r10.mo47885b(r0)
        L_0x01b2:
            if (r9 != 0) goto L_0x0210
            android.os.Bundle r9 = r8.getArguments()
            if (r9 != 0) goto L_0x01bf
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x01bf:
            java.lang.String r10 = "next_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_EMAIL_LOGIN
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "child_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.INPUT_PHONE_LOGIN
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "previous_uid"
            com.ss.android.ugc.aweme.AccountUserService r0 = new com.ss.android.ugc.aweme.AccountUserService
            r0.<init>()
            java.lang.String r0 = r0.getCurUserId()
            r9.putString(r10, r0)
            java.lang.String r10 = "enter_from"
            java.lang.String r0 = "find_account"
            r9.putString(r10, r0)
            java.lang.String r10 = "enter_method"
            java.lang.String r0 = "find_account"
            r9.putString(r10, r0)
            java.lang.String r10 = "current_scene"
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = r8.mo45970p()
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "recover_account_data"
            com.ss.android.ugc.aweme.account.login.recover.f$b r0 = r8.f58152a
            java.io.Serializable r0 = (java.io.Serializable) r0
            r9.putSerializable(r10, r0)
            java.lang.String r10 = "(arguments ?: Bundle()).…ntResponse)\n            }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.mo45961a(r9)
            goto L_0x0272
        L_0x0210:
            android.os.Bundle r9 = r8.getArguments()
            if (r9 != 0) goto L_0x021b
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x021b:
            java.lang.String r10 = "next_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_SMS_LOGIN
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "current_scene"
            com.ss.android.ugc.aweme.account.login.v2.base.h r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            int r0 = r0.getValue()
            r9.putInt(r10, r0)
            java.lang.String r10 = "recover_account_data"
            com.ss.android.ugc.aweme.account.login.recover.f$b r0 = r8.f58152a
            java.io.Serializable r0 = (java.io.Serializable) r0
            r9.putSerializable(r10, r0)
            java.lang.String r10 = "code_sent"
            r9.putBoolean(r10, r3)
            java.lang.String r10 = "use_whatsapp"
            r9.putBoolean(r10, r3)
            java.lang.String r10 = "previous_uid"
            com.ss.android.ugc.aweme.AccountUserService r0 = new com.ss.android.ugc.aweme.AccountUserService
            r0.<init>()
            java.lang.String r0 = r0.getCurUserId()
            r9.putString(r10, r0)
            java.lang.String r10 = "enter_from"
            java.lang.String r0 = "find_account"
            r9.putString(r10, r0)
            java.lang.String r10 = "enter_method"
            java.lang.String r0 = "find_account"
            r9.putString(r10, r0)
            java.lang.String r10 = "email_should_add_email"
            r9.putBoolean(r10, r2)
            java.lang.String r10 = "from_choose_dialog"
            r9.putBoolean(r10, r3)
            java.lang.String r10 = "(arguments ?: Bundle()).…omChooseDialog)\n        }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.mo45961a(r9)
        L_0x0272:
            java.lang.String r0 = "phone"
        L_0x0274:
            java.lang.String r9 = "find_account_verify_click"
            com.ss.android.ugc.aweme.account.a.b.a r10 = new com.ss.android.ugc.aweme.account.a.b.a
            r10.<init>()
            java.lang.String r1 = "platform"
            java.lang.String r2 = r8.m54072j()
            com.ss.android.ugc.aweme.account.a.b.a r10 = r10.mo44776a(r1, r2)
            java.lang.String r1 = "enter_type"
            com.ss.android.ugc.aweme.account.a.b.a r10 = r10.mo44776a(r1, r0)
            java.lang.String r0 = "aid"
            r1 = 1180(0x49c, float:1.654E-42)
            com.ss.android.ugc.aweme.account.a.b.a r10 = r10.mo44774a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21444f.mo45606a(int, com.ss.android.ugc.aweme.account.login.recover.e):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            C20975a.m53337a(13);
            C47718bf.m103288a(new C20846a());
            C47718bf.m103288a(new C20847b());
        }
    }
}
