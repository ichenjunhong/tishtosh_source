package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.p451a.C8779b;
import com.bytedance.android.livesdkapi.host.p452b.C8793a;
import com.bytedance.android.livesdkapi.p450h.C8753d;
import com.bytedance.android.livesdkapi.p450h.C8754e;
import com.bytedance.android.livesdkapi.view.C8864a;
import java.io.File;
import org.json.JSONObject;

public interface IHostApp extends C2952b, C8779b {
    public static final int BROADCAST_PREVIEW_CLASS = 18;
    public static final int BROADCAST_RES_DOWNLOAD_ACTIVITY_CLASS = 17;
    public static final int BROADCAST_SIGNING_CLASS = 9;
    public static final int GIFT_AD_ACTIVITY_CLASS = 1;
    public static final int LIVE_BG_BROADCAST_ACTIVITY_CLASS = 6;
    public static final int LIVE_BILLING_ACTIVITY_CLASS = 21;
    public static final int LIVE_BROADCAST_ACTIVITY_CLASS = 5;
    public static final int LIVE_BROADCAST_BEFORE_ACTIVITY_CLASS = 16;
    public static final int START_LIVE_ACTIVITY_CLASS = 7;
    public static final int VERIFY_ACTIVITY_CLASS = 8;
    public static final int XT_MEDIA_BROADCAST_ACTIVITY_CLASS = 20;
    public static final int XT_MEDIA_BROADCAST_CONFIG_ACTIVITY_CLASS = 19;

    C8753d avatarBorderController();

    void bindGifImage(View view, String str, Config config);

    void centerToast(Context context, String str, int i);

    void centerToast(Context context, String str, int i, boolean z);

    void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2);

    void checkBindHelpShow(FragmentActivity fragmentActivity, String str);

    void enterRecorderActivity(Activity activity);

    String getBgBroadcastServiceName();

    Class getHostActivity(int i);

    Typeface getHostTypeface(int i);

    Class getLiveActivityClass();

    Uri getUriForFile(Context context, File file);

    void hideStickerView();

    void initImageLib();

    boolean isInMusicallyRegion();

    boolean isShowStickerView();

    C8754e liveCircleView(Context context);

    void openWallet(Activity activity);

    Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C8864a aVar, CharSequence charSequence4, C8864a aVar2, C8793a aVar3);

    void showStickerView(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, C8806j jVar);

    void startBindMobileFullFragment(Activity activity, String str, String str2, C8805i iVar);

    void startBindPhoneDialogFragment(Activity activity, String str, String str2, C8805i iVar);

    boolean startVideoRecordActivity(Activity activity, String str);

    void systemToast(Context context, String str, int i);

    void transCloudControlCommand(JSONObject jSONObject);

    void tryDownloadGiftImage(String str);

    void tryDownloadImage(String str);
}
