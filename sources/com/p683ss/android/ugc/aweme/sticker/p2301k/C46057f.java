package com.p683ss.android.ugc.aweme.sticker.p2301k;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.p1057b.p1060c.C17592aq;
import com.p683ss.android.ugc.aweme.effectplatform.C29240a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44985aq;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45183i;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.k.f */
public final class C46057f {

    /* renamed from: com.ss.android.ugc.aweme.sticker.k.f$a */
    public static class C46058a {
        /* renamed from: a */
        public static List<EffectCategoryModel> m100060a(Context context) {
            ArrayList arrayList = new ArrayList();
            String[] stringArray = context.getResources().getStringArray(R.array.n);
            if (context instanceof AppCompatActivity) {
                EffectStickerViewModel effectStickerViewModel = (EffectStickerViewModel) C0214z.m440a((FragmentActivity) (AppCompatActivity) context).mo359a(EffectStickerViewModel.class);
                if (effectStickerViewModel.mo93416a() != null && effectStickerViewModel.mo93416a().mo91265e()) {
                    stringArray = new String[]{"..."};
                }
            }
            for (String str : stringArray) {
                EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
                effectCategoryModel.setName(str);
                arrayList.add(effectCategoryModel);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static Effect m100056a(List<Effect> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        for (Effect effect : list) {
            if (!C46059g.m100076b(effect)) {
                return effect;
            }
        }
        return (Effect) list.get(0);
    }

    /* renamed from: b */
    public static HashMap<String, Integer> m100058b(List<StickerWrapper> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list == null) {
            return hashMap;
        }
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((StickerWrapper) list.get(i)).f115779a.getEffectId(), Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: c */
    public static HashMap<String, Integer> m100059c(List<StickerWrapper> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list == null) {
            return hashMap;
        }
        for (int i = 0; i < list.size(); i++) {
            StickerWrapper stickerWrapper = (StickerWrapper) list.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(stickerWrapper.f115780b);
            sb.append(stickerWrapper.f115779a.getEffectId());
            hashMap.put(sb.toString(), Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static FaceStickerBean m100055a(Effect effect) {
        List list;
        if (effect == null) {
            return FaceStickerBean.NONE;
        }
        FaceStickerBean faceStickerBean = new FaceStickerBean();
        if (!(C45183i.m98672a(effect.getEffectId()) == null || C45183i.m98673b(effect.getEffectId()) == null)) {
            faceStickerBean.setForceBindMusic(C45183i.m98672a(effect.getEffectId()));
            faceStickerBean.setForceBindMusicPath(C45183i.m98673b(effect.getEffectId()));
        }
        faceStickerBean.setForceBind(C46059g.m100094r(effect));
        faceStickerBean.setDesignerId(effect.getDesignerId());
        faceStickerBean.setSource(effect.getSource());
        faceStickerBean.setSchema(effect.getSchema());
        faceStickerBean.setBusi(effect.isBusiness());
        faceStickerBean.setAdRawData(effect.getAdRawData());
        faceStickerBean.setFaceStickerCommerceBean((FaceStickerCommerceBean) new C17971f().mo34884a(effect.getExtra(), FaceStickerCommerceBean.class));
        faceStickerBean.setIconUrl(C29240a.m68865a(effect.getIconUrl()));
        faceStickerBean.setFileUrl(C29240a.m68865a(effect.getFileUrl()));
        try {
            faceStickerBean.setStickerId(Long.parseLong(effect.getEffectId()));
        } catch (NumberFormatException unused) {
            faceStickerBean.setStickerId(-1);
        }
        faceStickerBean.setId(effect.getId());
        faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
        faceStickerBean.setMusicIds(effect.getMusic());
        faceStickerBean.setName(effect.getName());
        faceStickerBean.setHint(effect.getHint());
        faceStickerBean.setHintIcon(C29240a.m68865a(effect.getHintIcon()));
        faceStickerBean.setLocalPath(effect.getUnzipPath());
        if (effect.getTypes() == null) {
            list = new ArrayList();
        } else {
            list = effect.getTypes();
        }
        faceStickerBean.setTypes(list);
        faceStickerBean.setTags(effect.getTags());
        faceStickerBean.setChildren(effect.getChildren());
        faceStickerBean.setEffectType(effect.getEffectType());
        faceStickerBean.setParentId(effect.getParentId());
        faceStickerBean.setExtra(effect.getExtra());
        if (effect.getPoiId() != null) {
            faceStickerBean.setStickerPoi(new C44985aq(effect.getPoiId(), effect.isIsPoi()));
        }
        faceStickerBean.setSdkExtra(effect.getSdkExtra());
        faceStickerBean.setGradeKey(effect.getGradeKey());
        return faceStickerBean;
    }

    /* renamed from: a */
    public static void m100057a(C17592aq<String, String> aqVar, List<StickerWrapper> list) {
        if (list != null) {
            if (!aqVar.isEmpty()) {
                aqVar.clear();
            }
            for (StickerWrapper stickerWrapper : list) {
                aqVar.put(stickerWrapper.f115779a.getEffectId(), stickerWrapper.f115780b);
            }
        }
    }
}
