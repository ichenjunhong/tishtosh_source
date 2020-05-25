package com.p683ss.android.ugc.aweme.live.livehostimpl;

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
import com.bytedance.android.live.base.model.C2978h;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.host.C8805i;
import com.bytedance.android.livesdkapi.host.C8806j;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p452b.C8793a;
import com.bytedance.android.livesdkapi.p450h.C8753d;
import com.bytedance.android.livesdkapi.p450h.C8754e;
import com.bytedance.android.livesdkapi.view.C8864a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.util.C10748a;
import com.bytedance.p753k.C12103a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13953e;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.live.C36093g;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import com.p683ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p683ss.android.ugc.aweme.sticker.IStickerViewService.C45803a;
import com.p683ss.android.ugc.aweme.sticker.p2284h.C45892a;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p683ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.f */
public final class C36105f implements IHostApp {
    public final C8753d avatarBorderController() {
        return null;
    }

    public final void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2) {
    }

    public final void checkBindHelpShow(FragmentActivity fragmentActivity, String str) {
    }

    public final void enterRecorderActivity(Activity activity) {
    }

    public final String getBgBroadcastServiceName() {
        return "com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService";
    }

    public final Uri getUriForFile(Context context, File file) {
        return null;
    }

    public final void initImageLib() {
    }

    public final C8754e liveCircleView(Context context) {
        return null;
    }

    public final Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C8864a aVar, CharSequence charSequence4, C8864a aVar2, C8793a aVar3) {
        return null;
    }

    public final void startBindMobileFullFragment(Activity activity, String str, String str2, C8805i iVar) {
    }

    public final void startBindPhoneDialogFragment(Activity activity, String str, String str2, C8805i iVar) {
    }

    public final boolean startVideoRecordActivity(Activity activity, String str) {
        return true;
    }

    public final void transCloudControlCommand(JSONObject jSONObject) {
    }

    public C36105f() {
        C4116c.m10251a(IHostApp.class, this);
    }

    public final void hideStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin();
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.hideStickerView();
        }
    }

    public final boolean isInMusicallyRegion() {
        if (!C35837h.m80977b()) {
            return true;
        }
        return false;
    }

    public final boolean isShowStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin();
        if (createIStickerViewServicebyMonsterPlugin != null) {
            return createIStickerViewServicebyMonsterPlugin.isShowStickerView();
        }
        return false;
    }

    public final Class getLiveActivityClass() {
        return ((C36093g) C12103a.m24530b(C36093g.class)).mo74847c().mo22886a();
    }

    public final void tryDownloadGiftImage(String str) {
        C23515d.m57687b(str);
    }

    public final void tryDownloadImage(String str) {
        C23515d.m57687b(str);
    }

    public final Class getHostActivity(int i) {
        return ((C36093g) C12103a.m10249a(C36093g.class)).mo74845a(i);
    }

    public final void openWallet(Activity activity) {
        IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
        if (provideWalletService_Monster != null) {
            provideWalletService_Monster.openWallet(activity, IWalletMainProxy.KEY_PAGE_CHARGE);
        }
    }

    public final Typeface getHostTypeface(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 3;
                break;
        }
        return C10748a.m21784a().mo19434a(i2);
    }

    public final void centerToast(Context context, String str, int i) {
        C10691a.m21551c(context, str).mo19066a();
    }

    public final void systemToast(Context context, String str, int i) {
        C10691a.m21551c(context, str).mo19066a();
    }

    public final void bindGifImage(View view, String str, Config config) {
        if (view instanceof SimpleDraweeView) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
            C14229b bVar = null;
            if (str != null && !str.isEmpty()) {
                bVar = C14232c.m29169a(Uri.parse(str)).mo26454a(C13953e.m28430c()).mo26451a(new ImageDecodeOptionsBuilder().setBitmapConfig(config).mo26112a(1).mo26114a()).mo26449a();
            }
            simpleDraweeView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25762c(true)).mo25757b(bVar)).mo25763d());
        }
    }

    public final void centerToast(Context context, String str, int i, boolean z) {
        C10691a.m21551c(context, str).mo19066a();
    }

    public final void showStickerView(AppCompatActivity appCompatActivity, C0654k kVar, String str, FrameLayout frameLayout, final C8806j jVar) {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin();
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.setPixelLoopStickerPresenterSupplier(new C17432q<C45892a>() {

                /* renamed from: c */
                private C45892a f92491c;

                public final /* synthetic */ Object get() {
                    if (this.f92491c == null) {
                        this.f92491c = new C45892a() {
                            /* renamed from: a */
                            public final int mo74856a(String str, String str2) {
                                return jVar.mo9122a(str, str2);
                            }
                        };
                    }
                    return this.f92491c;
                }
            });
            createIStickerViewServicebyMonsterPlugin.showStickerView(appCompatActivity, kVar, str, frameLayout, new C45803a() {
                /* renamed from: a */
                private static C2978h m81490a(ToolsUrlModel toolsUrlModel) {
                    C2978h hVar = new C2978h();
                    hVar.f8729a = toolsUrlModel.f118258a;
                    hVar.f8730b = toolsUrlModel.f118259b;
                    return hVar;
                }

                /* renamed from: b */
                public final void mo74858b(FaceSticker faceSticker) {
                    jVar.mo9124b(m81491c(faceSticker));
                }

                /* renamed from: a */
                public final void mo74857a(FaceSticker faceSticker) {
                    jVar.mo9123a(m81491c(faceSticker));
                }

                /* renamed from: c */
                private C8688c m81491c(FaceSticker faceSticker) {
                    C8688c cVar = new C8688c();
                    if (faceSticker != null) {
                        cVar.f23744e = faceSticker.stickerId;
                        cVar.f23753n = String.valueOf(faceSticker.stickerId);
                        cVar.f23745f = faceSticker.name;
                        cVar.f23740a = m81490a(faceSticker.iconUrl);
                        cVar.f23741b = m81490a(faceSticker.fileUrl);
                        cVar.f23762w = faceSticker.hint;
                        cVar.f23747h = faceSticker.types;
                        cVar.f23759t = faceSticker.localPath;
                        cVar.f23748i = faceSticker.extra;
                        cVar.f23756q = String.valueOf(faceSticker.stickerId);
                    }
                    return cVar;
                }
            });
        }
    }
}
