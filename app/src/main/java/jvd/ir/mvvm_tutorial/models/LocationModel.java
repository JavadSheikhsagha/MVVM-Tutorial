package jvd.ir.mvvm_tutorial.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class LocationModel implements Parcelable {

    @SerializedName("confirm")
    private int mConfirm;
    @SerializedName("desc")
    private String mDesc;
    @SerializedName("event")
    private int mEvent;
    @SerializedName("id")
    private int mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("lat")
    private double mLat;
    @SerializedName("likes")
    private int mLikes;
    @SerializedName("lng")
    private double mLng;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("category")
    private int mCategory;
    @SerializedName("link")
    private String mLink;
    @SerializedName("address")
    private String mAddress;
    @SerializedName("call")
    private String mCall;

    protected LocationModel(Parcel in) {
        mConfirm = in.readInt();
        mDesc = in.readString();
        mEvent = in.readInt();
        mId = in.readInt();
        mImage = in.readString();
        mLat = in.readDouble();
        mLikes = in.readInt();
        mLng = in.readDouble();
        mTitle = in.readString();
        mCategory = in.readInt();
        mLink = in.readString();
        mAddress = in.readString();
        mCall = in.readString();
    }

    public static final Creator<LocationModel> CREATOR = new Creator<LocationModel>() {
        @Override
        public LocationModel createFromParcel(Parcel in) {
            return new LocationModel(in);
        }

        @Override
        public LocationModel[] newArray(int size) {
            return new LocationModel[size];
        }
    };

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmLink() {
        return mLink;
    }

    public void setmLink(String mLink) {
        this.mLink = mLink;
    }

    public String getmCall() {
        return mCall;
    }

    public void setmCall(String mCall) {
        this.mCall = mCall;
    }

    public int getmCategory() {
        return mCategory;
    }

    public void setmCategory(int mCategory) {
        this.mCategory = mCategory;
    }

    public int getConfirm() {
        return mConfirm;
    }

    public void setConfirm(int confirm) {
        mConfirm = confirm;
    }

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public int getEvent() {
        return mEvent;
    }

    public void setEvent(int event) {
        mEvent = event;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public int getLikes() {
        return mLikes;
    }

    public void setLikes(int likes) {
        mLikes = likes;
    }

    public double getLng() {
        return mLng;
    }

    public void setLng(double lng) {
        mLng = lng;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public LocationModel(String mDesc, int mEvent, int mId, String mImage, double mLat, int mLikes, double mLng, String mTitle) {
        this.mDesc = mDesc;
        this.mEvent = mEvent;
        this.mId = mId;
        this.mImage = mImage;
        this.mLat = mLat;
        this.mLikes = mLikes;
        this.mLng = mLng;
        this.mTitle = mTitle;
    }

    public LocationModel() {
    }

    @Override
    public String toString() {
        return "LocationModel{" +
                "mConfirm=" + mConfirm +
                ", mDesc='" + mDesc + '\'' +
                ", mEvent=" + mEvent +
                ", mId=" + mId +
                ", mImage='" + mImage + '\'' +
                ", mLat=" + mLat +
                ", mLikes=" + mLikes +
                ", mLng=" + mLng +
                ", mTitle='" + mTitle + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mConfirm);
        dest.writeString(mDesc);
        dest.writeInt(mEvent);
        dest.writeInt(mId);
        dest.writeString(mImage);
        dest.writeDouble(mLat);
        dest.writeInt(mLikes);
        dest.writeDouble(mLng);
        dest.writeString(mTitle);
        dest.writeInt(mCategory);
        dest.writeString(mLink);
        dest.writeString(mAddress);
        dest.writeString(mCall);
    }
}
