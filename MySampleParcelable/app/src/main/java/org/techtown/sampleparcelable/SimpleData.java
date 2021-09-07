package org.techtown.sampleparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable{

    int number;
    String message;

    public SimpleData(int num, String msg){
        number = num;
        message = msg;
    }
    //SimpleData 객체의 생성자를 보면 Parcel 객체를 파라미터로 받는경우가 있다, 이 경우는 readInt(), 와 readString()메서드를 이용해 데이터를 읽음
    public SimpleData(Parcel src){
        number = src.readInt();
        message = src.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public SimpleData createFromParcel(Parcel in){
            return new SimpleData(in);
        }
        public SimpleData[] newArray(int size){
            return new SimpleData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) { //SimpleData 클래스안에 데이터를 Parcel 객체로 만드는 함수
        dest.writeInt(number);
        dest.writeString(message);
    }
}
