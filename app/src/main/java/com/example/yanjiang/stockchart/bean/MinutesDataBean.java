package com.example.yanjiang.stockchart.bean;

import android.os.Parcel;
import android.os.Parcelable;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/**
 * Created by wutao on 2016/11/29.
 * 分时图数据实体
 */

public class MinutesDataBean extends ResponseBody implements Parcelable {
    private float price;
    private String time;
    private Integer duqutyep;
    private Integer zuojie;
    private float upp;
    private float downp;
    private float kp;
    private float sp;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getDuqutyep() {
        return duqutyep;
    }

    public void setDuqutyep(Integer duqutyep) {
        this.duqutyep = duqutyep;
    }

    public Integer getZuojie() {
        return zuojie;
    }

    public void setZuojie(Integer zuojie) {
        this.zuojie = zuojie;
    }

    public float getUpp() {
        return upp;
    }

    public void setUpp(float upp) {
        this.upp = upp;
    }

    public float getDownp() {
        return downp;
    }

    public void setDownp(float downp) {
        this.downp = downp;
    }

    public float getKp() {
        return kp;
    }

    public void setKp(float kp) {
        this.kp = kp;
    }

    public float getSp() {
        return sp;
    }

    public void setSp(float sp) {
        this.sp = sp;
    }


    @Override
    public MediaType contentType() {
        return null;
    }

    @Override
    public long contentLength() {
        return 0;
    }

    @Override
    public BufferedSource source() {
        return null;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.price);
        dest.writeString(this.time);
        dest.writeValue(this.duqutyep);
        dest.writeValue(this.zuojie);
        dest.writeSerializable(this.upp);
        dest.writeSerializable(this.downp);
        dest.writeSerializable(this.kp);
        dest.writeSerializable(this.sp);
    }

    public MinutesDataBean() {
    }

    protected MinutesDataBean(Parcel in) {
        this.price = (float) in.readSerializable();
        this.time = in.readString();
        this.duqutyep = (Integer) in.readValue(Integer.class.getClassLoader());
        this.zuojie = (Integer) in.readValue(Integer.class.getClassLoader());
        this.upp = (float) in.readSerializable();
        this.downp = (float) in.readSerializable();
        this.kp = (float) in.readSerializable();
        this.sp = (float) in.readSerializable();
    }

    public static final Creator<MinutesDataBean> CREATOR = new Creator<MinutesDataBean>() {
        @Override
        public MinutesDataBean createFromParcel(Parcel source) {
            return new MinutesDataBean(source);
        }

        @Override
        public MinutesDataBean[] newArray(int size) {
            return new MinutesDataBean[size];
        }
    };
}
