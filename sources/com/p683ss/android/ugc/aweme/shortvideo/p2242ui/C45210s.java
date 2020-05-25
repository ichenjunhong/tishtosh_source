package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p683ss.android.ugc.aweme.services.publish.LocationActivityPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s */
public final class C45210s implements IAVPublishExtension<LocationActivityPublishModel> {

    /* renamed from: b */
    public static final C45211a f114375b = new C45211a(null);

    /* renamed from: a */
    public LocationActivitySettingItem f114376a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s$a */
    public static final class C45211a {
        private C45211a() {
        }

        public /* synthetic */ C45211a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s$b */
    static final class C45212b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45210s f114377a;

        C45212b(C45210s sVar) {
            this.f114377a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                LocationActivitySettingItem a = this.f114377a.mo91498a();
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                a.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s$c */
    static final class C45213c<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45210s f114378a;

        C45213c(C45210s sVar) {
            this.f114378a = sVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C45210s sVar = this.f114378a;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    LocationActivitySettingItem locationActivitySettingItem = sVar.f114376a;
                    if (locationActivitySettingItem == null) {
                        C52711k.m112237a("delegate");
                    }
                    locationActivitySettingItem.setAlpha(1.0f);
                    LocationActivitySettingItem locationActivitySettingItem2 = sVar.f114376a;
                    if (locationActivitySettingItem2 == null) {
                        C52711k.m112237a("delegate");
                    }
                    locationActivitySettingItem2.setEnabled(true);
                } else {
                    LocationActivitySettingItem locationActivitySettingItem3 = sVar.f114376a;
                    if (locationActivitySettingItem3 == null) {
                        C52711k.m112237a("delegate");
                    }
                    locationActivitySettingItem3.setAlpha(0.5f);
                    LocationActivitySettingItem locationActivitySettingItem4 = sVar.f114376a;
                    if (locationActivitySettingItem4 == null) {
                        C52711k.m112237a("delegate");
                    }
                    locationActivitySettingItem4.setEnabled(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s$d */
    static final class C45214d extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45210s f114379a;

        C45214d(C45210s sVar) {
            this.f114379a = sVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f114379a.mo91498a().setPoiActivity(PoiContext.unserializeFromJson((String) obj));
            return C52860x.f131107a;
        }
    }

    public final String getName() {
        return "LocationActivityPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
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

    public final void onSaveDraft(PublishOutput publishOutput) {
        C52711k.m112240b(publishOutput, "publishOutput");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C52711k.m112240b(bundle, "outState");
    }

    public final /* synthetic */ Object provideExtensionData() {
        return new LocationActivityPublishModel();
    }

    /* renamed from: a */
    public final LocationActivitySettingItem mo91498a() {
        LocationActivitySettingItem locationActivitySettingItem = this.f114376a;
        if (locationActivitySettingItem == null) {
            C52711k.m112237a("delegate");
        }
        return locationActivitySettingItem;
    }

    public final void onEnterChildrenMode() {
        LocationActivitySettingItem locationActivitySettingItem = this.f114376a;
        if (locationActivitySettingItem == null) {
            C52711k.m112237a("delegate");
        }
        locationActivitySettingItem.setVisibility(8);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(linearLayout, "extensionWidgetContainer");
        C52711k.m112240b(aVPublishContentType, "contentType");
        C52711k.m112240b(publishOutput, "publishOutput");
        C52711k.m112240b(extensionMisc, "extensionMisc");
        C52711k.m112240b(callback, "callback");
        LocationActivitySettingItem locationActivitySettingItem = new LocationActivitySettingItem(linearLayout.getContext());
        linearLayout.addView(locationActivitySettingItem, new LayoutParams(-1, -2));
        locationActivitySettingItem.setVisibility(8);
        this.f114376a = locationActivitySettingItem;
        C0184k kVar = fragment;
        extensionMisc.getExtensionDataRepo().getLocationActivityVisible().observe(kVar, new C45212b(this));
        extensionMisc.getExtensionDataRepo().getLocationState().observe(kVar, new C45213c(this));
        extensionMisc.getExtensionDataRepo().setSetPoiActivity(new C45214d(this));
    }
}
