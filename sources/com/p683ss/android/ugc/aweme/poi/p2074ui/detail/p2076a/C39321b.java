package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2076a;

import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.a.b */
public class C39321b {

    /* renamed from: c */
    private static volatile C39321b f100521c;

    /* renamed from: a */
    public HashMap<String, C39320a> f100522a = new HashMap<>();

    /* renamed from: b */
    public C39320a f100523b;

    private C39321b() {
    }

    /* renamed from: b */
    public final void mo80160b() {
        if (this.f100523b != null) {
            this.f100523b.mo80153d();
        }
    }

    /* renamed from: c */
    public final void mo80161c() {
        if (this.f100523b != null) {
            this.f100523b.mo80154e();
        }
    }

    /* renamed from: a */
    public static C39321b m87415a() {
        if (f100521c == null) {
            synchronized (C39321b.class) {
                if (f100521c == null) {
                    f100521c = new C39321b();
                }
            }
        }
        return f100521c;
    }

    /* renamed from: d */
    public final void mo80162d() {
        for (C39320a g : this.f100522a.values()) {
            g.mo80156g();
        }
        this.f100522a.clear();
    }

    /* renamed from: a */
    public final void mo80159a(String str) {
        C39320a aVar = (C39320a) this.f100522a.get(str);
        if (aVar != null) {
            aVar.mo80156g();
            this.f100522a.remove(str);
        }
        if (this.f100523b != null && this.f100523b.mo80150a(str)) {
            this.f100523b = null;
        }
    }
}
