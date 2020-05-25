package com.p683ss.android.ugc.aweme.services.external;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.shortvideo.C42558cp;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b;

/* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig */
public interface IPrivacyConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionModule */
    public interface IPermissionModule {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionModule$Companion */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        void onSaveInstanceState(Bundle bundle);

        void receivePermissionResult(Intent intent);

        void restoreSavedInstanceState(Bundle bundle);

        void setupByActivity(C42558cp cpVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.IPrivacyConfig$IPermissionSettingItem */
    public interface IPermissionSettingItem {
        View asView();

        DmtTextView getPrivateHint();

        ImageView getPrivateIcon();

        void setPermission(int i);
    }

    C43237b checkDuetReactPermission(String str, int i);

    IPermissionModule createPermissionModule(Activity activity, IPermissionSettingItem iPermissionSettingItem, int i);

    IPermissionSettingItem createPermissionSettingItem(Context context);
}
