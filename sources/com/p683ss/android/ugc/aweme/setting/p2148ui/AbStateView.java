package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.app.C1160b.C1161a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase.C10731a;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41577i;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41595a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AbStateView */
public class AbStateView extends FrameLayout {

    /* renamed from: a */
    public C41577i f105582a;

    /* renamed from: b */
    private SettingItem f105583b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85560a() {
        try {
            String a = this.f105582a.mo85355a();
            SettingItem settingItem = this.f105583b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f105582a.mo85356b());
            sb.append(":  ");
            sb.append(a);
            settingItem.setStartText(sb.toString());
        } catch (IllegalAccessException unused) {
        }
    }

    public AbStateView(Context context) {
        this(context, null);
    }

    public AbStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo85561a(Field field, Object obj) {
        this.f105582a = new C41577i(field, obj);
        mo85560a();
        this.f105583b.setOnSettingItemClickListener(new C10731a() {
            public final void OnSettingItemClick(View view) {
                C41577i iVar = AbStateView.this.f105582a;
                String[] c = iVar.f105300b.mo85359c();
                if (c.length == 0) {
                    c = new String[iVar.f105300b.mo85358b().length];
                    for (int i = 0; i < iVar.f105300b.mo85358b().length; i++) {
                        c[i] = String.valueOf(iVar.f105300b.mo85358b()[i]);
                    }
                }
                AbStateView abStateView = AbStateView.this;
                C417181 r1 = new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C41577i iVar = AbStateView.this.f105582a;
                        try {
                            iVar.f105299a.set(iVar.f105301c, Integer.valueOf(iVar.f105300b.mo85358b()[i]));
                        } catch (IllegalAccessException unused) {
                        }
                        AbStateView.this.mo85560a();
                        C47718bf.m103288a(new C41595a());
                    }
                };
                C1161a aVar = new C1161a(abStateView.getContext());
                aVar.mo3767a((CharSequence[]) c, (OnClickListener) r1);
                aVar.mo3775c();
            }
        });
    }

    public AbStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a1d, this, true);
        this.f105583b = (SettingItem) findViewById(R.id.av8);
    }
}
