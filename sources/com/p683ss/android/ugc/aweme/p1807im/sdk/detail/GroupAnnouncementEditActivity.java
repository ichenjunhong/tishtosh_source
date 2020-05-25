package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.C34102a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity */
public final class GroupAnnouncementEditActivity extends AmeActivity implements OnGlobalLayoutListener {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88120a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementEditActivity.class), "titleBar", "getTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementEditActivity.class), "editText", "getEditText()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementEditActivity.class), "editLimit", "getEditLimit()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementEditActivity.class), "templateLayout", "getTemplateLayout()Landroid/view/ViewGroup;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementEditActivity.class), "templateFillIn", "getTemplateFillIn()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementEditActivity.class), "statusView", "getStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;"))};

    /* renamed from: d */
    public static final C34086a f88121d = new C34086a(null);

    /* renamed from: b */
    public String f88122b;

    /* renamed from: c */
    public C11190e f88123c;

    /* renamed from: e */
    private ViewGroup f88124e;

    /* renamed from: f */
    private final C52668f f88125f = C52732g.m112285a(new C34101o(this));

    /* renamed from: g */
    private final C52668f f88126g = C52732g.m112285a(new C34089d(this));

    /* renamed from: h */
    private final C52668f f88127h = C52732g.m112285a(new C34088c(this));

    /* renamed from: i */
    private final C52668f f88128i = C52732g.m112285a(new C34100n(this));

    /* renamed from: j */
    private final C52668f f88129j = C52732g.m112285a(new C34099m(this));

    /* renamed from: k */
    private final C52668f f88130k = C52732g.m112285a(new C34098l(this));

    /* renamed from: l */
    private String f88131l;

    /* renamed from: m */
    private int f88132m;

    /* renamed from: n */
    private HashMap f88133n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$a */
    public static final class C34086a {
        private C34086a() {
        }

        public /* synthetic */ C34086a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m77894a(Context context, String str, String str2) {
            C52711k.m112240b(context, "context");
            Intent intent = new Intent(context, GroupAnnouncementEditActivity.class);
            intent.putExtra("conversationId", str);
            intent.putExtra("editInfo", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$b */
    static final class C34087b extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f88134a;

        C34087b(C52671b bVar) {
            this.f88134a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f88134a.invoke(Integer.valueOf(((Number) obj).intValue()));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$c */
    static final class C34088c extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88135a;

        C34088c(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88135a = groupAnnouncementEditActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88135a.mo72046a(R.id.f2s);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$d */
    static final class C34089d extends C52712l implements C52670a<DmtEditText> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88136a;

        C34089d(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88136a = groupAnnouncementEditActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtEditText) this.f88136a.mo72046a(R.id.e6m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$e */
    public static final class C34090e implements C35356a {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88137a;

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f88137a.onBackPressed();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r1 == null) goto L_0x0012;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70670b() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f88137a
                com.bytedance.ies.dmt.ui.widget.DmtEditText r1 = r0.mo72047a()
                android.text.Editable r1 = r1.getText()
                if (r1 == 0) goto L_0x0012
                java.lang.String r1 = r1.toString()
                if (r1 != 0) goto L_0x0014
            L_0x0012:
                java.lang.String r1 = ""
            L_0x0014:
                java.lang.String r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax.m79597a(r1)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0027
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r2 = 0
                goto L_0x0028
            L_0x0027:
                r2 = 1
            L_0x0028:
                if (r2 == 0) goto L_0x0030
                java.lang.String r1 = ""
                r0.mo72048a(r1, r4)
                return
            L_0x0030:
                r0.mo72048a(r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementEditActivity.C34090e.mo70670b():void");
        }

        C34090e(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88137a = groupAnnouncementEditActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$f */
    public static final class C34091f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88138a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C34091f(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88138a = groupAnnouncementEditActivity;
        }

        public final void afterTextChanged(Editable editable) {
            this.f88138a.mo72051d();
            this.f88138a.mo72052e();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            GroupAnnouncementEditActivity groupAnnouncementEditActivity = this.f88138a;
            Editable text = groupAnnouncementEditActivity.mo72047a().getText();
            if (text != null) {
                C52711k.m112236a((Object) text, "editText.text ?: return");
                if (text.length() > 500) {
                    C10691a.m21545b((Context) groupAnnouncementEditActivity, groupAnnouncementEditActivity.getString(R.string.a0q)).mo19066a();
                    int selectionEnd = Selection.getSelectionEnd(text);
                    String obj = text.toString();
                    if (obj != null) {
                        String substring = obj.substring(0, 500);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        groupAnnouncementEditActivity.mo72047a().setText(substring);
                        Editable text2 = groupAnnouncementEditActivity.mo72047a().getText();
                        if (text2 != null) {
                            if (selectionEnd > text2.length()) {
                                selectionEnd = text2.length();
                            }
                            Selection.setSelection(text2, selectionEnd);
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$g */
    static final class C34092g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88139a;

        C34092g(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88139a = groupAnnouncementEditActivity;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            String str2;
            ClickInstrumentation.onClick(view);
            GroupAnnouncementEditActivity groupAnnouncementEditActivity = this.f88139a;
            Editable text = groupAnnouncementEditActivity.mo72047a().getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = groupAnnouncementEditActivity.getResources().getString(R.string.fs_);
            } else if (str.length() < 500) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(10);
                sb.append(groupAnnouncementEditActivity.getResources().getString(R.string.fs_));
                str2 = sb.toString();
                if (str2.length() > 500) {
                    if (str2 != null) {
                        str2 = str2.substring(0, 500);
                        C52711k.m112236a((Object) str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else {
                C10691a.m21545b((Context) groupAnnouncementEditActivity, groupAnnouncementEditActivity.getString(R.string.a0q)).mo19066a();
                return;
            }
            groupAnnouncementEditActivity.mo72047a().setText(str2);
            Editable text2 = groupAnnouncementEditActivity.mo72047a().getText();
            if (text2 != null) {
                Selection.setSelection(text2, text2.length());
            }
            groupAnnouncementEditActivity.mo72052e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$h */
    static final class C34093h<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88140a;

        C34093h(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88140a = groupAnnouncementEditActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f88140a.mo72049b().setVisibility(8);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$i */
    public static final class C34094i implements C11162b<C11180b> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88141a;

        C34094i(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88141a = groupAnnouncementEditActivity;
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            String str;
            this.f88141a.mo72050c().setVisibility(8);
            StringBuilder sb = new StringBuilder("GroupAnnEditActivity onFailure: ");
            if (kVar != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(kVar.f30203a);
                sb2.append(", ");
                sb2.append(kVar.f30204b);
                sb2.append(", ");
                sb2.append(kVar.f30206d);
                sb2.append(", ");
                sb2.append(kVar.f30205c);
                sb2.append(", ");
                sb2.append(kVar.f30207e);
                str = sb2.toString();
            } else {
                str = null;
            }
            sb.append(str);
            C32458a.m75144a(sb.toString());
            C34214b.m78054a(this.f88141a, kVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x004e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo20506a(java.lang.Object r6) {
            /*
                r5 = this;
                com.bytedance.im.core.c.b r6 = (com.bytedance.p702im.core.p706c.C11180b) r6
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f88141a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.mo72050c()
                r1 = 8
                r0.setVisibility(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "GroupAnnEditActivity onSuccess: "
                r0.<init>(r1)
                if (r6 == 0) goto L_0x0041
                com.bytedance.im.core.c.c r1 = r6.getCoreInfo()
                if (r1 == 0) goto L_0x0041
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.util.Map r3 = r1.getExt()
                java.lang.String r4 = "a:s_notice"
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                r2.append(r3)
                java.lang.String r3 = ", "
                r2.append(r3)
                java.lang.String r1 = r1.getNotice()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                goto L_0x0042
            L_0x0041:
                r1 = 0
            L_0x0042:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
                if (r6 == 0) goto L_0x0064
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f88141a
                android.content.Context r0 = (android.content.Context) r0
                r1 = 2132542714(0x7f1c04fa, float:2.073854E38)
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21533a(r0, r1)
                r0.mo19066a()
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f88141a
                android.content.Context r0 = (android.content.Context) r0
                com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.C34102a.m77925a(r0, r6)
                return
            L_0x0064:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r6 = r5.f88141a
                r6.finish()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementEditActivity.C34094i.mo20506a(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$j */
    static final class C34095j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88142a;

        C34095j(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88142a = groupAnnouncementEditActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C11190e eVar = this.f88142a.f88123c;
            if (eVar != null) {
                C11180b a = eVar.mo20685a();
                if (a != null) {
                    C34102a.m77925a(this.f88142a, a);
                    return;
                }
            }
            this.f88142a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$k */
    static final class C34096k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88143a;

        /* renamed from: b */
        final /* synthetic */ boolean f88144b;

        /* renamed from: c */
        final /* synthetic */ String f88145c;

        C34096k(GroupAnnouncementEditActivity groupAnnouncementEditActivity, boolean z, String str) {
            this.f88143a = groupAnnouncementEditActivity;
            this.f88144b = z;
            this.f88145c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            C35190af.m79442a();
            C35190af.m79473a(this.f88143a.f88122b, this.f88144b);
            GroupAnnouncementEditActivity groupAnnouncementEditActivity = this.f88143a;
            C52671b r5 = new C52671b<Integer, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C34096k f88146a;

                {
                    this.f88146a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    Integer num = (Integer) obj;
                    GroupAnnouncementEditActivity groupAnnouncementEditActivity = this.f88146a.f88143a;
                    String str = this.f88146a.f88145c;
                    boolean z = this.f88146a.f88144b;
                    StringBuilder sb = new StringBuilder("GroupAnnEditActivity saveAnnouncementReal: ");
                    sb.append(num);
                    sb.append(", ");
                    sb.append(groupAnnouncementEditActivity.f88122b);
                    sb.append(", ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(z);
                    C32458a.m75144a(sb.toString());
                    int value = GroupRole.OWNER.getValue();
                    if (num != null && value == num.intValue()) {
                        groupAnnouncementEditActivity.mo72050c().mo19212f();
                        C11190e eVar = groupAnnouncementEditActivity.f88123c;
                        if (eVar != null) {
                            eVar.mo20697b(str, (C11162b<C11180b>) new C34094i<C11180b>(groupAnnouncementEditActivity));
                        }
                    } else {
                        C32458a.m75144a("GroupAnnEditActivity not group owner");
                        C10691a.m21542b((Context) groupAnnouncementEditActivity, (int) R.string.fse).mo19066a();
                    }
                    return C52860x.f131107a;
                }
            };
            CharSequence b = C35265e.m79730b();
            if (b != null) {
                str = b.toString();
            } else {
                str = null;
            }
            StringBuilder sb = new StringBuilder("GroupAnnEditActivity checkPermission: ");
            sb.append(groupAnnouncementEditActivity.f88122b);
            sb.append(", ");
            sb.append(str);
            C32458a.m75144a(sb.toString());
            if (groupAnnouncementEditActivity.f88122b != null && str != null) {
                C34237d a = C34238a.m78110a();
                String str2 = groupAnnouncementEditActivity.f88122b;
                if (str2 == null) {
                    C52711k.m112234a();
                }
                Integer a2 = a.mo72223a(str2, str);
                if (a2 != null) {
                    r5.invoke(Integer.valueOf(a2.intValue()));
                    return;
                }
                C34238a.m78110a();
                String str3 = groupAnnouncementEditActivity.f88122b;
                if (str3 == null) {
                    C52711k.m112234a();
                }
                C34237d.m78088a(str3, str, (C52671b<? super Integer, C52860x>) new C34087b<Object,C52860x>(r5));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$l */
    static final class C34098l extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88147a;

        C34098l(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88147a = groupAnnouncementEditActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f88147a.mo72046a(R.id.csv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$m */
    static final class C34099m extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88148a;

        C34099m(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88148a = groupAnnouncementEditActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88148a.mo72046a(R.id.f4v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$n */
    static final class C34100n extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88149a;

        C34100n(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88149a = groupAnnouncementEditActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f88149a.mo72046a(R.id.ekd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$o */
    static final class C34101o extends C52712l implements C52670a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f88150a;

        C34101o(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f88150a = groupAnnouncementEditActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImTextTitleBar) this.f88150a.mo72046a(R.id.d10);
        }
    }

    /* renamed from: f */
    private final ImTextTitleBar m77885f() {
        return (ImTextTitleBar) this.f88125f.getValue();
    }

    /* renamed from: g */
    private final DmtTextView m77886g() {
        return (DmtTextView) this.f88127h.getValue();
    }

    /* renamed from: a */
    public final View mo72046a(int i) {
        if (this.f88133n == null) {
            this.f88133n = new HashMap();
        }
        View view = (View) this.f88133n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88133n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final DmtEditText mo72047a() {
        return (DmtEditText) this.f88126g.getValue();
    }

    /* renamed from: b */
    public final ViewGroup mo72049b() {
        return (ViewGroup) this.f88128i.getValue();
    }

    /* renamed from: c */
    public final DmtStatusView mo72050c() {
        return (DmtStatusView) this.f88130k.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72051d() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f88131l
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = ""
        L_0x0006:
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax.m79597a(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.bytedance.ies.dmt.ui.widget.DmtEditText r1 = r2.mo72047a()
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r1 = ""
        L_0x001e:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax.m79597a(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r0 = r0 ^ 1
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r1 = r2.m77885f()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.getRightTexView()
            r1.setEnabled(r0)
            if (r0 == 0) goto L_0x003a
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x003a:
            r0 = 1051595899(0x3eae147b, float:0.34)
        L_0x003d:
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementEditActivity.mo72051d():void");
    }

    /* renamed from: e */
    public final void mo72052e() {
        int i;
        CharSequence charSequence;
        DmtTextView g = m77886g();
        Editable text = mo72047a().getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        int i2 = 500 - i;
        if (i2 <= 4) {
            g.setVisibility(0);
            g.setTextColor(g.getResources().getColor(R.color.rn));
            charSequence = String.valueOf(i2);
        } else if (i2 <= 9) {
            g.setVisibility(0);
            g.setTextColor(g.getResources().getColor(R.color.a1b));
            charSequence = String.valueOf(i2);
        } else {
            g.setVisibility(8);
            charSequence = "";
        }
        g.setText(charSequence);
    }

    public final void onBackPressed() {
        GroupAnnouncementEditActivity groupAnnouncementEditActivity;
        if (TextUtils.equals(this.f88131l, mo72047a().getText())) {
            groupAnnouncementEditActivity = this;
        } else {
            groupAnnouncementEditActivity = null;
        }
        if (groupAnnouncementEditActivity != null) {
            super.onBackPressed();
        } else {
            new C10643a(this).mo18899b((int) R.string.fsd).mo18886a((int) R.string.fs8, (DialogInterface.OnClickListener) null).mo18900b((int) R.string.fsc, (DialogInterface.OnClickListener) new C34095j(this)).mo18897a().mo18883c();
        }
    }

    public final void onGlobalLayout() {
        int a = C23728o.m58241a(80.0d);
        StringBuilder sb = new StringBuilder("onGlobalLayout: ");
        sb.append(this.f88132m);
        sb.append(", ");
        ViewGroup viewGroup = this.f88124e;
        if (viewGroup == null) {
            C52711k.m112237a("contentView");
        }
        sb.append(viewGroup.getHeight());
        sb.append(", ");
        sb.append(a);
        if (this.f88132m == 0) {
            ViewGroup viewGroup2 = this.f88124e;
            if (viewGroup2 == null) {
                C52711k.m112237a("contentView");
            }
            this.f88132m = viewGroup2.getHeight();
            return;
        }
        ViewGroup viewGroup3 = this.f88124e;
        if (viewGroup3 == null) {
            C52711k.m112237a("contentView");
        }
        if (viewGroup3.getHeight() - this.f88132m > a) {
            C0013i.m12a(170).mo20a((C0011g<TResult, TContinuationResult>) new C34093h<TResult,TContinuationResult>(this), C0013i.f25b);
        } else {
            int i = this.f88132m;
            ViewGroup viewGroup4 = this.f88124e;
            if (viewGroup4 == null) {
                C52711k.m112237a("contentView");
            }
            if (i - viewGroup4.getHeight() > a) {
                mo72049b().setVisibility(0);
            }
        }
        ViewGroup viewGroup5 = this.f88124e;
        if (viewGroup5 == null) {
            C52711k.m112237a("contentView");
        }
        this.f88132m = viewGroup5.getHeight();
    }

    public final void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bc2);
        C34004b.m77718b().setupStatusBar(this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f88131l = intent.getStringExtra("editInfo");
            this.f88122b = intent.getStringExtra("conversationId");
        }
        String str = this.f88122b;
        if (str != null) {
            this.f88123c = new C11190e(str);
        }
        View findViewById = findViewById(16908290);
        C52711k.m112236a((Object) findViewById, "findViewById(android.R.id.content)");
        this.f88124e = (ViewGroup) findViewById;
        ViewGroup viewGroup = this.f88124e;
        if (viewGroup == null) {
            C52711k.m112237a("contentView");
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
        String str2 = this.f88131l;
        if (str2 != null) {
            if (str2.length() <= 0) {
                z = false;
            }
            if (!z) {
                str2 = null;
            }
            if (str2 != null) {
                mo72047a().setText(str2);
                mo72047a().setSelection(str2.length());
            }
        }
        m77885f().setTitle((int) R.string.a0l);
        mo72050c().setBuilder(C10719a.m21676a((Context) this).mo19223a());
        mo72051d();
        mo72052e();
        m77885f().setOnTitlebarClickListener(new C34090e(this));
        mo72047a().addTextChangedListener(new C34091f(this));
        ((DmtTextView) this.f88129j.getValue()).setOnClickListener(new C34092g(this));
        StringBuilder sb = new StringBuilder("GroupAnnEditActivity onCreate: conversationId=");
        sb.append(this.f88122b);
        sb.append(", rawEditInfo=");
        sb.append(this.f88131l);
        C32458a.m75144a(sb.toString());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72048a(String str, boolean z) {
        int i;
        int i2;
        if (z) {
            i = R.string.a0n;
        } else {
            i = R.string.a0r;
        }
        if (z) {
            i2 = R.string.a0o;
        } else {
            i2 = R.string.a0t;
        }
        new C10643a(this).mo18899b(i).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a(i2, (DialogInterface.OnClickListener) new C34096k(this, z, str)).mo18897a().mo18883c();
    }
}
