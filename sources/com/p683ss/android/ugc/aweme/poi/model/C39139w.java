package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.w */
public final class C39139w implements Serializable {
    @C17952c(mo34828a = "comment_list")
    public List<C39133q> commentList;
    @C17952c(mo34828a = "comment_url")
    public String commentUrl;
    @C17952c(mo34828a = "cost")
    public String cost;
    @C17952c(mo34828a = "customer_service_url")
    public String customerServiceUrl;
    @C17952c(mo34828a = "desc_title")
    public String descTitle;
    @C17952c(mo34828a = "feedback_url")
    public String feedbackUrl;
    @C17952c(mo34828a = "has_detail_info")
    public boolean hasDetailInfo;
    @C17952c(mo34828a = "has_rate")
    public int hasRate;
    @C17952c(mo34828a = "has_upload_image_permission")
    public boolean hasUploadImagePermission;
    @C17952c(mo34828a = "i18n_cost")
    public String i18nCost;
    @C17952c(mo34828a = "introduction")
    public String introduction;
    @C17952c(mo34828a = "open_time")
    public String open_time;
    @C17952c(mo34828a = "order_info")
    public C39099ae orderInfo;
    @C17952c(mo34828a = "photos")
    public List<C39101ag> photos;
    @C17952c(mo34828a = "poi_activity_info")
    public C39120d poiActivityInfo;
    @C17952c(mo34828a = "destination_poi_class_list")
    public List<C39119c> poiClassInfoStructList;
    @C17952c(mo34828a = "poi_class_rank")
    public C39132p poiClassRank;
    @C17952c(mo34828a = "question_info")
    public C39107am questionInfo;
    @C17952c(mo34828a = "rating")
    public String rating;
    @C17952c(mo34828a = "recommend_items")
    public List<C39101ag> recommendItems;
    @C17952c(mo34828a = "recommend_title")
    public String recommendTitle;
    @C17952c(mo34828a = "biz_src")
    public int source;
    @C17952c(mo34828a = "specialities")
    public String specialities;
    @C17952c(mo34828a = "sub_type")
    public String subType;
    @C17952c(mo34828a = "tags")
    public String tags;
    @C17952c(mo34828a = "telephone")
    public String telephone;
    @C17952c(mo34828a = "valid")
    public boolean valid;
    @C17952c(mo34828a = "website")
    public String website;

    public final List<C39119c> getPoiClassInfoStructList() {
        return this.poiClassInfoStructList;
    }

    public final long getRankClassCode() {
        if (this.poiClassRank != null) {
            return this.poiClassRank.poiClassCode;
        }
        return -1;
    }

    public final String getRankDesc() {
        if (this.poiClassRank != null) {
            return this.poiClassRank.description;
        }
        return "";
    }

    public final C39106al getQuestion() {
        List questions = this.questionInfo.getQuestions();
        if (C9376b.m18558a((Collection<T>) questions)) {
            return null;
        }
        return (C39106al) questions.get(0);
    }

    public final String[] getPoiCategory() {
        if (this.poiClassInfoStructList == null || this.poiClassInfoStructList.size() == 0) {
            return null;
        }
        String[] strArr = new String[this.poiClassInfoStructList.size()];
        int i = 0;
        for (C39119c cVar : this.poiClassInfoStructList) {
            strArr[i] = cVar.name;
            i++;
        }
        if (i < 3) {
            return null;
        }
        return strArr;
    }

    public final void validatePoiClassInfoStructList() {
        if (this.poiClassInfoStructList != null) {
            for (int size = this.poiClassInfoStructList.size() - 1; size >= 0; size--) {
                if (((C39119c) this.poiClassInfoStructList.get(size)).size() < 3) {
                    this.poiClassInfoStructList.remove(size);
                }
            }
        }
    }

    public final C39119c getPoiClassInfoStruct(int i) {
        return (C39119c) this.poiClassInfoStructList.get(i);
    }
}
