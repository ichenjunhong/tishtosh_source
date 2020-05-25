package com.bytedance.android.live.broadcast.effect.sticker;

import android.content.Context;
import com.bytedance.android.live.base.model.C2978h;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.core.p230g.C3895i;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.f */
public final class C3287f {
    /* renamed from: a */
    private static C2978h m9009a(UrlModel urlModel) {
        if (urlModel == null) {
            return new C2978h();
        }
        C2978h hVar = new C2978h();
        hVar.f8729a = urlModel.getUri();
        hVar.f8730b = urlModel.getUrlList();
        return hVar;
    }

    /* renamed from: a */
    private static UrlModel m9011a(C2978h hVar) {
        if (hVar == null) {
            return new UrlModel();
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(hVar.f8729a);
        urlModel.setUrlList(hVar.f8730b);
        return urlModel;
    }

    /* renamed from: a */
    public static C8688c m9010a(Effect effect) {
        C8688c cVar = new C8688c();
        cVar.f23740a = m9009a(effect.getIconUrl());
        cVar.f23741b = m9009a(effect.getFileUrl());
        cVar.f23746g = effect.getTypes();
        cVar.f23755p = effect.getName();
        cVar.f23756q = effect.getId();
        cVar.f23744e = Long.valueOf(effect.getEffectId()).longValue();
        cVar.f23758s = effect.getZipPath();
        cVar.f23759t = effect.getUnzipPath();
        cVar.f23746g = effect.getTypes();
        cVar.f23762w = effect.getHint();
        cVar.f23760u = effect.isDownloaded();
        cVar.f23747h = effect.getTags();
        cVar.f23754o = effect.getTagsUpdatedAt();
        cVar.f23753n = effect.getEffectId();
        cVar.f23748i = effect.getExtra();
        cVar.f23745f = effect.getName();
        cVar.f23752m = effect;
        return cVar;
    }

    /* renamed from: a */
    public static Effect m9012a(C8688c cVar) {
        if (cVar.f23752m != null) {
            return cVar.f23752m;
        }
        Effect effect = new Effect();
        effect.setId(cVar.f23756q);
        effect.setFileUrl(m9011a(cVar.f23741b));
        effect.setIconUrl(m9011a(cVar.f23740a));
        effect.setZipPath(cVar.f23758s);
        effect.setUnzipPath(cVar.f23759t);
        effect.setTypes(cVar.f23746g);
        effect.setHint(cVar.f23762w);
        effect.setTags(cVar.f23747h);
        effect.setDownloaded(cVar.f23760u);
        effect.setEffectId(cVar.f23753n);
        effect.setTagsUpdatedAt(cVar.f23754o);
        effect.setExtra(cVar.f23748i);
        return effect;
    }

    /* renamed from: a */
    public static String m9013a(Context context) {
        if (context == null) {
            return null;
        }
        File a = C3895i.m9845a(context);
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.getAbsolutePath());
        sb.append(File.separator);
        sb.append(CustomActionPushReceiver.f104061f);
        sb.append(File.separator);
        sb.append("sticker");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (file.exists() || file.mkdirs()) {
            return sb2;
        }
        return null;
    }

    /* renamed from: a */
    public static ImageModel m9008a(String str, List<String> list) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUri(str);
        imageModel.setUrls(list);
        return imageModel;
    }

    /* renamed from: b */
    public static String m9015b(String str, List<String> list) {
        for (String str2 : list) {
            if (str2.startsWith(str)) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    return split[1];
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m9014a(String str, FilterModel filterModel) {
        if (!C9414h.m18630a(filterModel.getTags())) {
            return m9015b(str, filterModel.getTags());
        }
        return null;
    }
}
