package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Parcelable;
import android.support.p030v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C1524a;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(C1524a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2738a = aVar.mo5888b(iconCompat.f2738a, 1);
        iconCompat.f2740c = aVar.mo5894b(iconCompat.f2740c, 2);
        iconCompat.f2741d = aVar.mo5889b(iconCompat.f2741d, 3);
        iconCompat.f2742e = aVar.mo5888b(iconCompat.f2742e, 4);
        iconCompat.f2743f = aVar.mo5888b(iconCompat.f2743f, 5);
        iconCompat.f2744g = (ColorStateList) aVar.mo5889b(iconCompat.f2744g, 6);
        iconCompat.f2746j = aVar.mo5892b(iconCompat.f2746j, 7);
        iconCompat.f2745i = Mode.valueOf(iconCompat.f2746j);
        int i = iconCompat.f2738a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    if (iconCompat.f2741d == null) {
                        iconCompat.f2739b = iconCompat.f2740c;
                        iconCompat.f2738a = 3;
                        iconCompat.f2742e = 0;
                        iconCompat.f2743f = iconCompat.f2740c.length;
                        break;
                    } else {
                        iconCompat.f2739b = iconCompat.f2741d;
                        break;
                    }
                case 2:
                case 4:
                    iconCompat.f2739b = new String(iconCompat.f2740c, Charset.forName("UTF-16"));
                    break;
                case 3:
                    iconCompat.f2739b = iconCompat.f2740c;
                    break;
            }
        } else if (iconCompat.f2741d != null) {
            iconCompat.f2739b = iconCompat.f2741d;
        } else {
            throw new IllegalArgumentException("Invalid icon");
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1524a aVar) {
        iconCompat.f2746j = iconCompat.f2745i.name();
        int i = iconCompat.f2738a;
        if (i != -1) {
            switch (i) {
                case 1:
                case 5:
                    iconCompat.f2741d = (Parcelable) iconCompat.f2739b;
                    break;
                case 2:
                    iconCompat.f2740c = ((String) iconCompat.f2739b).getBytes(Charset.forName("UTF-16"));
                    break;
                case 3:
                    iconCompat.f2740c = (byte[]) iconCompat.f2739b;
                    break;
                case 4:
                    iconCompat.f2740c = iconCompat.f2739b.toString().getBytes(Charset.forName("UTF-16"));
                    break;
            }
        } else {
            iconCompat.f2741d = (Parcelable) iconCompat.f2739b;
        }
        aVar.mo5879a(iconCompat.f2738a, 1);
        aVar.mo5887a(iconCompat.f2740c, 2);
        aVar.mo5881a(iconCompat.f2741d, 3);
        aVar.mo5879a(iconCompat.f2742e, 4);
        aVar.mo5879a(iconCompat.f2743f, 5);
        aVar.mo5881a((Parcelable) iconCompat.f2744g, 6);
        aVar.mo5885a(iconCompat.f2746j, 7);
    }
}
