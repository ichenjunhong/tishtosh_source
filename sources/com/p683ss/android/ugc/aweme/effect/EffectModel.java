package com.p683ss.android.ugc.aweme.effect;

import com.google.p1057b.p1058a.C17417i;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectModel */
public class EffectModel implements Serializable {
    public String category;
    public int color;
    public int duration;
    public String extra;
    public String hint;
    public String iconUrl;
    public int imagePath;
    public boolean isEnabled = true;
    public String key;
    public String name;
    public String resDir;
    public int type;

    public int hashCode() {
        return C17417i.m42645a(this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), this.category, this.extra, Boolean.valueOf(this.isEnabled));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EffectModel effectModel = (EffectModel) obj;
        if (this.imagePath != effectModel.imagePath || this.type != effectModel.type || this.color != effectModel.color || this.duration != effectModel.duration || this.isEnabled != effectModel.isEnabled || !C17417i.m42646a(this.name, effectModel.name) || !C17417i.m42646a(this.hint, effectModel.hint) || !C17417i.m42646a(this.key, effectModel.key) || !C17417i.m42646a(this.iconUrl, effectModel.iconUrl) || !C17417i.m42646a(this.resDir, effectModel.resDir) || !C17417i.m42646a(this.category, effectModel.category) || !C17417i.m42646a(this.extra, effectModel.extra)) {
            return false;
        }
        return true;
    }
}
