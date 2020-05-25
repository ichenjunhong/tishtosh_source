package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKList.C52402a;
import com.p2620vk.sdk.p2621a.C52324b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKAttachments */
public class VKAttachments extends VKList<VKApiAttachment> implements Parcelable {
    public static Creator<VKAttachments> CREATOR = new Creator<VKAttachments>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKAttachments[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKAttachments(parcel);
        }
    };

    /* renamed from: b */
    private final C52402a<VKApiAttachment> f130737b = new C52402a<VKApiAttachment>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo109344a(JSONObject jSONObject) throws Exception {
            String optString = jSONObject.optString("type");
            if ("photo".equals(optString)) {
                return new VKApiPhoto().mo109175b(jSONObject.getJSONObject("photo"));
            }
            if ("video".equals(optString)) {
                return new VKApiVideo().mo109175b(jSONObject.getJSONObject("video"));
            }
            if ("audio".equals(optString)) {
                return new VKApiAudio().mo109175b(jSONObject.getJSONObject("audio"));
            }
            if ("doc".equals(optString)) {
                return new VKApiDocument().mo109175b(jSONObject.getJSONObject("doc"));
            }
            if ("wall".equals(optString)) {
                return new VKApiPost().mo109175b(jSONObject.getJSONObject("wall"));
            }
            if ("posted_photo".equals(optString)) {
                return new VKApiPostedPhoto().mo109175b(jSONObject.getJSONObject("posted_photo"));
            }
            if ("link".equals(optString)) {
                return new VKApiLink().mo109175b(jSONObject.getJSONObject("link"));
            }
            if ("note".equals(optString)) {
                return new VKApiNote().mo109175b(jSONObject.getJSONObject("note"));
            }
            if ("app".equals(optString)) {
                return new VKApiApplicationContent().mo109175b(jSONObject.getJSONObject("app"));
            }
            if ("poll".equals(optString)) {
                return new VKApiPoll().mo109175b(jSONObject.getJSONObject("poll"));
            }
            if ("page".equals(optString)) {
                return new VKApiWikiPage().mo109175b(jSONObject.getJSONObject("page"));
            }
            if ("album".equals(optString)) {
                return new VKApiPhotoAlbum().mo109175b(jSONObject.getJSONObject("album"));
            }
            return null;
        }
    };

    /* renamed from: com.vk.sdk.api.model.VKAttachments$VKApiAttachment */
    public static abstract class VKApiAttachment extends VKApiModel implements C52413a {
        /* renamed from: a */
        public abstract CharSequence mo109174a();

        /* renamed from: b */
        public abstract String mo109176b();
    }

    public int describeContents() {
        return 0;
    }

    public VKAttachments() {
    }

    /* renamed from: a */
    public final String mo109340a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(((VKApiAttachment) it.next()).mo109174a());
        }
        return C52324b.m111789a((Collection<?>) arrayList, ",");
    }

    /* renamed from: a */
    public final void mo109341a(JSONArray jSONArray) {
        super.mo109351a(jSONArray, this.f130737b);
    }

    public VKAttachments(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if ("photo".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPhoto.class.getClassLoader()));
            } else if ("video".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiVideo.class.getClassLoader()));
            } else if ("audio".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiAudio.class.getClassLoader()));
            } else if ("doc".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiDocument.class.getClassLoader()));
            } else if ("wall".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPost.class.getClassLoader()));
            } else if ("posted_photo".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPostedPhoto.class.getClassLoader()));
            } else if ("link".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiLink.class.getClassLoader()));
            } else if ("note".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiNote.class.getClassLoader()));
            } else if ("app".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiApplicationContent.class.getClassLoader()));
            } else if ("poll".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPoll.class.getClassLoader()));
            } else if ("page".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiWikiPage.class.getClassLoader()));
            } else if ("album".equals(readString)) {
                add((VKApiAttachment) parcel.readParcelable(VKApiPhotoAlbum.class.getClassLoader()));
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            VKApiAttachment vKApiAttachment = (VKApiAttachment) it.next();
            parcel.writeString(vKApiAttachment.mo109176b());
            parcel.writeParcelable(vKApiAttachment, 0);
        }
    }
}
