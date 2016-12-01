package com.example.yanjiang.stockchart.api;

import com.example.yanjiang.stockchart.bean.MinutesDataBean;

import java.util.List;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by yanjiang on 2016/3/15.
 * 示例1
 *
 * @GET("Advertisement") Observable<List<TransMainDao>> getWeatherData(@Query("instID") String id);
 * <p/>
 * 示例2
 * @GET("FundPaperTrade/AppUserLogin") Observable<TransDao> getTransData(@QueryMap Map<String,String> map);
 * <p/>
 * 示例3
 * @FormUrlEncoded
 * @POST("/newfind/index_ask") Observable<Response> getDaJia(@Field("page") int page,
 * @Field("pageSize") int size,
 * @Field("tokenMark") long tokenMark,
 * @Field("token") String token
 * );
 * <p/>
 * 示例4
 * @FormUrlEncoded
 * @POST("FundPaperTrade/AppUserLogin") Observable<Response> getTransData(@FieldMap Map<String,String> map);
 */

public interface ClientApi {


    /*分时图url*/
    @POST(Constant.DETAILURL)
    Observable<List<MinutesDataBean>> getMinutes(@Query("type") String type, @Query("time") String time);

}
