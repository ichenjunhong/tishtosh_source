package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem */
public class BusinessGoodsPublishSettingItem extends PublishSettingItem {

    /* renamed from: a */
    public boolean f113630a;

    /* renamed from: b */
    private C44900a f113631b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem$a */
    public interface C44900a {
        /* renamed from: a */
        void mo91046a(boolean z);
    }

    public void setStateChangeCB(C44900a aVar) {
        this.f113631b = aVar;
    }

    public void setBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        if (businessGoodsPublishModel != null) {
            if (!TextUtils.isEmpty(businessGoodsPublishModel.title)) {
                setTitle(businessGoodsPublishModel.title);
                this.f113630a = true;
                setDrawableLeft((int) R.drawable.aj4);
            } else {
                setTitle((int) R.string.b9w);
                this.f113630a = false;
                setDrawableLeft((int) R.drawable.a04);
            }
            if (this.f113631b != null) {
                this.f113631b.mo91046a(!TextUtils.isEmpty(businessGoodsPublishModel.title));
            }
            setSubtitle((String) null);
        }
    }

    public BusinessGoodsPublishSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.a04);
        setTitle((int) R.string.b9w);
        setDrawableLeft(drawable);
        setSubtitle((String) null);
    }
}
