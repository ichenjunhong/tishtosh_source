package com.p683ss.android.ugc.aweme.services.specialplus;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService */
public interface ISpecialPlusService {
    List<String> getSpecialPlusEffectList();

    String getSpecialPlusOpenUrl();

    String getSpecialPlusTips();

    boolean isNeedShowSpecialPlusDirect();

    void setSpecialPlusClicked();

    void setSpecialPlusShowed();

    boolean shouldShowSpecialPlus();
}
