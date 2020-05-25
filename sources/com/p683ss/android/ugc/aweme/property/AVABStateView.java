package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.property.AVABStateView */
public class AVABStateView extends SettingItemSwitch {

    /* renamed from: b */
    C40762a f103829b;

    public void toggle() {
        setChecked(!isChecked());
        if (C40765ac.m90176e(this.f103829b) != null) {
            C40765ac.m90176e(this.f103829b).mo83111a(Boolean.valueOf(isChecked()));
        }
    }

    public AVABStateView(Context context) {
        super(context);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f28757g.setOnLongClickListener(onLongClickListener);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        C40762a aVar = this.f103829b;
        if (aVar instanceof C40790a) {
            C39618d.f101152P.mo83102a((C40762a) (C40790a) aVar, z);
        } else if (aVar instanceof C40796a) {
            C39618d.f101151O.mo83116a((C40796a) aVar, z);
        } else {
            if (aVar instanceof C40773ai) {
                C40765ac.m90172a((C40773ai) aVar, Boolean.valueOf(z));
            }
        }
    }

    public AVABStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo83047a(C40762a aVar, String str) {
        boolean z;
        this.f28761k.setSingleLine(true);
        if (aVar == null) {
            throw new NullPointerException();
        } else if (aVar.type() == C40763b.Boolean) {
            this.f103829b = aVar;
            if (aVar instanceof C40790a) {
                z = C39618d.f101152P.mo83103a((C40790a) aVar);
            } else if (aVar instanceof C40796a) {
                z = C39618d.f101151O.mo83117a((C40796a) aVar);
            } else if (aVar instanceof C40773ai) {
                z = ((Boolean) C39618d.f101152P.f103907a.mo83090a((C40773ai) aVar)).booleanValue();
            } else {
                throw new RuntimeException("property must be AVAB.Property || AVSettings.Property || VESDKProperty");
            }
            setChecked(z);
            setStartText(str);
            setOnSettingItemClickListener(new C10731a() {
                public final void OnSettingItemClick(View view) {
                    AVABStateView.this.toggle();
                }
            });
        } else {
            throw new IllegalArgumentException();
        }
    }

    public AVABStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
