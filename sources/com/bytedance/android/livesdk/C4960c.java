package com.bytedance.android.livesdk;

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
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.C8805i;
import com.bytedance.android.livesdkapi.host.C8806j;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p452b.C8793a;
import com.bytedance.android.livesdkapi.p450h.C8753d;
import com.bytedance.android.livesdkapi.p450h.C8754e;
import com.bytedance.android.livesdkapi.view.C8864a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.c */
public final class C4960c implements IHostApp {

    /* renamed from: a */
    private IHostApp f13300a;

    public final C8753d avatarBorderController() {
        return this.f13300a.avatarBorderController();
    }

    public final String getBgBroadcastServiceName() {
        return this.f13300a.getBgBroadcastServiceName();
    }

    public final Class getLiveActivityClass() {
        return this.f13300a.getLiveActivityClass();
    }

    public final void hideStickerView() {
        this.f13300a.hideStickerView();
    }

    public final void initImageLib() {
        this.f13300a.initImageLib();
    }

    public final boolean isInMusicallyRegion() {
        return this.f13300a.isInMusicallyRegion();
    }

    public final boolean isShowStickerView() {
        return this.f13300a.isShowStickerView();
    }

    public final void enterRecorderActivity(Activity activity) {
        this.f13300a.enterRecorderActivity(activity);
    }

    public final Class getHostActivity(int i) {
        return this.f13300a.getHostActivity(i);
    }

    public final Typeface getHostTypeface(int i) {
        return this.f13300a.getHostTypeface(i);
    }

    public final C8754e liveCircleView(Context context) {
        return this.f13300a.liveCircleView(context);
    }

    public final void openWallet(Activity activity) {
        this.f13300a.openWallet(activity);
    }

    public final void transCloudControlCommand(JSONObject jSONObject) {
        this.f13300a.transCloudControlCommand(jSONObject);
    }

    public final void tryDownloadGiftImage(String str) {
        this.f13300a.tryDownloadGiftImage(str);
    }

    public final void tryDownloadImage(String str) {
        this.f13300a.tryDownloadImage(str);
    }

    public C4960c(IHostApp iHostApp) {
        this.f13300a = iHostApp;
        C4116c.m10251a(IHostApp.class, this);
    }

    public final void checkBindHelpShow(FragmentActivity fragmentActivity, String str) {
        this.f13300a.checkBindHelpShow(fragmentActivity, str);
    }

    public final Uri getUriForFile(Context context, File file) {
        return this.f13300a.getUriForFile(context, file);
    }

    public final boolean startVideoRecordActivity(Activity activity, String str) {
        return this.f13300a.startVideoRecordActivity(activity, str);
    }

    public final void bindGifImage(View view, String str, Config config) {
        this.f13300a.bindGifImage(view, str, config);
    }

    public final void centerToast(Context context, String str, int i) {
        this.f13300a.centerToast(context, str, i);
    }

    public final void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2) {
        this.f13300a.checkAndShowGuide(fragmentActivity, str, str2);
    }

    public final void systemToast(Context context, String str, int i) {
        this.f13300a.systemToast(context, str, i);
    }

    public final void startBindMobileFullFragment(Activity activity, String str, String str2, C8805i iVar) {
        this.f13300a.startBindMobileFullFragment(activity, str, str2, iVar);
    }

    public final void startBindPhoneDialogFragment(Activity activity, String str, String str2, C8805i iVar) {
        this.f13300a.startBindPhoneDialogFragment(activity, str, str2, iVar);
    }

    public final void centerToast(Context context, String str, int i, boolean z) {
        this.f13300a.centerToast(context, str, i, z);
    }

    public final void showStickerView(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, C8806j jVar) {
        this.f13300a.showStickerView(appCompatActivity, kVar, str, frameLayout, jVar);
    }

    public final Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C8864a aVar, CharSequence charSequence4, C8864a aVar2, C8793a aVar3) {
        return this.f13300a.showDialog(context, charSequence, charSequence2, charSequence3, aVar, charSequence4, aVar2, aVar3);
    }
}
