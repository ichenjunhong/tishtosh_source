package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem */
public class LocationSettingItem extends PublishSettingItem {

    /* renamed from: a */
    PoiStruct f113646a;

    /* renamed from: b */
    boolean f113647b;

    /* renamed from: k */
    private C44905a f113648k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem$a */
    public interface C44905a {
        /* renamed from: a */
        void mo91067a(boolean z);
    }

    public PoiStruct getPoiStruct() {
        return this.f113646a;
    }

    /* renamed from: a */
    public final boolean mo91060a() {
        if (!C9431p.m18664a(getPoiId())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo91061b() {
        super.mo91061b();
        getIconRight().setDuplicateParentStateEnabled(true);
    }

    public String getPoiId() {
        if (this.f113646a == null) {
            return null;
        }
        return this.f113646a.getPoiId();
    }

    public String getPoiName() {
        if (this.f113646a == null) {
            return null;
        }
        return this.f113646a.getPoiName();
    }

    public void setStateChangeCB(C44905a aVar) {
        this.f113648k = aVar;
    }

    public void setLocation(PoiStruct poiStruct) {
        this.f113646a = poiStruct;
        boolean z = true;
        setTextHighlight(true);
        int i = 8;
        if (poiStruct == null) {
            if (this.f113647b) {
                i = 0;
            }
            this.f113682i.setVisibility(i);
            setSingleLine(false);
            setTitle((int) R.string.eo);
            setSubtitle((String) null);
        } else {
            this.f113682i.setVisibility(8);
            setSingleLine(true);
            setTitle(poiStruct.getPoiName());
        }
        if (this.f113648k != null) {
            C44905a aVar = this.f113648k;
            if (poiStruct == null) {
                z = false;
            }
            aVar.mo91067a(z);
        }
    }

    public LocationSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTitle((int) R.string.eo);
        setDrawableLeft(getContext().getResources().getDrawable(R.drawable.aap));
        getIconRight().setDuplicateParentStateEnabled(true);
        setSubtitle((String) null);
    }
}
