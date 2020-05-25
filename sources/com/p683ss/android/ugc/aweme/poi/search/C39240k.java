package com.p683ss.android.ugc.aweme.poi.search;

import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.search.k */
public final class C39240k extends C26840g<PoiStruct> implements C39238i {

    /* renamed from: a */
    public boolean f100197a;

    /* renamed from: b */
    public int f100198b;

    /* renamed from: c */
    private String f100199c;

    /* renamed from: d */
    private PoiStruct f100200d;

    /* renamed from: e */
    private int f100201e;

    /* renamed from: a */
    public final void mo79984a(PoiStruct poiStruct) {
        this.f100200d = poiStruct;
    }

    /* renamed from: a */
    public final void mo79985a(String str) {
        this.f100199c = str;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (!this.f100197a && i == this.f100201e && this.f100200d != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        this.f70682s = C0726c.m2098c(viewGroup.getContext(), R.color.a1a);
        return super.mo49730a_(viewGroup);
    }

    /* renamed from: a */
    public final void mo50303a(List<PoiStruct> list) {
        if (this.f100200d != null && (C9376b.m18558a((Collection<T>) list) || !this.f100200d.poiId.equals(((PoiStruct) list.get(0)).poiId))) {
            list.add(this.f100201e, this.f100200d);
        }
        super.mo50303a(list);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C39247q(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bnk, viewGroup, false), this.f100197a, this.f100198b);
        }
        return new C39245o(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bnl, viewGroup, false), this.f100197a);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (mo48641a(i) == 0) {
            C39247q qVar = (C39247q) vVar;
            PoiStruct poiStruct = (PoiStruct) this.f70670n.get(i);
            String str = this.f100199c;
            if (poiStruct != null) {
                qVar.f100243g = poiStruct;
                qVar.f100244h = str;
                qVar.f100245i = i;
                if (i != 0) {
                    qVar.f100242f.setVisibility(8);
                } else if (C9431p.m18664a(str) || qVar.mo80002a()) {
                    qVar.f100242f.setVisibility(0);
                } else {
                    qVar.f100242f.setVisibility(8);
                }
                if (qVar.mo80002a()) {
                    qVar.f100242f.setText(qVar.f100237a.getResources().getString(R.string.h2q));
                } else {
                    qVar.f100242f.setText(qVar.f100237a.getResources().getString(R.string.ci0));
                }
                if (qVar.f100246j) {
                    qVar.f100242f.setVisibility(8);
                }
                if (qVar.f100243g.getHasGuessExpect() == 1) {
                    qVar.f100241e.setVisibility(0);
                } else {
                    qVar.f100241e.setVisibility(8);
                }
                if (C9431p.m18664a(str) || C9431p.m18664a(qVar.f100243g.poiName) || !qVar.f100243g.poiName.toLowerCase().contains(str.toLowerCase())) {
                    qVar.f100238b.setText(qVar.f100243g.poiName);
                } else {
                    TextView textView = qVar.f100238b;
                    String str2 = qVar.f100243g.poiName;
                    int indexOf = str2.toLowerCase().indexOf(str.toLowerCase());
                    SpannableString spannableString = new SpannableString(str2);
                    spannableString.setSpan(new ForegroundColorSpan(C11010c.m22280a().getResources().getColor(R.color.a36)), indexOf, str.length() + indexOf, 0);
                    textView.setText(spannableString);
                }
                if (qVar.f100243g.address == null || TextUtils.isEmpty(qVar.f100243g.address.getSimpleAddr())) {
                    qVar.f100239c.setVisibility(8);
                } else {
                    qVar.f100239c.setText(qVar.f100243g.address.getSimpleAddr());
                    qVar.f100239c.setVisibility(0);
                }
                if (TextUtils.isEmpty(qVar.f100243g.distance)) {
                    qVar.f100240d.setVisibility(8);
                } else {
                    qVar.f100240d.setVisibility(0);
                    qVar.f100240d.setText(qVar.f100243g.distance);
                }
            }
            return;
        }
        C39245o oVar = (C39245o) vVar;
        PoiStruct poiStruct2 = (PoiStruct) this.f70670n.get(i);
        String str3 = this.f100199c;
        if (poiStruct2 != null) {
            oVar.f100234i = i;
            oVar.f100232g = poiStruct2;
            oVar.f100233h = str3;
            oVar.f100227b.setText(poiStruct2.getPoiName());
            if (poiStruct2.getHasGuessExpect() == 1) {
                oVar.f100228c.setVisibility(0);
            } else {
                oVar.f100228c.setVisibility(8);
            }
            if (i != 0 || !C9431p.m18664a(str3)) {
                oVar.f100231f.setVisibility(8);
            } else {
                oVar.f100231f.setVisibility(0);
            }
            if (oVar.f100235j) {
                oVar.f100231f.setVisibility(8);
            }
            oVar.f100226a.setVisibility(8);
            oVar.f100229d.setVisibility(8);
            oVar.f100230e.setVisibility(0);
        }
    }
}
