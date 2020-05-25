package com.snapchat.kit.sdk.creative.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import com.C2240a;
import com.bytedance.sysoptimizer.BuildConfig;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.creative.media.SnapSticker;
import com.snapchat.kit.sdk.creative.models.SnapContent;
import com.snapchat.kit.sdk.creative.p1092a.C18306a;
import com.snapchat.kit.sdk.creative.p1093b.C18307a;
import com.snapchat.kit.sdk.creative.p1093b.C18308b;
import com.snapchat.kit.sdk.util.SnapUtils;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

public class SnapCreativeKitApi {
    private final String mClientId;
    private final Context mContext;
    private final C18307a mEventFactory;
    private final MetricQueue<ServerEvent> mEventQueue;
    private C18308b mOpMetricsManager;
    private String mRedirectUrl;

    public void send(SnapContent snapContent) {
        sendWithCompletionHandler(snapContent, null);
    }

    public void sendWithCompletionHandler(SnapContent snapContent, SnapCreativeKitCompletionCallback snapCreativeKitCompletionCallback) {
        long currentTimeMillis = System.currentTimeMillis();
        C18306a aVar = new C18306a(this.mClientId, snapContent);
        PackageManager packageManager = this.mContext.getPackageManager();
        if (!SnapUtils.isSnapchatInstalled(packageManager, "com.snapchat.android")) {
            this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C2240a.m6772a("https://play.google.com/store/apps/details?id=%s", new Object[]{"com.snapchat.android"}))));
            this.mOpMetricsManager.mo36707a("sendToPlayStore", 1);
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendFailed(SnapCreativeKitSendError.SNAPCHAT_NOT_INSTALLED);
            }
            return;
        }
        this.mOpMetricsManager.mo36707a("sendIntentToApp", 1);
        Context context = this.mContext;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setDataAndType(Uri.parse(C2240a.m6772a("snapchat://%s?link=%s", new Object[]{aVar.f50521a.getDeeplinkUrlPath(), aVar.f50522b})), aVar.f50521a.getIntentType());
        Uri fileProviderUri = SnapUtils.getFileProviderUri(context, aVar.f50521a.getMediaFile());
        SnapSticker snapSticker = aVar.f50521a.getSnapSticker();
        if (snapSticker != null) {
            Uri fileProviderUri2 = SnapUtils.getFileProviderUri(context, snapSticker.getStickerFile());
            intent.putExtra("sticker", snapSticker.getJsonForm(fileProviderUri2).toString());
            ArrayList arrayList = new ArrayList();
            if (fileProviderUri != null) {
                arrayList.add(fileProviderUri);
            }
            arrayList.add(fileProviderUri2);
            if (arrayList.size() > 1) {
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                intent.setAction("android.intent.action.SEND_MULTIPLE");
            } else if (!arrayList.isEmpty()) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
            }
        } else if (fileProviderUri != null) {
            intent.putExtra("android.intent.extra.STREAM", fileProviderUri);
        }
        String attachmentUrl = aVar.f50521a.getAttachmentUrl();
        if (!TextUtils.isEmpty(attachmentUrl)) {
            intent.putExtra("attachmentUrl", attachmentUrl);
        }
        String captionText = aVar.f50521a.getCaptionText();
        if (!TextUtils.isEmpty(captionText)) {
            intent.putExtra("captionText", captionText);
        }
        intent.setPackage("com.snapchat.android");
        intent.putExtra("CLIENT_ID", this.mClientId);
        intent.putExtra("KIT_VERSION", BuildConfig.VERSION_NAME);
        intent.putExtra("KIT_VERSION_CODE", 11);
        intent.putExtra("deep_link_intent", true);
        if (!TextUtils.isEmpty(this.mRedirectUrl)) {
            intent.putExtra("KIT_REDIRECT_URL", this.mRedirectUrl);
        }
        intent.putExtra("RESULT_INTENT", PendingIntent.getBroadcast(this.mContext, 17, new Intent(), 1073741824));
        intent.setFlags(335544320);
        if (intent.resolveActivity(packageManager) != null) {
            this.mEventQueue.push(new Builder().event_data(new ServerEventData.Builder().creative_kit_share_start(new CreativeKitShareStart.Builder().creative_kit_event_base(new CreativeKitEventBase.Builder().kit_event_base(this.mEventFactory.f50523a.createKitEventBase(KitType.CREATIVE_KIT, BuildConfig.VERSION_NAME)).build()).build()).build()).build());
            this.mContext.startActivity(intent);
            this.mOpMetricsManager.mo36708b("sendLatency", System.currentTimeMillis() - currentTimeMillis);
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendSuccess();
            }
        } else {
            this.mOpMetricsManager.mo36707a("cannotShareContent", 1);
            Toast makeText = Toast.makeText(this.mContext, R.string.dkq, 0);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
            if (snapCreativeKitCompletionCallback != null) {
                snapCreativeKitCompletionCallback.onSendFailed(SnapCreativeKitSendError.SNAPCHAT_CANNOT_SHARE_CONTENT);
            }
        }
    }

    SnapCreativeKitApi(Context context, String str, String str2, C18308b bVar, MetricQueue<ServerEvent> metricQueue, C18307a aVar) {
        this.mContext = context;
        this.mClientId = str;
        this.mRedirectUrl = str2;
        this.mOpMetricsManager = bVar;
        this.mEventQueue = metricQueue;
        this.mEventFactory = aVar;
    }
}
