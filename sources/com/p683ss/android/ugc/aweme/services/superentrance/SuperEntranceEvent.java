package com.p683ss.android.ugc.aweme.services.superentrance;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent */
public final class SuperEntranceEvent {
    public static final Companion Companion = new Companion(null);
    private String iconUrl;
    private boolean show;
    private String tipText;
    private int type;

    /* renamed from: com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final String getTipText() {
        return this.tipText;
    }

    public final int getType() {
        return this.type;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setTipText(String str) {
        this.tipText = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public SuperEntranceEvent(int i, boolean z) {
        this.type = i;
        this.show = z;
    }
}
