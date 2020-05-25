package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11180b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.emoji.p1684d.C29303a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.Widget;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35099a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35125c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35116j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1889a.C35139a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1891c.C35148a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.C35176a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel.C35166a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35405k;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1908a.C35477b;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b.C35479a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget */
public final class SharePanelWidget extends Widget implements C35099a, C35176a {

    /* renamed from: l */
    public static final C35131a f90347l = new C35131a(null);

    /* renamed from: b */
    final Context f90348b = this.f90356j.f91201f;

    /* renamed from: c */
    SharePanelViewModel f90349c;

    /* renamed from: d */
    RecyclerView f90350d;

    /* renamed from: e */
    C35139a f90351e;

    /* renamed from: f */
    View f90352f;

    /* renamed from: g */
    public DmtEditText f90353g;

    /* renamed from: h */
    C35117b f90354h;

    /* renamed from: i */
    C35142b f90355i;

    /* renamed from: j */
    public final C35479a f90356j;

    /* renamed from: k */
    public final C35477b f90357k;

    /* renamed from: m */
    private RemoteImageView f90358m;

    /* renamed from: n */
    private DmtTextView f90359n;

    /* renamed from: o */
    private LinearLayout f90360o;

    /* renamed from: p */
    private ImageView f90361p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$a */
    public static final class C35131a {
        private C35131a() {
        }

        public /* synthetic */ C35131a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$b */
    static final class C35132b extends C52712l implements C52671b<C11180b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f90362a;

        C35132b(SharePanelWidget sharePanelWidget) {
            this.f90362a = sharePanelWidget;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11180b bVar = (C11180b) obj;
            if (bVar != null) {
                IMContact a = C34008d.m77742a(bVar);
                if (a != null) {
                    this.f90362a.mo73250a(C52575l.m112101c(a));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$c */
    static final class C35133c implements C33242d {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f90363a;

        /* renamed from: b */
        final /* synthetic */ List f90364b;

        C35133c(SharePanelWidget sharePanelWidget, List list) {
            this.f90363a = sharePanelWidget;
            this.f90364b = list;
        }

        public final void sendMsg() {
            boolean z;
            String str;
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            C35190af.m79442a();
            C35190af.m79443a(this.f90364b.size());
            C35116j.m79348a(uuid, this.f90363a.f90356j.f91202g, this.f90364b);
            KeyboardUtils.m58184c(SharePanelWidget.m79361a(this.f90363a));
            C35477b bVar = this.f90363a.f90357k;
            SharePackage sharePackage = this.f90363a.f90356j.f91202g;
            if (this.f90364b.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo70330a(sharePackage, z);
            List list = this.f90364b;
            Editable text = SharePanelWidget.m79361a(this.f90363a).getText();
            String str2 = null;
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            C35106c.m79332a(list, str, this.f90363a.f90356j.f91202g, (BaseContent) null, uuid);
            SharePackage sharePackage2 = this.f90363a.f90356j.f91202g;
            List list2 = this.f90364b;
            if (list2 == null) {
                C52711k.m112234a();
            }
            String valueOf = String.valueOf(list2.size());
            Editable text2 = SharePanelWidget.m79361a(this.f90363a).getText();
            if (text2 != null) {
                str2 = text2.toString();
            }
            List list3 = this.f90364b;
            if (list3 == null) {
                C52711k.m112234a();
            }
            C35190af.m79456a(sharePackage2, valueOf, str2, C52575l.m112139e((Collection<? extends T>) list3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$d */
    public static final class C35134d implements C29303a {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f90365a;

        C35134d(SharePanelWidget sharePanelWidget) {
            this.f90365a = sharePanelWidget;
        }

        /* renamed from: a */
        public final void mo59248a(String str) {
            C35190af.m79452a(this.f90365a.f90356j.f91202g);
            if (ImShareSoftAndMiniEmojiExperimentV2.INSTANCE.mo70519e()) {
                SharePanelWidget.m79361a(this.f90365a).requestFocus();
                KeyboardUtils.m58182a(SharePanelWidget.m79361a(this.f90365a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$e */
    static final class C35135e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f90366a;

        C35135e(SharePanelWidget sharePanelWidget) {
            this.f90366a = sharePanelWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            new C10643a(this.f90366a.f90348b).mo18885a((int) R.string.ftf).mo18899b((int) R.string.ftd).mo18886a((int) R.string.fte, (DialogInterface.OnClickListener) C35137g.f90368a).mo18897a().mo18883c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$f */
    static final class C35136f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f90367a;

        C35136f(SharePanelWidget sharePanelWidget) {
            this.f90367a = sharePanelWidget;
        }

        public final void onClick(View view) {
            int i;
            ClickInstrumentation.onClick(view);
            SharePanelWidget sharePanelWidget = this.f90367a;
            if (!sharePanelWidget.f90357k.mo70334a(sharePanelWidget.f90356j.f91202g)) {
                C32458a.m75144a("SharePanelWidget cancel share by callback");
                return;
            }
            SharePanelViewModel sharePanelViewModel = sharePanelWidget.f90349c;
            if (sharePanelViewModel == null) {
                C52711k.m112237a("viewModel");
            }
            List e = C52575l.m112139e((Collection<? extends T>) sharePanelViewModel.mo73280a());
            if (e.isEmpty()) {
                C10691a.m21542b(sharePanelWidget.f90348b, (int) R.string.ftu).mo19066a();
                return;
            }
            DmtEditText dmtEditText = sharePanelWidget.f90353g;
            if (dmtEditText == null) {
                C52711k.m112237a("editText");
            }
            Editable text = dmtEditText.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > C35197am.m79552a()) {
                C10691a.m21542b(sharePanelWidget.f90348b, (int) R.string.bkj).mo19066a();
                return;
            }
            C35117b bVar = sharePanelWidget.f90354h;
            if (bVar != null) {
                if (!bVar.f90315a) {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.mo73232a(e, (C52671b<? super C11180b, C52860x>) new C35132b<Object,C52860x>(sharePanelWidget));
                    return;
                }
            }
            sharePanelWidget.mo73250a(e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$g */
    static final class C35137g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C35137g f90368a = new C35137g();

        C35137g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo70591b() {
        super.mo70591b();
        C35142b bVar = this.f90355i;
        if (bVar != null) {
            bVar.mo73261b();
        }
    }

    /* renamed from: a */
    public final void mo70590a() {
        super.mo70590a();
        C35142b bVar = this.f90355i;
        if (bVar != null) {
            bVar.mo73259a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo73253c() {
        SharePanelViewModel sharePanelViewModel = this.f90349c;
        if (sharePanelViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        boolean z = false;
        if (sharePanelViewModel.mo73280a().isEmpty()) {
            View view = this.f90352f;
            if (view == null) {
                C52711k.m112237a("editLayout");
            }
            view.setVisibility(8);
            DmtEditText dmtEditText = this.f90353g;
            if (dmtEditText == null) {
                C52711k.m112237a("editText");
            }
            KeyboardUtils.m58184c(dmtEditText);
        } else {
            View view2 = this.f90352f;
            if (view2 == null) {
                C52711k.m112237a("editLayout");
            }
            view2.setVisibility(0);
            RemoteImageView remoteImageView = this.f90358m;
            if (remoteImageView == null) {
                C52711k.m112237a("shareCover");
            }
            C35405k.m80043a(remoteImageView, this.f90356j.f91202g);
            SharePackage sharePackage = this.f90356j.f91202g;
            View view3 = this.f90352f;
            if (view3 == null) {
                C52711k.m112237a("editLayout");
            }
            C35138a.m79371a(sharePackage, view3);
        }
        SharePanelAndroidViewModel a = C35166a.m79403a(this.f90348b);
        if (a != null) {
            C0198r a2 = a.mo73279a();
            if (a2 != null) {
                View view4 = this.f90352f;
                if (view4 == null) {
                    C52711k.m112237a("editLayout");
                }
                if (view4.getVisibility() == 0) {
                    z = true;
                }
                a2.setValue(Boolean.valueOf(z));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo73254d() {
        CharSequence charSequence;
        SharePanelViewModel sharePanelViewModel = this.f90349c;
        if (sharePanelViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        if (sharePanelViewModel.mo73280a().isEmpty()) {
            DmtTextView dmtTextView = this.f90359n;
            if (dmtTextView == null) {
                C52711k.m112237a("sendTv");
            }
            dmtTextView.setVisibility(8);
            return;
        }
        DmtTextView dmtTextView2 = this.f90359n;
        if (dmtTextView2 == null) {
            C52711k.m112237a("sendTv");
        }
        dmtTextView2.setVisibility(0);
        DmtTextView dmtTextView3 = this.f90359n;
        if (dmtTextView3 == null) {
            C52711k.m112237a("sendTv");
        }
        SharePanelViewModel sharePanelViewModel2 = this.f90349c;
        if (sharePanelViewModel2 == null) {
            C52711k.m112237a("viewModel");
        }
        if (sharePanelViewModel2.mo73280a().size() == 1) {
            DmtTextView dmtTextView4 = this.f90359n;
            if (dmtTextView4 == null) {
                C52711k.m112237a("sendTv");
            }
            charSequence = dmtTextView4.getResources().getString(R.string.bn5);
        } else {
            C35117b bVar = this.f90354h;
            if (bVar == null || !bVar.f90315a) {
                StringBuilder sb = new StringBuilder();
                DmtTextView dmtTextView5 = this.f90359n;
                if (dmtTextView5 == null) {
                    C52711k.m112237a("sendTv");
                }
                sb.append(dmtTextView5.getResources().getString(R.string.dd3));
                sb.append('(');
                SharePanelViewModel sharePanelViewModel3 = this.f90349c;
                if (sharePanelViewModel3 == null) {
                    C52711k.m112237a("viewModel");
                }
                Set a = sharePanelViewModel3.mo73280a();
                if (a == null) {
                    C52711k.m112234a();
                }
                sb.append(a.size());
                sb.append(')');
                charSequence = sb.toString();
            } else {
                DmtTextView dmtTextView6 = this.f90359n;
                if (dmtTextView6 == null) {
                    C52711k.m112237a("sendTv");
                }
                charSequence = dmtTextView6.getResources().getString(R.string.ftt);
            }
        }
        dmtTextView3.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo72952a(boolean z) {
        mo73254d();
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtEditText m79361a(SharePanelWidget sharePanelWidget) {
        DmtEditText dmtEditText = sharePanelWidget.f90353g;
        if (dmtEditText == null) {
            C52711k.m112237a("editText");
        }
        return dmtEditText;
    }

    /* renamed from: a */
    public final void mo73250a(List<IMContact> list) {
        C35190af.m79442a();
        C35190af.m79453a(this.f90356j.f91202g, (BaseContent) null, list.size());
        new C33220b(this.f90348b, new C35133c(this, list)).sendMsg();
    }

    /* renamed from: b */
    public final void mo73252b(List<IMContact> list) {
        boolean z;
        C52711k.m112240b(list, "list");
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C35125c.m79357a(false);
            this.f90356j.f91196a.setVisibility(8);
            return;
        }
        C35125c.m79357a(true);
        C35139a aVar = this.f90351e;
        if (aVar == null) {
            C52711k.m112237a("headAdapter");
        }
        List a = aVar.mo73258a();
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        Integer num = null;
        if (z2) {
            a = null;
        }
        if (a != null) {
            a.clear();
            if (list == null) {
                C52711k.m112234a();
            }
            a.addAll(collection);
            a.add(new C35148a());
            aVar.notifyDataSetChanged();
        }
        StringBuilder sb = new StringBuilder("setData: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        sb.append(num);
        sb.append(", ");
        sb.append(aVar.mo73258a().size());
        C34004b a2 = C34004b.m77717a();
        C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
        C35460j f = a2.mo71949f();
        if (f != null) {
            f.logIMShareHeadShow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0187 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0188  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo73251a(com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "contact"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            boolean r0 = r11 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1891c.C35148a
            r1 = 0
            if (r0 == 0) goto L_0x000c
            r0 = r10
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.SharePanelWidget) r0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.im.service.share.a.b r11 = r10.f90357k
            java.lang.String r12 = "chat_merge"
            com.ss.android.ugc.aweme.im.service.share.b.a r0 = r10.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r0.f91202g
            r11.mo70332a(r12, r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r11 = r10.f90353g
            if (r11 != 0) goto L_0x0027
            java.lang.String r12 = "editText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r12)
        L_0x0027:
            android.view.View r11 = (android.view.View) r11
            com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.m58184c(r11)
            com.ss.android.ugc.aweme.im.service.share.b.a r11 = r10.f90356j
            boolean r11 = r11.f91199d
            if (r11 != 0) goto L_0x00f2
            com.ss.android.ugc.aweme.im.service.share.b.a r11 = r10.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r11 = r11.f91202g
            android.os.Bundle r11 = r11.f106900i
            java.lang.String r12 = "enter_method"
            java.lang.String r0 = "more_button"
            r11.putString(r12, r0)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r12 = "share_package"
            com.ss.android.ugc.aweme.im.service.share.b.a r0 = r10.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r0.f91202g
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r11.putParcelable(r12, r0)
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r12 = r10.f90349c
            if (r12 != 0) goto L_0x0058
            java.lang.String r0 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0058:
            java.util.Set r12 = r12.mo73280a()
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0083
            java.lang.String r12 = "key_selected_contact"
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r4 = r10.f90349c
            if (r4 != 0) goto L_0x006f
            java.lang.String r5 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x006f:
            java.util.Set r4 = r4.mo73280a()
            java.util.Collection r4 = (java.util.Collection) r4
            r0.<init>(r4)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r11.putSerializable(r12, r0)
            java.lang.String r12 = "key_select_mode"
            r0 = 3
            r11.putInt(r12, r0)
        L_0x0083:
            java.lang.String r12 = "key_share_create_group_select"
            com.ss.android.ugc.aweme.im.sdk.share.b r0 = r10.f90354h
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.f90315a
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            r11.putBoolean(r12, r0)
            int r12 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.m80104a()
            r0 = 5
            if (r12 == r0) goto L_0x00af
            com.ss.android.ugc.aweme.im.sdk.abtest.c r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
            int r12 = r12.mo70574g()
            if (r12 == r2) goto L_0x00af
            com.ss.android.ugc.aweme.im.sdk.abtest.c r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
            int r12 = r12.mo70574g()
            r0 = 2
            if (r12 != r0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            android.content.Context r12 = r10.f90348b
            com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity.m78822a(r12, r11, r1)
            goto L_0x00f2
        L_0x00af:
            com.ss.android.ugc.aweme.sharer.ui.d$b r11 = new com.ss.android.ugc.aweme.sharer.ui.d$b
            r11.<init>()
            com.ss.android.ugc.aweme.im.service.share.b.a r12 = r10.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r12 = r12.f91202g
            r11.f106972m = r12
            com.ss.android.ugc.aweme.im.sdk.share.b.a r12 = new com.ss.android.ugc.aweme.im.sdk.share.b.a
            android.content.Context r0 = r10.f90348b
            if (r0 == 0) goto L_0x00ea
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            com.ss.android.ugc.aweme.sharer.ui.d r6 = r11.mo86266a()
            r7 = 0
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r0 = r10.f90349c
            if (r0 != 0) goto L_0x00d3
            java.lang.String r1 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00d3:
            java.util.Set r0 = r0.mo73280a()
            java.util.Collection r0 = (java.util.Collection) r0
            r11.<init>(r0)
            r8 = r11
            java.util.Set r8 = (java.util.Set) r8
            r9 = 2132607868(0x7f1d037c, float:2.0870689E38)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r12.show()
            goto L_0x00f2
        L_0x00ea:
            d.u r11 = new d.u
            java.lang.String r12 = "null cannot be cast to non-null type android.app.Activity"
            r11.<init>(r12)
            throw r11
        L_0x00f2:
            return r3
        L_0x00f3:
            com.ss.android.ugc.aweme.im.sdk.share.a.b$a r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35102b.f90276c
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.abtest.ImFeedShareIconOverturnTypeExperiment> r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImFeedShareIconOverturnTypeExperiment.class
            r6 = 1
            java.lang.String r7 = "im_feed_share_icon_type"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            int r0 = r4.mo18168a(r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            if (r0 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r1 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()
            if (r0 == 0) goto L_0x011e
            r0.recordLastShareTypeIsIm()
        L_0x011e:
            com.ss.android.ugc.aweme.im.sdk.d.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
            java.lang.String r1 = "AwemeImManager.instance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.im.service.j r0 = r0.mo71949f()
            if (r0 == 0) goto L_0x0136
            com.ss.android.ugc.aweme.im.service.model.e r0 = r0.getIMSetting()
            if (r0 == 0) goto L_0x0136
            int r0 = r0.f91145c
            goto L_0x0138
        L_0x0136:
            r0 = 10
        L_0x0138:
            if (r12 == 0) goto L_0x0184
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r1 = r10.f90349c
            if (r1 != 0) goto L_0x0143
            java.lang.String r4 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0143:
            java.util.Set r1 = r1.mo73280a()
            int r1 = r1.size()
            if (r1 < r0) goto L_0x0184
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r1 = r10.f90349c
            if (r1 != 0) goto L_0x0156
            java.lang.String r4 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0156:
            java.util.Set r1 = r1.mo73280a()
            boolean r1 = r1.contains(r11)
            if (r1 != 0) goto L_0x0184
            com.ss.android.ugc.aweme.im.sdk.share.b r1 = r10.f90354h
            if (r1 == 0) goto L_0x0168
            r1 = 2132545597(0x7f1c103d, float:2.0744388E38)
            goto L_0x016b
        L_0x0168:
            r1 = 2132545598(0x7f1c103e, float:2.074439E38)
        L_0x016b:
            android.content.Context r4 = r10.f90348b
            android.content.Context r5 = r10.f90348b
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r3] = r0
            java.lang.String r0 = r5.getString(r1, r6)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r4, r0)
            r0.mo19066a()
            r0 = 0
            goto L_0x0185
        L_0x0184:
            r0 = 1
        L_0x0185:
            if (r0 != 0) goto L_0x0188
            return r3
        L_0x0188:
            if (r12 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.im.sdk.utils.af r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.ss.android.ugc.aweme.im.service.share.b.a r1 = r10.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r1.f91202g
            r0.mo73320a(r1, r11, r3)
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r0 = r10.f90349c
            if (r0 != 0) goto L_0x019e
            java.lang.String r1 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x019e:
            java.util.Set r0 = r0.mo73280a()
            r0.add(r11)
            com.ss.android.ugc.aweme.im.service.share.a.b r0 = r10.f90357k
            java.lang.String r1 = "chat_mergeIM"
            com.ss.android.ugc.aweme.im.service.share.b.a r3 = r10.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r3 = r3.f91202g
            r0.mo70332a(r1, r3)
            goto L_0x01c1
        L_0x01b1:
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r0 = r10.f90349c
            if (r0 != 0) goto L_0x01ba
            java.lang.String r1 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01ba:
            java.util.Set r0 = r0.mo73280a()
            r0.remove(r11)
        L_0x01c1:
            com.ss.android.ugc.aweme.im.sdk.share.b r0 = r10.f90354h
            if (r0 == 0) goto L_0x01db
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r1 = r10.f90349c
            if (r1 != 0) goto L_0x01ce
            java.lang.String r3 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01ce:
            java.util.Set r1 = r1.mo73280a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = p2628d.p2629a.C52575l.m112145h(r1)
            r0.mo73233a(r1)
        L_0x01db:
            com.ss.android.ugc.aweme.im.service.share.a.b r0 = r10.f90357k
            r0.mo70328a(r11, r12)
            r10.mo73253c()
            r10.mo73254d()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.SharePanelWidget.mo73251a(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SharePanelWidget(com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b.C35479a r24, com.p683ss.android.ugc.aweme.p1807im.service.share.p1908a.C35477b r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "payload"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.lang.String r3 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            r23.<init>()
            r0.f90356j = r1
            r0.f90357k = r2
            com.ss.android.ugc.aweme.im.service.share.b.a r1 = r0.f90356j
            android.content.Context r1 = r1.f91201f
            r0.f90348b = r1
            r1 = 1
            com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35125c.f90335b = r1
            r23.create()
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel
            com.ss.android.ugc.aweme.im.service.share.b.a r3 = r0.f90356j
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r3 = r3.f91202g
            r2.<init>(r3)
            r0.f90349c = r2
            android.arch.lifecycle.h r2 = r23.getLifecycle()
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r3 = r0.f90349c
            if (r3 != 0) goto L_0x003b
            java.lang.String r4 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x003b:
            android.arch.lifecycle.j r3 = (android.arch.lifecycle.C0183j) r3
            r2.mo324a(r3)
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r2 = r0.f90349c
            if (r2 != 0) goto L_0x0049
            java.lang.String r3 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0049:
            r3 = r0
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.C35176a) r3
            r2.f90442b = r3
            com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelHeadLayout r2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelHeadLayout
            android.content.Context r5 = r0.f90348b
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = r0
            com.ss.android.ugc.aweme.im.sdk.arch.Widget r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.arch.Widget) r3
            r2.setWidget(r3)
            com.ss.android.ugc.aweme.im.service.share.b.a r3 = r0.f90356j
            android.view.ViewGroup r3 = r3.f91196a
            r4 = r2
            android.view.View r4 = (android.view.View) r4
            r3.addView(r4)
            r3 = 2132022160(0x7f141390, float:1.9682732E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "headLayout.findViewById(R.id.recycle_view)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.support.v7.widget.RecyclerView r3 = (android.support.p043v7.widget.RecyclerView) r3
            r0.f90350d = r3
            android.support.v7.widget.RecyclerView r3 = r0.f90350d
            if (r3 != 0) goto L_0x0083
            java.lang.String r4 = "headRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0083:
            com.ss.android.ugc.aweme.im.sdk.widget.q r4 = new com.ss.android.ugc.aweme.im.sdk.widget.q
            r5 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r5)
            r6 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r6)
            r7 = 4628011567076605952(0x403a000000000000, double:26.0)
            int r7 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r7)
            r4.<init>(r5, r6, r7)
            android.support.v7.widget.RecyclerView$h r4 = (android.support.p043v7.widget.RecyclerView.C1331h) r4
            r3.mo4798a(r4)
            com.ss.android.ugc.aweme.im.sdk.share.panel.a.a r3 = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r4 = r0.f90349c
            if (r4 != 0) goto L_0x00aa
            java.lang.String r5 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00aa:
            r3.<init>(r4)
            r0.f90351e = r3
            android.support.v7.widget.RecyclerView r3 = r0.f90350d
            if (r3 != 0) goto L_0x00b8
            java.lang.String r4 = "headRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00b8:
            com.ss.android.ugc.aweme.im.sdk.share.panel.a.a r4 = r0.f90351e
            if (r4 != 0) goto L_0x00c1
            java.lang.String r5 = "headAdapter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00c1:
            android.support.v7.widget.RecyclerView$a r4 = (android.support.p043v7.widget.RecyclerView.C1322a) r4
            r3.setAdapter(r4)
            android.support.v7.widget.RecyclerView r3 = r0.f90350d
            if (r3 != 0) goto L_0x00cf
            java.lang.String r4 = "headRecyclerView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00cf:
            android.support.v7.widget.LinearLayoutManager r4 = new android.support.v7.widget.LinearLayoutManager
            android.content.Context r5 = r0.f90348b
            r6 = 0
            r4.<init>(r5, r6, r6)
            android.support.v7.widget.RecyclerView$i r4 = (android.support.p043v7.widget.RecyclerView.C1332i) r4
            r3.setLayoutManager(r4)
            r3 = 2132020260(0x7f140c24, float:1.9678878E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "headLayout.findViewById(…d.iv_user_active_warning)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f90361p = r2
            com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            boolean r2 = r2.mo73378D()
            if (r2 == 0) goto L_0x0115
            android.widget.ImageView r2 = r0.f90361p
            if (r2 != 0) goto L_0x00ff
            java.lang.String r3 = "ivUserActiveWarning"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00ff:
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r0.f90361p
            if (r2 != 0) goto L_0x010b
            java.lang.String r3 = "ivUserActiveWarning"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x010b:
            com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$e r3 = new com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$e
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
        L_0x0115:
            android.content.Context r2 = r0.f90348b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2132214898(0x7f170472, float:2.007365E38)
            com.ss.android.ugc.aweme.im.service.share.b.a r4 = r0.f90356j
            android.widget.FrameLayout r4 = r4.f91198c
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r2.inflate(r3, r4, r1)
            com.ss.android.ugc.aweme.im.service.share.b.a r2 = r0.f90356j
            android.widget.FrameLayout r2 = r2.f91198c
            r3 = 2132022654(0x7f14157e, float:1.9683734E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "payload.sendContainer.fi…ById(R.id.send_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.f90360o = r2
            com.ss.android.ugc.aweme.im.service.share.b.a r2 = r0.f90356j
            android.widget.FrameLayout r2 = r2.f91198c
            r3 = 2132022647(0x7f141577, float:1.968372E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "payload.sendContainer.findViewById(R.id.send)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            r0.f90359n = r2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r0.f90359n
            if (r2 != 0) goto L_0x0158
            java.lang.String r3 = "sendTv"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0158:
            com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$f r3 = new com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$f
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.content.Context r2 = r0.f90348b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2132214897(0x7f170471, float:2.0073649E38)
            com.ss.android.ugc.aweme.im.service.share.b.a r4 = r0.f90356j
            android.view.ViewGroup r4 = r4.f91197b
            r2.inflate(r3, r4, r1)
            com.ss.android.ugc.aweme.im.service.share.b.a r2 = r0.f90356j
            android.view.ViewGroup r2 = r2.f91197b
            r3 = 2132021136(0x7f140f90, float:1.9680655E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.multi_share_rv)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r0.f90352f = r3
            r3 = 2132021135(0x7f140f8f, float:1.9680653E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.multi_share_et)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtEditText) r3
            r0.f90353g = r3
            r3 = 2132021134(0x7f140f8e, float:1.968065E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "findViewById(R.id.multi_share_cover)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            r0.f90358m = r2
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r0.f90353g
            if (r2 != 0) goto L_0x01ad
            java.lang.String r3 = "editText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01ad:
            android.text.InputFilter[] r1 = new android.text.InputFilter[r1]
            com.ss.android.ugc.aweme.im.sdk.chat.af r3 = new com.ss.android.ugc.aweme.im.sdk.chat.af
            int r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79552a()
            r3.<init>(r4)
            android.text.InputFilter r3 = (android.text.InputFilter) r3
            r1[r6] = r3
            r2.setFilters(r1)
            com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2 r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.INSTANCE
            boolean r1 = r1.mo70516b()
            if (r1 == 0) goto L_0x0284
            com.ss.android.ugc.aweme.im.service.share.b.a r1 = r0.f90356j
            android.view.ViewGroup r1 = r1.f91197b
            r2 = 2132020457(0x7f140ce9, float:1.9679278E38)
            android.view.View r1 = r1.findViewById(r2)
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$d r1 = new com.ss.android.ugc.aweme.im.sdk.share.panel.SharePanelWidget$d
            r1.<init>(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r0.f90353g
            if (r2 != 0) goto L_0x01e3
            java.lang.String r3 = "editText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01e3:
            android.widget.EditText r2 = (android.widget.EditText) r2
            int r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79552a()
            android.content.Context r4 = r0.f90348b
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132545320(0x7f1c0f28, float:2.0743826E38)
            java.lang.String r4 = r4.getString(r5)
            com.ss.android.ugc.aweme.emoji.d.a r1 = (com.p683ss.android.ugc.aweme.emoji.p1684d.C29303a) r1
            com.ss.android.ugc.aweme.emoji.a.i r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1890b.C35145a.C35146a.m79385a(r2, r3, r4, r1)
            com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2 r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.INSTANCE
            android.content.Context r2 = r0.f90348b
            android.view.View r1 = r1.mo70514a(r2)
            com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2 r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.INSTANCE
            int r3 = r2.mo70513a()
            int r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.EXPERIMENT_4
            r5 = 0
            if (r3 == r4) goto L_0x0211
        L_0x020f:
            r13 = r5
            goto L_0x022a
        L_0x0211:
            com.bytedance.keva.Keva r2 = r2.mo70520f()
            java.lang.String r3 = "scroll_anim_key"
            boolean r2 = r2.getBoolean(r3, r6)
            if (r2 == 0) goto L_0x0225
            java.lang.String r2 = "Emoji"
            java.lang.String r3 = "already guide once,not show"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r2, r3)
            goto L_0x020f
        L_0x0225:
            com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2$b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.C33216b.f86210a
            com.ss.android.ugc.aweme.emoji.e.c r2 = (com.p683ss.android.ugc.aweme.emoji.p1685e.C29314c) r2
            r13 = r2
        L_0x022a:
            com.ss.android.ugc.aweme.emoji.d.b r2 = new com.ss.android.ugc.aweme.emoji.d.b
            java.lang.String r3 = "emojiLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)
            com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2 r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.INSTANCE
            int r10 = r3.mo70517c()
            com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2 r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2.INSTANCE
            android.content.Context r4 = r0.f90348b
            android.support.v7.widget.RecyclerView$i r12 = r3.mo70515b(r4)
            r7 = r2
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.im.sdk.share.panel.b r3 = new com.ss.android.ugc.aweme.im.sdk.share.panel.b
            android.widget.LinearLayout r4 = r0.f90360o
            if (r4 != 0) goto L_0x024f
            java.lang.String r6 = "sendContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x024f:
            r15 = r4
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            com.ss.android.ugc.aweme.emoji.d.c r4 = new com.ss.android.ugc.aweme.emoji.d.c
            r4.<init>(r2)
            if (r1 == 0) goto L_0x0263
            r2 = 2132018795(0x7f14066b, float:1.9675907E38)
            android.view.View r1 = r1.findViewById(r2)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
        L_0x0263:
            r17 = r5
            com.ss.android.ugc.aweme.im.service.share.b.a r1 = r0.f90356j
            com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout r1 = r1.f91200e
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = r0.f90353g
            if (r2 != 0) goto L_0x0272
            java.lang.String r5 = "editText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0272:
            r20 = 0
            r21 = 32
            r22 = 0
            r14 = r3
            r16 = r4
            r18 = r1
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r0.f90355i = r3
        L_0x0284:
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r1 = r0.f90349c
            if (r1 != 0) goto L_0x028d
            java.lang.String r2 = "viewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x028d:
            com.ss.android.ugc.aweme.im.sdk.relations.core.g r2 = r1.mo73286f()
            r3 = r1
            com.ss.android.ugc.aweme.im.sdk.relations.core.b.d r3 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d) r3
            r2.mo72981a(r3)
            com.ss.android.ugc.aweme.im.sdk.relations.core.g r1 = r1.mo73286f()
            r1.mo72991f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.SharePanelWidget.<init>(com.ss.android.ugc.aweme.im.service.share.b.a, com.ss.android.ugc.aweme.im.service.share.a.b):void");
    }
}
