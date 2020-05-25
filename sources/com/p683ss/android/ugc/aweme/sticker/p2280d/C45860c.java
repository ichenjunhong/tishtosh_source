package com.p683ss.android.ugc.aweme.sticker.p2280d;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46051b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46051b.C46052a;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.c */
public final class C45860c {
    /* renamed from: a */
    private static ToolsUrlModel m99703a(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "$this$toToolsUrlModel");
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.f118258a = urlModel.getUri();
        toolsUrlModel.f118259b = urlModel.getUrlList();
        return toolsUrlModel;
    }

    /* renamed from: a */
    public static final FaceSticker m99702a(Effect effect) {
        if (effect == null) {
            return null;
        }
        FaceSticker faceSticker = new FaceSticker();
        faceSticker.f84548id = effect.getId();
        String effectId = effect.getEffectId();
        C52711k.m112236a((Object) effectId, "effectId");
        faceSticker.stickerId = Long.parseLong(effectId);
        UrlModel fileUrl = effect.getFileUrl();
        C52711k.m112236a((Object) fileUrl, "fileUrl");
        faceSticker.fileUrl = m99703a(fileUrl);
        UrlModel iconUrl = effect.getIconUrl();
        C52711k.m112236a((Object) iconUrl, "iconUrl");
        faceSticker.iconUrl = m99703a(iconUrl);
        faceSticker.localPath = effect.getUnzipPath();
        faceSticker.name = effect.getName();
        faceSticker.hint = effect.getHint();
        faceSticker.types = effect.getTypes();
        faceSticker.tags = effect.getTags();
        faceSticker.sdkExtra = effect.getSdkExtra();
        faceSticker.extra = effect.getExtra();
        return faceSticker;
    }

    /* renamed from: a */
    public static final void m99704a(Activity activity, Intent intent, int i, C52686q<? super Integer, ? super Integer, ? super Intent, C52860x> qVar) {
        C52711k.m112240b(activity, "$this$startTaskForResult");
        C52711k.m112240b(intent, "intent");
        C52711k.m112240b(qVar, "onActivityResult");
        String str = "async_task";
        Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(str);
        C46051b a = C46052a.m100044a(intent, i, qVar);
        if (findFragmentByTag != null) {
            activity.getFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        activity.getFragmentManager().beginTransaction().add(a, str).commitAllowingStateLoss();
    }
}
