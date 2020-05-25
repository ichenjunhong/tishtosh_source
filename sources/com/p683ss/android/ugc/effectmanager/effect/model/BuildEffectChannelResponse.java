package com.p683ss.android.ugc.effectmanager.effect.model;

import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse */
public class BuildEffectChannelResponse {
    private String mFileDirectory;
    private boolean mIsCache;
    private String mPanel;

    public EffectChannelResponse buildChannelResponse(EffectChannelModel effectChannelModel) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect effect : effectChannelModel.getEffects()) {
            hashMap.put(effect.getEffectId(), effect);
        }
        for (Effect effect2 : effectChannelModel.getCollection()) {
            hashMap2.put(effect2.getEffectId(), effect2);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse();
        effectChannelResponse.setPanel(this.mPanel);
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAllCategoryEffects(effectChannelModel.getEffects());
        effectChannelResponse.setCollections(effectChannelModel.getCollection());
        effectChannelResponse.setUrlPrefix(effectChannelModel.getUrlPrefix());
        effectChannelResponse.setCategoryResponseList(initCategory(effectChannelModel, hashMap));
        getChildEffect(effectChannelModel.getEffects(), hashMap2);
        effectChannelResponse.setPanelModel(effectChannelModel.getPanel());
        effectChannelResponse.setFrontEffect(getEffect(effectChannelModel.getFront_effect_id(), hashMap));
        effectChannelResponse.setRearEffect(getEffect(effectChannelModel.getRear_effect_id(), hashMap));
        if (!this.mIsCache) {
            C48669g.m105308a(this.mFileDirectory, this.mPanel, effectChannelModel.getEffects());
            C48669g.m105308a(this.mFileDirectory, this.mPanel, effectChannelModel.getCollection());
        }
        return effectChannelResponse;
    }

    private Effect getEffect(String str, Map<String, Effect> map) {
        return (Effect) map.get(str);
    }

    private List<Effect> getCategoryAllEffects(EffectCategoryModel effectCategoryModel, Map<String, Effect> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : effectCategoryModel.getEffects()) {
            Effect effect = (Effect) map.get(str);
            if (effect != null) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    private void getChildEffect(List<Effect> list, Map<String, Effect> map) {
        for (Effect effect : list) {
            if (effect.getEffectType() == 1) {
                ArrayList arrayList = new ArrayList();
                for (String str : effect.getChildren()) {
                    Effect effect2 = (Effect) map.get(str);
                    if (effect2 != null) {
                        arrayList.add(effect2);
                    }
                }
                effect.setChildEffects(arrayList);
            }
        }
    }

    private List<EffectCategoryResponse> initCategory(EffectChannelModel effectChannelModel, Map<String, Effect> map) {
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.getCategory().isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory()) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                if (!effectCategoryModel.getIcon().getUrl_list().isEmpty()) {
                    effectCategoryResponse.setIcon_normal_url((String) effectCategoryModel.getIcon().getUrl_list().get(0));
                }
                if (!effectCategoryModel.getIcon_selected().getUrl_list().isEmpty()) {
                    effectCategoryResponse.setIcon_selected_url((String) effectCategoryModel.getIcon_selected().getUrl_list().get(0));
                }
                effectCategoryResponse.setTotalEffects(getCategoryAllEffects(effectCategoryModel, map));
                effectCategoryResponse.setTags(effectCategoryModel.getTags());
                effectCategoryResponse.setTagsUpdateTime(effectCategoryModel.getTagsUpdateTime());
                effectCategoryResponse.setCollectionEffect(effectChannelModel.getCollection());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                effectCategoryResponse.setIsDefault(effectCategoryModel.isDefault());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public BuildEffectChannelResponse(String str, String str2, boolean z) {
        this.mPanel = str;
        this.mFileDirectory = str2;
        this.mIsCache = z;
    }
}
