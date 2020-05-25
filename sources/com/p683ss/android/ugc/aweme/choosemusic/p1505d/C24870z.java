package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.z */
public final class C24870z implements Serializable {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    private String f65811a;
    @C17952c(mo34828a = "pos")

    /* renamed from: b */
    private List<? extends Position> f65812b;
    @C17952c(mo34828a = "word_record")

    /* renamed from: c */
    private C24845aa f65813c;

    /* renamed from: d */
    private Map<String, String> f65814d;

    /* renamed from: e */
    private boolean f65815e;

    public final String getContent() {
        return this.f65811a;
    }

    public final Map<String, String> getExtraParam() {
        return this.f65814d;
    }

    public final List<Position> getPosition() {
        return this.f65812b;
    }

    public final C24845aa getWordRecord() {
        return this.f65813c;
    }

    public final boolean isMobShow() {
        return this.f65815e;
    }

    public final void setContent(String str) {
        this.f65811a = str;
    }

    public final void setExtraParam(Map<String, String> map) {
        this.f65814d = map;
    }

    public final void setMobShow(boolean z) {
        this.f65815e = z;
    }

    public final void setPosition(List<? extends Position> list) {
        this.f65812b = list;
    }

    public final void setWordRecord(C24845aa aaVar) {
        this.f65813c = aaVar;
    }
}
