package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.p683ss.android.ugc.aweme.services.config.ShortVideoConfigImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.AVABEffectInHouseView */
public class AVABEffectInHouseView extends LinearLayout {

    /* renamed from: a */
    List<RadioButton> f103813a;

    /* renamed from: b */
    private SettingItemSwitch f103814b;

    /* renamed from: c */
    private RadioGroup f103815c;

    /* renamed from: d */
    private final int f103816d;

    /* renamed from: com.ss.android.ugc.aweme.property.AVABEffectInHouseView$a */
    static final class C40749a implements C10731a {

        /* renamed from: a */
        final /* synthetic */ AVABEffectInHouseView f103817a;

        /* renamed from: b */
        final /* synthetic */ SettingItemSwitch f103818b;

        /* renamed from: c */
        final /* synthetic */ RadioGroup f103819c;

        C40749a(AVABEffectInHouseView aVABEffectInHouseView, SettingItemSwitch settingItemSwitch, RadioGroup radioGroup) {
            this.f103817a = aVABEffectInHouseView;
            this.f103818b = settingItemSwitch;
            this.f103819c = radioGroup;
        }

        public final void OnSettingItemClick(View view) {
            if (!this.f103818b.isChecked()) {
                for (RadioButton visibility : this.f103817a.f103813a) {
                    visibility.setVisibility(0);
                }
                this.f103819c.check(0);
            } else {
                this.f103817a.mo83036a();
                this.f103819c.clearCheck();
            }
            this.f103818b.toggle();
            ShortVideoConfigImpl.Companion.getInstance().setUsingOnline(!this.f103818b.isChecked());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABEffectInHouseView$b */
    static final class C40750b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C40775b f103820a;

        C40750b(C40775b bVar) {
            this.f103820a = bVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            for (C40768af a : this.f103820a.f103883a) {
                a.mo83088a(false);
            }
            if (i != -1) {
                ((C40768af) this.f103820a.f103883a.get(i)).mo83088a(true);
            }
        }
    }

    public final int getCHILD_PADDING() {
        return this.f103816d;
    }

    /* renamed from: a */
    public final void mo83036a() {
        for (RadioButton visibility : this.f103813a) {
            visibility.setVisibility(8);
        }
    }

    public final void setABDetailItem(C40775b bVar) {
        C52711k.m112240b(bVar, "abEffectInHouseItemBean");
        if (this.f103814b == null) {
            this.f103814b = new SettingItemSwitch(getContext());
            addView(this.f103814b, -1, -2);
        }
        SettingItemSwitch settingItemSwitch = this.f103814b;
        if (settingItemSwitch == null) {
            C52711k.m112234a();
        }
        if (this.f103815c == null) {
            this.f103815c = new RadioGroup(getContext());
            addView(this.f103815c);
        }
        RadioGroup radioGroup = this.f103815c;
        if (radioGroup == null) {
            C52711k.m112234a();
        }
        int size = this.f103813a.size();
        int size2 = bVar.f103883a.size();
        boolean z = true;
        if (size < size2) {
            int i = size2 - size;
            for (int i2 = 0; i2 < i; i2++) {
                RadioButton radioButton = new RadioButton(getContext());
                this.f103813a.add(radioButton);
                radioButton.setId(this.f103813a.size() - 1);
                View view = radioButton;
                C1056u.m3044b(view, this.f103816d, 0, 0, 0);
                radioGroup.addView(view, -1, -2);
            }
        }
        for (int i3 = 0; i3 < size2; i3++) {
            ((RadioButton) this.f103813a.get(i3)).setVisibility(0);
        }
        if (size > size2 && size2 <= size) {
            while (true) {
                ((RadioButton) this.f103813a.get(size2)).setVisibility(8);
                if (size2 == size) {
                    break;
                }
                size2++;
            }
        }
        settingItemSwitch.setStartText(bVar.mo83094b());
        int i4 = 0;
        for (Object next : this.f103813a) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C52575l.m112100b();
            }
            ((RadioButton) next).setText(((C40768af) bVar.f103883a.get(i4)).key());
            i4 = i5;
        }
        settingItemSwitch.setOnSettingItemClickListener(new C40749a(this, settingItemSwitch, radioGroup));
        Iterable iterable = bVar.f103883a;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C40768af) it.next()).mo83089a()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        settingItemSwitch.setChecked(z);
        if (!settingItemSwitch.isChecked()) {
            mo83036a();
        }
        int childCount = radioGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((RadioButton) this.f103813a.get(i6)).setChecked(((C40768af) bVar.f103883a.get(i6)).mo83089a());
        }
        radioGroup.setOnCheckedChangeListener(new C40750b(bVar));
    }

    public AVABEffectInHouseView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f103813a = new ArrayList();
        this.f103816d = (int) C9432q.m18687b(context, 24.0f);
        setOrientation(1);
    }

    public /* synthetic */ AVABEffectInHouseView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
