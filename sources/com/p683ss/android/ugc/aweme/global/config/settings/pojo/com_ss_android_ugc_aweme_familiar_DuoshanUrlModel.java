package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanUrlModel */
public final class com_ss_android_ugc_aweme_familiar_DuoshanUrlModel extends Message<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> ADAPTER = new ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanUrlModel();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 94968971)
    public final Long data_size;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 242904595)
    public final String file_hash;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 147287773)
    public final Integer height;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 116076)
    public final String uri;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 169852017)
    public final String url_key;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 165105301)
    public final List<String> url_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 113126854)
    public final Integer width;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanUrlModel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel, Builder> {
        public Long data_size;
        public String file_hash;
        public Integer height;
        public String uri;
        public String url_key;
        public List<String> url_list = Internal.newMutableList();
        public Integer width;

        public final com_ss_android_ugc_aweme_familiar_DuoshanUrlModel build() {
            com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel = new com_ss_android_ugc_aweme_familiar_DuoshanUrlModel(this.uri, this.url_list, this.width, this.height, this.url_key, this.data_size, this.file_hash, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_familiar_duoshanurlmodel;
        }

        public final Builder data_size(Long l) {
            this.data_size = l;
            return this;
        }

        public final Builder file_hash(String str) {
            this.file_hash = str;
            return this;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder url_key(String str) {
            this.url_key = str;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }

        public final Builder url_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_familiar_DuoshanUrlModel$ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanUrlModel */
    static final class ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanUrlModel extends DefaultValueProtoAdapter<com_ss_android_ugc_aweme_familiar_DuoshanUrlModel> {
        public final com_ss_android_ugc_aweme_familiar_DuoshanUrlModel redact(com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel) {
            return com_ss_android_ugc_aweme_familiar_duoshanurlmodel;
        }

        public ProtoAdapter_com_ss_android_ugc_aweme_familiar_DuoshanUrlModel() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_aweme_familiar_DuoshanUrlModel.class);
        }

        public final com_ss_android_ugc_aweme_familiar_DuoshanUrlModel decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_aweme_familiar_DuoshanUrlModel) null);
        }

        public final int encodedSize(com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel) {
            return ProtoAdapter.STRING.encodedSizeWithTag(116076, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.uri) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(165105301, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.url_list) + ProtoAdapter.INT32.encodedSizeWithTag(113126854, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.width) + ProtoAdapter.INT32.encodedSizeWithTag(147287773, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.height) + ProtoAdapter.STRING.encodedSizeWithTag(169852017, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.url_key) + ProtoAdapter.INT64.encodedSizeWithTag(94968971, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.data_size) + ProtoAdapter.STRING.encodedSizeWithTag(242904595, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.file_hash) + com_ss_android_ugc_aweme_familiar_duoshanurlmodel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 116076, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.uri);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 165105301, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.url_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 113126854, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.width);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 147287773, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 169852017, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.url_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 94968971, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.data_size);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 242904595, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.file_hash);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_familiar_duoshanurlmodel.unknownFields());
        }

        public final com_ss_android_ugc_aweme_familiar_DuoshanUrlModel decode(ProtoReader protoReader, com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel) throws IOException {
            Builder builder;
            com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel2 = (com_ss_android_ugc_aweme_familiar_DuoshanUrlModel) C10617a.m21405a().mo18840a(com_ss_android_ugc_aweme_familiar_DuoshanUrlModel.class, com_ss_android_ugc_aweme_familiar_duoshanurlmodel);
            if (com_ss_android_ugc_aweme_familiar_duoshanurlmodel2 != null) {
                builder = com_ss_android_ugc_aweme_familiar_duoshanurlmodel2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 116076:
                            builder.uri((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 94968971:
                            builder.data_size((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 113126854:
                            builder.width((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 147287773:
                            builder.height((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 165105301:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 169852017:
                            builder.url_key((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 242904595:
                            builder.file_hash((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_familiar_duoshanurlmodel2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.url_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getUrlList() {
        return this.url_list;
    }

    public final Long getDataSize() throws C10174a {
        if (this.data_size != null) {
            return this.data_size;
        }
        throw new C10174a();
    }

    public final String getFileHash() throws C10174a {
        if (this.file_hash != null) {
            return this.file_hash;
        }
        throw new C10174a();
    }

    public final Integer getHeight() throws C10174a {
        if (this.height != null) {
            return this.height;
        }
        throw new C10174a();
    }

    public final String getUri() throws C10174a {
        if (this.uri != null) {
            return this.uri;
        }
        throw new C10174a();
    }

    public final String getUrlKey() throws C10174a {
        if (this.url_key != null) {
            return this.url_key;
        }
        throw new C10174a();
    }

    public final Integer getWidth() throws C10174a {
        if (this.width != null) {
            return this.width;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uri = this.uri;
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.width = this.width;
        builder.height = this.height;
        builder.url_key = this.url_key;
        builder.data_size = this.data_size;
        builder.file_hash = this.file_hash;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.uri != null) {
            i = this.uri.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.url_list.hashCode()) * 37;
        if (this.width != null) {
            i2 = this.width.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (hashCode2 + i2) * 37;
        if (this.height != null) {
            i3 = this.height.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.url_key != null) {
            i4 = this.url_key.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.data_size != null) {
            i5 = this.data_size.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        if (this.file_hash != null) {
            i7 = this.file_hash.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.url_key != null) {
            sb.append(", url_key=");
            sb.append(this.url_key);
        }
        if (this.data_size != null) {
            sb.append(", data_size=");
            sb.append(this.data_size);
        }
        if (this.file_hash != null) {
            sb.append(", file_hash=");
            sb.append(this.file_hash);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_familiar_DuoshanUrlModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_aweme_familiar_DuoshanUrlModel)) {
            return false;
        }
        com_ss_android_ugc_aweme_familiar_DuoshanUrlModel com_ss_android_ugc_aweme_familiar_duoshanurlmodel = (com_ss_android_ugc_aweme_familiar_DuoshanUrlModel) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_familiar_duoshanurlmodel.unknownFields()) || !Internal.equals(this.uri, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.uri) || !this.url_list.equals(com_ss_android_ugc_aweme_familiar_duoshanurlmodel.url_list) || !Internal.equals(this.width, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.width) || !Internal.equals(this.height, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.height) || !Internal.equals(this.url_key, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.url_key) || !Internal.equals(this.data_size, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.data_size) || !Internal.equals(this.file_hash, com_ss_android_ugc_aweme_familiar_duoshanurlmodel.file_hash)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_aweme_familiar_DuoshanUrlModel(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3) {
        this(str, list, num, num2, str2, l, str3, ByteString.EMPTY);
    }

    public com_ss_android_ugc_aweme_familiar_DuoshanUrlModel(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.width = num;
        this.height = num2;
        this.url_key = str2;
        this.data_size = l;
        this.file_hash = str3;
    }
}
