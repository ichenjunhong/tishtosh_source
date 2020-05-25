package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bbt;
import java.io.IOException;

public class bbt<M extends bbt<M>> extends bby {

    /* renamed from: a */
    protected bbv f41783a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo30025a() {
        if (this.f41783a != null) {
            for (int i = 0; i < this.f41783a.f41786a; i++) {
                this.f41783a.mo30031a(i).mo30035a();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo30026a(bbr bbr) throws IOException {
        if (this.f41783a != null) {
            for (int i = 0; i < this.f41783a.f41786a; i++) {
                this.f41783a.mo30031a(i).mo30036a(bbr);
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ bby mo30027b() throws CloneNotSupportedException {
        return (bbt) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        bbt bbt = (bbt) super.clone();
        bbx.m35339a(this, bbt);
        return bbt;
    }
}
