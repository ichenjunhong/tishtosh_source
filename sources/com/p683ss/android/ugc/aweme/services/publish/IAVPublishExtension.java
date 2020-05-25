package com.p683ss.android.ugc.aweme.services.publish;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.widget.LinearLayout;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.publish.IAVPublishExtension */
public interface IAVPublishExtension<T> {

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback */
    public interface Callback {
        void onContentModified();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$DefaultImpls */
    public static final class DefaultImpls {
        public static <T> void onCreateFinish(IAVPublishExtension<T> iAVPublishExtension) {
        }

        public static <T> void onRequestPermissionsResult(IAVPublishExtension<T> iAVPublishExtension, int i, String[] strArr, int[] iArr) {
            C52711k.m112240b(strArr, "permissions");
            C52711k.m112240b(iArr, "grantResults");
        }

        public static <T> void onResume(IAVPublishExtension<T> iAVPublishExtension) {
        }
    }

    String getName();

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed(PublishOutput publishOutput);

    void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback);

    void onCreateFinish();

    void onDestroy();

    void onEnterChildrenMode();

    void onPublish(PublishOutput publishOutput);

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();

    void onSaveDraft(PublishOutput publishOutput);

    void onSaveInstanceState(Bundle bundle);

    T provideExtensionData();
}
