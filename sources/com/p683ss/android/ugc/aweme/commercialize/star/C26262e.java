package com.p683ss.android.ugc.aweme.commercialize.star;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.google.gson.C17971f;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.commercialize.star.C26257b.C26258a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc.C39592a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.settings2.TcmNameCtrySettings;
import com.p683ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45385ai;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.e */
public final class C26262e implements IAVPublishExtension<StarAtlasPublishModel> {

    /* renamed from: e */
    public static final C26263a f69336e = new C26263a(null);

    /* renamed from: a */
    public C26269f f69337a;

    /* renamed from: b */
    public MentionEditText f69338b;

    /* renamed from: c */
    public Context f69339c;

    /* renamed from: d */
    public ExtensionMisc f69340d;

    /* renamed from: f */
    private Fragment f69341f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$a */
    public static final class C26263a {
        private C26263a() {
        }

        public /* synthetic */ C26263a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$b */
    static final class C26264b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C26262e f69342a;

        C26264b(C26262e eVar) {
            this.f69342a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C45385ai.m98941a(this.f69342a.f69339c, this.f69342a.f69338b, this.f69342a.mo53913a().getStarAtlasHashTag());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$c */
    static final class C26265c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C26262e f69343a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f69344b;

        C26265c(C26262e eVar, ExtensionMisc extensionMisc) {
            this.f69343a = eVar;
            this.f69344b = extensionMisc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AnchorTransData anchorTransData = (AnchorTransData) this.f69344b.getExtensionDataRepo().getUpdateAnchor().getValue();
            if (anchorTransData == null || anchorTransData.getBusinessType() != C25600a.ANCHOR_SHOP_LINK.getTYPE()) {
                C45385ai.m98942a(this.f69343a.f69338b);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$d */
    static final class C26266d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26262e f69345a;

        /* renamed from: b */
        final /* synthetic */ PublishOutput f69346b;

        /* renamed from: c */
        final /* synthetic */ AVPublishContentType f69347c;

        /* renamed from: d */
        final /* synthetic */ Fragment f69348d;

        C26266d(C26262e eVar, PublishOutput publishOutput, AVPublishContentType aVPublishContentType, Fragment fragment) {
            this.f69345a = eVar;
            this.f69346b = publishOutput;
            this.f69347c = aVPublishContentType;
            this.f69348d = fragment;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            if (C26262e.m63633a(this.f69346b, this.f69347c)) {
                try {
                    IESSettingsProxy b = C32816h.m75716b();
                    C52711k.m112236a((Object) b, "SettingsReader.get()");
                    str = b.getTcmNameCtry();
                } catch (Exception unused) {
                    str = TcmNameCtrySettings.DEFAULT;
                }
                Context context = this.f69348d.getContext();
                Context context2 = this.f69348d.getContext();
                if (context2 != null) {
                    String string = context2.getString(R.string.hko);
                    if (string != null) {
                        str2 = C2240a.m6772a(string, Arrays.copyOf(new Object[]{str}, 1));
                        C52711k.m112236a((Object) str2, "java.lang.String.format(format, *args)");
                        C9432q.m18676a(context, str2);
                        return;
                    }
                }
                str2 = null;
                C9432q.m18676a(context, str2);
                return;
            }
            Activity activity = this.f69348d.getActivity();
            String starAtlasContent = this.f69345a.mo53913a().getStarAtlasContent();
            C37383a a = C37382g.m83707a(C26260d.f69332a.mo53912a());
            if (!TextUtils.isEmpty(starAtlasContent)) {
                String str3 = "anchor_content";
                if (starAtlasContent == null) {
                    C52711k.m112234a();
                }
                a.mo76659a(str3, starAtlasContent);
            }
            C41302w a2 = C41302w.m91042a();
            if (a2 != null) {
                a2.mo83858a(activity, a.mo76658a().toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$e */
    static final class C26267e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C26262e f69349a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f69350b;

        /* renamed from: c */
        final /* synthetic */ PublishOutput f69351c;

        /* renamed from: d */
        final /* synthetic */ AVPublishContentType f69352d;

        C26267e(C26262e eVar, ExtensionMisc extensionMisc, PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
            this.f69349a = eVar;
            this.f69350b = extensionMisc;
            this.f69351c = publishOutput;
            this.f69352d = aVPublishContentType;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str;
            if (C26262e.m63632a(this.f69350b)) {
                this.f69349a.mo53913a().setVisibility(8);
            } else {
                if (C26262e.m63633a(this.f69351c, this.f69352d)) {
                    this.f69349a.mo53913a().setAlpha(0.5f);
                } else if (this.f69349a.mo53913a().f113683j) {
                    this.f69349a.mo53913a().setAlpha(1.0f);
                }
                boolean z = false;
                this.f69349a.mo53913a().setVisibility(0);
                C26269f a = this.f69349a.mo53913a();
                a.setHasStarAtlasOrder(false);
                a.setStarAtlasOrderId(0);
                ExtensionDataRepo extensionDataRepo = a.f69354a;
                if (extensionDataRepo == null) {
                    C52711k.m112237a("extensionDataRepo");
                }
                extensionDataRepo.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                C39592a publishExtensionDataContainer = this.f69350b.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer != null) {
                    str = publishExtensionDataContainer.mo78634c();
                } else {
                    str = null;
                }
                C26109ad a2 = C26109ad.m63393a(str);
                C26269f a3 = this.f69349a.mo53913a();
                C52711k.m112236a((Object) a2, "model");
                a3.setHasStarAtlasOrder(a2.f68922d);
                CharSequence charSequence = a2.f68937s;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                if (!z) {
                    this.f69349a.mo53913a().mo53915a(new JSONObject(a2.f68937s));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.e$f */
    static final class C26268f<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C26262e f69353a;

        C26268f(C26262e eVar) {
            this.f69353a = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C26262e eVar = this.f69353a;
                C52711k.m112236a((Object) bool, "it");
                boolean booleanValue = bool.booleanValue();
                C26269f fVar = eVar.f69337a;
                if (fVar == null) {
                    C52711k.m112237a("delegate");
                }
                fVar.setEnable(booleanValue);
                C26269f fVar2 = eVar.f69337a;
                if (fVar2 == null) {
                    C52711k.m112237a("delegate");
                }
                if (booleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                fVar2.setAlpha(f);
            }
        }
    }

    public final String getName() {
        return "StarAtlasPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onCreateFinish() {
        DefaultImpls.onCreateFinish(this);
    }

    public final void onDestroy() {
    }

    public final void onPublish(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
    }

    public final /* synthetic */ Object provideExtensionData() {
        return new StarAtlasPublishModel();
    }

    /* renamed from: a */
    public final C26269f mo53913a() {
        C26269f fVar = this.f69337a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        return fVar;
    }

    public final void onEnterChildrenMode() {
        C26269f fVar = this.f69337a;
        if (fVar == null) {
            C52711k.m112237a("delegate");
        }
        fVar.setVisibility(8);
    }

    /* renamed from: a */
    public static boolean m63632a(ExtensionMisc extensionMisc) {
        String str;
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        C52711k.m112236a((Object) a, "PublishExtensionModel.fr…taContainer?.publishData)");
        if (a.f68924f != null) {
            return true;
        }
        return false;
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        String str;
        C52711k.m112240b(publishOutput, "publishOutput");
        ExtensionMisc extensionMisc = this.f69340d;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        C52711k.m112236a((Object) a, "model");
        a.mo53628a(false);
        a.f68923e = "";
        a.f68921c = 0;
        ExtensionMisc extensionMisc2 = this.f69340d;
        if (extensionMisc2 == null) {
            C52711k.m112237a("extensionMisc");
        }
        C39592a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.mo78632a(new C17971f().mo34889b(a));
        }
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        String str;
        C52711k.m112240b(publishOutput, "publishOutput");
        ExtensionMisc extensionMisc = this.f69340d;
        if (extensionMisc == null) {
            C52711k.m112237a("extensionMisc");
        }
        C39592a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo78634c();
        } else {
            str = null;
        }
        C26109ad a = C26109ad.m63393a(str);
        a.f68937s = "";
        C52711k.m112236a((Object) a, "model");
        a.mo53628a(false);
        a.f68923e = "";
        a.f68921c = 0;
        ExtensionMisc extensionMisc2 = this.f69340d;
        if (extensionMisc2 == null) {
            C52711k.m112237a("extensionMisc");
        }
        C39592a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.mo78632a(new C17971f().mo34889b(a));
        }
    }

    /* renamed from: a */
    public static boolean m63633a(PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
        if (!C24678b.m60182a(publishOutput.getMusicId()) || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
            return false;
        }
        return true;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        MentionEditText mentionEditText;
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(linearLayout, "extensionWidgetContainer");
        C52711k.m112240b(aVPublishContentType, "contentType");
        C52711k.m112240b(publishOutput, "publishOutput");
        C52711k.m112240b(extensionMisc, "extensionMisc");
        C52711k.m112240b(callback, "callback");
        this.f69340d = extensionMisc;
        this.f69339c = fragment.getContext();
        this.f69341f = fragment;
        View view = fragment.getView();
        if (view != null) {
            mentionEditText = (MentionEditText) view.findViewById(R.id.a9y);
        } else {
            mentionEditText = null;
        }
        this.f69338b = mentionEditText;
        C26269f fVar = new C26269f(linearLayout.getContext());
        linearLayout.addView(fVar, new LayoutParams(-1, (int) C9432q.m18687b(linearLayout.getContext(), 52.0f)));
        fVar.setGravity(16);
        fVar.setOrientation(0);
        fVar.setVisibility(8);
        this.f69337a = fVar;
        extensionMisc.getExtensionDataRepo().setAddStarAtlasTag(new C26264b(this));
        extensionMisc.getExtensionDataRepo().setRemoveStarAtlasTag(new C26265c(this, extensionMisc));
        C26269f fVar2 = this.f69337a;
        if (fVar2 == null) {
            C52711k.m112237a("delegate");
        }
        fVar2.setExtensionDataRepo(extensionMisc.getExtensionDataRepo());
        C26269f fVar3 = this.f69337a;
        if (fVar3 == null) {
            C52711k.m112237a("delegate");
        }
        fVar3.setPublishExtensionDataContainer(extensionMisc.getPublishExtensionDataContainer());
        C26269f fVar4 = this.f69337a;
        if (fVar4 == null) {
            C52711k.m112237a("delegate");
        }
        fVar4.setTitle((int) R.string.hk_);
        fVar4.setSubtitle((int) R.string.hkr);
        C26269f fVar5 = this.f69337a;
        if (fVar5 == null) {
            C52711k.m112237a("delegate");
        }
        fVar5.setOnClickListener(new C26266d(this, publishOutput, aVPublishContentType, fragment));
        C26257b bVar = C26257b.f69325a;
        C52670a eVar = new C26267e(this, extensionMisc, publishOutput, aVPublishContentType);
        C52711k.m112240b(eVar, "checkOrder");
        if (!C26257b.m63630b()) {
            C17825i.m43740a(StarAtlasOrderApi.m63623a().checkStarAtlasOrder(1, 10), new C26258a(eVar), C23551l.f62672a);
        }
        if (m63632a(extensionMisc)) {
            C26269f fVar6 = this.f69337a;
            if (fVar6 == null) {
                C52711k.m112237a("delegate");
            }
            fVar6.setVisibility(8);
        }
        C26269f fVar7 = this.f69337a;
        if (fVar7 == null) {
            C52711k.m112237a("delegate");
        }
        fVar7.getExtensionDataRepo().getStarAtlasState().observe(fragment, new C26268f(this));
    }
}
