package com.p683ss.android.ugc.aweme.services.photo;

import android.content.Context;
import com.p683ss.android.ugc.aweme.photo.C38706r;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;

/* renamed from: com.ss.android.ugc.aweme.services.photo.IPhotoService */
public interface IPhotoService {
    PhotoContext compress(String str, C38706r rVar);

    PhotoContext compress(String str, C38706r rVar, int i, int i2);

    int[] getImageWidthHeight(String str);

    void toPhotoEditActivity(Context context, PhotoContext photoContext);
}
